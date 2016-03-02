/**
 */
package no.hal.emfs;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Xml Contents</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.hal.emfs.XmlContents#getElement <em>Element</em>}</li>
 *   <li>{@link no.hal.emfs.XmlContents#getPost <em>Post</em>}</li>
 * </ul>
 *
 * @see no.hal.emfs.EmfsPackage#getXmlContents()
 * @model
 * @generated
 */
public interface XmlContents extends EObject {
	/**
	 * Returns the value of the '<em><b>Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element</em>' containment reference.
	 * @see #setElement(XmlElement)
	 * @see no.hal.emfs.EmfsPackage#getXmlContents_Element()
	 * @model containment="true"
	 * @generated
	 */
	XmlElement getElement();

	/**
	 * Sets the value of the '{@link no.hal.emfs.XmlContents#getElement <em>Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element</em>' containment reference.
	 * @see #getElement()
	 * @generated
	 */
	void setElement(XmlElement value);

	/**
	 * Returns the value of the '<em><b>Post</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Post</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Post</em>' attribute.
	 * @see #setPost(String)
	 * @see no.hal.emfs.EmfsPackage#getXmlContents_Post()
	 * @model
	 * @generated
	 */
	String getPost();

	/**
	 * Sets the value of the '{@link no.hal.emfs.XmlContents#getPost <em>Post</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Post</em>' attribute.
	 * @see #getPost()
	 * @generated
	 */
	void setPost(String value);

} // XmlContents
