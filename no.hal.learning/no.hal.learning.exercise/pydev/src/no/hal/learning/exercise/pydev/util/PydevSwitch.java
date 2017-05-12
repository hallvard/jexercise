/**
 */
package no.hal.learning.exercise.pydev.util;

import no.hal.learning.exercise.AbstractStringEditEvent;
import no.hal.learning.exercise.Answer;
import no.hal.learning.exercise.MarkerInfo;
import no.hal.learning.exercise.Proposal;
import no.hal.learning.exercise.StringEditAnswer;
import no.hal.learning.exercise.StringEditTaskProposal;
import no.hal.learning.exercise.TaskAnswer;
import no.hal.learning.exercise.TaskEvent;
import no.hal.learning.exercise.TaskProposal;

import no.hal.learning.exercise.pydev.*;

import no.hal.learning.exercise.workspace.LaunchAnswer;
import no.hal.learning.exercise.workspace.LaunchEvent;
import no.hal.learning.exercise.workspace.LaunchProposal;
import no.hal.learning.exercise.workspace.SourceFileEditEvent;

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
 * @see no.hal.learning.exercise.pydev.PydevPackage
 * @generated
 */
public class PydevSwitch<T1> extends Switch<T1> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PydevPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PydevSwitch() {
		if (modelPackage == null) {
			modelPackage = PydevPackage.eINSTANCE;
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
			case PydevPackage.PYDEV_SOURCE_EDIT_ANSWER: {
				PydevSourceEditAnswer pydevSourceEditAnswer = (PydevSourceEditAnswer)theEObject;
				T1 result = casePydevSourceEditAnswer(pydevSourceEditAnswer);
				if (result == null) result = caseStringEditAnswer(pydevSourceEditAnswer);
				if (result == null) result = caseTaskAnswer(pydevSourceEditAnswer);
				if (result == null) result = caseAnswer(pydevSourceEditAnswer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PydevPackage.PYDEV_SOURCE_EDIT_PROPOSAL: {
				PydevSourceEditProposal pydevSourceEditProposal = (PydevSourceEditProposal)theEObject;
				T1 result = casePydevSourceEditProposal(pydevSourceEditProposal);
				if (result == null) result = caseStringEditTaskProposal(pydevSourceEditProposal);
				if (result == null) result = caseTaskProposal(pydevSourceEditProposal);
				if (result == null) result = caseProposal(pydevSourceEditProposal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PydevPackage.PYDEV_SOURCE_EDIT_EVENT: {
				PydevSourceEditEvent pydevSourceEditEvent = (PydevSourceEditEvent)theEObject;
				T1 result = casePydevSourceEditEvent(pydevSourceEditEvent);
				if (result == null) result = caseSourceFileEditEvent(pydevSourceEditEvent);
				if (result == null) result = caseAbstractStringEditEvent(pydevSourceEditEvent);
				if (result == null) result = caseTaskEvent(pydevSourceEditEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PydevPackage.PYDEV_MARKER_INFO: {
				PydevMarkerInfo pydevMarkerInfo = (PydevMarkerInfo)theEObject;
				T1 result = casePydevMarkerInfo(pydevMarkerInfo);
				if (result == null) result = caseMarkerInfo(pydevMarkerInfo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PydevPackage.PYDEV_LAUNCH_ANSWER: {
				PydevLaunchAnswer pydevLaunchAnswer = (PydevLaunchAnswer)theEObject;
				T1 result = casePydevLaunchAnswer(pydevLaunchAnswer);
				if (result == null) result = caseLaunchAnswer(pydevLaunchAnswer);
				if (result == null) result = caseTaskAnswer(pydevLaunchAnswer);
				if (result == null) result = caseAnswer(pydevLaunchAnswer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PydevPackage.PYDEV_LAUNCH_PROPOSAL: {
				PydevLaunchProposal pydevLaunchProposal = (PydevLaunchProposal)theEObject;
				T1 result = casePydevLaunchProposal(pydevLaunchProposal);
				if (result == null) result = caseLaunchProposal(pydevLaunchProposal);
				if (result == null) result = caseTaskProposal(pydevLaunchProposal);
				if (result == null) result = caseProposal(pydevLaunchProposal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PydevPackage.PYDEV_LAUNCH_EVENT: {
				PydevLaunchEvent pydevLaunchEvent = (PydevLaunchEvent)theEObject;
				T1 result = casePydevLaunchEvent(pydevLaunchEvent);
				if (result == null) result = caseLaunchEvent(pydevLaunchEvent);
				if (result == null) result = caseTaskEvent(pydevLaunchEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Source Edit Answer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Source Edit Answer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 casePydevSourceEditAnswer(PydevSourceEditAnswer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Source Edit Proposal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Source Edit Proposal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 casePydevSourceEditProposal(PydevSourceEditProposal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Source Edit Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Source Edit Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 casePydevSourceEditEvent(PydevSourceEditEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Marker Info</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Marker Info</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 casePydevMarkerInfo(PydevMarkerInfo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Launch Answer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Launch Answer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 casePydevLaunchAnswer(PydevLaunchAnswer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Launch Proposal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Launch Proposal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 casePydevLaunchProposal(PydevLaunchProposal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Launch Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Launch Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 casePydevLaunchEvent(PydevLaunchEvent object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>String Edit Answer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Edit Answer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseStringEditAnswer(StringEditAnswer object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>String Edit Task Proposal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Edit Task Proposal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <A extends StringEditAnswer> T1 caseStringEditTaskProposal(StringEditTaskProposal<A> object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Abstract String Edit Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract String Edit Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseAbstractStringEditEvent(AbstractStringEditEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Source File Edit Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Source File Edit Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseSourceFileEditEvent(SourceFileEditEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Marker Info</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Marker Info</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseMarkerInfo(MarkerInfo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Launch Answer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Launch Answer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseLaunchAnswer(LaunchAnswer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Launch Proposal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Launch Proposal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T extends LaunchAnswer> T1 caseLaunchProposal(LaunchProposal<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Launch Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Launch Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseLaunchEvent(LaunchEvent object) {
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

} //PydevSwitch
