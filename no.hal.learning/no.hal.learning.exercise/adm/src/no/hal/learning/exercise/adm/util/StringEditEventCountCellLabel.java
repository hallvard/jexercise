package no.hal.learning.exercise.adm.util;

import no.hal.learning.exercise.AbstractStringEditEvent;
import no.hal.learning.exercise.adm.TaskEventsValueReducerCellLabel;

public class StringEditEventCountCellLabel extends TaskEventsValueReducerCellLabel {

	public StringEditEventCountCellLabel() {
		super(new TaskEventCountReducer(AbstractStringEditEvent.class), "%d");
	}
}
