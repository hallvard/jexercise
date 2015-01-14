package no.hal.confluence.ui.resources.util.xml;

public class TextContentMatcher extends AbstractNodeMatcher {
	
	public TextContentMatcher(int nodeType, TextMatcher valueMatcher) {
		super(nodeType, null, null, valueMatcher);
	}
}
