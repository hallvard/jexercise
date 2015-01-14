package no.hal.confluence.pydev.ui.resources;

import no.hal.confluence.ui.resources.util.AbstractXmlContentRegionExtractor;
import no.hal.confluence.ui.resources.util.xml.AttributeMatcher;
import no.hal.confluence.ui.resources.util.xml.ElementMatcher;

import org.w3c.dom.Node;

public class DocOnceCodeBlockSourceExtractor2 extends AbstractXmlContentRegionExtractor<String> {
	
	public DocOnceCodeBlockSourceExtractor2() {
		super(1,
//			new ElementMatcher("p",
//					new TextContentMatcher(Node.COMMENT_NODE, TextMatcher.contains("code=python"))),
			new ElementMatcher("div",
					new AttributeMatcher("class", "highlight")),
			new ElementMatcher("pre")
		);
	}
	
	@Override
	protected String createSourceRegion(Node node) {
		return getTextContent(node, false);
	}

	public static void main(String[] args) {
		AbstractXmlContentRegionExtractor.main(new DocOnceCodeBlockSourceExtractor2(), "/Users/hal/java/git/jexercise/no.hal.confluence.pydev.ui/src/no/hal/confluence/pydev/ui/resources/docOnce.html");
	}
}
