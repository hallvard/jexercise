/**
 */
package no.hal.learning.exercise.jdt.ecore.ast;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Primitive Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.hal.learning.exercise.jdt.ecore.ast.PrimitiveType#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link no.hal.learning.exercise.jdt.ecore.ast.PrimitiveType#getPrimitiveTypeCode <em>Primitive Type Code</em>}</li>
 * </ul>
 *
 * @see no.hal.learning.exercise.jdt.ecore.ast.AstPackage#getPrimitiveType()
 * @model
 * @generated
 */
public interface PrimitiveType extends AnnotatableType {
	/**
	 * Returns the value of the '<em><b>Annotations</b></em>' containment reference list.
	 * The list contents are of type {@link no.hal.learning.exercise.jdt.ecore.ast.Annotation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Annotations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotations</em>' containment reference list.
	 * @see no.hal.learning.exercise.jdt.ecore.ast.AstPackage#getPrimitiveType_Annotations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Annotation> getAnnotations();

	/**
	 * Returns the value of the '<em><b>Primitive Type Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Primitive Type Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Primitive Type Code</em>' attribute.
	 * @see #setPrimitiveTypeCode(org.eclipse.jdt.core.dom.PrimitiveType.Code)
	 * @see no.hal.learning.exercise.jdt.ecore.ast.AstPackage#getPrimitiveType_PrimitiveTypeCode()
	 * @model dataType="no.hal.learning.exercise.jdt.ecore.ast.EPrimitiveTypeCode"
	 * @generated
	 */
	org.eclipse.jdt.core.dom.PrimitiveType.Code getPrimitiveTypeCode();

	/**
	 * Sets the value of the '{@link no.hal.learning.exercise.jdt.ecore.ast.PrimitiveType#getPrimitiveTypeCode <em>Primitive Type Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Primitive Type Code</em>' attribute.
	 * @see #getPrimitiveTypeCode()
	 * @generated
	 */
	void setPrimitiveTypeCode(org.eclipse.jdt.core.dom.PrimitiveType.Code value);

} // PrimitiveType
