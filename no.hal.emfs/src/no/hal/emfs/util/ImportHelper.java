package no.hal.emfs.util;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Collection;

import no.hal.emfs.EmfsContainer;
import no.hal.emfs.EmfsContainerContentProvider;
import no.hal.emfs.EmfsFile;
import no.hal.emfs.EmfsResource;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;

public class ImportHelper extends ImportHelperOptions {

	public static int countEmfsResources(Collection<EmfsResource> emfsResources) {
		int count = 0;
		for (EmfsResource emfsResource : emfsResources) {
			count += countEmfsResources(emfsResource);
		}
		return count;
	}

	public static int countEmfsResources(EmfsResource emfsResource) {
		int count = 0;
		TreeIterator<EObject> allContents = emfsResource.eAllContents();
		while (allContents.hasNext()) {
			if (allContents.next() instanceof EmfsResource) {
				count++;
			} else {
				allContents.prune();
			}
		}
		return count;
	}

	public void importResources(Collection<EmfsResource> emfsResources, IContainer target, IProgressMonitor monitor) throws Exception {
		importResources(emfsResources, target, this.ensureContainers, monitor);
	}

	protected void importResources(Collection<EmfsResource> emfsResources, IContainer target, boolean ensureContainers, IProgressMonitor monitor) throws Exception {
		for (EmfsResource emfsResource : emfsResources) {
			if (ensureContainers) {
			}
			importResources(emfsResource, target, ensureContainers, monitor);
		}
	}

	public IContainer ensureContainers(EmfsContainer emfsContainer, IContainer target, IProgressMonitor monitor) throws Exception {
		if (emfsContainer != null) {
			target = ensureContainers(emfsContainer.getContainer(), target, monitor);
			target = ensureContainer(emfsContainer, target, monitor);
		}
		return target;
	}

	protected IContainer ensureContainer(EmfsContainer emfsContainer, IContainer target, IProgressMonitor monitor) throws Exception {
		String name = emfsContainer.getName();
		if (name != null) {
			target = ensureFolder(name, target, monitor);
		}
		if (emfsContainer.getContentProvider() != null) {
			ensureContainer(emfsContainer.getContentProvider(), target, monitor);
		}
		if (monitor != null) {
			monitor.worked(1);
		}
		return target;
	}

	protected void ensureContainer(EmfsContainerContentProvider contentProvider, IContainer target, IProgressMonitor monitor) throws Exception {
		monitor.subTask("Importing");
		if (this.importSupport != null) {
			EList<EmfsResource> resources = contentProvider.importContent(this.importSupport);
			importResources(resources, target, false, monitor);
		}
	}

	protected IFolder ensureFolder(String name, IContainer target, IProgressMonitor monitor) throws Exception {
		IFolder folder = target.getFolder(new Path(name));
		if (! folder.exists()) {
			try {
				folder.create(IResource.NONE, true, null);
			} catch (CoreException e) {
				throwException(folder, target, e, monitor);
			}
		}
		return folder;
	}
	
	private InputStream getContentInputStream(EmfsFile emfsFile) {
		if (emfsFile.getContentProvider() != null) {
			return emfsFile.getInputStream(IResource.NONE);
		} else if (createEmptyFiles || (emfsFile.isWriteable() && createEmptyWriteable)) {
			return new ByteArrayInputStream(new byte[0]);
		}
		return null;
	}

	public void importResources(EmfsResource emfsResource, IContainer target, boolean ensureContainers, IProgressMonitor monitor) throws Exception {
		if (this.exclude != null && this.exclude.contains(emfsResource)) {
			return;
		}
		if (ensureContainers) {
			target = ensureContainers(emfsResource.getContainer(), target, monitor);
		}
		String name = emfsResource.getName();
		if (emfsResource instanceof EmfsContainer) {
			if (name != null) {
				target = ensureContainer((EmfsContainer) emfsResource, target, monitor);
			}
			if (this.recurse) {
				importResources(((EmfsContainer) emfsResource).getResources(), target, false, monitor);
			}
		} else if (emfsResource instanceof EmfsFile) {
			EmfsFile emfsFile = (EmfsFile) emfsResource;
			if (name != null) {
				IFile file = target.getFile(new Path(name));
				if (! file.exists()) {
					InputStream inputStream = getContentInputStream(emfsFile);
					if (inputStream != null) {
						try {
							file.create(inputStream, true, null);
						} catch (CoreException e) {
							throwException(file, target, e, monitor);
						}
					}
				} else if (this.overwrite) {
					InputStream inputStream = getContentInputStream(emfsFile);
					if (inputStream != null) {
						file.setContents(inputStream, true, false, null);
					}
				}
			}
			if (monitor != null) {
				monitor.worked(1);
			}
		}
	}

	private static Class<?>[] exceptionConstructorClasses = { String.class, Throwable.class };
	
	protected void throwException(IResource resource, IContainer target, Exception e, IProgressMonitor monitor) throws Exception {
		String resourceType = "resource";
		if (resource instanceof IFolder) {
			resourceType = "folder";
		} else if (resource instanceof IFile) {
			resourceType = "file";
		}
		monitor.setCanceled(true);
		if (this.exceptionClass != null) {
			Object[] args = new Object[]{"Exception when creating " + resource.getName() + " " + resourceType + " in " + target.getFullPath(), e};
			throw this.exceptionClass.getConstructor(exceptionConstructorClasses).newInstance(args);
		}
	}
}
