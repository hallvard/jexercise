package no.hal.confluence.ui.preferences;

import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;

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

public class ImportPathsPreferencePage extends FieldEditorPreferencePage
	implements IWorkbenchPreferencePage {

	public ImportPathsPreferencePage() {
		super(GRID);
		setPreferenceStore(Activator.getDefault().getPreferenceStore());
		setDescription("Import paths for Digital Compendium");
	}
	
	protected static Collection<Entry<String, String>> getEmfsResourcePaths() {
		return Activator.getDefault().getEmfsResourcePaths();
	}

	protected static Map.Entry<String, String>[] getEmfsResourcePathsArray() {
		Collection<Entry<String, String>> emfsResourcePaths = getEmfsResourcePaths();
		return emfsResourcePaths.toArray(new Map.Entry[emfsResourcePaths.size()]);
	}

	protected static String[] getEmfsResourcePathKeys(Map.Entry<String, String> pathKeys) {
		return pathKeys.getKey().split(",");
	}
	
	public static String keyPathPreference(String[] keys) {
		String preferenceKey = "wikiPathPreference";
		for (int i = 0; i < keys.length; i++) {
			preferenceKey += "_" + keys[i];
 		}
		return preferenceKey;
	}
	
	public static String[] getFileNameKeys(String fileName) {
		Map.Entry<String, String>[] emfsResourcePathsArray = getEmfsResourcePathsArray();
		// iterate backwards, so the general (default) ones don't shaddow the more spesialized ones
		for (int i = emfsResourcePathsArray.length - 1; i >= 0; i--) {
			String[] keys = getEmfsResourcePathKeys(emfsResourcePathsArray[i]);
			if (hasKey(fileName, keys, 1)) {
				return keys;
			}
		}
		return null;
	}

	protected static boolean hasKey(String key, String[] keys, int start) {
		for (int i = start; i < keys.length; i++) {
			if (key.endsWith(keys[i])) {
				return true;
			}
		}
		return false;
	}

	public static String[] getTagKeys(String[] tags) {
		Map.Entry<String, String>[] emfsResourcePathsArray = getEmfsResourcePathsArray();
		// iterate backwards, so the general (default) ones don't shaddow the more spesialized ones
		outer: for (int i = emfsResourcePathsArray.length - 1; i >= 0; i--) {
			String[] keys = getEmfsResourcePathKeys(emfsResourcePathsArray[i]);
			int matches = 0;
			for (int j = 0; j < keys.length; j++) {
				String key = keys[j];
				if (key.startsWith("#")) {
					if (hasKey(key, tags, 0)) {
						matches++;
					} else {
						continue outer;
					}
				}
			}
			if (matches > 0) {
				return keys;
			}
		}
		return null;
	}
	
//	public static final String[] WIKI_SOURCE_PATH_KEYS = {"source", ".java", "#java"};
//	public static final String WIKI_SOURCE_PATH = keyPathPreference(WIKI_SOURCE_PATH_KEYS);
//	
//	public static final String[] WIKI_TESTS_PATH_KEYS = {"tests", "Test.java", "#java", "#test"};
//	public static final String WIKI_TESTS_PATH = keyPathPreference(WIKI_TESTS_PATH_KEYS);
//
//	public static final String[] WIKI_LIBRARIES_PATH_KEYS = {"library", ".jar"};
//	public static final String WIKI_LIBS_PATH = keyPathPreference(WIKI_LIBRARIES_PATH_KEYS);
//
//	public static final String[] WIKI_RESOURCE_PATH_KEYS = {"icons", ".png", ".jpeg"};
//	public static final String WIKI_RESOURCES_PATH = keyPathPreference(WIKI_RESOURCE_PATH_KEYS);
//
//	public static final String[] WIKI_PYTHON_PATH_KEYS = {"python", ".py", "#python"};
//	public static final String WIKI_PYTHON_PATH = keyPathPreference(WIKI_PYTHON_PATH_KEYS);
//	
//	public static final String[] WIKI_PYTHON_PACKAGE_PATH_KEYS = {"python package", "#python", "#package"};
//	public static final String WIKI_PYTHON_PACKAGE_PATH = keyPathPreference(WIKI_PYTHON_PACKAGE_PATH_KEYS);
//	
//	public final static String[] WIKI_PATH_KEYS[] = {
//		WIKI_SOURCE_PATH_KEYS, WIKI_TESTS_PATH_KEYS, WIKI_LIBRARIES_PATH_KEYS, WIKI_RESOURCE_PATH_KEYS,
//		WIKI_PYTHON_PATH_KEYS, WIKI_PYTHON_PACKAGE_PATH_KEYS
//	};
	
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
		for (Map.Entry<String, String> keyPath : getEmfsResourcePaths()) {
			String[] keys = keyPath.getKey().split(",");
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