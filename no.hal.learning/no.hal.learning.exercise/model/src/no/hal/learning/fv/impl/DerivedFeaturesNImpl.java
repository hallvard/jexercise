/**
 */
package no.hal.learning.fv.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import no.hal.learning.fv.DerivedFeaturesN;
import no.hal.learning.fv.FeatureValued;
import no.hal.learning.fv.FvPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dervived Features N</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.hal.learning.fv.impl.DerivedFeaturesNImpl#getOthers <em>Others</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DerivedFeaturesNImpl extends OpDerivedFeaturesImpl implements DerivedFeaturesN {
	/**
	 * The cached value of the '{@link #getOthers() <em>Others</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOthers()
	 * @generated
	 * @ordered
	 */
	protected EList<FeatureValued> others;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DerivedFeaturesNImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FvPackage.Literals.DERIVED_FEATURES_N;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FeatureValued> getOthers() {
		if (others == null) {
			others = new EObjectResolvingEList<FeatureValued>(FeatureValued.class, this, FvPackage.DERIVED_FEATURES_N__OTHERS);
		}
		return others;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FvPackage.DERIVED_FEATURES_N__OTHERS:
				return getOthers();
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
			case FvPackage.DERIVED_FEATURES_N__OTHERS:
				getOthers().clear();
				getOthers().addAll((Collection<? extends FeatureValued>)newValue);
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
			case FvPackage.DERIVED_FEATURES_N__OTHERS:
				getOthers().clear();
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
			case FvPackage.DERIVED_FEATURES_N__OTHERS:
				return others != null && !others.isEmpty();
		}
		return super.eIsSet(featureID);
	}
	
	//
	
	@Override
	public EList<String> getFeatureNames() {
		EList<String> featureNames = new BasicEList<String>();
		for (FeatureValued fv : getOthers()) {
			String name = null; // FeatureListImpl.getName(fv);
			for (String featureName : fv.getFeatureNames()) {
				if (! featureNames.contains(featureName)) {
					featureNames.add(name != null ? name + "." + featureName : featureName);
				}
			}
		}
		return featureNames;
	}
	
	@Override
	public boolean hasFeature(String featureName) {
		for (FeatureValued fv : getOthers()) {
			String name = FeatureListImpl.getName(fv);
			if (FeatureListImpl.hasFeature(fv, featureName, name)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public double getFeatureValue(String featureName) {
		boolean first = true;
		double val1 = getVal();
		for (FeatureValued featureValued : getOthers()) {
			double val2 = featureValued.hasFeature(featureName) ? featureValued.getFeatureValue(featureName) : 0.0;
			val1 = (first ? val2 : deriveValue(val1, val2));
			first = false;
		}
		for (FeatureValued featureValued : getContained()) {
			if (! getOthers().contains(featureValued)) {
				double val2 = featureValued.hasFeature(featureName) ? featureValued.getFeatureValue(featureName) : 0.0;
				val1 = (first ? val2 : deriveValue(val1, val2));
				first = false;
			}
		}
		return val1;
	}

} //DervivedFeaturesNImpl
