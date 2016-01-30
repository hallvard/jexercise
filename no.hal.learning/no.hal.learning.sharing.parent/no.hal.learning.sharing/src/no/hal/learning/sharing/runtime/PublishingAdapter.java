package no.hal.learning.sharing.runtime;

import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.ecore.EObject;

public interface PublishingAdapter extends Adapter {

	public Collection<? extends EObject> getShareObjects(EObject eObject);
}
