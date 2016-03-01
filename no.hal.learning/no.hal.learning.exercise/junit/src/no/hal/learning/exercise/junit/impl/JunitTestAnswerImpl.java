/**
 */
package no.hal.learning.exercise.junit.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

import no.hal.learning.exercise.Proposal;
import no.hal.learning.exercise.impl.TaskAnswerImpl;
import no.hal.learning.exercise.junit.JunitFactory;
import no.hal.learning.exercise.junit.JunitPackage;
import no.hal.learning.exercise.junit.JunitTestAnswer;
import no.hal.learning.exercise.junit.JunitTestProposal;

import org.eclipse.emf.common.notify.Notification;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Test Answer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.hal.learning.exercise.junit.impl.JunitTestAnswerImpl#getTestRunName <em>Test Run Name</em>}</li>
 *   <li>{@link no.hal.learning.exercise.junit.impl.JunitTestAnswerImpl#getMethodNames <em>Method Names</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JunitTestAnswerImpl extends TaskAnswerImpl implements JunitTestAnswer {
	/**
	 * The default value of the '{@link #getTestRunName() <em>Test Run Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestRunName()
	 * @generated
	 * @ordered
	 */
	protected static final String TEST_RUN_NAME_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getTestRunName() <em>Test Run Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestRunName()
	 * @generated
	 * @ordered
	 */
	protected String testRunName = TEST_RUN_NAME_EDEFAULT;
	/**
	 * The cached value of the '{@link #getMethodNames() <em>Method Names</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethodNames()
	 * @generated
	 * @ordered
	 */
	protected EList<String> methodNames;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JunitTestAnswerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JunitPackage.Literals.JUNIT_TEST_ANSWER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTestRunName() {
		return testRunName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTestRunName(String newTestRunName) {
		String oldTestRunName = testRunName;
		testRunName = newTestRunName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JunitPackage.JUNIT_TEST_ANSWER__TEST_RUN_NAME, oldTestRunName, testRunName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getMethodNames() {
		if (methodNames == null) {
			methodNames = new EDataTypeUniqueEList<String>(String.class, this, JunitPackage.JUNIT_TEST_ANSWER__METHOD_NAMES);
		}
		return methodNames;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JunitPackage.JUNIT_TEST_ANSWER__TEST_RUN_NAME:
				return getTestRunName();
			case JunitPackage.JUNIT_TEST_ANSWER__METHOD_NAMES:
				return getMethodNames();
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
			case JunitPackage.JUNIT_TEST_ANSWER__TEST_RUN_NAME:
				setTestRunName((String)newValue);
				return;
			case JunitPackage.JUNIT_TEST_ANSWER__METHOD_NAMES:
				getMethodNames().clear();
				getMethodNames().addAll((Collection<? extends String>)newValue);
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
			case JunitPackage.JUNIT_TEST_ANSWER__TEST_RUN_NAME:
				setTestRunName(TEST_RUN_NAME_EDEFAULT);
				return;
			case JunitPackage.JUNIT_TEST_ANSWER__METHOD_NAMES:
				getMethodNames().clear();
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
			case JunitPackage.JUNIT_TEST_ANSWER__TEST_RUN_NAME:
				return TEST_RUN_NAME_EDEFAULT == null ? testRunName != null : !TEST_RUN_NAME_EDEFAULT.equals(testRunName);
			case JunitPackage.JUNIT_TEST_ANSWER__METHOD_NAMES:
				return methodNames != null && !methodNames.isEmpty();
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
		result.append(" (testRunName: ");
		result.append(testRunName);
		result.append(", methodNames: ");
		result.append(methodNames);
		result.append(')');
		return result.toString();
	}
	
	//

	@Override
	public Proposal<?> createProposal() {
		JunitTestProposal proposal = JunitFactory.eINSTANCE.createJunitTestProposal();
		proposal.setAnswer(this);
		return proposal;
	}

} //JunitTestAnswerImpl
