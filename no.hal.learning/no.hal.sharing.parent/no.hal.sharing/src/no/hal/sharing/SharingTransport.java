package no.hal.sharing;

public interface SharingTransport {

	public void publishResource(SharedResource shared);
	
	public void subscribe(Subscriber subscriber, String from, String to);
	public void unsubscribe(Subscriber subscriber, String from, String to);
	
	public interface Subscriber {
		public void receivedResource(SharedResource shared);
	}
}
