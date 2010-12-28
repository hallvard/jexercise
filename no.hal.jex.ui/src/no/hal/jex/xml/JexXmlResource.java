package no.hal.jex.xml;

import no.hal.jex.resource.JexXmlHelper;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.xmi.XMLHelper;
import org.eclipse.emf.ecore.xmi.XMLSave;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;

public class JexXmlResource extends XMIResourceImpl {

	public final static String JEXERCISE_METADATA = "http:///no/hal/jex/JexMetaData";

	public JexXmlResource() {
		super();
	}

	public JexXmlResource(URI uri) {
		super(uri);
	}

	@Override
	protected XMLSave createXMLSave() {
		return new JexXmlSaveImpl(createXMLHelper());
	}

	@Override
	protected XMLHelper createXMLHelper() {
		return new JexXmlHelper(this);
	}
}
