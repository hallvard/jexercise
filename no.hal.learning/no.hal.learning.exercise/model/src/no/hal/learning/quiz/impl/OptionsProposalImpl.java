/**
 */
package no.hal.learning.quiz.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import no.hal.learning.exercise.impl.ProposalImpl;
import no.hal.learning.quiz.OptionsAnswer;
import no.hal.learning.quiz.OptionsProposal;
import no.hal.learning.quiz.QuizPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Options Proposal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.hal.learning.quiz.impl.OptionsProposalImpl#getIndices <em>Indices</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OptionsProposalImpl extends ProposalImpl<OptionsAnswer> implements OptionsProposal {
	/**
	 * The cached value of the '{@link #getIndices() <em>Indices</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndices()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> indices;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OptionsProposalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QuizPackage.Literals.OPTIONS_PROPOSAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific type known in this context.
	 * @generated
	 */
	@Override
	public void setAnswer(OptionsAnswer newAnswer) {
		super.setAnswer(newAnswer);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getIndices() {
		if (indices == null) {
			indices = new EDataTypeUniqueEList<Integer>(Integer.class, this, QuizPackage.OPTIONS_PROPOSAL__INDICES);
		}
		return indices;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QuizPackage.OPTIONS_PROPOSAL__INDICES:
				return getIndices();
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
			case QuizPackage.OPTIONS_PROPOSAL__INDICES:
				getIndices().clear();
				getIndices().addAll((Collection<? extends Integer>)newValue);
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
			case QuizPackage.OPTIONS_PROPOSAL__INDICES:
				getIndices().clear();
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
			case QuizPackage.OPTIONS_PROPOSAL__INDICES:
				return indices != null && !indices.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (indices: ");
		result.append(indices);
		result.append(')');
		return result.toString();
	}
	
	//
	
	@Override
	public Object getProposal() {
		return getIndices();
	}

} //OptionsProposalImpl
