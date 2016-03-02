/**
 */
package no.hal.emfs.sync.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import no.hal.emfs.EmfsResource;
import no.hal.emfs.Property;
import no.hal.emfs.sync.PropertiesCondition;
import no.hal.emfs.sync.SyncPackage;
import no.hal.emfs.util.PropertyResolver;
import no.hal.emfs.util.Util;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Properties Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.hal.emfs.sync.impl.PropertiesConditionImpl#getIncludes <em>Includes</em>}</li>
 *   <li>{@link no.hal.emfs.sync.impl.PropertiesConditionImpl#getExcludes <em>Excludes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PropertiesConditionImpl extends MinimalEObjectImpl.Container implements PropertiesCondition {
	/**
	 * The cached value of the '{@link #getIncludes() <em>Includes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludes()
	 * @generated
	 * @ordered
	 */
	protected EList<Property> includes;

	/**
	 * The cached value of the '{@link #getExcludes() <em>Excludes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExcludes()
	 * @generated
	 * @ordered
	 */
	protected EList<Property> excludes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropertiesConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SyncPackage.Literals.PROPERTIES_CONDITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Property> getIncludes() {
		if (includes == null) {
			includes = new EObjectContainmentEList<Property>(Property.class, this, SyncPackage.PROPERTIES_CONDITION__INCLUDES);
		}
		return includes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Property> getExcludes() {
		if (excludes == null) {
			excludes = new EObjectContainmentEList<Property>(Property.class, this, SyncPackage.PROPERTIES_CONDITION__EXCLUDES);
		}
		return excludes;
	}

	private PropertyResolver propertyResolver = new PropertyResolver(false, false);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public boolean accept(EmfsResource resource) {
		for (Property exclude : getExcludes()) {
			if (Util.hasProperty(resource, exclude, propertyResolver)) {
				return false;
			}
		}
		for (Property include : getIncludes()) {
			if (! Util.hasProperty(resource, include, propertyResolver)) {
				return false;
			}
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SyncPackage.PROPERTIES_CONDITION__INCLUDES:
				return ((InternalEList<?>)getIncludes()).basicRemove(otherEnd, msgs);
			case SyncPackage.PROPERTIES_CONDITION__EXCLUDES:
				return ((InternalEList<?>)getExcludes()).basicRemove(otherEnd, msgs);
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
			case SyncPackage.PROPERTIES_CONDITION__INCLUDES:
				return getIncludes();
			case SyncPackage.PROPERTIES_CONDITION__EXCLUDES:
				return getExcludes();
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
			case SyncPackage.PROPERTIES_CONDITION__INCLUDES:
				getIncludes().clear();
				getIncludes().addAll((Collection<? extends Property>)newValue);
				return;
			case SyncPackage.PROPERTIES_CONDITION__EXCLUDES:
				getExcludes().clear();
				getExcludes().addAll((Collection<? extends Property>)newValue);
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
			case SyncPackage.PROPERTIES_CONDITION__INCLUDES:
				getIncludes().clear();
				return;
			case SyncPackage.PROPERTIES_CONDITION__EXCLUDES:
				getExcludes().clear();
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
			case SyncPackage.PROPERTIES_CONDITION__INCLUDES:
				return includes != null && !includes.isEmpty();
			case SyncPackage.PROPERTIES_CONDITION__EXCLUDES:
				return excludes != null && !excludes.isEmpty();
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
			case SyncPackage.PROPERTIES_CONDITION___ACCEPT__EMFSRESOURCE:
				return accept((EmfsResource)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //PropertiesConditionImpl
