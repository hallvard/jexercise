package no.hal.confluence.ui.actions.util;

import java.net.MalformedURLException;
import java.net.URL;

public class SourceUrlExtractor extends AbstractSourceRegionExtractor<URL> {
	
	@Override
	protected int skipRegionPrefixes(String browserContent, int pos) {
		return skip(browserContent, pos, "<a href=\"");
	}

	@Override
	protected int skipRegion(String browserContent, int pos) {
		return browserContent.indexOf("\"", pos);
	}

	@Override
	protected URL createSourceRegion(String browserContent, int start, int end) {
		try {
			return new URL(browserContent.substring(start, end));
		} catch (MalformedURLException e) {
		}
		return null;
	}
	
	@Override
	protected int skipRegionSuffixes(String browserContent, int end) {
		return skip(browserContent, end, "</a>");
	}
}
