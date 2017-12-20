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
import no.hal.learning.exercise.workspace.adapter.LaunchTaskProposalAdapter;
import no.hal.learning.exercise.workspace.adapter.SourceFileEditTaskProposalAdapter;

public class JdtUIAdapterFactory extends AdapterFactoryImpl {

	@Override
	public boolean isFactoryForType(Object type) {
		return EObjectUIAdapter.class == type;
	}
	
	@Override
	@SuppressWarnings("unchecked")
	protected Adapter createAdapter(Notifier target) {
		if (target instanceof JdtSourceEditProposal) {
			return new SourceFileEditTaskProposalAdapter<JdtSourceEditAnswer>((TaskProposal<JdtSourceEditAnswer>) target);
		} else if (target instanceof JdtLaunchProposal) {
			return new LaunchTaskProposalAdapter<JdtLaunchAnswer>((TaskProposal<JdtLaunchAnswer>) target);
		}
		return null;
	}
}
