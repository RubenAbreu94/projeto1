import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import junit.textui.TestRunner;
import org.junit.runner.JUnitCore;
import ru.yandex.qatools.allure.junit.AllureRunListener;

public class TestSuitRemembers {


    public static TestSuitRemembers suite() {
        TestSuite suite = new TestSuite();
        suite.addTestSuite(testCaseRememberPassword1.class);
        suite.addTestSuite(testCaseRememberPassword2.class);
        suite.addTestSuite(testCaseRememberPassword3.class);
        suite.addTestSuite(testCaseRememberPassword4.class);
        suite.addTestSuite(testCaseRememberPassword5.class);
        suite.addTestSuite(testCaseRememberPassword6.class);


        return suite();
    }

    public static void main(String[] args) {
        JUnitCore runner = new JUnitCore();
        runner.addListener(new AllureRunListener());
        runner.run((Test) suite());

    }
}
