import java.io.File;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


import org.junit.*;
import static org.junit.Assert.*;



public class testCaseProfissionalSaude5 {
    private WebDriver driver;
    private String baseUrl;
    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();
    //private static String downloadPath = "C:\\Users\\Ruben\\Downloads\\";
    //private String downloadPath = "\\Google\\Chrome\\downloads\\";//System.getProperty("java.io.tmpdir");
    private String downloadPath = System.getProperty("user.dir") + "\\Downloads";
    /*
    ChromeOptions options = new ChromeOptions();
    Map<String, Object> preferences = new Hashtable<String, Object>();

     preferences.("profile.default_content_settings.popups", 0);
     preferences.put("download.default_directory", downloadFilepath);
*/


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
        baseUrl = "http://159.65.29.212/login";
        //driver.manage().window().setSize(new Dimension(1024,768));

        ChromeOptions options = new ChromeOptions();
        HashMap<String, Object> preferences = new HashMap<String, Object>();
        System.out.println();
        preferences.put("profile.default_content_settings.popups", 0);
        preferences.put("download.default_directory", downloadPath);

        options.setExperimentalOption("prefs", preferences);
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
    @Test
    public void testTestCaseProfissionalSaude5() throws Exception {
        driver.get("http://159.65.29.212/");
        driver.findElement(By.linkText("TeenPower")).click();

        //driver.findElement(By.cssSelector("button.navbar-toggler")).click();
        driver.findElement(By.linkText("Login")).click();

        driver.findElement(By.id("email")).clear();
        driver.findElement(By.id("email")).sendKeys("profissionaldesaude@mail.com");

        driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("password")).sendKeys("password_tp18_p");

        driver.findElement(By.cssSelector("button.btn.btn-primary")).click();
        driver.findElement(By.linkText("Gestão de Adolescentes")).click();
        driver.findElement(By.xpath("(//button[@type='button'])[5]")).click();




      Thread.sleep(10000);
      File getLatestFile = getLatestFilefromDir(downloadPath);
      String fileName = getLatestFile.getName();

        System.out.println(downloadPath);


      try {
          isFileDownloaded(downloadPath,fileName);
          Assert.assertTrue("A funccionalidade não se encontra a funcionar corretamente ou não existem adolescentes para exportar",fileName.contains(".xlsx"));
          /*
          File file = new File(downloadPath + "\\" + fileName);
          System.out.println(downloadPath + fileName);
          file.delete();
          */
      } catch (Error e) {
          verificationErrors.append(e.toString());
      }

       //System.out.println(fileName);


    }

    @After
    public void tearDown() throws Exception {

        File getLatestFile = getLatestFilefromDir(downloadPath);
        String fileName = getLatestFile.getName();

        File file = new File(downloadPath + "\\" + fileName);
        System.out.println(downloadPath + fileName);
        file.delete();

        driver.quit();
        String verificationErrorString = verificationErrors.toString();
        if (!"".equals(verificationErrorString)) {
            fail(verificationErrorString);
        }
    }

/*
    public String getDownloadPath() {
        return this.dd;
    }
*/

    public boolean isFileDownloaded(String downloadPath, String fileName) {
        boolean flag = false;
        File dir = new File(downloadPath);
        File[] dir_contents = dir.listFiles();

        for (int i = 0; i < dir_contents.length; i++) {
            if (dir_contents[i].getName().equals(fileName))
                return flag=true;
        }

        return flag;
    }

    private boolean isFileDownloaded_Ext(String dirPath, String ext){
        boolean flag=false;
        File dir = new File(dirPath);
        File[] files = dir.listFiles();
        if (files == null || files.length == 0) {
            flag = false;
        }

        for (int i = 1; i < files.length; i++) {
            if(files[i].getName().contains(ext)) {
                flag=true;
            }
        }
        return flag;
    }

    private File getLatestFilefromDir(String dirPath){
        File dir = new File(dirPath);
        File[] files = dir.listFiles();
        if (files == null || files.length == 0) {
            return null;
        }

        File lastModifiedFile = files[0];
        for (int i = 1; i < files.length; i++) {
            if (lastModifiedFile.lastModified() < files[i].lastModified()) {
                lastModifiedFile = files[i];
            }
        }
        return lastModifiedFile;
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

