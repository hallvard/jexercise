package no.hal.learning.exercise.adm;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TaskEventsTimeCellLabel extends TaskEventsValueCellLabel<Long> {

	private DateFormat timestampFormat = new SimpleDateFormat("HH:mm E, dd/MM-yy");
	
	public void setTimestampFormat(DateFormat timestampFormat) {
		this.timestampFormat = timestampFormat;
	}

	@Override
	public String getTaskEventsText(Object o) {
		Long value = getTaskEventsValue(o);
		return (value != null ? String.format(getLabelFormat(), timestampFormat.format(new Date(value))) : null);
	}
}
