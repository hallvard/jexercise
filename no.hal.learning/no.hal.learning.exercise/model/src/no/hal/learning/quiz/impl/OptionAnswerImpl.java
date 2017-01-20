/**
 */
package no.hal.learning.quiz.impl;

import org.eclipse.emf.ecore.EClass;
import no.hal.learning.exercise.impl.AnswerImpl;
import no.hal.learning.quiz.OptionAnswer;
import no.hal.learning.quiz.QuizPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Option Answer</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class OptionAnswerImpl extends AnswerImpl implements OptionAnswer {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OptionAnswerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QuizPackage.Literals.OPTION_ANSWER;
	}

} //OptionAnswerImpl
