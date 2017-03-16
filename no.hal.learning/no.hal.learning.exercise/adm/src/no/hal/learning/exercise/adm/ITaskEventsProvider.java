package no.hal.learning.exercise.adm;

import java.util.List;

import no.hal.learning.exercise.TaskEvent;

public interface ITaskEventsProvider {
	public List<? extends TaskEvent> getTaskEvents(Object o);
}
