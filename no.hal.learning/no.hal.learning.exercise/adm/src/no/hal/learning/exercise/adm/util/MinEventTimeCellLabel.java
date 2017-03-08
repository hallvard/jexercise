package no.hal.learning.exercise.adm.util;

import no.hal.learning.exercise.adm.TaskEventsTimeCellLabel;

public class MinEventTimeCellLabel extends TaskEventsTimeCellLabel {

	public MinEventTimeCellLabel() {
		super(TaskEventMinTimeReducer.INSTANCE, "%s");
	}
}
