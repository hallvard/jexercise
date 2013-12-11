package no.hal.confluence.ui.actions.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import no.hal.confluence.ui.actions.SourceRegionExtractor;

public class CompositeSourceRegionExtractor<T> {
	
	private Collection<SourceRegionExtractor<T>> sourceRegionExtractors;
	
	public CompositeSourceRegionExtractor(SourceRegionExtractor<T>... sourceRegionExtractors) {
		this.sourceRegionExtractors = Arrays.asList(sourceRegionExtractors);
	}
	
	public Collection<T> getSourceRegions(String browserContent) {
		Collection<T> regions = new ArrayList<T>();
		for (SourceRegionExtractor<T> sourceRegionExtractor : sourceRegionExtractors) {
			regions.addAll(sourceRegionExtractor.getSourceRegions(browserContent));
		}
		return regions;
	}
}
