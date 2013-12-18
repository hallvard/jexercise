package no.hal.confluence.ui.actions.util;


public class CodeBlockSourceExtractor extends AbstractContentRegionExtractor<String> {
	
	@Override
	protected int skipRegionPrefixes(String browserContent, int pos) {
		return skip(browserContent, pos, "<div class=\"code panel", "<script type=\"syntaxhighlighter\"", "<![CDATA[");
	}
	
	@Override
	protected int skipRegion(String browserContent, int pos) {
		return browserContent.indexOf("]]>", pos);
	}

	@Override
	protected String createSourceRegion(String browserContent, int start, int end) {
		return browserContent.substring(start, end);
	}
	
	@Override
	protected int skipRegionSuffixes(String browserContent, int end) {
		return skip(browserContent, end, "</script>", "</div>");
	}
}
