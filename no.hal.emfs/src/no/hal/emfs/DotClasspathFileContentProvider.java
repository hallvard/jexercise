/**
 */
package no.hal.emfs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dot Classpath File Content</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link no.hal.emfs.DotClasspathFileContentProvider#getEntries <em>Entries</em>}</li>
 * </ul>
 * </p>
 *
 * @see no.hal.emfs.EmfsPackage#getDotClasspathFileContentProvider()
 * @model
 * @generated
 */
public interface DotClasspathFileContentProvider extends AbstractStringContentProvider {
	/**
	 * Returns the value of the '<em><b>Entries</b></em>' containment reference list.
	 * The list contents are of type {@link no.hal.emfs.AbstractClasspathEntry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entries</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entries</em>' containment reference list.
	 * @see no.hal.emfs.EmfsPackage#getDotClasspathFileContentProvider_Entries()
	 * @model containment="true"
	 * @generated
	 */
	EList<AbstractClasspathEntry> getEntries();

} // DotClasspathFileContent
