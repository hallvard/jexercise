package no.hal.confluence.ui.resources.util;

import java.net.MalformedURLException;
import java.net.URL;

public class ContentUrlExtractor extends AbstractTextContentRegionExtractor<URL> {
	
	@Override
	protected int skipRegionPrefixes(String browserContent, int pos) {
		return skip(browserContent, pos, "<a ", "href=\"");
	}

	@Override
	protected int skipRegion(String browserContent, int pos) {
		return browserContent.indexOf("\"", pos);
	}

	protected boolean acceptUrl(String urlString) {
		return true;
	}
	
	@Override
	protected URL createSourceRegion(String browserContent, int start, int end) {
		try {
			String urlString = browserContent.substring(start, end);
			if (acceptUrl(urlString)) {
				return new URL(urlString);
			}
		} catch (MalformedURLException e) {
		}
		return null;
	}
	
	@Override
	protected int skipRegionSuffixes(String browserContent, int end) {
		return skip(browserContent, end, "</a>");
	}
}
