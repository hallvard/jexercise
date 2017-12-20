/**
 */
package no.hal.learning.exercise.pydev.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import no.hal.learning.exercise.Proposal;
import no.hal.learning.exercise.TaskEvent;
import no.hal.learning.exercise.pydev.PydevFactory;
import no.hal.learning.exercise.pydev.PydevLaunchAnswer;
import no.hal.learning.exercise.pydev.PydevLaunchEvent;
import no.hal.learning.exercise.pydev.PydevLaunchProposal;
import no.hal.learning.exercise.pydev.PydevPackage;
import no.hal.learning.exercise.util.Util;
import no.hal.learning.exercise.workspace.impl.LaunchAnswerImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Launch Answer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.hal.learning.exercise.pydev.impl.PydevLaunchAnswerImpl#getModuleName <em>Module Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PydevLaunchAnswerImpl extends LaunchAnswerImpl implements PydevLaunchAnswer {
	/**
	 * The default value of the '{@link #getModuleName() <em>Module Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModuleName()
	 * @generated
	 * @ordered
	 */
	protected static final String MODULE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getModuleName() <em>Module Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModuleName()
	 * @generated
	 * @ordered
	 */
	protected String moduleName = MODULE_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PydevLaunchAnswerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PydevPackage.Literals.PYDEV_LAUNCH_ANSWER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getModuleName() {
		return moduleName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModuleName(String newModuleName) {
		String oldModuleName = moduleName;
		moduleName = newModuleName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PydevPackage.PYDEV_LAUNCH_ANSWER__MODULE_NAME, oldModuleName, moduleName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PydevPackage.PYDEV_LAUNCH_ANSWER__MODULE_NAME:
				return getModuleName();
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
			case PydevPackage.PYDEV_LAUNCH_ANSWER__MODULE_NAME:
				setModuleName((String)newValue);
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
			case PydevPackage.PYDEV_LAUNCH_ANSWER__MODULE_NAME:
				setModuleName(MODULE_NAME_EDEFAULT);
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
			case PydevPackage.PYDEV_LAUNCH_ANSWER__MODULE_NAME:
				return MODULE_NAME_EDEFAULT == null ? moduleName != null : !MODULE_NAME_EDEFAULT.equals(moduleName);
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
		result.append(" (moduleName: ");
		result.append(moduleName);
		result.append(')');
		return result.toString();
	}
	
	//
	
	@Override
	public Proposal<?> createProposal() {
		PydevLaunchProposal proposal = PydevFactory.eINSTANCE.createPydevLaunchProposal();
		proposal.setAnswer(this);
		return proposal;
	}

	@Override
	public boolean acceptEvent(TaskEvent event) {
		if (! (super.acceptEvent(event) || (event instanceof PydevLaunchEvent))) {
			return false;
		}
		PydevLaunchEvent launchEvent = (PydevLaunchEvent) event;
		return Util.acceptQName(getModuleName(), launchEvent.getModuleName());
	}

} //PydevLaunchAnswerImpl
