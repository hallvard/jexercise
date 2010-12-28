package no.hal.jex.editor.commands;

import no.hal.jex.Exercise;
import no.hal.jex.presentation.JexEditor;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.emf.common.command.Command;
import org.eclipse.ui.IEditorPart;

public class CreateExerciseFromTestAnnotationsCommandHandler extends AbstractCommandHandler {

	@Override
	protected Command createEmfCommand(ExecutionEvent event) {
		Object owner = event.getParameters().get("selectedObject");
		if (owner == null) {
			owner = getSelectedObject(event, Exercise.class); 
		}
		String folderName = getParameter(event, "folder", "tests");
		if (owner instanceof Exercise) {
			return new CreateExerciseFromTestAnnotationsCommand((Exercise)owner, folderName);
		}
		return null;
	}
	
	@Override
	protected IEditorPart getEditor(ExecutionEvent event) {
		return getEditor(event, JexEditor.class);
	}
}
