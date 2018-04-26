import java.util.ArrayList;
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

public class testCaseProfissionalSaude16 {
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
    public void testTestCaseProfissionalSaude16() throws Exception {
        driver.get("http://159.65.29.212/");
        driver.findElement(By.linkText("TeenPower")).click();
        driver.findElement(By.linkText("Login")).click();
        driver.findElement(By.id("email")).clear();
        driver.findElement(By.id("email")).sendKeys("profissionaldesaude@mail.com");
        driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("password")).sendKeys("password_tp18_p");
        driver.findElement(By.cssSelector("button.btn.btn-primary")).click();




        WebElement table = driver.findElement(By.xpath("//table[@class='table']"));

        List<WebElement> linhas = table.findElements(By.tagName("tr"));
        WebElement linhaPretendida = null;
        for (int i = 0; i<linhas.size();i++) {
                if(linhas.get(i).getText().contains("teste55@mail.com")) {
                    linhaPretendida = linhas.get(i);
                    break;
                }
        }
        assertNotNull(linhaPretendida);
        System.out.println(linhaPretendida.getTagName());





        }

        /*
        WebElement row = table.findElement(By.xpath("//tr/td[text()='teste55@mail.com']"));
        //WebElement primeiroMail = driver.findElement(By.xpath("//tr//td[text()='teste55@mail.com']"));
        assertNotNull(table);
        System.out.println(row.getTagName());
*/

        //driver.findElement(By.cssSelector("table.table tr button.btn.btn-primary")).click();

        //driver.findElement(By.cssSelector("button.btn.btn-primary")).click();
        //driver.findElement(By.linkText("Rúben Emanuel Gonçalves Abreu")).click();
        //String segundoEmail = driver.findElement(By.xpath("//div[@id='appContainer']/div/div/div/div[2]/p[2]/label")).getText();
        //assertEquals(primeiroMail,segundoEmail);


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

