package no.hal.sharing.mqtt;

import org.eclipse.core.runtime.Status;
import org.eclipse.paho.client.mqttv3.IMqttDeliveryToken;
import org.eclipse.paho.client.mqttv3.MqttAsyncClient;
import org.eclipse.paho.client.mqttv3.MqttCallback;
import org.eclipse.paho.client.mqttv3.MqttClient;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.eclipse.paho.client.mqttv3.MqttMessage;
import org.eclipse.paho.client.mqttv3.MqttSecurityException;

import no.hal.sharing.AbstractSharingTransport;
import no.hal.sharing.SharedResource;
import no.hal.sharing.util.Util;

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
	public void subscribe(Subscriber subscriber, String from, String to) {
		super.subscribe(subscriber, from, to);
		String topicString = topicMapping.getSubscriptionTopicString(from, to);
		try {
			getMqttClient().subscribe(topicString, 0);
			Util.log(this, null, Status.INFO, "Subscribing to " + topicString, null);
		} catch (MqttException e) {
		}
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
	
	private MqttAsyncClient getMqttClient() {
		if (mqttClient == null) {
			mqttClient = createMqttClient();
		}
		if (! mqttClient.isConnected()) {
			try {
				mqttClient.connect().waitForCompletion();
			} catch (MqttException e) {
				Util.log(this, null, Status.INFO, null, e);
			}
		}
		return mqttClient;
	}
	
	//

	protected static final String MQTT_KEY_PREFIX = "no.hal.sharing";

	private TopicMapping topicMapping = new TopicMapping(MQTT_KEY_PREFIX);

	@Override
	public void publishResource(SharedResource shared) {
		byte[] byteArray = shared.getContents();
		if (byteArray == null) {
			// means delete topic
			byteArray = new byte[0];
		}
		String topicString = topicMapping.getTopicString(shared);
		try {
			getMqttClient().publish(topicString, byteArray, 0, true);
			Util.log(this, null, Status.INFO, "Published " + topicString, null);
		} catch (Exception e) {
			Util.log(this, null, Status.ERROR, "Exception when publishing " + topicString, e);
		}
	}
	
	//

	@Override
	public void messageArrived(String topic, MqttMessage message) {
		byte[] payload = message.getPayload();
		Util.log(this, null, Status.INFO, "Received " + topic + " (" + payload.length + " bytes)", null);
		SharedResource sharedResource = decodePayload(topicMapping.getSharedResource(topic, payload));
		Util.log(this, null, Status.INFO, "Decoded " + topic + " as " + sharedResource, null);
		fireReceived(sharedResource);
	}

	@Override
	public void connectionLost(Throwable e) {
		Util.log(this, null, Status.WARNING, "Disconnected", e);
	}

	@Override
	public void deliveryComplete(IMqttDeliveryToken token) {
	}
}
