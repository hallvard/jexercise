package no.hal.sharing;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Writer;

import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.paho.client.mqttv3.MqttClient;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

import no.hal.sharing.mqtt.MqttSharingTransport;

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
		if (publisingManager != null) {
			publisingManager.dispose();
		}
		if (subscribingManager != null) {
			subscribingManager.dispose();
		}
		this.context = null;
		Activator.activator = null;
	}

	public String getSharingOwner() {
		IPath path = Platform.getStateLocation(Activator.getActivator().getContext().getBundle());
		return getSharingOwner(path);
	}

	private String ownerIdPath = "/ownerId.txt";

	private String getSharingOwner(IPath path) {
		File ownerFile = new File(path.append(new Path(ownerIdPath)).toOSString());
		String owner = null;
		try {
			if (! ownerFile.exists()) {
				owner = MqttClient.generateClientId();
				Writer writer = new FileWriter(ownerFile);
				writer.write(owner);
				writer.close();
			} else {
				BufferedReader reader = new BufferedReader(new FileReader(ownerFile));
				owner = reader.readLine();
				reader.close();
			}
		} catch (Exception e) {
			System.err.println("Exception when handling " + ownerFile + ": " + e);
		}
		return owner;
	}
	
	private SharingTransport sharingTransport;
	private SharingManager publisingManager, subscribingManager;
	
	private SharingTransport getSharingTransport() {
		if (sharingTransport == null) {
			sharingTransport = new MqttSharingTransport(getSharingOwner());
//			sharingTransport = new LoopbackSharingTransport();
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
