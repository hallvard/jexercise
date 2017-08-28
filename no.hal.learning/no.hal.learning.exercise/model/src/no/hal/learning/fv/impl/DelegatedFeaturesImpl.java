/**
 */
package no.hal.learning.fv.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import no.hal.learning.fv.DelegatedFeatures;
import no.hal.learning.fv.FeatureList;
import no.hal.learning.fv.FeatureValued;
import no.hal.learning.fv.FvPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Delegated Features</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.hal.learning.fv.impl.DelegatedFeaturesImpl#getFeatures <em>Features</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DelegatedFeaturesImpl extends MinimalEObjectImpl.Container implements DelegatedFeatures {
	/**
	 * The cached value of the '{@link #getFeatures() <em>Features</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatures()
	 * @generated
	 * @ordered
	 */
	protected FeatureValued features;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DelegatedFeaturesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FvPackage.Literals.DELEGATED_FEATURES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureValued getFeatures() {
		return features;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFeatures(FeatureValued newFeatures, NotificationChain msgs) {
		FeatureValued oldFeatures = features;
		features = newFeatures;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FvPackage.DELEGATED_FEATURES__FEATURES, oldFeatures, newFeatures);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFeatures(FeatureValued newFeatures) {
		if (newFeatures != features) {
			NotificationChain msgs = null;
			if (features != null)
				msgs = ((InternalEObject)features).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FvPackage.DELEGATED_FEATURES__FEATURES, null, msgs);
			if (newFeatures != null)
				msgs = ((InternalEObject)newFeatures).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FvPackage.DELEGATED_FEATURES__FEATURES, null, msgs);
			msgs = basicSetFeatures(newFeatures, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FvPackage.DELEGATED_FEATURES__FEATURES, newFeatures, newFeatures));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<String> getFeatureNames() {
		return getFeatureNames(getFeatures());
	}
	public static EList<String> getFeatureNames(FeatureValued features) {
		return (features != null ? features.getFeatureNames() : ECollections.<String>emptyEList());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public double getFeatureValue(String featureName) {
		return getFeatureValue(getFeatures(), featureName);
	}
	public static double getFeatureValue(FeatureValued features, String featureName) {
		return features != null ? features.getFeatureValue(featureName) : 0.0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public boolean hasFeature(String featureName) {
		return hasFeature(getFeatures(), featureName);
	}
	public static boolean hasFeature(FeatureValued features, String featureName) {
		return features != null && features.hasFeature(featureName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public FeatureList toFeatureList() {
		return toFeatureList(getFeatures());
	}
	public static FeatureList toFeatureList(FeatureValued features) {
		return features != null ? features.toFeatureList() : FeatureListImpl.valueOf();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FvPackage.DELEGATED_FEATURES__FEATURES:
				return basicSetFeatures(null, msgs);
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
			case FvPackage.DELEGATED_FEATURES__FEATURES:
				return getFeatures();
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
			case FvPackage.DELEGATED_FEATURES__FEATURES:
				setFeatures((FeatureValued)newValue);
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
			case FvPackage.DELEGATED_FEATURES__FEATURES:
				setFeatures((FeatureValued)null);
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
			case FvPackage.DELEGATED_FEATURES__FEATURES:
				return features != null;
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
			case FvPackage.DELEGATED_FEATURES___GET_FEATURE_NAMES:
				return getFeatureNames();
			case FvPackage.DELEGATED_FEATURES___GET_FEATURE_VALUE__STRING:
				return getFeatureValue((String)arguments.get(0));
			case FvPackage.DELEGATED_FEATURES___HAS_FEATURE__STRING:
				return hasFeature((String)arguments.get(0));
			case FvPackage.DELEGATED_FEATURES___TO_FEATURE_LIST:
				return toFeatureList();
		}
		return super.eInvoke(operationID, arguments);
	}

} //DelegatedFeaturesImpl
