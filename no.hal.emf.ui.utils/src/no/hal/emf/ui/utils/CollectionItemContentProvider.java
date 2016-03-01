package no.hal.emf.ui.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.IViewerNotification;
import org.eclipse.emf.edit.provider.ItemProvider;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;

public class CollectionItemContentProvider extends ItemProvider implements IStructuredItemContentProvider, INotifyChangedListener, ISelectionChangedListener {

	private Object object;

	public CollectionItemContentProvider(AdapterFactory adapterFactory, Object object, String text, Object image) {
		super(adapterFactory, text, image);
		this.object = object;
		updateChildren();
		if (object instanceof ISelectionProvider) {
			((ISelectionProvider) object).addSelectionChangedListener(this);
		}
	}

	public CollectionItemContentProvider(AdapterFactory adapterFactory, Object object) {
		this(adapterFactory, object, "", null);
	}
	
	@Override
	public void dispose() {
		adapterFactory = null;
		if (object instanceof ISelectionProvider) {
			((ISelectionProvider) object).removeSelectionChangedListener(this);
		}
		object = null;
		notifiers.clear();
		super.dispose();
	}

	private Collection<?> collection = null;
	
	private Collection<?> getCollection() {
		if (collection == null) {
			updateCollection();
		}
		return collection;
	}

	protected void updateCollection() {
		if (object instanceof Collection<?>) {
			collection = (Collection<?>) object;
		} else if (object instanceof Object[]) {
			collection = Arrays.asList((Object[]) object);
		} else if (object instanceof IStructuredSelection) {
			collection = ((IStructuredSelection) object).toList();
		} else if (object instanceof ISelectionProvider) {
			ISelection selection = ((ISelectionProvider) object).getSelection();
			if (selection instanceof IStructuredSelection) {
				collection = ((IStructuredSelection) selection).toList();
			}
		} else if (object != null) {
			collection = Collections.singleton(object);
		} else {
			collection = Collections.emptyList();
		}
	}
	
	private Collection<IChangeNotifier> notifiers = new ArrayList<IChangeNotifier>();

	protected void updateChildren() {
		for (IChangeNotifier notifier : notifiers) {
			notifier.removeListener(this);
		}
		notifiers.clear();
		children.clear();
		for (Object object : getCollection()) {
			IStructuredItemContentProvider contentProvider = (ITreeItemContentProvider) getAdapterFactory().adapt(object, IStructuredItemContentProvider.class);
			if (contentProvider instanceof IChangeNotifier) {
				IChangeNotifier notifier = (IChangeNotifier) contentProvider;
				notifier.addListener(this);
				notifiers.add(notifier);
			}
			children.addAll(contentProvider.getElements(object));
		}
	}
	
	public void notifyChanged(Notification notification) {
		Object element = (notification instanceof IViewerNotification ? ((IViewerNotification) notification).getElement() : notification.getNotifier());
		if (getCollection().contains(element)) {
			updateChildren();
			fireNotifyChanged(new ViewerNotification(notification, this, true, false));
		}
	}

	public void selectionChanged(SelectionChangedEvent event) {
		collection = null;
		updateChildren();
		fireNotifyChanged(new ViewerNotification(null, this, true, false));
	}
}
