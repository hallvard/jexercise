package no.hal.learning.exercise.adm;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.resource.impl.URIHandlerImpl;
import org.eclipse.paho.client.mqttv3.IMqttMessageListener;
import org.eclipse.paho.client.mqttv3.MqttClient;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.eclipse.paho.client.mqttv3.MqttMessage;
import org.eclipse.paho.client.mqttv3.MqttSecurityException;

public class MqttURIHandlerImpl extends URIHandlerImpl {
	/**
	 * Creates an instance.
	 */
	public MqttURIHandlerImpl() {
		super();
	}

	@Override
	public boolean canHandle(URI uri) {
		return "mqtt".equals(uri.scheme());
	}

	private Map<String, MqttClient> hostClientMap = new HashMap<String, MqttClient>();

	protected void throwRuntimeException(Class<? extends RuntimeException> exc, Object... args) throws RuntimeException, InstantiationException, IllegalAccessException, InvocationTargetException {
		if (args == null || args.length == 0) {
			throw exc.newInstance();
		}
		outer: for (Constructor<?> cons : exc.getConstructors()) {
			int argNum = 0;
			for (Class<?> paramClass : cons.getParameterTypes()) {
				if (! paramClass.isInstance(args[argNum++])) {
					continue outer;
				}
			}
			throw (RuntimeException) cons.newInstance(args);			
		}
	}
	
	protected MqttClient getMqttClient(URI uri, Class<? extends RuntimeException> exc) {
		String host = uri.host();
		MqttClient mqttClient = hostClientMap.get(host);
		Exception mqttEx = null;
		try {
			if (mqttClient == null) {
				mqttClient = new MqttClient("tcp://" + host + ":" + uri.port(), String.valueOf(this.hashCode()));
				hostClientMap.put(host, mqttClient);
			}
			if (mqttClient != null && (! mqttClient.isConnected())) {
				mqttClient.connect();
			}
		} catch (MqttSecurityException e) {
			mqttEx = e;
		} catch (MqttException e) {
			mqttEx = e;
		}
		if (mqttEx != null && exc != null) {
			try {
				throwRuntimeException(exc, mqttEx);
			} catch (Exception e1) {
			}
		}
		return mqttClient;
	}

	@Override
	public OutputStream createOutputStream(final URI uri, Map<?, ?> options) throws IOException {
		OutputStream output = new ByteArrayOutputStream() {
			public void close() throws IOException {
				MqttClient mqttClient = getMqttClient(uri, RuntimeException.class);
				if (mqttClient != null && mqttClient.isConnected()) {
					try {
						mqttClient.publish(uri.path(), new MqttMessage(this.toByteArray()));
					} catch (MqttException e) {
						throw new IOException("Exception when subscribing to " + uri.path() + ": " + e, e);
					}
				}
			}
		};
		return output;
	}
	
	protected MqttMessage getTopicMessage(URI uri, Map<?, ?> options) throws IOException {
		MqttClient mqttClient = null;
		try {
			mqttClient = getMqttClient(uri, RuntimeException.class);
		} catch (Exception e1) {
			throw new IOException("Couldn't connect to " + uri.host());
		}
		final List<MqttMessage> messages = new ArrayList<MqttMessage>();
		final CountDownLatch monitor = new CountDownLatch(1);
		final String path = uri.path().substring(1);
		if (mqttClient != null && mqttClient.isConnected()) {
			try {
				final MqttClient finalMqttClient = mqttClient;
				mqttClient.subscribe(path, new IMqttMessageListener() {
					@Override
					public void messageArrived(String topic, MqttMessage message) throws Exception {
						System.out.println("Received message for " + topic);
						if (topic.equals(path)) {
							messages.add(message);
							monitor.countDown();
							finalMqttClient.unsubscribe(path);
						}
					}
				});
			} catch (MqttException e) {
				throw new IOException("Exception when subscribing to " + path + ": " + e, e);
			}
		}
		try {
			System.out.println("Waiting for message for " + path);
			monitor.await(1, TimeUnit.SECONDS);
		} catch (InterruptedException e) {
			throw new IOException("Interrupt while waiting for message for " + path + ": " + e, e);
		}
		if (messages.isEmpty()) {
			throw new IOException("No message for " + path);
		}
		return messages.iterator().next();
	}

	@Override
	public InputStream createInputStream(URI uri, Map<?, ?> options) throws IOException {
		MqttMessage mqttMessage = getTopicMessage(uri, options);
		return new ByteArrayInputStream(mqttMessage.getPayload());
	}

	@Override
	public void delete(URI uri, Map<?, ?> options) throws IOException {
		throw new UnsupportedOperationException();
	}

	@Override
	public Map<String, ?> getAttributes(URI uri, Map<?, ?> options) {
		Map<String, Object> result = new HashMap<String, Object>();
		try {
			MqttMessage mqttMessage = getTopicMessage(uri, options);
			Set<String> requestedAttributes = getRequestedAttributes(options);
			if (requestedAttributes == null || requestedAttributes.contains(URIConverter.ATTRIBUTE_LENGTH)) {
				result.put(URIConverter.ATTRIBUTE_LENGTH, mqttMessage.getPayload().length);
			}
		} catch (IOException e) {
		}
		return result;
	}

	@Override
	public void setAttributes(URI uri, Map<String, ?> attributes, Map<?, ?> options) throws IOException {
		throw new UnsupportedOperationException();
	}
}
