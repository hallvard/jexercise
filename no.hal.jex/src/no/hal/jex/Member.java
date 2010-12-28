/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package no.hal.jex;

import org.eclipse.jdt.core.IMember;
import org.eclipse.jdt.core.JavaModelException;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Member</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link no.hal.jex.Member#getName <em>Name</em>}</li>
 *   <li>{@link no.hal.jex.Member#getModifiers <em>Modifiers</em>}</li>
 *   <li>{@link no.hal.jex.Member#getOwner <em>Owner</em>}</li>
 *   <li>{@link no.hal.jex.Member#getRequired <em>Required</em>}</li>
 * </ul>
 * </p>
 *
 * @see no.hal.jex.JexPackage#getMember()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='JavaMemberExists CorrectModifiers CorrectTypes'"
 * @generated
 */
public interface Member extends JavaElement {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see no.hal.jex.JexPackage#getMember_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link no.hal.jex.Member#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Modifiers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modifiers</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modifiers</em>' attribute.
	 * @see #setModifiers(int)
	 * @see no.hal.jex.JexPackage#getMember_Modifiers()
	 * @model dataType="no.hal.jex.Modifiers"
	 * @generated
	 */
	int getModifiers();

	/**
	 * Sets the value of the '{@link no.hal.jex.Member#getModifiers <em>Modifiers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modifiers</em>' attribute.
	 * @see #getModifiers()
	 * @generated
	 */
	void setModifiers(int value);

	/**
	 * Returns the value of the '<em><b>Owner</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link no.hal.jex.JavaClass#getMembers <em>Members</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner</em>' container reference.
	 * @see #setOwner(JavaClass)
	 * @see no.hal.jex.JexPackage#getMember_Owner()
	 * @see no.hal.jex.JavaClass#getMembers
	 * @model opposite="members"
	 * @generated
	 */
	JavaClass getOwner();

	/**
	 * Sets the value of the '{@link no.hal.jex.Member#getOwner <em>Owner</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner</em>' container reference.
	 * @see #getOwner()
	 * @generated
	 */
	void setOwner(JavaClass value);

	/**
	 * Returns the value of the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required</em>' attribute.
	 * @see #setRequired(Boolean)
	 * @see no.hal.jex.JexPackage#getMember_Required()
	 * @model
	 * @generated
	 */
	Boolean getRequired();

	/**
	 * Sets the value of the '{@link no.hal.jex.Member#getRequired <em>Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required</em>' attribute.
	 * @see #getRequired()
	 * @generated
	 */
	void setRequired(Boolean value);

	// Support methods
	
	public String getSimpleName();
	public String getFullName();
	public String getNamePrefix();

	// test if object will override, based on simple checking of name etc.
	public boolean overrides(Member member);
	// at least initialises the parts that are needed for equality checking
	public void initFrom(IMember member) throws JavaModelException;

	public Boolean validateModifiers(IMember member);

} // Member
