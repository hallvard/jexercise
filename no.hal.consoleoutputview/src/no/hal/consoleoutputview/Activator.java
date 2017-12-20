package no.hal.consoleoutputview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.Platform;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

public class Activator extends AbstractUIPlugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "no.hal.consoleoutputview"; //$NON-NLS-1$

	// The shared instance
	private static Activator plugin;
	
	/**
	 * The constructor
	 */
	public Activator() {
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		super.stop(context);
	}

	/**
	 * Returns the shared instance
	 *
	 * @return the shared instance
	 */
	public static Activator getDefault() {
		return plugin;
	}

	//
	
	private List<String> consoleOutputViews = null;
	
	private void processConsoleOutputViews() {
		IConfigurationElement[] elements = Platform.getExtensionRegistry().getConfigurationElementsFor("no.hal.consoleoutputview.consoleOutputView");
		for (int i = 0; i < elements.length; i++) {
			IConfigurationElement element = elements[i];
			String key = element.getAttribute("key");
			String viewId = element.getAttribute("viewId");
			if (viewId == null) {
				viewId = element.getContributor().getName() + "." + key;
			}
			consoleOutputViews.addAll(Arrays.asList(key, viewId));
		}
	}
	
	public String getConsoleOutputViewId(String key) {
		if (consoleOutputViews == null) {
			consoleOutputViews = new ArrayList<String>();
			processConsoleOutputViews();
		}
		for (int i = 0; i < consoleOutputViews.size(); i += 2) {
			if (key.equals(consoleOutputViews.get(i))) {
				return consoleOutputViews.get(i + 1);
			}
		}
		return consoleOutputViews.contains(key) ? key : null;
	}
}
