package no.hal.confluence.ui;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import no.hal.confluence.ui.resources.ContentRegionExtractor;
import no.hal.confluence.ui.resources.EmfsResourceClassifier;
import no.hal.confluence.ui.resources.EmfsResourceExtractor;
import no.hal.confluence.ui.resources.util.AbstractResourceExtractor;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
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

	//

	private int logLevelMask = IStatus.ERROR;
	
	public static void logOn(int mask) {
		Activator.getDefault().logLevelMask |= mask;
	}

	public static void logOff(int mask) {
		Activator.getDefault().logLevelMask &= ~mask;
	}

	public static boolean isLogging(int mask) {
		return (Activator.getDefault().logLevelMask & mask) == mask;
	}

	public static void log(int severity, String message, Exception e) {
		if ((Activator.getDefault().logLevelMask & severity) != 0) {
			Status status = new Status(severity, getDefault().getBundle().getSymbolicName(), message, e);
			Activator.getDefault().getLog().log(status);
		}
	}
	
	public static void logInfo(String message) {
		log(IStatus.INFO, message, null);
	}
	
	public static void logWarning(String message, Exception e) {
		log(IStatus.WARNING, message, e);
	}

	public static void logError(String message, Exception e) {
		log(IStatus.ERROR, message, e);
	}

	//
	
	private Collection<ContentRegionExtractor<String>> contentRegionExtractors = null;
	private Collection<EmfsResourceClassifier<String>> emfsResourceClassifiers = null;
	private Collection<EmfsResourceExtractor> emfsResourceExtractors = null;
	
	private void processEmfsResourceExtractors() {
		emfsResourceExtractors = new ArrayList<EmfsResourceExtractor>();
		contentRegionExtractors = new ArrayList<ContentRegionExtractor<String>>();
		emfsResourceClassifiers = new ArrayList<EmfsResourceClassifier<String>>();
		IConfigurationElement[] elements = Platform.getExtensionRegistry().getConfigurationElementsFor("no.hal.confluence.ui.emfsResourceExtractor");
		for (int i = 0; i < elements.length; i++) {
			IConfigurationElement element = elements[i];
				try {
					ContentRegionExtractor contentRegionExtractor = null;
					EmfsResourceClassifier emfsResourceClassifier = null;
					if (element.getAttribute("contentRegionExtractorClass") != null) {
						contentRegionExtractor = (ContentRegionExtractor<?>) element.createExecutableExtension("contentRegionExtractorClass");
					}
					if (element.getAttribute("emfsResourceClassifierClass") != null) {
						emfsResourceClassifier = (EmfsResourceClassifier<?>) element.createExecutableExtension("emfsResourceClassifierClass");
					}
					String elementName = element.getName();
					if ("emfsResourceExtractor".equals(elementName)) {
						EmfsResourceExtractor emfsResourceExtractor = null;
						if (element.getAttribute("emfsResourceExtractorClass") != null) {
							emfsResourceExtractor = (EmfsResourceExtractor) element.createExecutableExtension("emfsResourceExtractorClass");
						} else {
							emfsResourceExtractor = new AbstractResourceExtractor();
						}
						if (emfsResourceExtractor instanceof AbstractResourceExtractor) {
							AbstractResourceExtractor resourceExtractor = (AbstractResourceExtractor) emfsResourceExtractor;
							if (contentRegionExtractor != null) {
								resourceExtractor.addContentRegionExtractors(contentRegionExtractor);
							}
							if (emfsResourceClassifier != null) {
								resourceExtractor.addEmfsResourceClassifiers(emfsResourceClassifier);
							}
							if ("true".equals(element.getAttribute("useDomAsSource"))) {
								resourceExtractor.setUseDomAsSource(true);
							}
						}
						emfsResourceExtractors.add(emfsResourceExtractor);
					} else if ("contentRegionExtractor".equals(elementName) && contentRegionExtractor != null) {
						contentRegionExtractors.add(contentRegionExtractor);
					} else if ("emfsResourceClassifier".equals(elementName) && emfsResourceClassifier != null) {
						emfsResourceClassifiers.add(emfsResourceClassifier);
					}
			} catch (CoreException e) {
				System.err.println(e);
			}
		}
		// finally, add the generic one
		AbstractResourceExtractor<String> emfsResourceExtractor = new AbstractResourceExtractor<String>();
		emfsResourceExtractor.addContentRegionExtractors(contentRegionExtractors);
		emfsResourceExtractor.addEmfsResourceClassifiers(emfsResourceClassifiers);
		// add first, so the generic ones run first
		emfsResourceExtractors.add(emfsResourceExtractor);
	}

	public Collection<EmfsResourceExtractor> getEmfsResourceExtractors() {
		if (emfsResourceExtractors == null) {
			processEmfsResourceExtractors();
		}
		return emfsResourceExtractors;
	}
	
	private Collection<Map.Entry<String, String>> emfsResourcePaths = null;
	
	private void processEmfsResourcePaths() {
		IConfigurationElement[] elements = Platform.getExtensionRegistry().getConfigurationElementsFor("no.hal.confluence.ui.emfsResourceExtractor");
		for (int i = 0; i < elements.length; i++) {
			IConfigurationElement element = elements[i];
			if ("emfsResourcePath".equals(element.getName())) {
				String pathKeys = element.getAttribute("pathKeys");
				String defaultPath = element.getAttribute("defaultPath");
				emfsResourcePaths.add(new AbstractMap.SimpleEntry<String, String>(pathKeys, defaultPath));
			}
		}
	}

	public Collection<Map.Entry<String, String>> getEmfsResourcePaths() {
		if (emfsResourcePaths == null) {
			emfsResourcePaths = new ArrayList<Map.Entry<String, String>>();
			processEmfsResourcePaths();
		}
		return emfsResourcePaths;
	}
	
	private List<String> consoleOutputViews = null;
	
	private void processConsoleOutputViews() {
		IConfigurationElement[] elements = Platform.getExtensionRegistry().getConfigurationElementsFor("no.hal.confluence.ui.consoleOutputView");
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
