/**
 */
package no.hal.learning.exercise.pydev.impl;

import no.hal.learning.exercise.pydev.PydevLaunchEvent;
import no.hal.learning.exercise.pydev.PydevPackage;

import no.hal.learning.exercise.workspace.impl.LaunchEventImpl;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Launch Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class PydevLaunchEventImpl extends LaunchEventImpl implements PydevLaunchEvent {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PydevLaunchEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PydevPackage.Literals.PYDEV_LAUNCH_EVENT;
	}

} //PydevLaunchEventImpl
