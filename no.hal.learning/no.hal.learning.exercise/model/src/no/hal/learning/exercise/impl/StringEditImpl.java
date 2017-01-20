/**
 */
package no.hal.learning.exercise.impl;

import no.hal.learning.exercise.ExercisePackage;
import no.hal.learning.exercise.StringEdit;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>String Edit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.hal.learning.exercise.impl.StringEditImpl#getStoredString <em>Stored String</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StringEditImpl extends AbstractStringEditImpl implements StringEdit {
	/**
	 * The default value of the '{@link #getStoredString() <em>Stored String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStoredString()
	 * @generated
	 * @ordered
	 */
	protected static final String STORED_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStoredString() <em>Stored String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStoredString()
	 * @generated
	 * @ordered
	 */
	protected String storedString = STORED_STRING_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StringEditImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExercisePackage.Literals.STRING_EDIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStoredString() {
		return storedString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStoredString(String newStoredString) {
		String oldStoredString = storedString;
		storedString = newStoredString;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExercisePackage.STRING_EDIT__STORED_STRING, oldStoredString, storedString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getString() {
		return storedString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ExercisePackage.STRING_EDIT__STORED_STRING:
				return getStoredString();
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
			case ExercisePackage.STRING_EDIT__STORED_STRING:
				setStoredString((String)newValue);
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
			case ExercisePackage.STRING_EDIT__STORED_STRING:
				setStoredString(STORED_STRING_EDEFAULT);
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
			case ExercisePackage.STRING_EDIT__STORED_STRING:
				return STORED_STRING_EDEFAULT == null ? storedString != null : !STORED_STRING_EDEFAULT.equals(storedString);
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
		result.append(" (storedString: ");
		result.append(storedString);
		result.append(')');
		return result.toString();
	}
} //StringEditImpl
