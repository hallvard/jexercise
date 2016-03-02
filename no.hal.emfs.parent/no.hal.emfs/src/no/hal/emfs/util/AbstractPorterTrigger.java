package no.hal.emfs.util;

public class AbstractPorterTrigger<P extends AbstractPorter<?>>  {

	private P porter;
	
	public AbstractPorterTrigger(P porter) {
		setPorter(porter);
	}
	
	public P getPorter() {
		return porter;
	}

	public void setPorter(P porter) {
		this.porter = porter;
	}
}
