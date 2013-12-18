package no.hal.confluence.ui.actions;

import java.util.Collection;

public interface ContentRegionExtractor<T> {
	public Collection<T> getContentRegions(String browserContent);
}
