import junit.framework.Test;
import junit.framework.TestSuite;
import org.junit.runner.JUnitCore;
import ru.yandex.qatools.allure.junit.AllureRunListener;

public class TestSuiteLogout {
    public static Test suite() {
        TestSuite suite = new TestSuite();

        //logouts
        suite.addTestSuite(testCaseLogout0.class);
        suite.addTestSuite(testCaseLogout2.class);
        suite.addTestSuite(testCaseLogout3.class);


        return suite;
    }

    public static void main(String[] args) {
        JUnitCore runner = new JUnitCore();
        runner.addListener(new AllureRunListener());
        runner.run(suite());

    }
}


