package no.hal.confluence.ui.actions;

import java.util.Collection;

public interface SourceRegionExtractor<T> {
	public Collection<T> getSourceRegions(String browserContent);
}
