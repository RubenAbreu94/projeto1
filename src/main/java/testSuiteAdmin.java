import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TestSuiteAdmin extends junit.framework.TestCase {
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
        baseUrl = "http://159.65.29.212";
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }


    @Test
    public void testTestCaseFuncAdmin0() throws Exception {
        driver.get("http://159.65.29.212//login");
        driver.findElement(By.id("email")).click();
        driver.findElement(By.id("email")).clear();
        driver.findElement(By.id("email")).sendKeys("administrador@mail.com");
        driver.findElement(By.id("password")).click();
        driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("password")).sendKeys("admin_tp18_a");
        driver.findElement(By.cssSelector("button.btn.btn-primary")).click();
        // Warning: verifyTextPresent may require manual changes
        try {
            assertTrue(driver.findElement(By.cssSelector("BODY")).getText().contains("Total de Utilizadores"));
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        // ERROR: Caught exception [ERROR: Unsupported command [selectWindow | null | ]]


        //driver.findElement(By.id("navbar-toggler")).click();
        driver.findElement(By.linkText("Administrator")).click();

        driver.findElement(By.linkText("Perfil")).click();

        try {
            assertEquals("Perfil do Utilizador", driver.findElement(By.cssSelector("h5.card-header")).getText());
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
    }


    @Test
    public void testAdmin1() throws Exception {
        driver.get("http://159.65.29.212//login");
        driver.findElement(By.linkText("Login")).click();
        driver.findElement(By.linkText("Login")).click();
        driver.findElement(By.id("email")).clear();
        driver.findElement(By.id("email")).sendKeys("administrador@mail.com");
        driver.findElement(By.id("email")).clear();
        driver.findElement(By.id("email")).sendKeys("administrador@mail.com");
        driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("password")).sendKeys("admin_tp18_a");
        driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("password")).sendKeys("admin_tp18_a");
        driver.findElement(By.cssSelector("button.btn.btn-primary")).click();
        driver.findElement(By.linkText("Gestão de Utilizadores")).click();
        driver.findElement(By.cssSelector("button.btn.btn-primary")).click();
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
        driver.findElement(By.xpath("(//button[@type='button'])[5]")).click();
        driver.findElement(By.id("id=btn-send")).click();
        // Warning: verifyTextPresent may require manual changes
        try {
            assertTrue(driver.findElement(By.id("//ul[@id='messages-wrapper']/li[5]/div[2]")).getText().contains("Olá"));
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
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


    @Test
    public void testCaseAdmin4() throws Exception {
        driver.get("http://159.65.29.212/login");
        driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("password")).sendKeys("password_tp18_p");
        driver.findElement(By.id("email")).clear();
        driver.findElement(By.id("email")).sendKeys("profissionaldesaude@mail.com");
        driver.findElement(By.cssSelector("button.btn.btn-primary")).click();
        driver.findElement(By.linkText("Fórum")).click();


        driver.findElement(By.id("new_category_btn")).click();
        driver.findElement(By.name("name")).sendKeys("Automatizados");
        Thread.sleep(2000);
        driver.findElement(By.id("submit_category")).click();


        driver.findElement(By.id("new_category_btn")).click();
        new Select(driver.findElement(By.cssSelector("#new_category > #chatter_form_editor > div.row > div.col-md-4 > #chatter_category_id"))).selectByVisibleText("Automatizados");
        driver.findElement(By.name("name")).clear();
        driver.findElement(By.name("name")).sendKeys("TesteAuto05");
        Thread.sleep(2000);
        driver.findElement(By.id("submit_category")).click();


        try {
            assertTrue("Após criar uma categoria/sub categoria deveria ser apresentada uma mensagem de sucesso",driver.findElement(By.cssSelector("BODY")).getText().contains("Nova Categoria criada com Sucesso."));
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }



        driver.findElement(By.linkText("Automatizados")).click();
        driver.findElement(By.id("delete-button")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("button.btn.btn-danger")).click();


    }


    @Test
    public void testAdmin5 () throws Exception {
        driver.get("http://159.65.29.212/login");
        driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("password")).sendKeys("password_tp18_p");
        driver.findElement(By.id("email")).clear();
        driver.findElement(By.id("email")).sendKeys("profissionaldesaude@mail.com");
        driver.findElement(By.cssSelector("button.btn.btn-primary")).click();
        driver.findElement(By.linkText("Fórum")).click();
        driver.findElement(By.id("new_category_btn")).click();
        driver.findElement(By.name("name")).sendKeys("Automatizados");
        Thread.sleep(2000);
        driver.findElement(By.id("submit_category")).click();


        try {
            assertTrue("Após criar uma categoria deveria ser apresentada uma mensagem de sucesso",driver.findElement(By.cssSelector("BODY")).getText().contains("Nova Categoria criada com Sucesso."));
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }



        driver.findElement(By.linkText("Automatizados")).click();
        driver.findElement(By.id("delete-button")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("button.btn.btn-danger")).click();
    }

    @Test
    public void testAdmin6() throws Exception {
        driver.get("http://159.65.29.212/login");
        driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("password")).sendKeys("password_tp18_p");
        driver.findElement(By.id("email")).clear();
        driver.findElement(By.id("email")).sendKeys("profissionaldesaude@mail.com");
        driver.findElement(By.cssSelector("button.btn.btn-primary")).click();
        driver.findElement(By.linkText("Fórum")).click();
        driver.findElement(By.id("new_category_btn")).click();

        driver.findElement(By.name("name")).sendKeys("Automatizados");
        Thread.sleep(2000);
        driver.findElement(By.id("submit_category")).click();
        driver.findElement(By.linkText("Automatizados")).click();
        driver.findElement(By.id("delete-button")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("button.btn.btn-danger")).click();

        try {
            assertFalse("A categoria foi eliminada, logo  já não deveriam existir discussões ativas com essa categoria",driver.findElement(By.cssSelector("BODY")).getText().contains("Automatizados"));
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
    }


    @Test
    public void testAdmin7() throws Exception {
        driver.get("http://159.65.29.212/login");
        driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("password")).sendKeys("password_tp18_p");
        driver.findElement(By.id("email")).clear();
        driver.findElement(By.id("email")).sendKeys("profissionaldesaude@mail.com");
        driver.findElement(By.cssSelector("button.btn.btn-primary")).click();
        driver.findElement(By.linkText("Fórum")).click();
        driver.findElement(By.id("new_category_btn")).click();
        driver.findElement(By.name("name")).sendKeys("Automatizados");
        Thread.sleep(2000);
        driver.findElement(By.id("submit_category")).click();
        driver.findElement(By.linkText("Automatizados")).click();
        driver.findElement(By.id("edit_category_btn")).click();
        driver.findElement(By.cssSelector("div.col-md-5 > #title")).sendKeys("AutomatizadosAlterado");
        driver.findElement(By.xpath("//form[@id='chatter_form_editor']/div/div[2]/div/div[2]")).click();
        driver.findElement(By.id("submit_edit_category")).click();


        try {
            assertTrue("Após atualizar uma categoria deveria ser apresentada uma mensagem de sucesso",driver.findElement(By.cssSelector("BODY")).getText().contains("Categoria Atualizada com Sucesso."));
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }

        driver.findElement(By.id("delete-button")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("button.btn.btn-danger")).click();

    }

    @Test
    public void testTestCaseAdmin8() throws Exception {
        driver.get("http://159.65.29.212/login");
        driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("password")).sendKeys("password_tp18_p");
        driver.findElement(By.id("email")).clear();
        driver.findElement(By.id("email")).sendKeys("profissionaldesaude@mail.com");
        driver.findElement(By.cssSelector("button.btn.btn-primary")).click();
        driver.findElement(By.linkText("Fórum")).click();
        driver.findElement(By.id("new_category_btn")).click();

        driver.findElement(By.name("name")).sendKeys("Automatizados");
        Thread.sleep(2000);
        driver.findElement(By.id("submit_category")).click();
        driver.findElement(By.linkText("Automatizados")).click();
        driver.findElement(By.id("new_discussion_btn")).click();
        driver.findElement(By.id("title")).clear();
        driver.findElement(By.id("title")).sendKeys("Teste");


        driver.switchTo().frame(driver.findElement(By.id("body_ifr")));
        //driver.findElement(By.cssSelector("tinymce.mce-content-body p")).click();
        driver.findElement(By.id("tinymce")).sendKeys("TesteTEEEEEEEEESTE sadasdsad");
        driver.switchTo().defaultContent();

        driver.findElement(By.id("submit_discussion")).click();
        assertEquals("Nova Discussão criada com Sucesso.", driver.findElement(By.xpath("//div[@id='chatter']/div[2]/div")).getText());



        driver.findElement(By.cssSelector("i.chatter-back")).click();
        driver.findElement(By.linkText("Automatizados")).click();
        driver.findElement(By.id("delete-button")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("button.btn.btn-danger")).click();

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
        driver.findElement(By.cssSelector("button.btn.btn-secondary")).click();
        driver.findElement(By.name("file")).clear();




        //// ABREU , NÃO PODES METER UM CAMINHO ABSOLUTO AQUI  , VAI VER COMO FIZ NO OUTRO TESTE DE IMPORTAR

        driver.findElement(By.name("file")).sendKeys("C:\\Users\\Ruben Abreu\\Desktop\\Admin_Role_5_Instituicoes.csv");





        driver.findElement(By.cssSelector("button.btn.btn-primary")).click();
        driver.findElement(By.id("selectAll")).click();
        driver.findElement(By.cssSelector("button.btn.btn-primary")).click();
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



    @Test
    public void testTestCaseAdmin10() throws Exception {
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
        driver.findElement(By.cssSelector("button.btn.btn-secondary")).click();
        driver.findElement(By.name("file")).clear();
        driver.findElement(By.name("file")).sendKeys("C:\\Users\\Ruben Abreu\\Desktop\\Admin_Role_5_Instituicoes.csv");
        driver.findElement(By.cssSelector("button.btn.btn-primary")).click();
        driver.findElement(By.id("selectAll")).click();
        driver.findElement(By.cssSelector("button.btn.btn-primary")).click();
        // Warning: verifyTextPresent may require manual changes
        try {
            assertTrue("Apos importar com sucesso deveria ser mostrada uma mensagem de sucesso",driver.findElement(By.cssSelector("BODY")).getText().contains("Sucesso! Foram enviados 9 emails de confirmação."));
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        driver.findElement(By.linkText("Gestão de Utilizadores")).click();
        // Warning: verifyTextPresent may require manual changes
        try {
            assertTrue("Um ou mais dos utilizadores adicionados nao se encontra presenta na lista de utilizadores",driver.findElement(By.cssSelector("BODY")).getText().contains("jsilva@mail.com"));
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


    @Test
    public void testAdmin11() throws Exception {
        driver.get("http://159.65.29.212/login");
        driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("password")).sendKeys("password_tp18_p");
        driver.findElement(By.id("email")).clear();
        driver.findElement(By.id("email")).sendKeys("profissionaldesaude@mail.com");
        driver.findElement(By.cssSelector("button.btn.btn-primary")).click();
        driver.findElement(By.linkText("Fórum")).click();
        driver.findElement(By.id("new_category_btn")).click();

        driver.findElement(By.name("name")).sendKeys("Automatizados");
        Thread.sleep(2000);
        driver.findElement(By.id("submit_category")).click();
        driver.findElement(By.linkText("Automatizados")).click();
        driver.findElement(By.id("new_discussion_btn")).click();
        driver.findElement(By.id("title")).clear();
        driver.findElement(By.id("title")).sendKeys("Teste");


        driver.switchTo().frame(driver.findElement(By.id("body_ifr")));
        //driver.findElement(By.cssSelector("tinymce.mce-content-body p")).click();
        driver.findElement(By.id("tinymce")).sendKeys("TesteTEEEEEEEEESTE sadasdsad");
        driver.switchTo().defaultContent();

        driver.findElement(By.id("submit_discussion")).click();
        assertEquals("Nova Discussão criada com Sucesso.", driver.findElement(By.xpath("//div[@id='chatter']/div[2]/div")).getText());

        driver.findElement(By.cssSelector("i.chatter-back")).click();


        driver.findElement(By.linkText("Automatizados")).click();
        driver.findElement(By.cssSelector("h3.chatter_middle_title")).click();

        driver.findElement(By.id("tinymce_placeholder")).click();

        driver.switchTo().frame(driver.findElement(By.id("body_ifr")));
        //driver.findElement(By.cssSelector("tinymce.mce-content-body p")).click();
        driver.findElement(By.id("tinymce")).sendKeys("Resposta ao teste");
        driver.switchTo().defaultContent();
        driver.findElement(By.id("submit_response")).click();

        try {
            assertTrue("Após criar uma nova resposta numa discussão deve ser apresentada uma mensagem de sucesso ",driver.findElement(By.xpath("//div[@id='chatter']/div[2]/div")).getText().contains("Resposta Submetida com Sucesso."));
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }


        driver.findElement(By.cssSelector("a.back_btn")).click();


        driver.findElement(By.linkText("Automatizados")).click();
        driver.findElement(By.id("delete-button")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("button.btn.btn-danger")).click();

    }



    @Test
    public void testAdmin12() throws Exception {
        driver.get("http://159.65.29.212/login");
        driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("password")).sendKeys("password_tp18_p");
        driver.findElement(By.id("email")).clear();
        driver.findElement(By.id("email")).sendKeys("profissionaldesaude@mail.com");
        driver.findElement(By.cssSelector("button.btn.btn-primary")).click();
        driver.findElement(By.linkText("Fórum")).click();
        driver.findElement(By.id("new_category_btn")).click();

        driver.findElement(By.name("name")).sendKeys("Automatizados");
        Thread.sleep(1000);
        driver.findElement(By.id("submit_category")).click();
        driver.findElement(By.linkText("Automatizados")).click();
        driver.findElement(By.id("new_discussion_btn")).click();
        driver.findElement(By.id("title")).clear();
        driver.findElement(By.id("title")).sendKeys("Teste");


        driver.switchTo().frame(driver.findElement(By.id("body_ifr")));
        //driver.findElement(By.cssSelector("tinymce.mce-content-body p")).click();
        driver.findElement(By.id("tinymce")).sendKeys("TesteTEEEEEEEEESTE sadasdsad");
        driver.switchTo().defaultContent();

        driver.findElement(By.id("submit_discussion")).click();
        assertEquals("Nova Discussão criada com Sucesso.", driver.findElement(By.xpath("//div[@id='chatter']/div[2]/div")).getText());

        driver.findElement(By.cssSelector("i.chatter-back")).click();


        driver.findElement(By.linkText("Automatizados")).click();
        driver.findElement(By.cssSelector("h3.chatter_middle_title")).click();

        driver.findElement(By.id("tinymce_placeholder")).click();

        driver.switchTo().frame(driver.findElement(By.id("body_ifr")));
        //driver.findElement(By.cssSelector("tinymce.mce-content-body p")).click();
        driver.findElement(By.id("tinymce")).sendKeys("Resposta ao teste");
        driver.switchTo().defaultContent();
        driver.findElement(By.id("submit_response")).click();

        try {
            assertTrue("Após apagar uma discussão deve-me ser apresentada uma mensagem de sucesso",driver.findElement(By.xpath("//div[@id='chatter']/div[2]/div")).getText().contains("Resposta Submetida com Sucesso."));
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }

        driver.findElement(By.cssSelector("a.back_btn")).click();


        driver.findElement(By.linkText("Automatizados")).click();
        driver.findElement(By.id("delete-button")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("button.btn.btn-danger")).click();
        Thread.sleep(3000);


        //assertEquals("Bem Vindo à TeenPower!", driver.findElement(By.cssSelector("div.card-body")).getText());

        try {
            assertFalse("Dado que a categoria foi apagada então as dicussões nela presentes também deveriam ser apagadas",driver.findElement(By.cssSelector(".chatter_cat")).getText().contains("Automatizados"));
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }


    }


    @Test
    public void testTestCaseAdmin13() throws Exception {
        driver.get("http://159.65.29.212/login");
        driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("password")).sendKeys("password_tp18_p");
        driver.findElement(By.id("email")).clear();
        driver.findElement(By.id("email")).sendKeys("profissionaldesaude@mail.com");
        driver.findElement(By.cssSelector("button.btn.btn-primary")).click();
        driver.findElement(By.linkText("Fórum")).click();
        driver.findElement(By.id("new_category_btn")).click();

        driver.findElement(By.name("name")).sendKeys("Automatizados");
        Thread.sleep(2000);
        driver.findElement(By.id("submit_category")).click();
        driver.findElement(By.linkText("Automatizados")).click();
        driver.findElement(By.id("new_discussion_btn")).click();
        driver.findElement(By.id("title")).clear();
        driver.findElement(By.id("title")).sendKeys("Teste");

        driver.switchTo().frame(driver.findElement(By.id("body_ifr")));
        driver.findElement(By.id("tinymce")).sendKeys("TesteTEEEEEEEEESTE sadasdsad");
        driver.switchTo().defaultContent();

        driver.findElement(By.id("submit_discussion")).click();
        assertEquals("Nova Discussão criada com Sucesso.", driver.findElement(By.xpath("//div[@id='chatter']/div[2]/div")).getText());


        //edit
        driver.findElement(By.cssSelector("p.chatter_edit_btn")).click();

        driver.switchTo().frame(driver.findElement(By.cssSelector(".mce-edit-area.mce-container.mce-panel.mce-stack-layout-item.mce-last iframe")));
        driver.findElement(By.id("tinymce")).clear();
        driver.findElement(By.id("tinymce")).sendKeys("Teste : teste editado!");
        driver.switchTo().defaultContent();

        //driver.findElement(By.cssSelector("btn.btn-success pull-right update_chatter_edit"));
        driver.findElement(By.xpath("//div[@id='chatter']/div[4]/div/div/div/ul/li/span/div[4]/div[3]/button")).click();
        //fim edit


        driver.findElement(By.cssSelector("i.chatter-back")).click();
        driver.findElement(By.linkText("Automatizados")).click();
        driver.findElement(By.id("delete-button")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("button.btn.btn-danger")).click();
    }

    @Test
    public void testTestCaseAdmin14() throws Exception {
        driver.get("http://159.65.29.212/login");
        driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("password")).sendKeys("password_tp18_p");
        driver.findElement(By.id("email")).clear();
        driver.findElement(By.id("email")).sendKeys("profissionaldesaude@mail.com");
        driver.findElement(By.cssSelector("button.btn.btn-primary")).click();
        driver.findElement(By.linkText("Fórum")).click();
        driver.findElement(By.id("new_category_btn")).click();

        driver.findElement(By.name("name")).sendKeys("Automatizados");
        Thread.sleep(2000);
        driver.findElement(By.id("submit_category")).click();
        driver.findElement(By.linkText("Automatizados")).click();
        driver.findElement(By.id("new_discussion_btn")).click();
        driver.findElement(By.id("title")).clear();
        driver.findElement(By.id("title")).sendKeys("Teste");

        driver.switchTo().frame(driver.findElement(By.id("body_ifr")));
        driver.findElement(By.id("tinymce")).sendKeys("TesteTEEEEEEEEESTE sadasdsad");
        driver.switchTo().defaultContent();

        driver.findElement(By.id("submit_discussion")).click();
        assertEquals("Nova Discussão criada com Sucesso.", driver.findElement(By.xpath("//div[@id='chatter']/div[2]/div")).getText());

        //eliminar discussao
        driver.findElement(By.cssSelector("p.chatter_delete_btn")).click();
        Thread.sleep(2000);

        //não consigo aceder a este botao
        driver.findElement(By.cssSelector("button.btn.btn-sm.btn-danger.pull-right.delete_response")).click();



        try {
            assertTrue("A dicussão não foi eliminada com sucesso",driver.findElement(By.cssSelector("BODY")).getText().contains("Resposta e Discussão Eliminados com Sucesso."));
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }

        //eliminar categoria
        driver.findElement(By.linkText("Automatizados")).click();
        driver.findElement(By.id("delete-button")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("button.btn.btn-danger")).click();
    }


    @Test
    public void testCaseAdmin15() throws Exception {
        driver.get("http://159.65.29.212/login");
        driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("password")).sendKeys("password_tp18_p");
        driver.findElement(By.id("email")).clear();
        driver.findElement(By.id("email")).sendKeys("profissionaldesaude@mail.com");
        driver.findElement(By.cssSelector("button.btn.btn-primary")).click();
        driver.findElement(By.linkText("Fórum")).click();


        driver.findElement(By.id("new_category_btn")).click();
        driver.findElement(By.name("name")).sendKeys("Automatizados");
        Thread.sleep(2000);
        driver.findElement(By.id("submit_category")).click();


        driver.findElement(By.id("new_category_btn")).click();
        new Select(driver.findElement(By.cssSelector("#new_category > #chatter_form_editor > div.row > div.col-md-4 > #chatter_category_id"))).selectByVisibleText("Automatizados");
        driver.findElement(By.name("name")).clear();
        driver.findElement(By.name("name")).sendKeys("TesteAuto05");
        Thread.sleep(2000);
        driver.findElement(By.id("submit_category")).click();


        driver.findElement(By.linkText("TesteAuto05")).click();
        driver.findElement(By.id("delete-button")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("button.btn.btn-danger")).click();
        //driver.findElement(By.id("button-confirm-delete"));


        try {
            assertFalse("Ao tentar apagar uma sub-categoria esta não foi eliminada com sucesso",driver.findElement(By.cssSelector("BODY")).getText().contains("TesteAuto05"));
            //assertFalse("Ao tentar apagar uma sub-categoria esta não foi eliminada com sucesso",driver.findElement(By.xpath("BODY")).getText().contains("TesteAuto05"));
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }

        driver.findElement(By.linkText("Automatizados")).click();
        driver.findElement(By.id("delete-button")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("button.btn.btn-danger")).click();


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
