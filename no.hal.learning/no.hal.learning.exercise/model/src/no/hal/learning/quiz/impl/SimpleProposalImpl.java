/**
 */
package no.hal.learning.quiz.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import no.hal.learning.exercise.impl.ProposalImpl;
import no.hal.learning.quiz.QuizPackage;
import no.hal.learning.quiz.SimpleAnswer;
import no.hal.learning.quiz.SimpleProposal;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Simple Proposal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.hal.learning.quiz.impl.SimpleProposalImpl#getProposal <em>Proposal</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SimpleProposalImpl<A extends SimpleAnswer<?>> extends ProposalImpl<A> implements SimpleProposal<A> {
	/**
	 * The default value of the '{@link #getProposal() <em>Proposal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProposal()
	 * @generated
	 * @ordered
	 */
	protected static final Object PROPOSAL_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getProposal() <em>Proposal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProposal()
	 * @generated
	 * @ordered
	 */
	protected Object proposal = PROPOSAL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SimpleProposalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QuizPackage.Literals.SIMPLE_PROPOSAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific type known in this context.
	 * @generated
	 */
	@Override
	public void setAnswer(A newAnswer) {
		super.setAnswer(newAnswer);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getProposal() {
		return proposal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProposal(Object newProposal) {
		Object oldProposal = proposal;
		proposal = newProposal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QuizPackage.SIMPLE_PROPOSAL__PROPOSAL, oldProposal, proposal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QuizPackage.SIMPLE_PROPOSAL__PROPOSAL:
				return getProposal();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case QuizPackage.SIMPLE_PROPOSAL__PROPOSAL:
				setProposal(newValue);
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
			case QuizPackage.SIMPLE_PROPOSAL__PROPOSAL:
				setProposal(PROPOSAL_EDEFAULT);
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
			case QuizPackage.SIMPLE_PROPOSAL__PROPOSAL:
				return PROPOSAL_EDEFAULT == null ? proposal != null : !PROPOSAL_EDEFAULT.equals(proposal);
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
		result.append(" (proposal: ");
		result.append(proposal);
		result.append(')');
		return result.toString();
	}

} //SimpleProposalImpl
