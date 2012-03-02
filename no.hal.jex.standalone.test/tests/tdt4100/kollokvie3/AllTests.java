package tdt4100.kollokvie3;

import junit.framework.Test;
import junit.framework.TestSuite;
import no.hal.jex.swing.JexExercisePanel;

public class AllTests extends TestSuite {
   
   public static Test suite() {
      TestSuite suite = new TestSuite("AllTests");
      suite.addTestSuite(FractionTest.class);
      return suite;
   }
   
	public static void main(String[] args) {
		JexExercisePanel.main(new String[]{AllTests.class.getName()});
	}
}
