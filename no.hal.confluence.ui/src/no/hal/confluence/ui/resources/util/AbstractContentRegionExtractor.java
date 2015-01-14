package no.hal.confluence.ui.resources.util;

import no.hal.confluence.ui.resources.ContentRegionExtractor;

public abstract class AbstractContentRegionExtractor<T> implements ContentRegionExtractor<T> {
	
	@Override
	public String toString() {
		String toString = super.toString();
		int pos1 = toString.lastIndexOf('.'), pos2 = toString.indexOf('@', pos1 + 1);
		return (pos1 < 0 || pos2 < 0 ? toString : toString.substring(pos1 + 1, pos2));
	}

	protected static String unescapeEntities(String s, int start, int end) {
		return HtmlEntitiesDecoder.decodeEntities(s, start, end);
	}
	
	protected static String unescapeEntities(String s) {
		return HtmlEntitiesDecoder.decodeEntities(s, 0, -1);
	}
}
