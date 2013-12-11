package no.hal.confluence.ui.actions;

public interface SourceComposer<T> {
	String composeSource(Iterable<T> regions);
}
