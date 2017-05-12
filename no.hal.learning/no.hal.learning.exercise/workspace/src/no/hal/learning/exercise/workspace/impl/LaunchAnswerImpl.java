/**
 */
package no.hal.learning.exercise.workspace.impl;

import java.util.Collection;

import no.hal.learning.exercise.impl.TaskAnswerImpl;

import no.hal.learning.exercise.workspace.LaunchAnswer;
import no.hal.learning.exercise.workspace.WorkspacePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Launch Answer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.hal.learning.exercise.workspace.impl.LaunchAnswerImpl#getMode <em>Mode</em>}</li>
 *   <li>{@link no.hal.learning.exercise.workspace.impl.LaunchAnswerImpl#getLaunchAttrNames <em>Launch Attr Names</em>}</li>
 *   <li>{@link no.hal.learning.exercise.workspace.impl.LaunchAnswerImpl#getLaunchAttrValues <em>Launch Attr Values</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LaunchAnswerImpl extends TaskAnswerImpl implements LaunchAnswer {
	/**
	 * The default value of the '{@link #getMode() <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMode()
	 * @generated
	 * @ordered
	 */
	protected static final String MODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMode() <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMode()
	 * @generated
	 * @ordered
	 */
	protected String mode = MODE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLaunchAttrNames() <em>Launch Attr Names</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLaunchAttrNames()
	 * @generated
	 * @ordered
	 */
	protected EList<String> launchAttrNames;

	/**
	 * The cached value of the '{@link #getLaunchAttrValues() <em>Launch Attr Values</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLaunchAttrValues()
	 * @generated
	 * @ordered
	 */
	protected EList<String> launchAttrValues;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LaunchAnswerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WorkspacePackage.Literals.LAUNCH_ANSWER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMode() {
		return mode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMode(String newMode) {
		String oldMode = mode;
		mode = newMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkspacePackage.LAUNCH_ANSWER__MODE, oldMode, mode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getLaunchAttrNames() {
		if (launchAttrNames == null) {
			launchAttrNames = new EDataTypeUniqueEList<String>(String.class, this, WorkspacePackage.LAUNCH_ANSWER__LAUNCH_ATTR_NAMES);
		}
		return launchAttrNames;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getLaunchAttrValues() {
		if (launchAttrValues == null) {
			launchAttrValues = new EDataTypeUniqueEList<String>(String.class, this, WorkspacePackage.LAUNCH_ANSWER__LAUNCH_ATTR_VALUES);
		}
		return launchAttrValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WorkspacePackage.LAUNCH_ANSWER__MODE:
				return getMode();
			case WorkspacePackage.LAUNCH_ANSWER__LAUNCH_ATTR_NAMES:
				return getLaunchAttrNames();
			case WorkspacePackage.LAUNCH_ANSWER__LAUNCH_ATTR_VALUES:
				return getLaunchAttrValues();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case WorkspacePackage.LAUNCH_ANSWER__MODE:
				setMode((String)newValue);
				return;
			case WorkspacePackage.LAUNCH_ANSWER__LAUNCH_ATTR_NAMES:
				getLaunchAttrNames().clear();
				getLaunchAttrNames().addAll((Collection<? extends String>)newValue);
				return;
			case WorkspacePackage.LAUNCH_ANSWER__LAUNCH_ATTR_VALUES:
				getLaunchAttrValues().clear();
				getLaunchAttrValues().addAll((Collection<? extends String>)newValue);
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
			case WorkspacePackage.LAUNCH_ANSWER__MODE:
				setMode(MODE_EDEFAULT);
				return;
			case WorkspacePackage.LAUNCH_ANSWER__LAUNCH_ATTR_NAMES:
				getLaunchAttrNames().clear();
				return;
			case WorkspacePackage.LAUNCH_ANSWER__LAUNCH_ATTR_VALUES:
				getLaunchAttrValues().clear();
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
			case WorkspacePackage.LAUNCH_ANSWER__MODE:
				return MODE_EDEFAULT == null ? mode != null : !MODE_EDEFAULT.equals(mode);
			case WorkspacePackage.LAUNCH_ANSWER__LAUNCH_ATTR_NAMES:
				return launchAttrNames != null && !launchAttrNames.isEmpty();
			case WorkspacePackage.LAUNCH_ANSWER__LAUNCH_ATTR_VALUES:
				return launchAttrValues != null && !launchAttrValues.isEmpty();
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
		result.append(" (mode: ");
		result.append(mode);
		result.append(", launchAttrNames: ");
		result.append(launchAttrNames);
		result.append(", launchAttrValues: ");
		result.append(launchAttrValues);
		result.append(')');
		return result.toString();
	}

} //LaunchAnswerImpl
