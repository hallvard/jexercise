package oving5.person;

import no.hal.jex.runtime.JExercise;
import junit.framework.Test;
import junit.framework.TestSuite;

@JExercise(
		tests="PersonTest",
		description="Runs PersonTest"
		)
public class AllTests {

	public static Test suite() {
		TestSuite suite = new TestSuite(AllTests.class.getName());
		//$JUnit-BEGIN$
		suite.addTestSuite(PersonTest.class);
		//$JUnit-END$
		return suite;
	}

}
