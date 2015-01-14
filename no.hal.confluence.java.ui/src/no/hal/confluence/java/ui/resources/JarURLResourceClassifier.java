package no.hal.confluence.java.ui.resources;

import java.net.URL;
import java.util.Collection;

import no.hal.confluence.ui.resources.AbstractEmfsResourceClassifier;
import no.hal.emfs.EmfsFile;
import no.hal.emfs.EmfsResource;

import org.eclipse.core.runtime.IPath;

public class JarURLResourceClassifier extends AbstractEmfsResourceClassifier<URL> {

	@Override
	public boolean addResource(URL region, Collection<EmfsResource> roots) {
		String path = region.getPath();
		if (! path.endsWith(".jar")) {
			return false;
		}
		String[] segments = path.split(String.valueOf(IPath.SEPARATOR));
		EmfsFile file = createEmfsFile(segments[segments.length - 1], createURLContentProvider(region));
		roots.add(file);
		return true;
	}
}
