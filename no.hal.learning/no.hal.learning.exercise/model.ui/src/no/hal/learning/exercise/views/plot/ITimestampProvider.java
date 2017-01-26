package no.hal.learning.exercise.views.plot;

public interface ITimestampProvider<E> {
	public long getTimestamp(E event);
}
