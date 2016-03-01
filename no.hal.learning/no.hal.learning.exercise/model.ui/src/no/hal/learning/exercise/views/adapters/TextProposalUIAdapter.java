package no.hal.learning.exercise.views.adapters;

import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.widgets.Text;

import no.hal.learning.exercise.Proposal;

public abstract class TextProposalUIAdapter<P extends Proposal<?>> extends TextUIAdapter<P> implements ProposalUIAdapter<P, Text>, ModifyListener {

	protected String format;
	
	public TextProposalUIAdapter(P proposal) {
		super(proposal);
	}

	@Override
	public P getProposal() {
		return eObject;
	}
	
	//

	@Override
	protected Object getViewValue(String s) {
		return s;
	}

	@Override
	protected Object getModelValue() {
		return getProposal().getProposal();
	}

	@Override
	protected boolean validateViewValue(Object viewValue) {
		if (viewValue == null || getProposal().getAnswer().validate(viewValue) != null) {
			return false;
		}
		return true;
	}
}
