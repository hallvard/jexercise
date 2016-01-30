/**
 */
package no.hal.learning.sharing;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see no.hal.learning.sharing.SharingFactory
 * @model kind="package"
 * @generated
 */
public interface SharingPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "sharing";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/plugin/no.hal.lecture.sharing/model/sharing.model";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "emf-sharing";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SharingPackage eINSTANCE = no.hal.learning.sharing.impl.SharingPackageImpl.init();

	/**
	 * The meta object id for the '{@link no.hal.learning.sharing.impl.AbstractShareImpl <em>Abstract Share</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.learning.sharing.impl.AbstractShareImpl
	 * @see no.hal.learning.sharing.impl.SharingPackageImpl#getAbstractShare()
	 * @generated
	 */
	int ABSTRACT_SHARE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SHARE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SHARE__OWNER = 1;

	/**
	 * The feature id for the '<em><b>Sharer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SHARE__SHARER = 2;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SHARE__MODE = 3;

	/**
	 * The number of structural features of the '<em>Abstract Share</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SHARE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Abstract Share</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SHARE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link no.hal.learning.sharing.ModelEdit <em>Model Edit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.learning.sharing.ModelEdit
	 * @see no.hal.learning.sharing.impl.SharingPackageImpl#getModelEdit()
	 * @generated
	 */
	int MODEL_EDIT = 3;

	/**
	 * The meta object id for the '{@link no.hal.learning.sharing.impl.AbstractModelEditImpl <em>Abstract Model Edit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.learning.sharing.impl.AbstractModelEditImpl
	 * @see no.hal.learning.sharing.impl.SharingPackageImpl#getAbstractModelEdit()
	 * @generated
	 */
	int ABSTRACT_MODEL_EDIT = 4;

	/**
	 * The meta object id for the '{@link no.hal.learning.sharing.impl.AbstractFeatureEditImpl <em>Abstract Feature Edit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.learning.sharing.impl.AbstractFeatureEditImpl
	 * @see no.hal.learning.sharing.impl.SharingPackageImpl#getAbstractFeatureEdit()
	 * @generated
	 */
	int ABSTRACT_FEATURE_EDIT = 5;

	/**
	 * The meta object id for the '{@link no.hal.learning.sharing.impl.AbstractAttributeEditImpl <em>Abstract Attribute Edit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.learning.sharing.impl.AbstractAttributeEditImpl
	 * @see no.hal.learning.sharing.impl.SharingPackageImpl#getAbstractAttributeEdit()
	 * @generated
	 */
	int ABSTRACT_ATTRIBUTE_EDIT = 6;

	/**
	 * The meta object id for the '{@link no.hal.learning.sharing.impl.AbstractReferenceEditImpl <em>Abstract Reference Edit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.learning.sharing.impl.AbstractReferenceEditImpl
	 * @see no.hal.learning.sharing.impl.SharingPackageImpl#getAbstractReferenceEdit()
	 * @generated
	 */
	int ABSTRACT_REFERENCE_EDIT = 7;

	/**
	 * The meta object id for the '{@link no.hal.learning.sharing.impl.SetFeatureEditImpl <em>Set Feature Edit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.learning.sharing.impl.SetFeatureEditImpl
	 * @see no.hal.learning.sharing.impl.SharingPackageImpl#getSetFeatureEdit()
	 * @generated
	 */
	int SET_FEATURE_EDIT = 8;

	/**
	 * The meta object id for the '{@link no.hal.learning.sharing.impl.SetAttributeEditImpl <em>Set Attribute Edit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.learning.sharing.impl.SetAttributeEditImpl
	 * @see no.hal.learning.sharing.impl.SharingPackageImpl#getSetAttributeEdit()
	 * @generated
	 */
	int SET_ATTRIBUTE_EDIT = 9;

	/**
	 * The meta object id for the '{@link no.hal.learning.sharing.impl.SetReferenceEditImpl <em>Set Reference Edit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.learning.sharing.impl.SetReferenceEditImpl
	 * @see no.hal.learning.sharing.impl.SharingPackageImpl#getSetReferenceEdit()
	 * @generated
	 */
	int SET_REFERENCE_EDIT = 10;

	/**
	 * The meta object id for the '{@link no.hal.learning.sharing.impl.AddFeatureEditImpl <em>Add Feature Edit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.learning.sharing.impl.AddFeatureEditImpl
	 * @see no.hal.learning.sharing.impl.SharingPackageImpl#getAddFeatureEdit()
	 * @generated
	 */
	int ADD_FEATURE_EDIT = 11;

	/**
	 * The meta object id for the '{@link no.hal.learning.sharing.impl.AddAttributeEditImpl <em>Add Attribute Edit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.learning.sharing.impl.AddAttributeEditImpl
	 * @see no.hal.learning.sharing.impl.SharingPackageImpl#getAddAttributeEdit()
	 * @generated
	 */
	int ADD_ATTRIBUTE_EDIT = 12;

	/**
	 * The meta object id for the '{@link no.hal.learning.sharing.impl.AddReferenceEditImpl <em>Add Reference Edit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.learning.sharing.impl.AddReferenceEditImpl
	 * @see no.hal.learning.sharing.impl.SharingPackageImpl#getAddReferenceEdit()
	 * @generated
	 */
	int ADD_REFERENCE_EDIT = 13;

	/**
	 * The meta object id for the '{@link no.hal.learning.sharing.impl.RemoveFeatureEditImpl <em>Remove Feature Edit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.learning.sharing.impl.RemoveFeatureEditImpl
	 * @see no.hal.learning.sharing.impl.SharingPackageImpl#getRemoveFeatureEdit()
	 * @generated
	 */
	int REMOVE_FEATURE_EDIT = 14;

	/**
	 * The meta object id for the '{@link no.hal.learning.sharing.impl.ChangeEditImpl <em>Change Edit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.learning.sharing.impl.ChangeEditImpl
	 * @see no.hal.learning.sharing.impl.SharingPackageImpl#getChangeEdit()
	 * @generated
	 */
	int CHANGE_EDIT = 15;

	/**
	 * The meta object id for the '{@link no.hal.learning.sharing.impl.ShareModelImpl <em>Share Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.learning.sharing.impl.ShareModelImpl
	 * @see no.hal.learning.sharing.impl.SharingPackageImpl#getShareModel()
	 * @generated
	 */
	int SHARE_MODEL = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARE_MODEL__NAME = ABSTRACT_SHARE__NAME;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARE_MODEL__OWNER = ABSTRACT_SHARE__OWNER;

	/**
	 * The feature id for the '<em><b>Sharer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARE_MODEL__SHARER = ABSTRACT_SHARE__SHARER;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARE_MODEL__MODE = ABSTRACT_SHARE__MODE;

	/**
	 * The feature id for the '<em><b>EObjects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARE_MODEL__EOBJECTS = ABSTRACT_SHARE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Share Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARE_MODEL_FEATURE_COUNT = ABSTRACT_SHARE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Share Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARE_MODEL_OPERATION_COUNT = ABSTRACT_SHARE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link no.hal.learning.sharing.impl.ShareEditsImpl <em>Share Edits</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.learning.sharing.impl.ShareEditsImpl
	 * @see no.hal.learning.sharing.impl.SharingPackageImpl#getShareEdits()
	 * @generated
	 */
	int SHARE_EDITS = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARE_EDITS__NAME = ABSTRACT_SHARE__NAME;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARE_EDITS__OWNER = ABSTRACT_SHARE__OWNER;

	/**
	 * The feature id for the '<em><b>Sharer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARE_EDITS__SHARER = ABSTRACT_SHARE__SHARER;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARE_EDITS__MODE = ABSTRACT_SHARE__MODE;

	/**
	 * The feature id for the '<em><b>Edits</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARE_EDITS__EDITS = ABSTRACT_SHARE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Share Edits</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARE_EDITS_FEATURE_COUNT = ABSTRACT_SHARE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Share Edits</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARE_EDITS_OPERATION_COUNT = ABSTRACT_SHARE_OPERATION_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Model Edit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_EDIT_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Perform Edit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_EDIT___PERFORM_EDIT = 0;

	/**
	 * The operation id for the '<em>Create Edit Command</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_EDIT___CREATE_EDIT_COMMAND__EDITINGDOMAIN = 1;

	/**
	 * The operation id for the '<em>Create Serializable Edit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_EDIT___CREATE_SERIALIZABLE_EDIT__URI = 2;

	/**
	 * The number of operations of the '<em>Model Edit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_EDIT_OPERATION_COUNT = 3;

	/**
	 * The feature id for the '<em><b>EObject</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_MODEL_EDIT__EOBJECT = MODEL_EDIT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Abstract Model Edit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_MODEL_EDIT_FEATURE_COUNT = MODEL_EDIT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Perform Edit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_MODEL_EDIT___PERFORM_EDIT = MODEL_EDIT___PERFORM_EDIT;

	/**
	 * The operation id for the '<em>Create Edit Command</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_MODEL_EDIT___CREATE_EDIT_COMMAND__EDITINGDOMAIN = MODEL_EDIT___CREATE_EDIT_COMMAND__EDITINGDOMAIN;

	/**
	 * The operation id for the '<em>Create Serializable Edit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_MODEL_EDIT___CREATE_SERIALIZABLE_EDIT__URI = MODEL_EDIT___CREATE_SERIALIZABLE_EDIT__URI;

	/**
	 * The number of operations of the '<em>Abstract Model Edit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_MODEL_EDIT_OPERATION_COUNT = MODEL_EDIT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>EObject</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FEATURE_EDIT__EOBJECT = ABSTRACT_MODEL_EDIT__EOBJECT;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FEATURE_EDIT__FEATURE = ABSTRACT_MODEL_EDIT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FEATURE_EDIT__INDEX = ABSTRACT_MODEL_EDIT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Abstract Feature Edit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FEATURE_EDIT_FEATURE_COUNT = ABSTRACT_MODEL_EDIT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Perform Edit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FEATURE_EDIT___PERFORM_EDIT = ABSTRACT_MODEL_EDIT___PERFORM_EDIT;

	/**
	 * The operation id for the '<em>Create Edit Command</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FEATURE_EDIT___CREATE_EDIT_COMMAND__EDITINGDOMAIN = ABSTRACT_MODEL_EDIT___CREATE_EDIT_COMMAND__EDITINGDOMAIN;

	/**
	 * The operation id for the '<em>Create Serializable Edit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FEATURE_EDIT___CREATE_SERIALIZABLE_EDIT__URI = ABSTRACT_MODEL_EDIT___CREATE_SERIALIZABLE_EDIT__URI;

	/**
	 * The operation id for the '<em>Get Structural Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FEATURE_EDIT___GET_STRUCTURAL_FEATURE = ABSTRACT_MODEL_EDIT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FEATURE_EDIT___GET_VALUE = ABSTRACT_MODEL_EDIT_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Abstract Feature Edit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FEATURE_EDIT_OPERATION_COUNT = ABSTRACT_MODEL_EDIT_OPERATION_COUNT + 2;

	/**
	 * The feature id for the '<em><b>EObject</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ATTRIBUTE_EDIT__EOBJECT = ABSTRACT_FEATURE_EDIT__EOBJECT;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ATTRIBUTE_EDIT__FEATURE = ABSTRACT_FEATURE_EDIT__FEATURE;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ATTRIBUTE_EDIT__INDEX = ABSTRACT_FEATURE_EDIT__INDEX;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ATTRIBUTE_EDIT__VALUE = ABSTRACT_FEATURE_EDIT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Abstract Attribute Edit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ATTRIBUTE_EDIT_FEATURE_COUNT = ABSTRACT_FEATURE_EDIT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Perform Edit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ATTRIBUTE_EDIT___PERFORM_EDIT = ABSTRACT_FEATURE_EDIT___PERFORM_EDIT;

	/**
	 * The operation id for the '<em>Create Edit Command</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ATTRIBUTE_EDIT___CREATE_EDIT_COMMAND__EDITINGDOMAIN = ABSTRACT_FEATURE_EDIT___CREATE_EDIT_COMMAND__EDITINGDOMAIN;

	/**
	 * The operation id for the '<em>Create Serializable Edit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ATTRIBUTE_EDIT___CREATE_SERIALIZABLE_EDIT__URI = ABSTRACT_FEATURE_EDIT___CREATE_SERIALIZABLE_EDIT__URI;

	/**
	 * The operation id for the '<em>Get Structural Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ATTRIBUTE_EDIT___GET_STRUCTURAL_FEATURE = ABSTRACT_FEATURE_EDIT___GET_STRUCTURAL_FEATURE;

	/**
	 * The operation id for the '<em>Get Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ATTRIBUTE_EDIT___GET_VALUE = ABSTRACT_FEATURE_EDIT___GET_VALUE;

	/**
	 * The number of operations of the '<em>Abstract Attribute Edit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ATTRIBUTE_EDIT_OPERATION_COUNT = ABSTRACT_FEATURE_EDIT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>EObject</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_REFERENCE_EDIT__EOBJECT = ABSTRACT_FEATURE_EDIT__EOBJECT;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_REFERENCE_EDIT__FEATURE = ABSTRACT_FEATURE_EDIT__FEATURE;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_REFERENCE_EDIT__INDEX = ABSTRACT_FEATURE_EDIT__INDEX;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_REFERENCE_EDIT__VALUE = ABSTRACT_FEATURE_EDIT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Abstract Reference Edit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_REFERENCE_EDIT_FEATURE_COUNT = ABSTRACT_FEATURE_EDIT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Perform Edit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_REFERENCE_EDIT___PERFORM_EDIT = ABSTRACT_FEATURE_EDIT___PERFORM_EDIT;

	/**
	 * The operation id for the '<em>Create Edit Command</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_REFERENCE_EDIT___CREATE_EDIT_COMMAND__EDITINGDOMAIN = ABSTRACT_FEATURE_EDIT___CREATE_EDIT_COMMAND__EDITINGDOMAIN;

	/**
	 * The operation id for the '<em>Create Serializable Edit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_REFERENCE_EDIT___CREATE_SERIALIZABLE_EDIT__URI = ABSTRACT_FEATURE_EDIT___CREATE_SERIALIZABLE_EDIT__URI;

	/**
	 * The operation id for the '<em>Get Structural Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_REFERENCE_EDIT___GET_STRUCTURAL_FEATURE = ABSTRACT_FEATURE_EDIT___GET_STRUCTURAL_FEATURE;

	/**
	 * The operation id for the '<em>Get Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_REFERENCE_EDIT___GET_VALUE = ABSTRACT_FEATURE_EDIT___GET_VALUE;

	/**
	 * The number of operations of the '<em>Abstract Reference Edit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_REFERENCE_EDIT_OPERATION_COUNT = ABSTRACT_FEATURE_EDIT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>EObject</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_FEATURE_EDIT__EOBJECT = ABSTRACT_FEATURE_EDIT__EOBJECT;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_FEATURE_EDIT__FEATURE = ABSTRACT_FEATURE_EDIT__FEATURE;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_FEATURE_EDIT__INDEX = ABSTRACT_FEATURE_EDIT__INDEX;

	/**
	 * The number of structural features of the '<em>Set Feature Edit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_FEATURE_EDIT_FEATURE_COUNT = ABSTRACT_FEATURE_EDIT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Perform Edit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_FEATURE_EDIT___PERFORM_EDIT = ABSTRACT_FEATURE_EDIT___PERFORM_EDIT;

	/**
	 * The operation id for the '<em>Create Edit Command</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_FEATURE_EDIT___CREATE_EDIT_COMMAND__EDITINGDOMAIN = ABSTRACT_FEATURE_EDIT___CREATE_EDIT_COMMAND__EDITINGDOMAIN;

	/**
	 * The operation id for the '<em>Create Serializable Edit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_FEATURE_EDIT___CREATE_SERIALIZABLE_EDIT__URI = ABSTRACT_FEATURE_EDIT___CREATE_SERIALIZABLE_EDIT__URI;

	/**
	 * The operation id for the '<em>Get Structural Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_FEATURE_EDIT___GET_STRUCTURAL_FEATURE = ABSTRACT_FEATURE_EDIT___GET_STRUCTURAL_FEATURE;

	/**
	 * The operation id for the '<em>Get Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_FEATURE_EDIT___GET_VALUE = ABSTRACT_FEATURE_EDIT___GET_VALUE;

	/**
	 * The number of operations of the '<em>Set Feature Edit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_FEATURE_EDIT_OPERATION_COUNT = ABSTRACT_FEATURE_EDIT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>EObject</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_ATTRIBUTE_EDIT__EOBJECT = SET_FEATURE_EDIT__EOBJECT;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_ATTRIBUTE_EDIT__FEATURE = SET_FEATURE_EDIT__FEATURE;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_ATTRIBUTE_EDIT__INDEX = SET_FEATURE_EDIT__INDEX;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_ATTRIBUTE_EDIT__VALUE = SET_FEATURE_EDIT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Set Attribute Edit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_ATTRIBUTE_EDIT_FEATURE_COUNT = SET_FEATURE_EDIT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Perform Edit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_ATTRIBUTE_EDIT___PERFORM_EDIT = SET_FEATURE_EDIT___PERFORM_EDIT;

	/**
	 * The operation id for the '<em>Create Edit Command</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_ATTRIBUTE_EDIT___CREATE_EDIT_COMMAND__EDITINGDOMAIN = SET_FEATURE_EDIT___CREATE_EDIT_COMMAND__EDITINGDOMAIN;

	/**
	 * The operation id for the '<em>Create Serializable Edit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_ATTRIBUTE_EDIT___CREATE_SERIALIZABLE_EDIT__URI = SET_FEATURE_EDIT___CREATE_SERIALIZABLE_EDIT__URI;

	/**
	 * The operation id for the '<em>Get Structural Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_ATTRIBUTE_EDIT___GET_STRUCTURAL_FEATURE = SET_FEATURE_EDIT___GET_STRUCTURAL_FEATURE;

	/**
	 * The operation id for the '<em>Get Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_ATTRIBUTE_EDIT___GET_VALUE = SET_FEATURE_EDIT___GET_VALUE;

	/**
	 * The number of operations of the '<em>Set Attribute Edit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_ATTRIBUTE_EDIT_OPERATION_COUNT = SET_FEATURE_EDIT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>EObject</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_REFERENCE_EDIT__EOBJECT = SET_FEATURE_EDIT__EOBJECT;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_REFERENCE_EDIT__FEATURE = SET_FEATURE_EDIT__FEATURE;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_REFERENCE_EDIT__INDEX = SET_FEATURE_EDIT__INDEX;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_REFERENCE_EDIT__VALUE = SET_FEATURE_EDIT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Set Reference Edit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_REFERENCE_EDIT_FEATURE_COUNT = SET_FEATURE_EDIT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Perform Edit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_REFERENCE_EDIT___PERFORM_EDIT = SET_FEATURE_EDIT___PERFORM_EDIT;

	/**
	 * The operation id for the '<em>Create Edit Command</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_REFERENCE_EDIT___CREATE_EDIT_COMMAND__EDITINGDOMAIN = SET_FEATURE_EDIT___CREATE_EDIT_COMMAND__EDITINGDOMAIN;

	/**
	 * The operation id for the '<em>Create Serializable Edit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_REFERENCE_EDIT___CREATE_SERIALIZABLE_EDIT__URI = SET_FEATURE_EDIT___CREATE_SERIALIZABLE_EDIT__URI;

	/**
	 * The operation id for the '<em>Get Structural Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_REFERENCE_EDIT___GET_STRUCTURAL_FEATURE = SET_FEATURE_EDIT___GET_STRUCTURAL_FEATURE;

	/**
	 * The operation id for the '<em>Get Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_REFERENCE_EDIT___GET_VALUE = SET_FEATURE_EDIT___GET_VALUE;

	/**
	 * The number of operations of the '<em>Set Reference Edit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_REFERENCE_EDIT_OPERATION_COUNT = SET_FEATURE_EDIT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>EObject</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_FEATURE_EDIT__EOBJECT = ABSTRACT_FEATURE_EDIT__EOBJECT;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_FEATURE_EDIT__FEATURE = ABSTRACT_FEATURE_EDIT__FEATURE;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_FEATURE_EDIT__INDEX = ABSTRACT_FEATURE_EDIT__INDEX;

	/**
	 * The number of structural features of the '<em>Add Feature Edit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_FEATURE_EDIT_FEATURE_COUNT = ABSTRACT_FEATURE_EDIT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Perform Edit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_FEATURE_EDIT___PERFORM_EDIT = ABSTRACT_FEATURE_EDIT___PERFORM_EDIT;

	/**
	 * The operation id for the '<em>Create Edit Command</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_FEATURE_EDIT___CREATE_EDIT_COMMAND__EDITINGDOMAIN = ABSTRACT_FEATURE_EDIT___CREATE_EDIT_COMMAND__EDITINGDOMAIN;

	/**
	 * The operation id for the '<em>Create Serializable Edit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_FEATURE_EDIT___CREATE_SERIALIZABLE_EDIT__URI = ABSTRACT_FEATURE_EDIT___CREATE_SERIALIZABLE_EDIT__URI;

	/**
	 * The operation id for the '<em>Get Structural Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_FEATURE_EDIT___GET_STRUCTURAL_FEATURE = ABSTRACT_FEATURE_EDIT___GET_STRUCTURAL_FEATURE;

	/**
	 * The operation id for the '<em>Get Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_FEATURE_EDIT___GET_VALUE = ABSTRACT_FEATURE_EDIT___GET_VALUE;

	/**
	 * The number of operations of the '<em>Add Feature Edit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_FEATURE_EDIT_OPERATION_COUNT = ABSTRACT_FEATURE_EDIT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>EObject</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_ATTRIBUTE_EDIT__EOBJECT = ADD_FEATURE_EDIT__EOBJECT;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_ATTRIBUTE_EDIT__FEATURE = ADD_FEATURE_EDIT__FEATURE;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_ATTRIBUTE_EDIT__INDEX = ADD_FEATURE_EDIT__INDEX;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_ATTRIBUTE_EDIT__VALUE = ADD_FEATURE_EDIT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Add Attribute Edit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_ATTRIBUTE_EDIT_FEATURE_COUNT = ADD_FEATURE_EDIT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Perform Edit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_ATTRIBUTE_EDIT___PERFORM_EDIT = ADD_FEATURE_EDIT___PERFORM_EDIT;

	/**
	 * The operation id for the '<em>Create Edit Command</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_ATTRIBUTE_EDIT___CREATE_EDIT_COMMAND__EDITINGDOMAIN = ADD_FEATURE_EDIT___CREATE_EDIT_COMMAND__EDITINGDOMAIN;

	/**
	 * The operation id for the '<em>Create Serializable Edit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_ATTRIBUTE_EDIT___CREATE_SERIALIZABLE_EDIT__URI = ADD_FEATURE_EDIT___CREATE_SERIALIZABLE_EDIT__URI;

	/**
	 * The operation id for the '<em>Get Structural Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_ATTRIBUTE_EDIT___GET_STRUCTURAL_FEATURE = ADD_FEATURE_EDIT___GET_STRUCTURAL_FEATURE;

	/**
	 * The operation id for the '<em>Get Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_ATTRIBUTE_EDIT___GET_VALUE = ADD_FEATURE_EDIT___GET_VALUE;

	/**
	 * The number of operations of the '<em>Add Attribute Edit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_ATTRIBUTE_EDIT_OPERATION_COUNT = ADD_FEATURE_EDIT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>EObject</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_REFERENCE_EDIT__EOBJECT = ADD_FEATURE_EDIT__EOBJECT;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_REFERENCE_EDIT__FEATURE = ADD_FEATURE_EDIT__FEATURE;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_REFERENCE_EDIT__INDEX = ADD_FEATURE_EDIT__INDEX;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_REFERENCE_EDIT__VALUE = ADD_FEATURE_EDIT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Add Reference Edit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_REFERENCE_EDIT_FEATURE_COUNT = ADD_FEATURE_EDIT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Perform Edit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_REFERENCE_EDIT___PERFORM_EDIT = ADD_FEATURE_EDIT___PERFORM_EDIT;

	/**
	 * The operation id for the '<em>Create Edit Command</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_REFERENCE_EDIT___CREATE_EDIT_COMMAND__EDITINGDOMAIN = ADD_FEATURE_EDIT___CREATE_EDIT_COMMAND__EDITINGDOMAIN;

	/**
	 * The operation id for the '<em>Create Serializable Edit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_REFERENCE_EDIT___CREATE_SERIALIZABLE_EDIT__URI = ADD_FEATURE_EDIT___CREATE_SERIALIZABLE_EDIT__URI;

	/**
	 * The operation id for the '<em>Get Structural Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_REFERENCE_EDIT___GET_STRUCTURAL_FEATURE = ADD_FEATURE_EDIT___GET_STRUCTURAL_FEATURE;

	/**
	 * The operation id for the '<em>Get Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_REFERENCE_EDIT___GET_VALUE = ADD_FEATURE_EDIT___GET_VALUE;

	/**
	 * The number of operations of the '<em>Add Reference Edit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_REFERENCE_EDIT_OPERATION_COUNT = ADD_FEATURE_EDIT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>EObject</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_FEATURE_EDIT__EOBJECT = ABSTRACT_FEATURE_EDIT__EOBJECT;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_FEATURE_EDIT__FEATURE = ABSTRACT_FEATURE_EDIT__FEATURE;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_FEATURE_EDIT__INDEX = ABSTRACT_FEATURE_EDIT__INDEX;

	/**
	 * The number of structural features of the '<em>Remove Feature Edit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_FEATURE_EDIT_FEATURE_COUNT = ABSTRACT_FEATURE_EDIT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Perform Edit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_FEATURE_EDIT___PERFORM_EDIT = ABSTRACT_FEATURE_EDIT___PERFORM_EDIT;

	/**
	 * The operation id for the '<em>Create Edit Command</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_FEATURE_EDIT___CREATE_EDIT_COMMAND__EDITINGDOMAIN = ABSTRACT_FEATURE_EDIT___CREATE_EDIT_COMMAND__EDITINGDOMAIN;

	/**
	 * The operation id for the '<em>Create Serializable Edit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_FEATURE_EDIT___CREATE_SERIALIZABLE_EDIT__URI = ABSTRACT_FEATURE_EDIT___CREATE_SERIALIZABLE_EDIT__URI;

	/**
	 * The operation id for the '<em>Get Structural Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_FEATURE_EDIT___GET_STRUCTURAL_FEATURE = ABSTRACT_FEATURE_EDIT___GET_STRUCTURAL_FEATURE;

	/**
	 * The operation id for the '<em>Get Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_FEATURE_EDIT___GET_VALUE = ABSTRACT_FEATURE_EDIT___GET_VALUE;

	/**
	 * The number of operations of the '<em>Remove Feature Edit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_FEATURE_EDIT_OPERATION_COUNT = ABSTRACT_FEATURE_EDIT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>EObject</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_EDIT__EOBJECT = ABSTRACT_MODEL_EDIT__EOBJECT;

	/**
	 * The feature id for the '<em><b>Change</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_EDIT__CHANGE = ABSTRACT_MODEL_EDIT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Change Edit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_EDIT_FEATURE_COUNT = ABSTRACT_MODEL_EDIT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Perform Edit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_EDIT___PERFORM_EDIT = ABSTRACT_MODEL_EDIT___PERFORM_EDIT;

	/**
	 * The operation id for the '<em>Create Edit Command</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_EDIT___CREATE_EDIT_COMMAND__EDITINGDOMAIN = ABSTRACT_MODEL_EDIT___CREATE_EDIT_COMMAND__EDITINGDOMAIN;

	/**
	 * The operation id for the '<em>Create Serializable Edit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_EDIT___CREATE_SERIALIZABLE_EDIT__URI = ABSTRACT_MODEL_EDIT___CREATE_SERIALIZABLE_EDIT__URI;

	/**
	 * The number of operations of the '<em>Change Edit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_EDIT_OPERATION_COUNT = ABSTRACT_MODEL_EDIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link no.hal.learning.sharing.ShareMode <em>Share Mode</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.learning.sharing.ShareMode
	 * @see no.hal.learning.sharing.impl.SharingPackageImpl#getShareMode()
	 * @generated
	 */
	int SHARE_MODE = 16;

	/**
	 * The meta object id for the '<em>EEditing Domain</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.edit.domain.EditingDomain
	 * @see no.hal.learning.sharing.impl.SharingPackageImpl#getEEditingDomain()
	 * @generated
	 */
	int EEDITING_DOMAIN = 17;

	/**
	 * The meta object id for the '<em>ECommand</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.command.Command
	 * @see no.hal.learning.sharing.impl.SharingPackageImpl#getECommand()
	 * @generated
	 */
	int ECOMMAND = 18;


	/**
	 * The meta object id for the '<em>EURI</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.URI
	 * @see no.hal.learning.sharing.impl.SharingPackageImpl#getEURI()
	 * @generated
	 */
	int EURI = 19;


	/**
	 * Returns the meta object for class '{@link no.hal.learning.sharing.AbstractShare <em>Abstract Share</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Share</em>'.
	 * @see no.hal.learning.sharing.AbstractShare
	 * @generated
	 */
	EClass getAbstractShare();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.learning.sharing.AbstractShare#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see no.hal.learning.sharing.AbstractShare#getName()
	 * @see #getAbstractShare()
	 * @generated
	 */
	EAttribute getAbstractShare_Name();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.learning.sharing.AbstractShare#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Owner</em>'.
	 * @see no.hal.learning.sharing.AbstractShare#getOwner()
	 * @see #getAbstractShare()
	 * @generated
	 */
	EAttribute getAbstractShare_Owner();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.learning.sharing.AbstractShare#getSharer <em>Sharer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sharer</em>'.
	 * @see no.hal.learning.sharing.AbstractShare#getSharer()
	 * @see #getAbstractShare()
	 * @generated
	 */
	EAttribute getAbstractShare_Sharer();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.learning.sharing.AbstractShare#getMode <em>Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mode</em>'.
	 * @see no.hal.learning.sharing.AbstractShare#getMode()
	 * @see #getAbstractShare()
	 * @generated
	 */
	EAttribute getAbstractShare_Mode();

	/**
	 * Returns the meta object for class '{@link no.hal.learning.sharing.ModelEdit <em>Model Edit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Edit</em>'.
	 * @see no.hal.learning.sharing.ModelEdit
	 * @generated
	 */
	EClass getModelEdit();

	/**
	 * Returns the meta object for the '{@link no.hal.learning.sharing.ModelEdit#performEdit() <em>Perform Edit</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform Edit</em>' operation.
	 * @see no.hal.learning.sharing.ModelEdit#performEdit()
	 * @generated
	 */
	EOperation getModelEdit__PerformEdit();

	/**
	 * Returns the meta object for the '{@link no.hal.learning.sharing.ModelEdit#createEditCommand(org.eclipse.emf.edit.domain.EditingDomain) <em>Create Edit Command</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Edit Command</em>' operation.
	 * @see no.hal.learning.sharing.ModelEdit#createEditCommand(org.eclipse.emf.edit.domain.EditingDomain)
	 * @generated
	 */
	EOperation getModelEdit__CreateEditCommand__EditingDomain();

	/**
	 * Returns the meta object for the '{@link no.hal.learning.sharing.ModelEdit#createSerializableEdit(org.eclipse.emf.common.util.URI) <em>Create Serializable Edit</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Serializable Edit</em>' operation.
	 * @see no.hal.learning.sharing.ModelEdit#createSerializableEdit(org.eclipse.emf.common.util.URI)
	 * @generated
	 */
	EOperation getModelEdit__CreateSerializableEdit__URI();

	/**
	 * Returns the meta object for class '{@link no.hal.learning.sharing.AbstractModelEdit <em>Abstract Model Edit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Model Edit</em>'.
	 * @see no.hal.learning.sharing.AbstractModelEdit
	 * @generated
	 */
	EClass getAbstractModelEdit();

	/**
	 * Returns the meta object for the reference '{@link no.hal.learning.sharing.AbstractModelEdit#getEObject <em>EObject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EObject</em>'.
	 * @see no.hal.learning.sharing.AbstractModelEdit#getEObject()
	 * @see #getAbstractModelEdit()
	 * @generated
	 */
	EReference getAbstractModelEdit_EObject();

	/**
	 * Returns the meta object for class '{@link no.hal.learning.sharing.AbstractFeatureEdit <em>Abstract Feature Edit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Feature Edit</em>'.
	 * @see no.hal.learning.sharing.AbstractFeatureEdit
	 * @generated
	 */
	EClass getAbstractFeatureEdit();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.learning.sharing.AbstractFeatureEdit#getFeature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Feature</em>'.
	 * @see no.hal.learning.sharing.AbstractFeatureEdit#getFeature()
	 * @see #getAbstractFeatureEdit()
	 * @generated
	 */
	EAttribute getAbstractFeatureEdit_Feature();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.learning.sharing.AbstractFeatureEdit#getIndex <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Index</em>'.
	 * @see no.hal.learning.sharing.AbstractFeatureEdit#getIndex()
	 * @see #getAbstractFeatureEdit()
	 * @generated
	 */
	EAttribute getAbstractFeatureEdit_Index();

	/**
	 * Returns the meta object for the '{@link no.hal.learning.sharing.AbstractFeatureEdit#getStructuralFeature() <em>Get Structural Feature</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Structural Feature</em>' operation.
	 * @see no.hal.learning.sharing.AbstractFeatureEdit#getStructuralFeature()
	 * @generated
	 */
	EOperation getAbstractFeatureEdit__GetStructuralFeature();

	/**
	 * Returns the meta object for the '{@link no.hal.learning.sharing.AbstractFeatureEdit#getValue() <em>Get Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Value</em>' operation.
	 * @see no.hal.learning.sharing.AbstractFeatureEdit#getValue()
	 * @generated
	 */
	EOperation getAbstractFeatureEdit__GetValue();

	/**
	 * Returns the meta object for class '{@link no.hal.learning.sharing.AbstractAttributeEdit <em>Abstract Attribute Edit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Attribute Edit</em>'.
	 * @see no.hal.learning.sharing.AbstractAttributeEdit
	 * @generated
	 */
	EClass getAbstractAttributeEdit();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.learning.sharing.AbstractAttributeEdit#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see no.hal.learning.sharing.AbstractAttributeEdit#getValue()
	 * @see #getAbstractAttributeEdit()
	 * @generated
	 */
	EAttribute getAbstractAttributeEdit_Value();

	/**
	 * Returns the meta object for class '{@link no.hal.learning.sharing.AbstractReferenceEdit <em>Abstract Reference Edit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Reference Edit</em>'.
	 * @see no.hal.learning.sharing.AbstractReferenceEdit
	 * @generated
	 */
	EClass getAbstractReferenceEdit();

	/**
	 * Returns the meta object for the reference '{@link no.hal.learning.sharing.AbstractReferenceEdit#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see no.hal.learning.sharing.AbstractReferenceEdit#getValue()
	 * @see #getAbstractReferenceEdit()
	 * @generated
	 */
	EReference getAbstractReferenceEdit_Value();

	/**
	 * Returns the meta object for class '{@link no.hal.learning.sharing.SetFeatureEdit <em>Set Feature Edit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Set Feature Edit</em>'.
	 * @see no.hal.learning.sharing.SetFeatureEdit
	 * @generated
	 */
	EClass getSetFeatureEdit();

	/**
	 * Returns the meta object for class '{@link no.hal.learning.sharing.SetAttributeEdit <em>Set Attribute Edit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Set Attribute Edit</em>'.
	 * @see no.hal.learning.sharing.SetAttributeEdit
	 * @generated
	 */
	EClass getSetAttributeEdit();

	/**
	 * Returns the meta object for class '{@link no.hal.learning.sharing.SetReferenceEdit <em>Set Reference Edit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Set Reference Edit</em>'.
	 * @see no.hal.learning.sharing.SetReferenceEdit
	 * @generated
	 */
	EClass getSetReferenceEdit();

	/**
	 * Returns the meta object for class '{@link no.hal.learning.sharing.AddFeatureEdit <em>Add Feature Edit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Add Feature Edit</em>'.
	 * @see no.hal.learning.sharing.AddFeatureEdit
	 * @generated
	 */
	EClass getAddFeatureEdit();

	/**
	 * Returns the meta object for class '{@link no.hal.learning.sharing.AddAttributeEdit <em>Add Attribute Edit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Add Attribute Edit</em>'.
	 * @see no.hal.learning.sharing.AddAttributeEdit
	 * @generated
	 */
	EClass getAddAttributeEdit();

	/**
	 * Returns the meta object for class '{@link no.hal.learning.sharing.AddReferenceEdit <em>Add Reference Edit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Add Reference Edit</em>'.
	 * @see no.hal.learning.sharing.AddReferenceEdit
	 * @generated
	 */
	EClass getAddReferenceEdit();

	/**
	 * Returns the meta object for class '{@link no.hal.learning.sharing.RemoveFeatureEdit <em>Remove Feature Edit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Remove Feature Edit</em>'.
	 * @see no.hal.learning.sharing.RemoveFeatureEdit
	 * @generated
	 */
	EClass getRemoveFeatureEdit();

	/**
	 * Returns the meta object for class '{@link no.hal.learning.sharing.ChangeEdit <em>Change Edit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Change Edit</em>'.
	 * @see no.hal.learning.sharing.ChangeEdit
	 * @generated
	 */
	EClass getChangeEdit();

	/**
	 * Returns the meta object for the containment reference '{@link no.hal.learning.sharing.ChangeEdit#getChange <em>Change</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Change</em>'.
	 * @see no.hal.learning.sharing.ChangeEdit#getChange()
	 * @see #getChangeEdit()
	 * @generated
	 */
	EReference getChangeEdit_Change();

	/**
	 * Returns the meta object for enum '{@link no.hal.learning.sharing.ShareMode <em>Share Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Share Mode</em>'.
	 * @see no.hal.learning.sharing.ShareMode
	 * @generated
	 */
	EEnum getShareMode();

	/**
	 * Returns the meta object for class '{@link no.hal.learning.sharing.ShareModel <em>Share Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Share Model</em>'.
	 * @see no.hal.learning.sharing.ShareModel
	 * @generated
	 */
	EClass getShareModel();

	/**
	 * Returns the meta object for the reference list '{@link no.hal.learning.sharing.ShareModel#getEObjects <em>EObjects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>EObjects</em>'.
	 * @see no.hal.learning.sharing.ShareModel#getEObjects()
	 * @see #getShareModel()
	 * @generated
	 */
	EReference getShareModel_EObjects();

	/**
	 * Returns the meta object for class '{@link no.hal.learning.sharing.ShareEdits <em>Share Edits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Share Edits</em>'.
	 * @see no.hal.learning.sharing.ShareEdits
	 * @generated
	 */
	EClass getShareEdits();

	/**
	 * Returns the meta object for the containment reference list '{@link no.hal.learning.sharing.ShareEdits#getEdits <em>Edits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Edits</em>'.
	 * @see no.hal.learning.sharing.ShareEdits#getEdits()
	 * @see #getShareEdits()
	 * @generated
	 */
	EReference getShareEdits_Edits();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.emf.edit.domain.EditingDomain <em>EEditing Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>EEditing Domain</em>'.
	 * @see org.eclipse.emf.edit.domain.EditingDomain
	 * @model instanceClass="org.eclipse.emf.edit.domain.EditingDomain" serializeable="false"
	 * @generated
	 */
	EDataType getEEditingDomain();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.emf.common.command.Command <em>ECommand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>ECommand</em>'.
	 * @see org.eclipse.emf.common.command.Command
	 * @model instanceClass="org.eclipse.emf.common.command.Command" serializeable="false"
	 * @generated
	 */
	EDataType getECommand();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.emf.common.util.URI <em>EURI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>EURI</em>'.
	 * @see org.eclipse.emf.common.util.URI
	 * @model instanceClass="org.eclipse.emf.common.util.URI"
	 * @generated
	 */
	EDataType getEURI();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SharingFactory getSharingFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link no.hal.learning.sharing.impl.AbstractShareImpl <em>Abstract Share</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.learning.sharing.impl.AbstractShareImpl
		 * @see no.hal.learning.sharing.impl.SharingPackageImpl#getAbstractShare()
		 * @generated
		 */
		EClass ABSTRACT_SHARE = eINSTANCE.getAbstractShare();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_SHARE__NAME = eINSTANCE.getAbstractShare_Name();

		/**
		 * The meta object literal for the '<em><b>Owner</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_SHARE__OWNER = eINSTANCE.getAbstractShare_Owner();

		/**
		 * The meta object literal for the '<em><b>Sharer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_SHARE__SHARER = eINSTANCE.getAbstractShare_Sharer();

		/**
		 * The meta object literal for the '<em><b>Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_SHARE__MODE = eINSTANCE.getAbstractShare_Mode();

		/**
		 * The meta object literal for the '{@link no.hal.learning.sharing.ModelEdit <em>Model Edit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.learning.sharing.ModelEdit
		 * @see no.hal.learning.sharing.impl.SharingPackageImpl#getModelEdit()
		 * @generated
		 */
		EClass MODEL_EDIT = eINSTANCE.getModelEdit();

		/**
		 * The meta object literal for the '<em><b>Perform Edit</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MODEL_EDIT___PERFORM_EDIT = eINSTANCE.getModelEdit__PerformEdit();

		/**
		 * The meta object literal for the '<em><b>Create Edit Command</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MODEL_EDIT___CREATE_EDIT_COMMAND__EDITINGDOMAIN = eINSTANCE.getModelEdit__CreateEditCommand__EditingDomain();

		/**
		 * The meta object literal for the '<em><b>Create Serializable Edit</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MODEL_EDIT___CREATE_SERIALIZABLE_EDIT__URI = eINSTANCE.getModelEdit__CreateSerializableEdit__URI();

		/**
		 * The meta object literal for the '{@link no.hal.learning.sharing.impl.AbstractModelEditImpl <em>Abstract Model Edit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.learning.sharing.impl.AbstractModelEditImpl
		 * @see no.hal.learning.sharing.impl.SharingPackageImpl#getAbstractModelEdit()
		 * @generated
		 */
		EClass ABSTRACT_MODEL_EDIT = eINSTANCE.getAbstractModelEdit();

		/**
		 * The meta object literal for the '<em><b>EObject</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_MODEL_EDIT__EOBJECT = eINSTANCE.getAbstractModelEdit_EObject();

		/**
		 * The meta object literal for the '{@link no.hal.learning.sharing.impl.AbstractFeatureEditImpl <em>Abstract Feature Edit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.learning.sharing.impl.AbstractFeatureEditImpl
		 * @see no.hal.learning.sharing.impl.SharingPackageImpl#getAbstractFeatureEdit()
		 * @generated
		 */
		EClass ABSTRACT_FEATURE_EDIT = eINSTANCE.getAbstractFeatureEdit();

		/**
		 * The meta object literal for the '<em><b>Feature</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_FEATURE_EDIT__FEATURE = eINSTANCE.getAbstractFeatureEdit_Feature();

		/**
		 * The meta object literal for the '<em><b>Index</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_FEATURE_EDIT__INDEX = eINSTANCE.getAbstractFeatureEdit_Index();

		/**
		 * The meta object literal for the '<em><b>Get Structural Feature</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_FEATURE_EDIT___GET_STRUCTURAL_FEATURE = eINSTANCE.getAbstractFeatureEdit__GetStructuralFeature();

		/**
		 * The meta object literal for the '<em><b>Get Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_FEATURE_EDIT___GET_VALUE = eINSTANCE.getAbstractFeatureEdit__GetValue();

		/**
		 * The meta object literal for the '{@link no.hal.learning.sharing.impl.AbstractAttributeEditImpl <em>Abstract Attribute Edit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.learning.sharing.impl.AbstractAttributeEditImpl
		 * @see no.hal.learning.sharing.impl.SharingPackageImpl#getAbstractAttributeEdit()
		 * @generated
		 */
		EClass ABSTRACT_ATTRIBUTE_EDIT = eINSTANCE.getAbstractAttributeEdit();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_ATTRIBUTE_EDIT__VALUE = eINSTANCE.getAbstractAttributeEdit_Value();

		/**
		 * The meta object literal for the '{@link no.hal.learning.sharing.impl.AbstractReferenceEditImpl <em>Abstract Reference Edit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.learning.sharing.impl.AbstractReferenceEditImpl
		 * @see no.hal.learning.sharing.impl.SharingPackageImpl#getAbstractReferenceEdit()
		 * @generated
		 */
		EClass ABSTRACT_REFERENCE_EDIT = eINSTANCE.getAbstractReferenceEdit();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_REFERENCE_EDIT__VALUE = eINSTANCE.getAbstractReferenceEdit_Value();

		/**
		 * The meta object literal for the '{@link no.hal.learning.sharing.impl.SetFeatureEditImpl <em>Set Feature Edit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.learning.sharing.impl.SetFeatureEditImpl
		 * @see no.hal.learning.sharing.impl.SharingPackageImpl#getSetFeatureEdit()
		 * @generated
		 */
		EClass SET_FEATURE_EDIT = eINSTANCE.getSetFeatureEdit();

		/**
		 * The meta object literal for the '{@link no.hal.learning.sharing.impl.SetAttributeEditImpl <em>Set Attribute Edit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.learning.sharing.impl.SetAttributeEditImpl
		 * @see no.hal.learning.sharing.impl.SharingPackageImpl#getSetAttributeEdit()
		 * @generated
		 */
		EClass SET_ATTRIBUTE_EDIT = eINSTANCE.getSetAttributeEdit();

		/**
		 * The meta object literal for the '{@link no.hal.learning.sharing.impl.SetReferenceEditImpl <em>Set Reference Edit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.learning.sharing.impl.SetReferenceEditImpl
		 * @see no.hal.learning.sharing.impl.SharingPackageImpl#getSetReferenceEdit()
		 * @generated
		 */
		EClass SET_REFERENCE_EDIT = eINSTANCE.getSetReferenceEdit();

		/**
		 * The meta object literal for the '{@link no.hal.learning.sharing.impl.AddFeatureEditImpl <em>Add Feature Edit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.learning.sharing.impl.AddFeatureEditImpl
		 * @see no.hal.learning.sharing.impl.SharingPackageImpl#getAddFeatureEdit()
		 * @generated
		 */
		EClass ADD_FEATURE_EDIT = eINSTANCE.getAddFeatureEdit();

		/**
		 * The meta object literal for the '{@link no.hal.learning.sharing.impl.AddAttributeEditImpl <em>Add Attribute Edit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.learning.sharing.impl.AddAttributeEditImpl
		 * @see no.hal.learning.sharing.impl.SharingPackageImpl#getAddAttributeEdit()
		 * @generated
		 */
		EClass ADD_ATTRIBUTE_EDIT = eINSTANCE.getAddAttributeEdit();

		/**
		 * The meta object literal for the '{@link no.hal.learning.sharing.impl.AddReferenceEditImpl <em>Add Reference Edit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.learning.sharing.impl.AddReferenceEditImpl
		 * @see no.hal.learning.sharing.impl.SharingPackageImpl#getAddReferenceEdit()
		 * @generated
		 */
		EClass ADD_REFERENCE_EDIT = eINSTANCE.getAddReferenceEdit();

		/**
		 * The meta object literal for the '{@link no.hal.learning.sharing.impl.RemoveFeatureEditImpl <em>Remove Feature Edit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.learning.sharing.impl.RemoveFeatureEditImpl
		 * @see no.hal.learning.sharing.impl.SharingPackageImpl#getRemoveFeatureEdit()
		 * @generated
		 */
		EClass REMOVE_FEATURE_EDIT = eINSTANCE.getRemoveFeatureEdit();

		/**
		 * The meta object literal for the '{@link no.hal.learning.sharing.impl.ChangeEditImpl <em>Change Edit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.learning.sharing.impl.ChangeEditImpl
		 * @see no.hal.learning.sharing.impl.SharingPackageImpl#getChangeEdit()
		 * @generated
		 */
		EClass CHANGE_EDIT = eINSTANCE.getChangeEdit();

		/**
		 * The meta object literal for the '<em><b>Change</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHANGE_EDIT__CHANGE = eINSTANCE.getChangeEdit_Change();

		/**
		 * The meta object literal for the '{@link no.hal.learning.sharing.ShareMode <em>Share Mode</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.learning.sharing.ShareMode
		 * @see no.hal.learning.sharing.impl.SharingPackageImpl#getShareMode()
		 * @generated
		 */
		EEnum SHARE_MODE = eINSTANCE.getShareMode();

		/**
		 * The meta object literal for the '{@link no.hal.learning.sharing.impl.ShareModelImpl <em>Share Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.learning.sharing.impl.ShareModelImpl
		 * @see no.hal.learning.sharing.impl.SharingPackageImpl#getShareModel()
		 * @generated
		 */
		EClass SHARE_MODEL = eINSTANCE.getShareModel();

		/**
		 * The meta object literal for the '<em><b>EObjects</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHARE_MODEL__EOBJECTS = eINSTANCE.getShareModel_EObjects();

		/**
		 * The meta object literal for the '{@link no.hal.learning.sharing.impl.ShareEditsImpl <em>Share Edits</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.learning.sharing.impl.ShareEditsImpl
		 * @see no.hal.learning.sharing.impl.SharingPackageImpl#getShareEdits()
		 * @generated
		 */
		EClass SHARE_EDITS = eINSTANCE.getShareEdits();

		/**
		 * The meta object literal for the '<em><b>Edits</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHARE_EDITS__EDITS = eINSTANCE.getShareEdits_Edits();

		/**
		 * The meta object literal for the '<em>EEditing Domain</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.edit.domain.EditingDomain
		 * @see no.hal.learning.sharing.impl.SharingPackageImpl#getEEditingDomain()
		 * @generated
		 */
		EDataType EEDITING_DOMAIN = eINSTANCE.getEEditingDomain();

		/**
		 * The meta object literal for the '<em>ECommand</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.common.command.Command
		 * @see no.hal.learning.sharing.impl.SharingPackageImpl#getECommand()
		 * @generated
		 */
		EDataType ECOMMAND = eINSTANCE.getECommand();

		/**
		 * The meta object literal for the '<em>EURI</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.common.util.URI
		 * @see no.hal.learning.sharing.impl.SharingPackageImpl#getEURI()
		 * @generated
		 */
		EDataType EURI = eINSTANCE.getEURI();

	}

} //SharingPackage
