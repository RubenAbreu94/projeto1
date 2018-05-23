import junit.framework.Test;
import junit.framework.TestSuite;
import org.junit.runner.JUnitCore;
import ru.yandex.qatools.allure.junit.AllureRunListener;

public class TestSuiteDeAdmins {
    public static Test suite() {
        TestSuite suite = new TestSuite();

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
        suite.addTestSuite(testCaseAdmin9.class);
        suite.addTestSuite(testCaseAdmin10.class);
        suite.addTestSuite(testCaseAdmin11.class);
        suite.addTestSuite(testCaseAdmin12.class);
        suite.addTestSuite(TestCaseAdmin13.class);
        suite.addTestSuite(TestCaseAdmin14.class);




        return suite;
    }

    public static void main(String[] args) {
        JUnitCore runner = new JUnitCore();
        runner.addListener(new AllureRunListener());
        runner.run(suite());

    }
}
