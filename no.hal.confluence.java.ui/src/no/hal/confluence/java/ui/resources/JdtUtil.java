package no.hal.confluence.java.ui.resources;

import no.hal.confluence.ui.actions.util.ResourceUtil;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IJavaModel;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragment;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jface.dialogs.MessageDialog;

public class JdtUtil extends ResourceUtil {

	public static <RT extends IResource, JT extends IJavaElement> String getFolderPathString(String key, Class<RT> resourceClass, Class<JT> javaElementClass, String errorMessage) {
		String pathString = getFolderPathString(key, resourceClass, errorMessage);
		if (pathString != null) {
			IPath path = new Path(pathString);
			IJavaElement javaElement = (javaElementClass != null ? getJavaElement(path) : null);
			if ((javaElementClass == null || javaElementClass.isInstance(javaElement))) {
				return pathString;
			}
		}
		if (errorMessage != null) {
			String message = "Couldn't find target folder for " + key + ". Perhaps the Programming Wiki preferences are wrong or a folder is missing in your project?";
			MessageDialog.openError(null, "Missing folder", message);
		}
		return null;
	}

	public static IJavaElement getJavaElement(IPath path) {
		IJavaModel javaModel = JavaCore.create(ResourcesPlugin.getWorkspace().getRoot());
		IJavaElement javaElement = javaModel;
		String packageName = null;
		for (int i = 0; i < path.segmentCount(); i++) {
			String segment = path.segment(i);
			if (javaElement instanceof IJavaModel) {
				javaElement = ((IJavaModel) javaElement).getJavaProject(segment);
			} else if (javaElement instanceof IJavaProject) {
				javaElement = ((IJavaProject) javaElement).getPackageFragmentRoot(segment);
				packageName = "";
			} else if (javaElement instanceof IPackageFragmentRoot) {
				IPackageFragment javaPackage = ((IPackageFragmentRoot) javaElement).getPackageFragment(packageName);
				ICompilationUnit javaFile = javaPackage.getCompilationUnit(segment);
				if (javaFile != null) {
					javaElement = javaFile;
				}
				if (packageName.length() > 0) {
					packageName += ".";
				}
				packageName += segment;
			} else {
				return null;
			}
		}
		if (javaElement instanceof IPackageFragmentRoot && packageName.length() > 0) {
			return ((IPackageFragmentRoot) javaElement).getPackageFragment(packageName);
		}
		return javaElement;
	}
}
