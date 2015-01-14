package no.hal.confluence.ui.preferences;

import java.util.Map;

import no.hal.confluence.ui.Activator;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;

/**
 * Class used to initialize default preference values.
 */
public class ImportPathsPreferenceInitializer extends AbstractPreferenceInitializer {

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer#initializeDefaultPreferences()
	 */
	public void initializeDefaultPreferences() {
		IPreferenceStore store = Activator.getDefault().getPreferenceStore();
		for (Map.Entry<String, String> keyPath : ImportPathsPreferencePage.getEmfsResourcePaths()) {
			String path = keyPath.getValue();
			if (path != null) {
				store.setDefault(ImportPathsPreferencePage.keyPathPreference(ImportPathsPreferencePage.getEmfsResourcePathKeys(keyPath)), path);
			}
		}
	}
}
