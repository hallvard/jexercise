package no.hal.learning.exercise.adm.util;

import no.hal.learning.exercise.adm.TaskEventsValueReducerCellLabel;

public class TotalEventCountCellLabel extends TaskEventsValueReducerCellLabel {

	public TotalEventCountCellLabel() {
		super(TaskEventCountReducer.INSTANCE, "%d");
	}
}
