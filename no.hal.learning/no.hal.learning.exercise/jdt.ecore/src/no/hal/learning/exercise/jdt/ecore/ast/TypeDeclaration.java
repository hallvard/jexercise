/**
 */
package no.hal.learning.exercise.jdt.ecore.ast;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.hal.learning.exercise.jdt.ecore.ast.TypeDeclaration#getJavadoc <em>Javadoc</em>}</li>
 *   <li>{@link no.hal.learning.exercise.jdt.ecore.ast.TypeDeclaration#getModifiers <em>Modifiers</em>}</li>
 *   <li>{@link no.hal.learning.exercise.jdt.ecore.ast.TypeDeclaration#isInterface <em>Interface</em>}</li>
 *   <li>{@link no.hal.learning.exercise.jdt.ecore.ast.TypeDeclaration#getName <em>Name</em>}</li>
 *   <li>{@link no.hal.learning.exercise.jdt.ecore.ast.TypeDeclaration#getTypeParameters <em>Type Parameters</em>}</li>
 *   <li>{@link no.hal.learning.exercise.jdt.ecore.ast.TypeDeclaration#getSuperclassType <em>Superclass Type</em>}</li>
 *   <li>{@link no.hal.learning.exercise.jdt.ecore.ast.TypeDeclaration#getSuperInterfaceTypes <em>Super Interface Types</em>}</li>
 *   <li>{@link no.hal.learning.exercise.jdt.ecore.ast.TypeDeclaration#getBodyDeclarations <em>Body Declarations</em>}</li>
 * </ul>
 *
 * @see no.hal.learning.exercise.jdt.ecore.ast.AstPackage#getTypeDeclaration()
 * @model
 * @generated
 */
public interface TypeDeclaration extends AbstractTypeDeclaration {
	/**
	 * Returns the value of the '<em><b>Javadoc</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Javadoc</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Javadoc</em>' containment reference.
	 * @see #setJavadoc(Javadoc)
	 * @see no.hal.learning.exercise.jdt.ecore.ast.AstPackage#getTypeDeclaration_Javadoc()
	 * @model containment="true"
	 * @generated
	 */
	Javadoc getJavadoc();

	/**
	 * Sets the value of the '{@link no.hal.learning.exercise.jdt.ecore.ast.TypeDeclaration#getJavadoc <em>Javadoc</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Javadoc</em>' containment reference.
	 * @see #getJavadoc()
	 * @generated
	 */
	void setJavadoc(Javadoc value);

	/**
	 * Returns the value of the '<em><b>Modifiers</b></em>' containment reference list.
	 * The list contents are of type {@link no.hal.learning.exercise.jdt.ecore.ast.IExtendedModifier}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modifiers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modifiers</em>' containment reference list.
	 * @see no.hal.learning.exercise.jdt.ecore.ast.AstPackage#getTypeDeclaration_Modifiers()
	 * @model containment="true"
	 * @generated
	 */
	EList<IExtendedModifier> getModifiers();

	/**
	 * Returns the value of the '<em><b>Interface</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interface</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface</em>' attribute.
	 * @see #setInterface(boolean)
	 * @see no.hal.learning.exercise.jdt.ecore.ast.AstPackage#getTypeDeclaration_Interface()
	 * @model
	 * @generated
	 */
	boolean isInterface();

	/**
	 * Sets the value of the '{@link no.hal.learning.exercise.jdt.ecore.ast.TypeDeclaration#isInterface <em>Interface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interface</em>' attribute.
	 * @see #isInterface()
	 * @generated
	 */
	void setInterface(boolean value);

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
	 * @see no.hal.learning.exercise.jdt.ecore.ast.AstPackage#getTypeDeclaration_Name()
	 * @model containment="true"
	 * @generated
	 */
	SimpleName getName();

	/**
	 * Sets the value of the '{@link no.hal.learning.exercise.jdt.ecore.ast.TypeDeclaration#getName <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' containment reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(SimpleName value);

	/**
	 * Returns the value of the '<em><b>Type Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link no.hal.learning.exercise.jdt.ecore.ast.TypeParameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Parameters</em>' containment reference list.
	 * @see no.hal.learning.exercise.jdt.ecore.ast.AstPackage#getTypeDeclaration_TypeParameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<TypeParameter> getTypeParameters();

	/**
	 * Returns the value of the '<em><b>Superclass Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Superclass Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Superclass Type</em>' containment reference.
	 * @see #setSuperclassType(Type)
	 * @see no.hal.learning.exercise.jdt.ecore.ast.AstPackage#getTypeDeclaration_SuperclassType()
	 * @model containment="true"
	 * @generated
	 */
	Type getSuperclassType();

	/**
	 * Sets the value of the '{@link no.hal.learning.exercise.jdt.ecore.ast.TypeDeclaration#getSuperclassType <em>Superclass Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Superclass Type</em>' containment reference.
	 * @see #getSuperclassType()
	 * @generated
	 */
	void setSuperclassType(Type value);

	/**
	 * Returns the value of the '<em><b>Super Interface Types</b></em>' containment reference list.
	 * The list contents are of type {@link no.hal.learning.exercise.jdt.ecore.ast.Type}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Super Interface Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Super Interface Types</em>' containment reference list.
	 * @see no.hal.learning.exercise.jdt.ecore.ast.AstPackage#getTypeDeclaration_SuperInterfaceTypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Type> getSuperInterfaceTypes();

	/**
	 * Returns the value of the '<em><b>Body Declarations</b></em>' containment reference list.
	 * The list contents are of type {@link no.hal.learning.exercise.jdt.ecore.ast.BodyDeclaration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Body Declarations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body Declarations</em>' containment reference list.
	 * @see no.hal.learning.exercise.jdt.ecore.ast.AstPackage#getTypeDeclaration_BodyDeclarations()
	 * @model containment="true"
	 * @generated
	 */
	EList<BodyDeclaration> getBodyDeclarations();

} // TypeDeclaration
