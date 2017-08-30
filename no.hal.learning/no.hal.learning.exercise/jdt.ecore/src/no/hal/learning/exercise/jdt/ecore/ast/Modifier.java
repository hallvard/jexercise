/**
 */
package no.hal.learning.exercise.jdt.ecore.ast;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Modifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.hal.learning.exercise.jdt.ecore.ast.Modifier#getKeyword <em>Keyword</em>}</li>
 * </ul>
 *
 * @see no.hal.learning.exercise.jdt.ecore.ast.AstPackage#getModifier()
 * @model
 * @generated
 */
public interface Modifier extends ASTNode, IExtendedModifier {
	/**
	 * Returns the value of the '<em><b>Keyword</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Keyword</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Keyword</em>' attribute.
	 * @see #setKeyword(org.eclipse.jdt.core.dom.Modifier.ModifierKeyword)
	 * @see no.hal.learning.exercise.jdt.ecore.ast.AstPackage#getModifier_Keyword()
	 * @model dataType="no.hal.learning.exercise.jdt.ecore.ast.EModifierKeyword"
	 * @generated
	 */
	org.eclipse.jdt.core.dom.Modifier.ModifierKeyword getKeyword();

	/**
	 * Sets the value of the '{@link no.hal.learning.exercise.jdt.ecore.ast.Modifier#getKeyword <em>Keyword</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Keyword</em>' attribute.
	 * @see #getKeyword()
	 * @generated
	 */
	void setKeyword(org.eclipse.jdt.core.dom.Modifier.ModifierKeyword value);

} // Modifier
