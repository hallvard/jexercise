package no.hal.emfs.xtext.scoping;

import no.hal.emfs.EmfsResource;
import no.hal.emfs.util.EmfsResourceImpl;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.resource.DefaultFragmentProvider;

public class EmfsFragmentProvider extends DefaultFragmentProvider {

	public String getFragment(EObject obj, Fallback fallback) {
		if (obj instanceof EmfsResource) {
			String path = EmfsResourceImpl.getFullPathString((EmfsResource) obj);
			if (path != null && path.length() > 1) {
				return path;
			}
		}
		return super.getFragment(obj, fallback);
	}

	public EObject getEObject(Resource resource, String fragment, Fallback fallback) {
		EmfsResource emfsResource = null;
		if (fragment != null) {
			emfsResource = EmfsResourceImpl.getEmfsResource(resource, fragment);
		}
		if (emfsResource != null) {
			return emfsResource;
		}
		try {
			return super.getEObject(resource, fragment, fallback);
		} catch (Exception e) {
			System.err.println(e);
		}
		return null;
	}
}
