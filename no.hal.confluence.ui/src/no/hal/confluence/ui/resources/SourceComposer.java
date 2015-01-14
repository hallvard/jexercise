package no.hal.confluence.ui.resources;

public interface SourceComposer<T> {
	String composeSource(Iterable<T> regions);
}
