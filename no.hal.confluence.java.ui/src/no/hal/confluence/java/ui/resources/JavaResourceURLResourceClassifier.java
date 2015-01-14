package no.hal.confluence.java.ui.resources;

import java.net.URL;
import java.util.Collection;

import no.hal.emfs.EmfsContainer;
import no.hal.emfs.EmfsFile;
import no.hal.emfs.EmfsResource;
import no.hal.emfs.util.EmfsResourceImpl;

import org.eclipse.core.runtime.IPath;

public class JavaResourceURLResourceClassifier extends AbstractJavaClassResourceClassifier<URL> {

	@Override
	public boolean addResource(URL region, Collection<EmfsResource> roots) {
		String path = region.getPath();
		int pos = path.lastIndexOf('.');
		if (pos < 0) {
			return false;
		}
		String ext = path.substring(pos + 1);
		EmfsResource packageResource = EmfsResourceImpl.getEmfsResource(roots, path, -1);
		if (! (packageResource instanceof EmfsContainer)) {
			return false;
		}
		String[] segments = path.split(String.valueOf(IPath.SEPARATOR));
		EmfsFile file = createEmfsFile(segments[segments.length - 1], createURLContentProvider(region));
		((EmfsContainer) packageResource).getResources().add(file);
		return true;
	}
}
