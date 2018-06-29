import junit.framework.Test;
import junit.framework.TestSuite;
import org.junit.runner.JUnitCore;
import ru.yandex.qatools.allure.junit.AllureRunListener;

public class TestSuiteGeral {
    public static Test suite() {
        TestSuite suite = new TestSuite();

        //logins
        suite.addTestSuite(testCaseLogin0.class);
        suite.addTestSuite(testCaseLogin1.class);
        suite.addTestSuite(testCaseLogin2.class);
        suite.addTestSuite(testCaseLogin4.class);
        suite.addTestSuite(testCaseLogin5.class);
        suite.addTestSuite(testCaseLogin5.class);
        suite.addTestSuite(testCaseLogin5.class);
        suite.addTestSuite(testCaseLogin5.class);
        suite.addTestSuite(testCaseLogin5.class);
        suite.addTestSuite(testCaseLogin5.class);
        suite.addTestSuite(testCaseLogin5.class);
        suite.addTestSuite(testCaseLogin5.class);
        suite.addTestSuite(testCaseLogin5.class);
        suite.addTestSuite(testCaseAdmin0.class);
        suite.addTestSuite(testCaseOrtografia0.class);


        //logouts
        suite.addTestSuite(testCaseLogout0.class);
        suite.addTestSuite(testCaseLogout2.class);
        suite.addTestSuite(testCaseLogout3.class);

        //remember passwords
        suite.addTestSuite(testCaseRememberPassword1.class);
        suite.addTestSuite(testCaseRememberPassword2.class);
        suite.addTestSuite(testCaseRememberPassword3.class);
        suite.addTestSuite(testCaseRememberPassword4.class);
        suite.addTestSuite(testCaseRememberPassword5.class);
        suite.addTestSuite(testCaseRememberPassword6.class);


        //profissional de saude
        suite.addTestSuite(TestCaseProfissionalSaude1.class);
        suite.addTestSuite(testCaseProfissionalSaude2.class);
        suite.addTestSuite(testCaseProfissionalSaude3.class);
        suite.addTestSuite(testCaseProfissionalSaude4.class);
        suite.addTestSuite(testCaseProfissionalSaude5.class);
        suite.addTestSuite(testCaseProfissionalSaude6.class);
        suite.addTestSuite(testCaseProfissionalSaude7.class);
        suite.addTestSuite(testCaseProfissionalSaude8.class);
        suite.addTestSuite(testCaseProfissionalSaude9.class);
        suite.addTestSuite(testCaseProfissionalSaude10.class);
        suite.addTestSuite(testCaseProfissionalSaude11.class);
        suite.addTestSuite(testCaseProfissionalSaude12.class);
        suite.addTestSuite(testCaseProfissionalSaude13.class);
        suite.addTestSuite(testCaseProfissionalSaude14.class);
        suite.addTestSuite(testCaseProfissionalSaude15.class);
        suite.addTestSuite(testCaseProfissionalSaude16.class);
        suite.addTestSuite(testCaseProfissionalSaude17.class);
        suite.addTestSuite(testCaseProfissionalSaude18.class);
        suite.addTestSuite(testCaseProfissionalSaude19.class);
        suite.addTestSuite(testCaseProfissionalSaude20.class);
        suite.addTestSuite(testCaseProfissionalSaude22.class);
        suite.addTestSuite(testCaseProfissionalSaude23.class);
        suite.addTestSuite(testCaseProfissionalSaude24.class);
        suite.addTestSuite(testCaseProfissionalSaude25.class);
        suite.addTestSuite(testCaseProfissionalSaude26.class);
        suite.addTestSuite(testCaseProfissionalSaude27.class);
        suite.addTestSuite(testCaseProfissionalSaude28.class);
        suite.addTestSuite(testCaseProfissionalSaude29.class);

        //admins
        suite.addTestSuite(testCaseAdmin0.class);
        suite.addTestSuite(testCaseAdmin1.class);
        suite.addTestSuite(testCaseAdmin2.class);
        suite.addTestSuite(testCaseAdmin3.class);
        suite.addTestSuite(testCaseAdmin4.class);
        suite.addTestSuite(testCaseAdmin5.class);
        suite.addTestSuite(testCaseAdmin6.class);
        suite.addTestSuite(testCaseAdmin7.class);
        suite.addTestSuite(testCaseAdmin8.class);
        //suite.addTestSuite(testCaseAdmin9.class);
        //suite.addTestSuite(testCaseAdmin10.class);
        suite.addTestSuite(testCaseAdmin11.class);
        suite.addTestSuite(testCaseAdmin12.class);
        suite.addTestSuite(TestCaseAdmin13.class);
        suite.addTestSuite(TestCaseAdmin14.class);
        suite.addTestSuite(TestCaseAdmin15.class);

        return suite;
    }

    public static void main(String[] args) {
        JUnitCore runner = new JUnitCore();
        runner.addListener(new AllureRunListener());
        runner.run(suite());

    }
}
