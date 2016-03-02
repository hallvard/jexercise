/**
 */
package no.hal.emfs.sync.impl;

import no.hal.emfs.EmfsPackage;

import no.hal.emfs.sync.CompositeResourceCondition;
import no.hal.emfs.sync.EmfsResourceRule;
import no.hal.emfs.sync.ExportRule;
import no.hal.emfs.sync.ExportSpec;
import no.hal.emfs.sync.FullPathCondition;
import no.hal.emfs.sync.ImportRule;
import no.hal.emfs.sync.ImportSpec;
import no.hal.emfs.sync.NameCondition;
import no.hal.emfs.sync.PathRule;
import no.hal.emfs.sync.PortSpec;
import no.hal.emfs.sync.PropertiesCondition;
import no.hal.emfs.sync.PropertiesRule;
import no.hal.emfs.sync.RelativePath;
import no.hal.emfs.sync.ResourcePath;
import no.hal.emfs.sync.StringCondition;
import no.hal.emfs.sync.ResourceCondition;
import no.hal.emfs.sync.SyncFactory;
import no.hal.emfs.sync.SyncPackage;
import no.hal.emfs.sync.TagsCondition;

import no.hal.emfs.sync.TagsRule;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.ETypeParameter;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SyncPackageImpl extends EPackageImpl implements SyncPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exportSpecEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass portSpecEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pathRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exportRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourcePathEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compositeResourceConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nameConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fullPathConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tagsConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertiesConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relativePathEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass importSpecEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass importRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass emfsResourceRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tagsRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertiesRuleEClass = null;

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
	 * @see no.hal.emfs.sync.SyncPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SyncPackageImpl() {
		super(eNS_URI, SyncFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link SyncPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SyncPackage init() {
		if (isInited) return (SyncPackage)EPackage.Registry.INSTANCE.getEPackage(SyncPackage.eNS_URI);

		// Obtain or create and register package
		SyncPackageImpl theSyncPackage = (SyncPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SyncPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SyncPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		EmfsPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theSyncPackage.createPackageContents();

		// Initialize created meta-data
		theSyncPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSyncPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SyncPackage.eNS_URI, theSyncPackage);
		return theSyncPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExportSpec() {
		return exportSpecEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPortSpec() {
		return portSpecEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPortSpec_Rules() {
		return (EReference)portSpecEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPortSpec_Resources() {
		return (EReference)portSpecEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPortSpec_ResourceRefs() {
		return (EReference)portSpecEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPathRule() {
		return pathRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPathRule_Path() {
		return (EReference)pathRuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPathRule_FullPath() {
		return (EAttribute)pathRuleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPathRule_TargetPath() {
		return (EReference)pathRuleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPathRule_Includes() {
		return (EReference)pathRuleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPathRule_Excludes() {
		return (EReference)pathRuleEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPathRule_Tags() {
		return (EReference)pathRuleEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPathRule_Properties() {
		return (EReference)pathRuleEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExportRule() {
		return exportRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResourcePath() {
		return resourcePathEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getResourcePath__GetPath() {
		return resourcePathEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResourceCondition() {
		return resourceConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getResourceCondition__Accept__EmfsResource() {
		return resourceConditionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompositeResourceCondition() {
		return compositeResourceConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompositeResourceCondition_Conditions() {
		return (EReference)compositeResourceConditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCompositeResourceCondition_ShortCircuitValue() {
		return (EAttribute)compositeResourceConditionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStringCondition() {
		return stringConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStringCondition_Prefix() {
		return (EAttribute)stringConditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStringCondition_Suffix() {
		return (EAttribute)stringConditionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStringCondition_Regex() {
		return (EAttribute)stringConditionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStringCondition__Accept__String() {
		return stringConditionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNameCondition() {
		return nameConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFullPathCondition() {
		return fullPathConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTagsCondition() {
		return tagsConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTagsCondition_Includes() {
		return (EAttribute)tagsConditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTagsCondition_Excludes() {
		return (EAttribute)tagsConditionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPropertiesCondition() {
		return propertiesConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPropertiesCondition_Includes() {
		return (EReference)propertiesConditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPropertiesCondition_Excludes() {
		return (EReference)propertiesConditionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelativePath() {
		return relativePathEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelativePath_Segments() {
		return (EAttribute)relativePathEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelativePath_Container() {
		return (EReference)relativePathEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelativePath_FullPath() {
		return (EAttribute)relativePathEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImportSpec() {
		return importSpecEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImportRule() {
		return importRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEmfsResourceRule() {
		return emfsResourceRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEmfsResourceRule_Condition() {
		return (EReference)emfsResourceRuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTagsRule() {
		return tagsRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPropertiesRule() {
		return propertiesRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SyncFactory getSyncFactory() {
		return (SyncFactory)getEFactoryInstance();
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
		exportSpecEClass = createEClass(EXPORT_SPEC);

		portSpecEClass = createEClass(PORT_SPEC);
		createEReference(portSpecEClass, PORT_SPEC__RULES);
		createEReference(portSpecEClass, PORT_SPEC__RESOURCES);
		createEReference(portSpecEClass, PORT_SPEC__RESOURCE_REFS);

		pathRuleEClass = createEClass(PATH_RULE);
		createEReference(pathRuleEClass, PATH_RULE__PATH);
		createEAttribute(pathRuleEClass, PATH_RULE__FULL_PATH);
		createEReference(pathRuleEClass, PATH_RULE__TARGET_PATH);
		createEReference(pathRuleEClass, PATH_RULE__INCLUDES);
		createEReference(pathRuleEClass, PATH_RULE__EXCLUDES);
		createEReference(pathRuleEClass, PATH_RULE__TAGS);
		createEReference(pathRuleEClass, PATH_RULE__PROPERTIES);

		exportRuleEClass = createEClass(EXPORT_RULE);

		resourcePathEClass = createEClass(RESOURCE_PATH);
		createEOperation(resourcePathEClass, RESOURCE_PATH___GET_PATH);

		resourceConditionEClass = createEClass(RESOURCE_CONDITION);
		createEOperation(resourceConditionEClass, RESOURCE_CONDITION___ACCEPT__EMFSRESOURCE);

		compositeResourceConditionEClass = createEClass(COMPOSITE_RESOURCE_CONDITION);
		createEReference(compositeResourceConditionEClass, COMPOSITE_RESOURCE_CONDITION__CONDITIONS);
		createEAttribute(compositeResourceConditionEClass, COMPOSITE_RESOURCE_CONDITION__SHORT_CIRCUIT_VALUE);

		stringConditionEClass = createEClass(STRING_CONDITION);
		createEAttribute(stringConditionEClass, STRING_CONDITION__PREFIX);
		createEAttribute(stringConditionEClass, STRING_CONDITION__SUFFIX);
		createEAttribute(stringConditionEClass, STRING_CONDITION__REGEX);
		createEOperation(stringConditionEClass, STRING_CONDITION___ACCEPT__STRING);

		nameConditionEClass = createEClass(NAME_CONDITION);

		fullPathConditionEClass = createEClass(FULL_PATH_CONDITION);

		tagsConditionEClass = createEClass(TAGS_CONDITION);
		createEAttribute(tagsConditionEClass, TAGS_CONDITION__INCLUDES);
		createEAttribute(tagsConditionEClass, TAGS_CONDITION__EXCLUDES);

		propertiesConditionEClass = createEClass(PROPERTIES_CONDITION);
		createEReference(propertiesConditionEClass, PROPERTIES_CONDITION__INCLUDES);
		createEReference(propertiesConditionEClass, PROPERTIES_CONDITION__EXCLUDES);

		relativePathEClass = createEClass(RELATIVE_PATH);
		createEAttribute(relativePathEClass, RELATIVE_PATH__SEGMENTS);
		createEReference(relativePathEClass, RELATIVE_PATH__CONTAINER);
		createEAttribute(relativePathEClass, RELATIVE_PATH__FULL_PATH);

		importSpecEClass = createEClass(IMPORT_SPEC);

		importRuleEClass = createEClass(IMPORT_RULE);

		emfsResourceRuleEClass = createEClass(EMFS_RESOURCE_RULE);
		createEReference(emfsResourceRuleEClass, EMFS_RESOURCE_RULE__CONDITION);

		tagsRuleEClass = createEClass(TAGS_RULE);

		propertiesRuleEClass = createEClass(PROPERTIES_RULE);
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
		EmfsPackage theEmfsPackage = (EmfsPackage)EPackage.Registry.INSTANCE.getEPackage(EmfsPackage.eNS_URI);

		// Create type parameters
		ETypeParameter portSpecEClass_R = addETypeParameter(portSpecEClass, "R");
		ETypeParameter pathRuleEClass_R = addETypeParameter(pathRuleEClass, "R");

		// Set bounds for type parameters
		EGenericType g1 = createEGenericType(this.getPathRule());
		EGenericType g2 = createEGenericType(portSpecEClass_R);
		g1.getETypeArguments().add(g2);
		portSpecEClass_R.getEBounds().add(g1);
		g1 = createEGenericType(this.getPathRule());
		g2 = createEGenericType(pathRuleEClass_R);
		g1.getETypeArguments().add(g2);
		pathRuleEClass_R.getEBounds().add(g1);

		// Add supertypes to classes
		g1 = createEGenericType(this.getPortSpec());
		g2 = createEGenericType(this.getExportRule());
		g1.getETypeArguments().add(g2);
		exportSpecEClass.getEGenericSuperTypes().add(g1);
		pathRuleEClass.getESuperTypes().add(this.getEmfsResourceRule());
		g1 = createEGenericType(this.getPathRule());
		g2 = createEGenericType(this.getExportRule());
		g1.getETypeArguments().add(g2);
		exportRuleEClass.getEGenericSuperTypes().add(g1);
		compositeResourceConditionEClass.getESuperTypes().add(this.getResourceCondition());
		stringConditionEClass.getESuperTypes().add(this.getResourceCondition());
		nameConditionEClass.getESuperTypes().add(this.getStringCondition());
		fullPathConditionEClass.getESuperTypes().add(this.getStringCondition());
		tagsConditionEClass.getESuperTypes().add(this.getResourceCondition());
		propertiesConditionEClass.getESuperTypes().add(this.getResourceCondition());
		relativePathEClass.getESuperTypes().add(this.getResourcePath());
		g1 = createEGenericType(this.getPortSpec());
		g2 = createEGenericType(this.getImportRule());
		g1.getETypeArguments().add(g2);
		importSpecEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getPathRule());
		g2 = createEGenericType(this.getImportRule());
		g1.getETypeArguments().add(g2);
		importRuleEClass.getEGenericSuperTypes().add(g1);
		tagsRuleEClass.getESuperTypes().add(this.getEmfsResourceRule());
		tagsRuleEClass.getESuperTypes().add(theEmfsPackage.getTagsOwner());
		propertiesRuleEClass.getESuperTypes().add(this.getEmfsResourceRule());
		propertiesRuleEClass.getESuperTypes().add(theEmfsPackage.getPropertyOwner());

		// Initialize classes, features, and operations; add parameters
		initEClass(exportSpecEClass, ExportSpec.class, "ExportSpec", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(portSpecEClass, PortSpec.class, "PortSpec", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		g1 = createEGenericType(portSpecEClass_R);
		initEReference(getPortSpec_Rules(), g1, null, "rules", null, 0, -1, PortSpec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPortSpec_Resources(), theEmfsPackage.getEmfsResource(), null, "resources", null, 0, -1, PortSpec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPortSpec_ResourceRefs(), theEmfsPackage.getEmfsResource(), null, "resourceRefs", null, 0, -1, PortSpec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pathRuleEClass, PathRule.class, "PathRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPathRule_Path(), this.getResourcePath(), null, "path", null, 0, 1, PathRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPathRule_FullPath(), ecorePackage.getEString(), "fullPath", null, 0, 1, PathRule.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getPathRule_TargetPath(), this.getResourcePath(), null, "targetPath", null, 0, 1, PathRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(pathRuleEClass_R);
		initEReference(getPathRule_Includes(), g1, null, "includes", null, 0, -1, PathRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(pathRuleEClass_R);
		initEReference(getPathRule_Excludes(), g1, null, "excludes", null, 0, -1, PathRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPathRule_Tags(), this.getTagsRule(), null, "tags", null, 0, -1, PathRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPathRule_Properties(), this.getPropertiesRule(), null, "properties", null, 0, -1, PathRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(exportRuleEClass, ExportRule.class, "ExportRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(resourcePathEClass, ResourcePath.class, "ResourcePath", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getResourcePath__GetPath(), ecorePackage.getEString(), "getPath", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(resourceConditionEClass, ResourceCondition.class, "ResourceCondition", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = initEOperation(getResourceCondition__Accept__EmfsResource(), ecorePackage.getEBoolean(), "accept", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEmfsPackage.getEmfsResource(), "resource", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(compositeResourceConditionEClass, CompositeResourceCondition.class, "CompositeResourceCondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCompositeResourceCondition_Conditions(), this.getResourceCondition(), null, "conditions", null, 0, -1, CompositeResourceCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCompositeResourceCondition_ShortCircuitValue(), ecorePackage.getEBoolean(), "shortCircuitValue", "false", 0, 1, CompositeResourceCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stringConditionEClass, StringCondition.class, "StringCondition", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStringCondition_Prefix(), ecorePackage.getEString(), "prefix", null, 0, 1, StringCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStringCondition_Suffix(), ecorePackage.getEString(), "suffix", null, 0, 1, StringCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStringCondition_Regex(), ecorePackage.getEString(), "regex", null, 0, 1, StringCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getStringCondition__Accept__String(), ecorePackage.getEBoolean(), "accept", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "value", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(nameConditionEClass, NameCondition.class, "NameCondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(fullPathConditionEClass, FullPathCondition.class, "FullPathCondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tagsConditionEClass, TagsCondition.class, "TagsCondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTagsCondition_Includes(), ecorePackage.getEString(), "includes", null, 0, -1, TagsCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTagsCondition_Excludes(), ecorePackage.getEString(), "excludes", null, 0, -1, TagsCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(propertiesConditionEClass, PropertiesCondition.class, "PropertiesCondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPropertiesCondition_Includes(), theEmfsPackage.getProperty(), null, "includes", null, 0, -1, PropertiesCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPropertiesCondition_Excludes(), theEmfsPackage.getProperty(), null, "excludes", null, 0, -1, PropertiesCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relativePathEClass, RelativePath.class, "RelativePath", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRelativePath_Segments(), ecorePackage.getEString(), "segments", null, 0, -1, RelativePath.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelativePath_Container(), this.getResourcePath(), null, "container", null, 0, 1, RelativePath.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelativePath_FullPath(), ecorePackage.getEString(), "fullPath", null, 0, 1, RelativePath.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(importSpecEClass, ImportSpec.class, "ImportSpec", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(importRuleEClass, ImportRule.class, "ImportRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(emfsResourceRuleEClass, EmfsResourceRule.class, "EmfsResourceRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEmfsResourceRule_Condition(), this.getResourceCondition(), null, "condition", null, 0, 1, EmfsResourceRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tagsRuleEClass, TagsRule.class, "TagsRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(propertiesRuleEClass, PropertiesRule.class, "PropertiesRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //SyncPackageImpl
