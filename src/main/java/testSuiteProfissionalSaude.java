import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class testSuiteProfissionalSaude extends junit.framework.TestCase{
    private WebDriver driver;
    private String baseUrl;
    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();
    private String downloadPath = System.getProperty("user.dir") + "\\Downloads";
    private String ficherioImportar = System.getProperty("user.dir") + "\\Uploads\\Adolescentes_Profissional de Saude_2018_4_19.xlsx";

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

        ChromeOptions options = new ChromeOptions();
        HashMap<String, Object> preferences = new HashMap<String, Object>();
        System.out.println();
        preferences.put("profile.default_content_settings.popups", 0);
        preferences.put("download.default_directory", downloadPath);

        options.setExperimentalOption("prefs", preferences);
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        /*
        driver = new ChromeDriver();
        baseUrl = "http://159.65.29.212";
        driver.manage().window().setSize(new Dimension(1024,768));
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        */
    }

    @Test
    public void testTestCaseProfissionalSaude1() throws Exception {
        driver.get("http://159.65.29.212/login");
        driver.findElement(By.id("email")).clear();
        driver.findElement(By.id("email")).sendKeys("profissionaldesaude@mail.com");
        driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("password")).sendKeys("password_tp18_p");
        driver.findElement(By.cssSelector("button.btn.btn-primary")).click();
        // Warning: verifyTextPresent may require manual changes
        try {
            assertTrue(driver.findElement(By.cssSelector("BODY")).getText().contains("Lista de Adolescentes"));
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        driver.findElement(By.xpath("(//button[@type='button'])[3]")).click();
        // Warning: verifyTextPresent may require manual changes
        try {
            assertTrue(driver.findElement(By.cssSelector("BODY")).getText().contains("Lista de Adolescentes"));
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
    }

    @Test
    public void testTestCaseProfissionalSaude2() throws Exception {
        driver.get("http://159.65.29.212/login");
        driver.findElement(By.id("email")).clear();
        driver.findElement(By.id("email")).sendKeys("profissionaldesaude@mail.com");
        driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("password")).sendKeys("password_tp18_p");
        driver.findElement(By.cssSelector("button.btn.btn-primary")).click();
        // ERROR: Caught exception [ERROR: Unsupported command [selectWindow | null | ]]
        driver.findElement(By.xpath("(//button[@type='button'])[4]")).click();
        // Warning: verifyTextPresent may require manual changes
        try {
            assertTrue(driver.findElement(By.cssSelector("BODY")).getText().contains("Formulário de Criação de Adolescentes"));
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        driver.findElement(By.xpath("(//button[@type='button'])[3]")).click();
        // Warning: verifyTextPresent may require manual changes
        try {
            assertTrue(driver.findElement(By.cssSelector("BODY")).getText().contains("Lista de Adolescentes"));
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
    }

    @Test
    public void testTestCaseProfissionalSaude3() throws Exception {
        driver.get("http://159.65.29.212/login");
        driver.findElement(By.id("email")).clear();
        driver.findElement(By.id("email")).sendKeys("profissionaldesaude@mail.com");
        driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("password")).sendKeys("password_tp18_p");
        driver.findElement(By.cssSelector("button.btn.btn-primary")).click();
        // Warning: verifyTextPresent may require manual changes
        try {
            assertTrue(driver.findElement(By.cssSelector("BODY")).getText().contains("Lista de Adolescentes"));
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        driver.findElement(By.cssSelector("button.btn.btn-secondary")).click();
        // Warning: verifyTextPresent may require manual changes
        try {
            assertTrue(driver.findElement(By.cssSelector("BODY")).getText().contains("Importação de Utilizadores"));
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
    }

    @Test
    public void testTestCaseProfissionalSaude4() throws Exception {
        driver.get("http://159.65.29.212/login");
        driver.findElement(By.id("email")).clear();
        driver.findElement(By.id("email")).sendKeys("profissionaldesaude@mail.com");
        driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("password")).sendKeys("password_tp18_p");
        driver.findElement(By.cssSelector("button.btn.btn-primary")).click();
        // Warning: verifyTextPresent may require manual changes
        try {
            assertTrue(driver.findElement(By.cssSelector("BODY")).getText().contains("Lista de Adolescentes"));
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        driver.findElement(By.xpath("(//button[@type='button'])[4]")).click();
        // Warning: verifyTextPresent may require manual changes
        try {
            assertTrue(driver.findElement(By.cssSelector("BODY")).getText().contains("Formulário de Criação de Adolescentes"));
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
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

    @Test
    public void testTestCaseProfissionalSaude7() throws Exception {
        driver.get("http://159.65.29.212/login");
        driver.findElement(By.id("email")).clear();
        driver.findElement(By.id("email")).sendKeys("profissionaldesaude@mail.com");
        driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("password")).sendKeys("password_tp18_p");
        driver.findElement(By.cssSelector("button.btn.btn-primary")).click();
        // Warning: verifyTextPresent may require manual changes
        String USER_EMAIL=driver.findElement(By.cssSelector("table.table tr:last-child td:nth-child(2)")).getText();

        driver.findElement(By.cssSelector("table.table tr:last-child #delete-button")).click();
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("button[type=submit]")).click();
        // Warning: verifyTextNotPresent may require manual changes
        Thread.sleep(3000);
        try {

            assertEquals(false,driver.findElement(By.cssSelector("table.table tr:last-child")).getText().matches(USER_EMAIL));

        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        driver.findElement(By.linkText("Profissional de Saude")).click();
        driver.findElement(By.linkText("Logout")).click();
    }

    @Test
    public void testTestCaseProfissionalSaude8() throws Exception {
        driver.get("http://159.65.29.212/login");
        driver.findElement(By.id("email")).clear();
        driver.findElement(By.id("email")).sendKeys("profissionaldesaude@mail.com");
        driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("password")).sendKeys("password_tp18_p");
        driver.findElement(By.cssSelector("button.btn.btn-primary")).click();
        // Warning: verifyTextPresent may require manual changes
        try {
            assertTrue(driver.findElement(By.cssSelector("BODY")).getText().contains("Funcionalidades"));
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        driver.findElement(By.linkText("Fórum")).click();
        // Warning: verifyTextPresent may require manual changes
        try {
            assertTrue(driver.findElement(By.cssSelector("BODY")).getText().contains("Nova Categoria"));
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
    }

    @Test
    public void testTestCaseProfissionalSaude9() throws Exception {
        driver.get("http://159.65.29.212/login");
        driver.findElement(By.id("email")).clear();
        driver.findElement(By.id("email")).sendKeys("profissionaldesaude@mail.com");
        driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("password")).sendKeys("password_tp18_p");
        driver.findElement(By.cssSelector("button.btn.btn-primary")).click();
        // Warning: verifyTextPresent may require manual changes
        try {
            assertTrue(driver.findElement(By.cssSelector("BODY")).getText().contains("Funcionalidades"));
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        driver.findElement(By.linkText("Fórum")).click();
        // Warning: verifyTextPresent may require manual changes
        try {
            assertTrue(driver.findElement(By.cssSelector("BODY")).getText().contains("Nova Categoria"));
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        driver.findElement(By.cssSelector("#new_category_btn")).click();
        Thread.sleep(3000);
        // Warning: verifyTextPresent may require manual changes

        String height_cssValue =  driver.findElement(By.cssSelector("#new_category")).getCssValue("height");
        System.out.println(height_cssValue);
        try {
            assertTrue(height_cssValue.contains("100px"));
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
    }

    @Test
    public void testTestCaseProfissionalSaude10() throws Exception {
        driver.get("http://159.65.29.212/");
        driver.findElement(By.linkText("TeenPower")).click();
        // driver.findElement(By.cssSelector("button.navbar-toggler")).click();
        //driver.findElement(By.cssSelector("button.navbar-toggler")).click();
        driver.findElement(By.linkText("Login")).click();
        driver.findElement(By.id("email")).clear();
        driver.findElement(By.id("email")).sendKeys("profissionaldesaude@mail.com");
        driver.findElement(By.id("password")).sendKeys("password_tp18_p");
        driver.findElement(By.cssSelector("button.btn.btn-primary")).click();
        // Warning: verifyTextPresent may require manual changes
        try {
            assertTrue("Dado que iniciei conta como prof. de saude deveria-me ser apresentada a lista de adolescentes",driver.findElement(By.cssSelector("BODY")).getText().contains("Lista de Adolescentes"));
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        // ERROR: Caught exception [ERROR: Unsupported command [selectWindow | null | ]]
        driver.findElement(By.cssSelector("button.btn.btn-secondary")).click();
        //driver.findElement(By.name("file")).click();

        WebElement uploadElement = driver.findElement(By.name("file"));

        // enter the file path onto the file-selection input field
        uploadElement.sendKeys(ficherioImportar);
        driver.findElement(By.cssSelector("button.btn.btn-primary")).click();


        //assertEquals("Whoops, looks like something went wrong.", driver.findElement(By.cssSelector("div.title")).getText());


        try {


            assertTrue("Se importar um ficheiro com um formato errado deveria ser apresentado uma mensagem de erro",driver.findElement(By.cssSelector("BODY")).getText().contains("O ficheiro selecionado não tem a estrutura correta. Por favor contacte o Administrador para que este lhe forneça o template."));
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }


/*
        driver.findElement(By.id("navbarDropdownMenuLink")).click();
        driver.findElement(By.id("navbarDropdownMenuLink")).click();
        driver.findElement(By.linkText("Logout")).click();
        driver.findElement(By.linkText("Logout")).click();
        */
    }

    @Test
    public void testTestCaseProfissionalSaude11() throws Exception {
        driver.get("http://159.65.29.212/login");
        driver.findElement(By.id("email")).clear();
        driver.findElement(By.id("email")).sendKeys("profissionaldesaude@mail.com");
        driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("password")).sendKeys("password_tp18_p");
        driver.findElement(By.cssSelector("button.btn.btn-primary")).click();
        // Warning: verifyTextPresent may require manual changes
        try {
            assertTrue(driver.findElement(By.cssSelector("BODY")).getText().contains("Lista de Adolescentes"));
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        driver.findElement(By.cssSelector("table.table tr:last-child #delete-button")).click();
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("button.btn.btn-default")).click();
        Thread.sleep(3000);
        // Warning: verifyTextPresent may require manual changes
        try {
            assertTrue(driver.findElement(By.cssSelector("BODY")).getText().contains("Lista de Adolescentes"));
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
    }

    @Test
    public void testTestCaseProfissionalSaude12() throws Exception {
        driver.get("http://159.65.29.212/login");
        driver.findElement(By.id("email")).clear();
        driver.findElement(By.id("email")).sendKeys("profissionaldesaude@mail.com");
        driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("password")).sendKeys("password_tp18_p");
        driver.findElement(By.cssSelector("button.btn.btn-primary")).click();
        // Warning: verifyTextPresent may require manual changes
        String USER_EMAIL=driver.findElement(By.cssSelector("table.table tr:last-child td:nth-child(2)")).getText();

        driver.findElement(By.cssSelector("table.table tr:last-child #delete-button")).click();
        Thread.sleep(3000);
        try {
            assertTrue(driver.findElement(By.cssSelector("div.modal-body")).getText().contains("Tem a certeza que pretende eliminar o utilizador Rúben Emanuel Gonçalves Abreu?"));
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }

        System.out.println("Não contêm o nome do Utilizador na mensagem de eliminar!");
    }

    @Test
    public void testTestCaseProfissionalSaude13() throws Exception {
        driver.get("http://159.65.29.212/login");
        driver.findElement(By.id("email")).clear();
        driver.findElement(By.id("email")).sendKeys("profissionaldesaude@mail.com");
        driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("password")).sendKeys("password_tp18_p");
        driver.findElement(By.cssSelector("button.btn.btn-primary")).click();
        // Warning: verifyTextPresent may require manual changes
        try {
            assertTrue("Devia aparecer a página Lista de adolescentes apos efetuar login com prof. saude",driver.findElement(By.cssSelector("BODY")).getText().contains("Lista de Adolescentes"));
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        // ERROR: Caught exception [ERROR: Unsupported command [selectWindow | null | ]]
        driver.findElement(By.linkText("Criar Novo Adolescente")).click();
        driver.findElement(By.id("inputName")).clear();
        driver.findElement(By.id("inputName")).sendKeys("Rúben Emanuel Gonçalves Abreu");
        driver.findElement(By.id("inputEmail")).clear();
        driver.findElement(By.id("inputEmail")).sendKeys("TESTE14@mail.com");
        driver.findElement(By.id("inputInstitution")).clear();
        driver.findElement(By.id("inputInstitution")).sendKeys("ESSLei");
        driver.findElement(By.xpath("//form[@id='form-add-teen']/div[5]/div/div[2]/label")).click();
        driver.findElement(By.xpath("//button[@type='submit']")).click();

        try {
            assertTrue("Foi criado um utilizador que não se verifica estar agora presente na lista de adolescentes",driver.findElement(By.cssSelector("BODY")).getText().contains("TESTE14@mail.com"));
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        driver.findElement(By.linkText("Profissional de Saude")).click();
        driver.findElement(By.linkText("Logout")).click();
    }

    @Test
    public void testTestCaseProfissionalSaude14() throws Exception {
        driver.get("http://159.65.29.212/login");
        driver.findElement(By.id("email")).clear();
        driver.findElement(By.id("email")).sendKeys("profissionaldesaude@mail.com");
        driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("password")).sendKeys("password_tp18_p");
        driver.findElement(By.cssSelector("button.btn.btn-primary")).click();
        // Warning: verifyTextPresent may require manual changes
        try {
            assertTrue("Devia aparecer a página Lista de adolescentes apos efetuar login com prof. saude",driver.findElement(By.cssSelector("BODY")).getText().contains("Lista de Adolescentes"));
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        // ERROR: Caught exception [ERROR: Unsupported command [selectWindow | null | ]]
        driver.findElement(By.linkText("Criar Novo Adolescente")).click();
        driver.findElement(By.id("inputName")).clear();
        driver.findElement(By.id("inputName")).sendKeys("Beatriz Junqueira Santos");
        driver.findElement(By.id("inputEmail")).clear();
        driver.findElement(By.id("inputEmail")).sendKeys("TESTE15@mail.com");
        driver.findElement(By.id("inputInstitution")).clear();
        driver.findElement(By.id("inputInstitution")).sendKeys("ESTG");
        driver.findElement(By.xpath("//form[@id='form-add-teen']/div[5]/div/div")).click();
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        try {
            assertTrue("Foi criado um utilizador que não se verifica estar na lista ",driver.findElement(By.cssSelector("BODY")).getText().contains("TESTE15@mail.com"));
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        driver.findElement(By.linkText("Profissional de Saude")).click();
        driver.findElement(By.linkText("Logout")).click();
    }

    @Test
    public void testTestCaseProfissionalSaude15() throws Exception {
        driver.get("http://159.65.29.212/");
        driver.findElement(By.linkText("TeenPower")).click();
        driver.findElement(By.linkText("Login")).click();
        driver.findElement(By.id("email")).clear();
        driver.findElement(By.id("email")).sendKeys("profissionaldesaude@mail.com");
        driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("password")).sendKeys("password_tp18_p");
        driver.findElement(By.cssSelector("button.btn.btn-primary")).click();
        driver.findElement(By.id("navbarDropdownMenuLink")).click();
        driver.findElement(By.linkText("Perfil")).click();

        try {
            assertTrue("Deveria existir um botão 'Voltar atrás'",driver.findElement(By.cssSelector("BODY")).getText().contains("Voltar atrás"));
            //assertEquals("Voltar atrás", driver.findElement(By.xpath("(//button[@type='button'])[4]")).getText());
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        driver.findElement(By.id("navbarDropdownMenuLink")).click();
        driver.findElement(By.linkText("Logout")).click();
    }

    @Test
    public void testTestCaseProfissionalSaude16() throws Exception {

        driver.get("http://159.65.29.212/login");
        driver.findElement(By.id("email")).clear();
        driver.findElement(By.id("email")).sendKeys("profissionaldesaude@mail.com");
        driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("password")).sendKeys("password_tp18_p");
        driver.findElement(By.cssSelector("button.btn.btn-primary")).click();
        // Warning: verifyTextPresent may require manual changes
        try {
            assertTrue(driver.findElement(By.cssSelector("BODY")).getText().contains("Lista de Adolescentes"));
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        // ERROR: Caught exception [ERROR: Unsupported command [selectWindow | null | ]]
        driver.findElement(By.linkText("Criar Novo Adolescente")).click();
        driver.findElement(By.id("inputName")).clear();
        driver.findElement(By.id("inputName")).sendKeys("Teste ProfSaude Dezasseis");
        driver.findElement(By.id("inputEmail")).clear();
        driver.findElement(By.id("inputEmail")).sendKeys("testeProf16@mail.com");
        driver.findElement(By.id("inputInstitution")).clear();
        driver.findElement(By.id("inputInstitution")).sendKeys("ESTG");
        driver.findElement(By.xpath("//form[@id='form-add-teen']/div[5]/div/div")).click();
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        driver.findElement(By.linkText("Gestão de Adolescentes")).click();

        Thread.sleep(1000);


        WebElement table = driver.findElement(By.xpath("//table[@class='table']"));

        List<WebElement> linhas = table.findElements(By.tagName("tr"));
        WebElement linhaPretendida = null;
        for (int i = 0; i<linhas.size();i++) {
            if(linhas.get(i).getText().contains("testeProf16@mail.com")) {
                linhaPretendida = linhas.get(i);
                break;
            }
        }
        assertNotNull(linhaPretendida);
        System.out.println(linhaPretendida.getTagName());

        linhaPretendida.findElement(By.cssSelector("button.btn.btn-primary")).click();

        Thread.sleep(1000);

        WebElement inputBox = driver.findElement(By.id("inputEmail"));
        String textInsideInputBox = inputBox.getAttribute("value");

        try {
            assertEquals("testeProf16@mail.com", textInsideInputBox);
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        driver.findElement(By.linkText("Gestão de Adolescentes")).click();

        Thread.sleep(1000);




        WebElement table2 = driver.findElement(By.xpath("//table[@class='table']"));

        List<WebElement> linhas2 = table2.findElements(By.tagName("tr"));
        WebElement linhaPretendida2 = null;
        for (int i = 0; i<linhas2.size();i++) {
            if(linhas2.get(i).getText().contains("testeProf16@mail.com")) {
                linhaPretendida2 = linhas2.get(i);
                break;
            }
        }

        linhaPretendida2.findElement(By.cssSelector("tr:last-child #delete-button")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("button.btn.btn-danger")).click();



    }


    @Test
    public void testTestCaseProfissionalSaude17() throws Exception {

        driver.get("http://159.65.29.212/login");
        driver.findElement(By.id("email")).clear();
        driver.findElement(By.id("email")).sendKeys("profissionaldesaude@mail.com");
        driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("password")).sendKeys("password_tp18_p");
        driver.findElement(By.cssSelector("button.btn.btn-primary")).click();
        // Warning: verifyTextPresent may require manual changes
        try {
            assertTrue(driver.findElement(By.cssSelector("BODY")).getText().contains("Lista de Adolescentes"));
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        // ERROR: Caught exception [ERROR: Unsupported command [selectWindow | null | ]]
        driver.findElement(By.linkText("Criar Novo Adolescente")).click();
        driver.findElement(By.id("inputName")).clear();
        driver.findElement(By.id("inputName")).sendKeys("Teste ProfSaude Dezasseis");
        driver.findElement(By.id("inputEmail")).clear();
        driver.findElement(By.id("inputEmail")).sendKeys("testeProf16@mail.com");
        driver.findElement(By.id("inputInstitution")).clear();
        driver.findElement(By.id("inputInstitution")).sendKeys("ESTG");
        driver.findElement(By.xpath("//form[@id='form-add-teen']/div[5]/div/div")).click();
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        driver.findElement(By.linkText("Gestão de Adolescentes")).click();

        Thread.sleep(1000);


        WebElement table = driver.findElement(By.xpath("//table[@class='table']"));

        List<WebElement> linhas = table.findElements(By.tagName("tr"));
        WebElement linhaPretendida = null;
        for (int i = 0; i<linhas.size();i++) {
            if(linhas.get(i).getText().contains("testeProf16@mail.com")) {
                linhaPretendida = linhas.get(i);
                break;
            }
        }

        linhaPretendida.findElement(By.cssSelector("button.btn.btn-primary")).click();

        Thread.sleep(1000);

        driver.findElement(By.id("inputInstitution")).clear();
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        try {
            assertTrue("Deveria aparecer uma mensagem a avisar que a instituição é obrigatória",driver.findElement(By.cssSelector("BODY")).getText().contains("O campo Instituição é obrigatório"));
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }

        driver.findElement(By.id("inputInstitution")).clear();
        driver.findElement(By.id("inputInstitution")).sendKeys("ESTG");
        driver.findElement(By.xpath("//button[@type='submit']")).click();



        driver.findElement(By.linkText("Gestão de Adolescentes")).click();

        Thread.sleep(1000);




        WebElement table2 = driver.findElement(By.xpath("//table[@class='table']"));

        List<WebElement> linhas2 = table2.findElements(By.tagName("tr"));
        WebElement linhaPretendida2 = null;
        for (int i = 0; i<linhas2.size();i++) {
            if(linhas2.get(i).getText().contains("testeProf16@mail.com")) {
                linhaPretendida2 = linhas2.get(i);
                break;
            }
        }

        linhaPretendida2.findElement(By.cssSelector("tr:last-child #delete-button")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("button.btn.btn-danger")).click();



    }


    @Test
    public void testTestCaseProfissionalSaude18() throws Exception {
        driver.get("http://159.65.29.212/");
        driver.findElement(By.linkText("TeenPower")).click();
        driver.findElement(By.linkText("Login")).click();
        driver.findElement(By.id("email")).clear();
        driver.findElement(By.id("email")).sendKeys("profissionaldesaude@mail.com");
        driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("password")).sendKeys("password_tp18_p");
        driver.findElement(By.cssSelector("button.btn.btn-primary")).click();

        driver.findElement(By.linkText("Criar Novo Adolescente")).click();
        driver.findElement(By.id("inputName")).clear();
        driver.findElement(By.id("inputName")).sendKeys("Teste ProfSaude Dezasseis");
        driver.findElement(By.id("inputEmail")).clear();
        driver.findElement(By.id("inputEmail")).sendKeys("testeProf16@mail.com");
        driver.findElement(By.id("inputInstitution")).clear();
        driver.findElement(By.id("inputInstitution")).sendKeys("ESTG");
        driver.findElement(By.xpath("//form[@id='form-add-teen']/div[5]/div/div")).click();
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        driver.findElement(By.linkText("Gestão de Adolescentes")).click();

        Thread.sleep(1000);


        WebElement table = driver.findElement(By.xpath("//table[@class='table']"));

        List<WebElement> linhas = table.findElements(By.tagName("tr"));
        WebElement linhaPretendida = null;
        for (int i = 0; i<linhas.size();i++) {
            if(linhas.get(i).getText().contains("testeProf16@mail.com")) {
                linhaPretendida = linhas.get(i);
                break;
            }
        }

        linhaPretendida.findElement(By.cssSelector("button.btn.btn-primary")).click();

        Thread.sleep(1000);




        //driver.findElement(By.xpath("(//button[@type='button'])[9]")).click();
        driver.findElement(By.id("inputInstitution")).clear();
        driver.findElement(By.id("inputInstitution")).sendKeys("ESTG");

        driver.findElement(By.xpath("//button[@type='submit']")).click();



        driver.findElement(By.linkText("Gestão de Adolescentes")).click();

        Thread.sleep(1000);




        WebElement table2 = driver.findElement(By.xpath("//table[@class='table']"));

        List<WebElement> linhas2 = table2.findElements(By.tagName("tr"));
        WebElement linhaPretendida2 = null;
        for (int i = 0; i<linhas2.size();i++) {
            if(linhas2.get(i).getText().contains("testeProf16@mail.com")) {
                linhaPretendida2 = linhas2.get(i);
                break;
            }
        }

        linhaPretendida2.findElement(By.cssSelector("tr:last-child #delete-button")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("button.btn.btn-danger")).click();
    }

    @Test
    public void testTestCaseProfissionalSaude19() throws Exception {
        driver.get("http://159.65.29.212/");
        driver.findElement(By.linkText("TeenPower")).click();
        driver.findElement(By.linkText("Login")).click();
        driver.findElement(By.id("email")).clear();
        driver.findElement(By.id("email")).sendKeys("profissionaldesaude@mail.com");
        driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("password")).sendKeys("password_tp18_p");
        driver.findElement(By.cssSelector("button.btn.btn-primary")).click();
        driver.findElement(By.xpath("(//button[@type='button'])[9]")).click();
        driver.findElement(By.id("inputInstitution")).clear();
        driver.findElement(By.id("inputInstitution")).sendKeys("ESTG");
        driver.findElement(By.xpath("//button[@type='submit']")).click();

        try {
            assertTrue("Após efetuar uma edição de perfil e submete-la com sucesso deveria ser apresentada uma mensagem de sucesso",driver.findElement(By.cssSelector("BODY")).getText().contains("Alteração efectuada com sucesso!"));
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
    }

    @Test
    public void testTestCaseProfissionalSaude20() throws Exception {
        driver.get("http://159.65.29.212/login");
        driver.findElement(By.id("email")).clear();
        driver.findElement(By.id("email")).sendKeys("profissionaldesaude@mail.com");
        driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("password")).sendKeys("password_tp18_p");
        driver.findElement(By.cssSelector("button.btn.btn-primary")).click();
        // Warning: verifyTextPresent may require manual changes
        try {
            assertTrue(driver.findElement(By.cssSelector("BODY")).getText().contains("Rúben Emanuel Gonçalves Abreu"));
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        // Warning: verifyTextPresent may require manual changes
        try {
            assertTrue(driver.findElement(By.cssSelector("BODY")).getText().contains("ESSLei"));
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        driver.findElement(By.xpath("(//button[@type='button'])[9]")).click();
        driver.findElement(By.cssSelector("button.btn.btn-secundary")).click();
        // Warning: verifyTextPresent may require manual changes
        try {
            assertTrue(driver.findElement(By.cssSelector("BODY")).getText().contains("Rúben Emanuel Gonçalves Abreu"));
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        // Warning: verifyTextPresent may require manual changes
        try {
            assertTrue(driver.findElement(By.cssSelector("BODY")).getText().contains("ESSLei"));
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
    }

    @Test
    public void testTestCaseProfissionalSaude21() throws Exception {
        driver.get("http://159.65.29.212/login");
        driver.findElement(By.id("email")).clear();
        driver.findElement(By.id("email")).sendKeys("profissionaldesaude@mail.com");
        driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("password")).sendKeys("password_tp18_p");
        driver.findElement(By.cssSelector("button.btn.btn-primary")).click();
        // Warning: verifyTextPresent may require manual changes
        try {
            assertTrue(driver.findElement(By.cssSelector("BODY")).getText().contains("Rúben Emanuel Gonçalves Abreu"));
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        // Warning: verifyTextPresent may require manual changes
        try {
            assertTrue(driver.findElement(By.cssSelector("BODY")).getText().contains("ESSLei"));
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        driver.findElement(By.xpath("(//button[@type='button'])[9]")).click();
        driver.findElement(By.id("inputName")).clear();
        driver.findElement(By.id("inputName")).sendKeys("Rúben Emanuel Gonçalves Radamanto");
        driver.findElement(By.id("inputInstitution")).clear();
        driver.findElement(By.id("inputInstitution")).sendKeys("ESTG");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        driver.findElement(By.linkText("1")).click();
        // Warning: verifyTextPresent may require manual changes
        try {
            assertTrue(driver.findElement(By.cssSelector("BODY")).getText().contains("Rúben Emanuel Gonçalves Radamanto"));
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        // Warning: verifyTextPresent may require manual changes
        try {
            assertTrue(driver.findElement(By.cssSelector("BODY")).getText().contains("ESTG"));
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
    }

    @Test
    public void testTestCaseProfissionalSaude22() throws Exception {
        driver.get("http://159.65.29.212/");
        driver.findElement(By.linkText("TeenPower")).click();
        // driver.findElement(By.cssSelector("button.navbar-toggler")).click();
        //driver.findElement(By.cssSelector("button.navbar-toggler")).click();
        driver.findElement(By.linkText("Login")).click();
        driver.findElement(By.id("email")).clear();
        driver.findElement(By.id("email")).sendKeys("profissionaldesaude@mail.com");
        driver.findElement(By.id("password")).sendKeys("password_tp18_p");
        driver.findElement(By.cssSelector("button.btn.btn-primary")).click();
        // Warning: verifyTextPresent may require manual changes
        try {
            assertTrue(driver.findElement(By.cssSelector("BODY")).getText().contains("Lista de Adolescentes"));
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        // ERROR: Caught exception [ERROR: Unsupported command [selectWindow | null | ]]
        driver.findElement(By.cssSelector("button.btn.btn-secondary")).click();
        //driver.findElement(By.name("file")).click();

        WebElement uploadElement = driver.findElement(By.name("file"));
        uploadElement.sendKeys(ficherioImportar);
        driver.findElement(By.cssSelector("button.btn.btn-primary")).click();

        driver.findElement(By.id("selectAll")).click();
        driver.findElement(By.cssSelector("button.btn.btn-primary")).click();

        Thread.sleep(1000);


        try {
            assertTrue("Após importar utilizadores deveria-me ser apresentada uma mensagem de sucesso, não o está a acontecer",driver.findElement(By.cssSelector("BODY")).getText().contains("Sucesso"));
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }


        driver.findElement(By.linkText("Gestão de Adolescentes")).click();
        Thread.sleep(1000);


        WebElement table2 = driver.findElement(By.xpath("//table[@class='table']"));

        List<WebElement> linhas2 = table2.findElements(By.tagName("tr"));
        WebElement linhaPretendida2 = null;
        for (int i = 0; i<linhas2.size();i++) {
            if(linhas2.get(i).getText().contains("testes22222@mail.pt")) {
                linhaPretendida2 = linhas2.get(i);
                break;
            }
        }

        linhaPretendida2.findElement(By.cssSelector("tr:last-child #delete-button")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("button.btn.btn-danger")).click();

    }


    @Test
    public void testTestCaseProfissionalSaude23() throws Exception {
        driver.get("http://159.65.29.212/");
        driver.findElement(By.linkText("TeenPower")).click();
        // driver.findElement(By.cssSelector("button.navbar-toggler")).click();
        //driver.findElement(By.cssSelector("button.navbar-toggler")).click();
        driver.findElement(By.linkText("Login")).click();
        driver.findElement(By.id("email")).clear();
        driver.findElement(By.id("email")).sendKeys("profissionaldesaude@mail.com");
        driver.findElement(By.id("password")).sendKeys("password_tp18_p");
        driver.findElement(By.cssSelector("button.btn.btn-primary")).click();
        // Warning: verifyTextPresent may require manual changes
        try {
            assertTrue("Apos efetuar login com prof. saude deveria ser apresentada a pag. de lista de adolescentes",driver.findElement(By.cssSelector("BODY")).getText().contains("Lista de Adolescentes"));
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        // ERROR: Caught exception [ERROR: Unsupported command [selectWindow | null | ]]
        driver.findElement(By.cssSelector("button.btn.btn-secondary")).click();
        //driver.findElement(By.name("file")).click();

        WebElement uploadElement = driver.findElement(By.name("file"));
        uploadElement.sendKeys(ficherioImportar);
        driver.findElement(By.cssSelector("button.btn.btn-primary")).click();

        driver.findElement(By.id("selectAll")).click();
        driver.findElement(By.cssSelector("button.btn.btn-primary")).click();

        Thread.sleep(1000);


        try {
            assertTrue("Ao tentar importar um utilizador com um email ja existente na lista de adolescente deve-me ser apresentado uma mensagem de erro a avisar disso mesmo",driver.findElement(By.cssSelector("BODY")).getText().contains("Erros:  Já existe um utilizador registado com o mesmo e-mail"));
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }

        driver.findElement(By.cssSelector("button.btn.btn-secondary")).click();

    }

    @Test
    public void testTestCaseProfissionalSaude24() throws Exception {

        driver.get("http://159.65.29.212/login");
        driver.findElement(By.id("email")).clear();
        driver.findElement(By.id("email")).sendKeys("profissionaldesaude@mail.com");
        driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("password")).sendKeys("password_tp18_p");
        driver.findElement(By.cssSelector("button.btn.btn-primary")).click();
        // Warning: verifyTextPresent may require manual changes
        try {
            assertTrue(driver.findElement(By.cssSelector("BODY")).getText().contains("Lista de Adolescentes"));
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        // ERROR: Caught exception [ERROR: Unsupported command [selectWindow | null | ]]
        driver.findElement(By.linkText("Criar Novo Adolescente")).click();
        driver.findElement(By.id("inputName")).clear();
        driver.findElement(By.id("inputName")).sendKeys("Teste ProfSaude Dezasseis");
        driver.findElement(By.id("inputEmail")).clear();
        driver.findElement(By.id("inputEmail")).sendKeys("testeProf16@mail.com");
        driver.findElement(By.id("inputInstitution")).clear();
        driver.findElement(By.id("inputInstitution")).sendKeys("ESTG");
        driver.findElement(By.xpath("//form[@id='form-add-teen']/div[5]/div/div")).click();
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        driver.findElement(By.linkText("Gestão de Adolescentes")).click();

        Thread.sleep(1000);


        WebElement table = driver.findElement(By.xpath("//table[@class='table']"));

        List<WebElement> linhas = table.findElements(By.tagName("tr"));
        WebElement linhaPretendida = null;
        for (int i = 0; i<linhas.size();i++) {
            if(linhas.get(i).getText().contains("testeProf16@mail.com")) {
                linhaPretendida = linhas.get(i);
                break;
            }
        }

        linhaPretendida.findElement(By.cssSelector("button.btn.btn-primary")).click();

        Thread.sleep(1000);

        driver.findElement(By.id("inputName")).clear();
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        try {
            assertTrue("Ao editar o perfil de um utilizador e deixo o campo nome em branco deve-me ser apresentada uma mensagem avisar que este campo é obrigatório",driver.findElement(By.cssSelector("BODY")).getText().contains("O campo Nome é obrigatório"));
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }

        driver.findElement(By.id("inputName")).sendKeys("Teste ProfSaude Vinte e quatro");
        driver.findElement(By.xpath("//button[@type='submit']")).click();



        driver.findElement(By.linkText("Gestão de Adolescentes")).click();

        Thread.sleep(1000);




        WebElement table2 = driver.findElement(By.xpath("//table[@class='table']"));

        List<WebElement> linhas2 = table2.findElements(By.tagName("tr"));
        WebElement linhaPretendida2 = null;
        for (int i = 0; i<linhas2.size();i++) {
            if(linhas2.get(i).getText().contains("testeProf16@mail.com")) {
                linhaPretendida2 = linhas2.get(i);
                break;
            }
        }

        linhaPretendida2.findElement(By.cssSelector("tr:last-child #delete-button")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("button.btn.btn-danger")).click();



    }


    @Test
    public void testTestCaseProfissionalSaude25() throws Exception {

        driver.get("http://159.65.29.212/login");
        driver.findElement(By.id("email")).clear();
        driver.findElement(By.id("email")).sendKeys("profissionaldesaude@mail.com");
        driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("password")).sendKeys("password_tp18_p");
        driver.findElement(By.cssSelector("button.btn.btn-primary")).click();
        // Warning: verifyTextPresent may require manual changes
        try {
            assertTrue("Após efetuar login com prof. saude deveria-me ser apresentada a página de lista de adolescentes",driver.findElement(By.cssSelector("BODY")).getText().contains("Lista de Adolescentes"));
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        // ERROR: Caught exception [ERROR: Unsupported command [selectWindow | null | ]]
        driver.findElement(By.linkText("Criar Novo Adolescente")).click();
        driver.findElement(By.id("inputName")).clear();
        driver.findElement(By.id("inputName")).sendKeys("Teste ProfSaude Dezasseis");
        driver.findElement(By.id("inputEmail")).clear();
        driver.findElement(By.id("inputEmail")).sendKeys("testeProf16@mail.com");
        driver.findElement(By.id("inputInstitution")).clear();
        driver.findElement(By.id("inputInstitution")).sendKeys("ESTG");
        driver.findElement(By.xpath("//form[@id='form-add-teen']/div[5]/div/div")).click();
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        driver.findElement(By.linkText("Gestão de Adolescentes")).click();

        Thread.sleep(1000);


        WebElement table = driver.findElement(By.xpath("//table[@class='table']"));

        List<WebElement> linhas = table.findElements(By.tagName("tr"));
        WebElement linhaPretendida = null;
        for (int i = 0; i<linhas.size();i++) {
            if(linhas.get(i).getText().contains("testeProf16@mail.com")) {
                linhaPretendida = linhas.get(i);
                break;
            }
        }

        linhaPretendida.findElement(By.cssSelector("button.btn.btn-primary")).click();

        Thread.sleep(1000);



        ;


        driver.findElement(By.id("inputEmail")).clear();
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        try {
            assertTrue("Ao editar um perfil e não preencher o email deve-me ser apresentada uma mensagem de erro a avisar que esse campo é obrigatório",driver.findElement(By.cssSelector("BODY")).getText().contains("O campo Email é obrigatório."));
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }

        driver.findElement(By.id("inputEmail")).sendKeys("testeProf25@mail.com");
        driver.findElement(By.xpath("//button[@type='submit']")).click();



        driver.findElement(By.linkText("Gestão de Adolescentes")).click();

        Thread.sleep(1000);




        WebElement table2 = driver.findElement(By.xpath("//table[@class='table']"));

        List<WebElement> linhas2 = table2.findElements(By.tagName("tr"));
        WebElement linhaPretendida2 = null;
        for (int i = 0; i<linhas2.size();i++) {
            if(linhas2.get(i).getText().contains("testeProf25@mail.com")) {
                linhaPretendida2 = linhas2.get(i);
                break;
            }
        }

        linhaPretendida2.findElement(By.cssSelector("tr:last-child #delete-button")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("button.btn.btn-danger")).click();



    }


    @Test
    public void testTestCaseProfissionalSaude26() throws Exception {

        driver.get("http://159.65.29.212/login");
        driver.findElement(By.id("email")).clear();
        driver.findElement(By.id("email")).sendKeys("profissionaldesaude@mail.com");
        driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("password")).sendKeys("password_tp18_p");
        driver.findElement(By.cssSelector("button.btn.btn-primary")).click();
        // Warning: verifyTextPresent may require manual changes
        try {
            assertTrue("Após efetuar login com prof. saude então é suposto estar na pagina de lista de adolescentes",driver.findElement(By.cssSelector("BODY")).getText().contains("Lista de Adolescentes"));
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        // ERROR: Caught exception [ERROR: Unsupported command [selectWindow | null | ]]
        driver.findElement(By.linkText("Criar Novo Adolescente")).click();
        driver.findElement(By.id("inputName")).clear();
        driver.findElement(By.id("inputName")).sendKeys("Teste ProfSaude Dezasseis");
        driver.findElement(By.id("inputEmail")).clear();
        driver.findElement(By.id("inputEmail")).sendKeys("testeProf16@mail.com");
        driver.findElement(By.id("inputInstitution")).clear();
        driver.findElement(By.id("inputInstitution")).sendKeys("ESTG");
        driver.findElement(By.xpath("//form[@id='form-add-teen']/div[5]/div/div")).click();
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        driver.findElement(By.linkText("Gestão de Adolescentes")).click();

        Thread.sleep(1000);


        WebElement table = driver.findElement(By.xpath("//table[@class='table']"));

        List<WebElement> linhas = table.findElements(By.tagName("tr"));
        WebElement linhaPretendida = null;
        for (int i = 0; i<linhas.size();i++) {
            if(linhas.get(i).getText().contains("testeProf16@mail.com")) {
                linhaPretendida = linhas.get(i);
                break;
            }
        }

        linhaPretendida.findElement(By.cssSelector("button.btn.btn-primary")).click();

        Thread.sleep(1000);

        driver.findElement(By.id("inputEmail")).clear();
        driver.findElement(By.id("inputInstitution")).clear();
        driver.findElement(By.id("inputName")).clear();

        driver.findElement(By.xpath("//button[@type='submit']")).click();
        try {
            assertTrue(driver.findElement(By.cssSelector("BODY")).getText().contains("O campo Instituição é obrigatório"));
            assertTrue(driver.findElement(By.cssSelector("BODY")).getText().contains("O campo Email é obrigatório."));
            assertTrue(driver.findElement(By.cssSelector("BODY")).getText().contains("O campo Nome é obrigatório"));
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }


        driver.findElement(By.id("inputName")).clear();
        driver.findElement(By.id("inputName")).sendKeys("Teste ProfSaude Dezasseis");
        driver.findElement(By.id("inputEmail")).clear();
        driver.findElement(By.id("inputEmail")).sendKeys("testeProf16@mail.com");
        driver.findElement(By.id("inputInstitution")).clear();
        driver.findElement(By.id("inputInstitution")).sendKeys("ESTG");
        driver.findElement(By.xpath("//button[@type='submit']")).click();



        driver.findElement(By.linkText("Gestão de Adolescentes")).click();

        Thread.sleep(1000);




        WebElement table2 = driver.findElement(By.xpath("//table[@class='table']"));

        List<WebElement> linhas2 = table2.findElements(By.tagName("tr"));
        WebElement linhaPretendida2 = null;
        for (int i = 0; i<linhas2.size();i++) {
            if(linhas2.get(i).getText().contains("testeProf16@mail.com")) {
                linhaPretendida2 = linhas2.get(i);
                break;
            }
        }

        linhaPretendida2.findElement(By.cssSelector("tr:last-child #delete-button")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("button.btn.btn-danger")).click();



    }



    @Test
    public void testTestCaseProfissionalSaude27() throws Exception {

        driver.get("http://159.65.29.212/login");
        driver.findElement(By.id("email")).clear();
        driver.findElement(By.id("email")).sendKeys("profissionaldesaude@mail.com");
        driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("password")).sendKeys("password_tp18_p");
        driver.findElement(By.cssSelector("button.btn.btn-primary")).click();
        // Warning: verifyTextPresent may require manual changes
        try {
            assertTrue("Após efetuar login com prof. saude então é suposto estar na pagina de lista de adolescentes",driver.findElement(By.cssSelector("BODY")).getText().contains("Lista de Adolescentes"));
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        // ERROR: Caught exception [ERROR: Unsupported command [selectWindow | null | ]]
        driver.findElement(By.linkText("Criar Novo Adolescente")).click();
        driver.findElement(By.id("inputName")).clear();
        driver.findElement(By.id("inputName")).sendKeys("Teste ProfSaude Dezasseis");
        driver.findElement(By.id("inputEmail")).clear();
        driver.findElement(By.id("inputEmail")).sendKeys("testeProf16@mail.com");
        driver.findElement(By.id("inputInstitution")).clear();
        driver.findElement(By.id("inputInstitution")).sendKeys("ESTG");
        driver.findElement(By.xpath("//form[@id='form-add-teen']/div[5]/div/div")).click();
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        driver.findElement(By.linkText("Gestão de Adolescentes")).click();

        Thread.sleep(1000);


        WebElement table = driver.findElement(By.xpath("//table[@class='table']"));

        List<WebElement> linhas = table.findElements(By.tagName("tr"));
        WebElement linhaPretendida = null;
        for (int i = 0; i<linhas.size();i++) {
            if(linhas.get(i).getText().contains("testeProf16@mail.com")) {
                linhaPretendida = linhas.get(i);
                break;
            }
        }

        linhaPretendida.findElement(By.cssSelector("button.btn.btn-primary")).click();

        Thread.sleep(1000);

        driver.findElement(By.id("birthdateInput")).clear();
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        driver.findElement(By.linkText("Gestão de Adolescentes")).click();

        Thread.sleep(1000);

        try {
            assertTrue(driver.findElement(By.cssSelector("BODY")).getText().contains("Lista de Adolescentes"));

        } catch (Error e) {
            verificationErrors.append(e.toString());
        }




        WebElement table2 = driver.findElement(By.xpath("//table[@class='table']"));

        List<WebElement> linhas2 = table2.findElements(By.tagName("tr"));
        WebElement linhaPretendida2 = null;
        for (int i = 0; i<linhas2.size();i++) {
            if(linhas2.get(i).getText().contains("testeProf16@mail.com")) {
                linhaPretendida2 = linhas2.get(i);
                break;
            }
        }

        linhaPretendida2.findElement(By.cssSelector("tr:last-child #delete-button")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("button.btn.btn-danger")).click();



    }

    @Test
    public void testTestCaseProfissionalSaude28() throws Exception {

        driver.get("http://159.65.29.212/login");
        driver.findElement(By.id("email")).clear();
        driver.findElement(By.id("email")).sendKeys("profissionaldesaude@mail.com");
        driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("password")).sendKeys("password_tp18_p");
        driver.findElement(By.cssSelector("button.btn.btn-primary")).click();
        // Warning: verifyTextPresent may require manual changes
        try {
            assertTrue("Após efetuar login com prof. saude então é suposto estar na pagina de lista de adolescentes",driver.findElement(By.cssSelector("BODY")).getText().contains("Lista de Adolescentes"));
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        // ERROR: Caught exception [ERROR: Unsupported command [selectWindow | null | ]]
        driver.findElement(By.linkText("Criar Novo Adolescente")).click();
        driver.findElement(By.id("inputName")).clear();
        driver.findElement(By.id("inputName")).sendKeys("Teste ProfSaude Dezasseis");
        driver.findElement(By.id("inputEmail")).clear();
        driver.findElement(By.id("inputEmail")).sendKeys("testeProf16@mail.com");
        driver.findElement(By.id("inputInstitution")).clear();
        driver.findElement(By.id("inputInstitution")).sendKeys("ESTG");
        driver.findElement(By.xpath("//form[@id='form-add-teen']/div[5]/div/div")).click();
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        driver.findElement(By.linkText("Gestão de Adolescentes")).click();

        Thread.sleep(1000);


        WebElement table = driver.findElement(By.xpath("//table[@class='table']"));

        List<WebElement> linhas = table.findElements(By.tagName("tr"));
        WebElement linhaPretendida = null;
        for (int i = 0; i<linhas.size();i++) {
            if(linhas.get(i).getText().contains("testeProf16@mail.com")) {
                linhaPretendida = linhas.get(i);
                break;
            }
        }

        linhaPretendida.findElement(By.cssSelector("button.btn.btn-primary")).click();

        Thread.sleep(1000);

        driver.findElement(By.xpath("//form[@id='form-add-teen']/div[5]/div/div[2]/label")).click();
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        driver.findElement(By.linkText("Gestão de Adolescentes")).click();

        Thread.sleep(1000);


        WebElement table2 = driver.findElement(By.xpath("//table[@class='table']"));

        List<WebElement> linhas2 = table2.findElements(By.tagName("tr"));
        WebElement linhaPretendida2 = null;
        for (int i = 0; i<linhas2.size();i++) {
            if(linhas2.get(i).getText().contains("testeProf16@mail.com")) {
                linhaPretendida2 = linhas2.get(i);
                break;
            }
        }


        List<WebElement> colunas = linhaPretendida2.findElements(By.tagName("td"));
        WebElement colunaPretendida = null;
        for (int i = 0; i<colunas.size();i++) {
            if(colunas.get(i).getText().contains("Masculino")) {
                colunaPretendida = colunas.get(i);
                System.out.println("A alteração de género para  masculino foi feita com sucesso");
                break;
            }
        }


        linhaPretendida2.findElement(By.cssSelector("tr:last-child #delete-button")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("button.btn.btn-danger")).click();



    }


    @Test
    public void testTestCaseProfissionalSaude29() throws Exception {

        driver.get("http://159.65.29.212/login");
        driver.findElement(By.id("email")).clear();
        driver.findElement(By.id("email")).sendKeys("profissionaldesaude@mail.com");
        driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("password")).sendKeys("password_tp18_p");
        driver.findElement(By.cssSelector("button.btn.btn-primary")).click();
        // Warning: verifyTextPresent may require manual changes
        try {
            assertTrue("Após efetuar login com prof. saude então é suposto estar na pagina de lista de adolescentes",driver.findElement(By.cssSelector("BODY")).getText().contains("Lista de Adolescentes"));
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        // ERROR: Caught exception [ERROR: Unsupported command [selectWindow | null | ]]
        driver.findElement(By.linkText("Criar Novo Adolescente")).click();
        driver.findElement(By.id("inputName")).clear();
        driver.findElement(By.id("inputName")).sendKeys("Teste ProfSaude Dezasseis");
        driver.findElement(By.id("inputEmail")).clear();
        driver.findElement(By.id("inputEmail")).sendKeys("testeProf16@mail.com");
        driver.findElement(By.id("inputInstitution")).clear();
        driver.findElement(By.id("inputInstitution")).sendKeys("ESTG");
        driver.findElement(By.xpath("//form[@id='form-add-teen']/div[5]/div/div[2]/label")).click();
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        driver.findElement(By.linkText("Gestão de Adolescentes")).click();

        Thread.sleep(1000);


        WebElement table = driver.findElement(By.xpath("//table[@class='table']"));

        List<WebElement> linhas = table.findElements(By.tagName("tr"));
        WebElement linhaPretendida = null;
        for (int i = 0; i<linhas.size();i++) {
            if(linhas.get(i).getText().contains("testeProf16@mail.com")) {
                linhaPretendida = linhas.get(i);
                break;
            }
        }

        linhaPretendida.findElement(By.cssSelector("button.btn.btn-primary")).click();

        Thread.sleep(1000);

        driver.findElement(By.cssSelector("label.custom-control-label")).click();
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        driver.findElement(By.linkText("Gestão de Adolescentes")).click();

        Thread.sleep(1000);


        WebElement table2 = driver.findElement(By.xpath("//table[@class='table']"));

        List<WebElement> linhas2 = table2.findElements(By.tagName("tr"));
        WebElement linhaPretendida2 = null;
        for (int i = 0; i<linhas2.size();i++) {
            if(linhas2.get(i).getText().contains("testeProf16@mail.com")) {
                linhaPretendida2 = linhas2.get(i);
                break;
            }
        }


        List<WebElement> colunas = linhaPretendida2.findElements(By.tagName("td"));
        WebElement colunaPretendida = null;
        for (int i = 0; i<colunas.size();i++) {
            if(colunas.get(i).getText().contains("Feminino")) {
                colunaPretendida = colunas.get(i);
                System.out.println("A alteração de género para  Feminino foi feita com sucesso");
                break;
            }
        }


        linhaPretendida2.findElement(By.cssSelector("tr:last-child #delete-button")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("button.btn.btn-danger")).click();



    }


    @Test
    public void testTestCaseProfissionalSaude30() throws Exception {
        driver.get("http://159.65.29.212/login");
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


    @Test
    public void testTestCaseProfissionalSaude31() throws Exception {
        driver.get("http://159.65.29.212/login");
        driver.findElement(By.linkText("Login")).click();
        driver.findElement(By.id("email")).clear();
        driver.findElement(By.id("email")).sendKeys("testeautoPerfis@mail.com");
        driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("password")).sendKeys("123perfis");
        driver.findElement(By.cssSelector("button.btn.btn-primary")).click();
        driver.findElement(By.id("navbarDropdownMenuLink")).click();
        driver.findElement(By.linkText("Perfil")).click();
        driver.findElement(By.cssSelector("a.float-right.mr-2 > button.btn.btn-primary")).click();
        driver.findElement(By.id("inputEmail")).clear();
        driver.findElement(By.id("inputEmail")).sendKeys("testeautoPerfisATLERADO@mail.com");
        driver.findElement(By.xpath("//button[@type='submit']")).click();


        assertTrue(driver.findElement(By.cssSelector("BODY")).getText().contains("testeautoPerfisATLERADO@mail.com"));
        driver.findElement(By.cssSelector("a.float-right.mr-2 > button.btn.btn-primary")).click();
        driver.findElement(By.id("inputEmail")).clear();
        driver.findElement(By.id("inputEmail")).sendKeys("testeautoPerfis@mail.com");

        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }


    @Test
    public void testTestCaseProfissionalSaude32() throws Exception {
        driver.get("http://159.65.29.212/login");
        driver.findElement(By.linkText("Login")).click();
        driver.findElement(By.id("email")).clear();
        driver.findElement(By.id("email")).sendKeys("testeautoPerfis@mail.com");
        driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("password")).sendKeys("perfis123");
        driver.findElement(By.cssSelector("button.btn.btn-primary")).click();
        driver.findElement(By.id("navbarDropdownMenuLink")).click();
        driver.findElement(By.linkText("Perfil")).click();
        driver.findElement(By.cssSelector("button.btn.btn-primary")).click();
        driver.findElement(By.id("old_password")).clear();
        driver.findElement(By.id("old_password")).sendKeys("perfis123");
        driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("password")).sendKeys("123perfis");
        driver.findElement(By.id("password_confirmation")).clear();
        driver.findElement(By.id("password_confirmation")).sendKeys("123perfis");
        driver.findElement(By.xpath("//button[@type='submit']")).click();


        driver.findElement(By.cssSelector("button.btn.btn-primary")).click();
        driver.findElement(By.id("old_password")).clear();
        driver.findElement(By.id("old_password")).sendKeys("123perfis");
        driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("password")).sendKeys("perfis123");
        driver.findElement(By.id("password_confirmation")).clear();
        driver.findElement(By.id("password_confirmation")).sendKeys("perfis123");
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
