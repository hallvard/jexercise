/**
 */
package no.hal.learning.sharing.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import no.hal.learning.sharing.ShareModel;
import no.hal.learning.sharing.SharingPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Share Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.hal.learning.sharing.impl.ShareModelImpl#getEObjects <em>EObjects</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ShareModelImpl extends AbstractShareImpl implements ShareModel {
	/**
	 * The cached value of the '{@link #getEObjects() <em>EObjects</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEObjects()
	 * @generated
	 * @ordered
	 */
	protected EList<EObject> eObjects;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ShareModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SharingPackage.Literals.SHARE_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getEObjects() {
		if (eObjects == null) {
			eObjects = new EObjectResolvingEList<EObject>(EObject.class, this, SharingPackage.SHARE_MODEL__EOBJECTS);
		}
		return eObjects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SharingPackage.SHARE_MODEL__EOBJECTS:
				return getEObjects();
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
			case SharingPackage.SHARE_MODEL__EOBJECTS:
				getEObjects().clear();
				getEObjects().addAll((Collection<? extends EObject>)newValue);
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
			case SharingPackage.SHARE_MODEL__EOBJECTS:
				getEObjects().clear();
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
			case SharingPackage.SHARE_MODEL__EOBJECTS:
				return eObjects != null && !eObjects.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ShareModelImpl
