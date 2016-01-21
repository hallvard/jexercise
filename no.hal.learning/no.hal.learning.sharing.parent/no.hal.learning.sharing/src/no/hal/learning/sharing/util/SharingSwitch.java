/**
 */
package no.hal.learning.sharing.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import no.hal.learning.sharing.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see no.hal.learning.sharing.SharingPackage
 * @generated
 */
public class SharingSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SharingPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SharingSwitch() {
		if (modelPackage == null) {
			modelPackage = SharingPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case SharingPackage.ABSTRACT_SHARE: {
				AbstractShare abstractShare = (AbstractShare)theEObject;
				T result = caseAbstractShare(abstractShare);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SharingPackage.SHARE_MODEL: {
				ShareModel shareModel = (ShareModel)theEObject;
				T result = caseShareModel(shareModel);
				if (result == null) result = caseAbstractShare(shareModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SharingPackage.SHARE_EDITS: {
				ShareEdits shareEdits = (ShareEdits)theEObject;
				T result = caseShareEdits(shareEdits);
				if (result == null) result = caseAbstractShare(shareEdits);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SharingPackage.MODEL_EDIT: {
				ModelEdit modelEdit = (ModelEdit)theEObject;
				T result = caseModelEdit(modelEdit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SharingPackage.ABSTRACT_MODEL_EDIT: {
				AbstractModelEdit abstractModelEdit = (AbstractModelEdit)theEObject;
				T result = caseAbstractModelEdit(abstractModelEdit);
				if (result == null) result = caseModelEdit(abstractModelEdit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SharingPackage.ABSTRACT_FEATURE_EDIT: {
				AbstractFeatureEdit abstractFeatureEdit = (AbstractFeatureEdit)theEObject;
				T result = caseAbstractFeatureEdit(abstractFeatureEdit);
				if (result == null) result = caseAbstractModelEdit(abstractFeatureEdit);
				if (result == null) result = caseModelEdit(abstractFeatureEdit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SharingPackage.ABSTRACT_ATTRIBUTE_EDIT: {
				AbstractAttributeEdit abstractAttributeEdit = (AbstractAttributeEdit)theEObject;
				T result = caseAbstractAttributeEdit(abstractAttributeEdit);
				if (result == null) result = caseAbstractFeatureEdit(abstractAttributeEdit);
				if (result == null) result = caseAbstractModelEdit(abstractAttributeEdit);
				if (result == null) result = caseModelEdit(abstractAttributeEdit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SharingPackage.ABSTRACT_REFERENCE_EDIT: {
				AbstractReferenceEdit abstractReferenceEdit = (AbstractReferenceEdit)theEObject;
				T result = caseAbstractReferenceEdit(abstractReferenceEdit);
				if (result == null) result = caseAbstractFeatureEdit(abstractReferenceEdit);
				if (result == null) result = caseAbstractModelEdit(abstractReferenceEdit);
				if (result == null) result = caseModelEdit(abstractReferenceEdit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SharingPackage.SET_FEATURE_EDIT: {
				SetFeatureEdit setFeatureEdit = (SetFeatureEdit)theEObject;
				T result = caseSetFeatureEdit(setFeatureEdit);
				if (result == null) result = caseAbstractFeatureEdit(setFeatureEdit);
				if (result == null) result = caseAbstractModelEdit(setFeatureEdit);
				if (result == null) result = caseModelEdit(setFeatureEdit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SharingPackage.SET_ATTRIBUTE_EDIT: {
				SetAttributeEdit setAttributeEdit = (SetAttributeEdit)theEObject;
				T result = caseSetAttributeEdit(setAttributeEdit);
				if (result == null) result = caseSetFeatureEdit(setAttributeEdit);
				if (result == null) result = caseAbstractAttributeEdit(setAttributeEdit);
				if (result == null) result = caseAbstractFeatureEdit(setAttributeEdit);
				if (result == null) result = caseAbstractModelEdit(setAttributeEdit);
				if (result == null) result = caseModelEdit(setAttributeEdit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SharingPackage.SET_REFERENCE_EDIT: {
				SetReferenceEdit setReferenceEdit = (SetReferenceEdit)theEObject;
				T result = caseSetReferenceEdit(setReferenceEdit);
				if (result == null) result = caseSetFeatureEdit(setReferenceEdit);
				if (result == null) result = caseAbstractReferenceEdit(setReferenceEdit);
				if (result == null) result = caseAbstractFeatureEdit(setReferenceEdit);
				if (result == null) result = caseAbstractModelEdit(setReferenceEdit);
				if (result == null) result = caseModelEdit(setReferenceEdit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SharingPackage.ADD_FEATURE_EDIT: {
				AddFeatureEdit addFeatureEdit = (AddFeatureEdit)theEObject;
				T result = caseAddFeatureEdit(addFeatureEdit);
				if (result == null) result = caseAbstractFeatureEdit(addFeatureEdit);
				if (result == null) result = caseAbstractModelEdit(addFeatureEdit);
				if (result == null) result = caseModelEdit(addFeatureEdit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SharingPackage.ADD_ATTRIBUTE_EDIT: {
				AddAttributeEdit addAttributeEdit = (AddAttributeEdit)theEObject;
				T result = caseAddAttributeEdit(addAttributeEdit);
				if (result == null) result = caseAddFeatureEdit(addAttributeEdit);
				if (result == null) result = caseAbstractAttributeEdit(addAttributeEdit);
				if (result == null) result = caseAbstractFeatureEdit(addAttributeEdit);
				if (result == null) result = caseAbstractModelEdit(addAttributeEdit);
				if (result == null) result = caseModelEdit(addAttributeEdit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SharingPackage.ADD_REFERENCE_EDIT: {
				AddReferenceEdit addReferenceEdit = (AddReferenceEdit)theEObject;
				T result = caseAddReferenceEdit(addReferenceEdit);
				if (result == null) result = caseAddFeatureEdit(addReferenceEdit);
				if (result == null) result = caseAbstractReferenceEdit(addReferenceEdit);
				if (result == null) result = caseAbstractFeatureEdit(addReferenceEdit);
				if (result == null) result = caseAbstractModelEdit(addReferenceEdit);
				if (result == null) result = caseModelEdit(addReferenceEdit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SharingPackage.REMOVE_FEATURE_EDIT: {
				RemoveFeatureEdit removeFeatureEdit = (RemoveFeatureEdit)theEObject;
				T result = caseRemoveFeatureEdit(removeFeatureEdit);
				if (result == null) result = caseAbstractFeatureEdit(removeFeatureEdit);
				if (result == null) result = caseAbstractModelEdit(removeFeatureEdit);
				if (result == null) result = caseModelEdit(removeFeatureEdit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SharingPackage.CHANGE_EDIT: {
				ChangeEdit changeEdit = (ChangeEdit)theEObject;
				T result = caseChangeEdit(changeEdit);
				if (result == null) result = caseAbstractModelEdit(changeEdit);
				if (result == null) result = caseModelEdit(changeEdit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Share</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Share</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractShare(AbstractShare object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Edit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Edit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelEdit(ModelEdit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Model Edit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Model Edit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractModelEdit(AbstractModelEdit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Feature Edit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Feature Edit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractFeatureEdit(AbstractFeatureEdit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Attribute Edit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Attribute Edit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractAttributeEdit(AbstractAttributeEdit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Reference Edit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Reference Edit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractReferenceEdit(AbstractReferenceEdit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Set Feature Edit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Set Feature Edit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSetFeatureEdit(SetFeatureEdit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Set Attribute Edit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Set Attribute Edit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSetAttributeEdit(SetAttributeEdit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Set Reference Edit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Set Reference Edit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSetReferenceEdit(SetReferenceEdit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Add Feature Edit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Add Feature Edit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAddFeatureEdit(AddFeatureEdit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Add Attribute Edit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Add Attribute Edit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAddAttributeEdit(AddAttributeEdit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Add Reference Edit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Add Reference Edit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAddReferenceEdit(AddReferenceEdit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Remove Feature Edit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Remove Feature Edit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRemoveFeatureEdit(RemoveFeatureEdit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Change Edit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Change Edit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChangeEdit(ChangeEdit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Share Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Share Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseShareModel(ShareModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Share Edits</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Share Edits</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseShareEdits(ShareEdits object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //SharingSwitch
