package no.hal.learning.exercise.views.adapters;

import org.eclipse.emf.common.util.EList;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.ProgressBar;

import no.hal.learning.exercise.TaskEvent;
import no.hal.learning.exercise.TaskProposal;

public class TaskProgressUIAdapter<P extends TaskProposal<?>> extends ProgressBarUIAdapter<P> implements ProposalUIAdapter<P, ProgressBar> {

	public TaskProgressUIAdapter(P proposal) {
		super(proposal);
	}
	
	@Override
	public P getProposal() {
		return eObject;
	}

	@Override
	protected double getCompletion() {
		double completion = super.getCompletion();
		if (completion < 0) {
			EList<TaskEvent> attempts = getProposal().getAttempts();
			if (attempts.size() > 0) {
				TaskEvent lastAttempt = attempts.get(attempts.size() - 1);
				completion = lastAttempt.getCompletion();
			}
		}
		return completion;
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
