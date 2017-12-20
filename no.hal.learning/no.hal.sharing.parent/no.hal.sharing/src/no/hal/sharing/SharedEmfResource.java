package no.hal.sharing;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;

public class SharedEmfResource extends SharedEmfNotifier<Resource> {

	public SharedEmfResource(String key, String from, String to, IPath path, Resource resource) {
		super(key, from, to, path, resource);
	}

	public SharedEmfResource(String key, String from, String to, Resource resource) {
		super(key, from, to, resource);
	}

	@Override
	protected int toStringSize() {
		return getResource().getContents().size();
	}

	@Override
	public void dispose() {
		Resource resource = getResource();
		super.dispose();
		resource.unload();
	}
	
	@Override
	public IPath getPath() {
		if (isDisposed()) {
			return null;
		}
		URI uri = getResource().getURI();
		IPath path = getPath(uri);
		return path != null ? path : super.getPath();
	}
	
	static IPath getPath(URI uri) {
		String path = null;
		if (uri.isPlatform()) {
			path = uri.toPlatformString(true);
		} else {
			path = uri.path();
		}
		return path != null ? new Path(path) : null;
	}

	@Override
	protected byte[] getContents(Resource resource) {
		ByteArrayOutputStream output = new ByteArrayOutputStream();
		try {
			resource.save(output, getSaveOptions());
			output.close();
			return output.toByteArray();
		} catch (IOException e) {
		}
		return null;
	}
}
