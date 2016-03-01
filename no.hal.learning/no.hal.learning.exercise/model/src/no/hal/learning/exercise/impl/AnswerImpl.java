/**
 */
package no.hal.learning.exercise.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import no.hal.learning.exercise.Answer;
import no.hal.learning.exercise.Proposal;
import no.hal.learning.exercise.ExercisePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Answer</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class AnswerImpl extends MinimalEObjectImpl.Container implements Answer {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnswerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExercisePackage.Literals.ANSWER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Double accept(Object proposal) {
		String errorMessage = validate(proposal);
		if (errorMessage != null) {
			return null;
		}
		throw new UnsupportedOperationException();
	}

	protected Double accept(boolean result) {
		return (result ? 1.0 : 0.0);
	}

	protected Double accept(Boolean result) {
		return (result != null ? accept(result) : null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String validate(Object proposal) {
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Proposal<?> createProposal() {
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ExercisePackage.ANSWER___ACCEPT__OBJECT:
				return accept(arguments.get(0));
			case ExercisePackage.ANSWER___VALIDATE__OBJECT:
				return validate(arguments.get(0));
			case ExercisePackage.ANSWER___CREATE_PROPOSAL:
				return createProposal();
		}
		return super.eInvoke(operationID, arguments);
	}

} //AnswerImpl
