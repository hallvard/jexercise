/**
 * 
 */
package no.hal.jex.jdt;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import no.hal.jex.JavaClass;
import no.hal.jex.JavaElement;
import no.hal.jex.JavaField;
import no.hal.jex.JavaMethod;
import no.hal.jex.JavaPack;
import no.hal.jex.Member;
import no.hal.jex.impl.MemberImpl;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jdt.core.IAnnotatable;
import org.eclipse.jdt.core.IAnnotation;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.IField;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IMember;
import org.eclipse.jdt.core.IMemberValuePair;
import org.eclipse.jdt.core.IMethod;
import org.eclipse.jdt.core.IParent;
import org.eclipse.jdt.core.ISourceReference;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;

public class JdtHelper {

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
	
	public static IJavaElement getJdtElement(JavaElement jexElement) {
		IJavaProject javaProject = getJavaProject(jexElement.eResource());
		return (javaProject != null ? JdtHelper.findJdtElement(jexElement, javaProject) : null);
	}
	
	public static IType findJdtClass(String name, IJavaProject project) {
		String ext = ".java";
		int pos = name.lastIndexOf('.');
		if (pos >= 0 && Character.isLowerCase(name.charAt(pos + 1))) {
			ext = name.substring(pos);
			name = name.substring(0, pos);
		}
		String sourcePathName = name.replace('.', Path.SEPARATOR) + ext;
		try {
			IJavaElement jdtElement = (project != null ? project.findElement(new Path(sourcePathName)) : null);
			if (jdtElement != null) {
				return (IType) JdtHelper.findJavaMember(jdtElement, MemberImpl.getSimpleName(name), IJavaElement.TYPE, IType.class);
			}
		} catch (JavaModelException e) {
		}
		return null;
	}
	
	private static IJavaElement findJdtElement(JavaElement jexElement, IJavaProject project) {
		if (jexElement instanceof JavaClass) {
			String name = ((JavaClass) jexElement).getFullName();
			return findJdtClass(name, project);
		} else if (jexElement instanceof JavaPack) {
			try {
				return project.findElement(new Path((((JavaPack) jexElement).getName()).replace('.', Path.SEPARATOR)));
			} catch (JavaModelException e) {
			}
		} else if (jexElement instanceof JavaMethod) {
			JavaMethod jexMethod = (JavaMethod) jexElement;
			IJavaElement jdtClass = findJdtElement(jexMethod.getOwner(), project);
			if (! (jdtClass instanceof IParent)) {
				return null;
			}
			List<IMember> jdtMembers = JdtHelper.findJavaMembers((IParent) jdtClass, jexMethod.getSimpleName(), IJavaElement.METHOD, IMethod.class);
			if (jdtMembers != null) {
				for (IMember jdtMember : jdtMembers) {
					if (jdtMember instanceof IMethod && JdtRequirementChecker.validateTypes(jexMethod.getReturnType(), jexMethod.getParameters(), (IMethod) jdtMember) == Boolean.TRUE) {
						return (IMethod) jdtMember;
					}
				}
			}
		} else if (jexElement instanceof JavaField) {
			IJavaElement jdtClass = findJdtElement(((Member) jexElement).getOwner(), project);
			return (IField) JdtHelper.findJavaMember(jdtClass, ((Member) jexElement).getSimpleName(), IJavaElement.FIELD, IField.class);
		}
		return null;
	}

	public static List<IMember> findJavaMembers(IParent jdtParent, String name, int type, Class<? extends IMember> c) {
		IJavaElement[] jdtMembers = null;
		try {
			if (jdtParent != null) {
				jdtMembers = jdtParent.getChildren();
			}
		} catch (JavaModelException e) {
		}
		if (jdtMembers == null || jdtMembers.length == 0) {
			return Collections.emptyList();
		}
		if (name != null) {
			int pos = name.lastIndexOf('.');
			if (pos >= 0) {
				name = name.substring(pos + 1);
			}
		}
		List<IMember> result = new ArrayList<IMember>();
		for (int i = 0; i < jdtMembers.length; i++) {
			IMember jdtMember = null;
			if (jdtMembers[i] instanceof ICompilationUnit) {
				jdtMember = ((ICompilationUnit)jdtMembers[i]).findPrimaryType();
			} else if (jdtMembers[i] instanceof IMember) {
				jdtMember = (IMember)jdtMembers[i];
			}
			if (jdtMember == null) {
				continue;
			}
			if (c != null && (! c.isInstance(jdtMember))) {
				continue;
			}
			if (type == jdtMember.getElementType() && (name == null || name.equals(jdtMember.getElementName()))) {
				result.add(jdtMember);
			}
		}
		return result;
	}

	public static IMember findJavaMember(IJavaElement jdtClass, String name, int type, Class<? extends IMember> c) {
		if (jdtClass instanceof ISourceReference && jdtClass instanceof IParent) {
			List<IMember> jdtMembers = findJavaMembers((IParent)jdtClass, name, type, c);
			return (jdtMembers != null && jdtMembers.size() > 0 ? (IMember)jdtMembers.get(0) : null);
		}
		return null;
	}
	
	//
	
	public static IMemberValuePair[] getAnnotationValuePairs(IJavaElement javaElement, String annotationName) {
		if (javaElement instanceof IAnnotatable) {
			IAnnotation annotation = ((IAnnotatable) javaElement).getAnnotation(annotationName);
			if (annotation != null) {
				try {
					return annotation.getMemberValuePairs();
				} catch (JavaModelException e) {
//					System.err.println("Couldn't get annotation value pairs for " + annotation + " of " + javaElement + ": " + e);
				}
			}
		}
		return null;
	}

	public static Object getAnnotationValue(IMemberValuePair[] valuePairs, String name, int kind) {
		for (int i = 0; valuePairs != null && i < valuePairs.length; i++) {
			IMemberValuePair valuePair = valuePairs[i];
			if (valuePair.getValueKind() == kind && name.equals(valuePair.getMemberName())) {
				return valuePair.getValue();
			}
		}
		return null;
	}
}
