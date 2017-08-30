/**
 */
package no.hal.learning.exercise.jdt.ecore.ast;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lambda Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.hal.learning.exercise.jdt.ecore.ast.LambdaExpression#isParentheses <em>Parentheses</em>}</li>
 *   <li>{@link no.hal.learning.exercise.jdt.ecore.ast.LambdaExpression#getParameters <em>Parameters</em>}</li>
 *   <li>{@link no.hal.learning.exercise.jdt.ecore.ast.LambdaExpression#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @see no.hal.learning.exercise.jdt.ecore.ast.AstPackage#getLambdaExpression()
 * @model
 * @generated
 */
public interface LambdaExpression extends Expression {
	/**
	 * Returns the value of the '<em><b>Parentheses</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parentheses</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parentheses</em>' attribute.
	 * @see #setParentheses(boolean)
	 * @see no.hal.learning.exercise.jdt.ecore.ast.AstPackage#getLambdaExpression_Parentheses()
	 * @model
	 * @generated
	 */
	boolean isParentheses();

	/**
	 * Sets the value of the '{@link no.hal.learning.exercise.jdt.ecore.ast.LambdaExpression#isParentheses <em>Parentheses</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parentheses</em>' attribute.
	 * @see #isParentheses()
	 * @generated
	 */
	void setParentheses(boolean value);

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link no.hal.learning.exercise.jdt.ecore.ast.VariableDeclaration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see no.hal.learning.exercise.jdt.ecore.ast.AstPackage#getLambdaExpression_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<VariableDeclaration> getParameters();

	/**
	 * Returns the value of the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Body</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' containment reference.
	 * @see #setBody(ASTNode)
	 * @see no.hal.learning.exercise.jdt.ecore.ast.AstPackage#getLambdaExpression_Body()
	 * @model containment="true"
	 * @generated
	 */
	ASTNode getBody();

	/**
	 * Sets the value of the '{@link no.hal.learning.exercise.jdt.ecore.ast.LambdaExpression#getBody <em>Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' containment reference.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(ASTNode value);

} // LambdaExpression
