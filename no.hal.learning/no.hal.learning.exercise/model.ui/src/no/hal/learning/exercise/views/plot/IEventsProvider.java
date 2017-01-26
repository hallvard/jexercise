package no.hal.learning.exercise.views.plot;

import java.util.Collection;

public interface IEventsProvider<O, E> {
	public Collection<E> getEvents(O o);
}
