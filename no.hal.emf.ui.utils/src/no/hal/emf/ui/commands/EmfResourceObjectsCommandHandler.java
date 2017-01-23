package no.hal.emf.ui.commands;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.Resource.Factory;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.HandlerUtil;

public abstract class EmfResourceObjectsCommandHandler<T extends EObject> extends AbstractHandler {

	protected IWorkbenchWindow activeWindow = null;

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		activeWindow = HandlerUtil.getActiveWorkbenchWindow(event);
		Collection<IFile> resources = getEObjects(activeWindow.getSelectionService().getSelection());
		execute(resources);
		return null;
	}
	
	@Override
	public boolean isEnabled() {
		if (! super.isEnabled()) {
			return false;
		}
		IWorkbenchWindow activeWindow = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
		return isEnabled(getEObjects(activeWindow));
	}
	
	protected boolean isEnabled(Collection<IFile> resources) {
		return resources != null && (! resources.isEmpty());
	}
	
	protected void execute(Collection<IFile> resources) throws ExecutionException {
		for (IFile resource : resources) {
			T eObject = getEObjects(resource);
			execute(resource, eObject, getTargetContainer(resource));
		}
	}
	
	protected abstract EClass getEObjectClass();
	
	protected T getEObjects(IFile resource) {
		IPath path = resource.getFullPath();
		URI uri = URI.createPlatformResourceURI(path.toString(), true);
		Factory factory = Resource.Factory.Registry.INSTANCE.getFactory(uri);
		Resource emfResource = factory.createResource(uri);
		try {
			emfResource.load(null);
			return (T) EcoreUtil.getObjectByType(emfResource.getContents(), getEObjectClass());
		} catch (IOException e) {
		}
		return null;
	}
	
	protected abstract void execute(IFile file, T eObject, IContainer target) throws ExecutionException;

	protected abstract IContainer getTargetContainer(IFile resource);

	protected Collection<IFile> getEObjects(IWorkbenchWindow workbenchPage) {
		return getEObjects(workbenchPage.getSelectionService().getSelection());
	}

	protected abstract boolean isEmfFileExtension(String ext);
	
	protected Collection<IFile> getEObjects(ISelection selection) {
		Collection<IFile> resources = new ArrayList<IFile>();
		if (selection != null & selection instanceof IStructuredSelection) {
			Iterator<?> iterator = ((IStructuredSelection) selection).iterator();
			while (iterator.hasNext()) {
				Object object = iterator.next();
				IFile adapter = Platform.getAdapterManager().getAdapter(object, IFile.class);
				if (adapter instanceof IFile) {
					if (isEmfFileExtension(((IFile) adapter).getFileExtension())) {
						resources.add((IFile) adapter);
					}
				}
			}
		}
		return resources;
	}
}
