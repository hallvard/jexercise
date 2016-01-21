package no.hal.learning.sharing.util;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;

@SuppressWarnings("serial")
public class EObjectContentsUriMap extends HashMap<EObject, URI> {

	private boolean lazy;
	private final Collection<EObject> roots;

	public EObjectContentsUriMap(Collection<EObject> roots) {
		this.roots = roots;
		setLazy(false);
	}
	public EObjectContentsUriMap(EObject root) {
		this(Collections.singletonList(root));
	}

	protected void setLazy(boolean lazy) {
		this.lazy = lazy;
		if (! lazy) {
			for (EObject root : roots) {
				putAll(root);
			}
		}
	}
	
	protected void putAll(EObject root) {
		super.put(root, createUri(root));
//		Iterator<EObject> contents = root.eAllContents();
//		while (contents.hasNext()) {
//			EObject next = contents.next();
//			URI uri = createUri(next);
//			put(next, uri);
//		}
	}
	
	private URI createUri(EObject eObject) {
		return EcoreUtil.getURI(eObject);
	}

	@Override
	public URI put(EObject key, URI value) {
		return super.put(key, value);
	}
	
	@Override
	public URI get(Object key) {
		return (lazy ? createUri((EObject) key) : super.get(key));
	}
}
