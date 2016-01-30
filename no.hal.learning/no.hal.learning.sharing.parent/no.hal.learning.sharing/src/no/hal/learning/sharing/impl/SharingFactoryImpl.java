/**
 */
package no.hal.learning.sharing.impl;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import no.hal.learning.sharing.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SharingFactoryImpl extends EFactoryImpl implements SharingFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SharingFactory init() {
		try {
			SharingFactory theSharingFactory = (SharingFactory)EPackage.Registry.INSTANCE.getEFactory(SharingPackage.eNS_URI);
			if (theSharingFactory != null) {
				return theSharingFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SharingFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SharingFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case SharingPackage.ABSTRACT_SHARE: return createAbstractShare();
			case SharingPackage.SHARE_MODEL: return createShareModel();
			case SharingPackage.SHARE_EDITS: return createShareEdits();
			case SharingPackage.ABSTRACT_ATTRIBUTE_EDIT: return createAbstractAttributeEdit();
			case SharingPackage.ABSTRACT_REFERENCE_EDIT: return createAbstractReferenceEdit();
			case SharingPackage.SET_ATTRIBUTE_EDIT: return createSetAttributeEdit();
			case SharingPackage.SET_REFERENCE_EDIT: return createSetReferenceEdit();
			case SharingPackage.ADD_ATTRIBUTE_EDIT: return createAddAttributeEdit();
			case SharingPackage.ADD_REFERENCE_EDIT: return createAddReferenceEdit();
			case SharingPackage.REMOVE_FEATURE_EDIT: return createRemoveFeatureEdit();
			case SharingPackage.CHANGE_EDIT: return createChangeEdit();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case SharingPackage.SHARE_MODE:
				return createShareModeFromString(eDataType, initialValue);
			case SharingPackage.EURI:
				return createEURIFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case SharingPackage.SHARE_MODE:
				return convertShareModeToString(eDataType, instanceValue);
			case SharingPackage.EURI:
				return convertEURIToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractShare createAbstractShare() {
		AbstractShareImpl abstractShare = new AbstractShareImpl();
		return abstractShare;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractAttributeEdit createAbstractAttributeEdit() {
		AbstractAttributeEditImpl abstractAttributeEdit = new AbstractAttributeEditImpl();
		return abstractAttributeEdit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractReferenceEdit createAbstractReferenceEdit() {
		AbstractReferenceEditImpl abstractReferenceEdit = new AbstractReferenceEditImpl();
		return abstractReferenceEdit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SetAttributeEdit createSetAttributeEdit() {
		SetAttributeEditImpl setAttributeEdit = new SetAttributeEditImpl();
		return setAttributeEdit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SetReferenceEdit createSetReferenceEdit() {
		SetReferenceEditImpl setReferenceEdit = new SetReferenceEditImpl();
		return setReferenceEdit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddAttributeEdit createAddAttributeEdit() {
		AddAttributeEditImpl addAttributeEdit = new AddAttributeEditImpl();
		return addAttributeEdit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddReferenceEdit createAddReferenceEdit() {
		AddReferenceEditImpl addReferenceEdit = new AddReferenceEditImpl();
		return addReferenceEdit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RemoveFeatureEdit createRemoveFeatureEdit() {
		RemoveFeatureEditImpl removeFeatureEdit = new RemoveFeatureEditImpl();
		return removeFeatureEdit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeEdit createChangeEdit() {
		ChangeEditImpl changeEdit = new ChangeEditImpl();
		return changeEdit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShareMode createShareModeFromString(EDataType eDataType, String initialValue) {
		ShareMode result = ShareMode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertShareModeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShareModel createShareModel() {
		ShareModelImpl shareModel = new ShareModelImpl();
		return shareModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShareEdits createShareEdits() {
		ShareEditsImpl shareEdits = new ShareEditsImpl();
		return shareEdits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public URI createEURIFromString(EDataType eDataType, String initialValue) {
		return (URI)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEURIToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SharingPackage getSharingPackage() {
		return (SharingPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SharingPackage getPackage() {
		return SharingPackage.eINSTANCE;
	}

} //SharingFactoryImpl
