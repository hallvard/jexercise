/**
 */
package no.hal.learning.fv.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import no.hal.learning.fv.DerivedFeatures;
import no.hal.learning.fv.FeatureList;
import no.hal.learning.fv.FeatureValued;
import no.hal.learning.fv.FvFactory;
import no.hal.learning.fv.FvPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Derived Features</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.hal.learning.fv.impl.DerivedFeaturesImpl#getContained <em>Contained</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class DerivedFeaturesImpl extends MinimalEObjectImpl.Container implements DerivedFeatures {
	/**
	 * The cached value of the '{@link #getContained() <em>Contained</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContained()
	 * @generated
	 * @ordered
	 */
	protected EList<FeatureValued> contained;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DerivedFeaturesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FvPackage.Literals.DERIVED_FEATURES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FeatureValued> getContained() {
		if (contained == null) {
			contained = new EObjectContainmentEList<FeatureValued>(FeatureValued.class, this, FvPackage.DERIVED_FEATURES__CONTAINED);
		}
		return contained;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public FeatureList toFeatureList() {
		FeatureList featureList = FvFactory.eINSTANCE.createFeatureList();
		featureList.set(this, true);
		return featureList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getFeatureNames() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getFeatureValue(String featureName) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public boolean hasFeature(String featureName) {
		return getFeatureNames().contains(featureName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FvPackage.DERIVED_FEATURES__CONTAINED:
				return ((InternalEList<?>)getContained()).basicRemove(otherEnd, msgs);
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
			case FvPackage.DERIVED_FEATURES__CONTAINED:
				return getContained();
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
			case FvPackage.DERIVED_FEATURES__CONTAINED:
				getContained().clear();
				getContained().addAll((Collection<? extends FeatureValued>)newValue);
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
			case FvPackage.DERIVED_FEATURES__CONTAINED:
				getContained().clear();
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
			case FvPackage.DERIVED_FEATURES__CONTAINED:
				return contained != null && !contained.isEmpty();
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
			case FvPackage.DERIVED_FEATURES___GET_FEATURE_NAMES:
				return getFeatureNames();
			case FvPackage.DERIVED_FEATURES___GET_FEATURE_VALUE__STRING:
				return getFeatureValue((String)arguments.get(0));
			case FvPackage.DERIVED_FEATURES___HAS_FEATURE__STRING:
				return hasFeature((String)arguments.get(0));
			case FvPackage.DERIVED_FEATURES___TO_FEATURE_LIST:
				return toFeatureList();
		}
		return super.eInvoke(operationID, arguments);
	}

	//

	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();
		return FeatureListImpl.toString(this);
	}
} //DerivedFeaturesImpl
