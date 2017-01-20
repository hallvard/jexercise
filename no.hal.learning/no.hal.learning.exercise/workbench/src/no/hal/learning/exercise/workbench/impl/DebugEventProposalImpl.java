/**
 */
package no.hal.learning.exercise.workbench.impl;

import no.hal.learning.exercise.impl.TaskProposalImpl;
import no.hal.learning.exercise.workbench.DebugEventAnswer;
import no.hal.learning.exercise.workbench.DebugEventProposal;
import no.hal.learning.exercise.workbench.WorkbenchPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Debug Event Proposal</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class DebugEventProposalImpl extends TaskProposalImpl<DebugEventAnswer> implements DebugEventProposal {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DebugEventProposalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WorkbenchPackage.Literals.DEBUG_EVENT_PROPOSAL;
	}

	//
	
	@Override
	public String getText() {
		String text = "Debug action " + getAnswer().getAction();
		String elementId = getAnswer().getElementId();
		if (elementId != null && elementId.length() > 0) {
			text += " for " + elementId;
		}
		return text;
	}

} //DebugEventProposalImpl
