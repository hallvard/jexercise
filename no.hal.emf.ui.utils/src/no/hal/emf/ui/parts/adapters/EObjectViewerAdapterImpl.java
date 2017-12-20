package no.hal.emf.ui.parts.adapters;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.graphics.Resource;
import org.eclipse.swt.widgets.Control;

public abstract class EObjectViewerAdapterImpl<E extends EObject, V extends Control> extends AdapterImpl implements EObjectViewerAdapter<E, V>, DisposeListener {

	protected final E eObject;
	private V view;

	private EObjectViewerAdapterHelper adapterHelper;
	
	public EObjectViewerAdapterImpl(E eObject) {
		this.eObject = eObject;
	}

	public V getView() {
		return view;
	}
	
	protected void setView(V view) {
		this.view = view;
		this.view.addDisposeListener(this);
	}
	
	@Override
	public void widgetDisposed(DisposeEvent event) {
		if (event.widget == getView() && (! isDisposed())) {
			dispose();
		}
	}
	
	public boolean isDisposed() {
		return getView() == null;
	}
	
	@Override
	public void dispose() {
		if (this.view != null) {
			this.view.removeDisposeListener(this);
			this.view = null;
			this.eObject.eAdapters().remove(this);
		}
	}
	
	protected void dispose(Resource resource) {
		if (resource != null && (! resource.isDisposed())) {
			resource.dispose();
		}
	}

	@Override
	public void setAdapterHelper(EObjectViewerAdapterHelper adapterHelper) {
		this.adapterHelper = adapterHelper;
	}

	protected EObjectViewerAdapterHelper getAdapterHelper() {
		return adapterHelper;
	}
	
	protected void asyncExec(Runnable runnable) {
		if (! getView().isDisposed()) {
			getView().getDisplay().asyncExec(runnable);
		}
	}

	// Adapter
	
	@Override
	public boolean isAdapterForType(Object type) {
		return (type instanceof Class<?> && ((Class<?>) type).isInstance(this));
	}

	protected boolean isChangeNotification(Notification notification) {
		return notification.getNotifier() == eObject;
	}
	
	@Override
	public void notifyChanged(Notification notification) {
		if ((! notification.isTouch()) && isChangeNotification(notification)) {
			V view = getView();
			if (view != null && (! isDisposed())) {
				asyncExec(new Runnable() {
					public void run() {
						updateView();						
					}
				});
			}
		}
	}
}
