package no.hal.confluence.ui.resources.util;

import no.hal.confluence.ui.resources.util.xml.AttributeMatcher;
import no.hal.confluence.ui.resources.util.xml.ElementMatcher;
import no.hal.confluence.ui.resources.util.xml.TextContentMatcher;
import no.hal.confluence.ui.resources.util.xml.TextMatcher;

import org.w3c.dom.Node;

public class CodeBlockSourceExtractor2 extends AbstractXmlContentRegionExtractor<String> {
	
	public CodeBlockSourceExtractor2() {
		super(2,
			new ElementMatcher("div", new AttributeMatcher("class", new TextMatcher("code panel"))),
			new ElementMatcher("script", new AttributeMatcher("type", new TextMatcher("syntaxhighlighter"))),
			new TextContentMatcher(Node.CDATA_SECTION_NODE, null)
		);
	}
	
	@Override
	protected String createSourceRegion(Node node) {
		return getTextContent(node, true);
	}

	public static void main(String[] args) {
		main(new CodeBlockSourceExtractor2(), "/Users/hal/java/git/jexercise/no.hal.confluence.ui/src/no/hal/confluence/ui/resources/util/xml/codeBlock.html");
	}
}
