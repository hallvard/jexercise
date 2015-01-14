package no.hal.confluence.ui.resources.util.xml;

import java.util.Collection;

import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class ImmutableNodeList implements NodeList {

	private final Node[] nodes;
	
	public ImmutableNodeList(Node... nodes) {
		this.nodes = nodes;
	}

	public ImmutableNodeList(Collection<? extends Node> nodes) {
		this(nodes.toArray(new Node[nodes.size()]));
	}

	@Override
	public int getLength() {
		return nodes.length;
	}

	@Override
	public Node item(int index) {
		return nodes[index];
	}
}
