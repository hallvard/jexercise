package no.hal.sharing;

import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.Resource.Factory;

public class SelfPublishingAdapter extends AdapterImpl implements PublishingAdapter {

	@Override
	public Resource getSharedResource(EObject eObject) {
		Resource resource = eObject.eResource();
		if (resource == null) {
			URI uri = URI.createURI("temp.xmi");
			resource = createEObjectResource(eObject, uri);
		}
		return resource;
	}

	public static Resource createEObjectResource(EObject eObject, URI uri) {
		Factory factory = Resource.Factory.Registry.INSTANCE.getFactory(uri);
		Resource resource = factory.createResource(uri);
		resource.getContents().add(eObject);
		return resource;
	}
}
