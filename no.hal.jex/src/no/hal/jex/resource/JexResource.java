/**
 * 
 */
package no.hal.jex.resource;

import java.io.IOException;
import java.util.Collections;
import java.util.List;

import no.hal.jex.Exercise;
import no.hal.jex.JavaElement;
import no.hal.jex.JavaRequirement;
import no.hal.jex.Member;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;

public class JexResource extends XMIResourceImpl {

	public final static String JEX_EXTENSION = "jex";

	private JexResource(URI uri) {
		super(uri);
	}

	public static class Factory implements Resource.Factory {

		public Resource createResource(URI uri) {
			XMIResource res = new JexResource(uri);
//			Map defaultLoadOptions = res.getDefaultLoadOptions();
//			defaultLoadOptions.put(XMLResource.OPTION_RECORD_UNKNOWN_FEATURE, Boolean.TRUE);
			return res;
		}
	}

//	public void refreshUri() {
//		boolean loaded = isLoaded();
//		URI uri = getURI();
//		if (loaded) {
//			unload();
//		}
//		setURI(uri);
//		if (loaded) {
//			try {
//				load(Collections.EMPTY_MAP);
//			} catch (IOException e) {
//				System.err.println("Exception when loading " + getURI() + ": " + e);
//			}
//		}
//	}
//
//	public Exercise getExercise(boolean load) {
//		if (load && (! isLoaded())) {
//			try {
//				load(Collections.EMPTY_MAP);
//			} catch (IOException e) {
//				System.err.println("Exception when loading " + getURI() + ": " + e);
//			}
//		}
//		if (load && (! isLoaded())) {
//			return null;
//		}
//		List<EObject> content = getContents();
//		if (content.size() == 0) {
//			return null;
//		}
//		Exercise ex = (Exercise)getContents().get(0);
//		return ex;
//	}
	
	public Exercise getExercise() {
		for (EObject ex : getContents()) {
			if (ex instanceof Exercise) {
				return (Exercise) ex;
			}
		}
		return null;
	}

	//

	public static EObject findElement(EObject eo, Class<?> c, ElementMatcher matcher, Object featureValue) {
		return findElement(eo.eAllContents(), c, matcher, featureValue);
	}
	public static EObject findElement(Resource res, Class<?> c, ElementMatcher matcher, Object featureValue) {
		return findElement(res.getAllContents(), c, matcher, featureValue);
	}

	public interface ElementMatcher {
		public boolean matchesElement(EObject eo, Object featureValue);
	}

	public static EObject findElement(TreeIterator<EObject> contents, Class<?> c, ElementMatcher matcher, Object featureValue) {
		while (contents.hasNext()) {
			EObject eo = (EObject)contents.next();
			if (c == null || c.isInstance(eo)) {
				if (matcher != null) {
					if (matcher.matchesElement(eo, featureValue)) {
						return eo;
					}
				} else {
					JavaElement javaElement = null;
					if (eo instanceof JavaRequirement) {
						javaElement = ((JavaRequirement)eo).getJavaElement();
					} else if (eo instanceof JavaElement) {
						javaElement = (JavaElement)eo;
					}
					if (javaElement instanceof Member) {
						Member member = (Member)javaElement;
						if (member.getName().equals(featureValue) || member.getFullName().equals(featureValue)) {
							return eo;
						}
					}
				}
			}
		}
		return null;
	}
}
