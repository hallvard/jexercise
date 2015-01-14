package no.hal.emfs.ui.commands;

import java.io.File;
import java.util.Collection;

import no.hal.emfs.EmfsContainer;
import no.hal.emfs.EmfsContainerContentProvider;
import no.hal.emfs.EmfsFile;
import no.hal.emfs.EmfsResource;
import no.hal.emfs.git.GitImportSupport;
import no.hal.emfs.util.ImportSupport;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;

public class ImportCommandHandler extends EmfsCommandHandler {

	@Override
	protected IContainer getTargetContainer(IFile emfsResource) {
		return emfsResource.getProject();
	}

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
	
	@Override
	protected void execute(IFile emfsFile, final EmfsResource emfsResource, final IContainer target) throws ExecutionException {
		final int count = countEmfsResources(emfsResource);
		Job job = new Job("Import EMFS resources") {
			@Override
			protected IStatus run(IProgressMonitor monitor) {
				monitor.beginTask("Importing " + count + " EMFS resources", count);
				try {
					Options options = new Options();
					importResources(emfsResource, target, true, options, monitor);
				} catch (Exception e) {
					if (monitor != null) {
						monitor.done();
					}
					return Status.CANCEL_STATUS;
				}
				return Status.OK_STATUS;
			}
		};
		job.schedule();
	}

	public static class Options {
		public Collection<EmfsResource> exclude = null;
		public boolean recurse = true;
		public boolean ensureContainers = true;
	}

	public static void importResources(Collection<EmfsResource> emfsResources, IContainer target, Options options, IProgressMonitor monitor) throws ExecutionException {
		importResources(emfsResources, target, options.ensureContainers, options, monitor);
	}

	protected static void importResources(Collection<EmfsResource> emfsResources, IContainer target, boolean ensureContainers, Options options, IProgressMonitor monitor) throws ExecutionException {
		for (EmfsResource emfsResource : emfsResources) {
			if (ensureContainers) {
			}
			importResources(emfsResource, target, ensureContainers, options, monitor);
		}
	}

	public static IContainer ensureContainers(EmfsContainer emfsContainer, IContainer target, Options options, IProgressMonitor monitor) throws ExecutionException {
		if (emfsContainer != null) {
			target = ensureContainers(emfsContainer.getContainer(), target, options, monitor);
			target = ensureContainer(emfsContainer, target, options, monitor);
		}
		return target;
	}

	protected static IContainer ensureContainer(EmfsContainer emfsContainer, IContainer target, Options options, IProgressMonitor monitor) throws ExecutionException {
		String name = emfsContainer.getName();
		if (name != null) {
			target = ensureFolder(name, target, monitor);
		}
		if (emfsContainer.getContentProvider() != null) {
			ensureContainer(emfsContainer.getContentProvider(), target, options, monitor);
		}
		if (monitor != null) {
			monitor.worked(1);
		}
		return target;
	}

	private static ImportSupport gitImportSupport = new ImportSupport() {
		private GitImportSupport delegate;
		@Override
		public File provideImport(String spec) {
			return delegate.provideImport(spec);
		}
	};

	protected static void ensureContainer(EmfsContainerContentProvider contentProvider, IContainer target, Options options, IProgressMonitor monitor) throws ExecutionException {
		monitor.subTask("Importing");
		EList<EmfsResource> resources = contentProvider.importContent(gitImportSupport);
		importResources(resources, target, false, options, monitor);
	}

	protected static IFolder ensureFolder(String name, IContainer target, IProgressMonitor monitor) throws ExecutionException {
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

	public static void importResources(EmfsResource emfsResource, IContainer target, boolean ensureContainers, Options options, IProgressMonitor monitor) throws ExecutionException {
		if (options.exclude != null && options.exclude.contains(emfsResource)) {
			return;
		}
		if (ensureContainers) {
			target = ensureContainers(emfsResource.getContainer(), target, options, monitor);
		}
		String name = emfsResource.getName();
		if (emfsResource instanceof EmfsContainer) {
			if (name != null) {
				target = ensureContainer((EmfsContainer) emfsResource, target, options, monitor);
			}
			if (options.recurse) {
				importResources(((EmfsContainer) emfsResource).getResources(), target, false, options, monitor);
			}
		} else if (emfsResource instanceof EmfsFile) {
			if (name != null) {
				IFile file = target.getFile(new Path(name));
				if (! file.exists()) {
					try {
						file.create(((EmfsFile) emfsResource).getInputStream(IResource.NONE), true, null);
					} catch (CoreException e) {
						throwException(file, target, e, monitor);
					}
				}
			}
			if (monitor != null) {
				monitor.worked(1);
			}
		}
	}

	protected static void throwException(IResource resource, IContainer target, Exception e, IProgressMonitor monitor) throws ExecutionException {
		String resourceType = "resource";
		if (resource instanceof IFolder) {
			resourceType = "folder";
		} else if (resource instanceof IFile) {
			resourceType = "file";
		}
		monitor.setCanceled(true);
		throw new ExecutionException("Exception when creating " + resource.getName() + " " + resourceType + " in " + target.getFullPath(), e);
	}
}
