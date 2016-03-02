/**
 */
package no.hal.emfs.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import no.hal.emfs.EmfsPackage;
import no.hal.emfs.XmlAttribute;
import no.hal.emfs.XmlContents;
import no.hal.emfs.XmlElement;
import no.hal.emfs.XmlPIElement;
import no.hal.emfs.XmlStringContents;
import no.hal.emfs.XmlTagElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Xml String Contents</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.hal.emfs.impl.XmlStringContentsImpl#getElement <em>Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class XmlStringContentsImpl extends AbstractStringContentProviderImpl implements XmlStringContents {
	/**
	 * The cached value of the '{@link #getElement() <em>Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElement()
	 * @generated
	 * @ordered
	 */
	protected XmlElement element;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XmlStringContentsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmfsPackage.Literals.XML_STRING_CONTENTS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XmlElement getElement() {
		return element;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetElement(XmlElement newElement, NotificationChain msgs) {
		XmlElement oldElement = element;
		element = newElement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EmfsPackage.XML_STRING_CONTENTS__ELEMENT, oldElement, newElement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setElement(XmlElement newElement) {
		if (newElement != element) {
			NotificationChain msgs = null;
			if (element != null)
				msgs = ((InternalEObject)element).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EmfsPackage.XML_STRING_CONTENTS__ELEMENT, null, msgs);
			if (newElement != null)
				msgs = ((InternalEObject)newElement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EmfsPackage.XML_STRING_CONTENTS__ELEMENT, null, msgs);
			msgs = basicSetElement(newElement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmfsPackage.XML_STRING_CONTENTS__ELEMENT, newElement, newElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EmfsPackage.XML_STRING_CONTENTS__ELEMENT:
				return basicSetElement(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EmfsPackage.XML_STRING_CONTENTS__ELEMENT:
				return getElement();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EmfsPackage.XML_STRING_CONTENTS__ELEMENT:
				setElement((XmlElement)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case EmfsPackage.XML_STRING_CONTENTS__ELEMENT:
				setElement((XmlElement)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case EmfsPackage.XML_STRING_CONTENTS__ELEMENT:
				return element != null;
		}
		return super.eIsSet(featureID);
	}
	
	//
	
	@Override
	public String getStringContent() {
		StringBuilder buffer = new StringBuilder();
		buffer.append("<");
		appendXmlElement(getElement(), buffer);
		buffer.append(">");
		return buffer.toString();
	}
	
	private void appendXmlElement(XmlElement xmlElement, StringBuilder buffer) {
		if (xmlElement instanceof XmlPIElement) {
			appendXmlPiElement((XmlPIElement) xmlElement, buffer);
		} else if (xmlElement instanceof XmlTagElement) {
			appendXmlTagElement((XmlTagElement) xmlElement, buffer);
		}
	}

	protected void appendXmlTagElement(XmlTagElement tagElement, StringBuilder buffer) {
		String tagName = tagElement.getStartTag().getName();
		buffer.append(tagName);
		appendXmlAttributes(tagElement.getStartTag().getAttributes(), buffer);
		buffer.append(tagElement.getPre());
		for (XmlContents xmlContent : tagElement.getContents()) {
			appendXmlElement(xmlContent.getElement(), buffer);
			buffer.append(xmlContent.getPost());
		}
		buffer.append("/");
		buffer.append(tagName);
	}

	protected void appendXmlPiElement(XmlPIElement piElement, StringBuilder buffer) {
		buffer.append("?");
		buffer.append(piElement.getName());
		appendXmlAttributes(piElement.getAttributes(), buffer);
		buffer.append("?");
	}
	
	private void appendXmlAttributes(Iterable<XmlAttribute> xmlAttributes, StringBuilder buffer) {
		for (XmlAttribute xmlAttribute : xmlAttributes) {
			buffer.append(" ");
			buffer.append(xmlAttribute.getName());
			buffer.append("=\"");
			String value = xmlAttribute.getValue();
			buffer.append(value != null ? value : "true");			
			buffer.append("\"");
		}
	}

} //XmlStringContentsImpl
