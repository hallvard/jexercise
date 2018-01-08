/**
 */
package no.hal.learning.exercise.workbench.impl;

import no.hal.learning.exercise.Proposal;
import no.hal.learning.exercise.workbench.BrowserEventAnswer;
import no.hal.learning.exercise.workbench.BrowserEventProposal;
import no.hal.learning.exercise.workbench.DebugEventProposal;
import no.hal.learning.exercise.workbench.WorkbenchFactory;
import no.hal.learning.exercise.workbench.WorkbenchPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Browser Event Answer</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class BrowserEventAnswerImpl extends WorkbenchTaskAnswerImpl implements BrowserEventAnswer {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BrowserEventAnswerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WorkbenchPackage.Literals.BROWSER_EVENT_ANSWER;
	}
	
	//
	
	@Override
	public Proposal<?> createProposal() {
		BrowserEventProposal proposal = WorkbenchFactory.eINSTANCE.createBrowserEventProposal();
		proposal.setAnswer(this);
		return proposal;
	}

} //BrowserEventAnswerImpl
