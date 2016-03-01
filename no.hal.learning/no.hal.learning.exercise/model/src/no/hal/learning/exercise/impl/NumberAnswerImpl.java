/**
 */
package no.hal.learning.exercise.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import no.hal.learning.exercise.NumberAnswer;
import no.hal.learning.exercise.NumberRange;
import no.hal.learning.exercise.ExercisePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Number Answer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.hal.learning.exercise.impl.NumberAnswerImpl#getValue <em>Value</em>}</li>
 *   <li>{@link no.hal.learning.exercise.impl.NumberAnswerImpl#getErrorMargin <em>Error Margin</em>}</li>
 *   <li>{@link no.hal.learning.exercise.impl.NumberAnswerImpl#getRange <em>Range</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NumberAnswerImpl extends SimpleAnswerImpl<Double> implements NumberAnswer {
	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final Double VALUE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected Double value = VALUE_EDEFAULT;
	/**
	 * The default value of the '{@link #getErrorMargin() <em>Error Margin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorMargin()
	 * @generated
	 * @ordered
	 */
	protected static final double ERROR_MARGIN_EDEFAULT = 0.0;
	/**
	 * The cached value of the '{@link #getErrorMargin() <em>Error Margin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorMargin()
	 * @generated
	 * @ordered
	 */
	protected double errorMargin = ERROR_MARGIN_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRange() <em>Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRange()
	 * @generated
	 * @ordered
	 */
	protected NumberRange range;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NumberAnswerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExercisePackage.Literals.NUMBER_ANSWER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Double getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValue(Double newValue) {
		Double oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExercisePackage.NUMBER_ANSWER__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getErrorMargin() {
		return errorMargin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setErrorMargin(double newErrorMargin) {
		double oldErrorMargin = errorMargin;
		errorMargin = newErrorMargin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExercisePackage.NUMBER_ANSWER__ERROR_MARGIN, oldErrorMargin, errorMargin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NumberRange getRange() {
		return range;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRange(NumberRange newRange, NotificationChain msgs) {
		NumberRange oldRange = range;
		range = newRange;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExercisePackage.NUMBER_ANSWER__RANGE, oldRange, newRange);
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
	public void setRange(NumberRange newRange) {
		if (newRange != range) {
			NotificationChain msgs = null;
			if (range != null)
				msgs = ((InternalEObject)range).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExercisePackage.NUMBER_ANSWER__RANGE, null, msgs);
			if (newRange != null)
				msgs = ((InternalEObject)newRange).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExercisePackage.NUMBER_ANSWER__RANGE, null, msgs);
			msgs = basicSetRange(newRange, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExercisePackage.NUMBER_ANSWER__RANGE, newRange, newRange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ExercisePackage.NUMBER_ANSWER__RANGE:
				return basicSetRange(null, msgs);
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
			case ExercisePackage.NUMBER_ANSWER__VALUE:
				return getValue();
			case ExercisePackage.NUMBER_ANSWER__ERROR_MARGIN:
				return getErrorMargin();
			case ExercisePackage.NUMBER_ANSWER__RANGE:
				return getRange();
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
			case ExercisePackage.NUMBER_ANSWER__VALUE:
				setValue((Double)newValue);
				return;
			case ExercisePackage.NUMBER_ANSWER__ERROR_MARGIN:
				setErrorMargin((Double)newValue);
				return;
			case ExercisePackage.NUMBER_ANSWER__RANGE:
				setRange((NumberRange)newValue);
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
			case ExercisePackage.NUMBER_ANSWER__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case ExercisePackage.NUMBER_ANSWER__ERROR_MARGIN:
				setErrorMargin(ERROR_MARGIN_EDEFAULT);
				return;
			case ExercisePackage.NUMBER_ANSWER__RANGE:
				setRange((NumberRange)null);
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
			case ExercisePackage.NUMBER_ANSWER__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
			case ExercisePackage.NUMBER_ANSWER__ERROR_MARGIN:
				return errorMargin != ERROR_MARGIN_EDEFAULT;
			case ExercisePackage.NUMBER_ANSWER__RANGE:
				return range != null;
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
		result.append(" (value: ");
		result.append(value);
		result.append(", errorMargin: ");
		result.append(errorMargin);
		result.append(')');
		return result.toString();
	}

	//
	
	@Override
	public String validate(Object proposal) {
		try {
			double proposalValue = Double.valueOf(proposal.toString());
			if (range != null) {
				if (range.getMin() != null && proposalValue < range.getMin()) {
					return "The value must be >= " + range.getMin();
				}
				if (range.getMax() != null && proposalValue > range.getMax()) {
					return "The value must be <= " + range.getMax();
				}
				if (range.getStep() != null && range.getMin() != null) {
					double factor = (proposalValue - range.getMin()) / range.getStep();
					if (Math.round(factor) != factor) {
						return "The value must be a step value, i.e. " + range.getMin() + " + " + range.getStep() + " * n";
					}
				}
			}
		} catch (NumberFormatException e) {
			return "The value must be a valid number";
		}
		return null;
	}
	
	@Override
	public Double accept(Object proposal) {
		if (validate(proposal) != null) {
			return null;
		}
		double proposalValue = Double.valueOf(proposal.toString());
		return accept(proposalValue >= value - errorMargin && proposalValue <= value + errorMargin);
	}

} //NumberAnswerImpl
