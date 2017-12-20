package no.hal.learning.exercise.plugin;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class Activator implements BundleActivator {

	private static Activator INSTANCE = null;

	public static Activator getInstance() {
		return INSTANCE;
	}
	
	private TaskEventsRecorder taskEventsRecorder = null;

	public TaskEventsRecorder getTaskEventsRecorder() {
		return taskEventsRecorder;
	}
	
	@Override
	public void start(BundleContext context) throws Exception {
		INSTANCE = this;
		if (taskEventsRecorder == null) {
			taskEventsRecorder = new TaskEventsRecorder();
			taskEventsRecorder.startRecording();
		}
	}

	@Override
	public void stop(BundleContext context) throws Exception {
		if (taskEventsRecorder != null) {
			taskEventsRecorder.stopRecording();
			taskEventsRecorder = null;
		}
		INSTANCE = null;
	}
}
