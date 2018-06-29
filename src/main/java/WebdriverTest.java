import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.logging.Level;
import java.util.logging.Logger;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
public class WebdriverTest {
    @Test
    public void googleTest() {
        Logger.getLogger("").setLevel(Level.OFF);
        System.setProperty("webdriver.gecko.driver",
                "drivers\\geckodriver.exe");
        System.setProperty("webdriver.edge.driver",
                "drivers\\MicrosoftWebDriver.exe");
        System.setProperty("webdriver.chrome.driver",
                "drivers\\chromedriver.exe");
        System.setProperty("phantomjs.binary.path",
                "drivers\\phantomjs.exe");
        //WebDriver driver = new FirefoxDriver();
        //WebDriver driver = new EdgeDriver();
         WebDriver driver = new ChromeDriver();
        //WebDriver driver = new HtmlUnitDriver();
        //WebDriver driver = new PhantomJSDriver();

        driver.get("https://en.wikipedia.org");
        assertEquals("Wikipedia, the free encyclopedia", driver.getTitle());
        WebElement element = driver.findElement(By.id("searchInput"));
        element.sendKeys("Leiria");

        WebElement element2 = driver.findElement(By.id("searchButton"));
        element2.click();
        //element.submit();

        WebDriverWait wait = new WebDriverWait(driver, 10);
        //wait.until(ExpectedConditions.titleContains("Leiria - Wikipedia"));
        driver.quit();
    }
}
