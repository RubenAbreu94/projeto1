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

public class testCaseProfissionalSaude30 {
    private WebDriver driver;
    private String baseUrl;
    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();

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
    public void testTestCaseProfissionalSaude30() throws Exception {
        driver.get(baseUrl + "/");
        driver.findElement(By.linkText("Login")).click();
        driver.findElement(By.id("email")).clear();
        driver.findElement(By.id("email")).sendKeys("testeautoPerfis@mail.com");
        driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("password")).sendKeys("123perfis");
        driver.findElement(By.cssSelector("button.btn.btn-primary")).click();
        driver.findElement(By.id("navbarDropdownMenuLink")).click();


        driver.findElement(By.linkText("Perfil")).click();

        driver.findElement(By.xpath("(//button[@type='button'])[4]")).click();

        driver.findElement(By.id("inputName")).clear();
        driver.findElement(By.id("inputName")).sendKeys("TesteAutPerfis");

        driver.findElement(By.name("username")).clear();
        driver.findElement(By.name("username")).sendKeys("testeAutPerfis");

        new Select(driver.findElement(By.name("ocupation"))).selectByVisibleText("Enfermeiro(a)");

        driver.findElement(By.xpath("//button[@type='submit']")).click();



        try {
            assertTrue(driver.findElement(By.cssSelector("BODY")).getText().contains("TesteAutPerfis"));
            assertTrue(driver.findElement(By.cssSelector("BODY")).getText().contains("testeAutPerfis"));
            assertTrue(driver.findElement(By.cssSelector("BODY")).getText().contains("Enfermeiro"));
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }



        driver.findElement(By.xpath("(//button[@type='button'])[4]")).click();

        driver.findElement(By.id("inputName")).clear();
        driver.findElement(By.id("inputName")).sendKeys("TesteAutPerfis0");

        driver.findElement(By.name("username")).clear();
        driver.findElement(By.name("username")).sendKeys("testeAutPerfis0");

        new Select(driver.findElement(By.name("ocupation"))).selectByVisibleText("Médico(a)");
        driver.findElement(By.xpath("//button[@type='submit']")).click();

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
