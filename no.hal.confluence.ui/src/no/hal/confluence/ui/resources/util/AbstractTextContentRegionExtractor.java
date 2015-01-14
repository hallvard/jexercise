package no.hal.confluence.ui.resources.util;

import java.util.ArrayList;
import java.util.Collection;

public abstract class AbstractTextContentRegionExtractor<T> extends AbstractContentRegionExtractor<T> {
	
	protected abstract int skipRegionPrefixes(String browserContent, int pos);
	
	protected abstract int skipRegion(String browserContent, int pos);
	
	protected abstract T createSourceRegion(String browserContent, int start, int end);
	
	protected abstract int skipRegionSuffixes(String browserContent, int end);
	
	@Override
	public Collection<T> getContentRegions(String browserContent) {
		Collection<T> sourceRegions = new ArrayList<T>();
		String lowerContent = browserContent.toLowerCase();
		int start = 0;
		while (start >= 0) {
			start = nextRegion(browserContent, lowerContent, start, sourceRegions);
		}
		return sourceRegions;
	}

	protected static int skip(String browserContent, int pos, int n, String... prefixes) {
		int start = pos, result = -1;
		for (int i = 0; i < prefixes.length; i++) {
			String prefix = prefixes[i];
			start = browserContent.indexOf(prefix, start);
			if (start < 0) {
				return -1;
			}
			if (i == n) {
				result = start;
			}
			start += prefix.length();
		}
		return (result < 0 ? start : result);
	}
	
	protected static int skip(String browserContent, int pos, String... prefixes) {
		return skip(browserContent, pos, -1, prefixes);
	}
	
	protected static int skipUpto(String browserContent, int pos, int n, String... prefixes) {
		return skip(browserContent, pos, n, prefixes);
	}
	
	protected int nextRegion(String browserContent, String lowerContent, int pos, Collection<T> regions) {
		int start = skipRegionPrefixes(lowerContent, pos);
		if (start < 0) {
			return -1;
		}
		int end = skipRegion(lowerContent, start + 1);
		T sourceRegion = createSourceRegion(browserContent, start, end);
		if (sourceRegion != null) {
			regions.add(sourceRegion);
		}
		return skipRegionSuffixes(lowerContent, end);
	}
}
