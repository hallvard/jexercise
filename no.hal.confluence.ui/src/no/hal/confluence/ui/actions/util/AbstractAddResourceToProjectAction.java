package no.hal.confluence.ui.actions.util;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;

import no.hal.confluence.ui.actions.AbstractContentRegionAction;
import no.hal.confluence.ui.actions.PostActionHook;
import no.hal.confluence.ui.preferences.ImportPathsPreferencePage;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.dialogs.MessageDialog;

public abstract class AbstractAddResourceToProjectAction extends AbstractContentRegionAction<URL> {

	public AbstractAddResourceToProjectAction() {
		setContentRegionExtractor(getContentMatchingUrlExtractor());
	}

	@Override
	public void run() {
		super.run();
		Collection<IResource> newResources = new ArrayList<IResource>();
		Collection<URL> urlRegions = selectContentRegions();
		for (URL url : urlRegions) {
			String fileName = new Path(url.getPath()).lastSegment();
			String keys[] = ImportPathsPreferencePage.getFileNameKeys(fileName);
			String folderPath = (keys != null ? getFolderPath(keys) : null);
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

	protected String getFolderPath(String[] keys) {
		return ResourceUtil.getFolderPathString(ImportPathsPreferencePage.keyPathPreference(keys), IFolder.class, null);
	}

	protected IResource copyLinkedResource(URL url, String folderPath, String fileName) {
		IFile file = ResourceUtil.createFile(folderPath, fileName);
		try {
			if (file != null) {
				file.create(url.openStream(), true, null);
				return file;
			}
		} catch (CoreException e) {
		} catch (IOException e) {
		}
		return null;
	}

	protected PostActionHook<IResource> getPostActionHook() {
		return null;
	}
}
