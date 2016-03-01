package no.hal.learning.exercise.jdt.adapter;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import no.hal.emf.ui.parts.adapters.EObjectUIAdapter;
import no.hal.learning.exercise.TaskProposal;
import no.hal.learning.exercise.jdt.JdtLaunchAnswer;
import no.hal.learning.exercise.jdt.JdtLaunchProposal;
import no.hal.learning.exercise.jdt.JdtSourceEditAnswer;
import no.hal.learning.exercise.jdt.JdtSourceEditProposal;

public class JdtUIAdapterFactory extends AdapterFactoryImpl {

	@Override
	public boolean isFactoryForType(Object type) {
		return EObjectUIAdapter.class.equals(type);
	}
	
	@Override
	@SuppressWarnings("unchecked")
	protected Adapter createAdapter(Notifier target) {
		if (target instanceof JdtSourceEditProposal) {
			return new JdtSourceEditTaskProposalAdapter((TaskProposal<JdtSourceEditAnswer>) target);
		} else if (target instanceof JdtLaunchProposal) {
			return new JdtLaunchTaskProposalAdapter((TaskProposal<JdtLaunchAnswer>) target);
		}
		return null;
	}
}
