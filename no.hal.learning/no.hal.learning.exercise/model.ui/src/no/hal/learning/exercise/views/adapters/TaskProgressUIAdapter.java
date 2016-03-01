package no.hal.learning.exercise.views.adapters;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.ProgressBar;

import no.hal.learning.exercise.TaskProposal;

public class TaskProgressUIAdapter<P extends TaskProposal<?>> extends ProgressBarUIAdapter<P> implements ProposalUIAdapter<P, ProgressBar> {

	public TaskProgressUIAdapter(P proposal) {
		super(proposal);
	}
	
	@Override
	public P getProposal() {
		return eObject;
	}

	//
	
	protected boolean editable = false;

	@Override
	public ProgressBar initView(Composite parent) { 
		ProgressBar control = super.initView(parent);
		if (editable) {
			control.addMouseListener(this);
		}
		return control;
	}
}
