package no.hal.learning.exercise.adm.plots.util;

import no.hal.learning.exercise.AbstractStringEditEvent;
import no.hal.learning.exercise.util.Util;

public class LineCountCodeMetric extends LastCodeMetric {
	
	@Override
	public int measure(AbstractStringEditEvent editEvent) {
		return Util.countLines(editEvent.getString());
	}
}
