package no.hal.learning.sharing.ui.views;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.eclipse.core.resources.IResource;
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;

import no.hal.emf.ui.utils.DragAndCopyCommand;
import no.hal.emfs.importer.Importer;
import no.hal.emfs.sync.ImportRule;
import no.hal.emfs.sync.ImportSpec;
import no.hal.emfs.sync.SyncFactory;
import no.hal.emfs.ui.commands.AddEmfsImportRuleCommand;

public class CreateImportSpecForResourcesCommand extends DragAndCopyCommand {

	private final ResourceSet resourceSet;
	private final Collection<IResource> resources;
	
	public CreateImportSpecForResourcesCommand(ResourceSet resourceSet, Collection<IResource> resources) {
		this.resourceSet = resourceSet;
		this.resources = new ArrayList<IResource>(resources);
	}
	
	public CreateImportSpecForResourcesCommand(ResourceSet resourceSet, IResource... resources) {
		this.resourceSet = resourceSet;
		this.resources = Arrays.asList(resources);
	}

	private ImportSpec importSpec = null;
	
	public ImportSpec getImportSpec() {
		return importSpec;
	}

	public void setImportSpec(ImportSpec importSpec) {
		this.importSpec = importSpec;
	}
	
	@Override
	protected boolean prepare() {
		return true;
	}

	private Resource syncResource = null; 
	
	@Override
	public void execute() {
		if (syncResource == null) {
			List<ImportRule> rules = AddEmfsImportRuleCommand.createRules(resources);
			if (importSpec == null) {
				importSpec = SyncFactory.eINSTANCE.createImportSpec();
			}
			ECollections.setEList(importSpec.getRules(), rules);
			Importer importer = new Importer(importSpec);
			importer.importResources();
			syncResource = resourceSet.createResource(URI.createURI(resources.iterator().next().getName() + ".emfsync"));
			syncResource.getContents().add(importSpec);
		}
		resourceSet.getResources().add(syncResource);
	}

	@Override
	public void undo() {
		resourceSet.getResources().remove(syncResource);
	}
	
	@Override
	public void redo() {
		execute();
	}
}
