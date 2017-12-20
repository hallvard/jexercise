package no.hal.learning.exercise.workbench.adapter;

import no.hal.emf.ui.parts.adapters.EObjectUIAdapter;
import no.hal.learning.exercise.TaskProposal;
import no.hal.learning.exercise.views.adapters.TaskAttemptsUIAdapter;
import no.hal.learning.exercise.views.adapters.TaskProposalUIAdapter;
import no.hal.learning.exercise.workbench.WorkbenchTaskAnswer;

public class WorkbenchTaskProposalAdapter<A extends WorkbenchTaskAnswer> extends TaskProposalUIAdapter<A> {

	public WorkbenchTaskProposalAdapter(TaskProposal<A> proposal) {
		super(proposal);
	}

	@Override
	protected EObjectUIAdapter<?, ?>[] createSubAdapters() {
		return new EObjectUIAdapter<?, ?>[] {
			new TaskAttemptsUIAdapter(getProposal())
		};
	}
}
