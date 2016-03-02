/**
 */
package no.hal.emfs.sync;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>And Resource Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.hal.emfs.sync.CompositeResourceCondition#getConditions <em>Conditions</em>}</li>
 *   <li>{@link no.hal.emfs.sync.CompositeResourceCondition#isShortCircuitValue <em>Short Circuit Value</em>}</li>
 * </ul>
 *
 * @see no.hal.emfs.sync.SyncPackage#getCompositeResourceCondition()
 * @model
 * @generated
 */
public interface CompositeResourceCondition extends ResourceCondition {
	/**
	 * Returns the value of the '<em><b>Conditions</b></em>' containment reference list.
	 * The list contents are of type {@link no.hal.emfs.sync.ResourceCondition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conditions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conditions</em>' containment reference list.
	 * @see no.hal.emfs.sync.SyncPackage#getCompositeResourceCondition_Conditions()
	 * @model containment="true"
	 * @generated
	 */
	EList<ResourceCondition> getConditions();

	/**
	 * Returns the value of the '<em><b>Short Circuit Value</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Short Circuit Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Short Circuit Value</em>' attribute.
	 * @see #setShortCircuitValue(boolean)
	 * @see no.hal.emfs.sync.SyncPackage#getCompositeResourceCondition_ShortCircuitValue()
	 * @model default="false"
	 * @generated
	 */
	boolean isShortCircuitValue();

	/**
	 * Sets the value of the '{@link no.hal.emfs.sync.CompositeResourceCondition#isShortCircuitValue <em>Short Circuit Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Short Circuit Value</em>' attribute.
	 * @see #isShortCircuitValue()
	 * @generated
	 */
	void setShortCircuitValue(boolean value);

} // AndResourceCondition
