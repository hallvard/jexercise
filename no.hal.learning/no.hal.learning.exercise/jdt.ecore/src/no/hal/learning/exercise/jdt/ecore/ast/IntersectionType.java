/**
 */
package no.hal.learning.exercise.jdt.ecore.ast;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Intersection Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.hal.learning.exercise.jdt.ecore.ast.IntersectionType#getTypes <em>Types</em>}</li>
 * </ul>
 *
 * @see no.hal.learning.exercise.jdt.ecore.ast.AstPackage#getIntersectionType()
 * @model
 * @generated
 */
public interface IntersectionType extends Type {
	/**
	 * Returns the value of the '<em><b>Types</b></em>' containment reference list.
	 * The list contents are of type {@link no.hal.learning.exercise.jdt.ecore.ast.Type}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Types</em>' containment reference list.
	 * @see no.hal.learning.exercise.jdt.ecore.ast.AstPackage#getIntersectionType_Types()
	 * @model containment="true"
	 * @generated
	 */
	EList<Type> getTypes();

} // IntersectionType
