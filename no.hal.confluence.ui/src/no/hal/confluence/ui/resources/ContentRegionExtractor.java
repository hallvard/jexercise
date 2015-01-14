package no.hal.confluence.ui.resources;

import java.util.Collection;

public interface ContentRegionExtractor<T> {
	public Collection<T> getContentRegions(String contents);
}
