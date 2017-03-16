package no.hal.learning.exercise.adm;

import java.io.ByteArrayInputStream;
import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.paho.client.mqttv3.IMqttMessageListener;
import org.eclipse.paho.client.mqttv3.MqttClient;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.eclipse.paho.client.mqttv3.MqttMessage;
import org.eclipse.paho.client.mqttv3.MqttPersistenceException;
import org.eclipse.swt.widgets.Composite;

import no.hal.learning.exercise.logging.ExLogger;
import no.hal.learning.exercise.util.ExerciseResourceFactoryImpl;
import no.hal.learning.exercise.views.ExerciseView;

public class LoggedExView extends ExResourcesChartView implements ITaskEventsProvider {

	@Override
	protected void updatePathViewer() {
		unsubscribe();
		super.updatePathViewer();
		subscribe();
	}

	@Override
	protected void deletePath(String path) {
		super.deletePath(path);
		MqttClient mqttClient = getMqttClient();
		try {
			mqttClient.publish(path, new byte[0], 0, true);
		} catch (MqttPersistenceException e) {
		} catch (MqttException e) {
		}
	}

	private MqttClient mqttClient;
	
	protected String getMqttServerUri() {
		return ExLogger.idiServerUri;
	}

	@Override
	protected String getPathPrefix() {
		return ExerciseView.class.getName();
	}
	
	protected MqttClient getMqttClient() {
		try {
			if (mqttClient == null) {
				mqttClient = new MqttClient(getMqttServerUri(), String.valueOf(this.hashCode()));
			}
			if (! mqttClient.isConnected()) {
				mqttClient.connect();
			}
		} catch (MqttException e) {
		}
		return mqttClient;
	}
	

	protected Resource getMessageObject(String topic, MqttMessage message) {
		URI uri = URI.createURI("/" + topic); // getMqttServerUri().replace("tcp:", "mqtt:") + "/" + topic);
		Resource resource = new ExerciseResourceFactoryImpl().createResource(uri);
		try {
			resource.load(new ByteArrayInputStream(message.getPayload()), ExerciseView.getLogOptions());
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
		return resource;
	}
	
	@Override
	public void createPartControl(Composite parent) {
		super.createPartControl(parent);
		subscribe();
	}
	
	protected void subscribe() {
		MqttClient mqttClient = getMqttClient();
		try {
			mqttClient.subscribe(getPathPrefix() + "/#", new IMqttMessageListener() {
				@Override
				public void messageArrived(final String topic, final MqttMessage message) throws Exception {
					final boolean refresh = (! pathMap.containsKey(topic));
					pathViewer.getControl().getDisplay().asyncExec(new Runnable() {
						@Override
						public void run() {
							Resource object;
							try {
								object = getMessageObject(topic, message);
								pathMap.put(topic, object);						
							} catch (RuntimeException e) {
								pathMap.remove(topic);
							}
							if (refresh) {
								pathViewer.refresh(false);
							} else {
								pathViewer.update(topic, null);
							}								
						}
					});
				}
			});
		} catch (MqttException e) {
		}
	}

	protected void unsubscribe() {
		MqttClient mqttClient = getMqttClient();
		try {
			mqttClient.unsubscribe(getPathPrefix() + "/#");
		} catch (MqttException e) {
		}
	}
}
