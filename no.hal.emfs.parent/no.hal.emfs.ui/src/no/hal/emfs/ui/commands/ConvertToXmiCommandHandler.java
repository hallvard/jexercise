package no.hal.emfs.ui.commands;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

import no.hal.emfs.EmfsResource;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

public class ConvertToXmiCommandHandler extends EmfsCommandHandler {

	@Override
	protected IContainer getTargetContainer(IFile emfsResource) {
		return emfsResource.getParent();
	}

	@Override
	protected void execute(IFile emfsFile, EmfsResource emfsResource, IContainer target) throws ExecutionException {
		ResourceSet resourceSet = new ResourceSetImpl();
		Resource xmiResource = resourceSet.createResource(URI.createURI(".xmi"));
		xmiResource.getContents().add(emfsResource);
		ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
		IProgressMonitor monitor = new NullProgressMonitor();
		try {
			xmiResource.save(outputStream, null);
			IFile xmiFile = target.getFile(new Path(emfsFile.getName() + ".xmi"));
			ByteArrayInputStream inputStream = new ByteArrayInputStream(outputStream.toByteArray());
			if (xmiFile.exists()) {
				xmiFile.setContents(inputStream, false, true, monitor);
			} else {
				xmiFile.create(inputStream, true, monitor);
			}
		} catch (IOException e1) {
		} catch (CoreException e) {
		}
	}
}
