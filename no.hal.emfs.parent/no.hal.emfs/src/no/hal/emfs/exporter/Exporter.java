package no.hal.emfs.exporter;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Collection;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.EcoreUtil;

import no.hal.emfs.EmfsContainer;
import no.hal.emfs.EmfsContainerContentProvider;
import no.hal.emfs.EmfsFile;
import no.hal.emfs.EmfsResource;
import no.hal.emfs.Property;
import no.hal.emfs.sync.ExportRule;
import no.hal.emfs.sync.ExportSpec;
import no.hal.emfs.util.AbstractPorter;

public class Exporter extends AbstractPorter<ExportRule> {

	public Exporter(ExportSpec spec) {
		super(spec);
	}

	private ExportSupport exportSupport;

	public void setExportSupport(ExportSupport exportSupport) {
		this.exportSupport = exportSupport;
	}
	
	public int exportResources(IProgressMonitor monitor) {
		return
			exportResources(spec.getResources(), monitor) +
			exportResources(spec.getResourceRefs(), monitor);
	}
	
	public int exportResources(Collection<EmfsResource> emfsResources, IProgressMonitor monitor) {
		int count = 0; 
		for (EmfsResource emfsResource : emfsResources) {
			count += exportResources(emfsResource, null, monitor);
		}
		return count;
	}

	public int exportResources(EmfsResource emfsResource, IContainer container, IProgressMonitor monitor) {
		int count = 0;
		IPath fullPath = new Path(emfsResource.getFullPath());
		IPath rootPath = getRootPath();
		ExportRule rule = findMostSpecificRule(getRules(), rootPath, rootPath.segmentCount());
		if (rule == null) {
			return count;
		}
		IResource resource = null;
		if (isIncluding(rule)) {
			IPath path = getTargetPath(fullPath, rule);
			try {
				if (container == null) {
					container = getRootContainer();
					if (emfsResource.getContainer() != null) {
						container = ensureContainers(emfsResource.getContainer(), container, monitor);
					}
				}
				String resourceName = path.lastSegment();
				if (resourceName != null) {
					if (emfsResource instanceof EmfsContainer) {
						resource = ensureFolder((EmfsContainer) emfsResource, container, monitor);
					} else if (emfsResource instanceof EmfsFile) {
						IFile file = container.getFile(new Path(resourceName));
						ensureFile((EmfsFile) emfsResource, file, container, monitor);
						count++;
						resource = file;
					} else {
						return count;
					}
					initResource(resource, emfsResource, rule, true);
				}
			} catch (Exception e) {
			}
		}
		if (emfsResource instanceof EmfsContainer) {
			for (EmfsResource childResource : ((EmfsContainer) emfsResource).getResources()) {
				count += exportResources(childResource, (resource instanceof IContainer ? (IContainer) resource : null), monitor);				
			}
		}
		return count;
	}

	//

	protected void initResource(IResource resource, EmfsResource emfsResource, ExportRule exportRule, boolean applyContainers) {
		EList<String> tags = new BasicEList<String>(emfsResource.getTags());
		EList<Property> properties = new BasicEList<Property>(EcoreUtil.copyAll(emfsResource.getProperties()));
		applyRules(exportRule, emfsResource, applyContainers, tags, properties);
	}

	protected void initResource(IResource resource, EmfsResource emfsResource, Collection<String> tags, Collection<Property> properties) {
	}

	//

	public IContainer ensureContainers(EmfsContainer emfsContainer, IContainer target, IProgressMonitor monitor) throws Exception {
		if (emfsContainer != null) {
			target = ensureContainers(emfsContainer.getContainer(), target, monitor);
			target = ensureContainer(emfsContainer, target, monitor);
		}
		return target;
	}

	protected IContainer ensureContainer(EmfsContainer emfsContainer, IContainer target, IProgressMonitor monitor) throws Exception {
		if (emfsContainer.getName() != null) {
			target = ensureFolder(emfsContainer, target, monitor);
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
		if (this.exportSupport != null) {
			EList<EmfsResource> resources = contentProvider.importContent(this.exportSupport);
			exportResources(resources, monitor);
		}
	}

	protected IContainer ensureFolder(EmfsContainer emfsContainer, IContainer target, IProgressMonitor monitor) throws Exception {
		String name = emfsContainer.getName();
		IResource member = target.findMember(name);
		if (member instanceof IContainer) {
			return (IContainer) member;
		}
		// must create a new IContainer
		if (target instanceof IWorkspaceRoot) {
			IProject project = ((IWorkspaceRoot) target).getProject(name);
			try {
				project.create(null);
				project.open(null);
				fireResourceHandled(emfsContainer, project, Listener.HANDLED | Listener.EXPORTED);
			} catch (Exception e) {
				throwException(project, target, e, monitor);
			}
			return project;
		} else {
			IFolder folder = target.getFolder(new Path(name));
			if (folder.exists()) {
				fireResourceHandled(emfsContainer, folder, Listener.HANDLED | Listener.EXPORTED | Listener.UPDATED);
			} else {
				try {
					folder.create(IResource.NONE, true, null);
					fireResourceHandled(emfsContainer, folder, Listener.HANDLED | Listener.EXPORTED | Listener.CREATED);
				} catch (CoreException e) {
					throwException(folder, target, e, monitor);
				}
			}
			return folder;
		}
	}

	private boolean createEmptyFiles = true;
	private boolean overwriteFiles = true;
	
	protected InputStream getContentInputStream(EmfsFile emfsFile) {
		if (emfsFile.getContentProvider() != null) {
			return emfsFile.getInputStream(IResource.NONE);
		} else if (createEmptyFiles) {
			return new ByteArrayInputStream(new byte[0]);
		}
		return null;
	}

	protected void ensureFile(EmfsFile emfsFile, IFile file, IContainer target, IProgressMonitor monitor) throws Exception {
		if (! file.exists()) {
			InputStream inputStream = getContentInputStream(emfsFile);
			if (inputStream != null) {
				try {
					file.create(inputStream, true, null);
					fireResourceHandled(emfsFile, file, Listener.HANDLED | Listener.EXPORTED | Listener.CREATED);
				} catch (CoreException e) {
					throwException(file, target, e, monitor);
				}
			}
		} else if (this.overwriteFiles) {
			InputStream inputStream = getContentInputStream(emfsFile);
			if (inputStream != null) {
				file.setContents(inputStream, true, false, null);
				fireResourceHandled(emfsFile, file, Listener.HANDLED | Listener.EXPORTED | Listener.UPDATED);
			}
		}
	}

	//

	private Class<? extends Exception> exceptionClass;

	public void setExceptionClass(Class<? extends Exception> exceptionClass) {
		this.exceptionClass = exceptionClass;
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
