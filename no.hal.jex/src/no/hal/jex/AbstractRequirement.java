/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package no.hal.jex;


import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Requirement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link no.hal.jex.AbstractRequirement#getText <em>Text</em>}</li>
 *   <li>{@link no.hal.jex.AbstractRequirement#getDescription <em>Description</em>}</li>
 *   <li>{@link no.hal.jex.AbstractRequirement#getComment <em>Comment</em>}</li>
 *   <li>{@link no.hal.jex.AbstractRequirement#getJavaElements <em>Java Elements</em>}</li>
 *   <li>{@link no.hal.jex.AbstractRequirement#getRequirements <em>Requirements</em>}</li>
 *   <li>{@link no.hal.jex.AbstractRequirement#getParent <em>Parent</em>}</li>
 *   <li>{@link no.hal.jex.AbstractRequirement#getChildrenSatisfied <em>Children Satisfied</em>}</li>
 * </ul>
 * </p>
 *
 * @see no.hal.jex.JexPackage#getAbstractRequirement()
 * @model abstract="true"
 * @generated
 */
public interface AbstractRequirement extends EObject {
	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(String)
	 * @see no.hal.jex.JexPackage#getAbstractRequirement_Text()
	 * @model
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link no.hal.jex.AbstractRequirement#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see no.hal.jex.JexPackage#getAbstractRequirement_Description()
	 * @model extendedMetaData="kind='element'"
	 *        annotation="http:///no/hal/jex/JexMetaData contentType='text/html'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link no.hal.jex.AbstractRequirement#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comment</em>' attribute.
	 * @see #setComment(String)
	 * @see no.hal.jex.JexPackage#getAbstractRequirement_Comment()
	 * @model extendedMetaData="kind='element'"
	 *        annotation="http:///no/hal/jex/JexMetaData contentType='text/html'"
	 * @generated
	 */
	String getComment();

	/**
	 * Sets the value of the '{@link no.hal.jex.AbstractRequirement#getComment <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comment</em>' attribute.
	 * @see #getComment()
	 * @generated
	 */
	void setComment(String value);

	/**
	 * Returns the value of the '<em><b>Java Elements</b></em>' containment reference list.
	 * The list contents are of type {@link no.hal.jex.JavaElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Java Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Java Elements</em>' containment reference list.
	 * @see no.hal.jex.JexPackage#getAbstractRequirement_JavaElements()
	 * @model containment="true"
	 * @generated
	 */
	EList<JavaElement> getJavaElements();

	/**
	 * Returns the value of the '<em><b>Requirements</b></em>' containment reference list.
	 * The list contents are of type {@link no.hal.jex.AbstractRequirement}.
	 * It is bidirectional and its opposite is '{@link no.hal.jex.AbstractRequirement#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Requirements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requirements</em>' containment reference list.
	 * @see no.hal.jex.JexPackage#getAbstractRequirement_Requirements()
	 * @see no.hal.jex.AbstractRequirement#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<AbstractRequirement> getRequirements();

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link no.hal.jex.AbstractRequirement#getRequirements <em>Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(AbstractRequirement)
	 * @see no.hal.jex.JexPackage#getAbstractRequirement_Parent()
	 * @see no.hal.jex.AbstractRequirement#getRequirements
	 * @model opposite="requirements" transient="false"
	 * @generated
	 */
	AbstractRequirement getParent();

	/**
	 * Sets the value of the '{@link no.hal.jex.AbstractRequirement#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(AbstractRequirement value);

	/**
	 * Returns the value of the '<em><b>Children Satisfied</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Children Satisfied</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children Satisfied</em>' attribute.
	 * @see #setChildrenSatisfied(Boolean)
	 * @see no.hal.jex.JexPackage#getAbstractRequirement_ChildrenSatisfied()
	 * @model transient="true"
	 * @generated
	 */
	Boolean getChildrenSatisfied();

	/**
	 * Sets the value of the '{@link no.hal.jex.AbstractRequirement#getChildrenSatisfied <em>Children Satisfied</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Children Satisfied</em>' attribute.
	 * @see #getChildrenSatisfied()
	 * @generated
	 */
	void setChildrenSatisfied(Boolean value);

	//
	
	public URI getDescriptionURI();

} // AbstractRequirement
