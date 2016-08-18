package no.hal.emf.ui.parts.plot;

import java.util.Collection;

public interface IEventModel<O, E> extends IEventDataProvider<O, E> {

	public boolean isOwner(Object o);
	public boolean isEvent(Object o);
	
	public String getText(O o);
	
	public Collection<IValueProvider<E, Number>> getValueProviders(E event);	
}
