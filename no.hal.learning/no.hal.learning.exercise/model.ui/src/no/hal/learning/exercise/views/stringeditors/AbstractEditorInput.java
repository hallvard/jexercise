package no.hal.learning.exercise.views.stringeditors;

import org.eclipse.core.resources.IStorage;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IPersistableElement;
import org.eclipse.ui.IStorageEditorInput;
import org.eclipse.ui.PlatformUI;

public abstract class AbstractEditorInput implements IEditorInput, IStorage, IStorageEditorInput {

	private final IPath path;
	
	public AbstractEditorInput(IPath path) {
		this.path = path;
	}
	
	@Override
	public <T> T getAdapter(Class<T> adapter) {
		return null;
	}

	// IStorage

	@Override
	public IPath getFullPath() {
		return path;
	}

	@Override
	public String getName() {
		return path.lastSegment();
	}

	@Override
	public boolean isReadOnly() {
		return true;
	}
	
	// IEditorInput

	@Override
	public boolean exists() {
		return false;
	}

	@Override
	public ImageDescriptor getImageDescriptor() {
		return PlatformUI.getWorkbench().getEditorRegistry().getImageDescriptor(path.lastSegment(), null);
	}

	@Override
	public IPersistableElement getPersistable() {
		return null;
	}

	@Override
	public String getToolTipText() {
		return getName();
	}

	// IStorageEditorInput
	
	@Override
	public IStorage getStorage() throws CoreException {
		return this;
	}
}
