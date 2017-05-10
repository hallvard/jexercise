/**
 */
package no.hal.learning.exercise.workspace;

import no.hal.learning.exercise.StringEditAnswer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Source File Edit Answer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.hal.learning.exercise.workspace.SourceFileEditAnswer#getResourcePath <em>Resource Path</em>}</li>
 * </ul>
 *
 * @see no.hal.learning.exercise.workspace.WorkspacePackage#getSourceFileEditAnswer()
 * @model
 * @generated
 */
public interface SourceFileEditAnswer extends StringEditAnswer {
	/**
	 * Returns the value of the '<em><b>Resource Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Path</em>' attribute.
	 * @see #setResourcePath(String)
	 * @see no.hal.learning.exercise.workspace.WorkspacePackage#getSourceFileEditAnswer_ResourcePath()
	 * @model
	 * @generated
	 */
	String getResourcePath();

	/**
	 * Sets the value of the '{@link no.hal.learning.exercise.workspace.SourceFileEditAnswer#getResourcePath <em>Resource Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource Path</em>' attribute.
	 * @see #getResourcePath()
	 * @generated
	 */
	void setResourcePath(String value);

} // SourceFileEditAnswer
