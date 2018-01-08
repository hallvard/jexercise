/**
 */
package no.hal.learning.exercise.workbench.util;

import no.hal.learning.exercise.Answer;
import no.hal.learning.exercise.Proposal;
import no.hal.learning.exercise.TaskAnswer;
import no.hal.learning.exercise.TaskEvent;
import no.hal.learning.exercise.TaskProposal;
import no.hal.learning.exercise.workbench.*;

import no.hal.learning.fv.EFeatureObject;
import no.hal.learning.fv.FeatureValued;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see no.hal.learning.exercise.workbench.WorkbenchPackage
 * @generated
 */
public class WorkbenchSwitch<T1> extends Switch<T1> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static WorkbenchPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkbenchSwitch() {
		if (modelPackage == null) {
			modelPackage = WorkbenchPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T1 doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case WorkbenchPackage.WORKBENCH_TASK_ANSWER: {
				WorkbenchTaskAnswer workbenchTaskAnswer = (WorkbenchTaskAnswer)theEObject;
				T1 result = caseWorkbenchTaskAnswer(workbenchTaskAnswer);
				if (result == null) result = caseTaskAnswer(workbenchTaskAnswer);
				if (result == null) result = caseAnswer(workbenchTaskAnswer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WorkbenchPackage.WORKBENCH_TASK_EVENT: {
				WorkbenchTaskEvent workbenchTaskEvent = (WorkbenchTaskEvent)theEObject;
				T1 result = caseWorkbenchTaskEvent(workbenchTaskEvent);
				if (result == null) result = caseTaskEvent(workbenchTaskEvent);
				if (result == null) result = caseEFeatureObject(workbenchTaskEvent);
				if (result == null) result = caseFeatureValued(workbenchTaskEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WorkbenchPackage.PART_TASK_ANSWER: {
				PartTaskAnswer partTaskAnswer = (PartTaskAnswer)theEObject;
				T1 result = casePartTaskAnswer(partTaskAnswer);
				if (result == null) result = caseWorkbenchTaskAnswer(partTaskAnswer);
				if (result == null) result = caseTaskAnswer(partTaskAnswer);
				if (result == null) result = caseAnswer(partTaskAnswer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WorkbenchPackage.PART_TASK_PROPOSAL: {
				PartTaskProposal partTaskProposal = (PartTaskProposal)theEObject;
				T1 result = casePartTaskProposal(partTaskProposal);
				if (result == null) result = caseTaskProposal(partTaskProposal);
				if (result == null) result = caseProposal(partTaskProposal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WorkbenchPackage.PART_TASK_EVENT: {
				PartTaskEvent partTaskEvent = (PartTaskEvent)theEObject;
				T1 result = casePartTaskEvent(partTaskEvent);
				if (result == null) result = caseWorkbenchTaskEvent(partTaskEvent);
				if (result == null) result = caseTaskEvent(partTaskEvent);
				if (result == null) result = caseEFeatureObject(partTaskEvent);
				if (result == null) result = caseFeatureValued(partTaskEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WorkbenchPackage.PERSPECTIVE_TASK_ANSWER: {
				PerspectiveTaskAnswer perspectiveTaskAnswer = (PerspectiveTaskAnswer)theEObject;
				T1 result = casePerspectiveTaskAnswer(perspectiveTaskAnswer);
				if (result == null) result = caseWorkbenchTaskAnswer(perspectiveTaskAnswer);
				if (result == null) result = caseTaskAnswer(perspectiveTaskAnswer);
				if (result == null) result = caseAnswer(perspectiveTaskAnswer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WorkbenchPackage.PERSPECTIVE_TASK_PROPOSAL: {
				PerspectiveTaskProposal perspectiveTaskProposal = (PerspectiveTaskProposal)theEObject;
				T1 result = casePerspectiveTaskProposal(perspectiveTaskProposal);
				if (result == null) result = caseTaskProposal(perspectiveTaskProposal);
				if (result == null) result = caseProposal(perspectiveTaskProposal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WorkbenchPackage.COMMAND_EXECUTION_ANSWER: {
				CommandExecutionAnswer commandExecutionAnswer = (CommandExecutionAnswer)theEObject;
				T1 result = caseCommandExecutionAnswer(commandExecutionAnswer);
				if (result == null) result = caseWorkbenchTaskAnswer(commandExecutionAnswer);
				if (result == null) result = caseTaskAnswer(commandExecutionAnswer);
				if (result == null) result = caseAnswer(commandExecutionAnswer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WorkbenchPackage.COMMAND_EXECUTION_PROPOSAL: {
				CommandExecutionProposal commandExecutionProposal = (CommandExecutionProposal)theEObject;
				T1 result = caseCommandExecutionProposal(commandExecutionProposal);
				if (result == null) result = caseTaskProposal(commandExecutionProposal);
				if (result == null) result = caseProposal(commandExecutionProposal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WorkbenchPackage.DEBUG_EVENT_ANSWER: {
				DebugEventAnswer debugEventAnswer = (DebugEventAnswer)theEObject;
				T1 result = caseDebugEventAnswer(debugEventAnswer);
				if (result == null) result = caseWorkbenchTaskAnswer(debugEventAnswer);
				if (result == null) result = caseTaskAnswer(debugEventAnswer);
				if (result == null) result = caseAnswer(debugEventAnswer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WorkbenchPackage.DEBUG_EVENT_PROPOSAL: {
				DebugEventProposal debugEventProposal = (DebugEventProposal)theEObject;
				T1 result = caseDebugEventProposal(debugEventProposal);
				if (result == null) result = caseTaskProposal(debugEventProposal);
				if (result == null) result = caseProposal(debugEventProposal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WorkbenchPackage.BROWSER_EVENT_ANSWER: {
				BrowserEventAnswer browserEventAnswer = (BrowserEventAnswer)theEObject;
				T1 result = caseBrowserEventAnswer(browserEventAnswer);
				if (result == null) result = caseWorkbenchTaskAnswer(browserEventAnswer);
				if (result == null) result = caseTaskAnswer(browserEventAnswer);
				if (result == null) result = caseAnswer(browserEventAnswer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WorkbenchPackage.BROWSER_EVENT_PROPOSAL: {
				BrowserEventProposal browserEventProposal = (BrowserEventProposal)theEObject;
				T1 result = caseBrowserEventProposal(browserEventProposal);
				if (result == null) result = caseTaskProposal(browserEventProposal);
				if (result == null) result = caseProposal(browserEventProposal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Task Answer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task Answer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseWorkbenchTaskAnswer(WorkbenchTaskAnswer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Task Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseWorkbenchTaskEvent(WorkbenchTaskEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Part Task Answer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Part Task Answer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 casePartTaskAnswer(PartTaskAnswer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Part Task Proposal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Part Task Proposal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 casePartTaskProposal(PartTaskProposal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Part Task Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Part Task Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 casePartTaskEvent(PartTaskEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Perspective Task Answer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Perspective Task Answer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 casePerspectiveTaskAnswer(PerspectiveTaskAnswer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Perspective Task Proposal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Perspective Task Proposal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 casePerspectiveTaskProposal(PerspectiveTaskProposal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Command Execution Answer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Command Execution Answer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseCommandExecutionAnswer(CommandExecutionAnswer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Command Execution Proposal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Command Execution Proposal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseCommandExecutionProposal(CommandExecutionProposal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Debug Event Answer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Debug Event Answer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseDebugEventAnswer(DebugEventAnswer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Debug Event Proposal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Debug Event Proposal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseDebugEventProposal(DebugEventProposal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Browser Event Answer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Browser Event Answer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseBrowserEventAnswer(BrowserEventAnswer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Browser Event Proposal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Browser Event Proposal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseBrowserEventProposal(BrowserEventProposal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Answer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Answer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseAnswer(Answer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Task Answer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task Answer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseTaskAnswer(TaskAnswer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature Valued</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature Valued</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseFeatureValued(FeatureValued object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EFeature Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EFeature Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseEFeatureObject(EFeatureObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Task Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseTaskEvent(TaskEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Proposal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Proposal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <A extends Answer> T1 caseProposal(Proposal<A> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Task Proposal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task Proposal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T extends TaskAnswer> T1 caseTaskProposal(TaskProposal<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T1 defaultCase(EObject object) {
		return null;
	}

} //WorkbenchSwitch
