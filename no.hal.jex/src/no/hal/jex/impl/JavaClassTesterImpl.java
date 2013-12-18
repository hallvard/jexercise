/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package no.hal.jex.impl;

import java.util.Collection;
import no.hal.jex.JavaClassTester;
import no.hal.jex.JavaMethodTester;
import no.hal.jex.JexPackage;
import no.hal.jex.Member;
import no.hal.jex.TestRunnable;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Java Class Tester</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link no.hal.jex.impl.JavaClassTesterImpl#getTestedElements <em>Tested Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class JavaClassTesterImpl extends JavaClassImpl implements JavaClassTester {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JavaClassTesterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JexPackage.Literals.JAVA_CLASS_TESTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Member> getTestedElements() {
		if (testedElements == null) {
			testedElements = new EObjectResolvingEList<Member>(Member.class, this, JexPackage.JAVA_CLASS_TESTER__TESTED_ELEMENTS);
		}
		return testedElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @NOT generated
	 */
	public EList<TestRunnable> getTestRuns() {
		BasicEList<TestRunnable> testRuns = new BasicEList<TestRunnable>();
		for (Member member : getMembers()) {
			if (member instanceof JavaMethodTester) {
				testRuns.add((JavaMethodTester) member);
			}
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
			case JexPackage.JAVA_CLASS_TESTER__TESTED_ELEMENTS:
				return getTestedElements();
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
			case JexPackage.JAVA_CLASS_TESTER__TESTED_ELEMENTS:
				getTestedElements().clear();
				getTestedElements().addAll((Collection<? extends Member>)newValue);
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
			case JexPackage.JAVA_CLASS_TESTER__TESTED_ELEMENTS:
				getTestedElements().clear();
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
			case JexPackage.JAVA_CLASS_TESTER__TESTED_ELEMENTS:
				return testedElements != null && !testedElements.isEmpty();
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
				case JexPackage.JAVA_CLASS_TESTER__TESTED_ELEMENTS: return JexPackage.TEST_RUNNABLE__TESTED_ELEMENTS;
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
				case JexPackage.TEST_RUNNABLE__TESTED_ELEMENTS: return JexPackage.JAVA_CLASS_TESTER__TESTED_ELEMENTS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}
} //JavaClassTesterImpl