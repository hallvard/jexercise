package no.hal.confluence.ui.resources.util;

import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collection;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathFactory;

import no.hal.confluence.ui.Activator;

import org.eclipse.jface.dialogs.MessageDialog;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

public abstract class XmlContentRegionExtractor<T> extends AbstractTextContentRegionExtractor<T> {

	private final String xpath;
	
	public XmlContentRegionExtractor(String xpath) {
		this.xpath = xpath;
	}

	public XmlContentRegionExtractor() {
		this(null);
	}

	protected NodeList getNodeList(final Document doc) {
		return (xpath != null ? getNodeList(doc, xpath) : new NodeList() {
			@Override
			public Node item(int index) {
				return doc.getDocumentElement();
			}
			@Override
			public int getLength() {
				return 1;
			}
		});
	}

	@Override
	protected T createSourceRegion(String browserContent, int start, int end) {
		String rawText = browserContent.substring(start, end);
		Document doc = getXmlContent(rawText);
		Activator.logInfo("Converted " + rawText + " to XML document: " + doc);
		return createSourceRegion(doc.getDocumentElement());
	}

	protected abstract T createSourceRegion(Node node);
	
	protected Document getXmlContent(String browserContent) {
		String rawText = browserContent;
		if (! rawText.startsWith("<?xml")) {
			rawText = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" + rawText;
		}
		return getXmlContent(new InputSource(new StringReader(rawText)));
	}
	
	protected Document getXmlContent(InputSource source) {
		try {
			DocumentBuilder db = DocumentBuilderFactory.newInstance().newDocumentBuilder();
			return db.parse(source);
		} catch (Exception e) {
			MessageDialog.openError(null, "Error", "Exception when parsing " + source + ": " + e);
			return null;
		}
	}

	protected NodeList getNodeList(Document doc, String xpath) {
		XPath xp = XPathFactory.newInstance().newXPath();
		try {
			return (NodeList) xp.evaluate(xpath, doc, XPathConstants.NODESET);
		} catch (Exception e) {
			return null;
		}
	}

	public Collection<T> getContentRegions(NodeList nodeList) {
		Collection<T> sourceRegions = new ArrayList<T>();
		for (int i = 0; i < nodeList.getLength(); i++) {
			Node node = nodeList.item(i);
			T sourceRegion = createSourceRegion(node);
			if (sourceRegion != null) {
				sourceRegions.add(sourceRegion);
			}
		}
		return sourceRegions;
	}
}
