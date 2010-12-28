package no.hal.jex.editor.actions;

import java.util.Collection;

import no.hal.jex.JavaElement;
import no.hal.jex.editor.commands.CreateChildrenFromJavaModelCommand;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.UnexecutableCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.ui.action.StaticSelectionCommandAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IWorkbenchPart;

public class CreateChildrenFromJavaModelAction extends StaticSelectionCommandAction {

	private boolean recursive;
	private int modifiers;
	
	public CreateChildrenFromJavaModelAction(IWorkbenchPart workbenchPart, ISelection selection, int modifiers, boolean recursive) {
		super(workbenchPart);
		this.recursive = recursive;
		this.modifiers = modifiers;
		configureAction(selection);
	}
	
	@Override
	protected Command createActionCommand(EditingDomain editingDomain, Collection selection) {
		if (selection.size() == 1) {
			Object owner = selection.iterator().next();
			if (owner instanceof JavaElement) {
				return new CreateChildrenFromJavaModelCommand((JavaElement)owner, modifiers, recursive);
			}
		}
		return UnexecutableCommand.INSTANCE;
	}
}
