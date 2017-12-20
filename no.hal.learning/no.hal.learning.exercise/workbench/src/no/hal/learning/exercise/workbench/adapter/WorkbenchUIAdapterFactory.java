package no.hal.learning.exercise.workbench.adapter;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import no.hal.emf.ui.parts.adapters.EObjectUIAdapter;
import no.hal.learning.exercise.TaskProposal;
import no.hal.learning.exercise.workbench.CommandExecutionAnswer;
import no.hal.learning.exercise.workbench.CommandExecutionProposal;
import no.hal.learning.exercise.workbench.DebugEventAnswer;
import no.hal.learning.exercise.workbench.DebugEventProposal;
import no.hal.learning.exercise.workbench.PartTaskAnswer;
import no.hal.learning.exercise.workbench.PartTaskProposal;
import no.hal.learning.exercise.workbench.PerspectiveTaskAnswer;
import no.hal.learning.exercise.workbench.PerspectiveTaskProposal;

public class WorkbenchUIAdapterFactory extends AdapterFactoryImpl {

	@Override
	public boolean isFactoryForType(Object type) {
		return EObjectUIAdapter.class == type;
	}
	
	@Override
	@SuppressWarnings("unchecked")
	protected Adapter createAdapter(Notifier target) {
		if (target instanceof PartTaskProposal) {
			return new WorkbenchTaskProposalAdapter<PartTaskAnswer>((TaskProposal<PartTaskAnswer>) target);
		} else if (target instanceof PerspectiveTaskProposal) {
			return new WorkbenchTaskProposalAdapter<PerspectiveTaskAnswer>((TaskProposal<PerspectiveTaskAnswer>) target);
		} else if (target instanceof CommandExecutionProposal) {
			return new WorkbenchTaskProposalAdapter<CommandExecutionAnswer>((TaskProposal<CommandExecutionAnswer>) target);
		} else if (target instanceof DebugEventProposal) {
			return new WorkbenchTaskProposalAdapter<DebugEventAnswer>((TaskProposal<DebugEventAnswer>) target);
		}
		return null;
	}
}
