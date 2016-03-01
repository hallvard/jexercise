package no.hal.emf.ui.utils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IAdapterManager;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

public class Util {

	public static Collection<IResource> getResources(Collection<?> collection, String... exceptExtensions) {
		return getResources(collection.iterator(), exceptExtensions);
	}

	public static Collection<IResource> getResources(Iterator<?> it, String... exceptExtensions) {
		Collection<IResource> resources = new ArrayList<IResource>();
		IAdapterManager adapterManager = Platform.getAdapterManager();
		outer: while (it.hasNext()) {
			Object object = it.next();
			String ext = null;
			if (object instanceof URI) {
				URI uri = (URI) object;
				if (uri.isPlatformResource()) {
					object = ResourcesPlugin.getWorkspace().getRoot().findMember(uri.toPlatformString(true));
				}
				ext = uri.fileExtension();
			}
			IResource resource = adapterManager.getAdapter(object, IResource.class);
			if (resource != null) {
				ext = resource.getFileExtension();
			}
			if (resource != null) {
				if (exceptExtensions.length > 0 && ext != null) {
					for (int i = 0; i < exceptExtensions.length; i++) {
						if (exceptExtensions[i].equals(ext)) {
							continue outer;
						}
					}
				}
				resources.add(resource);
			}
		}
		return resources;
	}

	public static boolean isMainEObject(EObject eObject) {
		return eObject.eResource() != null && eObject.eResource().getContents().indexOf(eObject) == 0;
	}

	public static boolean isMainResource(Resource resource) {
		return resource != null && resource.getResourceSet() != null && resource.getResourceSet().getResources().indexOf(resource) == 0;
	}
}
