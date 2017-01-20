package no.hal.learning.exercise.views.adapters;

import org.eclipse.swt.events.ModifyListener;

import no.hal.learning.quiz.NumberAnswer;
import no.hal.learning.quiz.SimpleProposal;

public class NumberProposalUIAdapter extends TextProposalUIAdapter<SimpleProposal<NumberAnswer>> implements ModifyListener {

	public NumberProposalUIAdapter(SimpleProposal<NumberAnswer> proposal) {
		super(proposal);
		format = "\\d+(\\.\\d+)?";
	}

	@Override
	protected void setModel(Object o) {
		Number num = (Number) o;
		getProposal().setProposal(num.doubleValue());
	}

	@Override
	protected Object getViewValue(String s) {
		try {
			return Double.valueOf(s);
		} catch (NumberFormatException e) {
			return null;
		}
	}
}
