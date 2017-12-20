package no.hal.sharing;

import org.eclipse.core.runtime.IPath;

public abstract class AbstractSharedResource<T> extends SharedResource {

	private T resource;
	
	protected AbstractSharedResource(String key, String from, String to, IPath path, T resource) {
		super(key, from, to, path);
		setResource(resource);
	}

	protected AbstractSharedResource(String key, String from, String to, T resource) {
		this(key, from, to, null, resource);
	}

	public T getResource() {
		return resource;
	}
	
	public void setResource(T resource) {
		this.resource = resource;
		if (resource != null) {
			fireContentsChanged();
		}
	}
	
	protected boolean isDisposed() {
		return getResource() == null;
	}

	public void dispose() {
		super.dispose();
		setResource(null);
	}
	
	protected abstract byte[] getContents(T resource);
	
	@Override
	public byte[] getContents() {
		try {
			return getContents(resource);
		} catch (Exception e) {
		}
		return null;
	}
}
