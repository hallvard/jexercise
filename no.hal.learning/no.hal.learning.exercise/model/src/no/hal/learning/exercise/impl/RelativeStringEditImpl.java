/**
 */
package no.hal.learning.exercise.impl;

import no.hal.learning.exercise.AbstractStringEdit;
import no.hal.learning.exercise.ExercisePackage;
import no.hal.learning.exercise.RelativeStringEdit;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relative String Edit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.hal.learning.exercise.impl.RelativeStringEditImpl#getEdit <em>Edit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RelativeStringEditImpl extends AbstractStringEditImpl implements RelativeStringEdit {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelativeStringEditImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExercisePackage.Literals.RELATIVE_STRING_EDIT;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExercisePackage.RELATIVE_STRING_EDIT__EDIT, oldEdit, edit));
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
	 * @generated
	 */
	public void setEdit(AbstractStringEdit newEdit) {
		AbstractStringEdit oldEdit = edit;
		edit = newEdit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExercisePackage.RELATIVE_STRING_EDIT__EDIT, oldEdit, edit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ExercisePackage.RELATIVE_STRING_EDIT__EDIT:
				if (resolve) return getEdit();
				return basicGetEdit();
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
			case ExercisePackage.RELATIVE_STRING_EDIT__EDIT:
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
			case ExercisePackage.RELATIVE_STRING_EDIT__EDIT:
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
			case ExercisePackage.RELATIVE_STRING_EDIT__EDIT:
				return edit != null;
		}
		return super.eIsSet(featureID);
	}

} //RelativeStringEditImpl
