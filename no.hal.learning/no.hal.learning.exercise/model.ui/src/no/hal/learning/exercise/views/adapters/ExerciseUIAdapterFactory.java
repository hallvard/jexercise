package no.hal.learning.exercise.views.adapters;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import no.hal.emf.ui.parts.adapters.EObjectUIAdapter;
import no.hal.learning.exercise.ExerciseProposals;
import no.hal.learning.exercise.ExercisePartProposals;
import no.hal.learning.quiz.BooleanAnswer;
import no.hal.learning.quiz.NumberAnswer;
import no.hal.learning.quiz.OptionsProposal;
import no.hal.learning.quiz.SimpleAnswer;
import no.hal.learning.quiz.SimpleProposal;
import no.hal.learning.quiz.StringAnswer;

public class ExerciseUIAdapterFactory extends AdapterFactoryImpl {

	@Override
	public boolean isFactoryForType(Object type) {
		return EObjectUIAdapter.class.equals(type);
	}
	
	@Override
	@SuppressWarnings("unchecked")
	protected Adapter createAdapter(Notifier target) {
		if (target instanceof ExerciseProposals) {
			return new ExerciseProposalsUIAdapter((ExerciseProposals) target);
		} else if (target instanceof ExercisePartProposals) {
			return new ExercisePartProposalsUIAdapter((ExercisePartProposals) target);
		} else if (target instanceof SimpleProposal<?>) {
			SimpleAnswer<?> answer = ((SimpleProposal<?>) target).getAnswer();
			if (answer instanceof BooleanAnswer) {
				return new BooleanProposalUIAdapter((SimpleProposal<BooleanAnswer>) target);
			} else if (answer instanceof StringAnswer) {
				return new StringProposalAdapter((SimpleProposal<StringAnswer>) target);
			} else if (answer instanceof NumberAnswer) {
				return new NumberProposalUIAdapter((SimpleProposal<NumberAnswer>) target);
			}
		} else if (target instanceof OptionsProposal) {
			return new OptionsProposalUIAdapter((OptionsProposal) target);
		}
		return null;
	}
}
