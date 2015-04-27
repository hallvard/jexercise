package interfaces;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class CardContainerSuite extends TestCase {

	public static Test suite() {
		TestSuite suite = new TestSuite(CardContainerSuite.class.getName());
		//$JUnit-BEGIN$
		suite.addTestSuite(CardDeckTest.class);
		suite.addTestSuite(CardHandTest.class);
		//$JUnit-END$
		return suite;
	}
}
