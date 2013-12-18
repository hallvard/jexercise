package no.hal.jex.ui;

import java.util.regex.Pattern;

import no.hal.jex.Exercise;
import no.hal.jex.JexFactory;
import no.hal.jex.jdt.JdtHelper;
import no.hal.jex.jdt.JdtTestAnnotationsToModelConverter;
import no.hal.jex.resource.JexResource;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IResourceDeltaVisitor;
import org.eclipse.core.resources.IResourceVisitor;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.jdt.core.ElementChangedEvent;
import org.eclipse.jdt.core.IElementChangedListener;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IJavaElementDelta;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;

public class JexWorkspaceResourcesProvider extends AbstractJexResourcesProvider implements JexResourceProvider, IResourceChangeListener, IResourceDeltaVisitor, IElementChangedListener {

	private String pathPattern = null;
	private String pathPrefix = null;

	public JexWorkspaceResourcesProvider() {
		JavaCore.addElementChangedListener(this);
		ResourcesPlugin.getWorkspace().addResourceChangeListener(this);
	}

	public void setJexPathPattern(String jexPathPattern) {
		String wildcard = Pattern.quote("*");
		String[] segments = (jexPathPattern  != null ? jexPathPattern.split(wildcard) : new String[0]);
		pathPattern = (segments.length == 0 ? null : getRegexForPathPattern(segments));
		pathPrefix = (segments.length == 0 ? null : segments[0]);
	}
	private String getRegexForPathPattern(String[] segments) {
		String regex = Pattern.quote(segments[0]);
		for (int i = 1; i < segments.length; i++) {
			regex += ".*" + Pattern.quote(segments[i]);
		}
		return regex;
	}

	private IResource[] rootResources = null;
	
	public void setRootResources(IResource... resources) {
		this.rootResources = resources;
		fireResourcesChanged(null);
	}

	public void getJexResources(ResourceSet resourceSet) {
		addExercises(resourceSet);
	}

	private void addExercises(final ResourceSet resourceSet) {
		if (rootResources != null) {
			for (IResource resource : rootResources) {
				addExercises(resource, resourceSet);
			}
		}
	}

	private void addExercises(IResource resource, final ResourceSet resourceSet) {
		try {
			resource.accept(new IResourceVisitor() {
				public boolean visit(IResource resource) throws CoreException {
					IPath path = resource.getFullPath();
					String pathString = path.toString();
					if (pathPrefix != null && (! pathString.startsWith(pathPrefix))) {
						return false;
					}
					if (addTestsExerciseResources(resource, pathPattern, resourceSet)) {
						return false;
					} else if (pathString.endsWith(JexResource.JEX_EXTENSION) && (pathPattern == null || pathString.matches(pathPattern))) {
						addExerciseResources(resource, resourceSet);
					}
					return true;
				}});
		} catch (CoreException e) {
		}
	}
	
	private void addExerciseResources(IResource resource, ResourceSet resourceSet) {
		URI uri = URI.createPlatformResourceURI(resource.getFullPath().toString(), true);
		try {
			resourceSet.getResource(uri, true);
		} catch (RuntimeException e) {
		}
	}

	
	private boolean addTestsExerciseResources(IResource resource, String pathPattern, ResourceSet resourceSet) {
		String[] segments = resource.getFullPath().segments();
		// must contain at least project and source folder segments
		if (segments.length < 2) {
			return false;
		}
		IJavaProject javaProject = JdtHelper.getJavaProject(segments[0]);
		if (javaProject == null) {
			return false;
		}
		URI testsResourceUri = URI.createPlatformResourceURI(resource.getFullPath() + "." + JexResource.JEX_EXTENSION, true);
		IJavaElement javaElement = JdtHelper.findIJavaElement(javaProject, segments, 1);
		if (javaElement != null) {
			JdtTestAnnotationsToModelConverter testAnnotationsToModelConverter = new JdtTestAnnotationsToModelConverter(JexFactory.eINSTANCE.createExercise(), javaElement);
			if (testAnnotationsToModelConverter.canConvert()) {
				Exercise exercise = testAnnotationsToModelConverter.convert();
				Resource jexResource = resourceSet.createResource(testsResourceUri);
				jexResource.getContents().add(exercise);
				return true;
			}
		}
		return false;
	}

	// IResourceChangeListener
	
	public void resourceChanged(IResourceChangeEvent event) {
		try {
			event.getDelta().accept(this);
		} catch (Exception e) {
		}
	}
	
	public boolean visit(IResourceDelta delta) {
		IResource resource = delta.getResource();
		if (resource instanceof IFile) {
			String filename = resource.getName();
			if (filename.endsWith("." + JexResource.JEX_EXTENSION)) {
				fireResourcesChanged(URI.createPlatformResourceURI(resource.getFullPath().toString(), true));
			} else if (filename.endsWith(".java") /* && file is a jexercise-annotated test */ ) {
				// compute URI for test
			}
			return false;
		}
		return false;
	}

	// IJavaElementListener

	public void elementChanged(ElementChangedEvent event) {
		IJavaElementDelta delta = event.getDelta();
		IResourceDelta[] resourceDeltas = delta.getResourceDeltas();
		for (int i = 0; resourceDeltas != null && i < resourceDeltas.length; i++) {
			try {
				resourceDeltas[i].accept(this);
			} catch (CoreException e) {
			}
		}
	}
}
