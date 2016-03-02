/**
 */
package no.hal.emfs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Xml Tag Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.hal.emfs.XmlTagElement#getStartTag <em>Start Tag</em>}</li>
 *   <li>{@link no.hal.emfs.XmlTagElement#getPre <em>Pre</em>}</li>
 *   <li>{@link no.hal.emfs.XmlTagElement#getContents <em>Contents</em>}</li>
 *   <li>{@link no.hal.emfs.XmlTagElement#getEndTag <em>End Tag</em>}</li>
 * </ul>
 *
 * @see no.hal.emfs.EmfsPackage#getXmlTagElement()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='MatchingEndTag'"
 * @generated
 */
public interface XmlTagElement extends XmlElement {
	/**
	 * Returns the value of the '<em><b>Start Tag</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Tag</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Tag</em>' containment reference.
	 * @see #setStartTag(XmlTag)
	 * @see no.hal.emfs.EmfsPackage#getXmlTagElement_StartTag()
	 * @model containment="true"
	 * @generated
	 */
	XmlTag getStartTag();

	/**
	 * Sets the value of the '{@link no.hal.emfs.XmlTagElement#getStartTag <em>Start Tag</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Tag</em>' containment reference.
	 * @see #getStartTag()
	 * @generated
	 */
	void setStartTag(XmlTag value);

	/**
	 * Returns the value of the '<em><b>Pre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pre</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pre</em>' attribute.
	 * @see #setPre(String)
	 * @see no.hal.emfs.EmfsPackage#getXmlTagElement_Pre()
	 * @model
	 * @generated
	 */
	String getPre();

	/**
	 * Sets the value of the '{@link no.hal.emfs.XmlTagElement#getPre <em>Pre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pre</em>' attribute.
	 * @see #getPre()
	 * @generated
	 */
	void setPre(String value);

	/**
	 * Returns the value of the '<em><b>Contents</b></em>' containment reference list.
	 * The list contents are of type {@link no.hal.emfs.XmlContents}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contents</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contents</em>' containment reference list.
	 * @see no.hal.emfs.EmfsPackage#getXmlTagElement_Contents()
	 * @model containment="true"
	 * @generated
	 */
	EList<XmlContents> getContents();

	/**
	 * Returns the value of the '<em><b>End Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Tag</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Tag</em>' attribute.
	 * @see #setEndTag(String)
	 * @see no.hal.emfs.EmfsPackage#getXmlTagElement_EndTag()
	 * @model
	 * @generated
	 */
	String getEndTag();

	/**
	 * Sets the value of the '{@link no.hal.emfs.XmlTagElement#getEndTag <em>End Tag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Tag</em>' attribute.
	 * @see #getEndTag()
	 * @generated
	 */
	void setEndTag(String value);

} // XmlTagElement
