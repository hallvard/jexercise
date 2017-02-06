package no.hal.learning.exercise.junit.adapter;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.util.EList;
import org.eclipse.jdt.junit.JUnitCore;
import org.eclipse.jdt.junit.TestRunListener;
import org.eclipse.jdt.junit.model.ITestCaseElement;
import org.eclipse.jdt.junit.model.ITestElement;
import org.eclipse.jdt.junit.model.ITestElement.Result;
import org.eclipse.jdt.junit.model.ITestRunSession;
import org.eclipse.jdt.junit.model.ITestSuiteElement;
import org.eclipse.swt.widgets.Composite;

import no.hal.emf.ui.parts.adapters.EObjectUIAdapter;
import no.hal.learning.exercise.TaskProposal;
import no.hal.learning.exercise.junit.JunitFactory;
import no.hal.learning.exercise.junit.JunitPackage;
import no.hal.learning.exercise.junit.JunitTestAnswer;
import no.hal.learning.exercise.junit.JunitTestEvent;
import no.hal.learning.exercise.views.adapters.TaskAttemptsUIAdapter;
import no.hal.learning.exercise.views.adapters.TaskCounterUIAdapter;
import no.hal.learning.exercise.views.adapters.TaskProgressUIAdapter;
import no.hal.learning.exercise.views.adapters.TaskProposalUIAdapter;

public class JunitTaskProposalAdapter extends TaskProposalUIAdapter<JunitTestAnswer> {

	public JunitTaskProposalAdapter(TaskProposal<JunitTestAnswer> proposal) {
		super(proposal);
	}

	@Override
	public EObjectUIAdapter<?, ?>[] createSubAdapters() {
		return new EObjectUIAdapter<?, ?>[] {
			new TaskProgressUIAdapter<TaskProposal<?>>(getProposal()),
			new TaskCounterUIAdapter(getProposal(), JunitPackage.eINSTANCE.getJunitTestEvent_SuccessCount(), "Success: %s", true),
			new TaskCounterUIAdapter(getProposal(), JunitPackage.eINSTANCE.getJunitTestEvent_FailureCount(), "Failure: %s", false),
			new TaskCounterUIAdapter(getProposal(), JunitPackage.eINSTANCE.getJunitTestEvent_ErrorCount(), "Error: %s", false),
			new TaskAttemptsUIAdapter(getProposal())
		};
	}
	
	private JunitSessionListener listener;
	
	@Override
	public Composite initView(final Composite parent) {
		if (! getAdapterHelper().isReadOnly(this)) {
			JUnitCore.addTestRunListener(listener = new JunitSessionListener());
		}
		return super.initView(parent);
	}

	@Override
	public void dispose() {
		if (listener != null) {
			JUnitCore.removeTestRunListener(listener);
		}
		super.dispose();
	}
	
	//

	protected class JunitSessionListener extends TestRunListener implements Runnable {
		
		@Override
		public void sessionStarted(ITestRunSession session) {
			if (! acceptTestRunSession(session)) {
				return;
			}
			taskEvent = null;
			successCount = failureCount = errorCount = 0;
			successes = new ArrayList<String>();
			failures = new ArrayList<String>();
			errors = new ArrayList<String>();
		}

		protected boolean acceptTestRunSession(ITestRunSession session) {
			String testRunName = getProposal().getAnswer().getTestRunName();
			for (ITestElement testElement : session.getChildren()) {
				String testClassName = null;
				if (testElement instanceof ITestCaseElement) {
					testClassName = ((ITestCaseElement) testElement).getTestClassName();
				} else if (testElement instanceof ITestSuiteElement) {
					testClassName = ((ITestSuiteElement) testElement).getSuiteTypeName();
				}
				if (acceptQName(testRunName, testClassName, true)) {
					return true;
				}
			}
			String sessionName = session.getTestRunName();
			return acceptQName(testRunName, sessionName, true);
		}

		private int successCount = 0, failureCount = 0, errorCount = 0;
		private Collection<String> successes, failures, errors;

		@Override
		public void testCaseFinished(ITestCaseElement testCaseElement) {
			if (! acceptTestRunSession(testCaseElement.getTestRunSession())) {
				return;
			}
			Result testResult = testCaseElement.getTestResult(true);
			EList<String> methodNames = getProposal().getAnswer().getMethodNames();
			String testMethodName = testCaseElement.getTestMethodName();
			if (methodNames.size() == 0 || methodNames.contains(testMethodName)) {
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
		}

		private JunitTestEvent taskEvent;

		@Override
		public void sessionFinished(ITestRunSession session) {
			if (! acceptTestRunSession(session)) {
				return;
			}
			taskEvent = JunitFactory.eINSTANCE.createJunitTestEvent();
			taskEvent.setTimestamp(getTimestamp());
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
			int testCount = getProposal().getAnswer().getMethodNames().size();
			if (testCount == 0) {
				testCount = successCount + failureCount + errorCount;
			}
			taskEvent.setCompletion(((double) successCount) / testCount);

			successCount = failureCount = errorCount = 0;
			successes = failures = errors = null;

			updateProposal();
		}
		
		private void updateProposal() {
			asyncExec(this);
		}

		@Override
		public void run() {
			if (taskEvent != null) {
				getProposal().setCompletion(taskEvent.getCompletion());
				getProposal().getAttempts().add(taskEvent);
			}
		}
	}
}
