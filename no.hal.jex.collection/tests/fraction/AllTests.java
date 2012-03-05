package fraction;

import junit.framework.Test;
import junit.framework.TestSuite;
import no.hal.jex.standalone.JexStandalone;
import tdt4100.kollokvie3.FractionTest;

public class AllTests extends TestSuite {
   
   public static Test suite() {
      TestSuite suite = new TestSuite("AllTests");
      suite.addTestSuite(FractionTest.class);
      return suite;
   }
   
	public static void main(String[] args) {
		JexStandalone.main(AllTests.class);
	}
}
