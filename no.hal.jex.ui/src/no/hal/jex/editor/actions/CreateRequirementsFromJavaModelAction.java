package no.hal.jex.editor.actions;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import no.hal.jex.AbstractRequirement;
import no.hal.jex.JavaElement;
import no.hal.jex.editor.commands.CreateRequirementsFromJavaModelCommand;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.UnexecutableCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.ui.action.StaticSelectionCommandAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IWorkbenchPart;

public class CreateRequirementsFromJavaModelAction extends StaticSelectionCommandAction {

	private boolean recursive;
	
	public CreateRequirementsFromJavaModelAction(IWorkbenchPart workbenchPart, ISelection selection, boolean recursive) {
		super(workbenchPart);
		this.recursive = recursive;
		configureAction(selection);
	}
	
	@Override
	protected Command createActionCommand(EditingDomain editingDomain, Collection selection) {
		List javaElements = new ArrayList();
		AbstractRequirement reqParent = null;
		for (Iterator it = selection.iterator(); it.hasNext();) {
			Object selected = it.next();
			if (selected instanceof AbstractRequirement) {
				if (reqParent != null) {
					return UnexecutableCommand.INSTANCE;
				}
				reqParent = (AbstractRequirement)selected;
			} else if (selected instanceof JavaElement) {
				javaElements.add(selected);
			}
		}
		if (reqParent != null && javaElements.size() > 0) {
			return new CreateRequirementsFromJavaModelCommand(javaElements, reqParent, recursive);
		}
		return UnexecutableCommand.INSTANCE;
	}
}
