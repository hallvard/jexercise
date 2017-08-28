/**
 */
package no.hal.learning.fv.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import no.hal.learning.fv.FilteredFeatures1;
import no.hal.learning.fv.FvPackage;
import no.hal.learning.fv.Pred1Kind;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Filtered Features1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.hal.learning.fv.impl.FilteredFeatures1Impl#getPred <em>Pred</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FilteredFeatures1Impl extends FilteredFeaturesImpl implements FilteredFeatures1 {
	/**
	 * The default value of the '{@link #getPred() <em>Pred</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPred()
	 * @generated
	 * @ordered
	 */
	protected static final Pred1Kind PRED_EDEFAULT = Pred1Kind.GT0;

	/**
	 * The cached value of the '{@link #getPred() <em>Pred</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPred()
	 * @generated
	 * @ordered
	 */
	protected Pred1Kind pred = PRED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FilteredFeatures1Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FvPackage.Literals.FILTERED_FEATURES1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pred1Kind getPred() {
		return pred;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPred(Pred1Kind newPred) {
		Pred1Kind oldPred = pred;
		pred = newPred == null ? PRED_EDEFAULT : newPred;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FvPackage.FILTERED_FEATURES1__PRED, oldPred, pred));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FvPackage.FILTERED_FEATURES1__PRED:
				return getPred();
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
			case FvPackage.FILTERED_FEATURES1__PRED:
				setPred((Pred1Kind)newValue);
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
			case FvPackage.FILTERED_FEATURES1__PRED:
				setPred(PRED_EDEFAULT);
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
			case FvPackage.FILTERED_FEATURES1__PRED:
				return pred != PRED_EDEFAULT;
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
		result.append(')');
		return result.toString();
	}
	
	//

	@Override
	protected boolean acceptFeature(String featureName, double value) {
		return getPred().getPred1().test(value);
	}
} //FilteredFeatures1Impl
