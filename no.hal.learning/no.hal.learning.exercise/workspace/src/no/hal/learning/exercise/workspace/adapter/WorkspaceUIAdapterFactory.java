package no.hal.learning.exercise.workspace.adapter;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import no.hal.emf.ui.parts.adapters.EObjectUIAdapter;
import no.hal.learning.exercise.TaskProposal;
import no.hal.learning.exercise.workspace.LaunchAnswer;
import no.hal.learning.exercise.workspace.SourceFileEditAnswer;
import no.hal.learning.exercise.workspace.SourceFileEditProposal;

public class WorkspaceUIAdapterFactory extends AdapterFactoryImpl {

	@Override
	public boolean isFactoryForType(Object type) {
		return EObjectUIAdapter.class == type;
	}
	
	@Override
	@SuppressWarnings("unchecked")
	protected Adapter createAdapter(Notifier target) {
		if (target instanceof SourceFileEditProposal) {
			return new SourceFileEditTaskProposalAdapter<SourceFileEditAnswer>((TaskProposal<SourceFileEditAnswer>) target);
		} else if (target instanceof LaunchTaskProposalAdapter<?>) {
			return new LaunchTaskProposalAdapter<LaunchAnswer>((TaskProposal<LaunchAnswer>) target);			
		}
		return null;
	}
}
