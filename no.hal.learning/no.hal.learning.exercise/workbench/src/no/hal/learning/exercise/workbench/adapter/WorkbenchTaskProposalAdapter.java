package no.hal.learning.exercise.workbench.adapter;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PlatformUI;

import no.hal.emf.ui.parts.adapters.EObjectUIAdapter;
import no.hal.learning.exercise.ExerciseFactory;
import no.hal.learning.exercise.TaskEvent;
import no.hal.learning.exercise.TaskProposal;
import no.hal.learning.exercise.views.adapters.TaskAttemptsUIAdapter;
import no.hal.learning.exercise.views.adapters.TaskProposalUIAdapter;
import no.hal.learning.exercise.workbench.WorkbenchTaskAnswer;

public abstract class WorkbenchTaskProposalAdapter<A extends WorkbenchTaskAnswer> extends TaskProposalUIAdapter<A> {

	public WorkbenchTaskProposalAdapter(TaskProposal<A> proposal) {
		super(proposal);
	}

	@Override
	protected EObjectUIAdapter<?, ?>[] createSubAdapters() {
		return new EObjectUIAdapter<?, ?>[] {
			new TaskAttemptsUIAdapter(getProposal())
		};
	}

	@Override
	public Composite initView(final Composite parent) {
		if (! getAdapterHelper().isReadOnly(this)) {
			addWorkbenchListeners(PlatformUI.getWorkbench());
		}
		return super.initView(parent);
	}
	
	@Override
	public void dispose() {
		if (! getAdapterHelper().isReadOnly(this)) {
			removeWorkbenchListeners(PlatformUI.getWorkbench());
		}
		super.dispose();
	}

	protected abstract void addWorkbenchListeners(IWorkbench workbench);
	protected abstract void removeWorkbenchListeners(IWorkbench workbench);

	//

	protected class AbstractWorkbenchTaskListener implements Runnable {

		private long timestamp = -1;
		private int performedCount = 0;
		
		protected boolean taskPerformed(String id, String action) {
			String answerElement = getProposal().getAnswer().getElementId();
			String answerAction = getProposal().getAnswer().getAction();
			boolean performed = (isEmpty(answerElement) || answerElement.equals(id)) && (isEmpty(answerAction) || answerAction.equals(action));
			if (performed) {
				timestamp = getTimestamp();
				performedCount++;
				updateProposal();
			}
			return performed;
		}

		protected void updateProposal() {
			asyncExec(this);
		}

		@Override
		public void run() {
			TaskEvent taskEvent = ExerciseFactory.eINSTANCE.createTaskEvent();
			taskEvent.setTimestamp(this.timestamp);
			
			double completion = -1;
			double requiredCount = (double) getProposal().getAnswer().getRequiredCount();
			if (requiredCount > 0) {
				completion = this.performedCount / requiredCount;
				taskEvent.setCompletion(completion);
			}
			getProposal().getAttempts().add(taskEvent);
			getProposal().setPerformedCount(this.performedCount);
			getProposal().setCompletion(completion);
		}
	}
}
