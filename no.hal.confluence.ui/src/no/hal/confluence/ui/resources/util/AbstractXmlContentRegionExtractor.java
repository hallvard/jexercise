package no.hal.confluence.ui.resources.util;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathFactory;

import no.hal.confluence.ui.resources.util.xml.ImmutableNodeList;
import no.hal.confluence.ui.resources.util.xml.NodeMatcher;
import no.hal.confluence.ui.resources.util.xml.Sax2DomHandler;

import org.ccil.cowan.tagsoup.Parser;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

public abstract class AbstractXmlContentRegionExtractor<T> extends AbstractContentRegionExtractor<T> {

	private final List<NodeMatcher> nodeMatchers;

	private final int matcherPos;
	
	public AbstractXmlContentRegionExtractor(int pos, NodeMatcher... nodeMatchers) {
		super();
		this.matcherPos = pos;
		this.nodeMatchers = Arrays.asList(nodeMatchers);
	}
	
	@Override
	public Collection<T> getContentRegions(String browserContent) {
		Collection<Node> nodes = new ArrayList<Node>();
		findMatchingNode(0, getNodeList(getXmlContent(browserContent)), nodes);
		Collection<T> sourceRegions = new ArrayList<T>();
		for (Node node : nodes) {
			T region = createSourceRegion(node);
			if (region != null) {
				sourceRegions.add(region);
			}
		}
		return sourceRegions;
	}

	protected abstract T createSourceRegion(Node node);

	protected String getTextContent(Node node, boolean unescape) {
		// when using TagSoup, the DOM should already be properly unescaped
		String textContent = node.getTextContent();
		if (unescape) {
			textContent = unescapeEntities(textContent);
		}
		return textContent;
	}

	protected Document getXmlContent(String browserContent) {
		String rawText = browserContent;
//		if ((! rawText.startsWith("<?xml")) && (! rawText.startsWith("<!DOCTYPE"))) {
//			rawText = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" + rawText;
//		}
		return getXmlContent(new StringReader(rawText));
	}
	
	protected Document getXmlContent(Reader source) {
		try {
//			Tidy tidy = new Tidy();
//			Document document = tidy.parseDOM(source, new OutputStreamWriter(System.out));
			Parser parser = new Parser();
			Sax2DomHandler domHandler = new Sax2DomHandler();
			parser.setContentHandler(domHandler);
			parser.setProperty("http://xml.org/sax/properties/lexical-handler", domHandler);
			parser.parse(new InputSource(source));
			return domHandler.getDocument();
		} catch (Exception e) {
			System.err.println(e);
//			Activator.logError("Exception when parsing " + source, e);
		}
		return null;
	}

	private String xpath = null;
	
	public void setXpath(String xpath) {
		this.xpath = xpath;
	}
	
	protected NodeList getNodeList(final Document doc) {
		if (doc == null) {
			return new ImmutableNodeList();
		} else if (xpath == null) {
			return new ImmutableNodeList(doc.getDocumentElement());
		}
		XPath xp = XPathFactory.newInstance().newXPath();
		try {
			return (NodeList) xp.evaluate(xpath, doc, XPathConstants.NODESET);
		} catch (Exception e) {
			return null;
		}
	}

	private boolean findMatchingNode(int matcherNum, NodeList nodes, Collection<Node> result) {
		NodeMatcher nodeMatcher = nodeMatchers.get(matcherNum);
		for (int i = 0; i < nodes.getLength(); i++) {
			Node item = nodes.item(i);
			boolean matched = false;
			if (nodeMatcher.matches(item)) {
				if (matcherNum + 1 >= nodeMatchers.size() || findMatchingNode(matcherNum + 1, item.getChildNodes(), result)) {
					matched = true;
				}
				if (matched && matcherNum == matcherPos) {
					result.add(item);
				}
			} else {
				if (findMatchingNode(matcherNum, item.getChildNodes(), result)) {
					matched = true;
				}
			}
			if (matched && matcherNum > 0) {
				return true;
			}
		}
		return false;
	}

	protected static void main(AbstractXmlContentRegionExtractor<?> regionExtractor, String fileName) {
		try {
			FileReader fileReader = new FileReader(fileName);
			Scanner scanner = new Scanner(fileReader);
			StringBuilder buffer = new StringBuilder();
			while (scanner.hasNextLine()) {
				buffer.append(scanner.nextLine());
				buffer.append("\n");
			}
			Collection<?> regions = regionExtractor.getContentRegions(buffer.toString());
			System.out.println("Found " + regions.size() + " regions!");
			System.out.println(regions);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
