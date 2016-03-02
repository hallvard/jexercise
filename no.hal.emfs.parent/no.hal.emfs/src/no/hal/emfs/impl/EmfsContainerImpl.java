/**
 */
package no.hal.emfs.impl;

import java.util.Collection;

import no.hal.emfs.EmfsContainer;
import no.hal.emfs.EmfsContainerContentProvider;
import no.hal.emfs.EmfsPackage;
import no.hal.emfs.EmfsResource;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.hal.emfs.impl.EmfsContainerImpl#getResources <em>Resources</em>}</li>
 *   <li>{@link no.hal.emfs.impl.EmfsContainerImpl#getContentProvider <em>Content Provider</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EmfsContainerImpl extends EmfsResourceImpl implements EmfsContainer {
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
	 * The cached value of the '{@link #getContentProvider() <em>Content Provider</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentProvider()
	 * @generated
	 * @ordered
	 */
	protected EmfsContainerContentProvider contentProvider;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EmfsContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmfsPackage.Literals.EMFS_CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EmfsResource> getResources() {
		if (resources == null) {
			resources = new EObjectContainmentWithInverseEList<EmfsResource>(EmfsResource.class, this, EmfsPackage.EMFS_CONTAINER__RESOURCES, EmfsPackage.EMFS_RESOURCE__CONTAINER);
		}
		return resources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmfsContainerContentProvider getContentProvider() {
		return contentProvider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContentProvider(EmfsContainerContentProvider newContentProvider, NotificationChain msgs) {
		EmfsContainerContentProvider oldContentProvider = contentProvider;
		contentProvider = newContentProvider;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EmfsPackage.EMFS_CONTAINER__CONTENT_PROVIDER, oldContentProvider, newContentProvider);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContentProvider(EmfsContainerContentProvider newContentProvider) {
		if (newContentProvider != contentProvider) {
			NotificationChain msgs = null;
			if (contentProvider != null)
				msgs = ((InternalEObject)contentProvider).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EmfsPackage.EMFS_CONTAINER__CONTENT_PROVIDER, null, msgs);
			if (newContentProvider != null)
				msgs = ((InternalEObject)newContentProvider).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EmfsPackage.EMFS_CONTAINER__CONTENT_PROVIDER, null, msgs);
			msgs = basicSetContentProvider(newContentProvider, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmfsPackage.EMFS_CONTAINER__CONTENT_PROVIDER, newContentProvider, newContentProvider));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EmfsPackage.EMFS_CONTAINER__RESOURCES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getResources()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EmfsPackage.EMFS_CONTAINER__RESOURCES:
				return ((InternalEList<?>)getResources()).basicRemove(otherEnd, msgs);
			case EmfsPackage.EMFS_CONTAINER__CONTENT_PROVIDER:
				return basicSetContentProvider(null, msgs);
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
			case EmfsPackage.EMFS_CONTAINER__RESOURCES:
				return getResources();
			case EmfsPackage.EMFS_CONTAINER__CONTENT_PROVIDER:
				return getContentProvider();
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
			case EmfsPackage.EMFS_CONTAINER__RESOURCES:
				getResources().clear();
				getResources().addAll((Collection<? extends EmfsResource>)newValue);
				return;
			case EmfsPackage.EMFS_CONTAINER__CONTENT_PROVIDER:
				setContentProvider((EmfsContainerContentProvider)newValue);
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
			case EmfsPackage.EMFS_CONTAINER__RESOURCES:
				getResources().clear();
				return;
			case EmfsPackage.EMFS_CONTAINER__CONTENT_PROVIDER:
				setContentProvider((EmfsContainerContentProvider)null);
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
			case EmfsPackage.EMFS_CONTAINER__RESOURCES:
				return resources != null && !resources.isEmpty();
			case EmfsPackage.EMFS_CONTAINER__CONTENT_PROVIDER:
				return contentProvider != null;
		}
		return super.eIsSet(featureID);
	}

} //EmfsContainerImpl
