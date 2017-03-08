package no.hal.learning.exercise.adm.util;

import no.hal.learning.exercise.adm.TaskEventsTimeCellLabel;

public class MaxEventTimeCellLabel extends TaskEventsTimeCellLabel {

	public MaxEventTimeCellLabel() {
		super(TaskEventMaxTimeReducer.INSTANCE, "%s");
	}
}
