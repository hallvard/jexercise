/**
 */
package no.hal.learning.exercise.workspace.impl;

import no.hal.learning.exercise.impl.StringEditTaskProposalImpl;

import no.hal.learning.exercise.workspace.SourceFileEditAnswer;
import no.hal.learning.exercise.workspace.SourceFileEditProposal;
import no.hal.learning.exercise.workspace.WorkspacePackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Source File Edit Proposal</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class SourceFileEditProposalImpl extends StringEditTaskProposalImpl<SourceFileEditAnswer> implements SourceFileEditProposal {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SourceFileEditProposalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WorkspacePackage.Literals.SOURCE_FILE_EDIT_PROPOSAL;
	}

} //SourceFileEditProposalImpl
