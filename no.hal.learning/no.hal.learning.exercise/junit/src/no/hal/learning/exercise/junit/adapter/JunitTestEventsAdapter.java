package no.hal.learning.exercise.junit.adapter;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.jdt.junit.JUnitCore;
import org.eclipse.jdt.junit.TestRunListener;
import org.eclipse.jdt.junit.model.ITestCaseElement;
import org.eclipse.jdt.junit.model.ITestElement;
import org.eclipse.jdt.junit.model.ITestElement.Result;
import org.eclipse.jdt.junit.model.ITestRunSession;
import org.eclipse.jdt.junit.model.ITestSuiteElement;

import no.hal.learning.exercise.TaskAnswer;
import no.hal.learning.exercise.junit.JunitFactory;
import no.hal.learning.exercise.junit.JunitTestAnswer;
import no.hal.learning.exercise.junit.JunitTestEvent;
import no.hal.learning.exercise.plugin.AbstractTaskEventsAdapter;

public class JunitTestEventsAdapter extends AbstractTaskEventsAdapter<JunitTestAnswer> {

	@Override
	public void registerListeners() {
		JUnitCore.addTestRunListener(listener);
	}

	@Override
	public void unregisterListeners() {
		JUnitCore.removeTestRunListener(listener);
	}

	@Override
	public boolean supportsTaskAnswer(TaskAnswer type) {
		return supportsTaskAnswer(type, JunitTestAnswer.class);
	}
	
	//

	private TestRunListener listener =  new TestRunListener() {
		
		@Override
		public void sessionStarted(ITestRunSession session) {
			if (acceptTestRunSession(session) == null) {
				return;
			}
			taskEvent = null;
			successCount = failureCount = errorCount = 0;
			successes = new ArrayList<String>();
			failures = new ArrayList<String>();
			errors = new ArrayList<String>();
		}
	
		protected String acceptTestRunSession(ITestRunSession session) {
			for (ITestElement testElement : session.getChildren()) {
				String testClassName = null;
				if (testElement instanceof ITestCaseElement) {
					testClassName = ((ITestCaseElement) testElement).getTestClassName();
				} else if (testElement instanceof ITestSuiteElement) {
					testClassName = ((ITestSuiteElement) testElement).getSuiteTypeName();
				}
				return testClassName;
			}
			return session.getTestRunName();
		}
	
		private int successCount = 0, failureCount = 0, errorCount = 0;
		private Collection<String> successes, failures, errors;
	
		@Override
		public void testCaseFinished(ITestCaseElement testCaseElement) {
			if (acceptTestRunSession(testCaseElement.getTestRunSession()) == null) {
				return;
			}
			Result testResult = testCaseElement.getTestResult(true);
			String testMethodName = testCaseElement.getTestMethodName();
			if (testResult == Result.OK) {
				if (successes != null) {
					successes.add(testMethodName);
				}
				successCount++;
			} else if (testResult == Result.FAILURE) {
				if (failures != null) {
					failures.add(testMethodName);
				}
				failureCount++;
			} else if (testResult == Result.ERROR) {
				if (errors != null) {
					errors.add(testMethodName);
				}
				errorCount++;
			}
		}
	
		private JunitTestEvent taskEvent;
	
		@Override
		public void sessionFinished(ITestRunSession session) {
			String testRunName = acceptTestRunSession(session);
			if (testRunName == null) {
				return;
			}
			taskEvent = JunitFactory.eINSTANCE.createJunitTestEvent();
			taskEvent.setTimestamp(getTimestamp());
			taskEvent.setTestRunName(testRunName);
			if (successes != null) {
				taskEvent.getSuccessTests().addAll(successes);
			}
			taskEvent.setSuccessCount(this.successCount);
			if (failures != null) {
				taskEvent.getFailureTests().addAll(failures);
			}
			taskEvent.setFailureCount(this.failureCount);
			if (errors != null) {
				taskEvent.getErrorTests().addAll(errors);
			}
			taskEvent.setErrorCount(this.errorCount);
			int testCount = successCount + failureCount + errorCount;
			taskEvent.setCompletion(((double) successCount) / testCount);
	
			successCount = failureCount = errorCount = 0;
			successes = failures = errors = null;
	
			provideTaskEvent(taskEvent);
		}
	};
}
