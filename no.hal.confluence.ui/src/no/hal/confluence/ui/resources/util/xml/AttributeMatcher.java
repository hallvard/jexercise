package no.hal.confluence.ui.resources.util.xml;

import org.w3c.dom.Node;

public class AttributeMatcher extends AbstractNodeMatcher {

	public AttributeMatcher(String namespace, String nodeName, TextMatcher valueMatcher) {
		super(Node.ATTRIBUTE_NODE, namespace, nodeName, valueMatcher);
	}

	public AttributeMatcher(String nodeName, TextMatcher valueMatcher) {
		this(null, nodeName, valueMatcher);
	}
	
	public AttributeMatcher(String nodeName, String value) {
		this(null, nodeName, new TextMatcher(value));
	}
}
