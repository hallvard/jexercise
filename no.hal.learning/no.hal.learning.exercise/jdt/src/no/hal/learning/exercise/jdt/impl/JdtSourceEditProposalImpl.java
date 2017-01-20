/**
 */
package no.hal.learning.exercise.jdt.impl;

import no.hal.learning.exercise.impl.StringEditTaskProposalImpl;
import no.hal.learning.exercise.jdt.JdtSourceEditAnswer;
import no.hal.learning.exercise.jdt.JdtSourceEditProposal;
import no.hal.learning.exercise.jdt.JdtPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class Proposal</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class JdtSourceEditProposalImpl extends StringEditTaskProposalImpl<JdtSourceEditAnswer> implements JdtSourceEditProposal {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JdtSourceEditProposalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JdtPackage.Literals.JDT_SOURCE_EDIT_PROPOSAL;
	}

	//

	@Override
	public String getText() {
		return "Edited source of " + getAnswer().getClassName() + " class";
	}

} //JdtClassProposalImpl
