import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.fail;

public class Testcase1 {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "http://159.65.29.212/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);


  }

  @Test
  public void testCase1() throws Exception {
    driver.get("http://159.65.29.212/");
    driver.findElement(By.linkText("TeenPower")).click();
    driver.findElement(By.linkText("TeenPower")).click();
    driver.findElement(By.cssSelector("button.navbar-toggler")).click();
    driver.findElement(By.cssSelector("button.navbar-toggler")).click();
    driver.findElement(By.linkText("Login")).click();
    driver.findElement(By.linkText("Login")).click();
    driver.findElement(By.id("email")).clear();
    driver.findElement(By.id("email")).sendKeys("professor@email.com");
    driver.findElement(By.id("email")).clear();
    driver.findElement(By.id("email")).sendKeys("professor@email.com");
    driver.findElement(By.cssSelector("button.btn.btn-primary")).click();
    driver.findElement(By.cssSelector("button.btn.btn-primary")).click();
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
