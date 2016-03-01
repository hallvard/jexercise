/**
 */
package no.hal.learning.exercise.checkstyle.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import no.hal.learning.exercise.checkstyle.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CheckstyleFactoryImpl extends EFactoryImpl implements CheckstyleFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CheckstyleFactory init() {
		try {
			CheckstyleFactory theCheckstyleFactory = (CheckstyleFactory)EPackage.Registry.INSTANCE.getEFactory(CheckstylePackage.eNS_URI);
			if (theCheckstyleFactory != null) {
				return theCheckstyleFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CheckstyleFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CheckstyleFactoryImpl() {
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
			case CheckstylePackage.CHECKSTYLE_ANSWER: return createCheckstyleAnswer();
			case CheckstylePackage.CHECKSTYLE_PROPOSAL: return createCheckstyleProposal();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CheckstyleAnswer createCheckstyleAnswer() {
		CheckstyleAnswerImpl checkstyleAnswer = new CheckstyleAnswerImpl();
		return checkstyleAnswer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CheckstyleProposal createCheckstyleProposal() {
		CheckstyleProposalImpl checkstyleProposal = new CheckstyleProposalImpl();
		return checkstyleProposal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CheckstylePackage getCheckstylePackage() {
		return (CheckstylePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CheckstylePackage getPackage() {
		return CheckstylePackage.eINSTANCE;
	}

} //CheckstyleFactoryImpl
