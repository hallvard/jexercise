package no.hal.learning.exercise.views.plot;

import java.util.Collection;

public interface IEventModel<O, E> extends IEventDataProvider<O, E> {

	/**
	 * Tells if an object is an owner, i.e. is an O
	 * @param o
	 * @return if an object is an owner, i.e. is an O
	 */
	public boolean isOwner(Object o);

	/**
	 * Tells if an object is an event, i.e. is an E
	 * @param o
	 * @return if an object is an event, i.e. is an E
	 */
	public boolean isEvent(Object o);
	
	/**
	 * Provides a textual representation of the owner (an O) or an event (an E)
	 * @param o an O or E
	 * @return a textual representation of the owner (an O) or an event (an E)
	 */
	public String getText(Object o);

	public Collection<IValueProvider<E, Number>> getValueProviders(E event);	
}
