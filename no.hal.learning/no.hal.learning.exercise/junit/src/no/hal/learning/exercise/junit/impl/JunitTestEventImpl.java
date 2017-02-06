/**
 */
package no.hal.learning.exercise.junit.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import no.hal.learning.exercise.impl.TaskEventImpl;
import no.hal.learning.exercise.junit.JunitPackage;
import no.hal.learning.exercise.junit.JunitTestEvent;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Test Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.hal.learning.exercise.junit.impl.JunitTestEventImpl#getSuccessCount <em>Success Count</em>}</li>
 *   <li>{@link no.hal.learning.exercise.junit.impl.JunitTestEventImpl#getSuccessTests <em>Success Tests</em>}</li>
 *   <li>{@link no.hal.learning.exercise.junit.impl.JunitTestEventImpl#getFailureCount <em>Failure Count</em>}</li>
 *   <li>{@link no.hal.learning.exercise.junit.impl.JunitTestEventImpl#getFailureTests <em>Failure Tests</em>}</li>
 *   <li>{@link no.hal.learning.exercise.junit.impl.JunitTestEventImpl#getErrorCount <em>Error Count</em>}</li>
 *   <li>{@link no.hal.learning.exercise.junit.impl.JunitTestEventImpl#getErrorTests <em>Error Tests</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JunitTestEventImpl extends TaskEventImpl implements JunitTestEvent {
	/**
	 * The default value of the '{@link #getSuccessCount() <em>Success Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuccessCount()
	 * @generated
	 * @ordered
	 */
	protected static final int SUCCESS_COUNT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSuccessCount() <em>Success Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuccessCount()
	 * @generated
	 * @ordered
	 */
	protected int successCount = SUCCESS_COUNT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSuccessTests() <em>Success Tests</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuccessTests()
	 * @generated
	 * @ordered
	 */
	protected EList<String> successTests;

	/**
	 * The default value of the '{@link #getFailureCount() <em>Failure Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFailureCount()
	 * @generated
	 * @ordered
	 */
	protected static final int FAILURE_COUNT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getFailureCount() <em>Failure Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFailureCount()
	 * @generated
	 * @ordered
	 */
	protected int failureCount = FAILURE_COUNT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFailureTests() <em>Failure Tests</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFailureTests()
	 * @generated
	 * @ordered
	 */
	protected EList<String> failureTests;

	/**
	 * The default value of the '{@link #getErrorCount() <em>Error Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorCount()
	 * @generated
	 * @ordered
	 */
	protected static final int ERROR_COUNT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getErrorCount() <em>Error Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorCount()
	 * @generated
	 * @ordered
	 */
	protected int errorCount = ERROR_COUNT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getErrorTests() <em>Error Tests</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorTests()
	 * @generated
	 * @ordered
	 */
	protected EList<String> errorTests;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JunitTestEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JunitPackage.Literals.JUNIT_TEST_EVENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSuccessCount() {
		return successCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSuccessCount(int newSuccessCount) {
		int oldSuccessCount = successCount;
		successCount = newSuccessCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JunitPackage.JUNIT_TEST_EVENT__SUCCESS_COUNT, oldSuccessCount, successCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getSuccessTests() {
		if (successTests == null) {
			successTests = new EDataTypeUniqueEList<String>(String.class, this, JunitPackage.JUNIT_TEST_EVENT__SUCCESS_TESTS);
		}
		return successTests;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getFailureCount() {
		return failureCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFailureCount(int newFailureCount) {
		int oldFailureCount = failureCount;
		failureCount = newFailureCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JunitPackage.JUNIT_TEST_EVENT__FAILURE_COUNT, oldFailureCount, failureCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getFailureTests() {
		if (failureTests == null) {
			failureTests = new EDataTypeUniqueEList<String>(String.class, this, JunitPackage.JUNIT_TEST_EVENT__FAILURE_TESTS);
		}
		return failureTests;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getErrorCount() {
		return errorCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setErrorCount(int newErrorCount) {
		int oldErrorCount = errorCount;
		errorCount = newErrorCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JunitPackage.JUNIT_TEST_EVENT__ERROR_COUNT, oldErrorCount, errorCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getErrorTests() {
		if (errorTests == null) {
			errorTests = new EDataTypeUniqueEList<String>(String.class, this, JunitPackage.JUNIT_TEST_EVENT__ERROR_TESTS);
		}
		return errorTests;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JunitPackage.JUNIT_TEST_EVENT__SUCCESS_COUNT:
				return getSuccessCount();
			case JunitPackage.JUNIT_TEST_EVENT__SUCCESS_TESTS:
				return getSuccessTests();
			case JunitPackage.JUNIT_TEST_EVENT__FAILURE_COUNT:
				return getFailureCount();
			case JunitPackage.JUNIT_TEST_EVENT__FAILURE_TESTS:
				return getFailureTests();
			case JunitPackage.JUNIT_TEST_EVENT__ERROR_COUNT:
				return getErrorCount();
			case JunitPackage.JUNIT_TEST_EVENT__ERROR_TESTS:
				return getErrorTests();
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
			case JunitPackage.JUNIT_TEST_EVENT__SUCCESS_COUNT:
				setSuccessCount((Integer)newValue);
				return;
			case JunitPackage.JUNIT_TEST_EVENT__SUCCESS_TESTS:
				getSuccessTests().clear();
				getSuccessTests().addAll((Collection<? extends String>)newValue);
				return;
			case JunitPackage.JUNIT_TEST_EVENT__FAILURE_COUNT:
				setFailureCount((Integer)newValue);
				return;
			case JunitPackage.JUNIT_TEST_EVENT__FAILURE_TESTS:
				getFailureTests().clear();
				getFailureTests().addAll((Collection<? extends String>)newValue);
				return;
			case JunitPackage.JUNIT_TEST_EVENT__ERROR_COUNT:
				setErrorCount((Integer)newValue);
				return;
			case JunitPackage.JUNIT_TEST_EVENT__ERROR_TESTS:
				getErrorTests().clear();
				getErrorTests().addAll((Collection<? extends String>)newValue);
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
			case JunitPackage.JUNIT_TEST_EVENT__SUCCESS_COUNT:
				setSuccessCount(SUCCESS_COUNT_EDEFAULT);
				return;
			case JunitPackage.JUNIT_TEST_EVENT__SUCCESS_TESTS:
				getSuccessTests().clear();
				return;
			case JunitPackage.JUNIT_TEST_EVENT__FAILURE_COUNT:
				setFailureCount(FAILURE_COUNT_EDEFAULT);
				return;
			case JunitPackage.JUNIT_TEST_EVENT__FAILURE_TESTS:
				getFailureTests().clear();
				return;
			case JunitPackage.JUNIT_TEST_EVENT__ERROR_COUNT:
				setErrorCount(ERROR_COUNT_EDEFAULT);
				return;
			case JunitPackage.JUNIT_TEST_EVENT__ERROR_TESTS:
				getErrorTests().clear();
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
			case JunitPackage.JUNIT_TEST_EVENT__SUCCESS_COUNT:
				return successCount != SUCCESS_COUNT_EDEFAULT;
			case JunitPackage.JUNIT_TEST_EVENT__SUCCESS_TESTS:
				return successTests != null && !successTests.isEmpty();
			case JunitPackage.JUNIT_TEST_EVENT__FAILURE_COUNT:
				return failureCount != FAILURE_COUNT_EDEFAULT;
			case JunitPackage.JUNIT_TEST_EVENT__FAILURE_TESTS:
				return failureTests != null && !failureTests.isEmpty();
			case JunitPackage.JUNIT_TEST_EVENT__ERROR_COUNT:
				return errorCount != ERROR_COUNT_EDEFAULT;
			case JunitPackage.JUNIT_TEST_EVENT__ERROR_TESTS:
				return errorTests != null && !errorTests.isEmpty();
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
		result.append(" (successCount: ");
		result.append(successCount);
		result.append(", successTests: ");
		result.append(successTests);
		result.append(", failureCount: ");
		result.append(failureCount);
		result.append(", failureTests: ");
		result.append(failureTests);
		result.append(", errorCount: ");
		result.append(errorCount);
		result.append(", errorTests: ");
		result.append(errorTests);
		result.append(')');
		return result.toString();
	}

} //JunitTestEventImpl
