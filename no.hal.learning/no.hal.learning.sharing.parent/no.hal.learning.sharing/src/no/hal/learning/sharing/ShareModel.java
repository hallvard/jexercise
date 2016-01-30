/**
 */
package no.hal.learning.sharing;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Share Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.hal.learning.sharing.ShareModel#getEObjects <em>EObjects</em>}</li>
 * </ul>
 *
 * @see no.hal.learning.sharing.SharingPackage#getShareModel()
 * @model
 * @generated
 */
public interface ShareModel extends AbstractShare {
	/**
	 * Returns the value of the '<em><b>EObjects</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EObjects</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EObjects</em>' reference list.
	 * @see no.hal.learning.sharing.SharingPackage#getShareModel_EObjects()
	 * @model
	 * @generated
	 */
	EList<EObject> getEObjects();

} // ShareModel
