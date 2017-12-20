package misc;

import junit.framework.Test;
import junit.framework.TestSuite;

public class AllTests {
   
   public static Test suite() {
      TestSuite suite = new TestSuite("AllTests");
      suite.addTestSuite(FractionTest.class);
      return suite;
   }
   
	public static void main(String[] args) {
		no.hal.jex.standalone.JexStandalone.main(AllTests.class);
	}
}
