package no.hal.learning.exercise.views.plot;

public interface IValueProvider<T, V> {
	public String getName();
	public V getValue(T t);
}
