/**
 */
package no.hal.learning.exercise.workspace.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import no.hal.learning.exercise.impl.TaskEventImpl;
import no.hal.learning.exercise.util.Util;
import no.hal.learning.exercise.workspace.LaunchEvent;
import no.hal.learning.exercise.workspace.WorkspacePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Launch Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.hal.learning.exercise.workspace.impl.LaunchEventImpl#getMode <em>Mode</em>}</li>
 *   <li>{@link no.hal.learning.exercise.workspace.impl.LaunchEventImpl#getLaunchAttrNames <em>Launch Attr Names</em>}</li>
 *   <li>{@link no.hal.learning.exercise.workspace.impl.LaunchEventImpl#getLaunchAttrValues <em>Launch Attr Values</em>}</li>
 *   <li>{@link no.hal.learning.exercise.workspace.impl.LaunchEventImpl#getConsoleOutput <em>Console Output</em>}</li>
 *   <li>{@link no.hal.learning.exercise.workspace.impl.LaunchEventImpl#getConsoleOutputSizeMeasure <em>Console Output Size Measure</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LaunchEventImpl extends TaskEventImpl implements LaunchEvent {
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
	 * The cached value of the '{@link #getConsoleOutput() <em>Console Output</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsoleOutput()
	 * @generated
	 * @ordered
	 */
	protected EList<String> consoleOutput;

	/**
	 * The default value of the '{@link #getConsoleOutputSizeMeasure() <em>Console Output Size Measure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsoleOutputSizeMeasure()
	 * @generated
	 * @ordered
	 */
	protected static final int CONSOLE_OUTPUT_SIZE_MEASURE_EDEFAULT = 0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LaunchEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WorkspacePackage.Literals.LAUNCH_EVENT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, WorkspacePackage.LAUNCH_EVENT__MODE, oldMode, mode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getLaunchAttrNames() {
		if (launchAttrNames == null) {
			launchAttrNames = new EDataTypeUniqueEList<String>(String.class, this, WorkspacePackage.LAUNCH_EVENT__LAUNCH_ATTR_NAMES);
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
			launchAttrValues = new EDataTypeUniqueEList<String>(String.class, this, WorkspacePackage.LAUNCH_EVENT__LAUNCH_ATTR_VALUES);
		}
		return launchAttrValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getConsoleOutput() {
		if (consoleOutput == null) {
			consoleOutput = new EDataTypeUniqueEList<String>(String.class, this, WorkspacePackage.LAUNCH_EVENT__CONSOLE_OUTPUT);
		}
		return consoleOutput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public int getConsoleOutputSizeMeasure() {
		int size = 0;
		for (String s : getConsoleOutput()) {
			size += Util.countLines(s);
		}
		return size;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getAllConsoleOutput() {
		EList<String> consoleOutput2 = getConsoleOutput();
		if (consoleOutput2.isEmpty()) {
			return null;
		} else if (consoleOutput2.size() == 1) {
			return consoleOutput2.get(0);
		}
		StringBuilder buffer = new StringBuilder();
		for (String s : consoleOutput2) {
			buffer.append(s);
		}
		return buffer.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WorkspacePackage.LAUNCH_EVENT__MODE:
				return getMode();
			case WorkspacePackage.LAUNCH_EVENT__LAUNCH_ATTR_NAMES:
				return getLaunchAttrNames();
			case WorkspacePackage.LAUNCH_EVENT__LAUNCH_ATTR_VALUES:
				return getLaunchAttrValues();
			case WorkspacePackage.LAUNCH_EVENT__CONSOLE_OUTPUT:
				return getConsoleOutput();
			case WorkspacePackage.LAUNCH_EVENT__CONSOLE_OUTPUT_SIZE_MEASURE:
				return getConsoleOutputSizeMeasure();
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
			case WorkspacePackage.LAUNCH_EVENT__MODE:
				setMode((String)newValue);
				return;
			case WorkspacePackage.LAUNCH_EVENT__LAUNCH_ATTR_NAMES:
				getLaunchAttrNames().clear();
				getLaunchAttrNames().addAll((Collection<? extends String>)newValue);
				return;
			case WorkspacePackage.LAUNCH_EVENT__LAUNCH_ATTR_VALUES:
				getLaunchAttrValues().clear();
				getLaunchAttrValues().addAll((Collection<? extends String>)newValue);
				return;
			case WorkspacePackage.LAUNCH_EVENT__CONSOLE_OUTPUT:
				getConsoleOutput().clear();
				getConsoleOutput().addAll((Collection<? extends String>)newValue);
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
			case WorkspacePackage.LAUNCH_EVENT__MODE:
				setMode(MODE_EDEFAULT);
				return;
			case WorkspacePackage.LAUNCH_EVENT__LAUNCH_ATTR_NAMES:
				getLaunchAttrNames().clear();
				return;
			case WorkspacePackage.LAUNCH_EVENT__LAUNCH_ATTR_VALUES:
				getLaunchAttrValues().clear();
				return;
			case WorkspacePackage.LAUNCH_EVENT__CONSOLE_OUTPUT:
				getConsoleOutput().clear();
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
			case WorkspacePackage.LAUNCH_EVENT__MODE:
				return MODE_EDEFAULT == null ? mode != null : !MODE_EDEFAULT.equals(mode);
			case WorkspacePackage.LAUNCH_EVENT__LAUNCH_ATTR_NAMES:
				return launchAttrNames != null && !launchAttrNames.isEmpty();
			case WorkspacePackage.LAUNCH_EVENT__LAUNCH_ATTR_VALUES:
				return launchAttrValues != null && !launchAttrValues.isEmpty();
			case WorkspacePackage.LAUNCH_EVENT__CONSOLE_OUTPUT:
				return consoleOutput != null && !consoleOutput.isEmpty();
			case WorkspacePackage.LAUNCH_EVENT__CONSOLE_OUTPUT_SIZE_MEASURE:
				return getConsoleOutputSizeMeasure() != CONSOLE_OUTPUT_SIZE_MEASURE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case WorkspacePackage.LAUNCH_EVENT___GET_ALL_CONSOLE_OUTPUT:
				return getAllConsoleOutput();
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(", consoleOutput: ");
		result.append(consoleOutput);
		result.append(')');
		return result.toString();
	}

} //LaunchEventImpl
