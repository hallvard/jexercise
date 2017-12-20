package no.hal.learning.exercise.workspace.adapter;

import no.hal.emf.ui.parts.adapters.EObjectUIAdapter;
import no.hal.learning.exercise.StringEditAnswer;
import no.hal.learning.exercise.TaskProposal;
import no.hal.learning.exercise.views.adapters.AbstractSourceEditTaskProposalAdapter;
import no.hal.learning.exercise.views.adapters.TaskAttemptsUIAdapter;
import no.hal.learning.exercise.views.adapters.TaskCounterUIAdapter;
import no.hal.learning.exercise.workspace.WorkspacePackage;

public class SourceFileEditTaskProposalAdapter<T extends StringEditAnswer> extends AbstractSourceEditTaskProposalAdapter<T> {

	public SourceFileEditTaskProposalAdapter(TaskProposal<T> proposal) {
		super(proposal);
	}

	@Override
	public EObjectUIAdapter<?, ?>[] createSubAdapters() {
		return new EObjectUIAdapter<?, ?>[] {
			new TaskCounterUIAdapter(getProposal(), WorkspacePackage.eINSTANCE.getSourceFileEditEvent_SizeMeasure(), "Size: %2s", null, true),
			new TaskCounterUIAdapter(getProposal(), WorkspacePackage.eINSTANCE.getSourceFileEditEvent_ErrorCount(), "Errors: %2s", false),
			new TaskCounterUIAdapter(getProposal(), WorkspacePackage.eINSTANCE.getSourceFileEditEvent_WarningCount(), "Warnings: %2s", false),
			new TaskAttemptsUIAdapter(getProposal())
		};
	}
}
