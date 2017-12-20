package no.hal.sharing;

import org.eclipse.core.runtime.IPath;

public class SharedBytes extends SharedResource {

	private byte[] contents;
	
	public SharedBytes(String key, String from, String to, IPath path, byte[] bytes) {
		super(key, from, to, path);
		contents = bytes;
	}

	public SharedBytes(String key, String from, String to, IPath path, String s) {
		this(key, from, to, path, s.getBytes());
	}

	public SharedBytes(SharedResource resource, IPath path, byte[] bytes) {
		this(resource.key, resource.from, resource.to, path, bytes);
	}
	
	public SharedBytes(SharedResource resource, byte[] bytes) {
		this(resource, resource.getPath(), bytes);
	}

	@Override
	protected int toStringSize() {
		byte[] bytes = getContents();
		return bytes != null ? bytes.length : 0;
	}

	@Override
	public byte[] getContents() {
		return contents;
	}
}
