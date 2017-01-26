package no.hal.learning.exercise.views;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IResourceDeltaVisitor;
import org.eclipse.core.runtime.CoreException;

public abstract class FileChangeHandler implements IResourceChangeListener, IResourceDeltaVisitor {
	
	private String fileExtension = null;
	
	protected FileChangeHandler(String fileExtension) {
		this.fileExtension = fileExtension;
	}

	@Override
	public void resourceChanged(IResourceChangeEvent event) {
		try {
			event.getDelta().accept(this);
		} catch (CoreException e) {
		}
	}

	@Override
	public boolean visit(IResourceDelta delta) throws CoreException {
		IResource resource = delta.getResource();
		if (delta.getKind() == IResourceDelta.CHANGED && resource instanceof IFile) {
			IFile file = (IFile) resource;
			if (acceptPath(file)) {
				fileChanged(file);
			}
			return false;
		}
		return true;
	}

	public boolean acceptPath(IFile file) {
		return (fileExtension == null || fileExtension.equals(file.getFileExtension()));
	}

	protected abstract void fileChanged(IFile file);
}
