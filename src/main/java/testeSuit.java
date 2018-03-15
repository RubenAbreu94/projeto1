

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;


public class testeSuit {

    public static Test suite() {
        TestSuite suite = new TestSuite();
        suite.addTestSuite(testCaseLogin0.class);
        suite.addTestSuite(testCaseLogin1.class);
        suite.addTestSuite(testCaseLogin2.class);
        suite.addTestSuite(testCaseLogin4.class);
        suite.addTestSuite(testCaseLogin5.class);
        suite.addTestSuite(testCaseFuncAdmin0.class);
        suite.addTestSuite(testCaseLogout0.class);
        suite.addTestSuite(testCaseOrtografia0.class);

        return suite;
    }

    public static void main(String[] args) {
        junit.textui.TestRunner.run(suite());
    }
}
