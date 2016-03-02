/**
 */
package no.hal.emfs.sync.impl;

import java.util.Collection;

import no.hal.emfs.EmfsResource;

import no.hal.emfs.sync.PathRule;
import no.hal.emfs.sync.PortSpec;
import no.hal.emfs.sync.SyncPackage;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Port Spec</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.hal.emfs.sync.impl.PortSpecImpl#getRules <em>Rules</em>}</li>
 *   <li>{@link no.hal.emfs.sync.impl.PortSpecImpl#getResources <em>Resources</em>}</li>
 *   <li>{@link no.hal.emfs.sync.impl.PortSpecImpl#getResourceRefs <em>Resource Refs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PortSpecImpl<R extends PathRule<R>> extends MinimalEObjectImpl.Container implements PortSpec<R> {
	/**
	 * The cached value of the '{@link #getRules() <em>Rules</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRules()
	 * @generated
	 * @ordered
	 */
	protected EList<R> rules;

	/**
	 * The cached value of the '{@link #getResources() <em>Resources</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResources()
	 * @generated
	 * @ordered
	 */
	protected EList<EmfsResource> resources;

	/**
	 * The cached value of the '{@link #getResourceRefs() <em>Resource Refs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceRefs()
	 * @generated
	 * @ordered
	 */
	protected EList<EmfsResource> resourceRefs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PortSpecImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SyncPackage.Literals.PORT_SPEC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<R> getRules() {
		if (rules == null) {
			rules = new EObjectContainmentEList<R>(PathRule.class, this, SyncPackage.PORT_SPEC__RULES);
		}
		return rules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EmfsResource> getResources() {
		if (resources == null) {
			resources = new EObjectContainmentEList<EmfsResource>(EmfsResource.class, this, SyncPackage.PORT_SPEC__RESOURCES);
		}
		return resources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EmfsResource> getResourceRefs() {
		if (resourceRefs == null) {
			resourceRefs = new EObjectResolvingEList<EmfsResource>(EmfsResource.class, this, SyncPackage.PORT_SPEC__RESOURCE_REFS);
		}
		return resourceRefs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SyncPackage.PORT_SPEC__RULES:
				return ((InternalEList<?>)getRules()).basicRemove(otherEnd, msgs);
			case SyncPackage.PORT_SPEC__RESOURCES:
				return ((InternalEList<?>)getResources()).basicRemove(otherEnd, msgs);
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
			case SyncPackage.PORT_SPEC__RULES:
				return getRules();
			case SyncPackage.PORT_SPEC__RESOURCES:
				return getResources();
			case SyncPackage.PORT_SPEC__RESOURCE_REFS:
				return getResourceRefs();
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
			case SyncPackage.PORT_SPEC__RULES:
				getRules().clear();
				getRules().addAll((Collection<? extends R>)newValue);
				return;
			case SyncPackage.PORT_SPEC__RESOURCES:
				getResources().clear();
				getResources().addAll((Collection<? extends EmfsResource>)newValue);
				return;
			case SyncPackage.PORT_SPEC__RESOURCE_REFS:
				getResourceRefs().clear();
				getResourceRefs().addAll((Collection<? extends EmfsResource>)newValue);
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
			case SyncPackage.PORT_SPEC__RULES:
				getRules().clear();
				return;
			case SyncPackage.PORT_SPEC__RESOURCES:
				getResources().clear();
				return;
			case SyncPackage.PORT_SPEC__RESOURCE_REFS:
				getResourceRefs().clear();
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
			case SyncPackage.PORT_SPEC__RULES:
				return rules != null && !rules.isEmpty();
			case SyncPackage.PORT_SPEC__RESOURCES:
				return resources != null && !resources.isEmpty();
			case SyncPackage.PORT_SPEC__RESOURCE_REFS:
				return resourceRefs != null && !resourceRefs.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PortSpecImpl
