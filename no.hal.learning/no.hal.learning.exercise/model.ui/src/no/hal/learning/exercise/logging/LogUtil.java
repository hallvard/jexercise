package no.hal.learning.exercise.logging;

import org.eclipse.core.runtime.ILog;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;

import no.hal.learning.exercise.provider.ExerciseEditPlugin;

public class LogUtil {

	public static void log(int severity, String message, Throwable e) {
		ILog logger = ExerciseEditPlugin.getPlugin().getLog();
		if (logger != null) {
			logger.log(new Status(severity, ExerciseEditPlugin.getPlugin().getSymbolicName(), message, e));
		}
	}

	public static void error(String message, Throwable e) {
		log(IStatus.ERROR, message, e);
	}
	
	public static void warn(String message, Throwable e) {
		log(IStatus.WARNING, message, e);
	}
	
	public static void info(String message, Throwable e) {
		log(IStatus.INFO, message, e);
	}
}
