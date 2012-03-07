package lists;

import junit.framework.Test;
import junit.framework.TestSuite;
import no.hal.jex.standalone.JexStandalone;

public class AllTests {

	public static Test suite() {
		TestSuite suite = new TestSuite("AllTests");
		suite.addTestSuite(ListMethods1Test.class);
		return suite;
	}
	
	public static void main(String[] args) {
		JexStandalone.main(AllTests.class);
	}
}
