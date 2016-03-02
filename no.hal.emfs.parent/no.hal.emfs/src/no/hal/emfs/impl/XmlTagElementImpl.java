/**
 */
package no.hal.emfs.impl;

import java.util.Collection;

import no.hal.emfs.EmfsPackage;
import no.hal.emfs.XmlContents;
import no.hal.emfs.XmlTag;
import no.hal.emfs.XmlTagElement;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Xml Tag Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.hal.emfs.impl.XmlTagElementImpl#getStartTag <em>Start Tag</em>}</li>
 *   <li>{@link no.hal.emfs.impl.XmlTagElementImpl#getPre <em>Pre</em>}</li>
 *   <li>{@link no.hal.emfs.impl.XmlTagElementImpl#getContents <em>Contents</em>}</li>
 *   <li>{@link no.hal.emfs.impl.XmlTagElementImpl#getEndTag <em>End Tag</em>}</li>
 * </ul>
 *
 * @generated
 */
public class XmlTagElementImpl extends XmlElementImpl implements XmlTagElement {
	/**
	 * The cached value of the '{@link #getStartTag() <em>Start Tag</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartTag()
	 * @generated
	 * @ordered
	 */
	protected XmlTag startTag;

	/**
	 * The default value of the '{@link #getPre() <em>Pre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPre()
	 * @generated
	 * @ordered
	 */
	protected static final String PRE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPre() <em>Pre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPre()
	 * @generated
	 * @ordered
	 */
	protected String pre = PRE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getContents() <em>Contents</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContents()
	 * @generated
	 * @ordered
	 */
	protected EList<XmlContents> contents;

	/**
	 * The default value of the '{@link #getEndTag() <em>End Tag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndTag()
	 * @generated
	 * @ordered
	 */
	protected static final String END_TAG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEndTag() <em>End Tag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndTag()
	 * @generated
	 * @ordered
	 */
	protected String endTag = END_TAG_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XmlTagElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmfsPackage.Literals.XML_TAG_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XmlTag getStartTag() {
		return startTag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStartTag(XmlTag newStartTag, NotificationChain msgs) {
		XmlTag oldStartTag = startTag;
		startTag = newStartTag;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EmfsPackage.XML_TAG_ELEMENT__START_TAG, oldStartTag, newStartTag);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartTag(XmlTag newStartTag) {
		if (newStartTag != startTag) {
			NotificationChain msgs = null;
			if (startTag != null)
				msgs = ((InternalEObject)startTag).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EmfsPackage.XML_TAG_ELEMENT__START_TAG, null, msgs);
			if (newStartTag != null)
				msgs = ((InternalEObject)newStartTag).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EmfsPackage.XML_TAG_ELEMENT__START_TAG, null, msgs);
			msgs = basicSetStartTag(newStartTag, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmfsPackage.XML_TAG_ELEMENT__START_TAG, newStartTag, newStartTag));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPre() {
		return pre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPre(String newPre) {
		String oldPre = pre;
		pre = newPre;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmfsPackage.XML_TAG_ELEMENT__PRE, oldPre, pre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<XmlContents> getContents() {
		if (contents == null) {
			contents = new EObjectContainmentEList<XmlContents>(XmlContents.class, this, EmfsPackage.XML_TAG_ELEMENT__CONTENTS);
		}
		return contents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEndTag() {
		return endTag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndTag(String newEndTag) {
		String oldEndTag = endTag;
		endTag = newEndTag;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmfsPackage.XML_TAG_ELEMENT__END_TAG, oldEndTag, endTag));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EmfsPackage.XML_TAG_ELEMENT__START_TAG:
				return basicSetStartTag(null, msgs);
			case EmfsPackage.XML_TAG_ELEMENT__CONTENTS:
				return ((InternalEList<?>)getContents()).basicRemove(otherEnd, msgs);
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
			case EmfsPackage.XML_TAG_ELEMENT__START_TAG:
				return getStartTag();
			case EmfsPackage.XML_TAG_ELEMENT__PRE:
				return getPre();
			case EmfsPackage.XML_TAG_ELEMENT__CONTENTS:
				return getContents();
			case EmfsPackage.XML_TAG_ELEMENT__END_TAG:
				return getEndTag();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EmfsPackage.XML_TAG_ELEMENT__START_TAG:
				setStartTag((XmlTag)newValue);
				return;
			case EmfsPackage.XML_TAG_ELEMENT__PRE:
				setPre((String)newValue);
				return;
			case EmfsPackage.XML_TAG_ELEMENT__CONTENTS:
				getContents().clear();
				getContents().addAll((Collection<? extends XmlContents>)newValue);
				return;
			case EmfsPackage.XML_TAG_ELEMENT__END_TAG:
				setEndTag((String)newValue);
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
			case EmfsPackage.XML_TAG_ELEMENT__START_TAG:
				setStartTag((XmlTag)null);
				return;
			case EmfsPackage.XML_TAG_ELEMENT__PRE:
				setPre(PRE_EDEFAULT);
				return;
			case EmfsPackage.XML_TAG_ELEMENT__CONTENTS:
				getContents().clear();
				return;
			case EmfsPackage.XML_TAG_ELEMENT__END_TAG:
				setEndTag(END_TAG_EDEFAULT);
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
			case EmfsPackage.XML_TAG_ELEMENT__START_TAG:
				return startTag != null;
			case EmfsPackage.XML_TAG_ELEMENT__PRE:
				return PRE_EDEFAULT == null ? pre != null : !PRE_EDEFAULT.equals(pre);
			case EmfsPackage.XML_TAG_ELEMENT__CONTENTS:
				return contents != null && !contents.isEmpty();
			case EmfsPackage.XML_TAG_ELEMENT__END_TAG:
				return END_TAG_EDEFAULT == null ? endTag != null : !END_TAG_EDEFAULT.equals(endTag);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (pre: ");
		result.append(pre);
		result.append(", endTag: ");
		result.append(endTag);
		result.append(')');
		return result.toString();
	}

} //XmlTagElementImpl
