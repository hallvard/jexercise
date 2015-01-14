package no.hal.confluence.ui.resources.util.xml;

import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Attr;
import org.w3c.dom.CharacterData;
import org.w3c.dom.DOMException;
import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.ProcessingInstruction;
import org.w3c.dom.Text;
import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;
import org.xml.sax.XMLReader;
import org.xml.sax.ext.LexicalHandler;
import org.xml.sax.helpers.DefaultHandler;

// based on http://fgeorges.blogspot.no/2006/08/translate-sax-events-to-dom-tree.html
public class Sax2DomHandler extends DefaultHandler implements LexicalHandler {

    private Document doc;

    public Document getDocument() {
		return doc;
	}

    public Document build(XMLReader reader, InputSource input) {
        try {
            // The Handlers and the actual building
            reader.setContentHandler(this);
            reader.setErrorHandler(this);
            reader.parse(input);
        }
        // For the catch handlers below, use your usual logging facilities.
        catch (DOMException e) {}
        catch (SAXException e) {}
        catch (IOException e) {}
        return doc;
    }

    @Override
    public void startDocument() throws SAXException {
    	try {
    		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
    		factory.setNamespaceAware(true);
    		DocumentBuilder        builder = factory.newDocumentBuilder();
    		DOMImplementation      impl    = builder.getDOMImplementation();
    		// Create the document
    		doc = impl.createDocument(null, null, null);
    	} catch (Exception e) {
    		throw new SAXException(e);
    	}
    	currentNode = doc;
    }
    
    private Node currentNode;

    // Add it in the DOM tree, at the right place.
    public void startElement(String uri, String name, String qName, Attributes attrs) {
        // Create the element.
        Element elem = doc.createElementNS(uri, qName);
        // Add each attribute.
        for ( int i = 0; i < attrs.getLength(); ++i ) {
            String ns_uri = attrs.getURI(i);
            String qname  = attrs.getQName(i);
            String value  = attrs.getValue(i);
            Attr   attr   = doc.createAttributeNS(ns_uri, qname);
            attr.setValue(value);
            elem.setAttributeNodeNS(attr);
        }
        // Actually add it in the tree, and adjust the right place.
        currentNode.appendChild(elem);
        currentNode = elem;
    }

    // Adjust the current place for subsequent additions.
    public void endElement(String uri, String name, String qName) {
        currentNode = currentNode.getParentNode();
    }

    private static final String CDataPrefix = "<![CDATA[", CDataSuffix = "]]>";
    
    // Add a new text node in the DOM tree, at the right place.
    public void characters(char[] ch, int start, int length) {
        String str  = new String(ch, start, length);
        CharacterData text = null;
		if (str.startsWith(CDataPrefix) && str.endsWith(CDataSuffix)) {
			text = doc.createCDATASection(str.substring(CDataPrefix.length(), str.length() - CDataSuffix.length()));
        } else {
        	text = doc.createTextNode(str);
        }
        currentNode.appendChild(text);
    }

    // Add a new text node in the DOM tree, at the right place.
    public void ignorableWhitespace(char[] ch, int start, int length) {
        String str  = new String(ch, start, length);
        Text   text = doc.createTextNode(str);
        currentNode.appendChild(text);
    }

    // Add a new text PI in the DOM tree, at the right place.
    public void processingInstruction(String target, String data) {
        ProcessingInstruction pi = doc.createProcessingInstruction(target, data);
        currentNode.appendChild(pi);
    }

    @Override
    public InputSource resolveEntity(String publicId, String systemId) throws IOException, SAXException {
    	return null;
    }
    
    // For the handlers below, use your usual logging facilities.
    public void error(SAXParseException e) {
    }

    public void fatalError(SAXParseException e) {
    }

    public void warning(SAXParseException e) {
    }

    // LexicalHandler
    
	@Override
	public void comment(char[] ch, int start, int length) throws SAXException {
        String str  = new String(ch, start, length);
        CharacterData text = doc.createComment(str);
        currentNode.appendChild(text);
	}

	@Override
	public void endCDATA() throws SAXException {
	}

	@Override
	public void endDTD() throws SAXException {
	}

	@Override
	public void endEntity(String arg0) throws SAXException {
	}

	@Override
	public void startCDATA() throws SAXException {
	}

	@Override
	public void startDTD(String arg0, String arg1, String arg2) throws SAXException {
	}

	@Override
	public void startEntity(String arg0) throws SAXException {
	}
}