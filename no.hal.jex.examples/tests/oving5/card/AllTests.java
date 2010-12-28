package oving5.card;

import junit.framework.Test;
import junit.framework.TestSuite;

public class AllTests {

	public static Test suite() {
		TestSuite suite = new TestSuite(AllTests.class.getName());
		//$JUnit-BEGIN$
		suite.addTestSuite(CardDeckTest.class);
		suite.addTestSuite(CardTest.class);
		//$JUnit-END$
		return suite;
	}

}
