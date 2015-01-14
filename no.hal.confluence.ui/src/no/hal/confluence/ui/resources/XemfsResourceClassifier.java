package no.hal.confluence.ui.resources;

import java.io.IOException;
import java.io.InputStream;
import java.io.StringBufferInputStream;
import java.util.Collection;

import no.hal.emfs.EmfsContainer;
import no.hal.emfs.EmfsPackage;
import no.hal.emfs.EmfsResource;
import no.hal.emfs.util.EmfsResourceImpl;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.Resource.Factory;
import org.eclipse.emf.ecore.util.EcoreUtil;

public class XemfsResourceClassifier extends AbstractEmfsResourceClassifier<String> {

	@Override
	public boolean addResource(String region, Collection<EmfsResource> roots) {
		if (! region.startsWith("emfs")) {
			return false;
		}
		EmfsResource emfsResource = readXemfsResource(region);
		return addXemfsResource(emfsResource, roots, true, true);
	}

	public static EmfsResource readXemfsResource(String source) {
		source = source.trim();
		if ((! source.startsWith("emfs")) && (! source.startsWith("/"))) {
			source = "/" + source;
		}
		if (! source.contains(";")) {
			source = source + ";";
		}
		InputStream input = new StringBufferInputStream(source);
		return readXemfsResource(URI.createURI("temp.xemfs"), input);
	}

	public static EmfsResource readXemfsResource(URI uri, InputStream input) {
		Factory factory = Resource.Factory.Registry.INSTANCE.getFactory(uri);
		Resource emfResource = factory.createResource(uri);
		try {
			if (input != null) {
				emfResource.load(input, null);
			} else {
				emfResource.load(null);
			}
			EmfsResource emfsResource = (EmfsResource) EcoreUtil.getObjectByType(emfResource.getContents(), EmfsPackage.eINSTANCE.getEmfsResource());
			if (emfsResource instanceof EmfsContainer && emfsResource.getName() == null) {
				EList<EmfsResource> emfsResources = ((EmfsContainer) emfsResource).getResources();
				if (emfsResources.size() == 1) {
					return emfsResources.get(0);
				}
			}
			return emfsResource;
		} catch (IOException e) {
		}
		return null;
	}

	
	public static EmfsResource readXemfsResourceInComment(String region, String commentPrefix, String fileSuffix) {
		if (! (region.contains(commentPrefix) && region.contains(fileSuffix))) {
			return null;
		}
		int start = 0;
		while (start < region.length()) {
			int end = region.indexOf('\n', start);
			if (end < 0) {
				end = region.length();
			}
			String line = region.substring(start, end).trim();
			if (line.startsWith(commentPrefix) && line.contains(fileSuffix)) {
				return XemfsResourceClassifier.readXemfsResource(line.substring(1));
			}
			start = end + 1;
		}
		return null;
	}
		
	public static boolean addXemfsResource(EmfsResource emfsResource, Collection<EmfsResource> roots, boolean mergeInto, boolean sameTags) {
		if (emfsResource instanceof EmfsContainer && emfsResource.getName() == null) {
			for (EmfsResource child : ((EmfsContainer) emfsResource).getResources()) {
				addXemfsResource(child, roots, mergeInto, sameTags);
			}
		} else if (mergeInto) {
			EmfsResourceImpl.mergeInto(emfsResource, roots, sameTags);
		} else {
			roots.add(emfsResource);
		}
		return true;
	}
}
