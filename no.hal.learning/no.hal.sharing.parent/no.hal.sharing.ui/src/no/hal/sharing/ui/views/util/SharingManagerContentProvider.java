package no.hal.sharing.ui.views.util;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;

import no.hal.sharing.SharedResource;
import no.hal.sharing.SharingManager;

public class SharingManagerContentProvider implements ITreeContentProvider, SharingManager.Listener {

	private SharingManager sharingManager;
	
	public SharingManagerContentProvider(SharingManager sharingManager) {
		this.sharingManager = sharingManager;
	}
	public SharingManagerContentProvider() {
		this(null);
	}

	@Override
	public void dispose() {
		sharingManager = null;
	}

	@Override
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		if (oldInput instanceof SharingManager) {
			((SharingManager) oldInput).removeListener(this);
		}
		if (newInput instanceof SharingManager) {
			sharingManager = (SharingManager) newInput;
			sharingManager.addListener(this);
		}
	}

	@Override
	public Object[] getElements(Object inputElement) {
		Collection<String> shareKeys = sharingManager.getShareKeys();
		Collection<Object> elements = new ArrayList<Object>(shareKeys.size());
		for (String key : shareKeys) {
			elements.add(sharingManager.getSharedResource(key));
		}
		return elements.toArray();
	}

	@Override
	public Object[] getChildren(Object parentElement) {
		if (parentElement instanceof SharedResource) {
			String key = sharingManager.getSharedResourceKey((SharedResource) parentElement);
			Collection<SharedResource> derivedResources = sharingManager.getDerivedResources(key);
			return (derivedResources != null ? derivedResources.toArray() : new Object[0]);
		}
		return null;
	}

	@Override
	public Object getParent(Object element) {
		if (element instanceof SharedResource) {
			String key = sharingManager.getSharedResourceKey((SharedResource) element);
			SharedResource sharedResource = sharingManager.getSharedResource(key);
			if (sharedResource != element) {
				Collection<SharedResource> derivedResources = sharingManager.getDerivedResources(key);
				if (derivedResources != null && derivedResources.contains(sharedResource)) {
					return sharedResource;
				}
			}
		}
		return null;
	}

	@Override
	public boolean hasChildren(Object element) {
		if (element instanceof SharedResource) {
//			String key = sharingManager.getSharedResourceKey((SharedResource) element);
//			SharedResource sharedResource = sharingManager.getSharedResource(key);
//			return sharedResource == element;
		}
		return false;
	}

	//
	
	@Override
	public void shareChanged(SharingManager sharingManager, String key, int what) {
		
	}
}
