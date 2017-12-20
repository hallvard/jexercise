package no.hal.sharing;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;

import org.eclipse.core.runtime.IPath;

public abstract class SharedInputStream extends SharedResource {

	public SharedInputStream(String key, String from, String to, IPath path) {
		super(key, from, to, path);
	}

	public abstract InputStream getInputStream();

	@Override
	protected int toStringSize() {
		return -1;
	}

	@Override
	public byte[] getContents() {
		InputStream inputStream = getInputStream();
		return (inputStream != null ? getContents(inputStream, -1) : null);
	}
	
	public static byte[] getContents(InputStream input, long sizeHint) {
		int bufSize = (sizeHint >= 0 && sizeHint <= Integer.MAX_VALUE ? (int) sizeHint : 10240);
		ByteArrayOutputStream output = null;
		byte[] buffer = new byte[bufSize];
		int chunkLength = 0;
		try {
			while ((chunkLength = input.read(buffer)) >= 0) {
				if (chunkLength == sizeHint) {
					return buffer;
				}
				if (output == null) {
					output = new ByteArrayOutputStream(bufSize);
				}
				output.write(buffer, 0, chunkLength);
			}
			return output.toByteArray();
		} catch (Exception e) {
			return null;
		}
	}
}
