package mycollection;

import junit.framework.Test;
import junit.framework.TestSuite;

public class AllTests {

	public static Test suite() {
		TestSuite suite = new TestSuite(AllTests.class.getName());
		//$JUnit-BEGIN$
		suite.addTestSuite(MyArrayListTest.class);
		suite.addTestSuite(MyListIteratorTest.class);
		//$JUnit-END$
		return suite;
	}

//	public static void main(String[] args) {
//		no.hal.jex.standalone.JexStandalone.main(AllTests.class);
//	}
}
