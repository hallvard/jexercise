package no.hal.learning.sharing.ui.views;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;

import no.hal.emf.ui.utils.DragAndCopyCommand;

public class AddEmfResourcesCommand extends DragAndCopyCommand {

	private final ResourceSet resourceSet;
	private final Collection<IResource> resources;
	private final Collection<String> extensions;
	
	public AddEmfResourcesCommand(ResourceSet resourceSet, Collection<IResource> resources, Collection<String> extensions) {
		this.resourceSet = resourceSet;
		this.resources = new ArrayList<IResource>(resources);
		this.extensions = new ArrayList<String>(extensions);
	}
	public AddEmfResourcesCommand(ResourceSet resourceSet, Collection<IResource> resources, String... extensions) {
		this(resourceSet, resources, Arrays.asList(extensions));
	}

	@Override
	protected boolean prepare() {
		int count = 0;
		for (IResource resource : resources) {
			if (resource instanceof IFile) {
				IFile file = (IFile) resource;
				String ext = file.getFileExtension();
				if (extensions.size() == 0 || extensions.contains(ext)) {
					if (resourceSet.getResourceFactoryRegistry().getFactory(URI.createURI("temp." + ext)) != null) {
						count++;
					}
				}
			}
		}
		return count > 0;
	}
	
	private Collection<Resource> acceptedResources = null; 

	protected void ensureAcceptedResources() {
		if (acceptedResources == null) {
			acceptedResources = new ArrayList<Resource>();
			outer: for (IResource resource : resources) {
				Resource emfResource = resourceSet.createResource(URI.createURI(resource.getName()));
				if (resource instanceof IFile) {
					try {
						IFile file = (IFile) resource;
						if (extensions.size() == 0 || extensions.contains(file.getFileExtension())) {
							emfResource.load(file.getContents(), null);
						}
						EList<EObject> contents = emfResource.getContents();
						for (EObject eObject : contents) {
							if (accept(eObject)) {
								acceptedResources.add(emfResource);
								continue outer;
							}
						}
					} catch (Exception e) {
					}
				}
			}
		}
	}

	protected boolean accept(EObject eObject) {
		return true;
	}

	@Override
	public void execute() {
		ensureAcceptedResources();
		resourceSet.getResources().addAll(acceptedResources);
	}

	@Override
	public void undo() {
		resourceSet.getResources().removeAll(acceptedResources);
	}
	
	@Override
	public void redo() {
		execute();
	}
}
