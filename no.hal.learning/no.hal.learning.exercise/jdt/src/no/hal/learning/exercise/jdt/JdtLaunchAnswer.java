/**
 */
package no.hal.learning.exercise.jdt;

import no.hal.learning.exercise.workspace.LaunchAnswer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Launch Answer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.hal.learning.exercise.jdt.JdtLaunchAnswer#getClassName <em>Class Name</em>}</li>
 * </ul>
 *
 * @see no.hal.learning.exercise.jdt.JdtPackage#getJdtLaunchAnswer()
 * @model
 * @generated
 */
public interface JdtLaunchAnswer extends LaunchAnswer {
	/**
	 * Returns the value of the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class Name</em>' attribute.
	 * @see #setClassName(String)
	 * @see no.hal.learning.exercise.jdt.JdtPackage#getJdtLaunchAnswer_ClassName()
	 * @model
	 * @generated
	 */
	String getClassName();

	/**
	 * Sets the value of the '{@link no.hal.learning.exercise.jdt.JdtLaunchAnswer#getClassName <em>Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class Name</em>' attribute.
	 * @see #getClassName()
	 * @generated
	 */
	void setClassName(String value);

} // JdtLaunchAnswer
