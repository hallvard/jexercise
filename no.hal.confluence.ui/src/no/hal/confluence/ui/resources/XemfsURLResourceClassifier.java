package no.hal.confluence.ui.resources;

import java.net.URL;
import java.util.Collection;

import no.hal.emfs.EmfsResource;

import org.eclipse.emf.common.util.URI;

public class XemfsURLResourceClassifier extends AbstractEmfsResourceClassifier<URL> {

	@Override
	public boolean addResource(URL region, Collection<EmfsResource> roots) {
		String path = region.getPath();
		if (! path.endsWith(".xemfs")) {
			return false;
		}
		EmfsResource emfsResource = XemfsResourceClassifier.readXemfsResource(URI.createURI(region.toString()), null);
		return XemfsResourceClassifier.addXemfsResource(emfsResource, roots, true, true);
	}
}
