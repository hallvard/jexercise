/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package no.hal.jex.impl;


import java.util.Collection;
import no.hal.jex.JexPackage;
import no.hal.jex.Requirement;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Requirement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link no.hal.jex.impl.RequirementImpl#getSatisfied <em>Satisfied</em>}</li>
 *   <li>{@link no.hal.jex.impl.RequirementImpl#getTime <em>Time</em>}</li>
 *   <li>{@link no.hal.jex.impl.RequirementImpl#getMessages <em>Messages</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class RequirementImpl extends AbstractRequirementImpl implements Requirement {
	/**
	 * The default value of the '{@link #getSatisfied() <em>Satisfied</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSatisfied()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean SATISFIED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSatisfied() <em>Satisfied</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSatisfied()
	 * @generated
	 * @ordered
	 */
	protected Boolean satisfied = SATISFIED_EDEFAULT;

	/**
	 * The default value of the '{@link #getTime() <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTime()
	 * @generated
	 * @ordered
	 */
	protected static final long TIME_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getTime() <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTime()
	 * @generated
	 * @ordered
	 */
	protected long time = TIME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMessages() <em>Messages</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessages()
	 * @generated
	 * @ordered
	 */
	protected EList<String> messages;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RequirementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JexPackage.Literals.REQUIREMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getSatisfied() {
		return satisfied;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSatisfied(Boolean newSatisfied) {
		Boolean oldSatisfied = satisfied;
		satisfied = newSatisfied;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JexPackage.REQUIREMENT__SATISFIED, oldSatisfied, satisfied));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getTime() {
		return time;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTime(long newTime) {
		long oldTime = time;
		time = newTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JexPackage.REQUIREMENT__TIME, oldTime, time));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getMessages() {
		if (messages == null) {
			messages = new EDataTypeUniqueEList<String>(String.class, this, JexPackage.REQUIREMENT__MESSAGES);
		}
		return messages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JexPackage.REQUIREMENT__SATISFIED:
				return getSatisfied();
			case JexPackage.REQUIREMENT__TIME:
				return getTime();
			case JexPackage.REQUIREMENT__MESSAGES:
				return getMessages();
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
			case JexPackage.REQUIREMENT__SATISFIED:
				setSatisfied((Boolean)newValue);
				return;
			case JexPackage.REQUIREMENT__TIME:
				setTime((Long)newValue);
				return;
			case JexPackage.REQUIREMENT__MESSAGES:
				getMessages().clear();
				getMessages().addAll((Collection<? extends String>)newValue);
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
			case JexPackage.REQUIREMENT__SATISFIED:
				setSatisfied(SATISFIED_EDEFAULT);
				return;
			case JexPackage.REQUIREMENT__TIME:
				setTime(TIME_EDEFAULT);
				return;
			case JexPackage.REQUIREMENT__MESSAGES:
				getMessages().clear();
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
			case JexPackage.REQUIREMENT__SATISFIED:
				return SATISFIED_EDEFAULT == null ? satisfied != null : !SATISFIED_EDEFAULT.equals(satisfied);
			case JexPackage.REQUIREMENT__TIME:
				return time != TIME_EDEFAULT;
			case JexPackage.REQUIREMENT__MESSAGES:
				return messages != null && !messages.isEmpty();
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
		result.append(" (satisfied: ");
		result.append(satisfied);
		result.append(", time: ");
		result.append(time);
		result.append(", messages: ");
		result.append(messages);
		result.append(')');
		return result.toString();
	}

} //RequirementImpl
