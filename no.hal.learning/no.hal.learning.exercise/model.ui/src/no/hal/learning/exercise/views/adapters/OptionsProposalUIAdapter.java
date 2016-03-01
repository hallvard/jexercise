package no.hal.learning.exercise.views.adapters;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.ECollections;
import org.eclipse.swt.events.SelectionListener;

import no.hal.learning.exercise.Option;
import no.hal.learning.exercise.OptionAnswer;
import no.hal.learning.exercise.OptionsProposal;
import no.hal.learning.exercise.SimpleAnswer;
import no.hal.learning.exercise.SingleOptionsAnswer;

public class OptionsProposalUIAdapter extends ButtonGroupAdapter<OptionsProposal> implements SelectionListener {

	public OptionsProposalUIAdapter(OptionsProposal proposal) {
		super(proposal);
		values = new ArrayList<Object>();
		labels = new ArrayList<String>();
		for (Option option : proposal.getAnswer().getOptions()) {
			OptionAnswer optionAnswer = option.getOption();
			if (optionAnswer instanceof SimpleAnswer<?>) {
				Object buttonValue = ((SimpleAnswer<?>) optionAnswer).getValue();
				values.add(buttonValue);
				labels.add(String.valueOf(buttonValue));
			}
		}
	}

	@Override
	protected boolean isSingleSelection() {
		return getProposal().getAnswer() instanceof SingleOptionsAnswer;
	}

	@Override
	protected void setAnswerValue(Object value) {
		if (value instanceof List<?>) {
			ECollections.setEList(getProposal().getIndices(), (List<Integer>) value);
		}
	}
}
