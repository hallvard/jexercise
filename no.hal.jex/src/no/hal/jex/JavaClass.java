/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package no.hal.jex;

import org.eclipse.emf.common.util.EList;
import org.eclipse.jdt.core.IType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link no.hal.jex.JavaClass#getClassKind <em>Class Kind</em>}</li>
 *   <li>{@link no.hal.jex.JavaClass#getMembers <em>Members</em>}</li>
 *   <li>{@link no.hal.jex.JavaClass#getPack <em>Pack</em>}</li>
 *   <li>{@link no.hal.jex.JavaClass#getSuperclasses <em>Superclasses</em>}</li>
 * </ul>
 * </p>
 *
 * @see no.hal.jex.JexPackage#getJavaClass()
 * @model
 * @generated
 */
public interface JavaClass extends Member {
	/**
	 * Returns the value of the '<em><b>Class Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link no.hal.jex.ClassKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class Kind</em>' attribute.
	 * @see no.hal.jex.ClassKind
	 * @see #setClassKind(ClassKind)
	 * @see no.hal.jex.JexPackage#getJavaClass_ClassKind()
	 * @model
	 * @generated
	 */
	ClassKind getClassKind();

	/**
	 * Sets the value of the '{@link no.hal.jex.JavaClass#getClassKind <em>Class Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class Kind</em>' attribute.
	 * @see no.hal.jex.ClassKind
	 * @see #getClassKind()
	 * @generated
	 */
	void setClassKind(ClassKind value);

	/**
	 * Returns the value of the '<em><b>Superclasses</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Superclasses</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Superclasses</em>' attribute list.
	 * @see no.hal.jex.JexPackage#getJavaClass_Superclasses()
	 * @model dataType="no.hal.jex.ClassName"
	 * @generated
	 */
	EList<String> getSuperclasses();

	/**
	 * Returns the value of the '<em><b>Members</b></em>' containment reference list.
	 * The list contents are of type {@link no.hal.jex.Member}.
	 * It is bidirectional and its opposite is '{@link no.hal.jex.Member#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Members</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Members</em>' containment reference list.
	 * @see no.hal.jex.JexPackage#getJavaClass_Members()
	 * @see no.hal.jex.Member#getOwner
	 * @model opposite="owner" containment="true"
	 * @generated
	 */
	EList<Member> getMembers();

	/**
	 * Returns the value of the '<em><b>Pack</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link no.hal.jex.JavaPack#getClasses <em>Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pack</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pack</em>' container reference.
	 * @see #setPack(JavaPack)
	 * @see no.hal.jex.JexPackage#getJavaClass_Pack()
	 * @see no.hal.jex.JavaPack#getClasses
	 * @model opposite="classes"
	 * @generated
	 */
	JavaPack getPack();

	/**
	 * Sets the value of the '{@link no.hal.jex.JavaClass#getPack <em>Pack</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pack</em>' container reference.
	 * @see #getPack()
	 * @generated
	 */
	void setPack(JavaPack value);

	// Support methods
	
	public Boolean validateSuperclasses(IType type);

} // JavaClass
