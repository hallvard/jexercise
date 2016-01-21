package no.hal.learning.sharing.util;

import java.util.Arrays;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

public class Util {

	public static Resource createSerializableResource(URI uri, EObject... contents) {
		Resource resource = Resource.Factory.Registry.INSTANCE.getFactory(uri).createResource(uri);
		resource.getContents().addAll(Arrays.asList(contents));
		return resource;
	}
}
