/**
 */
package no.hal.learning.exercise.workspace.impl;

import no.hal.learning.exercise.workspace.*;

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
public class WorkspaceFactoryImpl extends EFactoryImpl implements WorkspaceFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static WorkspaceFactory init() {
		try {
			WorkspaceFactory theWorkspaceFactory = (WorkspaceFactory)EPackage.Registry.INSTANCE.getEFactory(WorkspacePackage.eNS_URI);
			if (theWorkspaceFactory != null) {
				return theWorkspaceFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new WorkspaceFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkspaceFactoryImpl() {
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
			case WorkspacePackage.SOURCE_FILE_EDIT_ANSWER: return createSourceFileEditAnswer();
			case WorkspacePackage.SOURCE_FILE_EDIT_PROPOSAL: return createSourceFileEditProposal();
			case WorkspacePackage.SOURCE_FILE_EDIT_EVENT: return createSourceFileEditEvent();
			case WorkspacePackage.LAUNCH_ANSWER: return createLaunchAnswer();
			case WorkspacePackage.LAUNCH_PROPOSAL: return createLaunchProposal();
			case WorkspacePackage.LAUNCH_EVENT: return createLaunchEvent();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SourceFileEditAnswer createSourceFileEditAnswer() {
		SourceFileEditAnswerImpl sourceFileEditAnswer = new SourceFileEditAnswerImpl();
		return sourceFileEditAnswer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SourceFileEditProposal createSourceFileEditProposal() {
		SourceFileEditProposalImpl sourceFileEditProposal = new SourceFileEditProposalImpl();
		return sourceFileEditProposal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SourceFileEditEvent createSourceFileEditEvent() {
		SourceFileEditEventImpl sourceFileEditEvent = new SourceFileEditEventImpl();
		return sourceFileEditEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LaunchAnswer createLaunchAnswer() {
		LaunchAnswerImpl launchAnswer = new LaunchAnswerImpl();
		return launchAnswer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <T extends LaunchAnswer> LaunchProposal<T> createLaunchProposal() {
		LaunchProposalImpl<T> launchProposal = new LaunchProposalImpl<T>();
		return launchProposal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LaunchEvent createLaunchEvent() {
		LaunchEventImpl launchEvent = new LaunchEventImpl();
		return launchEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkspacePackage getWorkspacePackage() {
		return (WorkspacePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static WorkspacePackage getPackage() {
		return WorkspacePackage.eINSTANCE;
	}

} //WorkspaceFactoryImpl
