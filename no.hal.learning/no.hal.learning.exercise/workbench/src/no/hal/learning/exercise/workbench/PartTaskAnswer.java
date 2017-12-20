/**
 */
package no.hal.learning.exercise.workbench;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Part Activation Answer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.hal.learning.exercise.workbench.PartTaskAnswer#getInputUri <em>Input Uri</em>}</li>
 * </ul>
 *
 * @see no.hal.learning.exercise.workbench.WorkbenchPackage#getPartTaskAnswer()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='knownPartId'"
 * @generated
 */
public interface PartTaskAnswer extends WorkbenchTaskAnswer {

	/**
	 * Returns the value of the '<em><b>Input Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Uri</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Uri</em>' attribute.
	 * @see #setInputUri(String)
	 * @see no.hal.learning.exercise.workbench.WorkbenchPackage#getPartTaskAnswer_InputUri()
	 * @model
	 * @generated
	 */
	String getInputUri();

	/**
	 * Sets the value of the '{@link no.hal.learning.exercise.workbench.PartTaskAnswer#getInputUri <em>Input Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input Uri</em>' attribute.
	 * @see #getInputUri()
	 * @generated
	 */
	void setInputUri(String value);
} // PartActivationAnswer
