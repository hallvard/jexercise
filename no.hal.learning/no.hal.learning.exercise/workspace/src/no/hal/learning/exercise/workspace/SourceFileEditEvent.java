/**
 */
package no.hal.learning.exercise.workspace;

import no.hal.learning.exercise.AbstractStringEditEvent;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Source File Edit Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.hal.learning.exercise.workspace.SourceFileEditEvent#getSourceCode <em>Source Code</em>}</li>
 *   <li>{@link no.hal.learning.exercise.workspace.SourceFileEditEvent#getSizeMeasure <em>Size Measure</em>}</li>
 *   <li>{@link no.hal.learning.exercise.workspace.SourceFileEditEvent#getErrorCount <em>Error Count</em>}</li>
 *   <li>{@link no.hal.learning.exercise.workspace.SourceFileEditEvent#getWarningCount <em>Warning Count</em>}</li>
 * </ul>
 *
 * @see no.hal.learning.exercise.workspace.WorkspacePackage#getSourceFileEditEvent()
 * @model
 * @generated
 */
public interface SourceFileEditEvent extends AbstractStringEditEvent {
	/**
	 * Returns the value of the '<em><b>Source Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Code</em>' attribute.
	 * @see #setSourceCode(String)
	 * @see no.hal.learning.exercise.workspace.WorkspacePackage#getSourceFileEditEvent_SourceCode()
	 * @model transient="true" volatile="true" derived="true"
	 * @generated
	 */
	String getSourceCode();

	/**
	 * Sets the value of the '{@link no.hal.learning.exercise.workspace.SourceFileEditEvent#getSourceCode <em>Source Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Code</em>' attribute.
	 * @see #getSourceCode()
	 * @generated
	 */
	void setSourceCode(String value);

	/**
	 * Returns the value of the '<em><b>Size Measure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Size Measure</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size Measure</em>' attribute.
	 * @see #setSizeMeasure(int)
	 * @see no.hal.learning.exercise.workspace.WorkspacePackage#getSourceFileEditEvent_SizeMeasure()
	 * @model annotation="no.hal.learning.exercise.views.ExerciseView dashes='_ '"
	 *        annotation="no.hal.emf.ui.parts.plot.IValueProvider priority='3'"
	 * @generated
	 */
	int getSizeMeasure();

	/**
	 * Sets the value of the '{@link no.hal.learning.exercise.workspace.SourceFileEditEvent#getSizeMeasure <em>Size Measure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size Measure</em>' attribute.
	 * @see #getSizeMeasure()
	 * @generated
	 */
	void setSizeMeasure(int value);

	/**
	 * Returns the value of the '<em><b>Error Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Error Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Error Count</em>' attribute.
	 * @see #setErrorCount(int)
	 * @see no.hal.learning.exercise.workspace.WorkspacePackage#getSourceFileEditEvent_ErrorCount()
	 * @model annotation="no.hal.learning.exercise.views.ExerciseView dashes='_ - '"
	 * @generated
	 */
	int getErrorCount();

	/**
	 * Sets the value of the '{@link no.hal.learning.exercise.workspace.SourceFileEditEvent#getErrorCount <em>Error Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Error Count</em>' attribute.
	 * @see #getErrorCount()
	 * @generated
	 */
	void setErrorCount(int value);

	/**
	 * Returns the value of the '<em><b>Warning Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Warning Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Warning Count</em>' attribute.
	 * @see #setWarningCount(int)
	 * @see no.hal.learning.exercise.workspace.WorkspacePackage#getSourceFileEditEvent_WarningCount()
	 * @model annotation="no.hal.learning.exercise.views.ExerciseView dashes='_ . '"
	 * @generated
	 */
	int getWarningCount();

	/**
	 * Sets the value of the '{@link no.hal.learning.exercise.workspace.SourceFileEditEvent#getWarningCount <em>Warning Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Warning Count</em>' attribute.
	 * @see #getWarningCount()
	 * @generated
	 */
	void setWarningCount(int value);

} // SourceFileEditEvent
