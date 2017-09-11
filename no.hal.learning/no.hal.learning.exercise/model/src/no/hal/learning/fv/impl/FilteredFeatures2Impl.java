/**
 */
package no.hal.learning.fv.impl;

import no.hal.learning.fv.FeatureValued;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import no.hal.learning.fv.FilteredFeatures2;
import no.hal.learning.fv.FvPackage;
import no.hal.learning.fv.Pred2Kind;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Filtered Features2</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.hal.learning.fv.impl.FilteredFeatures2Impl#getPred <em>Pred</em>}</li>
 *   <li>{@link no.hal.learning.fv.impl.FilteredFeatures2Impl#getVal <em>Val</em>}</li>
 *   <li>{@link no.hal.learning.fv.impl.FilteredFeatures2Impl#getValFeatures <em>Val Features</em>}</li>
 *   <li>{@link no.hal.learning.fv.impl.FilteredFeatures2Impl#isSwap <em>Swap</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FilteredFeatures2Impl extends FilteredFeaturesImpl implements FilteredFeatures2 {
	/**
	 * The default value of the '{@link #getPred() <em>Pred</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPred()
	 * @generated
	 * @ordered
	 */
	protected static final Pred2Kind PRED_EDEFAULT = Pred2Kind.EQ;

	/**
	 * The cached value of the '{@link #getPred() <em>Pred</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPred()
	 * @generated
	 * @ordered
	 */
	protected Pred2Kind pred = PRED_EDEFAULT;

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
	 * The cached value of the '{@link #getValFeatures() <em>Val Features</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValFeatures()
	 * @generated
	 * @ordered
	 */
	protected FeatureValued valFeatures;

	/**
	 * The default value of the '{@link #isSwap() <em>Swap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSwap()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SWAP_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSwap() <em>Swap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSwap()
	 * @generated
	 * @ordered
	 */
	protected boolean swap = SWAP_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FilteredFeatures2Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FvPackage.Literals.FILTERED_FEATURES2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pred2Kind getPred() {
		return pred;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPred(Pred2Kind newPred) {
		Pred2Kind oldPred = pred;
		pred = newPred == null ? PRED_EDEFAULT : newPred;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FvPackage.FILTERED_FEATURES2__PRED, oldPred, pred));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FvPackage.FILTERED_FEATURES2__VAL, oldVal, val));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureValued getValFeatures() {
		if (valFeatures != null && valFeatures.eIsProxy()) {
			InternalEObject oldValFeatures = (InternalEObject)valFeatures;
			valFeatures = (FeatureValued)eResolveProxy(oldValFeatures);
			if (valFeatures != oldValFeatures) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FvPackage.FILTERED_FEATURES2__VAL_FEATURES, oldValFeatures, valFeatures));
			}
		}
		return valFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureValued basicGetValFeatures() {
		return valFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValFeatures(FeatureValued newValFeatures) {
		FeatureValued oldValFeatures = valFeatures;
		valFeatures = newValFeatures;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FvPackage.FILTERED_FEATURES2__VAL_FEATURES, oldValFeatures, valFeatures));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSwap() {
		return swap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSwap(boolean newSwap) {
		boolean oldSwap = swap;
		swap = newSwap;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FvPackage.FILTERED_FEATURES2__SWAP, oldSwap, swap));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FvPackage.FILTERED_FEATURES2__PRED:
				return getPred();
			case FvPackage.FILTERED_FEATURES2__VAL:
				return getVal();
			case FvPackage.FILTERED_FEATURES2__VAL_FEATURES:
				if (resolve) return getValFeatures();
				return basicGetValFeatures();
			case FvPackage.FILTERED_FEATURES2__SWAP:
				return isSwap();
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
			case FvPackage.FILTERED_FEATURES2__PRED:
				setPred((Pred2Kind)newValue);
				return;
			case FvPackage.FILTERED_FEATURES2__VAL:
				setVal((Double)newValue);
				return;
			case FvPackage.FILTERED_FEATURES2__VAL_FEATURES:
				setValFeatures((FeatureValued)newValue);
				return;
			case FvPackage.FILTERED_FEATURES2__SWAP:
				setSwap((Boolean)newValue);
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
			case FvPackage.FILTERED_FEATURES2__PRED:
				setPred(PRED_EDEFAULT);
				return;
			case FvPackage.FILTERED_FEATURES2__VAL:
				setVal(VAL_EDEFAULT);
				return;
			case FvPackage.FILTERED_FEATURES2__VAL_FEATURES:
				setValFeatures((FeatureValued)null);
				return;
			case FvPackage.FILTERED_FEATURES2__SWAP:
				setSwap(SWAP_EDEFAULT);
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
			case FvPackage.FILTERED_FEATURES2__PRED:
				return pred != PRED_EDEFAULT;
			case FvPackage.FILTERED_FEATURES2__VAL:
				return val != VAL_EDEFAULT;
			case FvPackage.FILTERED_FEATURES2__VAL_FEATURES:
				return valFeatures != null;
			case FvPackage.FILTERED_FEATURES2__SWAP:
				return swap != SWAP_EDEFAULT;
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
		result.append(" (pred: ");
		result.append(pred);
		result.append(", val: ");
		result.append(val);
		result.append(", swap: ");
		result.append(swap);
		result.append(')');
		return result.toString();
	}
	
	//

	@Override
	protected boolean acceptFeature(String featureName, double value) {
		double val1 = value;
		FeatureValued features2 = getValFeatures();
		double val2 = (features2 != null && features2.hasFeature(featureName) ? features2.getFeatureValue(featureName) : getVal());
		if (swap) {
			double val = val1;
			val1 = val2;
			val2 = val;
		}
		return getPred().getPred2().test(val1, val2);
	}
} //FilteredFeatures2Impl
