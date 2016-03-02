package no.hal.learning.exercise.junit.adapter;

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
			new TaskCounterUIAdapter(getProposal(), JunitPackage.eINSTANCE.getJunitTestEvent_SuccessCount(), "Success: %s"),
			new TaskCounterUIAdapter(getProposal(), JunitPackage.eINSTANCE.getJunitTestEvent_FailureCount(), "Failure: %s"),
			new TaskCounterUIAdapter(getProposal(), JunitPackage.eINSTANCE.getJunitTestEvent_ErrorCount(), "Error: %s"),
			new TaskAttemptsUIAdapter(getProposal())
		};
	}
	
	private JunitSessionListener listener;
	
	@Override
	public Composite initView(final Composite parent) {
		JUnitCore.addTestRunListener(listener = new JunitSessionListener());
		return super.initView(parent);
	}

	@Override
	public void dispose() {
		JUnitCore.removeTestRunListener(listener);
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
				if (isEmpty(testRunName) || (testClassName != null && testClassName.equals(testRunName))) {
					return true;
				}
			}
			String sessionName = session.getTestRunName();
			return isEmpty(testRunName) || sessionName.equals(testRunName);
		}

		private int successCount = 0, failureCount = 0, errorCount = 0;
		
		@Override
		public void testCaseFinished(ITestCaseElement testCaseElement) {
			if (! acceptTestRunSession(testCaseElement.getTestRunSession())) {
				return;
			}
			Result testResult = testCaseElement.getTestResult(true);
			EList<String> methodNames = getProposal().getAnswer().getMethodNames();
			if (methodNames.size() == 0 || methodNames.contains(testCaseElement.getTestMethodName())) {
				if (testResult == Result.OK) {
					successCount++;
				} else if (testResult == Result.FAILURE) {
					failureCount++;
				} else if (testResult == Result.ERROR) {
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
			taskEvent.setSuccessCount(this.successCount);
			taskEvent.setFailureCount(this.failureCount);
			taskEvent.setErrorCount(this.errorCount);
			int testCount = getProposal().getAnswer().getMethodNames().size();
			if (testCount == 0) {
				testCount = successCount + failureCount + errorCount;
			}
			taskEvent.setCompletion(((double) successCount) / testCount);

			successCount = failureCount = errorCount = 0;
			updateProposal();
		}
		
		private void updateProposal() {
			asyncExec(this);
		}

		@Override
		public void run() {
			if (taskEvent != null) {
				getProposal().getAttempts().add(taskEvent);
				getProposal().setCompletion(taskEvent.getCompletion());
			}
		}
	}
}
