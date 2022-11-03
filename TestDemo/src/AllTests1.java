import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class AllTests1 extends TestCase {

	public static Test suite() {
		TestSuite suite = new TestSuite(AllTests1.class.getName());
		//$JUnit-BEGIN$
		suite.addTestSuite(PallindromeTest.class);
		suite.addTestSuite(SquareTest.class);
		//$JUnit-END$
		return suite;
	}

}
