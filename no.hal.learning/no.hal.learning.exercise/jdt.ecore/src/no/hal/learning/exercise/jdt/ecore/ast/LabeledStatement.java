/**
 */
package no.hal.learning.exercise.jdt.ecore.ast;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Labeled Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.hal.learning.exercise.jdt.ecore.ast.LabeledStatement#getLabel <em>Label</em>}</li>
 *   <li>{@link no.hal.learning.exercise.jdt.ecore.ast.LabeledStatement#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @see no.hal.learning.exercise.jdt.ecore.ast.AstPackage#getLabeledStatement()
 * @model
 * @generated
 */
public interface LabeledStatement extends Statement {
	/**
	 * Returns the value of the '<em><b>Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' containment reference.
	 * @see #setLabel(SimpleName)
	 * @see no.hal.learning.exercise.jdt.ecore.ast.AstPackage#getLabeledStatement_Label()
	 * @model containment="true"
	 * @generated
	 */
	SimpleName getLabel();

	/**
	 * Sets the value of the '{@link no.hal.learning.exercise.jdt.ecore.ast.LabeledStatement#getLabel <em>Label</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' containment reference.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(SimpleName value);

	/**
	 * Returns the value of the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Body</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' containment reference.
	 * @see #setBody(Statement)
	 * @see no.hal.learning.exercise.jdt.ecore.ast.AstPackage#getLabeledStatement_Body()
	 * @model containment="true"
	 * @generated
	 */
	Statement getBody();

	/**
	 * Sets the value of the '{@link no.hal.learning.exercise.jdt.ecore.ast.LabeledStatement#getBody <em>Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' containment reference.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(Statement value);

} // LabeledStatement
