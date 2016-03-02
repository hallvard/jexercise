/**
 */
package no.hal.emfs.impl;

import no.hal.emfs.ByteArrayContentProvider;
import no.hal.emfs.EmfsPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Byte Array Content Provider</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.hal.emfs.impl.ByteArrayContentProviderImpl#getByteContents <em>Byte Contents</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ByteArrayContentProviderImpl extends AbstractBytesContentProviderImpl implements ByteArrayContentProvider {
	/**
	 * The default value of the '{@link #getByteContents() <em>Byte Contents</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getByteContents()
	 * @generated
	 * @ordered
	 */
	protected static final byte[] BYTE_CONTENTS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getByteContents() <em>Byte Contents</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getByteContents()
	 * @generated
	 * @ordered
	 */
	protected byte[] byteContents = BYTE_CONTENTS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ByteArrayContentProviderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmfsPackage.Literals.BYTE_ARRAY_CONTENT_PROVIDER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte[] getByteContents() {
		return byteContents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setByteContents(byte[] newByteContents) {
		byte[] oldByteContents = byteContents;
		byteContents = newByteContents;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmfsPackage.BYTE_ARRAY_CONTENT_PROVIDER__BYTE_CONTENTS, oldByteContents, byteContents));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EmfsPackage.BYTE_ARRAY_CONTENT_PROVIDER__BYTE_CONTENTS:
				return getByteContents();
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
			case EmfsPackage.BYTE_ARRAY_CONTENT_PROVIDER__BYTE_CONTENTS:
				setByteContents((byte[])newValue);
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
			case EmfsPackage.BYTE_ARRAY_CONTENT_PROVIDER__BYTE_CONTENTS:
				setByteContents(BYTE_CONTENTS_EDEFAULT);
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
			case EmfsPackage.BYTE_ARRAY_CONTENT_PROVIDER__BYTE_CONTENTS:
				return BYTE_CONTENTS_EDEFAULT == null ? byteContents != null : !BYTE_CONTENTS_EDEFAULT.equals(byteContents);
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
		result.append(" (byteContents: ");
		result.append(byteContents);
		result.append(')');
		return result.toString();
	}

} //ByteArrayContentProviderImpl
