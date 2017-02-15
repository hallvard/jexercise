/**
 */
package no.hal.learning.exercise.jdt.impl;

import no.hal.learning.exercise.ExerciseFactory;
import no.hal.learning.exercise.StringEdit;
import no.hal.learning.exercise.impl.AbstractStringEditEventImpl;
import no.hal.learning.exercise.jdt.JdtSourceEditEvent;
import no.hal.learning.exercise.jdt.JdtPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.hal.learning.exercise.jdt.impl.JdtSourceEditEventImpl#getSourceCode <em>Source Code</em>}</li>
 *   <li>{@link no.hal.learning.exercise.jdt.impl.JdtSourceEditEventImpl#getSizeMeasure <em>Size Measure</em>}</li>
 *   <li>{@link no.hal.learning.exercise.jdt.impl.JdtSourceEditEventImpl#getErrorCount <em>Error Count</em>}</li>
 *   <li>{@link no.hal.learning.exercise.jdt.impl.JdtSourceEditEventImpl#getWarningCount <em>Warning Count</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JdtSourceEditEventImpl extends AbstractStringEditEventImpl implements JdtSourceEditEvent {
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
			eNotify(new ENotificationImpl(this, Notification.SET, JdtPackage.JDT_SOURCE_EDIT_EVENT__SIZE_MEASURE, oldSizeMeasure, sizeMeasure));
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
			eNotify(new ENotificationImpl(this, Notification.SET, JdtPackage.JDT_SOURCE_EDIT_EVENT__ERROR_COUNT, oldErrorCount, errorCount));
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
			eNotify(new ENotificationImpl(this, Notification.SET, JdtPackage.JDT_SOURCE_EDIT_EVENT__WARNING_COUNT, oldWarningCount, warningCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JdtPackage.JDT_SOURCE_EDIT_EVENT__SOURCE_CODE:
				return getSourceCode();
			case JdtPackage.JDT_SOURCE_EDIT_EVENT__SIZE_MEASURE:
				return getSizeMeasure();
			case JdtPackage.JDT_SOURCE_EDIT_EVENT__ERROR_COUNT:
				return getErrorCount();
			case JdtPackage.JDT_SOURCE_EDIT_EVENT__WARNING_COUNT:
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
			case JdtPackage.JDT_SOURCE_EDIT_EVENT__SOURCE_CODE:
				setSourceCode((String)newValue);
				return;
			case JdtPackage.JDT_SOURCE_EDIT_EVENT__SIZE_MEASURE:
				setSizeMeasure((Integer)newValue);
				return;
			case JdtPackage.JDT_SOURCE_EDIT_EVENT__ERROR_COUNT:
				setErrorCount((Integer)newValue);
				return;
			case JdtPackage.JDT_SOURCE_EDIT_EVENT__WARNING_COUNT:
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
			case JdtPackage.JDT_SOURCE_EDIT_EVENT__SOURCE_CODE:
				setSourceCode(SOURCE_CODE_EDEFAULT);
				return;
			case JdtPackage.JDT_SOURCE_EDIT_EVENT__SIZE_MEASURE:
				setSizeMeasure(SIZE_MEASURE_EDEFAULT);
				return;
			case JdtPackage.JDT_SOURCE_EDIT_EVENT__ERROR_COUNT:
				setErrorCount(ERROR_COUNT_EDEFAULT);
				return;
			case JdtPackage.JDT_SOURCE_EDIT_EVENT__WARNING_COUNT:
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
			case JdtPackage.JDT_SOURCE_EDIT_EVENT__SOURCE_CODE:
				return SOURCE_CODE_EDEFAULT == null ? getSourceCode() != null : !SOURCE_CODE_EDEFAULT.equals(getSourceCode());
			case JdtPackage.JDT_SOURCE_EDIT_EVENT__SIZE_MEASURE:
				return sizeMeasure != SIZE_MEASURE_EDEFAULT;
			case JdtPackage.JDT_SOURCE_EDIT_EVENT__ERROR_COUNT:
				return errorCount != ERROR_COUNT_EDEFAULT;
			case JdtPackage.JDT_SOURCE_EDIT_EVENT__WARNING_COUNT:
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
		result.append(" (sizeMeasure: ");
		result.append(sizeMeasure);
		result.append(", errorCount: ");
		result.append(errorCount);
		result.append(", warningCount: ");
		result.append(warningCount);
		result.append(')');
		return result.toString();
	}

	//
	
	@Override
	public String getText() {
		return String.format("%s: %s lines with %s error(s), %s warning(s)", getTaskProposal().getText(), getSizeMeasure(), getErrorCount(), getWarningCount());
	}

} //JdtClassEventImpl
