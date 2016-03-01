/**
 */
package no.hal.learning.exercise.checkstyle;

import org.eclipse.emf.common.util.EList;

import no.hal.learning.exercise.TaskAnswer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Answer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.hal.learning.exercise.checkstyle.CheckstyleAnswer#getClassNames <em>Class Names</em>}</li>
 *   <li>{@link no.hal.learning.exercise.checkstyle.CheckstyleAnswer#getStyleName <em>Style Name</em>}</li>
 * </ul>
 *
 * @see no.hal.learning.exercise.checkstyle.CheckstylePackage#getCheckstyleAnswer()
 * @model
 * @generated
 */
public interface CheckstyleAnswer extends TaskAnswer {
	/**
	 * Returns the value of the '<em><b>Class Names</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class Names</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class Names</em>' attribute list.
	 * @see no.hal.learning.exercise.checkstyle.CheckstylePackage#getCheckstyleAnswer_ClassNames()
	 * @model
	 * @generated
	 */
	EList<String> getClassNames();

	/**
	 * Returns the value of the '<em><b>Style Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Style Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Style Name</em>' attribute.
	 * @see #setStyleName(String)
	 * @see no.hal.learning.exercise.checkstyle.CheckstylePackage#getCheckstyleAnswer_StyleName()
	 * @model
	 * @generated
	 */
	String getStyleName();

	/**
	 * Sets the value of the '{@link no.hal.learning.exercise.checkstyle.CheckstyleAnswer#getStyleName <em>Style Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Style Name</em>' attribute.
	 * @see #getStyleName()
	 * @generated
	 */
	void setStyleName(String value);

} // CheckstyleAnswer
