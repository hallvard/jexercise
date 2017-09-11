/**
 */
package no.hal.learning.fv.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import no.hal.learning.fv.DerivedFeatures1;
import no.hal.learning.fv.FeatureValued;
import no.hal.learning.fv.FvPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Derived Features1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.hal.learning.fv.impl.DerivedFeatures1Impl#getOther <em>Other</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DerivedFeatures1Impl extends OpDerivedFeaturesImpl implements DerivedFeatures1 {
	/**
	 * The cached value of the '{@link #getOther() <em>Other</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOther()
	 * @generated
	 * @ordered
	 */
	protected FeatureValued other;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DerivedFeatures1Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FvPackage.Literals.DERIVED_FEATURES1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureValued getOther() {
		if (other != null && other.eIsProxy()) {
			InternalEObject oldOther = (InternalEObject)other;
			other = (FeatureValued)eResolveProxy(oldOther);
			if (other != oldOther) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FvPackage.DERIVED_FEATURES1__OTHER, oldOther, other));
			}
		}
		return other;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureValued basicGetOther() {
		return other;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOther(FeatureValued newOther) {
		FeatureValued oldOther = other;
		other = newOther;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FvPackage.DERIVED_FEATURES1__OTHER, oldOther, other));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FvPackage.DERIVED_FEATURES1__OTHER:
				if (resolve) return getOther();
				return basicGetOther();
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
			case FvPackage.DERIVED_FEATURES1__OTHER:
				setOther((FeatureValued)newValue);
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
			case FvPackage.DERIVED_FEATURES1__OTHER:
				setOther((FeatureValued)null);
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
			case FvPackage.DERIVED_FEATURES1__OTHER:
				return other != null;
		}
		return super.eIsSet(featureID);
	}

	//

	@Override
	public EList<String> getFeatureNames() {
		return other.getFeatureNames();
	}	
	
	@Override
	public boolean hasFeature(String featureName) {
		return other.hasFeature(featureName);
	}

	@Override
	public double getFeatureValue(String featureName) {
		double val1 = other.getFeatureValue(featureName);
		double val2 = getVal();
		return deriveValue(val1, val2);
	}

} //DerivedFeatures1Impl
