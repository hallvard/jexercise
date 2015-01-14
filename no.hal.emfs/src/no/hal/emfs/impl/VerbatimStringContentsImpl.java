/**
 */
package no.hal.emfs.impl;

import no.hal.emfs.EmfsPackage;
import no.hal.emfs.VerbatimStringContents;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Verbatim String Contents</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link no.hal.emfs.impl.VerbatimStringContentsImpl#getStringContent <em>String Content</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VerbatimStringContentsImpl extends AbstractStringContentsImpl implements VerbatimStringContents {
	/**
	 * The default value of the '{@link #getStringContent() <em>String Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStringContent()
	 * @generated
	 * @ordered
	 */
	protected static final String STRING_CONTENT_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getStringContent() <em>String Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStringContent()
	 * @generated
	 * @ordered
	 */
	protected String stringContent = STRING_CONTENT_EDEFAULT;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VerbatimStringContentsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmfsPackage.Literals.VERBATIM_STRING_CONTENTS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStringContent() {
		return stringContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStringContent(String newStringContent) {
		String oldStringContent = stringContent;
		stringContent = newStringContent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmfsPackage.VERBATIM_STRING_CONTENTS__STRING_CONTENT, oldStringContent, stringContent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EmfsPackage.VERBATIM_STRING_CONTENTS__STRING_CONTENT:
				return getStringContent();
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
			case EmfsPackage.VERBATIM_STRING_CONTENTS__STRING_CONTENT:
				setStringContent((String)newValue);
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
			case EmfsPackage.VERBATIM_STRING_CONTENTS__STRING_CONTENT:
				setStringContent(STRING_CONTENT_EDEFAULT);
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
			case EmfsPackage.VERBATIM_STRING_CONTENTS__STRING_CONTENT:
				return STRING_CONTENT_EDEFAULT == null ? stringContent != null : !STRING_CONTENT_EDEFAULT.equals(stringContent);
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
		result.append(" (stringContent: ");
		result.append(stringContent);
		result.append(')');
		return result.toString();
	}

} //VerbatimStringContentsImpl
