/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package no.hal.jex;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Java Requirement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link no.hal.jex.JavaRequirement#getJavaElement <em>Java Element</em>}</li>
 *   <li>{@link no.hal.jex.JavaRequirement#getRequiredFeatures <em>Required Features</em>}</li>
 * </ul>
 * </p>
 *
 * @see no.hal.jex.JexPackage#getJavaRequirement()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='NonNullJavaElement'"
 * @generated
 */
public interface JavaRequirement extends Requirement {
	/**
	 * Returns the value of the '<em><b>Java Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Java Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Java Element</em>' reference.
	 * @see #setJavaElement(JavaElement)
	 * @see no.hal.jex.JexPackage#getJavaRequirement_JavaElement()
	 * @model
	 * @generated
	 */
	JavaElement getJavaElement();

	/**
	 * Sets the value of the '{@link no.hal.jex.JavaRequirement#getJavaElement <em>Java Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Java Element</em>' reference.
	 * @see #getJavaElement()
	 * @generated
	 */
	void setJavaElement(JavaElement value);

	/**
	 * Returns the value of the '<em><b>Required Features</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required Features</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Features</em>' attribute.
	 * @see #setRequiredFeatures(String)
	 * @see no.hal.jex.JexPackage#getJavaRequirement_RequiredFeatures()
	 * @model dataType="no.hal.jex.Features"
	 * @generated
	 */
	String getRequiredFeatures();

	/**
	 * Sets the value of the '{@link no.hal.jex.JavaRequirement#getRequiredFeatures <em>Required Features</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required Features</em>' attribute.
	 * @see #getRequiredFeatures()
	 * @generated
	 */
	void setRequiredFeatures(String value);

} // JavaRequirement
