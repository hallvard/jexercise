package no.hal.sharing;

import java.util.Map;

import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
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
						notifierChanged();
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
