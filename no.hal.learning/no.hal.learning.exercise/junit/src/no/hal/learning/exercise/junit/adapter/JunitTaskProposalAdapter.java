package no.hal.learning.exercise.junit.adapter;

import no.hal.emf.ui.parts.adapters.EObjectUIAdapter;
import no.hal.learning.exercise.TaskProposal;
import no.hal.learning.exercise.junit.JunitPackage;
import no.hal.learning.exercise.junit.JunitTestAnswer;
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
}
