/**
 */
package no.hal.emfs;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>String Content Provider</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link no.hal.emfs.StringContentProvider#getStringContents <em>String Contents</em>}</li>
 * </ul>
 * </p>
 *
 * @see no.hal.emfs.EmfsPackage#getStringContentProvider()
 * @model
 * @generated
 */
public interface StringContentProvider extends AbstractStringContentProvider {
	/**
	 * Returns the value of the '<em><b>String Contents</b></em>' containment reference list.
	 * The list contents are of type {@link no.hal.emfs.AbstractStringContents}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>String Contents</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>String Contents</em>' containment reference list.
	 * @see no.hal.emfs.EmfsPackage#getStringContentProvider_StringContents()
	 * @model containment="true"
	 * @generated
	 */
	EList<AbstractStringContents> getStringContents();

} // StringContentProvider
