/**
 */
package no.hal.learning.exercise.jdt.impl;

import no.hal.learning.exercise.impl.MarkerInfoImpl;
import no.hal.learning.exercise.jdt.JdtPackage;
import no.hal.learning.exercise.jdt.JdtMarkerInfo;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Marker Info</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.hal.learning.exercise.jdt.impl.JdtMarkerInfoImpl#getProblemCategory <em>Problem Category</em>}</li>
 *   <li>{@link no.hal.learning.exercise.jdt.impl.JdtMarkerInfoImpl#getProblemType <em>Problem Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JdtMarkerInfoImpl extends MarkerInfoImpl implements JdtMarkerInfo {
	/**
	 * The default value of the '{@link #getProblemCategory() <em>Problem Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProblemCategory()
	 * @generated
	 * @ordered
	 */
	protected static final int PROBLEM_CATEGORY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getProblemCategory() <em>Problem Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProblemCategory()
	 * @generated
	 * @ordered
	 */
	protected int problemCategory = PROBLEM_CATEGORY_EDEFAULT;

	/**
	 * The default value of the '{@link #getProblemType() <em>Problem Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProblemType()
	 * @generated
	 * @ordered
	 */
	protected static final int PROBLEM_TYPE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getProblemType() <em>Problem Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProblemType()
	 * @generated
	 * @ordered
	 */
	protected int problemType = PROBLEM_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JdtMarkerInfoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JdtPackage.Literals.JDT_MARKER_INFO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getProblemCategory() {
		return problemCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProblemCategory(int newProblemCategory) {
		int oldProblemCategory = problemCategory;
		problemCategory = newProblemCategory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JdtPackage.JDT_MARKER_INFO__PROBLEM_CATEGORY, oldProblemCategory, problemCategory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getProblemType() {
		return problemType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProblemType(int newProblemType) {
		int oldProblemType = problemType;
		problemType = newProblemType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JdtPackage.JDT_MARKER_INFO__PROBLEM_TYPE, oldProblemType, problemType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JdtPackage.JDT_MARKER_INFO__PROBLEM_CATEGORY:
				return getProblemCategory();
			case JdtPackage.JDT_MARKER_INFO__PROBLEM_TYPE:
				return getProblemType();
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
			case JdtPackage.JDT_MARKER_INFO__PROBLEM_CATEGORY:
				setProblemCategory((Integer)newValue);
				return;
			case JdtPackage.JDT_MARKER_INFO__PROBLEM_TYPE:
				setProblemType((Integer)newValue);
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
			case JdtPackage.JDT_MARKER_INFO__PROBLEM_CATEGORY:
				setProblemCategory(PROBLEM_CATEGORY_EDEFAULT);
				return;
			case JdtPackage.JDT_MARKER_INFO__PROBLEM_TYPE:
				setProblemType(PROBLEM_TYPE_EDEFAULT);
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
			case JdtPackage.JDT_MARKER_INFO__PROBLEM_CATEGORY:
				return problemCategory != PROBLEM_CATEGORY_EDEFAULT;
			case JdtPackage.JDT_MARKER_INFO__PROBLEM_TYPE:
				return problemType != PROBLEM_TYPE_EDEFAULT;
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
		result.append(" (problemCategory: ");
		result.append(problemCategory);
		result.append(", problemType: ");
		result.append(problemType);
		result.append(')');
		return result.toString();
	}

} //MarkerInfoImpl
