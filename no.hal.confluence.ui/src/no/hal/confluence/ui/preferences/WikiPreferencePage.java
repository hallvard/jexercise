package no.hal.confluence.ui.preferences;

import no.hal.confluence.ui.Activator;

import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.jface.preference.StringFieldEditor;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.help.IWorkbenchHelpSystem;

/**
 * This class represents a preference page that
 * is contributed to the Preferences dialog. By 
 * subclassing <samp>FieldEditorPreferencePage</samp>, we
 * can use the field support built into JFace that allows
 * us to create a page that is small and knows how to 
 * save, restore and apply itself.
 * <p>
 * This page is used to modify preferences only. They
 * are stored in the preference store that belongs to
 * the main plug-in class. That way, preferences can
 * be accessed directly via the preference store.
 */

public class WikiPreferencePage extends FieldEditorPreferencePage
	implements IWorkbenchPreferencePage {

	public WikiPreferencePage() {
		super(GRID);
		setPreferenceStore(Activator.getDefault().getPreferenceStore());
		setDescription("Preference page for Programming Wiki");
	}
	
	public static final String WIKI_URL = "wikiUrlPreference";

	public static String keyPathPreference(String[] keys) {
		String preferenceKey = "wikiPathPreference";
		for (int i = 0; i < keys.length; i++) {
			preferenceKey += "_" + keys[i];
 		}
		return preferenceKey;
	}
	
	public static final String[] WIKI_SOURCE_PATH_KEYS = {"source", ".java"};
	public static final String WIKI_SOURCE_PATH = keyPathPreference(WIKI_SOURCE_PATH_KEYS);
	
	public static final String[] WIKI_TESTS_PATH_KEYS = {"tests", "Test.java"};
	public static final String WIKI_TESTS_PATH = keyPathPreference(WIKI_TESTS_PATH_KEYS);

	public static final String[] WIKI_LIBRARIES_PATH_KEYS = {"library", ".jar"};
	public static final String WIKI_LIBS_PATH = keyPathPreference(WIKI_LIBRARIES_PATH_KEYS);

	public static final String[] WIKI_RESOURCE_PATH_KEYS = {"icons", ".png", ".jpeg"};
	public static final String WIKI_RESOURCES_PATH = keyPathPreference(WIKI_RESOURCE_PATH_KEYS);

	public final static String[] WIKI_PATH_KEYS[] = {
		WIKI_SOURCE_PATH_KEYS, WIKI_TESTS_PATH_KEYS, WIKI_LIBRARIES_PATH_KEYS, WIKI_RESOURCE_PATH_KEYS
	};
	
	/**
	 * Creates the field editors. Field editors are abstractions of
	 * the common GUI blocks needed to manipulate various types
	 * of preferences. Each field editor knows how to save and
	 * restore itself.
	 */
	public void createFieldEditors() {
		Composite parent = getFieldEditorParent();
		IWorkbenchHelpSystem help = PlatformUI.getWorkbench().getHelpSystem();
		String helpContext = Activator.getDefault().getBundle().getSymbolicName() + ".WikiPreferencePage";
		help.setHelp(parent, helpContext);
		addField(new StringFieldEditor(WIKI_URL, "Wiki URL (e.g. http://www.ntnu.no/wiki/display/tdt4100/):", parent));
		for (int i = 0; i < WIKI_PATH_KEYS.length; i++) {
			String[] keys = WIKI_PATH_KEYS[i];
			String label = keys[0];
			if (Character.isLowerCase(label.charAt(0))) {
				label = Character.toUpperCase(label.charAt(0)) + label.substring(1);
			}
			label += " path";
			for (int j = 1; j < keys.length; j++) {
				label += (j == 1 ? " (" : ", ");
				label += keys[j];
				if (j + 1 == keys.length) {
					label += ")";
				}
			}
			label += ":";
			addField(new StringFieldEditor(keyPathPreference(keys), label, parent));
		}
	}

	public void init(IWorkbench workbench) {
	}
}