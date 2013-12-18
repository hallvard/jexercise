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
			for (int i = 0; i < WikiPreferencePage.WIKI_PATH_KEYS.length; i++) {
				String[] keys = WikiPreferencePage.WIKI_PATH_KEYS[i];
				for (int j = 1; j < keys.length; j++) {
					if (fileName.endsWith(keys[j])) {
						String folderPath = getFolderPathString(WikiPreferencePage.keyPathPreference(keys), IFolder.class, null);
						if (folderPath != null) {
							IResource newResource = copyLinkedResource(url, folderPath, fileName);
							if (newResource != null) {
								newResources.add(newResource);
							}
						}
					}
				}
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
