package no.hal.emf.ui.parts.plot;

public interface ITimestampProvider<E> {
	public long getTimestamp(E event);
}
