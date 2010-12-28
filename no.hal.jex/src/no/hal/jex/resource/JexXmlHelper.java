package no.hal.jex.resource;

import no.hal.jex.Member;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.XMLHelperImpl;

public class JexXmlHelper extends XMLHelperImpl {

	public JexXmlHelper() {
		super();
	}

	public JexXmlHelper(XMLResource resource) {
		super(resource);
	}

	private static StringBuffer buffer = new StringBuffer();

	public static String getID(EObject obj, String role) {
		buffer.setLength(0);
		char last = '\0';
		if (obj instanceof Member) {
			buffer.append(((Member)obj).getSimpleName());
			buffer.append(last = '_');
		}
		String uriFragment = obj.eResource().getURIFragment(obj);
		for (int i = 0; i < uriFragment.length(); i++) {
			char c = uriFragment.charAt(i);
			if (! Character.isJavaIdentifierPart(c)) {
				c = (last != '_' ? '_' : '\0');
			}
			if (c != '\0') {
				buffer.append(c);
				last = c;
			}
		}
		if (role != null) {
			buffer.append('_');
			buffer.append(role);
		}
		return buffer.toString();
	}
	
	public String getID(EObject obj) {
		String id = super.getID(obj);
		if (id == null) {
			id = getID(obj, null);
		}
		return id;
	}

	public String getIDREF(EObject obj) {
		return getID(obj);
	}
}
