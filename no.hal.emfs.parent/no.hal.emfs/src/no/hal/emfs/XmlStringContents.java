/**
 */
package no.hal.emfs;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Xml String Contents</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.hal.emfs.XmlStringContents#getElement <em>Element</em>}</li>
 * </ul>
 *
 * @see no.hal.emfs.EmfsPackage#getXmlStringContents()
 * @model
 * @generated
 */
public interface XmlStringContents extends AbstractStringContentProvider {
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
	 * @see no.hal.emfs.EmfsPackage#getXmlStringContents_Element()
	 * @model containment="true"
	 * @generated
	 */
	XmlElement getElement();

	/**
	 * Sets the value of the '{@link no.hal.emfs.XmlStringContents#getElement <em>Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element</em>' containment reference.
	 * @see #getElement()
	 * @generated
	 */
	void setElement(XmlElement value);

} // XmlStringContents
