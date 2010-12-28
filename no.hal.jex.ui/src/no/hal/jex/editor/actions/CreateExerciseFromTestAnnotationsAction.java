package no.hal.jex.editor.actions;

import java.util.Collection;

import no.hal.jex.Exercise;
import no.hal.jex.editor.commands.CreateExerciseFromTestAnnotationsCommand;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.UnexecutableCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.ui.action.StaticSelectionCommandAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IWorkbenchPart;

public class CreateExerciseFromTestAnnotationsAction extends StaticSelectionCommandAction {

	public CreateExerciseFromTestAnnotationsAction(IWorkbenchPart workbenchPart, ISelection selection) {
		super(workbenchPart);
		configureAction(selection);
	}
	
	@Override
	protected Command createActionCommand(EditingDomain editingDomain, Collection selection) {
		if (selection.size() == 1) {
			Object owner = selection.iterator().next();
			if (owner instanceof Exercise) {
				return new CreateExerciseFromTestAnnotationsCommand((Exercise)owner, "tests");
			}
		}
		return UnexecutableCommand.INSTANCE;
	}
}
