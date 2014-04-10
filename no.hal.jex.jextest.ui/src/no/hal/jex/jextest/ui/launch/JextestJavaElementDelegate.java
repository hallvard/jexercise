package no.hal.jex.jextest.ui.launch;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.xtext.xbase.ui.launching.JavaElementDelegate;

public class JextestJavaElementDelegate extends JavaElementDelegate {

	private IResource resource;

	@Override
	public void initializeWith(IResource resource) {
		super.initializeWith(resource);
		this.resource = resource;
	}

	@Override
	public Object getAdapter(Class adapter) {
		if (IJavaElement.class.equals(adapter) && resource != null && "jextest".equals(resource.getFileExtension())) {
			try {
				return findTestClassForJextest(resource);
			} catch (CoreException e) {
			}
		}
		try {
			return super.getAdapter(adapter);
		} catch (NullPointerException e) {
			// problem with @Inject in superclass
		}
		return null;
	}

	private IJavaElement findTestClassForJextest(IResource file) throws CoreException {
		IProject project = file.getProject();
		if (project == null || (! project.isNatureEnabled("org.eclipse.jdt.core.javanature"))) {
			return null;
		}
		IJavaProject javaProject = JavaCore.create(project);
		IPackageFragmentRoot[] roots = javaProject.getPackageFragmentRoots();
		String typeName = file.getName();
		typeName = typeName.substring(0, typeName.length() - file.getFileExtension().length() - 1) + "Test";
		IContainer parent = file.getParent();
		outer: while (parent != null && parent != project) {
			for (int i = 0; i < roots.length; i++) {
				IResource rootResource = roots[i].getResource();
				if (rootResource != null) {
					IPath rootPath = rootResource.getProjectRelativePath();
					IPath parentPath = parent.getProjectRelativePath();
					if (parentPath.equals(rootPath)) {
						break outer;
					}
				}
			}
			typeName = parent.getName() + "." + typeName;
			parent = parent.getParent();
		}
		return javaProject.findType(typeName);
	}
}
