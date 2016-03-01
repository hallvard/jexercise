package no.hal.learning.exercise.checkstyle.adapter;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import no.hal.emf.ui.parts.adapters.EObjectUIAdapter;
import no.hal.learning.exercise.TaskProposal;
import no.hal.learning.exercise.checkstyle.CheckstyleAnswer;
import no.hal.learning.exercise.checkstyle.CheckstyleProposal;

public class CheckstyleUIAdapterFactory extends AdapterFactoryImpl {

	@Override
	public boolean isFactoryForType(Object type) {
		return EObjectUIAdapter.class.equals(type);
	}
	
	@Override
	@SuppressWarnings("unchecked")
	protected Adapter createAdapter(Notifier target) {
		if (target instanceof CheckstyleProposal) {
			return new CheckstyleProposalAdapter((TaskProposal<CheckstyleAnswer>) target);
		}
		return null;
	}
}
