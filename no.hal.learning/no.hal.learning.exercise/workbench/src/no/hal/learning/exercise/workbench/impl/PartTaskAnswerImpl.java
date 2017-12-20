/**
 */
package no.hal.learning.exercise.workbench.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import no.hal.learning.exercise.Proposal;
import no.hal.learning.exercise.workbench.PartTaskAnswer;
import no.hal.learning.exercise.workbench.PartTaskProposal;
import no.hal.learning.exercise.workbench.WorkbenchFactory;
import no.hal.learning.exercise.workbench.WorkbenchPackage;
import org.eclipse.emf.common.notify.Notification;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Part Activation Answer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.hal.learning.exercise.workbench.impl.PartTaskAnswerImpl#getInputUri <em>Input Uri</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PartTaskAnswerImpl extends WorkbenchTaskAnswerImpl implements PartTaskAnswer {
	/**
	 * The default value of the '{@link #getInputUri() <em>Input Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputUri()
	 * @generated
	 * @ordered
	 */
	protected static final String INPUT_URI_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getInputUri() <em>Input Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputUri()
	 * @generated
	 * @ordered
	 */
	protected String inputUri = INPUT_URI_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PartTaskAnswerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WorkbenchPackage.Literals.PART_TASK_ANSWER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInputUri() {
		return inputUri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInputUri(String newInputUri) {
		String oldInputUri = inputUri;
		inputUri = newInputUri;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkbenchPackage.PART_TASK_ANSWER__INPUT_URI, oldInputUri, inputUri));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WorkbenchPackage.PART_TASK_ANSWER__INPUT_URI:
				return getInputUri();
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
			case WorkbenchPackage.PART_TASK_ANSWER__INPUT_URI:
				setInputUri((String)newValue);
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
			case WorkbenchPackage.PART_TASK_ANSWER__INPUT_URI:
				setInputUri(INPUT_URI_EDEFAULT);
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
			case WorkbenchPackage.PART_TASK_ANSWER__INPUT_URI:
				return INPUT_URI_EDEFAULT == null ? inputUri != null : !INPUT_URI_EDEFAULT.equals(inputUri);
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
		result.append(" (inputUri: ");
		result.append(inputUri);
		result.append(')');
		return result.toString();
	}

	//
	
	@Override
	public Proposal<?> createProposal() {
		PartTaskProposal proposal = WorkbenchFactory.eINSTANCE.createPartTaskProposal();
		proposal.setAnswer(this);
		return proposal;
	}

} //PartActivationAnswerImpl
