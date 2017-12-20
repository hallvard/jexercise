package no.hal.sharing.ui.prefs;

import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;

import no.hal.sharing.ui.Activator;

/**
 * Class used to initialize default preference values.
 */
public class SharingPreferenceInitializer extends AbstractPreferenceInitializer {

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer#initializeDefaultPreferences()
	 */
	public void initializeDefaultPreferences() {
		IPreferenceStore store = Activator.getDefault().getPreferenceStore();
		store.setDefault(SharingPreferencePage.OWNER_SHARING_ID, no.hal.sharing.Activator.getActivator().getSharingOwner());
	}
}
