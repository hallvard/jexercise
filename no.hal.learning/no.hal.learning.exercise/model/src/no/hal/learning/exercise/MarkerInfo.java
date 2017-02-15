/**
 */
package no.hal.learning.exercise;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Marker Info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.hal.learning.exercise.MarkerInfo#getLineNumber <em>Line Number</em>}</li>
 *   <li>{@link no.hal.learning.exercise.MarkerInfo#getCharStart <em>Char Start</em>}</li>
 *   <li>{@link no.hal.learning.exercise.MarkerInfo#getCharEnd <em>Char End</em>}</li>
 *   <li>{@link no.hal.learning.exercise.MarkerInfo#getSeverity <em>Severity</em>}</li>
 * </ul>
 *
 * @see no.hal.learning.exercise.ExercisePackage#getMarkerInfo()
 * @model
 * @generated
 */
public interface MarkerInfo extends EObject {
	/**
	 * Returns the value of the '<em><b>Line Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Line Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line Number</em>' attribute.
	 * @see #setLineNumber(int)
	 * @see no.hal.learning.exercise.ExercisePackage#getMarkerInfo_LineNumber()
	 * @model
	 * @generated
	 */
	int getLineNumber();

	/**
	 * Sets the value of the '{@link no.hal.learning.exercise.MarkerInfo#getLineNumber <em>Line Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line Number</em>' attribute.
	 * @see #getLineNumber()
	 * @generated
	 */
	void setLineNumber(int value);

	/**
	 * Returns the value of the '<em><b>Char Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Char Start</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Char Start</em>' attribute.
	 * @see #setCharStart(int)
	 * @see no.hal.learning.exercise.ExercisePackage#getMarkerInfo_CharStart()
	 * @model
	 * @generated
	 */
	int getCharStart();

	/**
	 * Sets the value of the '{@link no.hal.learning.exercise.MarkerInfo#getCharStart <em>Char Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Char Start</em>' attribute.
	 * @see #getCharStart()
	 * @generated
	 */
	void setCharStart(int value);

	/**
	 * Returns the value of the '<em><b>Char End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Char End</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Char End</em>' attribute.
	 * @see #setCharEnd(int)
	 * @see no.hal.learning.exercise.ExercisePackage#getMarkerInfo_CharEnd()
	 * @model
	 * @generated
	 */
	int getCharEnd();

	/**
	 * Sets the value of the '{@link no.hal.learning.exercise.MarkerInfo#getCharEnd <em>Char End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Char End</em>' attribute.
	 * @see #getCharEnd()
	 * @generated
	 */
	void setCharEnd(int value);

	/**
	 * Returns the value of the '<em><b>Severity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Severity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Severity</em>' attribute.
	 * @see #setSeverity(int)
	 * @see no.hal.learning.exercise.ExercisePackage#getMarkerInfo_Severity()
	 * @model annotation="no.hal.learning.exercise.MarkerInfo valueClass='org.eclipse.core.resources.IMarker' fieldPattern='SEVERITY_.*'"
	 * @generated
	 */
	int getSeverity();

	/**
	 * Sets the value of the '{@link no.hal.learning.exercise.MarkerInfo#getSeverity <em>Severity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Severity</em>' attribute.
	 * @see #getSeverity()
	 * @generated
	 */
	void setSeverity(int value);

} // MarkerInfo
