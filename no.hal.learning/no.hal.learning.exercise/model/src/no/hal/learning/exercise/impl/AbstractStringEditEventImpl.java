/**
 */
package no.hal.learning.exercise.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import no.hal.learning.exercise.AbstractStringEdit;
import no.hal.learning.exercise.AbstractStringEditEvent;
import no.hal.learning.exercise.ExerciseFactory;
import no.hal.learning.exercise.ExercisePackage;
import no.hal.learning.exercise.MarkerInfo;
import no.hal.learning.exercise.ReplaceSubstringEdit;
import no.hal.learning.exercise.StringEdit;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract String Edit Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.hal.learning.exercise.impl.AbstractStringEditEventImpl#getEdit <em>Edit</em>}</li>
 *   <li>{@link no.hal.learning.exercise.impl.AbstractStringEditEventImpl#getMarkers <em>Markers</em>}</li>
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
	 * The cached value of the '{@link #getMarkers() <em>Markers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarkers()
	 * @generated
	 * @ordered
	 */
	protected EList<MarkerInfo> markers;

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
	 * @generated
	 */
	public EList<MarkerInfo> getMarkers() {
		if (markers == null) {
			markers = new EObjectContainmentEList<MarkerInfo>(MarkerInfo.class, this, ExercisePackage.ABSTRACT_STRING_EDIT_EVENT__MARKERS);
		}
		return markers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getString() {
		return getEdit() != null ? getEdit().getString() : null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public AbstractStringEdit createStringEdit(String string, AbstractStringEditEvent lastEvent) {
		if (lastEvent != null && lastEvent.getEdit() != null) {
			ReplaceSubstringEdit stringEdit = ExerciseFactory.eINSTANCE.createReplaceSubstringEdit();
			AbstractStringEdit lastEdit = lastEvent.getEdit();
			if (stringEdit.initStringEdit(string, lastEdit)) {
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
			case ExercisePackage.ABSTRACT_STRING_EDIT_EVENT__MARKERS:
				return ((InternalEList<?>)getMarkers()).basicRemove(otherEnd, msgs);
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
			case ExercisePackage.ABSTRACT_STRING_EDIT_EVENT__MARKERS:
				return getMarkers();
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
			case ExercisePackage.ABSTRACT_STRING_EDIT_EVENT__EDIT:
				setEdit((AbstractStringEdit)newValue);
				return;
			case ExercisePackage.ABSTRACT_STRING_EDIT_EVENT__MARKERS:
				getMarkers().clear();
				getMarkers().addAll((Collection<? extends MarkerInfo>)newValue);
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
			case ExercisePackage.ABSTRACT_STRING_EDIT_EVENT__MARKERS:
				getMarkers().clear();
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
			case ExercisePackage.ABSTRACT_STRING_EDIT_EVENT__MARKERS:
				return markers != null && !markers.isEmpty();
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
