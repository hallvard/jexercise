package no.hal.confluence.ui;

import java.util.ArrayList;
import java.util.List;

import no.hal.confluence.ui.actions.WikiAction;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.InvalidRegistryObjectException;
import org.eclipse.core.runtime.Platform;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle
 */
public class Activator extends AbstractUIPlugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "no.hal.confluence.ui"; //$NON-NLS-1$

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

	private List<WikiAction> wikiActions = null;
	
	private void processWikiActions() {
		IConfigurationElement[] elements = Platform.getExtensionRegistry().getConfigurationElementsFor("no.hal.confluence.ui.wikiAction");
		for (int i = 0; i < elements.length; i++) {
			IConfigurationElement element = elements[i];
			try {
				WikiAction wikiAction = (WikiAction) element.createExecutableExtension("wikiActionClass");
				String name = element.getAttribute("name");
				if (name != null) {
					wikiAction.setText(name);
				}
				String description = element.getAttribute("description");
				if (description != null) {
					wikiAction.setDescription(description);
				}
				String urlPattern = element.getAttribute("urlPattern");
				if (urlPattern != null) {
					wikiAction.setUrlPattern(urlPattern);
				}
				wikiActions.add(wikiAction);
			} catch (CoreException e) {
				System.err.println(e);
			}
		}
	}
	
	public Iterable<WikiAction> getWikiActions() {
		if (wikiActions == null) {
			wikiActions = new ArrayList<WikiAction>();
			processWikiActions();
		}
		return wikiActions;
	}
}
