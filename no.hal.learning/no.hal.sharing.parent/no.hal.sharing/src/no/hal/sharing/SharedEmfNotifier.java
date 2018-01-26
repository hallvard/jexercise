package no.hal.sharing;

import java.util.Map;

import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EContentAdapter;

public abstract class SharedEmfNotifier<T extends Notifier> extends AbstractSharedResource<T> {

	protected SharedEmfNotifier(String key, String from, String to, IPath path, T notifier) {
		super(key, from, to, path, notifier);
	}

	public SharedEmfNotifier(String key, String from, String to, T notifier) {
		super(key, from, to, notifier);
	}
	
	private EContentAdapter changeListener = null;

	@Override
	public void setResource(T resource) {
		T oldResource = getResource();
		if (oldResource != null && changeListener != null) {
			changeListener.unsetTarget(oldResource);
		}
		super.setResource(resource);
		if (resource != null) {
			if (changeListener == null) {
				changeListener = new EContentAdapter() {
					public void notifyChanged(Notification notification) {
						Object notifier = notification.getNotifier();
						// every change in a contained object represents a change 
						if (notifier instanceof EObject) {
							notifierChanged();
						} else
							// every change in the Resource's contents list represents a change
							if (notifier instanceof Resource && notification.getFeatureID(Resource.class) == Resource.RESOURCE__CONTENTS) {
								notifierChanged();
						}
					}
				};
			}
			changeListener.setTarget(resource);			
		}
	}

	private Map<?, ?> saveOptions;
	
	public Map<?, ?> getSaveOptions() {
		return saveOptions;
	}
	
	public void setSaveOptions(Map<?, ?> saveOptions) {
		this.saveOptions = saveOptions;
	}

	protected void notifierChanged() {
		fireContentsChanged();
	}
}
