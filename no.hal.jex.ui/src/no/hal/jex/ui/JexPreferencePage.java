package no.hal.jex.ui;

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

public class JexPreferencePage extends FieldEditorPreferencePage
	implements IWorkbenchPreferencePage {

	public JexPreferencePage() {
		super(GRID);
		setPreferenceStore(JexUiPlugin.getPlugin().getPreferenceStore());
		setDescription("Preference page for JExercise");
	}
	
//	public static final String JEX_SERVER = "jexServerPreference";
	public static final String JEX_PATH_PATTERN = "jexFilePathPreference";
//	public static final String JEX_FILE_PATTERN = "jexFilePatternPreference";

	/**
	 * Creates the field editors. Field editors are abstractions of
	 * the common GUI blocks needed to manipulate various types
	 * of preferences. Each field editor knows how to save and
	 * restore itself.
	 */
	public void createFieldEditors() {
		Composite parent = getFieldEditorParent();
		IWorkbenchHelpSystem help = PlatformUI.getWorkbench().getHelpSystem();
		String helpContext = JexUiPlugin.getPlugin().getBundle().getSymbolicName() + ".JexPreferencePage";
		help.setHelp(parent, helpContext);
//		addField(new StringFieldEditor(JEX_SERVER, "Server:", parent));
		addField(new StringFieldEditor(JEX_PATH_PATTERN, "Path pattern:", parent));
		/*
		addField(new DirectoryFieldEditor(JEX_FILE_PATH, "File path:", parent) {
		    protected boolean doCheckState() {
		        String filename = getTextControl().getText();
		    	return filename.startsWith("/") || super.doCheckState();
		    }
		});
		addField(new StringFieldEditor(JEX_FILE_PATTERN, "File pattern:", parent));
		*/
	}

	public void init(IWorkbench workbench) {
	}
}