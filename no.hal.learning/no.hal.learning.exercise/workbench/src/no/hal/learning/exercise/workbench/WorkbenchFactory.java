/**
 */
package no.hal.learning.exercise.workbench;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see no.hal.learning.exercise.workbench.WorkbenchPackage
 * @generated
 */
public interface WorkbenchFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	WorkbenchFactory eINSTANCE = no.hal.learning.exercise.workbench.impl.WorkbenchFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Task Answer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Task Answer</em>'.
	 * @generated
	 */
	WorkbenchTaskAnswer createWorkbenchTaskAnswer();

	/**
	 * Returns a new object of class '<em>Task Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Task Event</em>'.
	 * @generated
	 */
	WorkbenchTaskEvent createWorkbenchTaskEvent();

	/**
	 * Returns a new object of class '<em>Part Task Answer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Part Task Answer</em>'.
	 * @generated
	 */
	PartTaskAnswer createPartTaskAnswer();

	/**
	 * Returns a new object of class '<em>Part Task Proposal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Part Task Proposal</em>'.
	 * @generated
	 */
	PartTaskProposal createPartTaskProposal();

	/**
	 * Returns a new object of class '<em>Part Task Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Part Task Event</em>'.
	 * @generated
	 */
	PartTaskEvent createPartTaskEvent();

	/**
	 * Returns a new object of class '<em>Perspective Task Answer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Perspective Task Answer</em>'.
	 * @generated
	 */
	PerspectiveTaskAnswer createPerspectiveTaskAnswer();

	/**
	 * Returns a new object of class '<em>Perspective Task Proposal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Perspective Task Proposal</em>'.
	 * @generated
	 */
	PerspectiveTaskProposal createPerspectiveTaskProposal();

	/**
	 * Returns a new object of class '<em>Command Execution Answer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Command Execution Answer</em>'.
	 * @generated
	 */
	CommandExecutionAnswer createCommandExecutionAnswer();

	/**
	 * Returns a new object of class '<em>Command Execution Proposal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Command Execution Proposal</em>'.
	 * @generated
	 */
	CommandExecutionProposal createCommandExecutionProposal();

	/**
	 * Returns a new object of class '<em>Debug Event Answer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Debug Event Answer</em>'.
	 * @generated
	 */
	DebugEventAnswer createDebugEventAnswer();

	/**
	 * Returns a new object of class '<em>Debug Event Proposal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Debug Event Proposal</em>'.
	 * @generated
	 */
	DebugEventProposal createDebugEventProposal();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	WorkbenchPackage getWorkbenchPackage();

} //WorkbenchFactory
