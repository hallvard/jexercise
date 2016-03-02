/**
 */
package no.hal.emfs.sync;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Emfs Resource Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.hal.emfs.sync.EmfsResourceRule#getCondition <em>Condition</em>}</li>
 * </ul>
 *
 * @see no.hal.emfs.sync.SyncPackage#getEmfsResourceRule()
 * @model
 * @generated
 */
public interface EmfsResourceRule extends EObject {
	/**
	 * Returns the value of the '<em><b>Condition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' reference.
	 * @see #setCondition(ResourceCondition)
	 * @see no.hal.emfs.sync.SyncPackage#getEmfsResourceRule_Condition()
	 * @model
	 * @generated
	 */
	ResourceCondition getCondition();

	/**
	 * Sets the value of the '{@link no.hal.emfs.sync.EmfsResourceRule#getCondition <em>Condition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(ResourceCondition value);

} // EmfsResourceRule
