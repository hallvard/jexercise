/**
 */
package no.hal.learning.exercise.impl;

import java.lang.reflect.InvocationTargetException;
import no.hal.learning.exercise.AbstractStringEdit;
import no.hal.learning.exercise.AbstractStringEditEvent;
import no.hal.learning.exercise.ExerciseFactory;
import no.hal.learning.exercise.ExercisePackage;
import no.hal.learning.exercise.ReplaceSubstringEdit;
import no.hal.learning.exercise.StringEdit;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract String Edit Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.hal.learning.exercise.impl.AbstractStringEditEventImpl#getEdit <em>Edit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AbstractStringEditEventImpl extends TaskEventImpl implements AbstractStringEditEvent {
	/**
	 * The cached value of the '{@link #getEdit() <em>Edit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEdit()
	 * @generated
	 * @ordered
	 */
	protected AbstractStringEdit edit;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractStringEditEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExercisePackage.Literals.ABSTRACT_STRING_EDIT_EVENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractStringEdit getEdit() {
		return edit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEdit(AbstractStringEdit newEdit, NotificationChain msgs) {
		AbstractStringEdit oldEdit = edit;
		edit = newEdit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExercisePackage.ABSTRACT_STRING_EDIT_EVENT__EDIT, oldEdit, newEdit);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEdit(AbstractStringEdit newEdit) {
		if (newEdit != edit) {
			NotificationChain msgs = null;
			if (edit != null)
				msgs = ((InternalEObject)edit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExercisePackage.ABSTRACT_STRING_EDIT_EVENT__EDIT, null, msgs);
			if (newEdit != null)
				msgs = ((InternalEObject)newEdit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExercisePackage.ABSTRACT_STRING_EDIT_EVENT__EDIT, null, msgs);
			msgs = basicSetEdit(newEdit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExercisePackage.ABSTRACT_STRING_EDIT_EVENT__EDIT, newEdit, newEdit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getString() {
		return getEdit().getString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public AbstractStringEdit createStringEdit(String string, AbstractStringEditEvent lastEvent) {
		if (lastEvent != null) {
			AbstractStringEdit lastEdit = lastEvent.getEdit();
			String lastString = lastEdit.getString();
			int start = 0;
			while (start < string.length() && start < lastString.length() && string.charAt(start) == lastString.charAt(start)) {
				start++;
			}
			int end = -1;
			while (string.length() + end >= 0 && lastString.length() + end >= 0 && string.charAt(string.length() + end) == lastString.charAt(lastString.length() + end)) {
				end--;
			}
			if (start != 0 || end != -1) {
				ReplaceSubstringEdit stringEdit = ExerciseFactory.eINSTANCE.createReplaceSubstringEdit();
				stringEdit.setEdit(lastEdit);
				stringEdit.setStart(start);
				stringEdit.setEnd(end);
				int end2 = string.length() + end + 1;
				stringEdit.setStoredString(end2 > start ? string.substring(start, end2) : null);
				return stringEdit;
			}
		}
		StringEdit stringEdit = ExerciseFactory.eINSTANCE.createStringEdit();
		stringEdit.setStoredString(string);
		return stringEdit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ExercisePackage.ABSTRACT_STRING_EDIT_EVENT__EDIT:
				return basicSetEdit(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ExercisePackage.ABSTRACT_STRING_EDIT_EVENT__EDIT:
				return getEdit();
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
			case ExercisePackage.ABSTRACT_STRING_EDIT_EVENT__EDIT:
				setEdit((AbstractStringEdit)newValue);
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
			case ExercisePackage.ABSTRACT_STRING_EDIT_EVENT__EDIT:
				setEdit((AbstractStringEdit)null);
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
			case ExercisePackage.ABSTRACT_STRING_EDIT_EVENT__EDIT:
				return edit != null;
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
			case ExercisePackage.ABSTRACT_STRING_EDIT_EVENT___GET_STRING:
				return getString();
			case ExercisePackage.ABSTRACT_STRING_EDIT_EVENT___CREATE_STRING_EDIT__STRING_ABSTRACTSTRINGEDITEVENT:
				return createStringEdit((String)arguments.get(0), (AbstractStringEditEvent)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //AbstractStringEditEventImpl