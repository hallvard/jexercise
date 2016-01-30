/**
 */
package no.hal.learning.sharing.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import no.hal.learning.sharing.AbstractShare;
import no.hal.learning.sharing.ShareMode;
import no.hal.learning.sharing.SharingPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Share</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.hal.learning.sharing.impl.AbstractShareImpl#getName <em>Name</em>}</li>
 *   <li>{@link no.hal.learning.sharing.impl.AbstractShareImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link no.hal.learning.sharing.impl.AbstractShareImpl#getSharer <em>Sharer</em>}</li>
 *   <li>{@link no.hal.learning.sharing.impl.AbstractShareImpl#getMode <em>Mode</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AbstractShareImpl extends MinimalEObjectImpl.Container implements AbstractShare {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getOwner() <em>Owner</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwner()
	 * @generated
	 * @ordered
	 */
	protected static final String OWNER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOwner() <em>Owner</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwner()
	 * @generated
	 * @ordered
	 */
	protected String owner = OWNER_EDEFAULT;

	/**
	 * The default value of the '{@link #getSharer() <em>Sharer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSharer()
	 * @generated
	 * @ordered
	 */
	protected static final String SHARER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSharer() <em>Sharer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSharer()
	 * @generated
	 * @ordered
	 */
	protected String sharer = SHARER_EDEFAULT;

	/**
	 * The default value of the '{@link #getMode() <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMode()
	 * @generated
	 * @ordered
	 */
	protected static final ShareMode MODE_EDEFAULT = ShareMode.OUT;

	/**
	 * The cached value of the '{@link #getMode() <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMode()
	 * @generated
	 * @ordered
	 */
	protected ShareMode mode = MODE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractShareImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SharingPackage.Literals.ABSTRACT_SHARE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SharingPackage.ABSTRACT_SHARE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOwner() {
		return owner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwner(String newOwner) {
		String oldOwner = owner;
		owner = newOwner;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SharingPackage.ABSTRACT_SHARE__OWNER, oldOwner, owner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSharer() {
		return sharer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSharer(String newSharer) {
		String oldSharer = sharer;
		sharer = newSharer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SharingPackage.ABSTRACT_SHARE__SHARER, oldSharer, sharer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShareMode getMode() {
		return mode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMode(ShareMode newMode) {
		ShareMode oldMode = mode;
		mode = newMode == null ? MODE_EDEFAULT : newMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SharingPackage.ABSTRACT_SHARE__MODE, oldMode, mode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SharingPackage.ABSTRACT_SHARE__NAME:
				return getName();
			case SharingPackage.ABSTRACT_SHARE__OWNER:
				return getOwner();
			case SharingPackage.ABSTRACT_SHARE__SHARER:
				return getSharer();
			case SharingPackage.ABSTRACT_SHARE__MODE:
				return getMode();
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
			case SharingPackage.ABSTRACT_SHARE__NAME:
				setName((String)newValue);
				return;
			case SharingPackage.ABSTRACT_SHARE__OWNER:
				setOwner((String)newValue);
				return;
			case SharingPackage.ABSTRACT_SHARE__SHARER:
				setSharer((String)newValue);
				return;
			case SharingPackage.ABSTRACT_SHARE__MODE:
				setMode((ShareMode)newValue);
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
			case SharingPackage.ABSTRACT_SHARE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SharingPackage.ABSTRACT_SHARE__OWNER:
				setOwner(OWNER_EDEFAULT);
				return;
			case SharingPackage.ABSTRACT_SHARE__SHARER:
				setSharer(SHARER_EDEFAULT);
				return;
			case SharingPackage.ABSTRACT_SHARE__MODE:
				setMode(MODE_EDEFAULT);
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
			case SharingPackage.ABSTRACT_SHARE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SharingPackage.ABSTRACT_SHARE__OWNER:
				return OWNER_EDEFAULT == null ? owner != null : !OWNER_EDEFAULT.equals(owner);
			case SharingPackage.ABSTRACT_SHARE__SHARER:
				return SHARER_EDEFAULT == null ? sharer != null : !SHARER_EDEFAULT.equals(sharer);
			case SharingPackage.ABSTRACT_SHARE__MODE:
				return mode != MODE_EDEFAULT;
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
		result.append(" (name: ");
		result.append(name);
		result.append(", owner: ");
		result.append(owner);
		result.append(", sharer: ");
		result.append(sharer);
		result.append(", mode: ");
		result.append(mode);
		result.append(')');
		return result.toString();
	}

} //AbstractShareImpl
