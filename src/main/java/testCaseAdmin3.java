import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class testCaseAdmin3 {
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
    public void testTestCaseAdmin3() throws Exception {
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


        driver.findElement(By.xpath("(//button[@type='button'])[3]")).click();
        driver.findElement(By.id("inputName")).clear();
        driver.findElement(By.id("inputName")).sendKeys("João Abreu");
        driver.findElement(By.id("inputEmail")).clear();
        driver.findElement(By.id("inputEmail")).sendKeys("joaoabreu@mail.com");
        driver.findElement(By.id("inputInstitution")).clear();
        driver.findElement(By.id("inputInstitution")).sendKeys("ESTG");
        driver.findElement(By.xpath("//form[@id='form-add-teen']/div[8]/div/div[2]/label")).click();
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        // Warning: verifyTextPresent may require manual changes
        try {
            assertTrue("Dado que iniciei conta como Administrador quando clico no botão 'Criar Novo Utilizador' e crio um utilizador então é suposto receber uma mensagem em como o utilizador foi criado com sucesso.)",driver.findElement(By.cssSelector("BODY")).getText().contains("Sucesso"));
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }


    }

    @After
    public void tearDown() throws Exception {

        driver.findElement(By.linkText("Gestão de Utilizadores")).click();
        WebElement table = driver.findElement(By.xpath("//table[@class='table']"));

        List<WebElement> linhas = table.findElements(By.tagName("tr"));
        WebElement linhaPretendida = null;
        for (int i = 0; i<linhas.size();i++) {
            if(linhas.get(i).getText().contains("joaoabreu@mail.com")) {
                linhaPretendida = linhas.get(i);
                break;
            }
        }

        linhaPretendida.findElement(By.cssSelector("tr:last-child #delete-button")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("button.btn.btn-danger")).click();

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