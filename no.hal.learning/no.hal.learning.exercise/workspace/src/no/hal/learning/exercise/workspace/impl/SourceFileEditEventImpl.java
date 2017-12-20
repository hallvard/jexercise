/**
 */
package no.hal.learning.exercise.workspace.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import no.hal.learning.exercise.ExerciseFactory;
import no.hal.learning.exercise.StringEdit;
import no.hal.learning.exercise.TaskAnswer;
import no.hal.learning.exercise.impl.AbstractStringEditEventImpl;
import no.hal.learning.exercise.workspace.SourceFileEditAnswer;
import no.hal.learning.exercise.workspace.SourceFileEditEvent;
import no.hal.learning.exercise.workspace.WorkspacePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Source File Edit Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.hal.learning.exercise.workspace.impl.SourceFileEditEventImpl#getResourcePath <em>Resource Path</em>}</li>
 *   <li>{@link no.hal.learning.exercise.workspace.impl.SourceFileEditEventImpl#getSourceCode <em>Source Code</em>}</li>
 *   <li>{@link no.hal.learning.exercise.workspace.impl.SourceFileEditEventImpl#getSizeMeasure <em>Size Measure</em>}</li>
 *   <li>{@link no.hal.learning.exercise.workspace.impl.SourceFileEditEventImpl#getErrorCount <em>Error Count</em>}</li>
 *   <li>{@link no.hal.learning.exercise.workspace.impl.SourceFileEditEventImpl#getWarningCount <em>Warning Count</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SourceFileEditEventImpl extends AbstractStringEditEventImpl implements SourceFileEditEvent {
	/**
	 * The default value of the '{@link #getResourcePath() <em>Resource Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourcePath()
	 * @generated
	 * @ordered
	 */
	protected static final String RESOURCE_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResourcePath() <em>Resource Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourcePath()
	 * @generated
	 * @ordered
	 */
	protected String resourcePath = RESOURCE_PATH_EDEFAULT;

	/**
	 * The default value of the '{@link #getSourceCode() <em>Source Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceCode()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_CODE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getSizeMeasure() <em>Size Measure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSizeMeasure()
	 * @generated
	 * @ordered
	 */
	protected static final int SIZE_MEASURE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSizeMeasure() <em>Size Measure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSizeMeasure()
	 * @generated
	 * @ordered
	 */
	protected int sizeMeasure = SIZE_MEASURE_EDEFAULT;

	/**
	 * The default value of the '{@link #getErrorCount() <em>Error Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorCount()
	 * @generated
	 * @ordered
	 */
	protected static final int ERROR_COUNT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getErrorCount() <em>Error Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorCount()
	 * @generated
	 * @ordered
	 */
	protected int errorCount = ERROR_COUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getWarningCount() <em>Warning Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWarningCount()
	 * @generated
	 * @ordered
	 */
	protected static final int WARNING_COUNT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getWarningCount() <em>Warning Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWarningCount()
	 * @generated
	 * @ordered
	 */
	protected int warningCount = WARNING_COUNT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SourceFileEditEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WorkspacePackage.Literals.SOURCE_FILE_EDIT_EVENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getResourcePath() {
		if (resourcePath == null && getProposal() != null) {
			TaskAnswer answer = getProposal().getAnswer();
			if (answer instanceof SourceFileEditAnswer) {
				return ((SourceFileEditAnswer) answer).getResourcePath();
			}
		}
		return resourcePath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResourcePath(String newResourcePath) {
		String oldResourcePath = resourcePath;
		resourcePath = newResourcePath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkspacePackage.SOURCE_FILE_EDIT_EVENT__RESOURCE_PATH, oldResourcePath, resourcePath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getSourceCode() {
		return getString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setSourceCode(String newSourceCode) {
		StringEdit stringEdit = ExerciseFactory.eINSTANCE.createStringEdit();
		stringEdit.setStoredString(newSourceCode);
		setEdit(stringEdit);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSizeMeasure() {
		return sizeMeasure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSizeMeasure(int newSizeMeasure) {
		int oldSizeMeasure = sizeMeasure;
		sizeMeasure = newSizeMeasure;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkspacePackage.SOURCE_FILE_EDIT_EVENT__SIZE_MEASURE, oldSizeMeasure, sizeMeasure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getErrorCount() {
		return errorCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setErrorCount(int newErrorCount) {
		int oldErrorCount = errorCount;
		errorCount = newErrorCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkspacePackage.SOURCE_FILE_EDIT_EVENT__ERROR_COUNT, oldErrorCount, errorCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getWarningCount() {
		return warningCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWarningCount(int newWarningCount) {
		int oldWarningCount = warningCount;
		warningCount = newWarningCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkspacePackage.SOURCE_FILE_EDIT_EVENT__WARNING_COUNT, oldWarningCount, warningCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WorkspacePackage.SOURCE_FILE_EDIT_EVENT__RESOURCE_PATH:
				return getResourcePath();
			case WorkspacePackage.SOURCE_FILE_EDIT_EVENT__SOURCE_CODE:
				return getSourceCode();
			case WorkspacePackage.SOURCE_FILE_EDIT_EVENT__SIZE_MEASURE:
				return getSizeMeasure();
			case WorkspacePackage.SOURCE_FILE_EDIT_EVENT__ERROR_COUNT:
				return getErrorCount();
			case WorkspacePackage.SOURCE_FILE_EDIT_EVENT__WARNING_COUNT:
				return getWarningCount();
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
			case WorkspacePackage.SOURCE_FILE_EDIT_EVENT__RESOURCE_PATH:
				setResourcePath((String)newValue);
				return;
			case WorkspacePackage.SOURCE_FILE_EDIT_EVENT__SOURCE_CODE:
				setSourceCode((String)newValue);
				return;
			case WorkspacePackage.SOURCE_FILE_EDIT_EVENT__SIZE_MEASURE:
				setSizeMeasure((Integer)newValue);
				return;
			case WorkspacePackage.SOURCE_FILE_EDIT_EVENT__ERROR_COUNT:
				setErrorCount((Integer)newValue);
				return;
			case WorkspacePackage.SOURCE_FILE_EDIT_EVENT__WARNING_COUNT:
				setWarningCount((Integer)newValue);
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
			case WorkspacePackage.SOURCE_FILE_EDIT_EVENT__RESOURCE_PATH:
				setResourcePath(RESOURCE_PATH_EDEFAULT);
				return;
			case WorkspacePackage.SOURCE_FILE_EDIT_EVENT__SOURCE_CODE:
				setSourceCode(SOURCE_CODE_EDEFAULT);
				return;
			case WorkspacePackage.SOURCE_FILE_EDIT_EVENT__SIZE_MEASURE:
				setSizeMeasure(SIZE_MEASURE_EDEFAULT);
				return;
			case WorkspacePackage.SOURCE_FILE_EDIT_EVENT__ERROR_COUNT:
				setErrorCount(ERROR_COUNT_EDEFAULT);
				return;
			case WorkspacePackage.SOURCE_FILE_EDIT_EVENT__WARNING_COUNT:
				setWarningCount(WARNING_COUNT_EDEFAULT);
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
			case WorkspacePackage.SOURCE_FILE_EDIT_EVENT__RESOURCE_PATH:
				return RESOURCE_PATH_EDEFAULT == null ? resourcePath != null : !RESOURCE_PATH_EDEFAULT.equals(resourcePath);
			case WorkspacePackage.SOURCE_FILE_EDIT_EVENT__SOURCE_CODE:
				return SOURCE_CODE_EDEFAULT == null ? getSourceCode() != null : !SOURCE_CODE_EDEFAULT.equals(getSourceCode());
			case WorkspacePackage.SOURCE_FILE_EDIT_EVENT__SIZE_MEASURE:
				return sizeMeasure != SIZE_MEASURE_EDEFAULT;
			case WorkspacePackage.SOURCE_FILE_EDIT_EVENT__ERROR_COUNT:
				return errorCount != ERROR_COUNT_EDEFAULT;
			case WorkspacePackage.SOURCE_FILE_EDIT_EVENT__WARNING_COUNT:
				return warningCount != WARNING_COUNT_EDEFAULT;
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
		result.append(" (resourcePath: ");
		result.append(resourcePath);
		result.append(", sizeMeasure: ");
		result.append(sizeMeasure);
		result.append(", errorCount: ");
		result.append(errorCount);
		result.append(", warningCount: ");
		result.append(warningCount);
		result.append(')');
		return result.toString();
	}

} //SourceFileEditEventImpl
