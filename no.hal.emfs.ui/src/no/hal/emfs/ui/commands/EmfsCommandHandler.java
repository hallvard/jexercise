package no.hal.emfs.ui.commands;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import no.hal.emfs.EmfsPackage;
import no.hal.emfs.EmfsResource;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.Resource.Factory;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.HandlerUtil;

public abstract class EmfsCommandHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		Collection<IFile> emfsResources = getEmfsResources(HandlerUtil.getActiveWorkbenchWindow(event).getSelectionService().getSelection());
		execute(emfsResources);
		return null;
	}

	@Override
	public boolean isEnabled() {
		if (! super.isEnabled()) {
			return false;
		}
		return isEnabled(getEmfsResources(PlatformUI.getWorkbench().getActiveWorkbenchWindow()));
	}
	
	protected boolean isEnabled(Collection<IFile> emfsResources) {
		return emfsResources != null && (! emfsResources.isEmpty());
	}
	
	protected void execute(Collection<IFile> emfsResources) throws ExecutionException {
		for (IFile file : emfsResources) {
			EmfsResource emfsResource = getEmfsResource(file);
			execute(file, emfsResource, getTargetContainer(file));
		}
	}
	
	protected EmfsResource getEmfsResource(IFile emfsResource) {
		URI uri = URI.createURI(emfsResource.getLocationURI().toString());
		Factory factory = Resource.Factory.Registry.INSTANCE.getFactory(uri);
		Resource emfResource = factory.createResource(uri);
		try {
			emfResource.load(null);
			return (EmfsResource) EcoreUtil.getObjectByType(emfResource.getContents(), EmfsPackage.eINSTANCE.getEmfsResource());
		} catch (IOException e) {
		}
		return null;
	}
	
	protected abstract void execute(IFile emfsFile, EmfsResource emfsResource, IContainer target) throws ExecutionException;

	protected abstract IContainer getTargetContainer(IFile emfsResource);
	
	protected Collection<IFile> getEmfsResources(IWorkbenchWindow workbenchPage) {
		return getEmfsResources(workbenchPage.getSelectionService().getSelection());
	}

	protected Collection<IFile> getEmfsResources(ISelection selection) {
		Collection<IFile> emfsResources = new ArrayList<IFile>();
		if (selection != null & selection instanceof IStructuredSelection) {
			Iterator<?> iterator = ((IStructuredSelection) selection).iterator();
			while (iterator.hasNext()) {
				Object object = iterator.next();
				if (object instanceof IFile) {
					String ext = ((IFile) object).getFileExtension();
					if ("emfs".equals(ext) || "xemfs".equals(ext)) {
						emfsResources.add((IFile) object);
					}
				}
			}
		}
		return emfsResources;
	}
}
