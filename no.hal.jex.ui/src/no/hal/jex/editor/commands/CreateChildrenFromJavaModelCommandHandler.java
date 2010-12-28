package no.hal.jex.editor.commands;

import no.hal.jex.JavaElement;
import no.hal.jex.JexFactory;
import no.hal.jex.JexPackage;
import no.hal.jex.presentation.JexEditor;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.emf.common.command.Command;
import org.eclipse.ui.IEditorPart;

public class CreateChildrenFromJavaModelCommandHandler extends AbstractCommandHandler {

	@Override
	protected Command createEmfCommand(ExecutionEvent event) {
		Object owner = event.getParameters().get("selectedObject");
		if (owner == null) {
			owner = getSelectedObject(event, JavaElement.class); 
		}
		if (owner instanceof JavaElement) {
			int modifiers = (Integer)JexFactory.eINSTANCE.createFromString(JexPackage.eINSTANCE.getModifiers(), getParameter(event, "modifiers", "public"));
			boolean recursive = Boolean.valueOf(getParameter(event, "recursive", "true"));
			return new CreateChildrenFromJavaModelCommand((JavaElement)owner, modifiers, recursive);
		}
		return null;
	}
	
	@Override
	protected IEditorPart getEditor(ExecutionEvent event) {
		return getEditor(event, JexEditor.class);
	}
}
