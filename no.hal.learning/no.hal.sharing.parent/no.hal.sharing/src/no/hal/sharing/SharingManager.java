package no.hal.sharing;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

import org.eclipse.core.runtime.Status;

import no.hal.sharing.util.Util;

public class SharingManager implements SharedResource.Listener, SharingTransport.Subscriber, Iterable<SharedResource> {

	public SharingManager() {
	}

	private String owner = null; 

	public String getOwner() {
		if (owner == null) {
			owner = Activator.getActivator().getSharingOwner();
		}
		return owner;
	}
	
	private SharingTransport sharingTransport;

	public SharingTransport getSharingTransport() {
		return sharingTransport;
	}

	void setSharingTransport(SharingTransport sharingTransport) {
		if (this.sharingTransport != null) {
			this.sharingTransport.unsubscribe(this, null, null);
			this.sharingTransport.unsubscribe(this, null, getOwner());
		}
		this.sharingTransport = sharingTransport;
		if (this.sharingTransport != null) {
			this.sharingTransport.subscribe(this, null, null);
			this.sharingTransport.subscribe(this, null, getOwner());
		}
	}

	//

	private Map<String, ShareGroup> shares = new HashMap<String, ShareGroup>();

	public Collection<String> getShareKeys() {
		return Collections.unmodifiableCollection(shares.keySet());
	}

	public Boolean isSharing(String key) {
		ShareGroup shareGroup = getShareGroup(key);
		if (shareGroup == null) {
			return null;
		}
		byte[] bytes = shareGroup.mainResource.getContents();
		return (bytes != null && bytes.length > 0);
	}
	
	protected ShareGroup getShareGroup(String key) {
		return shares.get(key);
	}

	public SharedResource getSharedResource(String key) {
		ShareGroup shareGroup = getShareGroup(key);
		return (shareGroup != null ? shareGroup.mainResource : null);
	}
	public Collection<SharedResource> getDerivedResources(String key) {
		ShareGroup shareGroup = getShareGroup(key);
		return (shareGroup != null && shareGroup.derivedResources != null ? shareGroup.derivedResources.values() : null);
	}

	public String getSharedResourceKey(SharedResource resource) {
		return resource.key;
	}

	public ShareGroup putSharedResource(SharedResource resource) {
		String key = getSharedResourceKey(resource);
		ShareGroup shareGroup = getShareGroup(key);
		if (shareGroup == null) {
			shareGroup = new ShareGroup(resource);
			shares.put(key, shareGroup);
			fireShareChanged(key, Listener.ADDED);
		} else {
			processSharedResource(resource);
		}
		return shareGroup;
	}

	public void share(String key) {
		ShareGroup shareGroup = getShareGroup(key);
		shareGroup.mainResource.addListener(this);
		shareGroup.enabled = true;
		enqueueResource(key, true);
		fireShareChanged(key, Listener.SHARED);
	}

	// from SharedResource.Listener

	@Override
	public void sharedContentsChanged(SharedResource resource) {
		String key = getSharedResourceKey(resource);
		ShareGroup shareGroup = getShareGroup(key);
		if (shareGroup.mainResource == resource && Boolean.TRUE.equals(shareGroup.enabled)) {
			enqueueResource(key, true);
			fireShareChanged(key, Listener.UPDATED);
		}
	}

	public Boolean getEnabled(String key) {
		ShareGroup shareGroup = getShareGroup(key);
		return (shareGroup != null ? shareGroup.enabled : null);
	}

	public void setEnabled(String key, boolean enabled) {
		ShareGroup shareGroup = getShareGroup(key);
		if (shareGroup.enabled != enabled) {
			shareGroup.enabled = enabled;
			fireShareChanged(key, enabled ? Listener.ENABLED : Listener.DISABLED);
			if (enabled) {
				processOutQueue(key);
				processInQueue(key);
			}
		}
	}
	
	protected void enqueueResource(String key, boolean publish) {
		ShareGroup shareGroup = getShareGroup(key);
		Queue<SharedResource> outQueue = shareGroup.getOutQueue();
		synchronized (outQueue) {
			outQueue.add(shareGroup.mainResource);
			if (publish) {
				processOutQueue(key);
			}
		}
	}

	public void processOutQueue(String key) {
		ShareGroup shareGroup = getShareGroup(key);
		Queue<SharedResource> outQueue = shareGroup.getOutQueue();
		if (shareGroup.isEnabled()) {
			while (! outQueue.isEmpty()) {
				getSharingTransport().publishResource(outQueue.remove());
			}
		}
	}

	public void unshareResource(String key) {
		ShareGroup shareGroup = getShareGroup(key);
		shareGroup.mainResource = new SharedBytes(shareGroup.mainResource, null);
		shareGroup.mainResource.dispose();
		shareGroup.getOutQueue().clear();
		shareGroup.getInQueue().clear();
		enqueueResource(key, true);
		shareGroup.enabled = false;
		fireShareChanged(key, Listener.UNSHARED);
	}

	public void removeResource(String key) {
		unshareResource(key);
		shares.remove(key);
		fireShareChanged(key, Listener.REMOVED);
	}

	// from SharingTransport.Subscriber

	@Override
	public void receivedResource(SharedResource resource) {
		// ignore your own resources
		if (getOwner().equals(resource.from)) {
			return;
		}
		String key = getSharedResourceKey(resource);
		Util.log(this, getOwner(), Status.INFO, "Received " + key + " from " + resource.from, null);
		ShareGroup shareGroup = getShareGroup(key);
		if (shareGroup == null) {
			putSharedResource(resource);
		} else {
			Queue<SharedResource> inQueue = shareGroup.getInQueue();
			inQueue.add(resource);
			processInQueue(key);
		}
	}

	public void processInQueue(String key) {
		ShareGroup shareGroup = getShareGroup(key);
		if (shareGroup.isEnabled()) {
			Queue<SharedResource> inQueue = shareGroup.getInQueue();
			synchronized (inQueue) {
				while (! inQueue.isEmpty()) {
					SharedResource resource = inQueue.remove();
					processSharedResource(resource);
				}
			}
		}
	}

	protected void processSharedResource(SharedResource resource) {
		String key = getSharedResourceKey(resource);
		if (resource != null) {
			ShareGroup shareGroup = getShareGroup(key);
			if (shareGroup.mainResource.equals(resource)) {
				// received replacement
				shareGroup.mainResource = resource;
				acceptSharedResource(resource);
				fireShareChanged(key, Listener.UPDATED);
			} else {
				// received derived
				shareGroup.addDerivedShare(resource);
				fireShareChanged(key, Listener.DERIVED);
			}
		}
	}

	private SharedResourceReceiver resourceReceiver = new SharedResourceReceiver();
	
	public boolean acceptSharedResource(String key) {
		boolean accepted = false;
		ShareGroup shareGroup = getShareGroup(key);
		if (shareGroup != null) {
			setEnabled(key, true);
			accepted = acceptSharedResource(shareGroup.mainResource);
			fireShareChanged(key, Listener.ACCEPTED);
		}
		return accepted;
	}

	protected boolean acceptSharedResource(SharedResource resource) {
		return resourceReceiver.receiveResource(resource);
	}

	//

	public interface Listener {
		public int ADDED = 1, SHARED = 2, UPDATED = 3, ACCEPTED = 4, DERIVED = 5, ENABLED = 7, DISABLED = 8, UNSHARED = 16, REMOVED = 32;
		public void shareChanged(SharingManager sharingManager, String key, int what);
	}

	private Collection<Listener> listeners = new ArrayList<SharingManager.Listener>();

	public void addListener(Listener listener) {
		if (! listeners.contains(listener)) {
			listeners.add(listener);
		}
	}

	public void removeListener(Listener listener) {
		listeners.remove(listener);
	}

	protected void fireShareChanged(String key, int what) {
		for (Listener listener : listeners) {
			listener.shareChanged(this, key, what);
		}
	}

	//

	@Override
	public Iterator<SharedResource> iterator() {

		return new Iterator<SharedResource>() {

			private Iterator<String> delegate = shares.keySet().iterator();

			@Override
			public boolean hasNext() {
				return delegate.hasNext();
			}

			@Override
			public SharedResource next() {
				ShareGroup shareGroup = shares.get(delegate.next());
				return shareGroup.mainResource;
			}
			
			@Override
			public void remove() {
				throw new UnsupportedOperationException("remove() not supported by " + this);
			}
		};
	}

	//
	
	private static class ShareGroup implements Iterable<SharedResource> {

		private SharedResource mainResource;
		private Map<String, SharedResource> derivedResources;

		private Queue<SharedResource> inQueue;
		private Queue<SharedResource> outQueue;
		
		private Queue<SharedResource> getInQueue() {
			if (inQueue == null) {
				inQueue = new LinkedList<SharedResource>();
			}
			return inQueue;
		}

		private Queue<SharedResource> getOutQueue() {
			if (outQueue == null) {
				outQueue = new LinkedList<SharedResource>();
			}
			return outQueue;
		}

		private Boolean enabled = false;

		public boolean isEnabled() {
			return Boolean.TRUE.equals(enabled);
		}	
		
		private ShareGroup(SharedResource resource) {
			this.mainResource = resource;
		}

		private void addDerivedShare(SharedResource resource) {
			if (derivedResources == null) {
				derivedResources = new HashMap<String, SharedResource>();
			}
			derivedResources.put(resource.from, resource);
		}
		
		//
		
		@Override
		public Iterator<SharedResource> iterator() {
			Collection<SharedResource> shares = new ArrayList<SharedResource>(1 + (derivedResources != null ? derivedResources.size() : 0));
			shares.add(mainResource);
			if (derivedResources != null) {
				shares.addAll(derivedResources.values());
			}
			return shares.iterator();
		}
	}
}
