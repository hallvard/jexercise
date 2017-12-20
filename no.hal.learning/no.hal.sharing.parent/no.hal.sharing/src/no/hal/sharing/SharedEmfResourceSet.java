package no.hal.sharing;

import java.util.Collection;
import java.util.Collections;

import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import no.hal.sharing.util.Util;

public class SharedEmfResourceSet extends SharedEmfNotifier<ResourceSet> {

	
	public SharedEmfResourceSet(String key, String from, String to, IPath path, ResourceSet resourceSet) {
		super(key, from, to, path, resourceSet);
	}

	public SharedEmfResourceSet(String key, String from, String to, IPath path) {
		this(key, from, to, path, new ResourceSetImpl());
	}

	@Override
	protected int toStringSize() {
		return getResources(getResource()).size();
	}

	@Override
	public void dispose() {
		ResourceSet resourceSet = getResource();
		super.dispose();
		for (Resource resource : resourceSet.getResources()) {
			resource.unload();
		}
	}

	private int resourceNum = -1;
	
	public void setResourceNum(int resourceNum) {
		this.resourceNum = resourceNum;
	}

	@Override
	public IPath getPath() {
		if (isDisposed()) {
			return null;
		}
		Collection<Resource> resources = getResources(getResource());
		for (Resource resource : resources) {
			URI uri = resource.getURI();
			IPath path = SharedEmfResource.getPath(uri);
			if (path != null) {
				return path.addFileExtension("zip");
			}
		}
		return super.getPath();
	}

	protected Collection<Resource> getResources(ResourceSet resourceSet) {
		if (isDisposed()) {
			return Collections.emptyList();
		} else if (resourceNum < 0) {
			return resourceSet.getResources();
		} else if (resourceSet.getResources().size() <= resourceNum) {
			return Collections.emptyList();
		} else {
			return Collections.singleton(resourceSet.getResources().get(resourceNum));
		}
	}
	
	@Override
	protected byte[] getContents(ResourceSet resourceSet) {
		Collection<Resource> resources = getResources(resourceSet);
		if (resources != null) {
			return Util.toByteArray(resources, getSaveOptions());
		}
		return null;
	}
}
