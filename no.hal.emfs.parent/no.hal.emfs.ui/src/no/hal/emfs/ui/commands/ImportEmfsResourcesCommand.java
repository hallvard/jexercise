package no.hal.emfs.ui.commands;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.common.command.AbstractCommand;
import org.eclipse.emf.edit.command.DragAndDropFeedback;
import org.eclipse.swt.dnd.DND;

import no.hal.emfs.EmfsContainer;
import no.hal.emfs.EmfsResource;
import no.hal.emfs.importer.Importer;
import no.hal.emfs.sync.ImportRule;
import no.hal.emfs.sync.ImportSpec;
import no.hal.emfs.sync.SyncFactory;

public class ImportEmfsResourcesCommand extends AbstractCommand implements DragAndDropFeedback {

	private final EmfsContainer emfsContainer;
	private final Collection<IResource> resources;
	
	public ImportEmfsResourcesCommand(EmfsContainer emfsContainer, Collection<IResource> resources) {
		this.emfsContainer = emfsContainer;
		this.resources = new ArrayList<IResource>(resources);
	}
	
	public ImportEmfsResourcesCommand(EmfsContainer emfsContainer, IResource... resources) {
		this.emfsContainer = emfsContainer;
		this.resources = Arrays.asList(resources);
	}

	@Override
	protected boolean prepare() {
		return true;
	}
	
	private Collection<EmfsResource> emfsResources = null; 
	
	@Override
	public void execute() {
		if (emfsResources == null) {
			Collection<ImportRule> rules = AddEmfsImportRuleCommand.createRules(resources);
			ImportSpec importSpec = SyncFactory.eINSTANCE.createImportSpec();
			importSpec.getRules().addAll(rules);
			Importer importer = new Importer(importSpec);
			importer.setRootContainer(ResourcesPlugin.getWorkspace().getRoot());
			importer.importResources();
			emfsResources = importSpec.getResources();
		}
		emfsContainer.getResources().addAll(emfsResources);
	}

	@Override
	public void undo() {
		emfsContainer.getResources().removeAll(emfsResources);
	}
	
	@Override
	public void redo() {
		execute();
	}

	// DragAndDropFeedback

	@Override
	public boolean validate(Object owner, float location, int operations, int operation, Collection<?> collection) {
		return canExecute();
	}

	@Override
	public int getFeedback() {
		return DND.FEEDBACK_EXPAND;
	}

	@Override
	public int getOperation() {
		return DND.DROP_COPY;
	}
}
