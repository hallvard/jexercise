package no.hal.learning.exercise.workbench.adapter;

import org.eclipse.ui.IPerspectiveDescriptor;
import org.eclipse.ui.IPerspectiveListener;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;

import no.hal.learning.exercise.TaskProposal;
import no.hal.learning.exercise.workbench.PerspectiveTaskAnswer;

public class PerspectiveTaskProposalAdapter extends WorkbenchTaskProposalAdapter<PerspectiveTaskAnswer> {

	public PerspectiveTaskProposalAdapter(TaskProposal<PerspectiveTaskAnswer> proposal) {
		super(proposal);
	}

	private PerspectiveActivationListener listener;

	@Override
	protected void addWorkbenchListeners(IWorkbench workbench) {
		workbench.getActiveWorkbenchWindow().addPerspectiveListener(listener = new PerspectiveActivationListener());
	}
	@Override
	protected void removeWorkbenchListeners(IWorkbench workbench) {
		if (listener != null) {
			workbench.getActiveWorkbenchWindow().removePerspectiveListener(listener);
		}
	}

	//

	protected class PerspectiveActivationListener extends AbstractWorkbenchTaskListener implements IPerspectiveListener {

		private String getId(IWorkbenchPage page, IPerspectiveDescriptor perspective) {
			return perspective.getId();
		}

		@Override
		public void perspectiveActivated(IWorkbenchPage page, IPerspectiveDescriptor perspective) {
			taskPerformed(getId(page, perspective), "activated");
		}

		@Override
		public void perspectiveChanged(IWorkbenchPage page, IPerspectiveDescriptor perspective, String changeId) {
			taskPerformed(getId(page, perspective), "changed");
		}
	}
}
