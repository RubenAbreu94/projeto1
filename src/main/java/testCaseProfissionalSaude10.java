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

public class testCaseProfissionalSaude10 extends junit.framework.TestCase{
    private WebDriver driver;
    private String baseUrl;
    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();
    private String ficherioImportar = System.getProperty("user.dir") + "\\Uploads\\Adolescentes_Profissional de Saude_2018_4_19.xlsx";

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
    public void testTestCaseProfissionalSaude10() throws Exception {
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
            assertTrue("Dado que iniciei conta como prof. de saude deveria-me ser apresentada a lista de adolescentes",driver.findElement(By.cssSelector("BODY")).getText().contains("Lista de Adolescentes"));
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        // ERROR: Caught exception [ERROR: Unsupported command [selectWindow | null | ]]
        driver.findElement(By.cssSelector("button.btn.btn-secondary")).click();
        //driver.findElement(By.name("file")).click();

        WebElement uploadElement = driver.findElement(By.name("file"));

        // enter the file path onto the file-selection input field
        uploadElement.sendKeys(ficherioImportar);
        driver.findElement(By.cssSelector("button.btn.btn-primary")).click();


        //assertEquals("Whoops, looks like something went wrong.", driver.findElement(By.cssSelector("div.title")).getText());


        try {


            assertTrue("Se importar um ficheiro com um formato errado deveria ser apresentado uma mensagem de erro",driver.findElement(By.cssSelector("BODY")).getText().contains("O ficheiro selecionado não tem a estrutura correta. Por favor contacte o Administrador para que este lhe forneça o template."));
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }


/*
        driver.findElement(By.id("navbarDropdownMenuLink")).click();
        driver.findElement(By.id("navbarDropdownMenuLink")).click();
        driver.findElement(By.linkText("Logout")).click();
        driver.findElement(By.linkText("Logout")).click();
        */
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
