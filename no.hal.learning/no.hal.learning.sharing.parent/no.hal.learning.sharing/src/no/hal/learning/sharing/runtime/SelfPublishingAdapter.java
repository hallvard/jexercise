package no.hal.learning.sharing.runtime;

import java.util.Collection;
import java.util.Collections;

import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EObject;

public class SelfPublishingAdapter extends AdapterImpl implements PublishingAdapter {

	@Override
	public Collection<? extends EObject> getShareObjects(EObject eObject) {
		return Collections.singletonList(eObject);
	}
}
