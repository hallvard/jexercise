/**
 */
package no.hal.learning.sharing.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.EditingDomain;

import no.hal.learning.sharing.AbstractModelEdit;
import no.hal.learning.sharing.SharingPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Model Edit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.hal.learning.sharing.impl.AbstractModelEditImpl#getEObject <em>EObject</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AbstractModelEditImpl extends MinimalEObjectImpl.Container implements AbstractModelEdit {
	/**
	 * The cached value of the '{@link #getEObject() <em>EObject</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEObject()
	 * @generated
	 * @ordered
	 */
	protected EObject eObject;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractModelEditImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SharingPackage.Literals.ABSTRACT_MODEL_EDIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject getEObject() {
		if (eObject != null && eObject.eIsProxy()) {
			InternalEObject oldEObject = (InternalEObject)eObject;
			eObject = eResolveProxy(oldEObject);
			if (eObject != oldEObject) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SharingPackage.ABSTRACT_MODEL_EDIT__EOBJECT, oldEObject, eObject));
			}
		}
		return eObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject basicGetEObject() {
		return eObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEObject(EObject newEObject) {
		EObject oldEObject = eObject;
		eObject = newEObject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SharingPackage.ABSTRACT_MODEL_EDIT__EOBJECT, oldEObject, eObject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void performEdit() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Command createEditCommand(EditingDomain editingDomain) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Resource createSerializableEdit(URI uri) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SharingPackage.ABSTRACT_MODEL_EDIT__EOBJECT:
				if (resolve) return getEObject();
				return basicGetEObject();
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
			case SharingPackage.ABSTRACT_MODEL_EDIT__EOBJECT:
				setEObject((EObject)newValue);
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
			case SharingPackage.ABSTRACT_MODEL_EDIT__EOBJECT:
				setEObject((EObject)null);
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
			case SharingPackage.ABSTRACT_MODEL_EDIT__EOBJECT:
				return eObject != null;
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
			case SharingPackage.ABSTRACT_MODEL_EDIT___PERFORM_EDIT:
				performEdit();
				return null;
			case SharingPackage.ABSTRACT_MODEL_EDIT___CREATE_EDIT_COMMAND__EDITINGDOMAIN:
				return createEditCommand((EditingDomain)arguments.get(0));
			case SharingPackage.ABSTRACT_MODEL_EDIT___CREATE_SERIALIZABLE_EDIT__URI:
				return createSerializableEdit((URI)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //AbstractModelEditImpl
