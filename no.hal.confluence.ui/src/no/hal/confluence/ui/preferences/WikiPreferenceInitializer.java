package no.hal.confluence.ui.preferences;

import no.hal.confluence.ui.Activator;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;

/**
 * Class used to initialize default preference values.
 */
public class WikiPreferenceInitializer extends AbstractPreferenceInitializer {

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer#initializeDefaultPreferences()
	 */
	public void initializeDefaultPreferences() {
		IPreferenceStore store = Activator.getDefault().getPreferenceStore();
		store.setDefault(WikiPreferencePage.WIKI_URL, "https://www.ntnu.no/wiki/display/tdt4100/");
		store.setDefault(WikiPreferencePage.WIKI_SOURCE_PATH, "/tdt4100/src");
		// skip the first one, since the source folder name does not follow the pattern
		for (int i = 1; i < WikiPreferencePage.WIKI_PATH_KEYS.length; i++) {
			store.setDefault(WikiPreferencePage.keyPathPreference(WikiPreferencePage.WIKI_PATH_KEYS[i]), "/tdt4100/" + WikiPreferencePage.WIKI_PATH_KEYS[0]);
		}
		store.setDefault(WikiPreferencePage.WIKI_TESTS_PATH, "/tdt4100/tests");
		store.setDefault(WikiPreferencePage.WIKI_LIBS_PATH, "/tdt4100/libs");
		store.setDefault(WikiPreferencePage.WIKI_RESOURCES_PATH, "/tdt4100/resources");
	}
}
