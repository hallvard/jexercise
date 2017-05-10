/**
 */
package no.hal.learning.exercise.jdt.impl;

import org.eclipse.emf.ecore.EClass;

import no.hal.learning.exercise.jdt.JdtPackage;
import no.hal.learning.exercise.jdt.JdtSourceEditEvent;
import no.hal.learning.exercise.workspace.impl.SourceFileEditEventImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class JdtSourceEditEventImpl extends SourceFileEditEventImpl implements JdtSourceEditEvent {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JdtSourceEditEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JdtPackage.Literals.JDT_SOURCE_EDIT_EVENT;
	}

	//
	
	@Override
	public String getText() {
		return String.format("%s: %s lines with %s error(s), %s warning(s)", getTaskProposal().getText(), getSizeMeasure(), getErrorCount(), getWarningCount());
	}

} //JdtClassEventImpl
