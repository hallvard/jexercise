package no.hal.jex.ui;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;

public abstract class AbstractJexResourcesProvider implements JexResourceProvider {

	public abstract void getJexResources(ResourceSet resourceSet);

	protected List<Listener> listeners = new ArrayList<JexResourceProvider.Listener>();
	
	public void addListener(Listener listener) {
		if (listeners != null) {
			listeners.add(listener);
		}
	}

	public void removeListener(Listener listener) {
		if (listeners != null) {
			listeners.remove(listener);
		}
	}
	
	protected void fireResourcesChanged(URI uri) {
		for (Listener listener : listeners) {
			listener.resourceChanged(uri);
		}
	}
}
