package no.hal.emfs.provider;

import java.net.URI;
import java.net.URISyntaxException;

import no.hal.emfs.EmfsResource;
import no.hal.emfs.util.EmfsResourceImpl;

import org.eclipse.core.filesystem.EFS;
import org.eclipse.core.filesystem.IFileStore;
import org.eclipse.core.filesystem.provider.FileSystem;
import org.eclipse.core.resources.IPathVariableManager;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

/**
 * A test file system that keeps everything in memory.
 */
public class EmfsFileSystem extends FileSystem {
	
	private ResourceSet resourceSet;
	
	public EmfsFileSystem() {
		resourceSet = new ResourceSetImpl();
	}

	public static URI toURI(IPath path) {
		try {
			return new URI(EmfsResourceImpl.EMFS_SCHEME, null, path.setDevice(null).toPortableString(), null);
		} catch (URISyntaxException e) {
			//should not happen
			throw new RuntimeException(e);
		}
	}

	public IFileStore getStore(URI uri) {
		String query = uri.getQuery(), path = uri.getPath();
		org.eclipse.emf.common.util.URI emfUri = null;
		try {
			URI resourceUri = new URI(query);
			int pos = query.indexOf(':');
			if (pos < 0 || pos > 8) {
				IWorkspace workspace = ResourcesPlugin.getWorkspace();
				IPathVariableManager pathVariableManager = workspace.getPathVariableManager();
				resourceUri = pathVariableManager.resolveURI(resourceUri);
			}
			IFileStore resourceStore = EFS.getStore(resourceUri);
			String filePath = resourceStore.toLocalFile(EFS.NONE, null).getAbsolutePath();
			emfUri = org.eclipse.emf.common.util.URI.createFileURI(filePath);
		} catch (Exception e) {
			org.eclipse.emf.common.util.URI.createURI(query);
		}
		Resource resource = resourceSet.getResource(emfUri, true);
		EObject eObject = null;
		try {
			eObject = resource.getEObject(path);
//			System.out.println(path + " -> " + eObject);
		} catch (Exception e) {
			System.err.println("Exception when calling getEObject(\"" + path + "\")" + e);
		}
		if (eObject instanceof EmfsResource) {
			return new EmfsFileStore(this, null, (EmfsResource) eObject, null);
		}
		return EFS.getNullFileSystem().getStore(uri);
	}

	public boolean isCaseSensitive() {
		return true;
	}
	
	public static java.net.URI getURI(EmfsResource emfsResource) {
		org.eclipse.emf.common.util.URI baseUri = emfsResource.eResource().getURI();
		String path = no.hal.emfs.util.EmfsResourceImpl.getPathString(emfsResource);
		try {
			return new URI(EmfsResourceImpl.EMFS_SCHEME, null, path, baseUri.toString(), null);
		} catch (URISyntaxException e) {
		}
		return null;
	}
}
