package no.hal.sharing.ui.prefs;

import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.jface.preference.StringFieldEditor;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;

import no.hal.sharing.ui.Activator;

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

public class SharingPreferencePage extends FieldEditorPreferencePage implements IWorkbenchPreferencePage {

	public SharingPreferencePage() {
		super(GRID);
		setPreferenceStore(Activator.getDefault().getPreferenceStore());
		setDescription("Preference page for Resource Sharing");
	}
	
	public static final String OWNER_SHARING_ID = "userSharingKey";
	
	/**
	 * Creates the field editors. Field editors are abstractions of
	 * the common GUI blocks needed to manipulate various types
	 * of preferences. Each field editor knows how to save and
	 * restore itself.
	 */
	public void createFieldEditors() {
		Composite parent = getFieldEditorParent();
		StringFieldEditor editor = new StringFieldEditor(OWNER_SHARING_ID, "User sharing key", parent);
		editor.setEnabled(false, parent);
		addField(editor);
	}

	public void init(IWorkbench workbench) {
	}
}
