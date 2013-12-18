package no.hal.confluence.ui.actions.util;

import java.util.ArrayList;
import java.util.Collection;

import no.hal.confluence.ui.actions.ContentRegionExtractor;

public abstract class AbstractContentRegionExtractor<T> implements ContentRegionExtractor<T> {
	
	protected abstract int skipRegionPrefixes(String browserContent, int pos);
	
	protected abstract int skipRegion(String browserContent, int pos);
	
	protected abstract T createSourceRegion(String browserContent, int start, int end);
	
	protected abstract int skipRegionSuffixes(String browserContent, int end);
	
	@Override
	public Collection<T> getContentRegions(String browserContent) {
		Collection<T> sourceRegions = new ArrayList<T>();
		int start = 0;
		while (start >= 0) {
			start = nextRegion(browserContent, start, sourceRegions);
		}
		return sourceRegions;
	}

	protected static int skip(String browserContent, int pos, String... prefixes) {
		int start = pos;
		for (int i = 0; i < prefixes.length; i++) {
			String prefix = prefixes[i];
			start = browserContent.indexOf(prefix, start);
			if (start < 0) {
				return -1;
			}
			start += prefix.length();
		}
		return start;
	}
	
	protected int nextRegion(String browserContent, int pos, Collection<T> regions) {
		int start = skipRegionPrefixes(browserContent, pos);
		if (start < 0) {
			return -1;
		}
		int end = skipRegion(browserContent, start);
		T sourceRegion = createSourceRegion(browserContent, start, end);
		if (sourceRegion != null) {
			regions.add(sourceRegion);
		}
		return skipRegionSuffixes(browserContent, end);
	}
}
