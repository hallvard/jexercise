package no.hal.learning.exercise.logging;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.util.URI;
import org.eclipse.paho.client.mqttv3.IMqttToken;
import org.eclipse.paho.client.mqttv3.MqttAsyncClient;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.eclipse.paho.client.mqttv3.MqttPersistenceException;

public class ExLogger {

	private final String clientId;
	private final String topic;
	
	public ExLogger(String clientId, String topic) {
		this.clientId = clientId;
		this.topic = topic;
	}

	private Map<URI, byte[]> resources = new HashMap<URI, byte[]>();
	
	private Job loggerJob = new Job(this.getClass().getName()) {

		@Override
		protected IStatus run(IProgressMonitor monitor) {
			Map<URI, byte[]> resources = null;
			synchronized (ExLogger.this.resources) {
				resources = new HashMap<URI, byte[]>(ExLogger.this.resources);
				ExLogger.this.resources.clear();
			}
			log(resources);
			return new Status(IStatus.OK, "no.hal.learning.exercise.model.ui", "Logged " + resources.size() + " resources!");
		}
	};
	
	public void enqueue(URI uri, byte[] resource) {
		boolean wasEmpty = false;
		synchronized (resources) {
			wasEmpty = resources.isEmpty();
			resources.put(uri, resource);
		}
		if (wasEmpty) {
//			System.out.println("Scheduling @ " + 30 * 1000);
			loggerJob.schedule(30 * 1000);
		}
	}
	
	protected void log(Map<URI, byte[]> resources) {
//		System.out.println("Logging " + resources.size() + " resources");
		for (URI uri : resources.keySet()) {
			if (uri.isPlatformResource()) {
				System.out.println("Logging " + uri);
				String subTopic = topic;
				String[] segments = uri.segments();
				// skip "resource", project name and source folder segments
				for (int i = 3; i < segments.length; i++) {
					subTopic += "/" + segments[i];
				}
				subTopic += "/" + clientId.hashCode();
				log(subTopic, resources.get(uri));
			}
		}
	}

	protected void log(String subTopic, byte[] bs) {
		try {
			MqttAsyncClient mqttClient = getMqttClient();
			if (mqttClient.isConnected()) {
//				System.out.println("Logging " + bs.length + " bytes to " + subTopic);
				mqttClient.publish(subTopic, bs, 0, true);
				mqttClient.disconnect();
			}
		} catch (MqttPersistenceException e) {
		} catch (MqttException e) {
		}
	}

	protected String getClientId() {
		return clientId;
	}

	private MqttAsyncClient mqttClient;
	
	private static String publicTestServerUri = "tcp://iot.eclipse.org:1883";
	private static String idiServerUri = "tcp://mqtt.idi.ntnu.no:1883";

	private String serverUri = idiServerUri; // publicTestServerUri;
	
	public MqttAsyncClient getMqttClient() {
		if (mqttClient == null) {
			try {
				mqttClient = new MqttAsyncClient(serverUri, getClientId());
			} catch (MqttException e) {
				e.printStackTrace();
			}
		}
		if (mqttClient != null && (! mqttClient.isConnected())) {
			try {
				IMqttToken connectToken = mqttClient.connect();
				connectToken.waitForCompletion();
			} catch (MqttException e) {
			}
		}
		return mqttClient;
	}
}
