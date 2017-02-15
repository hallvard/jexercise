/**
 */
package no.hal.learning.exercise;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract String Edit Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.hal.learning.exercise.AbstractStringEditEvent#getEdit <em>Edit</em>}</li>
 *   <li>{@link no.hal.learning.exercise.AbstractStringEditEvent#getMarkers <em>Markers</em>}</li>
 * </ul>
 *
 * @see no.hal.learning.exercise.ExercisePackage#getAbstractStringEditEvent()
 * @model
 * @generated
 */
public interface AbstractStringEditEvent extends TaskEvent {
	/**
	 * Returns the value of the '<em><b>Edit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Edit</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Edit</em>' containment reference.
	 * @see #setEdit(AbstractStringEdit)
	 * @see no.hal.learning.exercise.ExercisePackage#getAbstractStringEditEvent_Edit()
	 * @model containment="true"
	 * @generated
	 */
	AbstractStringEdit getEdit();

	/**
	 * Sets the value of the '{@link no.hal.learning.exercise.AbstractStringEditEvent#getEdit <em>Edit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Edit</em>' containment reference.
	 * @see #getEdit()
	 * @generated
	 */
	void setEdit(AbstractStringEdit value);

	/**
	 * Returns the value of the '<em><b>Markers</b></em>' containment reference list.
	 * The list contents are of type {@link no.hal.learning.exercise.MarkerInfo}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Markers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Markers</em>' containment reference list.
	 * @see no.hal.learning.exercise.ExercisePackage#getAbstractStringEditEvent_Markers()
	 * @model containment="true"
	 * @generated
	 */
	EList<MarkerInfo> getMarkers();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getString();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	AbstractStringEdit createStringEdit(String string, AbstractStringEditEvent lastEvent);

} // AbstractStringEditEvent
