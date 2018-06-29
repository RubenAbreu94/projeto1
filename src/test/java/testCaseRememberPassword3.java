import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

public class testCaseRememberPassword3 extends junit.framework.TestCase{
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
  public void testTestCaseRememberPassword3() throws Exception {
    driver.get("http://159.65.29.212/password/reset");
    driver.findElement(By.name("email")).click();
    driver.findElement(By.name("email")).clear();
    driver.findElement(By.name("email")).sendKeys("xpto@gmail.com");
    driver.findElement(By.cssSelector("button.btn.btn-primary")).click();
    // Warning: verifyTextPresent may require manual changes
    try {
      assertTrue("Se estou a tentar recuperar conta e o email não é válido , devo receber uma mensagem que me explique o mesmo",driver.findElement(By.cssSelector("BODY")).getText().contains("Não encontramos nenhum utilizador com esse e-mail."));
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
