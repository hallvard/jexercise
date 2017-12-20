package no.hal.sharing;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

public interface PublishingAdapter extends Adapter {

	public Resource getSharedResource(EObject eObject);
}
