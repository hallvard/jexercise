/**
 */
package no.hal.learning.exercise.jdt.ecore.ast;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>This Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.hal.learning.exercise.jdt.ecore.ast.ThisExpression#getQualifier <em>Qualifier</em>}</li>
 * </ul>
 *
 * @see no.hal.learning.exercise.jdt.ecore.ast.AstPackage#getThisExpression()
 * @model
 * @generated
 */
public interface ThisExpression extends Expression {
	/**
	 * Returns the value of the '<em><b>Qualifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Qualifier</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qualifier</em>' containment reference.
	 * @see #setQualifier(Name)
	 * @see no.hal.learning.exercise.jdt.ecore.ast.AstPackage#getThisExpression_Qualifier()
	 * @model containment="true"
	 * @generated
	 */
	Name getQualifier();

	/**
	 * Sets the value of the '{@link no.hal.learning.exercise.jdt.ecore.ast.ThisExpression#getQualifier <em>Qualifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Qualifier</em>' containment reference.
	 * @see #getQualifier()
	 * @generated
	 */
	void setQualifier(Name value);

} // ThisExpression
