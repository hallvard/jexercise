package no.hal.jex;

import no.hal.jex.resource.JexResource;

import org.eclipse.core.runtime.Plugin;
import org.eclipse.emf.ecore.resource.Resource;
import org.osgi.framework.BundleContext;


public class JexEmfPlugin extends Plugin {

	public JexEmfPlugin() {
	}

	public void start(BundleContext arg0) throws Exception {
		super.start(arg0);
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(JexResource.JEX_EXTENSION, new JexResource.Factory());
	}
}
