package no.hal.jex.editor.commands;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import no.hal.jex.AbstractRequirement;
import no.hal.jex.JavaElement;
import no.hal.jex.presentation.JexEditor;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.emf.common.command.Command;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IEditorPart;

public class CreateRequirementsFromJavaModelCommandHandler extends AbstractCommandHandler {

	@Override
	protected Command createEmfCommand(ExecutionEvent event) {
		List<JavaElement> javaElements = new ArrayList<JavaElement>();
		AbstractRequirement reqParent = null;
		ISelection selection = getSelection(event);
		if (selection instanceof IStructuredSelection) {
			for (Iterator<?> it = ((IStructuredSelection)selection).iterator(); it.hasNext();) {
				Object selected = it.next();
				if (selected instanceof AbstractRequirement) {
					if (reqParent != null) {
						return null;
					}
					reqParent = (AbstractRequirement)selected;
				} else if (selected instanceof JavaElement) {
					javaElements.add((JavaElement)selected);
				}
			}
		}
		if (reqParent != null && javaElements.size() > 0) {
			boolean recursive = Boolean.valueOf(getParameter(event, "recursive", "true"));
			return new CreateRequirementsFromJavaModelCommand(javaElements, reqParent, recursive);
		}
		return null;
	}
	
	@Override
	protected IEditorPart getEditor(ExecutionEvent event) {
		return getEditor(event, JexEditor.class);
	}
}
