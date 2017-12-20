package no.hal.sharing;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;

public abstract class SharedResource {

	public final String key, from, to;
	private final IPath path;
	
	public SharedResource(String key, String from, String to, IPath path) {
		super();
		this.key = key;
		this.from = from;
		this.to = to;
		this.path = path;
	}

	public SharedResource(String key, String from, String to, String path) {
		this(key, from, to, new Path(path));
	}

	protected SharedResource(String key, String from, String to) {
		this(key, from, to, (IPath) null);
	}
	
	public IPath getPath() {
		return path;
	}

	public abstract byte[] getContents();
	
	public void dispose() {
		listeners = null;
	}
	
	//

	protected abstract int toStringSize();
	
	@Override
	public String toString() {
		int resourceSize = toStringSize();
		return String.format("[%s %s: %s->%s (%s) #%s]", getClass().getSimpleName(), key, from, to, path, (resourceSize >= 0 ? resourceSize : "?"));
	}
	
	@Override
	public boolean equals(Object obj) {
		if (! (obj instanceof SharedResource)) {
			return false;
		}
		SharedResource other = (SharedResource) obj;
		if (! equals(from, other.from)) {
			return false;			
		}
		if (! equals(to, other.to)) {
			return false;			
		}
		if (! equals(path, other.path)) {
			return false;			
		}
		return true;
	}
	
	private boolean equals(Object o1, Object o2) {
		return o1 == o2 || (o1 != null && o1.equals(o2));
	}

	//
	
	public static String isValidSharedResourceKey(String s) {
		if (s.length() == 0) {
			return "String cannot be empty";
		}
		if (! Character.isJavaIdentifierStart(s.charAt(0))) {
			return "Name must start with a letter";
		}
		if (s.length() > 1) {
			for (int i = 1; i < s.length(); i++) {
				if (! Character.isJavaIdentifierPart(s.charAt(0))) {
					return "Name can only contain letters, digits and _";
				}
			}
		}
		return null;
	}

	//
	
	public interface Listener {
		public void sharedContentsChanged(SharedResource sharedResource);
	}
	
	private Collection<Listener> listeners = null;
	
	public void addListener(Listener listener) {
		if (listeners == null) {
			listeners = new ArrayList<SharedResource.Listener>();
		}
		if (! listeners.contains(listener)) {
			listeners.add(listener);
		}
	}

	public void removeListener(Listener listener) {
		if (listeners != null) {
			listeners.remove(listener);
		}
	}
	
	protected void fireContentsChanged() {
		if (listeners != null) {
			for (Listener listener : listeners) {
				listener.sharedContentsChanged(this);
			}
		}
	}
}
