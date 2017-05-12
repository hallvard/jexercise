/**
 */
package no.hal.learning.exercise.pydev.impl;

import no.hal.learning.exercise.impl.StringEditTaskProposalImpl;

import no.hal.learning.exercise.pydev.PydevPackage;
import no.hal.learning.exercise.pydev.PydevSourceEditAnswer;
import no.hal.learning.exercise.pydev.PydevSourceEditProposal;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Source Edit Proposal</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class PydevSourceEditProposalImpl extends StringEditTaskProposalImpl<PydevSourceEditAnswer> implements PydevSourceEditProposal {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PydevSourceEditProposalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PydevPackage.Literals.PYDEV_SOURCE_EDIT_PROPOSAL;
	}

	//

	@Override
	public String getText() {
		return "Edited source of " + getAnswer().getModuleName() + " module";
	}

} //PydevSourceEditProposalImpl
