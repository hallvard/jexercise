package no.hal.jex.editor.commands;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.handlers.HandlerUtil;

public abstract class AbstractCommandHandler extends AbstractHandler implements IHandler {

	protected <T> T getParameter(ExecutionEvent event, String name, T def) {
		String prefix = event.getCommand().getId();
		if (name.indexOf('.') < 0) {
			name = prefix + "." + name;
		}
		Object value = event.getParameter(prefix + name);
		return (value != null ? (T)value : def);
	}

	protected abstract Command createEmfCommand(ExecutionEvent event);
	
	protected <T> T getEditor(ExecutionEvent event, Class<T> editorClass) {
		IEditorPart editor = HandlerUtil.getActiveEditor(event);
		if (editor == null) {
			return null;
		}
		return (T)editor.getAdapter(editorClass);
	}

	protected abstract IEditorPart getEditor(ExecutionEvent event);

	protected ISelection getSelection(ExecutionEvent event) {
		ISelectionProvider selectionProvider = null;
		IEditorPart editorPart = getEditor(event);
		if (editorPart instanceof ISelectionProvider) {
			selectionProvider = (ISelectionProvider)editorPart;
		} else {
			selectionProvider = (ISelectionProvider) editorPart.getAdapter(ISelectionProvider.class);
		}
		return (selectionProvider != null ? selectionProvider.getSelection() : null);
	}

	protected <T> T getSelectedObject(ExecutionEvent event, Class<T> objectClass) {
		ISelection selection = getSelection(event);
		if (selection instanceof IStructuredSelection) {
			Object selectedObject = ((IStructuredSelection)selection).getFirstElement();
			if (objectClass.isInstance(selectedObject)) {
				return (T)selectedObject;
			}
		}
		return null;
	}

	protected EditingDomain getEditingDomain(ExecutionEvent event) {
		IEditorPart editorPart = getEditor(event);
		if (editorPart instanceof IEditingDomainProvider) {
			return ((IEditingDomainProvider)editorPart).getEditingDomain();
		}
		return null;
	}
	
	public Object execute(ExecutionEvent event) throws ExecutionException {
		Command command = createEmfCommand(event);
		if (command != null && command.canExecute()) {
			EditingDomain editingDomain = getEditingDomain(event);
			if (editingDomain != null) {
				editingDomain.getCommandStack().execute(command);
			} else {
				command.execute();
			}
			return command.getAffectedObjects();
		}
		return null;
	}
}
