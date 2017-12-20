package no.hal.learning.exercise.workbench.adapter;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import no.hal.learning.exercise.plugin.AbstractTaskEventsAdapterFactory;
import no.hal.learning.exercise.workbench.CommandExecutionAnswer;
import no.hal.learning.exercise.workbench.CommandExecutionProposal;
import no.hal.learning.exercise.workbench.DebugEventAnswer;
import no.hal.learning.exercise.workbench.DebugEventProposal;
import no.hal.learning.exercise.workbench.PartTaskAnswer;
import no.hal.learning.exercise.workbench.PartTaskProposal;
import no.hal.learning.exercise.workbench.PerspectiveTaskAnswer;
import no.hal.learning.exercise.workbench.PerspectiveTaskProposal;

public class WorkbenchTaskEventsAdapterFactory extends AbstractTaskEventsAdapterFactory {

	@Override
	public boolean isFactoryForType(Object type) {
		return isFactoryForType(type, PartTaskAnswer.class, PerspectiveTaskAnswer.class, CommandExecutionAnswer.class, DebugEventAnswer.class);
	}
	
	@Override
	@SuppressWarnings("unchecked")
	protected Adapter createAdapter(Notifier target) {
		if (target instanceof PartTaskProposal) {
			return new PartTaskEventsAdapter();
		} else if (target instanceof PerspectiveTaskProposal) {
			return new PerspectiveTaskEventsAdapter();
		} else if (target instanceof CommandExecutionProposal) {
			return new CommandExecutionEventsAdapter();
		} else if (target instanceof DebugEventProposal) {
			return new DebugEventsAdapter();
		}
		return null;
	}
}
