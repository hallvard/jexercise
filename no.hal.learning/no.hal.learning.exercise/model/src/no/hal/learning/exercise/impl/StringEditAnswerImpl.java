/**
 */
package no.hal.learning.exercise.impl;

import java.lang.reflect.InvocationTargetException;
import no.hal.learning.exercise.ExercisePackage;
import no.hal.learning.exercise.StringEditAnswer;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>String Edit Answer</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class StringEditAnswerImpl extends TaskAnswerImpl implements StringEditAnswer {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StringEditAnswerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExercisePackage.Literals.STRING_EDIT_ANSWER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getEditorPath() {
		return "answer.txt";
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ExercisePackage.STRING_EDIT_ANSWER___GET_EDITOR_PATH:
				return getEditorPath();
		}
		return super.eInvoke(operationID, arguments);
	}

} //StringEditAnswerImpl
