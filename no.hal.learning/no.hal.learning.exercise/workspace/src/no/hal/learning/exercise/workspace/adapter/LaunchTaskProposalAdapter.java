package no.hal.learning.exercise.workspace.adapter;

import no.hal.emf.ui.parts.adapters.EObjectUIAdapter;
import no.hal.learning.exercise.TaskProposal;
import no.hal.learning.exercise.views.adapters.TaskAttemptsUIAdapter;
import no.hal.learning.exercise.views.adapters.TaskCounterUIAdapter;
import no.hal.learning.exercise.views.adapters.TaskProposalUIAdapter;
import no.hal.learning.exercise.workspace.LaunchAnswer;
import no.hal.learning.exercise.workspace.WorkspacePackage;

public class LaunchTaskProposalAdapter<T extends LaunchAnswer> extends TaskProposalUIAdapter<T> {

	public LaunchTaskProposalAdapter(TaskProposal<T> proposal) {
		super(proposal);
	}

	@Override
	public EObjectUIAdapter<?, ?>[] createSubAdapters() {
		return new EObjectUIAdapter<?, ?>[] {
			new TaskCounterUIAdapter(getProposal(), WorkspacePackage.eINSTANCE.getLaunchEvent_ConsoleOutputSizeMeasure(), "Output size: %2s", null, true),
			new TaskAttemptsUIAdapter(getProposal())
		};
	}
}
