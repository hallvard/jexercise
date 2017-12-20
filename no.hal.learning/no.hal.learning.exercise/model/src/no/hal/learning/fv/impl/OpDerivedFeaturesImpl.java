/**
 */
package no.hal.learning.fv.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import no.hal.learning.fv.FvPackage;
import no.hal.learning.fv.Op1Kind;
import no.hal.learning.fv.Op2Kind;
import no.hal.learning.fv.OpDerivedFeatures;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Op Derived Features</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.hal.learning.fv.impl.OpDerivedFeaturesImpl#getOp <em>Op</em>}</li>
 *   <li>{@link no.hal.learning.fv.impl.OpDerivedFeaturesImpl#getVal <em>Val</em>}</li>
 *   <li>{@link no.hal.learning.fv.impl.OpDerivedFeaturesImpl#isSwap <em>Swap</em>}</li>
 *   <li>{@link no.hal.learning.fv.impl.OpDerivedFeaturesImpl#getOp1 <em>Op1</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class OpDerivedFeaturesImpl extends DerivedFeaturesImpl implements OpDerivedFeatures {
	/**
	 * The default value of the '{@link #getOp() <em>Op</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOp()
	 * @generated
	 * @ordered
	 */
	protected static final Op2Kind OP_EDEFAULT = Op2Kind.PLUS;

	/**
	 * The cached value of the '{@link #getOp() <em>Op</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOp()
	 * @generated
	 * @ordered
	 */
	protected Op2Kind op = OP_EDEFAULT;

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
	 * The default value of the '{@link #getOp1() <em>Op1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOp1()
	 * @generated
	 * @ordered
	 */
	protected static final Op1Kind OP1_EDEFAULT = Op1Kind.IDENTITY;

	/**
	 * The cached value of the '{@link #getOp1() <em>Op1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOp1()
	 * @generated
	 * @ordered
	 */
	protected Op1Kind op1 = OP1_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OpDerivedFeaturesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FvPackage.Literals.OP_DERIVED_FEATURES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Op2Kind getOp() {
		return op;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOp(Op2Kind newOp) {
		Op2Kind oldOp = op;
		op = newOp == null ? OP_EDEFAULT : newOp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FvPackage.OP_DERIVED_FEATURES__OP, oldOp, op));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FvPackage.OP_DERIVED_FEATURES__VAL, oldVal, val));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FvPackage.OP_DERIVED_FEATURES__SWAP, oldSwap, swap));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Op1Kind getOp1() {
		return op1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOp1(Op1Kind newOp1) {
		Op1Kind oldOp1 = op1;
		op1 = newOp1 == null ? OP1_EDEFAULT : newOp1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FvPackage.OP_DERIVED_FEATURES__OP1, oldOp1, op1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FvPackage.OP_DERIVED_FEATURES__OP:
				return getOp();
			case FvPackage.OP_DERIVED_FEATURES__VAL:
				return getVal();
			case FvPackage.OP_DERIVED_FEATURES__SWAP:
				return isSwap();
			case FvPackage.OP_DERIVED_FEATURES__OP1:
				return getOp1();
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
			case FvPackage.OP_DERIVED_FEATURES__OP:
				setOp((Op2Kind)newValue);
				return;
			case FvPackage.OP_DERIVED_FEATURES__VAL:
				setVal((Double)newValue);
				return;
			case FvPackage.OP_DERIVED_FEATURES__SWAP:
				setSwap((Boolean)newValue);
				return;
			case FvPackage.OP_DERIVED_FEATURES__OP1:
				setOp1((Op1Kind)newValue);
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
			case FvPackage.OP_DERIVED_FEATURES__OP:
				setOp(OP_EDEFAULT);
				return;
			case FvPackage.OP_DERIVED_FEATURES__VAL:
				setVal(VAL_EDEFAULT);
				return;
			case FvPackage.OP_DERIVED_FEATURES__SWAP:
				setSwap(SWAP_EDEFAULT);
				return;
			case FvPackage.OP_DERIVED_FEATURES__OP1:
				setOp1(OP1_EDEFAULT);
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
			case FvPackage.OP_DERIVED_FEATURES__OP:
				return op != OP_EDEFAULT;
			case FvPackage.OP_DERIVED_FEATURES__VAL:
				return val != VAL_EDEFAULT;
			case FvPackage.OP_DERIVED_FEATURES__SWAP:
				return swap != SWAP_EDEFAULT;
			case FvPackage.OP_DERIVED_FEATURES__OP1:
				return op1 != OP1_EDEFAULT;
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
		result.append(" (op: ");
		result.append(op);
		result.append(", val: ");
		result.append(val);
		result.append(", swap: ");
		result.append(swap);
		result.append(", op1: ");
		result.append(op1);
		result.append(')');
		return result.toString();
	}
	
	//
	
	protected double deriveValue(double val1, double val2) {
		return FeatureListImpl.apply(val1, getOp().getOp2(), val2, isSwap());
	}
	
	protected double deriveValue(double val) {
		return (getOp1() != null ? getOp1().getOp1().apply(val) : val);
	}
} //OpDerivedFeaturesImpl
