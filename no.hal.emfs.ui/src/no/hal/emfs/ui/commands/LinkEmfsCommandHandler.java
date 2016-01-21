package no.hal.emfs.ui.commands;

import java.net.URI;

import no.hal.emfs.EmfsContainer;
import no.hal.emfs.EmfsFile;
import no.hal.emfs.EmfsResource;
import no.hal.emfs.util.EmfsResourceImpl;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;

public class LinkCommandHandler extends EmfsCommandHandler {

	@Override
	protected IContainer getTargetContainer(IFile emfsResource) {
		return emfsResource.getParent();
	}

	@Override
	protected void execute(IFile emfsFile, EmfsResource emfsResource, IContainer target) throws ExecutionException {
		int count = 0;
		TreeIterator<EObject> allContents = emfsResource.eAllContents();
		while (allContents.hasNext()) {
			if (allContents.next() instanceof EmfsResource) {
				count++;
			} else {
				allContents.prune();
			}
		}
		IProgressMonitor monitor = new NullProgressMonitor();
		if (monitor != null) {
			monitor.beginTask("Importing " + count + " EMFS resources", count);
		}
		try {
			linkResources(emfsFile, emfsResource, target, false, monitor);
		} catch (Exception e) {
			if (monitor != null) {
				monitor.done();
			}
		}
	}
	
	public static void linkResources(IFile emfsFile, EmfsResource emfsResource, IContainer target, boolean renameEmfsFile, IProgressMonitor monitor) throws ExecutionException {
		String name = emfsFile.getName();
		if (renameEmfsFile) {
			IPath newPath = new Path("." + name);
			try {
				emfsFile.move(newPath, true, monitor);
				emfsFile = emfsFile.getParent().getFile(newPath);
			} catch (CoreException e) {
				throwException(emfsFile, "renaming", target, e, monitor);
			}
		}
		URI uri = emfsFile.getLocationURI();
		try {
			URI emfsUri = new URI(EmfsResourceImpl.EMFS_SCHEME, null, "/", uri.toString(), null);
			int updateFlags = IResource.ALLOW_MISSING_LOCAL;
			IPath linkPath = new Path(name).removeFileExtension();
			if (emfsResource instanceof EmfsContainer) {
				IFolder folder = target.getFolder(linkPath);
				folder.createLink(emfsUri, updateFlags, monitor);
			} else if (emfsResource instanceof EmfsFile) {
				IFile file = target.getFile(linkPath);
				file.createLink(emfsUri, updateFlags, monitor);
			}
		} catch (Exception e) {
			throwException(emfsFile, "linking to", target, e, monitor);
		}
	}

	protected static void throwException(IFile emfsFile, String verb, IContainer target, Exception e, IProgressMonitor monitor) throws ExecutionException {
		e.printStackTrace(System.out);
		monitor.setCanceled(true);
		throw new ExecutionException("Exception when " + verb + " " + emfsFile.getName() + " in " + target.getFullPath(), e);
	}
}
