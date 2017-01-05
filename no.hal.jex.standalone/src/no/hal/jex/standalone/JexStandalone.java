package no.hal.jex.standalone;

import java.lang.reflect.Method;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.textui.TestRunner;

public class JexStandalone {

	public static void main(Class<?> testClass) {
		if (TestCase.class.isAssignableFrom(testClass)) {
			TestRunner.run((Class<? extends TestCase>) testClass);
		} else {
			Test test = testFor(testClass);
			if (test != null) {
				TestRunner.run(test);
			} else {
				System.err.println("No test for " + testClass);
			}
		}
	}
	
	private static Test testFor(Class<?> testClass) {
		try {
			Method suiteMethod = testClass.getMethod("suite", new Class[0]);
			if (suiteMethod != null) {
				return (Test) suiteMethod.invoke(null, new Object[0]);
			}
		} catch (Exception e) {
		}
		return null;
	}
}
