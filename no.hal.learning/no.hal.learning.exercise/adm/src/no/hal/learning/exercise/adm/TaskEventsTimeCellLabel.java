package no.hal.learning.exercise.adm;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import no.hal.learning.exercise.adm.util.AbstractTaskEventValueReducer;

public class TaskEventsTimeCellLabel extends TaskEventsValueReducerCellLabel {

	private DateFormat timestampFormat = new SimpleDateFormat("HH:mm E, dd/MM-yy");
	
	public TaskEventsTimeCellLabel(AbstractTaskEventValueReducer reducer, String format) {
		super(reducer, format);
	}
	
	public void setTimestampFormat(DateFormat timestampFormat) {
		this.timestampFormat = timestampFormat;
	}

	@Override
	public String getTaskEventsText(Object o) {
		Long value = getTaskEventsValue(o);
		return (value != null ? String.format(format, timestampFormat.format(new Date(value))) : null);
	}
}
