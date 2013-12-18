package no.hal.confluence.ui.actions;

import no.hal.confluence.ui.Activator;
import no.hal.confluence.ui.preferences.WikiPreferencePage;
import no.hal.confluence.ui.views.BrowserView;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Preferences;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IJavaModel;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragment;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jface.action.Action;

public abstract class WikiAction extends Action {

	protected String urlPattern = null;
	
	public void setUrlPattern(String urlPattern) {
		this.urlPattern = urlPattern;
	}
	
	protected IProgressMonitor progressMonitor = null;
	
	public void setProgressMonitor(IProgressMonitor progressMonitor) {
		this.progressMonitor = progressMonitor;
	}

	protected BrowserView browserView;
	
	public void update(BrowserView browserView) {
		this.browserView = browserView;
		update(browserView.getLocation());
	}
	
	protected void update(String urlString) {
		setEnabled(urlPattern == null || matchUrl(urlString));
	}

	protected boolean matchUrl(String urlString) {
		return urlString != null && urlString.matches(urlPattern);
	}
	
	protected <RT extends IResource, JT extends IJavaElement> String getFolderPathString(String key, Class<RT> resourceClass, Class<JT> javaElementClass) {
		String pathString = null;
		if (key != null) {
			Preferences pluginPreferences = Activator.getDefault().getPluginPreferences();
			pathString = pluginPreferences.getString(key);
		}
		if (pathString != null) {
			IPath path = new Path(pathString);
			IResource resource = (resourceClass != null ? getContainer(path, 0, true) : null);
			IJavaElement javaElement = (javaElementClass != null ? getJavaElement(path) : null);
			if ((resourceClass == null || resourceClass.isInstance(resource)) && (javaElementClass == null || javaElementClass.isInstance(javaElement))) {
				return pathString;
			}
		}
		// TODO Should open SelectResourceDialog and allow the user to select a resource, with appropriate filter 
		return null;
	}

	protected IResource getResource(IPath path) {
		IContainer folder = getContainer(path, 1, false);
		return (folder != null ? folder.findMember(path.lastSegment()) : null);
	}

	protected IContainer getContainer(IPath path, int parentCount, boolean create) {
		IResource resource = ResourcesPlugin.getWorkspace().getRoot();
		for (int i = 0; i < path.segmentCount() - parentCount; i++) {
			String segment = path.segment(i);
			IResource child = null;
			if (resource instanceof IContainer) {
				child = ((IContainer) resource).findMember(segment);
			};
			if (child != null) {
				resource = child;
			} else if (resource instanceof IFolder && create) {
				IFolder folder = ((IFolder) resource).getFolder(segment);
				try {
					folder.create(false, true, null);
					resource = folder;
				} catch (CoreException e) {
					return null;
				}
			}
		}
		return (resource instanceof IContainer ? (IContainer) resource : null);
	}
	
	protected IJavaElement getJavaElement(IPath path) {
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
