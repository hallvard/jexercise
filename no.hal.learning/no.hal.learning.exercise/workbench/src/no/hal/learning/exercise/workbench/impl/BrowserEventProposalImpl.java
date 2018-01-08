/**
 */
package no.hal.learning.exercise.workbench.impl;

import no.hal.learning.exercise.impl.TaskProposalImpl;

import no.hal.learning.exercise.workbench.BrowserEventAnswer;
import no.hal.learning.exercise.workbench.BrowserEventProposal;
import no.hal.learning.exercise.workbench.WorkbenchPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Browser Event Proposal</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class BrowserEventProposalImpl extends TaskProposalImpl<BrowserEventAnswer> implements BrowserEventProposal {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BrowserEventProposalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WorkbenchPackage.Literals.BROWSER_EVENT_PROPOSAL;
	}

	//
	
	
	@Override
	public String getText() {
		String text = "Browser action " + getAnswer().getAction();
		String elementId = getAnswer().getElementId();
		if (elementId != null && elementId.length() > 0) {
			text += " for " + elementId;
		}
		return text;
	}

} //BrowserEventProposalImpl
