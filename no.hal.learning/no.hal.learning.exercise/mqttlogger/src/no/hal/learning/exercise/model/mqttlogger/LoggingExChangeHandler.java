package no.hal.learning.exercise.model.mqttlogger;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.ecore.resource.Resource;

import no.hal.learning.exercise.logging.IExChangeHandler;
import no.hal.learning.exercise.views.ExerciseView;

public class LoggingExChangeHandler implements IExChangeHandler {

	private ExLogger exLogger;
	
	private static Map<String, Object> logOptions = new HashMap<String, Object>();
	static {
		logOptions.put(Resource.OPTION_ZIP, Boolean.TRUE);
	}
	
	public static Map<String, Object> getLogOptions() {
		return logOptions;
	}

	protected String getClientId() {
		return ResourcesPlugin.getWorkspace().getRoot().getLocation().toString().replace("/", "_");
	}

	@Override
	public void exResourceChanged(Resource resource) {
		
		ByteArrayOutputStream output = new ByteArrayOutputStream();
		try {
			resource.save(output, logOptions);
			if (exLogger == null) {
				exLogger = new ExLogger(getClientId(), ExerciseView.class.getName());
			}
			exLogger.enqueue(resource.getURI(), output.toByteArray());
		} catch (IOException e) {
		}
	}
}
