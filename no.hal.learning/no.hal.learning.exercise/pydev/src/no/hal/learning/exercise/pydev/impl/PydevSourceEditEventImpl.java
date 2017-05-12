/**
 */
package no.hal.learning.exercise.pydev.impl;

import no.hal.learning.exercise.pydev.PydevPackage;
import no.hal.learning.exercise.pydev.PydevSourceEditEvent;

import no.hal.learning.exercise.workspace.impl.SourceFileEditEventImpl;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Source Edit Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class PydevSourceEditEventImpl extends SourceFileEditEventImpl implements PydevSourceEditEvent {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PydevSourceEditEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PydevPackage.Literals.PYDEV_SOURCE_EDIT_EVENT;
	}

} //PydevSourceEditEventImpl
