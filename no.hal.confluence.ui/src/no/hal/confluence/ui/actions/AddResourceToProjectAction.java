package no.hal.confluence.ui.actions;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;

import no.hal.confluence.ui.preferences.WikiPreferencePage;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.dialogs.MessageDialog;

public class AddResourceToProjectAction extends AbstractContentRegionAction<URL> {

	public AddResourceToProjectAction() {
		setContentRegionExtractor(getContentMatchingUrlExtractor());
	}

	@Override
	public void run() {
		super.run();
		Collection<IResource> newResources = new ArrayList<IResource>();
		Collection<URL> urlRegions = selectContentRegions();
		for (URL url : urlRegions) {
			String fileName = new Path(url.getPath()).lastSegment();
			// iterate backwards, so the general (default) ones don't shaddow the more spesialized ones
			String folderPath = null;
			outer: for (int i = WikiPreferencePage.WIKI_PATH_KEYS.length - 1; i >= 0; i--) {
				String[] keys = WikiPreferencePage.WIKI_PATH_KEYS[i];
				for (int j = 1; j < keys.length; j++) {
					if (fileName.endsWith(keys[j])) {
						folderPath = getFolderPathString(WikiPreferencePage.keyPathPreference(keys), IFolder.class, null, null);
						if (folderPath != null) {
							break outer;
						}
					}
				}
			}
			if (folderPath != null) {
				IResource newResource = copyLinkedResource(url, folderPath, fileName);
				if (newResource != null) {
					newResources.add(newResource);
				}
			} else {
				String message = "Couldn't find target folder for " + fileName + ". Perhaps the Programming Wiki preferences are wrong or a folder is missing in your project?";
				MessageDialog.openError(browserView.getControl().getShell(), "Missing folder", message);
			}
		}
		PostActionHook<IResource> postActionHook = getPostActionHook();
		if (postActionHook != null) {
			postActionHook.postActionHook(newResources);
		}
	}

	private IResource copyLinkedResource(URL url, String folderPath, String fileName) {
		IContainer folder = getContainer(new Path(folderPath), 0, true);
		if (! (folder instanceof IFolder)) {
			return null;
		}
		try {
			IFile file = ((IFolder) folder).getFile(fileName);
			file.create(url.openStream(), true, null);
			return file;
		} catch (CoreException e) {
		} catch (IOException e) {
		}
		return null;
	}

	protected PostActionHook<IResource> getPostActionHook() {
		return null;
	}
}
