/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package no.hal.jex.impl;

import java.util.Collection;

import no.hal.jex.JexPackage;
import no.hal.jex.Member;
import no.hal.jex.TestRunnable;
import no.hal.jex.TestSuite;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Test Suite</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link no.hal.jex.impl.TestSuiteImpl#getTestedElements <em>Tested Elements</em>}</li>
 *   <li>{@link no.hal.jex.impl.TestSuiteImpl#getTestRuns <em>Test Runs</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TestSuiteImpl extends JavaClassImpl implements TestSuite {
	/**
	 * The cached value of the '{@link #getTestedElements() <em>Tested Elements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestedElements()
	 * @generated
	 * @ordered
	 */
	protected EList<Member> testedElements;

	/**
	 * The cached value of the '{@link #getTestRuns() <em>Test Runs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestRuns()
	 * @generated
	 * @ordered
	 */
	protected EList<TestRunnable> testRuns;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TestSuiteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JexPackage.Literals.TEST_SUITE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Member> getTestedElements() {
		if (testedElements == null) {
			testedElements = new EObjectResolvingEList<Member>(Member.class, this, JexPackage.TEST_SUITE__TESTED_ELEMENTS);
		}
		return testedElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TestRunnable> getTestRuns() {
		if (testRuns == null) {
			testRuns = new EObjectResolvingEList<TestRunnable>(TestRunnable.class, this, JexPackage.TEST_SUITE__TEST_RUNS);
		}
		return testRuns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JexPackage.TEST_SUITE__TESTED_ELEMENTS:
				return getTestedElements();
			case JexPackage.TEST_SUITE__TEST_RUNS:
				return getTestRuns();
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
			case JexPackage.TEST_SUITE__TESTED_ELEMENTS:
				getTestedElements().clear();
				getTestedElements().addAll((Collection<? extends Member>)newValue);
				return;
			case JexPackage.TEST_SUITE__TEST_RUNS:
				getTestRuns().clear();
				getTestRuns().addAll((Collection<? extends TestRunnable>)newValue);
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
			case JexPackage.TEST_SUITE__TESTED_ELEMENTS:
				getTestedElements().clear();
				return;
			case JexPackage.TEST_SUITE__TEST_RUNS:
				getTestRuns().clear();
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
			case JexPackage.TEST_SUITE__TESTED_ELEMENTS:
				return testedElements != null && !testedElements.isEmpty();
			case JexPackage.TEST_SUITE__TEST_RUNS:
				return testRuns != null && !testRuns.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == TestRunnable.class) {
			switch (derivedFeatureID) {
				case JexPackage.TEST_SUITE__TESTED_ELEMENTS: return JexPackage.TEST_RUNNABLE__TESTED_ELEMENTS;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == TestRunnable.class) {
			switch (baseFeatureID) {
				case JexPackage.TEST_RUNNABLE__TESTED_ELEMENTS: return JexPackage.TEST_SUITE__TESTED_ELEMENTS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //TestSuiteImpl