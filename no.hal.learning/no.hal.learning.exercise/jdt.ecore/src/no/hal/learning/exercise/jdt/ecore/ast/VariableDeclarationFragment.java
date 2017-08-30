/**
 */
package no.hal.learning.exercise.jdt.ecore.ast;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Declaration Fragment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.hal.learning.exercise.jdt.ecore.ast.VariableDeclarationFragment#getName <em>Name</em>}</li>
 *   <li>{@link no.hal.learning.exercise.jdt.ecore.ast.VariableDeclarationFragment#getExtraDimensions2 <em>Extra Dimensions2</em>}</li>
 *   <li>{@link no.hal.learning.exercise.jdt.ecore.ast.VariableDeclarationFragment#getInitializer <em>Initializer</em>}</li>
 * </ul>
 *
 * @see no.hal.learning.exercise.jdt.ecore.ast.AstPackage#getVariableDeclarationFragment()
 * @model
 * @generated
 */
public interface VariableDeclarationFragment extends VariableDeclaration {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(SimpleName)
	 * @see no.hal.learning.exercise.jdt.ecore.ast.AstPackage#getVariableDeclarationFragment_Name()
	 * @model containment="true"
	 * @generated
	 */
	SimpleName getName();

	/**
	 * Sets the value of the '{@link no.hal.learning.exercise.jdt.ecore.ast.VariableDeclarationFragment#getName <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' containment reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(SimpleName value);

	/**
	 * Returns the value of the '<em><b>Extra Dimensions2</b></em>' containment reference list.
	 * The list contents are of type {@link no.hal.learning.exercise.jdt.ecore.ast.Dimension}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extra Dimensions2</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extra Dimensions2</em>' containment reference list.
	 * @see no.hal.learning.exercise.jdt.ecore.ast.AstPackage#getVariableDeclarationFragment_ExtraDimensions2()
	 * @model containment="true"
	 * @generated
	 */
	EList<Dimension> getExtraDimensions2();

	/**
	 * Returns the value of the '<em><b>Initializer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initializer</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initializer</em>' containment reference.
	 * @see #setInitializer(Expression)
	 * @see no.hal.learning.exercise.jdt.ecore.ast.AstPackage#getVariableDeclarationFragment_Initializer()
	 * @model containment="true"
	 * @generated
	 */
	Expression getInitializer();

	/**
	 * Sets the value of the '{@link no.hal.learning.exercise.jdt.ecore.ast.VariableDeclarationFragment#getInitializer <em>Initializer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initializer</em>' containment reference.
	 * @see #getInitializer()
	 * @generated
	 */
	void setInitializer(Expression value);

} // VariableDeclarationFragment
