package no.hal.learning.sharing.ui.views.util;

import java.util.Collection;

import org.eclipse.emf.common.command.BasicCommandStack;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.command.CommandParameter;
import org.eclipse.emf.edit.command.DragAndDropCommand;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.ui.dnd.EditingDomainViewerDropAdapter;
import org.eclipse.emf.edit.ui.dnd.LocalTransfer;
import org.eclipse.emf.edit.ui.dnd.ViewerDragAdapter;
import org.eclipse.jface.util.LocalSelectionTransfer;
import org.eclipse.swt.dnd.DND;
import org.eclipse.swt.dnd.FileTransfer;
import org.eclipse.swt.dnd.Transfer;
import org.eclipse.swt.widgets.Composite;

public abstract class TreeEObjectEditorAdapter<E extends EObject> extends TreeEObjectUIAdapter<E> {

	public TreeEObjectEditorAdapter(E eObject) {
		super(eObject);
	}

	protected EditingDomain editingDomain;
	
	protected EditingDomain createEditingDomain() {
		return new AdapterFactoryEditingDomain(adapterFactory, new BasicCommandStack(), eObject.eResource().getResourceSet()) {
			@Override
			public Command createCommand(Class<? extends Command> commandClass, CommandParameter commandParameter) {
				Command command = TreeEObjectEditorAdapter.this.createCommand(commandClass, commandParameter);
				return (command != null ? command : super.createCommand(commandClass, commandParameter));
			}
		};
	}
	
	protected Command createCommand(Class<? extends Command> commandClass, CommandParameter commandParameter) {
		if (commandClass == DragAndDropCommand.class) {
			return createDragAndDropCommand(commandParameter.getOwner(), commandParameter.getCollection());
		}
		return null;
	}

	protected Command createDragAndDropCommand(Object owner, Collection<?> collection) {
		return null;
	}

	@Override
	public Composite initView(Composite parent) {
		Composite composite = super.initView(parent);

		int dndOperations = DND.DROP_COPY;
		Transfer[] transfers = new Transfer[] { LocalTransfer.getInstance(), LocalSelectionTransfer.getTransfer(), FileTransfer.getInstance() };
		treeViewer.addDragSupport(dndOperations, transfers, new ViewerDragAdapter(treeViewer));
		editingDomain = createEditingDomain();
		treeViewer.addDropSupport(dndOperations, transfers, new EditingDomainViewerDropAdapter(editingDomain, treeViewer));

		return composite;
	}
}
