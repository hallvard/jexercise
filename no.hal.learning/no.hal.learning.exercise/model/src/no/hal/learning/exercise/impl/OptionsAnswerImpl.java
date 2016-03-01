/**
 */
package no.hal.learning.exercise.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import no.hal.learning.exercise.Option;
import no.hal.learning.exercise.OptionsAnswer;
import no.hal.learning.exercise.OptionsProposal;
import no.hal.learning.exercise.Proposal;
import no.hal.learning.exercise.ExerciseFactory;
import no.hal.learning.exercise.ExercisePackage;
import no.hal.learning.exercise.util.Util;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Options Answer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.hal.learning.exercise.impl.OptionsAnswerImpl#getOptions <em>Options</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OptionsAnswerImpl extends AnswerImpl implements OptionsAnswer {
	/**
	 * The cached value of the '{@link #getOptions() <em>Options</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptions()
	 * @generated
	 * @ordered
	 */
	protected EList<Option> options;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OptionsAnswerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExercisePackage.Literals.OPTIONS_ANSWER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Option> getOptions() {
		if (options == null) {
			options = new EObjectContainmentEList<Option>(Option.class, this, ExercisePackage.OPTIONS_ANSWER__OPTIONS);
		}
		return options;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ExercisePackage.OPTIONS_ANSWER__OPTIONS:
				return ((InternalEList<?>)getOptions()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ExercisePackage.OPTIONS_ANSWER__OPTIONS:
				return getOptions();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ExercisePackage.OPTIONS_ANSWER__OPTIONS:
				getOptions().clear();
				getOptions().addAll((Collection<? extends Option>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ExercisePackage.OPTIONS_ANSWER__OPTIONS:
				getOptions().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ExercisePackage.OPTIONS_ANSWER__OPTIONS:
				return options != null && !options.isEmpty();
		}
		return super.eIsSet(featureID);
	}
	
	//
	
	@Override
	public String validate(Object proposal) {
		int[] optionNums = Util.proposalOptions(this, proposal);
		return (optionNums != null ? null : "Illegal options format");
	}

	@Override
	public Double accept(Object proposal) {
		int[] optionNums = Util.proposalOptions(this, proposal);
		if (optionNums == null) {
			return accept(false);
		}
		int count = 0;
		for (Option option : options) {
			if (option.isCorrect()) {
				count++;
			}
		}
		if (count != optionNums.length) {
			return accept(false);
		}
		for (int i = 0; i < optionNums.length; i++) {
			if (! getOptions().get(optionNums[i]).isCorrect()) {
				return accept(false);
			}
		}
		return accept(true);
	}

	@Override
	public Proposal<?> createProposal() {
		OptionsProposal proposal = ExerciseFactory.eINSTANCE.createOptionsProposal();
		proposal.setAnswer(this);
		return proposal;
	}

} //OptionsAnswerImpl
