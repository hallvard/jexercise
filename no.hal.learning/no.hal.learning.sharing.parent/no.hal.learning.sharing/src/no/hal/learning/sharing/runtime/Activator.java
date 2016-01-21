package no.hal.learning.sharing.runtime;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

import no.hal.learning.sharing.runtime.mqtt.MqttSharingTransport;

public class Activator implements BundleActivator {

	private static Activator activator;

	public static Activator getActivator() {
		return activator;
	}
	
	private BundleContext context;

	public BundleContext getContext() {
		return context;
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext)
	 */
	@Override
	public void start(BundleContext bundleContext) throws Exception {
		Activator.activator = this;
		this.context = bundleContext;
	}

	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	@Override
	public void stop(BundleContext bundleContext) throws Exception {
		this.context = null;
		Activator.activator = null;
	}
	
	private SharingTransport sharingTransport;
	private SharingManager publisingManager, subscribingManager;
	
	private SharingTransport getSharingTransport() {
		if (sharingTransport == null) {
			sharingTransport = new MqttSharingTransport(); // new LoopbackSharingTransport();
		}
		return sharingTransport;
	}

	public SharingManager getPublisingManager() {
		if (publisingManager == null) {
			publisingManager = new SharingManager();
			publisingManager.setSharingTransport(getSharingTransport());
		}
		return publisingManager;
	}
	
	public SharingManager getSubscribingManager() {
		if (subscribingManager == null) {
			subscribingManager = new SharingManager();
			subscribingManager.setSharingTransport(getSharingTransport());
		}
		return subscribingManager;
	}	
}
