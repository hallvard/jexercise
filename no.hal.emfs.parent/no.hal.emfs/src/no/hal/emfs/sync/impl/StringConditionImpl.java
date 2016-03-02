/**
 */
package no.hal.emfs.sync.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import no.hal.emfs.EmfsResource;
import no.hal.emfs.sync.StringCondition;
import no.hal.emfs.sync.SyncPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>String Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.hal.emfs.sync.impl.StringConditionImpl#getPrefix <em>Prefix</em>}</li>
 *   <li>{@link no.hal.emfs.sync.impl.StringConditionImpl#getSuffix <em>Suffix</em>}</li>
 *   <li>{@link no.hal.emfs.sync.impl.StringConditionImpl#getRegex <em>Regex</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class StringConditionImpl extends MinimalEObjectImpl.Container implements StringCondition {
	/**
	 * The default value of the '{@link #getPrefix() <em>Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrefix()
	 * @generated
	 * @ordered
	 */
	protected static final String PREFIX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrefix() <em>Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrefix()
	 * @generated
	 * @ordered
	 */
	protected String prefix = PREFIX_EDEFAULT;

	/**
	 * The default value of the '{@link #getSuffix() <em>Suffix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuffix()
	 * @generated
	 * @ordered
	 */
	protected static final String SUFFIX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSuffix() <em>Suffix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuffix()
	 * @generated
	 * @ordered
	 */
	protected String suffix = SUFFIX_EDEFAULT;

	/**
	 * The default value of the '{@link #getRegex() <em>Regex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegex()
	 * @generated
	 * @ordered
	 */
	protected static final String REGEX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRegex() <em>Regex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegex()
	 * @generated
	 * @ordered
	 */
	protected String regex = REGEX_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StringConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SyncPackage.Literals.STRING_CONDITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPrefix() {
		return prefix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrefix(String newPrefix) {
		String oldPrefix = prefix;
		prefix = newPrefix;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SyncPackage.STRING_CONDITION__PREFIX, oldPrefix, prefix));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSuffix() {
		return suffix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSuffix(String newSuffix) {
		String oldSuffix = suffix;
		suffix = newSuffix;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SyncPackage.STRING_CONDITION__SUFFIX, oldSuffix, suffix));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRegex() {
		return regex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRegex(String newRegex) {
		String oldRegex = regex;
		regex = newRegex;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SyncPackage.STRING_CONDITION__REGEX, oldRegex, regex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public boolean accept(String value) {
		if (getPrefix() != null && (! value.startsWith(getPrefix()))) {
			return false;
		}
		if (getSuffix() != null && (! value.endsWith(getSuffix()))) {
			return false;
		}
		if (getRegex() != null && (! value.matches(getRegex()))) {
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public boolean accept(EmfsResource resource) {
//		EAnnotation annotation = this.eClass().getEAnnotation(SyncPackage.eNS_URI);
//		String value = null;
//		if (annotation != null) {
//			for (EObject ref : annotation.getReferences()) {
//				if (ref instanceof ETypedElement) {
//					ETypedElement typedRef = (ETypedElement) ref;
//					if (typedRef.getEType() instanceof EDataType && typedRef.eContainer() instanceof EClass) {
//						EClass owningClass = (EClass) typedRef.eContainer();
//						if (owningClass.isInstance(resource)) {
//							if (ref instanceof EAttribute) {
//								value = String.valueOf(this.eGet((EAttribute) ref));
//							} else if (ref instanceof EOperation && ((EOperation) ref).getEParameters().isEmpty()) {
//								try {
//									value = String.valueOf(this.eInvoke((EOperation) ref, ECollections.emptyEList()));
//								} catch (InvocationTargetException e) {
//								}
//							}
//						}
//					}
//				}
//				if (value != null) {
//					return accept(value);
//				}
//			}
//		}
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SyncPackage.STRING_CONDITION__PREFIX:
				return getPrefix();
			case SyncPackage.STRING_CONDITION__SUFFIX:
				return getSuffix();
			case SyncPackage.STRING_CONDITION__REGEX:
				return getRegex();
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
			case SyncPackage.STRING_CONDITION__PREFIX:
				setPrefix((String)newValue);
				return;
			case SyncPackage.STRING_CONDITION__SUFFIX:
				setSuffix((String)newValue);
				return;
			case SyncPackage.STRING_CONDITION__REGEX:
				setRegex((String)newValue);
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
			case SyncPackage.STRING_CONDITION__PREFIX:
				setPrefix(PREFIX_EDEFAULT);
				return;
			case SyncPackage.STRING_CONDITION__SUFFIX:
				setSuffix(SUFFIX_EDEFAULT);
				return;
			case SyncPackage.STRING_CONDITION__REGEX:
				setRegex(REGEX_EDEFAULT);
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
			case SyncPackage.STRING_CONDITION__PREFIX:
				return PREFIX_EDEFAULT == null ? prefix != null : !PREFIX_EDEFAULT.equals(prefix);
			case SyncPackage.STRING_CONDITION__SUFFIX:
				return SUFFIX_EDEFAULT == null ? suffix != null : !SUFFIX_EDEFAULT.equals(suffix);
			case SyncPackage.STRING_CONDITION__REGEX:
				return REGEX_EDEFAULT == null ? regex != null : !REGEX_EDEFAULT.equals(regex);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case SyncPackage.STRING_CONDITION___ACCEPT__STRING:
				return accept((String)arguments.get(0));
			case SyncPackage.STRING_CONDITION___ACCEPT__EMFSRESOURCE:
				return accept((EmfsResource)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (prefix: ");
		result.append(prefix);
		result.append(", suffix: ");
		result.append(suffix);
		result.append(", regex: ");
		result.append(regex);
		result.append(')');
		return result.toString();
	}

} //StringConditionImpl
