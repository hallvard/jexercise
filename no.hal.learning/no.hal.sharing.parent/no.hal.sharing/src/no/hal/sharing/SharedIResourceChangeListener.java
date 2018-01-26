package no.hal.sharing;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.runtime.IPath;

public class SharedIResourceChangeListener implements IResourceChangeListener {

	private SharedResource sharedResource;
	private IPath fullPath;

	public SharedIResourceChangeListener(SharedResource sharedResource, IPath fullPath) {
		super();
		this.sharedResource = sharedResource;
		this.fullPath = fullPath;
	}
	public SharedIResourceChangeListener(SharedResource sharedResource) {
		this(sharedResource, null);
	}
	
	public void setSharedResource(SharedResource sharedResource) {
		this.sharedResource = sharedResource;
	}
	
	public void setFullPath(IPath fullPath) {
		this.fullPath = fullPath;
	}
	
	@Override
	public void resourceChanged(IResourceChangeEvent event) {
		IResource resource = event.getResource();
		if (this.fullPath != null && event.getType() == IResourceChangeEvent.POST_CHANGE) {
			if (resource != null && isFile(resource)) {
				fireContentsChanged();
			} else if (event.getDelta() != null) {
				resourceChanged(event.getDelta());
			}
		}
	}

	protected void fireContentsChanged() {
		sharedResource.fireContentsChanged();
	}

	protected boolean isFile(IResource resource) {
		return this.fullPath != null && resource != null && resource.getFullPath().equals(this.fullPath);
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
