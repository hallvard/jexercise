/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package no.hal.jex.impl;

import no.hal.jex.JUnitTest;
import no.hal.jex.JexPackage;
import no.hal.jex.TestRunnable;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.jdt.core.IJavaProject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>JUnit Test</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link no.hal.jex.impl.JUnitTestImpl#getTestRunnable <em>Test Runnable</em>}</li>
 *   <li>{@link no.hal.jex.impl.JUnitTestImpl#getPoints <em>Points</em>}</li>
 *   <li>{@link no.hal.jex.impl.JUnitTestImpl#getTestStatus <em>Test Status</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class JUnitTestImpl extends JavaRequirementImpl implements JUnitTest {
	/**
	 * The cached value of the '{@link #getTestRunnable() <em>Test Runnable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestRunnable()
	 * @generated
	 * @ordered
	 */
	protected TestRunnable testRunnable;

	/**
	 * The default value of the '{@link #getPoints() <em>Points</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPoints()
	 * @generated
	 * @ordered
	 */
	protected static final int POINTS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPoints() <em>Points</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPoints()
	 * @generated
	 * @ordered
	 */
	protected int points = POINTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getTestStatus() <em>Test Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestStatus()
	 * @generated
	 * @ordered
	 */
	protected static final int TEST_STATUS_EDEFAULT = -1;

	/**
	 * The cached value of the '{@link #getTestStatus() <em>Test Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestStatus()
	 * @generated
	 * @ordered
	 */
	protected int testStatus = TEST_STATUS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JUnitTestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JexPackage.Literals.JUNIT_TEST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestRunnable getTestRunnable() {
		if (testRunnable != null && testRunnable.eIsProxy()) {
			InternalEObject oldTestRunnable = (InternalEObject)testRunnable;
			testRunnable = (TestRunnable)eResolveProxy(oldTestRunnable);
			if (testRunnable != oldTestRunnable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, JexPackage.JUNIT_TEST__TEST_RUNNABLE, oldTestRunnable, testRunnable));
			}
		}
		return testRunnable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestRunnable basicGetTestRunnable() {
		return testRunnable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTestRunnable(TestRunnable newTestRunnable) {
		TestRunnable oldTestRunnable = testRunnable;
		testRunnable = newTestRunnable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JexPackage.JUNIT_TEST__TEST_RUNNABLE, oldTestRunnable, testRunnable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPoints() {
		return points;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPoints(int newPoints) {
		int oldPoints = points;
		points = newPoints;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JexPackage.JUNIT_TEST__POINTS, oldPoints, points));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTestStatus() {
		return testStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTestStatus(int newTestStatus) {
		int oldTestStatus = testStatus;
		testStatus = newTestStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JexPackage.JUNIT_TEST__TEST_STATUS, oldTestStatus, testStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JexPackage.JUNIT_TEST__TEST_RUNNABLE:
				if (resolve) return getTestRunnable();
				return basicGetTestRunnable();
			case JexPackage.JUNIT_TEST__POINTS:
				return getPoints();
			case JexPackage.JUNIT_TEST__TEST_STATUS:
				return getTestStatus();
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
			case JexPackage.JUNIT_TEST__TEST_RUNNABLE:
				setTestRunnable((TestRunnable)newValue);
				return;
			case JexPackage.JUNIT_TEST__POINTS:
				setPoints((Integer)newValue);
				return;
			case JexPackage.JUNIT_TEST__TEST_STATUS:
				setTestStatus((Integer)newValue);
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
			case JexPackage.JUNIT_TEST__TEST_RUNNABLE:
				setTestRunnable((TestRunnable)null);
				return;
			case JexPackage.JUNIT_TEST__POINTS:
				setPoints(POINTS_EDEFAULT);
				return;
			case JexPackage.JUNIT_TEST__TEST_STATUS:
				setTestStatus(TEST_STATUS_EDEFAULT);
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
			case JexPackage.JUNIT_TEST__TEST_RUNNABLE:
				return testRunnable != null;
			case JexPackage.JUNIT_TEST__POINTS:
				return points != POINTS_EDEFAULT;
			case JexPackage.JUNIT_TEST__TEST_STATUS:
				return testStatus != TEST_STATUS_EDEFAULT;
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
		result.append(" (points: ");
		result.append(points);
		result.append(", testStatus: ");
		result.append(testStatus);
		result.append(')');
		return result.toString();
	}

	//

	public Boolean validateRequirement(IJavaProject project) {
		Boolean result = super.validateRequirement(project);
		if (result != Boolean.TRUE) {
			return result;
		}
		return getSatisfied();
	}
} //JUnitTestImpl