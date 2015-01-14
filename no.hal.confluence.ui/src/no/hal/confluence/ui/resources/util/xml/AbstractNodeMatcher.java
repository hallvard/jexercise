package no.hal.confluence.ui.resources.util.xml;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;

import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public abstract class AbstractNodeMatcher implements NodeMatcher {

	protected final int nodeType;

	protected final String namespace;
	protected final String nodeName;
	protected final TextMatcher nodeValueMatcher;
	
	private final Collection<NodeMatcher> childMatchers;

	@Override
	public String toString() {
		return "[NodeMatcher " + (namespace != null ? namespace + ":" : "") + nodeName + "=" + nodeValueMatcher + " " + childMatchers + "]";
	}
	
	protected AbstractNodeMatcher(int nodeType, String namespace, String nodeName, TextMatcher nodeValueMatcher, NodeMatcher... matchers) {
		this.nodeType = nodeType;
		this.namespace = namespace;
		this.nodeName = nodeName;
		this.nodeValueMatcher = nodeValueMatcher;
		childMatchers = Arrays.asList(matchers);
	}
	protected AbstractNodeMatcher(int nodeType, String namespace, String nodeName, String nodeValue, NodeMatcher... matchers) {
		this(nodeType, namespace, nodeName, new TextMatcher(nodeValue), matchers);
	}

	@Override
	public boolean matches(Node node) {
		if (node.getNodeType() != this.nodeType) {
			return false;
		}
		if ((namespace != null && (! namespace.equals(node.getNamespaceURI())))
			|| (nodeName != null && (! nodeName.equalsIgnoreCase(node.getNodeName())))
			|| matchesNodeValue(nodeValueMatcher, node.getNodeValue())
			) {
			return false;
		}
		matches = new ArrayList<Map.Entry<NodeMatcher,Node>>();
		return matchMatchers(node);
	}

	protected boolean matchesNodeValue(TextMatcher valueMatcher, String value) {
		return valueMatcher != null && (! valueMatcher.matches(value));
	}
	
	protected Collection<Map.Entry<NodeMatcher, Node>> matches = null;
	
	protected boolean matchMatchers(Node node) {
		for (NodeMatcher nodeMatcher : childMatchers) {
			if (! matchMatcher(node, nodeMatcher)) {
				return false;
			}
		}
		return true;
	}

	protected boolean matchMatcher(Node node, NodeMatcher nodeMatcher) {
		NodeList childNodes = node.getChildNodes();
		for (int i = 0; i < childNodes.getLength(); i++) {
			Node child = childNodes.item(i);
			if (matchMatcher(nodeMatcher, child)) {
				return true;
			}
		}
		return false;
	}

	protected boolean matchMatcher(NodeMatcher nodeMatcher, Node childNode) {
		if (nodeMatcher.matches(childNode)) {
			matches.add(new AbstractMap.SimpleEntry<NodeMatcher, Node>(nodeMatcher, childNode));
			return true;
		}
		return false;
	}
}
