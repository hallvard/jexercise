package no.hal.learning.exercise.workbench.adapter;

import org.eclipse.ui.IPartListener;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPart;

import no.hal.learning.exercise.TaskProposal;
import no.hal.learning.exercise.workbench.PartTaskAnswer;

public class PartTaskProposalAdapter extends WorkbenchTaskProposalAdapter<PartTaskAnswer> {

	public PartTaskProposalAdapter(TaskProposal<PartTaskAnswer> proposal) {
		super(proposal);
	}

	private PartTaskListener listener;
	
	@Override
	protected void addWorkbenchListeners(IWorkbench workbench) {
		workbench.getActiveWorkbenchWindow().getPartService().addPartListener(listener = new PartTaskListener());
	}
	@Override
	protected void removeWorkbenchListeners(IWorkbench workbench) {
		workbench.getActiveWorkbenchWindow().getPartService().removePartListener(listener);
	}

	//

	protected class PartTaskListener extends AbstractWorkbenchTaskListener implements IPartListener {

		private String getId(IWorkbenchPart part) {
			return part.getSite().getId();
		}
		
		@Override
		public void partActivated(IWorkbenchPart part) {
			taskPerformed(getId(part), "activated");
		}

		@Override
		public void partBroughtToTop(IWorkbenchPart part) {
			taskPerformed(getId(part), "broughtToTop");
		}

		@Override
		public void partClosed(IWorkbenchPart part) {
			taskPerformed(getId(part), "closed");
		}

		@Override
		public void partDeactivated(IWorkbenchPart part) {
			taskPerformed(getId(part), "deactivated");
		}

		@Override
		public void partOpened(IWorkbenchPart part) {
			taskPerformed(getId(part), "opened");
		}
	}
}
