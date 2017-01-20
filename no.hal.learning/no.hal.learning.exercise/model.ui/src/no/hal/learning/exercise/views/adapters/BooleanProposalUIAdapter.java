package no.hal.learning.exercise.views.adapters;

import java.util.Arrays;

import org.eclipse.swt.events.SelectionListener;

import no.hal.learning.quiz.BooleanAnswer;
import no.hal.learning.quiz.SimpleProposal;

public class BooleanProposalUIAdapter extends ButtonGroupAdapter<SimpleProposal<BooleanAnswer>> implements SelectionListener {

	public BooleanProposalUIAdapter(SimpleProposal<BooleanAnswer> proposal) {
		super(proposal);
		values = Arrays.asList((Object) true, false);
		labels = Arrays.asList("Yes", "No");
	}

	@Override
	protected void setAnswerValue(Object value) {
		getProposal().setProposal(value);
	}
}
