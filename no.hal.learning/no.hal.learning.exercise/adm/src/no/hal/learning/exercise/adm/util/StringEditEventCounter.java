package no.hal.learning.exercise.adm.util;

import no.hal.learning.exercise.AbstractStringEditEvent;

public class StringEditEventCounter extends TaskEventCounter {

	public final static AbstractTaskEventValueReducer INSTANCE = new StringEditEventCounter();
	
	public StringEditEventCounter() {
		super(AbstractStringEditEvent.class);
	}
}
