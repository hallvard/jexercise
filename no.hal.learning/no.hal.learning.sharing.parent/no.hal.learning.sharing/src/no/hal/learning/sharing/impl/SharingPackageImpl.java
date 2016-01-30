/**
 */
package no.hal.learning.sharing.impl;

import org.eclipse.emf.common.command.Command;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.change.ChangePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.edit.domain.EditingDomain;

import no.hal.learning.sharing.AbstractAttributeEdit;
import no.hal.learning.sharing.AbstractFeatureEdit;
import no.hal.learning.sharing.AbstractModelEdit;
import no.hal.learning.sharing.AbstractReferenceEdit;
import no.hal.learning.sharing.AbstractShare;
import no.hal.learning.sharing.AddAttributeEdit;
import no.hal.learning.sharing.AddFeatureEdit;
import no.hal.learning.sharing.AddReferenceEdit;
import no.hal.learning.sharing.ChangeEdit;
import no.hal.learning.sharing.ModelEdit;
import no.hal.learning.sharing.RemoveFeatureEdit;
import no.hal.learning.sharing.SetAttributeEdit;
import no.hal.learning.sharing.SetFeatureEdit;
import no.hal.learning.sharing.SetReferenceEdit;
import no.hal.learning.sharing.ShareEdits;
import no.hal.learning.sharing.ShareMode;
import no.hal.learning.sharing.ShareModel;
import no.hal.learning.sharing.SharingFactory;
import no.hal.learning.sharing.SharingPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SharingPackageImpl extends EPackageImpl implements SharingPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractShareEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelEditEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractModelEditEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractFeatureEditEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractAttributeEditEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractReferenceEditEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass setFeatureEditEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass setAttributeEditEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass setReferenceEditEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addFeatureEditEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addAttributeEditEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addReferenceEditEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass removeFeatureEditEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass changeEditEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum shareModeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass shareModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass shareEditsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType eEditingDomainEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType eCommandEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType euriEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see no.hal.learning.sharing.SharingPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SharingPackageImpl() {
		super(eNS_URI, SharingFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link SharingPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SharingPackage init() {
		if (isInited) return (SharingPackage)EPackage.Registry.INSTANCE.getEPackage(SharingPackage.eNS_URI);

		// Obtain or create and register package
		SharingPackageImpl theSharingPackage = (SharingPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SharingPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SharingPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		ChangePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theSharingPackage.createPackageContents();

		// Initialize created meta-data
		theSharingPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSharingPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SharingPackage.eNS_URI, theSharingPackage);
		return theSharingPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractShare() {
		return abstractShareEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractShare_Name() {
		return (EAttribute)abstractShareEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractShare_Owner() {
		return (EAttribute)abstractShareEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractShare_Sharer() {
		return (EAttribute)abstractShareEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractShare_Mode() {
		return (EAttribute)abstractShareEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModelEdit() {
		return modelEditEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getModelEdit__PerformEdit() {
		return modelEditEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getModelEdit__CreateEditCommand__EditingDomain() {
		return modelEditEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getModelEdit__CreateSerializableEdit__URI() {
		return modelEditEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractModelEdit() {
		return abstractModelEditEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractModelEdit_EObject() {
		return (EReference)abstractModelEditEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractFeatureEdit() {
		return abstractFeatureEditEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractFeatureEdit_Feature() {
		return (EAttribute)abstractFeatureEditEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractFeatureEdit_Index() {
		return (EAttribute)abstractFeatureEditEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractFeatureEdit__GetStructuralFeature() {
		return abstractFeatureEditEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractFeatureEdit__GetValue() {
		return abstractFeatureEditEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractAttributeEdit() {
		return abstractAttributeEditEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractAttributeEdit_Value() {
		return (EAttribute)abstractAttributeEditEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractReferenceEdit() {
		return abstractReferenceEditEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractReferenceEdit_Value() {
		return (EReference)abstractReferenceEditEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSetFeatureEdit() {
		return setFeatureEditEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSetAttributeEdit() {
		return setAttributeEditEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSetReferenceEdit() {
		return setReferenceEditEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAddFeatureEdit() {
		return addFeatureEditEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAddAttributeEdit() {
		return addAttributeEditEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAddReferenceEdit() {
		return addReferenceEditEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRemoveFeatureEdit() {
		return removeFeatureEditEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChangeEdit() {
		return changeEditEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChangeEdit_Change() {
		return (EReference)changeEditEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getShareMode() {
		return shareModeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getShareModel() {
		return shareModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getShareModel_EObjects() {
		return (EReference)shareModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getShareEdits() {
		return shareEditsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getShareEdits_Edits() {
		return (EReference)shareEditsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEEditingDomain() {
		return eEditingDomainEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getECommand() {
		return eCommandEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEURI() {
		return euriEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SharingFactory getSharingFactory() {
		return (SharingFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		abstractShareEClass = createEClass(ABSTRACT_SHARE);
		createEAttribute(abstractShareEClass, ABSTRACT_SHARE__NAME);
		createEAttribute(abstractShareEClass, ABSTRACT_SHARE__OWNER);
		createEAttribute(abstractShareEClass, ABSTRACT_SHARE__SHARER);
		createEAttribute(abstractShareEClass, ABSTRACT_SHARE__MODE);

		shareModelEClass = createEClass(SHARE_MODEL);
		createEReference(shareModelEClass, SHARE_MODEL__EOBJECTS);

		shareEditsEClass = createEClass(SHARE_EDITS);
		createEReference(shareEditsEClass, SHARE_EDITS__EDITS);

		modelEditEClass = createEClass(MODEL_EDIT);
		createEOperation(modelEditEClass, MODEL_EDIT___PERFORM_EDIT);
		createEOperation(modelEditEClass, MODEL_EDIT___CREATE_EDIT_COMMAND__EDITINGDOMAIN);
		createEOperation(modelEditEClass, MODEL_EDIT___CREATE_SERIALIZABLE_EDIT__URI);

		abstractModelEditEClass = createEClass(ABSTRACT_MODEL_EDIT);
		createEReference(abstractModelEditEClass, ABSTRACT_MODEL_EDIT__EOBJECT);

		abstractFeatureEditEClass = createEClass(ABSTRACT_FEATURE_EDIT);
		createEAttribute(abstractFeatureEditEClass, ABSTRACT_FEATURE_EDIT__FEATURE);
		createEAttribute(abstractFeatureEditEClass, ABSTRACT_FEATURE_EDIT__INDEX);
		createEOperation(abstractFeatureEditEClass, ABSTRACT_FEATURE_EDIT___GET_STRUCTURAL_FEATURE);
		createEOperation(abstractFeatureEditEClass, ABSTRACT_FEATURE_EDIT___GET_VALUE);

		abstractAttributeEditEClass = createEClass(ABSTRACT_ATTRIBUTE_EDIT);
		createEAttribute(abstractAttributeEditEClass, ABSTRACT_ATTRIBUTE_EDIT__VALUE);

		abstractReferenceEditEClass = createEClass(ABSTRACT_REFERENCE_EDIT);
		createEReference(abstractReferenceEditEClass, ABSTRACT_REFERENCE_EDIT__VALUE);

		setFeatureEditEClass = createEClass(SET_FEATURE_EDIT);

		setAttributeEditEClass = createEClass(SET_ATTRIBUTE_EDIT);

		setReferenceEditEClass = createEClass(SET_REFERENCE_EDIT);

		addFeatureEditEClass = createEClass(ADD_FEATURE_EDIT);

		addAttributeEditEClass = createEClass(ADD_ATTRIBUTE_EDIT);

		addReferenceEditEClass = createEClass(ADD_REFERENCE_EDIT);

		removeFeatureEditEClass = createEClass(REMOVE_FEATURE_EDIT);

		changeEditEClass = createEClass(CHANGE_EDIT);
		createEReference(changeEditEClass, CHANGE_EDIT__CHANGE);

		// Create enums
		shareModeEEnum = createEEnum(SHARE_MODE);

		// Create data types
		eEditingDomainEDataType = createEDataType(EEDITING_DOMAIN);
		eCommandEDataType = createEDataType(ECOMMAND);
		euriEDataType = createEDataType(EURI);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
		ChangePackage theChangePackage = (ChangePackage)EPackage.Registry.INSTANCE.getEPackage(ChangePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		shareModelEClass.getESuperTypes().add(this.getAbstractShare());
		shareEditsEClass.getESuperTypes().add(this.getAbstractShare());
		abstractModelEditEClass.getESuperTypes().add(this.getModelEdit());
		abstractFeatureEditEClass.getESuperTypes().add(this.getAbstractModelEdit());
		abstractAttributeEditEClass.getESuperTypes().add(this.getAbstractFeatureEdit());
		abstractReferenceEditEClass.getESuperTypes().add(this.getAbstractFeatureEdit());
		setFeatureEditEClass.getESuperTypes().add(this.getAbstractFeatureEdit());
		setAttributeEditEClass.getESuperTypes().add(this.getSetFeatureEdit());
		setAttributeEditEClass.getESuperTypes().add(this.getAbstractAttributeEdit());
		setReferenceEditEClass.getESuperTypes().add(this.getSetFeatureEdit());
		setReferenceEditEClass.getESuperTypes().add(this.getAbstractReferenceEdit());
		addFeatureEditEClass.getESuperTypes().add(this.getAbstractFeatureEdit());
		addAttributeEditEClass.getESuperTypes().add(this.getAddFeatureEdit());
		addAttributeEditEClass.getESuperTypes().add(this.getAbstractAttributeEdit());
		addReferenceEditEClass.getESuperTypes().add(this.getAddFeatureEdit());
		addReferenceEditEClass.getESuperTypes().add(this.getAbstractReferenceEdit());
		removeFeatureEditEClass.getESuperTypes().add(this.getAbstractFeatureEdit());
		changeEditEClass.getESuperTypes().add(this.getAbstractModelEdit());

		// Initialize classes, features, and operations; add parameters
		initEClass(abstractShareEClass, AbstractShare.class, "AbstractShare", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAbstractShare_Name(), theEcorePackage.getEString(), "name", null, 0, 1, AbstractShare.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractShare_Owner(), theEcorePackage.getEString(), "owner", null, 0, 1, AbstractShare.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractShare_Sharer(), theEcorePackage.getEString(), "sharer", null, 0, 1, AbstractShare.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractShare_Mode(), this.getShareMode(), "mode", null, 0, 1, AbstractShare.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(shareModelEClass, ShareModel.class, "ShareModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getShareModel_EObjects(), theEcorePackage.getEObject(), null, "eObjects", null, 0, -1, ShareModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(shareEditsEClass, ShareEdits.class, "ShareEdits", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getShareEdits_Edits(), this.getModelEdit(), null, "edits", null, 0, -1, ShareEdits.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modelEditEClass, ModelEdit.class, "ModelEdit", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getModelEdit__PerformEdit(), null, "performEdit", 0, 1, IS_UNIQUE, IS_ORDERED);

		EOperation op = initEOperation(getModelEdit__CreateEditCommand__EditingDomain(), this.getECommand(), "createEditCommand", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getEEditingDomain(), "editingDomain", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getModelEdit__CreateSerializableEdit__URI(), theEcorePackage.getEResource(), "createSerializableEdit", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getEURI(), "uri", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(abstractModelEditEClass, AbstractModelEdit.class, "AbstractModelEdit", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbstractModelEdit_EObject(), ecorePackage.getEObject(), null, "eObject", null, 0, 1, AbstractModelEdit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractFeatureEditEClass, AbstractFeatureEdit.class, "AbstractFeatureEdit", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAbstractFeatureEdit_Feature(), ecorePackage.getEString(), "feature", null, 0, 1, AbstractFeatureEdit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractFeatureEdit_Index(), ecorePackage.getEInt(), "index", "-1", 0, 1, AbstractFeatureEdit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getAbstractFeatureEdit__GetStructuralFeature(), theEcorePackage.getEStructuralFeature(), "getStructuralFeature", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getAbstractFeatureEdit__GetValue(), theEcorePackage.getEJavaObject(), "getValue", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(abstractAttributeEditEClass, AbstractAttributeEdit.class, "AbstractAttributeEdit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAbstractAttributeEdit_Value(), ecorePackage.getEJavaObject(), "value", null, 0, 1, AbstractAttributeEdit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractReferenceEditEClass, AbstractReferenceEdit.class, "AbstractReferenceEdit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbstractReferenceEdit_Value(), ecorePackage.getEObject(), null, "value", null, 0, 1, AbstractReferenceEdit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(setFeatureEditEClass, SetFeatureEdit.class, "SetFeatureEdit", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(setAttributeEditEClass, SetAttributeEdit.class, "SetAttributeEdit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(setReferenceEditEClass, SetReferenceEdit.class, "SetReferenceEdit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(addFeatureEditEClass, AddFeatureEdit.class, "AddFeatureEdit", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(addAttributeEditEClass, AddAttributeEdit.class, "AddAttributeEdit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(addReferenceEditEClass, AddReferenceEdit.class, "AddReferenceEdit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(removeFeatureEditEClass, RemoveFeatureEdit.class, "RemoveFeatureEdit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(changeEditEClass, ChangeEdit.class, "ChangeEdit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getChangeEdit_Change(), theChangePackage.getChangeDescription(), null, "change", null, 0, 1, ChangeEdit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(shareModeEEnum, ShareMode.class, "ShareMode");
		addEEnumLiteral(shareModeEEnum, ShareMode.OUT);
		addEEnumLiteral(shareModeEEnum, ShareMode.IN);
		addEEnumLiteral(shareModeEEnum, ShareMode.IN_OUT);

		// Initialize data types
		initEDataType(eEditingDomainEDataType, EditingDomain.class, "EEditingDomain", !IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(eCommandEDataType, Command.class, "ECommand", !IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(euriEDataType, URI.class, "EURI", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //SharingPackageImpl
