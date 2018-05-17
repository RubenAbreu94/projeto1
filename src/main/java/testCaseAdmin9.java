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

public class testCaseAdmin9 {
    private WebDriver driver;
    private String baseUrl;
    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();
    private String ficherioImportar = System.getProperty("user.dir") + "\\Uploads\\Admin_Role_5_Instituicoes.csv";

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
    public void testTestCaseAdmin9() throws Exception {
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

        driver.findElement(By.xpath(" //button[@type='button'])[9]")).click();

        driver.findElement(By.cssSelector("button.btn.btn-secondary")).click();
        //driver.findElement(By.name("file")).click();
        WebElement uploadElement = driver.findElement(By.name("file"));
        uploadElement.sendKeys(ficherioImportar);
        driver.findElement(By.cssSelector("button.btn.btn-primary")).click();

        driver.findElement(By.id("selectAll")).click();
        driver.findElement(By.cssSelector("button.btn.btn-primary")).click();

        Thread.sleep(1000);

        // Warning: verifyTextPresent may require manual changes
        try {
            assertTrue("Após importar com sucesso deveria ser mostrada uma mensagem",driver.findElement(By.cssSelector("BODY")).getText().contains("Sucesso! Foram enviados 9 emails de confirmação."));
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        driver.findElement(By.linkText("Gestão de Utilizadores")).click();
        // Warning: verifyTextPresent may require manual changes
        try {
            assertTrue("Não se verificou que um dos utilizadores importados esteja presente na lista de utilizadores",driver.findElement(By.cssSelector("BODY")).getText().contains("jsilva@mail.com"));
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        // Warning: verifyTextPresent may require manual changes
        try {
            assertTrue(driver.findElement(By.cssSelector("BODY")).getText().contains("IST PT LEI"));
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }

        driver.findElement(By.linkText("Administrator")).click();
        driver.findElement(By.linkText("Logout")).click();
        // Warning: verifyTextPresent may require manual changes
        try {
            assertTrue(driver.findElement(By.cssSelector("BODY")).getText().contains("Página Inicial"));
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        driver.get("http://159.65.29.212//login");
        driver.findElement(By.id("email")).clear();
        driver.findElement(By.id("email")).sendKeys("professor@mail.com");
        driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("password")).sendKeys("password_tp18_t");
        driver.findElement(By.cssSelector("button.btn.btn-primary")).click();
        // Warning: verifyTextPresent may require manual changes
        try {
            assertTrue(driver.findElement(By.cssSelector("BODY")).getText().contains("Lista de Adolescentes"));
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        // Warning: verifyTextPresent may require manual changes
        try {
            assertTrue(driver.findElement(By.cssSelector("BODY")).getText().contains("jsilva@mail.com"));
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        // Warning: verifyTextPresent may require manual changes
        try {
            assertTrue(driver.findElement(By.cssSelector("BODY")).getText().contains("IST PT LEI"));
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

