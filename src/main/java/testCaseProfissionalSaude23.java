import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class testCaseProfissionalSaude23 {
    private WebDriver driver;
    private String baseUrl;
    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();
    private String ficherioImportar = System.getProperty("user.dir") + "\\Uploads\\Admin_HealthPro_correto.csv";

    @Before
    public void setUp() throws Exception {
        Logger.getLogger("").setLevel(Level.OFF);
        System.setProperty("webdriver.gecko.driver",
                "drivers\\geckodriver.exe");
        System.setProperty("webdriver.edge.driver",
                "drivers\\MicrosoftWebDriver.exe");
        System.setProperty("webdriver.chrome.driver",
                "drivers\\chromedriver.exe");
        System.setProperty("phantomjs.binary.path",
                "drivers\\phantomjs.exe");
        driver = new ChromeDriver();
        baseUrl = "http://159.65.29.212/login";
        driver.manage().window().setSize(new Dimension(1024,768));
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @Test
    public void testTestCaseProfissionalSaude23() throws Exception {
        driver.get("http://159.65.29.212/");
        driver.findElement(By.linkText("TeenPower")).click();
        // driver.findElement(By.cssSelector("button.navbar-toggler")).click();
        //driver.findElement(By.cssSelector("button.navbar-toggler")).click();
        driver.findElement(By.linkText("Login")).click();
        driver.findElement(By.id("email")).clear();
        driver.findElement(By.id("email")).sendKeys("profissionaldesaude@mail.com");
        driver.findElement(By.id("password")).sendKeys("password_tp18_p");
        driver.findElement(By.cssSelector("button.btn.btn-primary")).click();
        // Warning: verifyTextPresent may require manual changes
        try {
            assertTrue("Apos efetuar login com prof. saude deveria ser apresentada a pag. de lista de adolescentes",driver.findElement(By.cssSelector("BODY")).getText().contains("Lista de Adolescentes"));
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        // ERROR: Caught exception [ERROR: Unsupported command [selectWindow | null | ]]
        driver.findElement(By.cssSelector("button.btn.btn-secondary")).click();
        //driver.findElement(By.name("file")).click();

        WebElement uploadElement = driver.findElement(By.name("file"));
        uploadElement.sendKeys(ficherioImportar);
        driver.findElement(By.cssSelector("button.btn.btn-primary")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("selectAll")).click();
        driver.findElement(By.cssSelector("button.btn.btn-primary")).click();

        Thread.sleep(1000);


        try {
            assertTrue("Ao tentar importar um utilizador com um email ja existente na lista de adolescente deve-me ser apresentado uma mensagem de erro a avisar disso mesmo",driver.findElement(By.cssSelector("BODY")).getText().contains("Erros:  Já existe um utilizador registado com o mesmo e-mail"));
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }

        driver.findElement(By.cssSelector("button.btn.btn-secondary")).click();

    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
        String verificationErrorString = verificationErrors.toString();
        if (!"".equals(verificationErrorString)) {
            fail(verificationErrorString);
        }
    }

    private boolean isElementPresent(By by) {
        try {
            driver.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    private boolean isAlertPresent() {
        try {
            driver.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }

    private String closeAlertAndGetItsText() {
        try {
            Alert alert = driver.switchTo().alert();
            String alertText = alert.getText();
            if (acceptNextAlert) {
                alert.accept();
            } else {
                alert.dismiss();
            }
            return alertText;
        } finally {
            acceptNextAlert = true;
        }
    }
}



