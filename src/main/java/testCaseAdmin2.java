import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class testCaseAdmin2 {
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
    public void testTestCaseAdmin2() throws Exception {
        driver.get("http://159.65.29.212//login");
        driver.findElement(By.id("email")).clear();
        driver.findElement(By.id("email")).sendKeys("administrador@mail.com");
        driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("password")).sendKeys("admin_tp18_a");
        driver.findElement(By.cssSelector("button.btn.btn-primary")).click();
        // Warning: verifyTextPresent may require manual changes
        try {
            assertTrue(driver.findElement(By.cssSelector("BODY")).getText().contains("Funcionalidades"));
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        driver.findElement(By.linkText("Mensagens")).click();
        driver.findElement(By.cssSelector("button.btn.btn-success")).click();
        driver.findElement(By.cssSelector("input.form-control")).sendKeys("Professor");
        driver.findElement(By.cssSelector("button.btn.btn-outline-secondary")).click();
        driver.findElement(By.cssSelector("button.btn.btn-primary")).click();
        driver.switchTo().frame(driver.findElement(By.id("message-editor_ifr")));
        //driver.findElement(By.cssSelector("tinymce.mce-content-body p")).click();
        driver.findElement(By.cssSelector("#tinymce")).sendKeys("Olá");
        Thread.sleep(3000);
        driver.switchTo().defaultContent();
        driver.findElement(By.id("btn-send")).click();
       Thread.sleep(3000);
        //Warning: verifyTextPresent may require manual changes
        try {
            assertTrue("Dado que iniciei conta como Administrador e na funcionalidade das mensagens quando clico na pessoa para qual quero enviar uma mensagem e escrevo essa mensagem, verifico que a mensagem foi entregue.",driver.findElement(By.cssSelector("#messages-wrapper li:last-child")).getText().contains("Olá"));
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
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
