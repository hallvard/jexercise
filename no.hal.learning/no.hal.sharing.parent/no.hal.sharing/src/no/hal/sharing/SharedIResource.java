package no.hal.sharing;

import java.io.InputStream;

import org.eclipse.core.filesystem.EFS;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;

public class SharedIResource extends SharedInputStream implements IResourceChangeListener {

	public SharedIResource(String key, String from, String to, IPath path) {
		super(key, from, to, path);
	}

	private IFile file = null;
	
	public SharedIResource(String key, String from, String to, IFile file) {
		super(key, from, to, file.getFullPath());
		setFile(file);
	}

	protected void setFile(IFile file) {
		if (this.file == null && file != null) {
			ResourcesPlugin.getWorkspace().addResourceChangeListener(this);
		} else if (this.file != null && file == null) {
			ResourcesPlugin.getWorkspace().removeResourceChangeListener(this);
		}
		this.file = file;
		if (file != null) {
			fireContentsChanged();
		}
	}
	
	public void dispose() {
		super.dispose();
		setFile(null);
	}

	@Override
	public InputStream getInputStream() {
		if (file == null) {
			IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
			IResource member = root.findMember(getPath());
			if (member instanceof IFile) {
				setFile((IFile) member);
			}
		}
		if (file != null) {
			try {
				return file.getContents();
			} catch (CoreException e) {
			}
		}
		return null;
	}

	@Override
	public byte[] getContents() {
		InputStream inputStream = getInputStream();
		if (inputStream != null) {
			long fileLength = -1;
			try {
				fileLength = EFS.getStore(file.getLocationURI()).fetchInfo().getLength();
			} catch (CoreException e) {
			}
			return getContents(inputStream, fileLength);
		}
		return null;
	}

	// from IResourceChangeListener

	@Override
	public void resourceChanged(IResourceChangeEvent event) {
		IResource resource = event.getResource();
		if (this.file != null && event.getType() == IResourceChangeEvent.POST_CHANGE) {
			if (resource != null && isFile(resource)) {
				fireContentsChanged();
			} else if (event.getDelta() != null) {
				resourceChanged(event.getDelta());
			}
		}
	}

	protected boolean isFile(IResource resource) {
		return this.file != null && resource != null && resource.getFullPath().equals(this.file.getFullPath());
	}
	
	protected boolean resourceChanged(IResourceDelta delta) {
		IResource resource = delta.getResource();
		if (isFile(resource) && delta.getKind() == IResourceDelta.CHANGED) {
			fireContentsChanged();
			return true;
		} else {
			for (IResourceDelta childDelta : delta.getAffectedChildren()) {
				if (resourceChanged(childDelta)) {
					return true;
				}
			}
		}
		return false;
	}
}
