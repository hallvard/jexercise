/**
 */
package no.hal.learning.sharing;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Reference Edit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.hal.learning.sharing.AbstractReferenceEdit#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see no.hal.learning.sharing.SharingPackage#getAbstractReferenceEdit()
 * @model
 * @generated
 */
public interface AbstractReferenceEdit extends AbstractFeatureEdit {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' reference.
	 * @see #setValue(EObject)
	 * @see no.hal.learning.sharing.SharingPackage#getAbstractReferenceEdit_Value()
	 * @model
	 * @generated
	 */
	EObject getValue();

	/**
	 * Sets the value of the '{@link no.hal.learning.sharing.AbstractReferenceEdit#getValue <em>Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(EObject value);

} // AbstractReferenceEdit
