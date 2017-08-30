/**
 */
package no.hal.learning.exercise.jdt.ecore.ast;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Method Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.hal.learning.exercise.jdt.ecore.ast.MethodDeclaration#getJavadoc <em>Javadoc</em>}</li>
 *   <li>{@link no.hal.learning.exercise.jdt.ecore.ast.MethodDeclaration#getModifiers <em>Modifiers</em>}</li>
 *   <li>{@link no.hal.learning.exercise.jdt.ecore.ast.MethodDeclaration#isConstructor <em>Constructor</em>}</li>
 *   <li>{@link no.hal.learning.exercise.jdt.ecore.ast.MethodDeclaration#getTypeParameters <em>Type Parameters</em>}</li>
 *   <li>{@link no.hal.learning.exercise.jdt.ecore.ast.MethodDeclaration#getReturnType2 <em>Return Type2</em>}</li>
 *   <li>{@link no.hal.learning.exercise.jdt.ecore.ast.MethodDeclaration#getName <em>Name</em>}</li>
 *   <li>{@link no.hal.learning.exercise.jdt.ecore.ast.MethodDeclaration#getReceiverType <em>Receiver Type</em>}</li>
 *   <li>{@link no.hal.learning.exercise.jdt.ecore.ast.MethodDeclaration#getReceiverQualifier <em>Receiver Qualifier</em>}</li>
 *   <li>{@link no.hal.learning.exercise.jdt.ecore.ast.MethodDeclaration#getParameters <em>Parameters</em>}</li>
 *   <li>{@link no.hal.learning.exercise.jdt.ecore.ast.MethodDeclaration#getExtraDimensions2 <em>Extra Dimensions2</em>}</li>
 *   <li>{@link no.hal.learning.exercise.jdt.ecore.ast.MethodDeclaration#getThrownExceptionTypes <em>Thrown Exception Types</em>}</li>
 *   <li>{@link no.hal.learning.exercise.jdt.ecore.ast.MethodDeclaration#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @see no.hal.learning.exercise.jdt.ecore.ast.AstPackage#getMethodDeclaration()
 * @model
 * @generated
 */
public interface MethodDeclaration extends BodyDeclaration {
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
	 * @see no.hal.learning.exercise.jdt.ecore.ast.AstPackage#getMethodDeclaration_Javadoc()
	 * @model containment="true"
	 * @generated
	 */
	Javadoc getJavadoc();

	/**
	 * Sets the value of the '{@link no.hal.learning.exercise.jdt.ecore.ast.MethodDeclaration#getJavadoc <em>Javadoc</em>}' containment reference.
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
	 * @see no.hal.learning.exercise.jdt.ecore.ast.AstPackage#getMethodDeclaration_Modifiers()
	 * @model containment="true"
	 * @generated
	 */
	EList<IExtendedModifier> getModifiers();

	/**
	 * Returns the value of the '<em><b>Constructor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constructor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constructor</em>' attribute.
	 * @see #setConstructor(boolean)
	 * @see no.hal.learning.exercise.jdt.ecore.ast.AstPackage#getMethodDeclaration_Constructor()
	 * @model
	 * @generated
	 */
	boolean isConstructor();

	/**
	 * Sets the value of the '{@link no.hal.learning.exercise.jdt.ecore.ast.MethodDeclaration#isConstructor <em>Constructor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constructor</em>' attribute.
	 * @see #isConstructor()
	 * @generated
	 */
	void setConstructor(boolean value);

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
	 * @see no.hal.learning.exercise.jdt.ecore.ast.AstPackage#getMethodDeclaration_TypeParameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<TypeParameter> getTypeParameters();

	/**
	 * Returns the value of the '<em><b>Return Type2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Return Type2</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Type2</em>' containment reference.
	 * @see #setReturnType2(Type)
	 * @see no.hal.learning.exercise.jdt.ecore.ast.AstPackage#getMethodDeclaration_ReturnType2()
	 * @model containment="true"
	 * @generated
	 */
	Type getReturnType2();

	/**
	 * Sets the value of the '{@link no.hal.learning.exercise.jdt.ecore.ast.MethodDeclaration#getReturnType2 <em>Return Type2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Type2</em>' containment reference.
	 * @see #getReturnType2()
	 * @generated
	 */
	void setReturnType2(Type value);

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
	 * @see no.hal.learning.exercise.jdt.ecore.ast.AstPackage#getMethodDeclaration_Name()
	 * @model containment="true"
	 * @generated
	 */
	SimpleName getName();

	/**
	 * Sets the value of the '{@link no.hal.learning.exercise.jdt.ecore.ast.MethodDeclaration#getName <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' containment reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(SimpleName value);

	/**
	 * Returns the value of the '<em><b>Receiver Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Receiver Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Receiver Type</em>' containment reference.
	 * @see #setReceiverType(Type)
	 * @see no.hal.learning.exercise.jdt.ecore.ast.AstPackage#getMethodDeclaration_ReceiverType()
	 * @model containment="true"
	 * @generated
	 */
	Type getReceiverType();

	/**
	 * Sets the value of the '{@link no.hal.learning.exercise.jdt.ecore.ast.MethodDeclaration#getReceiverType <em>Receiver Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Receiver Type</em>' containment reference.
	 * @see #getReceiverType()
	 * @generated
	 */
	void setReceiverType(Type value);

	/**
	 * Returns the value of the '<em><b>Receiver Qualifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Receiver Qualifier</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Receiver Qualifier</em>' containment reference.
	 * @see #setReceiverQualifier(SimpleName)
	 * @see no.hal.learning.exercise.jdt.ecore.ast.AstPackage#getMethodDeclaration_ReceiverQualifier()
	 * @model containment="true"
	 * @generated
	 */
	SimpleName getReceiverQualifier();

	/**
	 * Sets the value of the '{@link no.hal.learning.exercise.jdt.ecore.ast.MethodDeclaration#getReceiverQualifier <em>Receiver Qualifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Receiver Qualifier</em>' containment reference.
	 * @see #getReceiverQualifier()
	 * @generated
	 */
	void setReceiverQualifier(SimpleName value);

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link no.hal.learning.exercise.jdt.ecore.ast.SingleVariableDeclaration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see no.hal.learning.exercise.jdt.ecore.ast.AstPackage#getMethodDeclaration_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<SingleVariableDeclaration> getParameters();

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
	 * @see no.hal.learning.exercise.jdt.ecore.ast.AstPackage#getMethodDeclaration_ExtraDimensions2()
	 * @model containment="true"
	 * @generated
	 */
	EList<Dimension> getExtraDimensions2();

	/**
	 * Returns the value of the '<em><b>Thrown Exception Types</b></em>' containment reference list.
	 * The list contents are of type {@link no.hal.learning.exercise.jdt.ecore.ast.Type}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Thrown Exception Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thrown Exception Types</em>' containment reference list.
	 * @see no.hal.learning.exercise.jdt.ecore.ast.AstPackage#getMethodDeclaration_ThrownExceptionTypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Type> getThrownExceptionTypes();

	/**
	 * Returns the value of the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Body</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' containment reference.
	 * @see #setBody(Block)
	 * @see no.hal.learning.exercise.jdt.ecore.ast.AstPackage#getMethodDeclaration_Body()
	 * @model containment="true"
	 * @generated
	 */
	Block getBody();

	/**
	 * Sets the value of the '{@link no.hal.learning.exercise.jdt.ecore.ast.MethodDeclaration#getBody <em>Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' containment reference.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(Block value);

} // MethodDeclaration
