package no.hal.confluence.ui.actions.util;

import no.hal.confluence.ui.Activator;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.preference.IPreferenceStore;

public class ResourceUtil {

	public static IResource getResource(IPath path) {
		IContainer folder = getContainer(path, 1, false);
		return (folder != null ? folder.findMember(path.lastSegment()) : null);
	}

	@SuppressWarnings("serial")
	public static class MissingFolderPathException extends RuntimeException {
		
		public final String key, pathString;
		
		private MissingFolderPathException(String message, String key, String pathString) {
			super(message);
			this.key = key;
			this.pathString = pathString;
		}
		public MissingFolderPathException(String key) {
			this("Couldn't find target folder preferences for " + key, key, null);
		}
		public MissingFolderPathException(String key, String pathString) {
			this("Couldn't find target folder " + pathString + " for " + key, key, pathString);
		}
	}
	
	public static <RT extends IResource> String getFolderPathString(String key, Class<RT> resourceClass, String errorMessage) {
		String pathString = null;
		if (key != null) {
			IPreferenceStore pluginPreferences = Activator.getDefault().getPreferenceStore();
			pathString = pluginPreferences.getString(key);
			if (pathString == null) {
				RuntimeException ex = new MissingFolderPathException(key);
				if (errorMessage != null) {
					String message = ex.getMessage() + ". Perhaps the Programming Wiki preferences are wrong?";
					MessageDialog.openError(null, errorMessage, message);
				} else {
					throw ex;
				}
			}
		}
		if (pathString != null) {
			IPath path = new Path(pathString);
			IResource resource = (resourceClass != null ? getContainer(path, 0, true) : null);
			if (resourceClass != null && (! resourceClass.isInstance(resource))) {
				RuntimeException ex = new MissingFolderPathException(key, pathString);
				if (errorMessage != null) {
					String message = ". Perhaps the Programming Wiki preferences are wrong or a folder is missing in your project?";
					MessageDialog.openError(null, errorMessage, message);
				} else {
					throw ex;
				}
			}
		}
		return pathString;
	}

	public static IContainer getContainer(IPath path, int parentCount, boolean create) {
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
	
	public static IFile createFile(String folderPath, String fileName) {
		IContainer folder = ResourceUtil.getContainer(new Path(folderPath), 0, true);
		if (! (folder instanceof IFolder)) {
			return null;
		}
		IFile file = ((IFolder) folder).getFile(fileName);
		return file;
	}
	
	public static IFile createFile(IPath path) {
		return createFile(path.removeLastSegments(1).toString(), path.lastSegment());
	}
}
