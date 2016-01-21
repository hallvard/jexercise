package no.hal.learning.sharing.runtime.mqtt;

import java.io.PrintStream;

import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Status;
import org.eclipse.paho.client.mqttv3.IMqttDeliveryToken;
import org.eclipse.paho.client.mqttv3.MqttAsyncClient;
import org.eclipse.paho.client.mqttv3.MqttCallback;
import org.eclipse.paho.client.mqttv3.MqttClient;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.eclipse.paho.client.mqttv3.MqttMessage;
import org.eclipse.paho.client.mqttv3.MqttSecurityException;

import no.hal.learning.sharing.AbstractShare;
import no.hal.learning.sharing.runtime.AbstractSharingTransport;

public class MqttSharingTransport extends AbstractSharingTransport implements MqttCallback {

	private final String clientId;
	private MqttAsyncClient mqttClient;
	
	public MqttSharingTransport(String clientId) {
		this.clientId = clientId;
	}
	
	public MqttSharingTransport() {
		this(MqttClient.generateClientId());
	}
	
	public String getClientId() {
		return clientId;
	}

	@Override
	public void subscribe(Subscriber subscriber) {
		super.subscribe(subscriber);
		// force creation
		getMqttClient();
	}
	
	private String serverUri = "tcp://mqtt.idi.ntnu.no:1883";
//	private String serverUri = "tcp://iot.eclipse.org:1883";
	
	protected synchronized MqttAsyncClient createMqttClient() {
		try {
			final MqttAsyncClient mqttClient = new MqttAsyncClient(serverUri, getClientId());
			mqttClient.setCallback(this);
			return mqttClient;
		} catch (MqttSecurityException e) {
			e.printStackTrace();
		} catch (MqttException e) {
			e.printStackTrace();
		}
		return null;
	}

	private long startTime = System.currentTimeMillis();
	
	protected void log(int status, String message, Throwable e) {
		String prefix = "";
		switch (status) {
		case Status.INFO: 		prefix = "INFO"; break;
		case Status.WARNING: 	prefix = "WARNING"; break;
		case Status.ERROR: 		prefix = "ERROR"; break;
		case Status.OK: 		prefix = "OK"; break;
		default:
			break;
		}
		PrintStream out = System.out;
		if (status > Status.INFO) {
			out = System.err;
		}
		String output = this.getClass().getSimpleName() + " " + prefix + " " + mqttClient.getClientId() + " @" + (System.currentTimeMillis() - startTime);
		if (message != null) {
			output = output + ": " + message;
		}
		if (e != null) {
			output = output + " (" + e + ")"; 
		}
		out.println(output);
	}
	
	private MqttAsyncClient getMqttClient() {
		if (mqttClient == null) {
			mqttClient = createMqttClient();
		}
		if (! mqttClient.isConnected()) {
			try {
				mqttClient.connect().waitForCompletion();
				String topicString = getTopicString("#");
				mqttClient.subscribe(topicString, 0);
				log(Status.INFO, "Subscribing to " + topicString, null);
			} catch (MqttException e) {
				log(Status.INFO, null, e);
			}
		}
		return mqttClient;
	}
	
	//

	private static String concat(String... segments) {
		StringBuilder buffer = new StringBuilder();
		for (int i = 0; i < segments.length && segments[i] != null; i++) {
			if (buffer.length() > 0) {
				if (buffer.charAt(buffer.length() - 1) != '/' && segments[i].charAt(0) != '/') {
					buffer.append("/");
				}
			}
			buffer.append(segments[i]);
		}
		return buffer.toString();
	}
	
	protected static final String MQTT_KEY_PREFIX = "no.hal.learning.sharing";

	protected String getTopicString(String... pathSegments) {
		return concat(MQTT_KEY_PREFIX, pathSegments != null ? concat(pathSegments) : null);
	}
	
	protected String getTopicString(IPath path) {
		return getTopicString(path != null ? path.toString() : null);
	}

	@Override
	public void publish(AbstractShare share) {
		byte[] byteArray = toByteArray(share);
		if (byteArray != null) {
			String topicString = getTopicString(share.getOwner(), share.getName());
			try {
				getMqttClient().publish(topicString, byteArray, 0, true);
				log(Status.INFO, "Published " + topicString, null);
			} catch (Exception e) {
				log(Status.ERROR, "Exception when publishing " + topicString, e);
			}
		}
	}
	
	//

	@Override
	public void messageArrived(String topic, MqttMessage message) {
		byte[] payload = message.getPayload();
		log(Status.INFO, "Received " + topic + " (" + payload.length + " bytes)", null);
		int pos = topic.lastIndexOf('/');
		String name = (pos < 0 ? topic : topic.substring(pos + 1));
		AbstractShare share = fromByteArray(name, payload);
		log(Status.INFO, "Decoded " + topic + " as " + share.getOwner() + "#" + share.getName(), null);
		fireReceived(share);
	}

	@Override
	public void connectionLost(Throwable e) {
		log(Status.WARNING, "Disconnected", e);
	}

	@Override
	public void deliveryComplete(IMqttDeliveryToken token) {
	}
}
