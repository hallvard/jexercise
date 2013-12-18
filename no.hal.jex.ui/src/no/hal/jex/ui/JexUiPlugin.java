/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package no.hal.jex.ui;

import org.eclipse.emf.common.EMFPlugin;
import org.eclipse.emf.common.ui.EclipseUIPlugin;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.util.IPropertyChangeListener;
import org.eclipse.jface.util.PropertyChangeEvent;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.PlatformUI;

/**
 * This is the central singleton for the Jex editor plugin.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public final class JexUiPlugin extends EMFPlugin {
	/**
	 * Keep track of the singleton.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final JexUiPlugin INSTANCE = new JexUiPlugin();
	
	/**
	 * Keep track of the singleton.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static Implementation plugin;

	/**
	 * Create the instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JexUiPlugin() {
		super
			(new ResourceLocator [] {
			});
	}

	/**
	 * Returns the singleton instance of the Eclipse plugin.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the singleton instance.
	 * @generated
	 */
	@Override
	public ResourceLocator getPluginResourceLocator() {
		return plugin;
	}
	
	/**
	 * Returns the singleton instance of the Eclipse plugin.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the singleton instance.
	 * @generated
	 */
	public static Implementation getPlugin() {
		return plugin;
	}
	
	/**
	 * The actual implementation of the Eclipse <b>Plugin</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static class Implementation extends EclipseUIPlugin {
		/**
		 * Creates an instance.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public Implementation() {
			super();
	
			// Remember the static instance.
			//
			plugin = this;
		}
		
	    private JexManager manager;
	    
		public JexManager getExerciseManager() {
			if (manager == null) {
				final IPreferenceStore store = getPlugin().getPreferenceStore();
				store.addPropertyChangeListener(new IPropertyChangeListener() {
					public void propertyChange(PropertyChangeEvent event) {
						if (manager == null) {
							return;
						}
						if (JexPreferencePage.JEX_TESTS_PATH.equals(event.getProperty())) {
							manager.setJexPathPattern(store.getString(JexPreferencePage.JEX_TESTS_PATH));
						}
					}
				});
				manager = new JexManager(store.getString(JexPreferencePage.JEX_TESTS_PATH));
			}
			return manager;
		}
		
		public Image getImage(String name) {
			Image image = PlatformUI.getWorkbench().getSharedImages().getImage(name);
			if (image != null) {
				return image;
			}
//			String altName = getResourceString(name);
//			if (altName != null && (! altName.equals(name))) {
//				image = getImage(altName);
//				if (image != null) {
//					return image;
//				}
//			}
			if (name.indexOf('/') < 0) {
				name = "icons/views/" + name;
			}
			if (name.indexOf('.') < 0) {
				name = name + ".gif";
			}
			image = getImageRegistry().get(name);
			if (image == null) {
				getImageRegistry().put(name, imageDescriptorFromPlugin(getBundle().getSymbolicName(), name));
			}
			return getImageRegistry().get(name);
		}
	}
}
