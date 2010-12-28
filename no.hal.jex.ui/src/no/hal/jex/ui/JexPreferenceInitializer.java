package no.hal.jex.ui;

import no.hal.jex.resource.JexResource;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;

/**
 * Class used to initialize default preference values.
 */
public class JexPreferenceInitializer extends AbstractPreferenceInitializer {

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer#initializeDefaultPreferences()
	 */
	public void initializeDefaultPreferences() {
		IPreferenceStore store = JexUiPlugin.getPlugin().getPreferenceStore();
//		store.setDefault(JexPreferencePage.JEX_SERVER, "tdt4100.idi.ntnu.no");
		store.setDefault(JexPreferencePage.JEX_PATH_PATTERN, "/ovinger/" + JexResource.JEX_EXTENSION + "/");
//		store.setDefault(JexPreferencePage.JEX_FILE_PATTERN, ".+\\." + JexResource.JEX_EXTENSION);
	}
}
