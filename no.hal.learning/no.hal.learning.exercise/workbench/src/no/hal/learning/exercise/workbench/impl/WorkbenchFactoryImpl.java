/**
 */
package no.hal.learning.exercise.workbench.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import no.hal.learning.exercise.workbench.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class WorkbenchFactoryImpl extends EFactoryImpl implements WorkbenchFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static WorkbenchFactory init() {
		try {
			WorkbenchFactory theWorkbenchFactory = (WorkbenchFactory)EPackage.Registry.INSTANCE.getEFactory(WorkbenchPackage.eNS_URI);
			if (theWorkbenchFactory != null) {
				return theWorkbenchFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new WorkbenchFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkbenchFactoryImpl() {
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
			case WorkbenchPackage.WORKBENCH_TASK_ANSWER: return createWorkbenchTaskAnswer();
			case WorkbenchPackage.WORKBENCH_TASK_EVENT: return createWorkbenchTaskEvent();
			case WorkbenchPackage.PART_TASK_ANSWER: return createPartTaskAnswer();
			case WorkbenchPackage.PART_TASK_PROPOSAL: return createPartTaskProposal();
			case WorkbenchPackage.PART_TASK_EVENT: return createPartTaskEvent();
			case WorkbenchPackage.PERSPECTIVE_TASK_ANSWER: return createPerspectiveTaskAnswer();
			case WorkbenchPackage.PERSPECTIVE_TASK_PROPOSAL: return createPerspectiveTaskProposal();
			case WorkbenchPackage.COMMAND_EXECUTION_ANSWER: return createCommandExecutionAnswer();
			case WorkbenchPackage.COMMAND_EXECUTION_PROPOSAL: return createCommandExecutionProposal();
			case WorkbenchPackage.DEBUG_EVENT_ANSWER: return createDebugEventAnswer();
			case WorkbenchPackage.DEBUG_EVENT_PROPOSAL: return createDebugEventProposal();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkbenchTaskAnswer createWorkbenchTaskAnswer() {
		WorkbenchTaskAnswerImpl workbenchTaskAnswer = new WorkbenchTaskAnswerImpl();
		return workbenchTaskAnswer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkbenchTaskEvent createWorkbenchTaskEvent() {
		WorkbenchTaskEventImpl workbenchTaskEvent = new WorkbenchTaskEventImpl();
		return workbenchTaskEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PartTaskAnswer createPartTaskAnswer() {
		PartTaskAnswerImpl partTaskAnswer = new PartTaskAnswerImpl();
		return partTaskAnswer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PartTaskProposal createPartTaskProposal() {
		PartTaskProposalImpl partTaskProposal = new PartTaskProposalImpl();
		return partTaskProposal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PartTaskEvent createPartTaskEvent() {
		PartTaskEventImpl partTaskEvent = new PartTaskEventImpl();
		return partTaskEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerspectiveTaskAnswer createPerspectiveTaskAnswer() {
		PerspectiveTaskAnswerImpl perspectiveTaskAnswer = new PerspectiveTaskAnswerImpl();
		return perspectiveTaskAnswer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerspectiveTaskProposal createPerspectiveTaskProposal() {
		PerspectiveTaskProposalImpl perspectiveTaskProposal = new PerspectiveTaskProposalImpl();
		return perspectiveTaskProposal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommandExecutionAnswer createCommandExecutionAnswer() {
		CommandExecutionAnswerImpl commandExecutionAnswer = new CommandExecutionAnswerImpl();
		return commandExecutionAnswer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommandExecutionProposal createCommandExecutionProposal() {
		CommandExecutionProposalImpl commandExecutionProposal = new CommandExecutionProposalImpl();
		return commandExecutionProposal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DebugEventAnswer createDebugEventAnswer() {
		DebugEventAnswerImpl debugEventAnswer = new DebugEventAnswerImpl();
		return debugEventAnswer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DebugEventProposal createDebugEventProposal() {
		DebugEventProposalImpl debugEventProposal = new DebugEventProposalImpl();
		return debugEventProposal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkbenchPackage getWorkbenchPackage() {
		return (WorkbenchPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static WorkbenchPackage getPackage() {
		return WorkbenchPackage.eINSTANCE;
	}

} //WorkbenchFactoryImpl
