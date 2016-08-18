package no.hal.emf.ui.parts.plot;

public interface IValueProvider<T, V> {
	public String getName();
	public V getValue(T t);
}
