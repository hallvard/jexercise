package no.hal.learning.exercise.views;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.swt.widgets.Composite;

import no.hal.emf.ui.parts.adapters.EObjectViewerAdapter;
import no.hal.emf.ui.parts.adapters.EObjectViewerAdapterImpl;
import no.hal.learning.exercise.ExercisePackage;
import no.hal.learning.exercise.ExerciseProposals;
import no.hal.learning.exercise.Proposal;
import no.hal.learning.exercise.TaskProposal;

public abstract class AbstractTaskProposalViewerAdapter extends EObjectViewerAdapterImpl<ExerciseProposals, Composite> implements EObjectViewerAdapter<ExerciseProposals, Composite> {

	protected List<TaskProposal<?>> taskProposals = new ArrayList<TaskProposal<?>>();

	public AbstractTaskProposalViewerAdapter(ExerciseProposals proposals) {
		super(proposals);
		for (Proposal<?> proposal : proposals.getAllProposals()) {
			if (proposal instanceof TaskProposal<?>) {
				addProposal((TaskProposal<?>) proposal);				
			}
		}
	}

	public void addProposal(TaskProposal<?> proposal) {
		taskProposals.add(proposal);
	}

	@Override
	protected boolean isChangeNotification(Notification notification) {
		return super.isChangeNotification(notification) || (notification.getNotifier() instanceof TaskProposal<?> && notification.getFeature() == ExercisePackage.eINSTANCE.getTaskProposal_Attempts());
	}

	@Override
	public void setTarget(Notifier newTarget) {
		super.setTarget(newTarget);
		if (newTarget == eObject) {
			for (TaskProposal<?> taskProposal : taskProposals) {
				taskProposal.eAdapters().add(this);
			}
		}
	}
}
