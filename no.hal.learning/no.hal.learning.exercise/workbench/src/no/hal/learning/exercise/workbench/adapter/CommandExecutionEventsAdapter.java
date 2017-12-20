package no.hal.learning.exercise.workbench.adapter;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IExecutionListener;
import org.eclipse.core.commands.NotHandledException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.commands.ICommandService;

import no.hal.learning.exercise.TaskAnswer;
import no.hal.learning.exercise.workbench.CommandExecutionAnswer;

public class CommandExecutionEventsAdapter extends AbstractWorkbenchTaskEventAdapter<CommandExecutionAnswer> implements IExecutionListener {

	@Override
	protected void registerListeners() {
		ICommandService commandService = PlatformUI.getWorkbench().getAdapter(ICommandService.class);
		if (commandService != null) {
			commandService.addExecutionListener(this);
		}
	}

	@Override
	protected void unregisterListeners() {
		ICommandService commandService = PlatformUI.getWorkbench().getAdapter(ICommandService.class);
		if (commandService != null) {
			commandService.removeExecutionListener(this);
		}
	}
	
	@Override
	public boolean supportsTaskAnswer(TaskAnswer type) {
		return supportsTaskAnswer(type, CommandExecutionAnswer.class);
	}

	//

	@Override
	public void notHandled(String commandId, NotHandledException exception) {
	}

	@Override
	public void postExecuteFailure(String commandId, ExecutionException exception) {
		taskPerformed(commandId, "executeFailure");
	}

	@Override
	public void postExecuteSuccess(String commandId, Object returnValue) {
		taskPerformed(commandId, "executeSuccess");
	}

	@Override
	public void preExecute(String commandId, ExecutionEvent event) {
	}
}