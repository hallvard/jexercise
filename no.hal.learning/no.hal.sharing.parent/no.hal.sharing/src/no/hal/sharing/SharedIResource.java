package no.hal.sharing;

import java.io.InputStream;

import org.eclipse.core.filesystem.EFS;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;

public class SharedIResource extends SharedInputStream {

	public SharedIResource(String key, String from, String to, IPath path) {
		super(key, from, to, path);
	}

	private IFile file = null;
	
	public SharedIResource(String key, String from, String to, IFile file) {
		super(key, from, to, file.getFullPath());
		setFile(file);
	}

	private SharedIResourceChangeListener resourceChangeListener = new SharedIResourceChangeListener(this);
	
	protected void setFile(IFile file) {
		if (this.file == null && file != null) {
			resourceChangeListener.setFullPath(file.getFullPath());
			ResourcesPlugin.getWorkspace().addResourceChangeListener(resourceChangeListener);
		} else if (this.file != null && file == null) {
			ResourcesPlugin.getWorkspace().removeResourceChangeListener(resourceChangeListener);
			resourceChangeListener.setFullPath(null);
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
}
