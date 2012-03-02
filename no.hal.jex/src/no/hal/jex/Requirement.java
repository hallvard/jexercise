/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package no.hal.jex;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Requirement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link no.hal.jex.Requirement#getSatisfied <em>Satisfied</em>}</li>
 *   <li>{@link no.hal.jex.Requirement#getTime <em>Time</em>}</li>
 * </ul>
 * </p>
 *
 * @see no.hal.jex.JexPackage#getRequirement()
 * @model abstract="true"
 * @generated
 */
public interface Requirement extends AbstractRequirement {
	/**
	 * Returns the value of the '<em><b>Satisfied</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Satisfied</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Satisfied</em>' attribute.
	 * @see #setSatisfied(Boolean)
	 * @see no.hal.jex.JexPackage#getRequirement_Satisfied()
	 * @model transient="true"
	 * @generated
	 */
	Boolean getSatisfied();

	/**
	 * Sets the value of the '{@link no.hal.jex.Requirement#getSatisfied <em>Satisfied</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Satisfied</em>' attribute.
	 * @see #getSatisfied()
	 * @generated
	 */
	void setSatisfied(Boolean value);

	/**
	 * Returns the value of the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time</em>' attribute.
	 * @see #setTime(long)
	 * @see no.hal.jex.JexPackage#getRequirement_Time()
	 * @model transient="true"
	 * @generated
	 */
	long getTime();

	/**
	 * Sets the value of the '{@link no.hal.jex.Requirement#getTime <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time</em>' attribute.
	 * @see #getTime()
	 * @generated
	 */
	void setTime(long value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model projectDataType="no.hal.jex.JavaCoreProject"
	 * @generated
	 */

} // Requirement
