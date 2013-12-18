package no.hal.jex.ui;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;

public interface JexResourceProvider {
	
	public void getJexResources(ResourceSet resourceSet);
	
	public interface Listener {
		public void resourceChanged(URI uri);
	}
	
	public void addListener(JexResourceProvider.Listener listener);
	public void removeListener(JexResourceProvider.Listener listener);
}
