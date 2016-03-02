/**
 */
package no.hal.emfs.sync.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import no.hal.emfs.EmfsResource;
import no.hal.emfs.sync.CompositeResourceCondition;
import no.hal.emfs.sync.ResourceCondition;
import no.hal.emfs.sync.SyncPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>And Resource Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.hal.emfs.sync.impl.CompositeResourceConditionImpl#getConditions <em>Conditions</em>}</li>
 *   <li>{@link no.hal.emfs.sync.impl.CompositeResourceConditionImpl#isShortCircuitValue <em>Short Circuit Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CompositeResourceConditionImpl extends MinimalEObjectImpl.Container implements CompositeResourceCondition {
	/**
	 * The cached value of the '{@link #getConditions() <em>Conditions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditions()
	 * @generated
	 * @ordered
	 */
	protected EList<ResourceCondition> conditions;

	/**
	 * The default value of the '{@link #isShortCircuitValue() <em>Short Circuit Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isShortCircuitValue()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SHORT_CIRCUIT_VALUE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isShortCircuitValue() <em>Short Circuit Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isShortCircuitValue()
	 * @generated
	 * @ordered
	 */
	protected boolean shortCircuitValue = SHORT_CIRCUIT_VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompositeResourceConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SyncPackage.Literals.COMPOSITE_RESOURCE_CONDITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ResourceCondition> getConditions() {
		if (conditions == null) {
			conditions = new EObjectContainmentEList<ResourceCondition>(ResourceCondition.class, this, SyncPackage.COMPOSITE_RESOURCE_CONDITION__CONDITIONS);
		}
		return conditions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isShortCircuitValue() {
		return shortCircuitValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setShortCircuitValue(boolean newShortCircuitValue) {
		boolean oldShortCircuitValue = shortCircuitValue;
		shortCircuitValue = newShortCircuitValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SyncPackage.COMPOSITE_RESOURCE_CONDITION__SHORT_CIRCUIT_VALUE, oldShortCircuitValue, shortCircuitValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public boolean accept(EmfsResource resource) {
		for (ResourceCondition condition : getConditions()) {
			if (condition.accept(resource) == shortCircuitValue) {
				return shortCircuitValue;
			}
		}
		return ! shortCircuitValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SyncPackage.COMPOSITE_RESOURCE_CONDITION__CONDITIONS:
				return ((InternalEList<?>)getConditions()).basicRemove(otherEnd, msgs);
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
			case SyncPackage.COMPOSITE_RESOURCE_CONDITION__CONDITIONS:
				return getConditions();
			case SyncPackage.COMPOSITE_RESOURCE_CONDITION__SHORT_CIRCUIT_VALUE:
				return isShortCircuitValue();
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
			case SyncPackage.COMPOSITE_RESOURCE_CONDITION__CONDITIONS:
				getConditions().clear();
				getConditions().addAll((Collection<? extends ResourceCondition>)newValue);
				return;
			case SyncPackage.COMPOSITE_RESOURCE_CONDITION__SHORT_CIRCUIT_VALUE:
				setShortCircuitValue((Boolean)newValue);
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
			case SyncPackage.COMPOSITE_RESOURCE_CONDITION__CONDITIONS:
				getConditions().clear();
				return;
			case SyncPackage.COMPOSITE_RESOURCE_CONDITION__SHORT_CIRCUIT_VALUE:
				setShortCircuitValue(SHORT_CIRCUIT_VALUE_EDEFAULT);
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
			case SyncPackage.COMPOSITE_RESOURCE_CONDITION__CONDITIONS:
				return conditions != null && !conditions.isEmpty();
			case SyncPackage.COMPOSITE_RESOURCE_CONDITION__SHORT_CIRCUIT_VALUE:
				return shortCircuitValue != SHORT_CIRCUIT_VALUE_EDEFAULT;
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
			case SyncPackage.COMPOSITE_RESOURCE_CONDITION___ACCEPT__EMFSRESOURCE:
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
		result.append(" (shortCircuitValue: ");
		result.append(shortCircuitValue);
		result.append(')');
		return result.toString();
	}

} //AndResourceConditionImpl
