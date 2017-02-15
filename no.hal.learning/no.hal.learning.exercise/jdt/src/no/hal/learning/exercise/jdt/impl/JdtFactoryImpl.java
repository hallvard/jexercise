/**
 */
package no.hal.learning.exercise.jdt.impl;

import no.hal.learning.exercise.jdt.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class JdtFactoryImpl extends EFactoryImpl implements JdtFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static JdtFactory init() {
		try {
			JdtFactory theJdtFactory = (JdtFactory)EPackage.Registry.INSTANCE.getEFactory(JdtPackage.eNS_URI);
			if (theJdtFactory != null) {
				return theJdtFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new JdtFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JdtFactoryImpl() {
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
			case JdtPackage.JDT_SOURCE_EDIT_ANSWER: return createJdtSourceEditAnswer();
			case JdtPackage.JDT_SOURCE_EDIT_PROPOSAL: return createJdtSourceEditProposal();
			case JdtPackage.JDT_SOURCE_EDIT_EVENT: return createJdtSourceEditEvent();
			case JdtPackage.JDT_MARKER_INFO: return createJdtMarkerInfo();
			case JdtPackage.JDT_LAUNCH_ANSWER: return createJdtLaunchAnswer();
			case JdtPackage.JDT_LAUNCH_PROPOSAL: return createJdtLaunchProposal();
			case JdtPackage.JDT_LAUNCH_EVENT: return createJdtLaunchEvent();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JdtSourceEditAnswer createJdtSourceEditAnswer() {
		JdtSourceEditAnswerImpl jdtSourceEditAnswer = new JdtSourceEditAnswerImpl();
		return jdtSourceEditAnswer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JdtSourceEditProposal createJdtSourceEditProposal() {
		JdtSourceEditProposalImpl jdtSourceEditProposal = new JdtSourceEditProposalImpl();
		return jdtSourceEditProposal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JdtSourceEditEvent createJdtSourceEditEvent() {
		JdtSourceEditEventImpl jdtSourceEditEvent = new JdtSourceEditEventImpl();
		return jdtSourceEditEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JdtMarkerInfo createJdtMarkerInfo() {
		JdtMarkerInfoImpl jdtMarkerInfo = new JdtMarkerInfoImpl();
		return jdtMarkerInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JdtLaunchAnswer createJdtLaunchAnswer() {
		JdtLaunchAnswerImpl jdtLaunchAnswer = new JdtLaunchAnswerImpl();
		return jdtLaunchAnswer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JdtLaunchProposal createJdtLaunchProposal() {
		JdtLaunchProposalImpl jdtLaunchProposal = new JdtLaunchProposalImpl();
		return jdtLaunchProposal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JdtLaunchEvent createJdtLaunchEvent() {
		JdtLaunchEventImpl jdtLaunchEvent = new JdtLaunchEventImpl();
		return jdtLaunchEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JdtPackage getJdtPackage() {
		return (JdtPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static JdtPackage getPackage() {
		return JdtPackage.eINSTANCE;
	}

} //JdtFactoryImpl
