package no.hal.confluence.ui.resources.util.xml;

import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;

public class ElementMatcher extends AbstractNodeMatcher {

	public ElementMatcher(String namespace, String nodeName, NodeMatcher... matchers) {
		super(Node.ELEMENT_NODE, namespace, nodeName, (TextMatcher) null, matchers);
	}

	public ElementMatcher(String nodeName, NodeMatcher... matchers) {
		this(null, nodeName, matchers);
	}

	protected boolean matchMatcher(Node node, NodeMatcher nodeMatcher) {
		if (super.matchMatcher(node, nodeMatcher)) {
			return true;
		}
		NamedNodeMap childNodes = node.getAttributes();
		for (int i = 0; i < childNodes.getLength(); i++) {
			if (matchMatcher(nodeMatcher, childNodes.item(i))) {
				return true;
			}
		}
		return false;
	}
}
