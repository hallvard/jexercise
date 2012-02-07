/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package no.hal.jex.impl;

import no.hal.jex.JavaMethodTester;
import no.hal.jex.JexPackage;
import no.hal.jex.Member;
import no.hal.jex.TestRunnable;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Java Method Tester</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link no.hal.jex.impl.JavaMethodTesterImpl#getTestedElement <em>Tested Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class JavaMethodTesterImpl extends JavaMethodImpl implements JavaMethodTester {
	/**
	 * The cached value of the '{@link #getTestedElement() <em>Tested Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestedElement()
	 * @generated
	 * @ordered
	 */
	protected Member testedElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JavaMethodTesterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JexPackage.Literals.JAVA_METHOD_TESTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Member getTestedElement() {
		if (testedElement != null && testedElement.eIsProxy()) {
			InternalEObject oldTestedElement = (InternalEObject)testedElement;
			testedElement = (Member)eResolveProxy(oldTestedElement);
			if (testedElement != oldTestedElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, JexPackage.JAVA_METHOD_TESTER__TESTED_ELEMENT, oldTestedElement, testedElement));
			}
		}
		return testedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Member basicGetTestedElement() {
		return testedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTestedElement(Member newTestedElement) {
		Member oldTestedElement = testedElement;
		testedElement = newTestedElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JexPackage.JAVA_METHOD_TESTER__TESTED_ELEMENT, oldTestedElement, testedElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @NOT generated
	 */
	public EList<TestRunnable> getTestRuns() {
		return ECollections.emptyEList();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JexPackage.JAVA_METHOD_TESTER__TESTED_ELEMENT:
				if (resolve) return getTestedElement();
				return basicGetTestedElement();
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
			case JexPackage.JAVA_METHOD_TESTER__TESTED_ELEMENT:
				setTestedElement((Member)newValue);
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
			case JexPackage.JAVA_METHOD_TESTER__TESTED_ELEMENT:
				setTestedElement((Member)null);
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
			case JexPackage.JAVA_METHOD_TESTER__TESTED_ELEMENT:
				return testedElement != null;
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
				case JexPackage.JAVA_METHOD_TESTER__TESTED_ELEMENT: return JexPackage.TEST_RUNNABLE__TESTED_ELEMENT;
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
				case JexPackage.TEST_RUNNABLE__TESTED_ELEMENT: return JexPackage.JAVA_METHOD_TESTER__TESTED_ELEMENT;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}
} //JavaMethodTesterImpl