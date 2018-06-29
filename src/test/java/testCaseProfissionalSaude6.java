import org.apache.commons.io.filefilter.FalseFileFilter;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

import static org.junit.Assert.*;

public class testCaseProfissionalSaude6 extends junit.framework.TestCase{
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
    public void testTestCaseProfissionalSaude6() throws Exception {
        driver.get("http://159.65.29.212/login");
        driver.findElement(By.id("email")).clear();
        driver.findElement(By.id("email")).sendKeys("profissionaldesaude@mail.com");
        driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("password")).sendKeys("password_tp18_p");
        driver.findElement(By.cssSelector("button.btn.btn-primary")).click();
        int rowCount=driver.findElements(By.cssSelector("table.table tr")).size();

        //boolean botaoAtivo=assertTrue(driver.findElement(By.cssSelector("btn btn-primary mb-2")).isEnabled());
        if (rowCount ==1){
            try {

                assertFalse("Se não existem adolescentes para exportar então o botão 'Exportar Adolescentes' deveria estar oculto",driver.findElement(By.cssSelector("BODY")).getText().contains("Exportar Adolescentes"));


                //assertEquals("Se não existem adolescentes na lista então o botão exportar deveria estar inativo ou oculto",false,driver.findElement(By.cssSelector("button.btn.btn-primary.mb-2")).isEnabled());

                //assertEquals("Se não existem adolescentes na lista então o botão exportar deveria estar inativo ou oculto",false,driver.findElement(By.cssSelector("btn btn-primary mb-2 mr-2 float-right")).isEnabled());

                //assertFalse("Se não existem adolescentes na lista então o botão exportar deveria estar inativo ou oculto",driver.findElement(By.cssSelector("button.btn.btn-primary.mb-2")).isEnabled());




            } catch (Error e) {
                verificationErrors.append(e.toString());
            }
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

