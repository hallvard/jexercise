/**
 */
package no.hal.learning.exercise.jdt.ecore.ast;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Array Creation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.hal.learning.exercise.jdt.ecore.ast.ArrayCreation#getType <em>Type</em>}</li>
 *   <li>{@link no.hal.learning.exercise.jdt.ecore.ast.ArrayCreation#getDimensions <em>Dimensions</em>}</li>
 *   <li>{@link no.hal.learning.exercise.jdt.ecore.ast.ArrayCreation#getInitializer <em>Initializer</em>}</li>
 * </ul>
 *
 * @see no.hal.learning.exercise.jdt.ecore.ast.AstPackage#getArrayCreation()
 * @model
 * @generated
 */
public interface ArrayCreation extends Expression {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(ArrayType)
	 * @see no.hal.learning.exercise.jdt.ecore.ast.AstPackage#getArrayCreation_Type()
	 * @model containment="true"
	 * @generated
	 */
	ArrayType getType();

	/**
	 * Sets the value of the '{@link no.hal.learning.exercise.jdt.ecore.ast.ArrayCreation#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(ArrayType value);

	/**
	 * Returns the value of the '<em><b>Dimensions</b></em>' containment reference list.
	 * The list contents are of type {@link no.hal.learning.exercise.jdt.ecore.ast.Expression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dimensions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dimensions</em>' containment reference list.
	 * @see no.hal.learning.exercise.jdt.ecore.ast.AstPackage#getArrayCreation_Dimensions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Expression> getDimensions();

	/**
	 * Returns the value of the '<em><b>Initializer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initializer</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initializer</em>' containment reference.
	 * @see #setInitializer(ArrayInitializer)
	 * @see no.hal.learning.exercise.jdt.ecore.ast.AstPackage#getArrayCreation_Initializer()
	 * @model containment="true"
	 * @generated
	 */
	ArrayInitializer getInitializer();

	/**
	 * Sets the value of the '{@link no.hal.learning.exercise.jdt.ecore.ast.ArrayCreation#getInitializer <em>Initializer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initializer</em>' containment reference.
	 * @see #getInitializer()
	 * @generated
	 */
	void setInitializer(ArrayInitializer value);

} // ArrayCreation
