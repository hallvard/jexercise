/**
 */
package no.hal.learning.exercise.impl;

import java.lang.reflect.InvocationTargetException;

import no.hal.learning.exercise.AbstractStringEdit;
import no.hal.learning.exercise.ExercisePackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract String Edit</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class AbstractStringEditImpl extends MinimalEObjectImpl.Container implements AbstractStringEdit {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractStringEditImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExercisePackage.Literals.ABSTRACT_STRING_EDIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getString() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
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
			case ExercisePackage.ABSTRACT_STRING_EDIT___GET_STRING:
				return getString();
		}
		return super.eInvoke(operationID, arguments);
	}

} //AbstractStringEditImpl
