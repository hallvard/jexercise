package no.hal.learning.sharing.runtime;

import no.hal.learning.sharing.AbstractShare;

public interface SharingTransport {

	public void publish(AbstractShare share);
	
	public void subscribe(Subscriber subscriber);
	public void unsubscribe(Subscriber subscriber);
	
	public interface Subscriber {
		public void receivedShare(AbstractShare share);
	}
}
