package no.hal.confluence.ui.resources.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import no.hal.confluence.ui.resources.ContentRegionExtractor;

public class CompositeSourceRegionExtractor<T> {
	
	private Collection<ContentRegionExtractor<T>> sourceRegionExtractors;
	
	public CompositeSourceRegionExtractor(ContentRegionExtractor<T>... sourceRegionExtractors) {
		this.sourceRegionExtractors = Arrays.asList(sourceRegionExtractors);
	}
	
	public Collection<T> getSourceRegions(String browserContent) {
		Collection<T> regions = new ArrayList<T>();
		for (ContentRegionExtractor<T> sourceRegionExtractor : sourceRegionExtractors) {
			regions.addAll(sourceRegionExtractor.getContentRegions(browserContent));
		}
		return regions;
	}
}
