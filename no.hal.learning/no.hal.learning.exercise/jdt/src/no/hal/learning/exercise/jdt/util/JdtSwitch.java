/**
 */
package no.hal.learning.exercise.jdt.util;

import java.util.Map;
import no.hal.learning.exercise.AbstractStringEditEvent;
import no.hal.learning.exercise.Answer;
import no.hal.learning.exercise.MarkerInfo;
import no.hal.learning.exercise.Proposal;
import no.hal.learning.exercise.StringEditAnswer;
import no.hal.learning.exercise.StringEditTaskProposal;
import no.hal.learning.exercise.TaskAnswer;
import no.hal.learning.exercise.TaskEvent;
import no.hal.learning.exercise.TaskProposal;

import no.hal.learning.exercise.jdt.*;

import no.hal.learning.exercise.workspace.LaunchAnswer;
import no.hal.learning.exercise.workspace.LaunchEvent;
import no.hal.learning.exercise.workspace.LaunchProposal;
import no.hal.learning.exercise.workspace.SourceFileEditAnswer;
import no.hal.learning.exercise.workspace.SourceFileEditEvent;
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
 * @see no.hal.learning.exercise.jdt.JdtPackage
 * @generated
 */
public class JdtSwitch<T1> extends Switch<T1> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static JdtPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JdtSwitch() {
		if (modelPackage == null) {
			modelPackage = JdtPackage.eINSTANCE;
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
			case JdtPackage.JDT_SOURCE_EDIT_ANSWER: {
				JdtSourceEditAnswer jdtSourceEditAnswer = (JdtSourceEditAnswer)theEObject;
				T1 result = caseJdtSourceEditAnswer(jdtSourceEditAnswer);
				if (result == null) result = caseSourceFileEditAnswer(jdtSourceEditAnswer);
				if (result == null) result = caseStringEditAnswer(jdtSourceEditAnswer);
				if (result == null) result = caseTaskAnswer(jdtSourceEditAnswer);
				if (result == null) result = caseAnswer(jdtSourceEditAnswer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JdtPackage.JDT_SOURCE_EDIT_PROPOSAL: {
				JdtSourceEditProposal jdtSourceEditProposal = (JdtSourceEditProposal)theEObject;
				T1 result = caseJdtSourceEditProposal(jdtSourceEditProposal);
				if (result == null) result = caseStringEditTaskProposal(jdtSourceEditProposal);
				if (result == null) result = caseTaskProposal(jdtSourceEditProposal);
				if (result == null) result = caseProposal(jdtSourceEditProposal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JdtPackage.STRING_TO_FEATURE_VALUED: {
				@SuppressWarnings("unchecked") Map.Entry<String, FeatureValued> stringToFeatureValued = (Map.Entry<String, FeatureValued>)theEObject;
				T1 result = caseStringToFeatureValued(stringToFeatureValued);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JdtPackage.JDT_SOURCE_EDIT_EVENT: {
				JdtSourceEditEvent jdtSourceEditEvent = (JdtSourceEditEvent)theEObject;
				T1 result = caseJdtSourceEditEvent(jdtSourceEditEvent);
				if (result == null) result = caseSourceFileEditEvent(jdtSourceEditEvent);
				if (result == null) result = caseAbstractStringEditEvent(jdtSourceEditEvent);
				if (result == null) result = caseTaskEvent(jdtSourceEditEvent);
				if (result == null) result = caseEFeatureObject(jdtSourceEditEvent);
				if (result == null) result = caseFeatureValued(jdtSourceEditEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JdtPackage.JDT_MARKER_INFO: {
				JdtMarkerInfo jdtMarkerInfo = (JdtMarkerInfo)theEObject;
				T1 result = caseJdtMarkerInfo(jdtMarkerInfo);
				if (result == null) result = caseMarkerInfo(jdtMarkerInfo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JdtPackage.JDT_LAUNCH_ANSWER: {
				JdtLaunchAnswer jdtLaunchAnswer = (JdtLaunchAnswer)theEObject;
				T1 result = caseJdtLaunchAnswer(jdtLaunchAnswer);
				if (result == null) result = caseLaunchAnswer(jdtLaunchAnswer);
				if (result == null) result = caseTaskAnswer(jdtLaunchAnswer);
				if (result == null) result = caseAnswer(jdtLaunchAnswer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JdtPackage.JDT_LAUNCH_PROPOSAL: {
				JdtLaunchProposal jdtLaunchProposal = (JdtLaunchProposal)theEObject;
				T1 result = caseJdtLaunchProposal(jdtLaunchProposal);
				if (result == null) result = caseLaunchProposal(jdtLaunchProposal);
				if (result == null) result = caseTaskProposal(jdtLaunchProposal);
				if (result == null) result = caseProposal(jdtLaunchProposal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JdtPackage.JDT_LAUNCH_EVENT: {
				JdtLaunchEvent jdtLaunchEvent = (JdtLaunchEvent)theEObject;
				T1 result = caseJdtLaunchEvent(jdtLaunchEvent);
				if (result == null) result = caseLaunchEvent(jdtLaunchEvent);
				if (result == null) result = caseTaskEvent(jdtLaunchEvent);
				if (result == null) result = caseEFeatureObject(jdtLaunchEvent);
				if (result == null) result = caseFeatureValued(jdtLaunchEvent);
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
	public T1 caseJdtSourceEditAnswer(JdtSourceEditAnswer object) {
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
	public T1 caseJdtSourceEditProposal(JdtSourceEditProposal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String To Feature Valued</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String To Feature Valued</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseStringToFeatureValued(Map.Entry<String, FeatureValued> object) {
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
	public T1 caseJdtSourceEditEvent(JdtSourceEditEvent object) {
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
	public T1 caseJdtMarkerInfo(JdtMarkerInfo object) {
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
	public T1 caseJdtLaunchAnswer(JdtLaunchAnswer object) {
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
	public T1 caseJdtLaunchProposal(JdtLaunchProposal object) {
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
	public T1 caseJdtLaunchEvent(JdtLaunchEvent object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Source File Edit Answer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Source File Edit Answer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseSourceFileEditAnswer(SourceFileEditAnswer object) {
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

} //JdtSwitch
