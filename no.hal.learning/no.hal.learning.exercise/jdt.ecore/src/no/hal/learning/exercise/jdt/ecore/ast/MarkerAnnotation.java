/**
 */
package no.hal.learning.exercise.jdt.ecore.ast;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Marker Annotation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.hal.learning.exercise.jdt.ecore.ast.MarkerAnnotation#getTypeName <em>Type Name</em>}</li>
 * </ul>
 *
 * @see no.hal.learning.exercise.jdt.ecore.ast.AstPackage#getMarkerAnnotation()
 * @model
 * @generated
 */
public interface MarkerAnnotation extends Annotation {
	/**
	 * Returns the value of the '<em><b>Type Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Name</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Name</em>' containment reference.
	 * @see #setTypeName(Name)
	 * @see no.hal.learning.exercise.jdt.ecore.ast.AstPackage#getMarkerAnnotation_TypeName()
	 * @model containment="true"
	 * @generated
	 */
	Name getTypeName();

	/**
	 * Sets the value of the '{@link no.hal.learning.exercise.jdt.ecore.ast.MarkerAnnotation#getTypeName <em>Type Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Name</em>' containment reference.
	 * @see #getTypeName()
	 * @generated
	 */
	void setTypeName(Name value);

} // MarkerAnnotation
