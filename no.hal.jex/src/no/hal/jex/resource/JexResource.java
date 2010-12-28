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

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;

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

	public void refreshUri() {
		boolean loaded = isLoaded();
		URI uri = getURI();
		if (loaded) {
			unload();
		}
		setURI(uri);
		if (loaded) {
			try {
				load(Collections.EMPTY_MAP);
			} catch (IOException e) {
				System.err.println("Exception when loading " + getURI() + ": " + e);
			}
		}
	}

	public Exercise getExercise(boolean load) {
		if (load && (! isLoaded())) {
			try {
				load(Collections.EMPTY_MAP);
			} catch (IOException e) {
				System.err.println("Exception when loading " + getURI() + ": " + e);
			}
		}
		if (load && (! isLoaded())) {
			return null;
		}
		List content = getContents();
		if (content.size() == 0) {
			return null;
		}
		Exercise ex = (Exercise)getContents().get(0);
		return ex;
	}
	public Exercise getExercise() {
		return getExercise(getContents().size() == 0);
	}

	public static IJavaProject getJavaProject(Resource res) {
		return getJavaProject(res.getURI());
	}
	public static IJavaProject getJavaProject(URI uri) {
		IProject project = getProject(uri);
		return (isJavaProject(project) ? JavaCore.create(project) : null);
	}
	public static IProject getProject(URI uri) {
		boolean isPlatformURI = uri.isPlatformResource();
		if (uri.segmentCount() <= (isPlatformURI ? 1 : 0)) {
			return null;
		}
		return ResourcesPlugin.getWorkspace().getRoot().getProject(uri.segment(isPlatformURI ? 1 : 0));
	}
	public static IProject getProject(Resource res) {
		return getProject(res.getURI());
	}

	public static boolean isJavaProject(IProject project) {
		try {
			return project != null && project.isNatureEnabled("org.eclipse.jdt.core.javanature"); // or hasNature
		} catch (CoreException e) {
		}
		return false;
	}

	//

	public static EObject findElement(EObject eo, Class c, ElementMatcher matcher, Object featureValue) {
		return findElement(eo.eAllContents(), c, matcher, featureValue);
	}
	public static EObject findElement(Resource res, Class c, ElementMatcher matcher, Object featureValue) {
		return findElement(res.getAllContents(), c, matcher, featureValue);
	}

	public interface ElementMatcher {
		public boolean matchesElement(EObject eo, Object featureValue);
	}

	public static EObject findElement(TreeIterator contents, Class c, ElementMatcher matcher, Object featureValue) {
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
	
	public static IResource getIResource(URI uri, boolean useFolder) {
		String segments[] = uri.segments();
		boolean isPlatformURI = uri.isPlatformResource();
		int count = (isPlatformURI ? 1 : 0);
		IContainer folder = ResourcesPlugin.getWorkspace().getRoot();
		while (count < segments.length - 1) {
			IResource res = folder.findMember(segments[count]);
			if (! (res instanceof IContainer)) {
				return null;
			}
			folder = (IContainer)res;
			count++;
		}
		IResource res = folder.findMember(segments[count]);
		return (res == null && useFolder ? folder : res);
	}

	public static String getLocation(URI uri) {
		IResource res = getIResource(uri, false);
		return (res != null ? res.getLocation().toString() : null);
	}
}
