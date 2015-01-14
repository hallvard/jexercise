package no.hal.emfs.provider;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URI;
import java.net.URISyntaxException;

import no.hal.emfs.EmfsContainer;
import no.hal.emfs.EmfsFactory;
import no.hal.emfs.EmfsFile;
import no.hal.emfs.EmfsFileContentProvider;
import no.hal.emfs.EmfsPackage;
import no.hal.emfs.EmfsResource;
import no.hal.emfs.util.EmfsResourceImpl;

import org.eclipse.core.filesystem.EFS;
import org.eclipse.core.filesystem.IFileInfo;
import org.eclipse.core.filesystem.IFileStore;
import org.eclipse.core.filesystem.provider.FileInfo;
import org.eclipse.core.filesystem.provider.FileStore;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

public class EmfsFileStore extends FileStore {

	private final EmfsFileSystem fileSystem;
	private final EmfsFileStore parent;
	
	private EmfsResource emfsResource;
	private final String path;

	public EmfsFileStore(EmfsFileSystem fileSystem, EmfsFileStore parent, EmfsResource emfsResource, String path) {
		super();
		this.fileSystem = fileSystem;
		this.parent = parent;
		this.emfsResource = emfsResource;
		if (emfsResource != null && path == null) {
			Resource emfRresource = emfsResource.eResource();
			if (emfsResource != null) {
				path = emfRresource.getURIFragment(emfsResource);
			}
		}
		this.path = path;
	}

	public EmfsResource getEmfsResource() {
		return emfsResource;
	}
	
	@Override
	public String[] childNames(int options, IProgressMonitor monitor) throws CoreException {
		if (! (getEmfsResource() instanceof EmfsContainer)) {
			return EMPTY_STRING_ARRAY;
		}
		EList<EmfsResource> children = ((EmfsContainer) getEmfsResource()).getResources();
		String[] names = new String[children.size()];
		for (int i = 0; i < names.length; i++) {
			names[i] = children.get(i).getName();
		}
		return names;
	}

	private boolean refreshEmfsResource() {
		Resource emfResource = getEmfsResource().eResource();
		if (no.hal.emfs.util.EmfsResourceImpl.changedSinceLoaded(emfResource)) {
			emfResource.unload();
			try {
				emfResource.load(null);
				EObject eObject = emfResource.getEObject(path);
				this.emfsResource = (eObject instanceof EmfsResource ? (EmfsResource) eObject : null);
			} catch (IOException e) {
			}
			return true;
		}
		return false;
	}

	@Override
	public IFileInfo fetchInfo(int options, IProgressMonitor monitor) throws CoreException {
		if (getEmfsResource() == null) {
			return null;
		}
		if (refreshEmfsResource()) {
			if (getEmfsResource() == null) {
				return null;
			}
		}
		FileInfo fileInfo = createFileInfo();
		return fileInfo;
	}

	private FileInfo createFileInfo() {
		FileInfo fileInfo = new FileInfo();
		EmfsResource emfsResource = getEmfsResource();
		String name = emfsResource.getName();
		if (name == null && emfsResource.eContainer() == null) {
			Resource emfResource = emfsResource.eResource();
			if (emfResource != null) {
				name = emfResource.getURI().trimFileExtension().lastSegment();
			}
		}
		fileInfo.setName(name);
		fileInfo.setExists(true);
		fileInfo.setDirectory(emfsResource instanceof EmfsContainer);
		fileInfo.setLength(EFS.NONE);
		fileInfo.setLastModified(emfsResource.eResource().getTimeStamp());
		fileInfo.setAttribute(EFS.ATTRIBUTE_READ_ONLY, ! emfsResource.isWriteable());
		return fileInfo;
	}

	@Override
	public IFileStore getChild(String name) {
		EmfsResource emfsResource = getEmfsResource();
		if (emfsResource instanceof EmfsContainer) {
			for (EmfsResource child : ((EmfsContainer) emfsResource).getResources()) {
				if (name.equals(child.getName())) {
					return new EmfsFileStore(fileSystem, this, child, null);
				}
			}
		}
		return new EmfsFileStore(fileSystem, this, emfsResource, new Path(path).append(name).toPortableString());
	}

	@Override
	public String getName() {
		if (path != null) {
			int pos = path.lastIndexOf(IPath.SEPARATOR);
			return (pos < 0 ? path : path.substring(pos + 1));
		}
		if (getEmfsResource() != null) {
			return getEmfsResource().getName();
		}
		return "?";
	}

	@Override
	public EmfsFileStore getParent() {
		return this.parent;
	}
	
	@Override
	public URI toURI() {
		StringBuilder buffer = new StringBuilder();
		Resource resource = (getEmfsResource() != null ? getEmfsResource().eResource() : null);
		String fragment = path;
		if (fragment == null) {
			EmfsFileStore child = this;
			while (child != null) {
				String name = child.getName();
				// skip resources without a name, see util.EmfsResourceImpl.getPathString(...)
				if (name != null) {
					if (buffer.length() > 0) {
						buffer.insert(0, IPath.SEPARATOR);
					}
					buffer.insert(0, name);
				}
				if (resource == null && child.getEmfsResource() != null) {
					resource = child.getEmfsResource().eResource();
				}
				child = child.parent;
			}
			buffer.insert(0, IPath.SEPARATOR);
			fragment = buffer.toString();
		}
		if (resource != null) {
			try {
				return new URI("emfs", null, fragment, resource.getURI().toString(), null);
			} catch (URISyntaxException e) {
			}
		}
		return null;
	}

	//

	private static String PLUGIN_ID = "no.hal.emfs.provider";

	@Override
	public InputStream openInputStream(int options, IProgressMonitor monitor) throws CoreException {
		try {
			if (getEmfsResource() instanceof EmfsFileContentProvider) {
				return ((EmfsFileContentProvider) getEmfsResource()).getInputStream(options);
			}
		} catch (Exception e) {
			throw new CoreException(new Status(Status.ERROR, PLUGIN_ID, e.getMessage(), e));
		}
		throw new CoreException(new Status(Status.ERROR, PLUGIN_ID, this + " is not a file"));
	}

	public OutputStream openOutputStream(int options, IProgressMonitor monitor) throws CoreException {
		if (getEmfsResource() == null) {
			checkShallow(this, options);
			ensureContainers(this, options);
			ensureChildResource(getParent(), EmfsPackage.eINSTANCE.getEmfsFile(), getName());
			EmfsFile emfsFile = (EmfsFile) getEmfsResource();
			if (emfsFile.getContentProvider() == null) {
				emfsFile.setContentProvider(EmfsFactory.eINSTANCE.createByteArrayContentProvider());
			}
		}
		try {
			if (getEmfsResource() instanceof EmfsFileContentProvider) {
				return ((EmfsFileContentProvider) getEmfsResource()).getOutputStream(options);
			}
		} catch (Exception e) {
			throw new CoreException(new Status(Status.ERROR, PLUGIN_ID, e.getMessage(), e));
		}
		throw new CoreException(new Status(Status.ERROR, PLUGIN_ID, this + " is not a file"));
	}

	@Override
	public void putInfo(IFileInfo info, int options, IProgressMonitor monitor) throws CoreException {
		if (! getName().equals(info.getName())) {
			if (getEmfsResource() != null) {
				getEmfsResource().setName(info.getName());
			}
		}
	}

	private void copyAttributes(IFileInfo sourceInfo, IFileInfo targetInfo, int... attributes) {
		for (int i = 0; i < attributes.length; i++) {
			int attribute = attributes[i];
			boolean value = sourceInfo.getAttribute(attribute);
			targetInfo.setAttribute(attribute, value);
		}
	}

	/*
XWRXWRXWRI000010000000000000001
1011011110000010000000000000001	1539375105
0010010110000010000000000000000	314638336

0000000111000010000000000000001	14745601
0000000110000010000000000000001	12648449
	 */
	
	private IFileInfo fixSourceInfo(IFileInfo sourceInfo, IFileStore destination) {
		if (destination instanceof EmfsFileStore) {
			return sourceInfo;
		}
		FileInfo fileInfo = createFileInfo();
		IFileInfo parentInfo = destination.getParent().fetchInfo();
		copyAttributes(parentInfo, fileInfo,
				EFS.ATTRIBUTE_READ_ONLY,
				EFS.ATTRIBUTE_OWNER_READ,	EFS.ATTRIBUTE_OWNER_WRITE,
				EFS.ATTRIBUTE_GROUP_READ,	EFS.ATTRIBUTE_GROUP_WRITE,
				EFS.ATTRIBUTE_OTHER_READ,	EFS.ATTRIBUTE_OTHER_WRITE
		);
		if (fileInfo.isDirectory()) {
			copyAttributes(parentInfo, fileInfo,
					EFS.ATTRIBUTE_OWNER_EXECUTE, EFS.ATTRIBUTE_GROUP_EXECUTE, EFS.ATTRIBUTE_OTHER_EXECUTE
			);
		}
		return fileInfo;
	}
	
	@Override
	protected void copyDirectory(IFileInfo sourceInfo, IFileStore destination, int options, IProgressMonitor monitor) throws CoreException {
		IFileInfo fileInfo = fixSourceInfo(sourceInfo, destination);
		super.copyDirectory(fileInfo, destination, options, monitor);
	}

	@Override
	protected void copyFile(IFileInfo sourceInfo, IFileStore destination, int options, IProgressMonitor monitor) throws CoreException {
		IFileInfo fileInfo = fixSourceInfo(sourceInfo, destination);
		super.copyFile(fileInfo, destination, options, monitor);
	}
	
	@Override
	public void delete(int options, IProgressMonitor monitor) throws CoreException {
		if (getEmfsResource() != null) {
			getEmfsResource().getContainer().getResources().remove(this);
		}
		super.delete(options, monitor);
	}

	@Override
	public IFileStore mkdir(int options, IProgressMonitor monitor) throws CoreException {
		ensureContainers(this, options);
		return this;
	}

	private void checkShallow(EmfsFileStore fileStore, int options) throws CoreException {
		if ((options & EFS.SHALLOW) != 0) {
			EmfsFileStore parent = fileStore.getParent();
			if (parent == null || parent.getEmfsResource() == null) {
				throw new CoreException(new Status(Status.ERROR, PLUGIN_ID, "Container does not exist"));
			}
		}
	}

	private boolean ensureChildResource(EmfsFileStore parentStore, EClass eClass, String name) throws CoreException {
		EmfsContainer container = (EmfsContainer) parentStore.getEmfsResource();
		EmfsResource emfsResource2 = EmfsResourceImpl.getEmfsResource(container, name);
		if (emfsResource2 == null) {
			EmfsResource newResource = (EmfsResource) EmfsFactory.eINSTANCE.create(eClass);
			newResource.setName(name);
			container.getResources().add(newResource);
			this.emfsResource = newResource;
		} else if (! eClass.isInstance(emfsResource2)) {
			throw new CoreException(new Status(Status.ERROR, PLUGIN_ID, name + " already exists and is not a " + eClass.getName()));
		} else {
			this.emfsResource = emfsResource2;
		}
		return true;
	}

	private boolean ensureContainers(EmfsFileStore fileStore, int options) throws CoreException {
		if (fileStore.getEmfsResource() == null) {
			checkShallow(fileStore, options);
			ensureContainers(fileStore.getParent(), options);
			return ensureChildResource(fileStore.getParent(), EmfsPackage.eINSTANCE.getEmfsContainer(), fileStore.getName());
		}
		return false;
	}
}
