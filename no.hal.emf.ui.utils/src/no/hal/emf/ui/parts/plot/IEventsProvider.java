package no.hal.emf.ui.parts.plot;

import java.util.Collection;

public interface IEventsProvider<O, E> {
	public Collection<E> getEvents(O o);
}
