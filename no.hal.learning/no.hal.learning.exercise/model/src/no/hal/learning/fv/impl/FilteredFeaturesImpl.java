/**
 */
package no.hal.learning.fv.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import no.hal.learning.fv.FeatureValued;
import no.hal.learning.fv.FilteredFeatures;
import no.hal.learning.fv.FvPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Filtered Features</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.hal.learning.fv.impl.FilteredFeaturesImpl#getOther <em>Other</em>}</li>
 *   <li>{@link no.hal.learning.fv.impl.FilteredFeaturesImpl#getNameFilter <em>Name Filter</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class FilteredFeaturesImpl extends DerivedFeaturesImpl implements FilteredFeatures {
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
	 * The default value of the '{@link #getNameFilter() <em>Name Filter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameFilter()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_FILTER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNameFilter() <em>Name Filter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameFilter()
	 * @generated
	 * @ordered
	 */
	protected String nameFilter = NAME_FILTER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FilteredFeaturesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FvPackage.Literals.FILTERED_FEATURES;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FvPackage.FILTERED_FEATURES__OTHER, oldOther, other));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FvPackage.FILTERED_FEATURES__OTHER, oldOther, other));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNameFilter() {
		return nameFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNameFilter(String newNameFilter) {
		String oldNameFilter = nameFilter;
		nameFilter = newNameFilter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FvPackage.FILTERED_FEATURES__NAME_FILTER, oldNameFilter, nameFilter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FvPackage.FILTERED_FEATURES__OTHER:
				if (resolve) return getOther();
				return basicGetOther();
			case FvPackage.FILTERED_FEATURES__NAME_FILTER:
				return getNameFilter();
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
			case FvPackage.FILTERED_FEATURES__OTHER:
				setOther((FeatureValued)newValue);
				return;
			case FvPackage.FILTERED_FEATURES__NAME_FILTER:
				setNameFilter((String)newValue);
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
			case FvPackage.FILTERED_FEATURES__OTHER:
				setOther((FeatureValued)null);
				return;
			case FvPackage.FILTERED_FEATURES__NAME_FILTER:
				setNameFilter(NAME_FILTER_EDEFAULT);
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
			case FvPackage.FILTERED_FEATURES__OTHER:
				return other != null;
			case FvPackage.FILTERED_FEATURES__NAME_FILTER:
				return NAME_FILTER_EDEFAULT == null ? nameFilter != null : !NAME_FILTER_EDEFAULT.equals(nameFilter);
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
		result.append(" (nameFilter: ");
		result.append(nameFilter);
		result.append(')');
		return result.toString();
	}

	//
	
	protected abstract boolean acceptFeature(String featureName, double value);

	protected boolean acceptFeature(String featureName) {
		if (getNameFilter() != null && (! featureName.startsWith(getNameFilter()))) {
			return false;
		}
		return acceptFeature(featureName, getOther().getFeatureValue(featureName));
	}

	@Override
	public EList<String> getFeatureNames() {
		EList<String> featureNames = new BasicEList<String>();
		for (String featureName : getOther().getFeatureNames()) {
			if (hasFeature(featureName)) {
				featureNames.add(featureName);
			}
		}
		return featureNames;
	}

	@Override
	public boolean hasFeature(String featureName) {
		return getOther().hasFeature(featureName) && acceptFeature(featureName);
	}
	
	@Override
	public double getFeatureValue(String featureName) {
		return (hasFeature(featureName) ? getOther().getFeatureValue(featureName) : 0.0);
	}

} //FilteredFeaturesImpl
