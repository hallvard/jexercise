package no.hal.jex.xml;

import java.util.Map;

import no.hal.jex.resource.JexXmlHelper;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.xmi.XMLHelper;
import org.eclipse.emf.ecore.xmi.impl.XMISaveImpl;

public class JexXmlSaveImpl extends XMISaveImpl {

	public final static String CONTENT_TYPE = "contentType";
	public final static String HTML_CONTENT = "text/html";
	public final static String XHTML_NAMESPACE = "http://www.w3.org/1999/xhtml";
	
	public JexXmlSaveImpl(Map options, XMLHelper helper, String encoding, String xmlVersion) {
		super(options, helper, encoding, xmlVersion);
	}

	public JexXmlSaveImpl(Map options, XMLHelper helper, String encoding) {
		super(options, helper, encoding);
	}

	public JexXmlSaveImpl(XMLHelper helper) {
		super(helper);
	}

	@Override
	protected void saveDataTypeElementSingle(EObject o, EStructuralFeature f) {
		if (!toDOM) {
			EAnnotation annotation = f.getEAnnotation(JexXmlResource.JEXERCISE_METADATA);
			if (annotation != null && HTML_CONTENT.equals(annotation.getDetails().get(CONTENT_TYPE))) {
				// save as unencoded HTML
				Escape oldEscape = escape;
				escape = null;
				try {
					String value = getDatatypeValue(helper.getValue(o, f), f, false);
					if (value != null && value.length() > 0) {
						String name = helper.getQName(f);
						String id = JexXmlHelper.getID(o, name);
						String content = "<div xmlns='" + XHTML_NAMESPACE + "' class='" + name + "' id='" + id + "'>" + value + "</div>";
						// turn off escaping and ensure it is turned back on
						doc.saveDataValueElement(name, content);
					}
				} finally {
					escape = oldEscape;
				}
				return;
			}
		}
		super.saveDataTypeElementSingle(o, f);
	}
}
