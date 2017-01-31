/**
 */
package no.hal.learning.exercise.jdt;

import no.hal.learning.exercise.TaskAnswer;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Launch Answer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.hal.learning.exercise.jdt.JdtLaunchAnswer#getMode <em>Mode</em>}</li>
 *   <li>{@link no.hal.learning.exercise.jdt.JdtLaunchAnswer#getClassName <em>Class Name</em>}</li>
 *   <li>{@link no.hal.learning.exercise.jdt.JdtLaunchAnswer#getLaunchAttrNames <em>Launch Attr Names</em>}</li>
 *   <li>{@link no.hal.learning.exercise.jdt.JdtLaunchAnswer#getLaunchAttrValues <em>Launch Attr Values</em>}</li>
 * </ul>
 *
 * @see no.hal.learning.exercise.jdt.JdtPackage#getJdtLaunchAnswer()
 * @model
 * @generated
 */
public interface JdtLaunchAnswer extends TaskAnswer {
	/**
	 * Returns the value of the '<em><b>Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mode</em>' attribute.
	 * @see #setMode(String)
	 * @see no.hal.learning.exercise.jdt.JdtPackage#getJdtLaunchAnswer_Mode()
	 * @model
	 * @generated
	 */
	String getMode();

	/**
	 * Sets the value of the '{@link no.hal.learning.exercise.jdt.JdtLaunchAnswer#getMode <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mode</em>' attribute.
	 * @see #getMode()
	 * @generated
	 */
	void setMode(String value);

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

	/**
	 * Returns the value of the '<em><b>Launch Attr Names</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Launch Attr Names</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Launch Attr Names</em>' attribute list.
	 * @see no.hal.learning.exercise.jdt.JdtPackage#getJdtLaunchAnswer_LaunchAttrNames()
	 * @model
	 * @generated
	 */
	EList<String> getLaunchAttrNames();

	/**
	 * Returns the value of the '<em><b>Launch Attr Values</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Launch Attr Values</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Launch Attr Values</em>' attribute list.
	 * @see no.hal.learning.exercise.jdt.JdtPackage#getJdtLaunchAnswer_LaunchAttrValues()
	 * @model
	 * @generated
	 */
	EList<String> getLaunchAttrValues();

} // JdtLaunchAnswer
