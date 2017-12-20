package no.hal.sharing;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.resource.ResourceSet;

import no.hal.sharing.util.Util;

public abstract class AbstractSharingTransport implements SharingTransport {

	private Map<String, Collection<Subscriber>> subscribers = new HashMap<String, Collection<Subscriber>>();

	private String WILD_CARD = "*";
	
	protected String getKey(String from, String to) {
		return (from != null ? from : WILD_CARD) + "->" + (to != null ? to : WILD_CARD);
	}
	
	@Override
	public void subscribe(Subscriber subscriber, String from, String to) {
		String key = getKey(from, to);
		Collection<Subscriber> col = subscribers.get(key);
		if (col == null) {
			col = new ArrayList<SharingTransport.Subscriber>();
			subscribers.put(key, col);
		}
		if (! col.contains(subscriber)) {
			col.add(subscriber);
		}
	}

	@Override
	public void unsubscribe(Subscriber subscriber, String from, String to) {
		String key = getKey(from, to);
		Collection<Subscriber> col = subscribers.get(key);
		if (col != null && col.remove(subscriber) && col.isEmpty()) {
			subscribers.remove(key);
		}
	}

	protected void fireReceived(SharedResource shared) {
		Collection<Subscriber> notified = new ArrayList<SharingTransport.Subscriber>();
		fireReceived(subscribers.get(getKey(shared.from, shared.to)), 	shared, notified);
		fireReceived(subscribers.get(getKey(null, shared.to)), 			shared, notified);
		fireReceived(subscribers.get(getKey(shared.from, null)), 		shared, notified);
		fireReceived(subscribers.get(getKey(null, null)), 				shared, notified);
	}
	
	private void fireReceived(Collection<Subscriber> subscribers, SharedResource shared, Collection<Subscriber> notified) {
		if (subscribers != null) {
			for (Subscriber subscriber : subscribers) {
				if (! notified.contains(subscriber)) {
					notified.add(subscriber);
					subscriber.receivedResource(shared);
				}
			}
		}
	}

	protected SharedResource decodePayload(SharedResource sharedResource) {
		if (sharedResource instanceof SharedBytes) {
			ResourceSet resourceSet = Util.fromByteArray(sharedResource.getPath().lastSegment(), sharedResource.getContents());
			if (resourceSet != null) {
				sharedResource = new SharedEmfResourceSet(sharedResource.key, sharedResource.from, sharedResource.to, sharedResource.getPath(), resourceSet);
			}
		}
		return sharedResource;
	}
}
