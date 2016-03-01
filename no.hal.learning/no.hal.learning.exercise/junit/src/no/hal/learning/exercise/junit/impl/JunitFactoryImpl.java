/**
 */
package no.hal.learning.exercise.junit.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import no.hal.learning.exercise.junit.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class JunitFactoryImpl extends EFactoryImpl implements JunitFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static JunitFactory init() {
		try {
			JunitFactory theJunitFactory = (JunitFactory)EPackage.Registry.INSTANCE.getEFactory(JunitPackage.eNS_URI);
			if (theJunitFactory != null) {
				return theJunitFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new JunitFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JunitFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case JunitPackage.JUNIT_TEST_ANSWER: return createJunitTestAnswer();
			case JunitPackage.JUNIT_TEST_PROPOSAL: return createJunitTestProposal();
			case JunitPackage.JUNIT_TEST_EVENT: return createJunitTestEvent();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JunitTestAnswer createJunitTestAnswer() {
		JunitTestAnswerImpl junitTestAnswer = new JunitTestAnswerImpl();
		return junitTestAnswer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JunitTestProposal createJunitTestProposal() {
		JunitTestProposalImpl junitTestProposal = new JunitTestProposalImpl();
		return junitTestProposal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JunitTestEvent createJunitTestEvent() {
		JunitTestEventImpl junitTestEvent = new JunitTestEventImpl();
		return junitTestEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JunitPackage getJunitPackage() {
		return (JunitPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static JunitPackage getPackage() {
		return JunitPackage.eINSTANCE;
	}

} //JunitFactoryImpl
