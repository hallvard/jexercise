package no.hal.learning.exercise.checkstyle.adapter;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.ProgressBar;

import no.hal.learning.exercise.TaskProposal;
import no.hal.learning.exercise.checkstyle.CheckstyleAnswer;
import no.hal.learning.exercise.views.adapters.TaskProgressUIAdapter;

public class CheckstyleProposalAdapter extends TaskProgressUIAdapter<TaskProposal<CheckstyleAnswer>> {

	private String markerType = "net.sf.eclipsecs.core.CheckstyleMarker";
	
	public CheckstyleProposalAdapter(TaskProposal<CheckstyleAnswer> proposal) {
		super(proposal);
	}

	@Override
	public ProgressBar initView(final Composite parent) {
		return super.initView(parent);
	}
}
