package no.hal.learning.fv.ext;

import no.hal.learning.exercise.TaskEvent;
import no.hal.learning.fv.FeatureValued;

public interface ITaskEventFeaturesProvider {
	public boolean supportsTaskEventType(Class<TaskEvent> taskEventClass);
	public FeatureValued getFeatures(TaskEvent taskEvent);
}
