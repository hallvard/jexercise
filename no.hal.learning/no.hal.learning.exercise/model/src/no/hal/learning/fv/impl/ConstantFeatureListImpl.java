/**
 */
package no.hal.learning.fv.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

import no.hal.learning.fv.ConstantFeatureList;
import no.hal.learning.fv.FeatureList;
import no.hal.learning.fv.FvPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Constant List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.hal.learning.fv.impl.ConstantFeatureListImpl#getFeatureNames <em>Feature Names</em>}</li>
 *   <li>{@link no.hal.learning.fv.impl.ConstantFeatureListImpl#getVal <em>Val</em>}</li>
 *   <li>{@link no.hal.learning.fv.impl.ConstantFeatureListImpl#getDefVal <em>Def Val</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConstantFeatureListImpl extends MinimalEObjectImpl.Container implements ConstantFeatureList {
	/**
	 * The cached value of the '{@link #getFeatureNames() <em>Feature Names</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureNames()
	 * @generated
	 * @ordered
	 */
	protected EList<String> featureNames;

	/**
	 * The default value of the '{@link #getVal() <em>Val</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVal()
	 * @generated
	 * @ordered
	 */
	protected static final double VAL_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getVal() <em>Val</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVal()
	 * @generated
	 * @ordered
	 */
	protected double val = VAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefVal() <em>Def Val</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefVal()
	 * @generated
	 * @ordered
	 */
	protected static final double DEF_VAL_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getDefVal() <em>Def Val</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefVal()
	 * @generated
	 * @ordered
	 */
	protected double defVal = DEF_VAL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConstantFeatureListImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FvPackage.Literals.CONSTANT_FEATURE_LIST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getFeatureNames() {
		if (featureNames == null) {
			featureNames = new EDataTypeUniqueEList<String>(String.class, this, FvPackage.CONSTANT_FEATURE_LIST__FEATURE_NAMES);
		}
		return featureNames;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getVal() {
		return val;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVal(double newVal) {
		double oldVal = val;
		val = newVal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FvPackage.CONSTANT_FEATURE_LIST__VAL, oldVal, val));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getDefVal() {
		return defVal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefVal(double newDefVal) {
		double oldDefVal = defVal;
		defVal = newDefVal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FvPackage.CONSTANT_FEATURE_LIST__DEF_VAL, oldDefVal, defVal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public double getFeatureValue(String featureName) {
		return hasFeature(featureName) ? getVal() : 0.0;
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
	 * @generated NOT
	 */
	@Override
	public FeatureList toFeatureList() {
		return FeatureListImpl.toFeatureList(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FvPackage.CONSTANT_FEATURE_LIST__FEATURE_NAMES:
				return getFeatureNames();
			case FvPackage.CONSTANT_FEATURE_LIST__VAL:
				return getVal();
			case FvPackage.CONSTANT_FEATURE_LIST__DEF_VAL:
				return getDefVal();
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
			case FvPackage.CONSTANT_FEATURE_LIST__FEATURE_NAMES:
				getFeatureNames().clear();
				getFeatureNames().addAll((Collection<? extends String>)newValue);
				return;
			case FvPackage.CONSTANT_FEATURE_LIST__VAL:
				setVal((Double)newValue);
				return;
			case FvPackage.CONSTANT_FEATURE_LIST__DEF_VAL:
				setDefVal((Double)newValue);
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
			case FvPackage.CONSTANT_FEATURE_LIST__FEATURE_NAMES:
				getFeatureNames().clear();
				return;
			case FvPackage.CONSTANT_FEATURE_LIST__VAL:
				setVal(VAL_EDEFAULT);
				return;
			case FvPackage.CONSTANT_FEATURE_LIST__DEF_VAL:
				setDefVal(DEF_VAL_EDEFAULT);
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
			case FvPackage.CONSTANT_FEATURE_LIST__FEATURE_NAMES:
				return featureNames != null && !featureNames.isEmpty();
			case FvPackage.CONSTANT_FEATURE_LIST__VAL:
				return val != VAL_EDEFAULT;
			case FvPackage.CONSTANT_FEATURE_LIST__DEF_VAL:
				return defVal != DEF_VAL_EDEFAULT;
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
			case FvPackage.CONSTANT_FEATURE_LIST___GET_FEATURE_VALUE__STRING:
				return getFeatureValue((String)arguments.get(0));
			case FvPackage.CONSTANT_FEATURE_LIST___HAS_FEATURE__STRING:
				return hasFeature((String)arguments.get(0));
			case FvPackage.CONSTANT_FEATURE_LIST___TO_FEATURE_LIST:
				return toFeatureList();
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();
		return FeatureListImpl.toString(this);
	}
} //ConstantListImpl
