package no.hal.learning.exercise.jdt;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.IExtensionPoint;
import org.eclipse.core.runtime.Platform;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

import no.hal.learning.exercise.jdt.metrics.IMetricsProvider;

public class Activator implements BundleActivator {

	private static Activator INSTANCE;
	
	public static Activator getInstance() {
		return INSTANCE;
	}
	
	@Override
	public void start(BundleContext context) throws Exception {
		Activator.INSTANCE = this;
	}

	@Override
	public void stop(BundleContext context) throws Exception {
		Activator.INSTANCE = null;
	}
	
	private Map<String, IMetricsProvider> metricsProviders = null;
	
	public String[] getMetricsProviderNames() {
		ensureMetricsProviders();
		return metricsProviders.keySet().toArray(new String[0]);
	}

	protected void ensureMetricsProviders() {
		if (metricsProviders == null) {
			metricsProviders = new HashMap<String, IMetricsProvider>();
		}
		processMetricsProvidersExtension();
	}

	public IMetricsProvider getMetricsProvider(String name) {
		ensureMetricsProviders();
		return metricsProviders.get(name);
	}
	
	private void processMetricsProvidersExtension() {
		IExtensionPoint ep = Platform.getExtensionRegistry().getExtensionPoint("no.hal.learning.exercise.jdt.metricsProvider");
		IExtension[] extensions = ep.getExtensions();
		for (int i = 0; i < extensions.length; i++) {
			for (IConfigurationElement ces: extensions[i].getConfigurationElements()) {
				String name = ces.getName();
				if ("metricsProvider".equals(name)) {
					try {
						IMetricsProvider metricsProvider = (IMetricsProvider) ces.createExecutableExtension("providerClass");
						metricsProviders.put(ces.getAttribute("name"), metricsProvider);
					} catch (Exception e) {
						System.err.println(e);
					}
				}
			}
		}
	}
}
