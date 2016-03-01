package no.hal.learning.exercise.workbench.adapter;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IExecutionListener;
import org.eclipse.core.commands.NotHandledException;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.commands.ICommandService;

import no.hal.learning.exercise.TaskProposal;
import no.hal.learning.exercise.workbench.CommandExecutionAnswer;

public class CommandExecutionProposalAdapter extends WorkbenchTaskProposalAdapter<CommandExecutionAnswer> {

	public CommandExecutionProposalAdapter(TaskProposal<CommandExecutionAnswer> proposal) {
		super(proposal);
	}

	private CommandExecutionListener listener;

	@Override
	protected void addWorkbenchListeners(IWorkbench workbench) {
		ICommandService commandService = workbench.getAdapter(ICommandService.class);
		if (commandService != null) {
			commandService.addExecutionListener(listener = new CommandExecutionListener());
		}
	}
	@Override
	protected void removeWorkbenchListeners(IWorkbench workbench) {
		ICommandService commandService = workbench.getAdapter(ICommandService.class);
		if (commandService != null) {
			commandService.removeExecutionListener(listener);
		}
	}

	//

	protected class CommandExecutionListener extends AbstractWorkbenchTaskListener implements IExecutionListener {

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
}
