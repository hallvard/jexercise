/**
 */
package no.hal.learning.exercise.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import no.hal.learning.exercise.AbstractStringEdit;
import no.hal.learning.exercise.ExercisePackage;
import no.hal.learning.exercise.RelativeStringEdit;
import no.hal.learning.exercise.ReplaceSubstringEdit;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>String Edit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.hal.learning.exercise.impl.ReplaceSubstringEditImpl#getEdit <em>Edit</em>}</li>
 *   <li>{@link no.hal.learning.exercise.impl.ReplaceSubstringEditImpl#getStart <em>Start</em>}</li>
 *   <li>{@link no.hal.learning.exercise.impl.ReplaceSubstringEditImpl#getEnd <em>End</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReplaceSubstringEditImpl extends StringEditImpl implements ReplaceSubstringEdit {
	/**
	 * The cached value of the '{@link #getEdit() <em>Edit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEdit()
	 * @generated
	 * @ordered
	 */
	protected AbstractStringEdit edit;

	/**
	 * The default value of the '{@link #getStart() <em>Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStart()
	 * @generated
	 * @ordered
	 */
	protected static final int START_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getStart() <em>Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStart()
	 * @generated
	 * @ordered
	 */
	protected int start = START_EDEFAULT;

	/**
	 * The default value of the '{@link #getEnd() <em>End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnd()
	 * @generated
	 * @ordered
	 */
	protected static final int END_EDEFAULT = -1;

	/**
	 * The cached value of the '{@link #getEnd() <em>End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnd()
	 * @generated
	 * @ordered
	 */
	protected int end = END_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReplaceSubstringEditImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExercisePackage.Literals.REPLACE_SUBSTRING_EDIT;
	}

	private String transientStringCache = null;

	protected void clearStringCache() {
		transientStringCache = null;
	}

	@Override
	public String getString() {
		if (getEdit() != null) {
			if (transientStringCache == null) {
				String last = getEdit().getString();
				int start = getStart(), end = getEnd();
				if (end < 0) {
					end = last.length() + end + 1;
				}
				if (end < start) {
					// fix due to bug when there is no difference between last and current
					transientStringCache = last;
				} else {
					transientStringCache = (start > 0 ? last.substring(0, start) : "")
							+ (getStoredString() != null ? getStoredString() : "")
							+ (end < last.length() ? last.substring(end) : "");
				}
			}
			return transientStringCache;
		}
		return super.getString();
	}

	@Override
	public Boolean initStringEdit(String string, AbstractStringEdit lastEdit) {
		String lastString = lastEdit.getString();
		int start = 0;
		while (start < string.length() && start < lastString.length() && string.charAt(start) == lastString.charAt(start)) {
			start++;
		}
		int end = -1;
		while (string.length() + end > start && lastString.length() + end >= start && string.charAt(string.length() + end) == lastString.charAt(lastString.length() + end)) {
			end--;
		}
		if (start != 0 || end != -1) {
			setEdit(lastEdit);
			setStart(start);
			setEnd(end);
			int end2 = string.length() + end + 1;
			setStoredString(end2 > start ? string.substring(start, end2) : null);
			return true;
		}
		super.initStringEdit(string, lastEdit);
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractStringEdit getEdit() {
		if (edit != null && edit.eIsProxy()) {
			InternalEObject oldEdit = (InternalEObject)edit;
			edit = (AbstractStringEdit)eResolveProxy(oldEdit);
			if (edit != oldEdit) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExercisePackage.REPLACE_SUBSTRING_EDIT__EDIT, oldEdit, edit));
			}
		}
		return edit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractStringEdit basicGetEdit() {
		return edit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setEdit(AbstractStringEdit newEdit) {
		AbstractStringEdit oldEdit = edit;
		edit = newEdit;
		clearStringCache();
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExercisePackage.REPLACE_SUBSTRING_EDIT__EDIT, oldEdit, edit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getStart() {
		return start;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setStart(int newStart) {
		int oldStart = start;
		start = newStart;
		clearStringCache();
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExercisePackage.REPLACE_SUBSTRING_EDIT__START, oldStart, start));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getEnd() {
		return end;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setEnd(int newEnd) {
		int oldEnd = end;
		end = newEnd;
		clearStringCache();
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExercisePackage.REPLACE_SUBSTRING_EDIT__END, oldEnd, end));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ExercisePackage.REPLACE_SUBSTRING_EDIT__EDIT:
				if (resolve) return getEdit();
				return basicGetEdit();
			case ExercisePackage.REPLACE_SUBSTRING_EDIT__START:
				return getStart();
			case ExercisePackage.REPLACE_SUBSTRING_EDIT__END:
				return getEnd();
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
			case ExercisePackage.REPLACE_SUBSTRING_EDIT__EDIT:
				setEdit((AbstractStringEdit)newValue);
				return;
			case ExercisePackage.REPLACE_SUBSTRING_EDIT__START:
				setStart((Integer)newValue);
				return;
			case ExercisePackage.REPLACE_SUBSTRING_EDIT__END:
				setEnd((Integer)newValue);
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
			case ExercisePackage.REPLACE_SUBSTRING_EDIT__EDIT:
				setEdit((AbstractStringEdit)null);
				return;
			case ExercisePackage.REPLACE_SUBSTRING_EDIT__START:
				setStart(START_EDEFAULT);
				return;
			case ExercisePackage.REPLACE_SUBSTRING_EDIT__END:
				setEnd(END_EDEFAULT);
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
			case ExercisePackage.REPLACE_SUBSTRING_EDIT__EDIT:
				return edit != null;
			case ExercisePackage.REPLACE_SUBSTRING_EDIT__START:
				return start != START_EDEFAULT;
			case ExercisePackage.REPLACE_SUBSTRING_EDIT__END:
				return end != END_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == RelativeStringEdit.class) {
			switch (derivedFeatureID) {
				case ExercisePackage.REPLACE_SUBSTRING_EDIT__EDIT: return ExercisePackage.RELATIVE_STRING_EDIT__EDIT;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == RelativeStringEdit.class) {
			switch (baseFeatureID) {
				case ExercisePackage.RELATIVE_STRING_EDIT__EDIT: return ExercisePackage.REPLACE_SUBSTRING_EDIT__EDIT;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (start: ");
		result.append(start);
		result.append(", end: ");
		result.append(end);
		result.append(')');
		return result.toString();
	}
} //StringEditImpl
