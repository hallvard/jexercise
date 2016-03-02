/**
 */
package no.hal.emfs.sync;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see no.hal.emfs.sync.SyncFactory
 * @model kind="package"
 * @generated
 */
public interface SyncPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "sync";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/plugin/no.hal.emfs/model/emfs-sync.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "emfsSync";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SyncPackage eINSTANCE = no.hal.emfs.sync.impl.SyncPackageImpl.init();

	/**
	 * The meta object id for the '{@link no.hal.emfs.sync.impl.PortSpecImpl <em>Port Spec</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.emfs.sync.impl.PortSpecImpl
	 * @see no.hal.emfs.sync.impl.SyncPackageImpl#getPortSpec()
	 * @generated
	 */
	int PORT_SPEC = 1;

	/**
	 * The feature id for the '<em><b>Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_SPEC__RULES = 0;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_SPEC__RESOURCES = 1;

	/**
	 * The feature id for the '<em><b>Resource Refs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_SPEC__RESOURCE_REFS = 2;

	/**
	 * The number of structural features of the '<em>Port Spec</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_SPEC_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Port Spec</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_SPEC_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link no.hal.emfs.sync.impl.ExportSpecImpl <em>Export Spec</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.emfs.sync.impl.ExportSpecImpl
	 * @see no.hal.emfs.sync.impl.SyncPackageImpl#getExportSpec()
	 * @generated
	 */
	int EXPORT_SPEC = 0;

	/**
	 * The feature id for the '<em><b>Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPORT_SPEC__RULES = PORT_SPEC__RULES;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPORT_SPEC__RESOURCES = PORT_SPEC__RESOURCES;

	/**
	 * The feature id for the '<em><b>Resource Refs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPORT_SPEC__RESOURCE_REFS = PORT_SPEC__RESOURCE_REFS;

	/**
	 * The number of structural features of the '<em>Export Spec</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPORT_SPEC_FEATURE_COUNT = PORT_SPEC_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Export Spec</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPORT_SPEC_OPERATION_COUNT = PORT_SPEC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link no.hal.emfs.sync.impl.ExportRuleImpl <em>Export Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.emfs.sync.impl.ExportRuleImpl
	 * @see no.hal.emfs.sync.impl.SyncPackageImpl#getExportRule()
	 * @generated
	 */
	int EXPORT_RULE = 3;

	/**
	 * The meta object id for the '{@link no.hal.emfs.sync.ResourcePath <em>Resource Path</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.emfs.sync.ResourcePath
	 * @see no.hal.emfs.sync.impl.SyncPackageImpl#getResourcePath()
	 * @generated
	 */
	int RESOURCE_PATH = 4;

	/**
	 * The meta object id for the '{@link no.hal.emfs.sync.ResourceCondition <em>Resource Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.emfs.sync.ResourceCondition
	 * @see no.hal.emfs.sync.impl.SyncPackageImpl#getResourceCondition()
	 * @generated
	 */
	int RESOURCE_CONDITION = 5;

	/**
	 * The meta object id for the '{@link no.hal.emfs.sync.impl.CompositeResourceConditionImpl <em>Composite Resource Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.emfs.sync.impl.CompositeResourceConditionImpl
	 * @see no.hal.emfs.sync.impl.SyncPackageImpl#getCompositeResourceCondition()
	 * @generated
	 */
	int COMPOSITE_RESOURCE_CONDITION = 6;

	/**
	 * The meta object id for the '{@link no.hal.emfs.sync.impl.StringConditionImpl <em>String Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.emfs.sync.impl.StringConditionImpl
	 * @see no.hal.emfs.sync.impl.SyncPackageImpl#getStringCondition()
	 * @generated
	 */
	int STRING_CONDITION = 7;

	/**
	 * The meta object id for the '{@link no.hal.emfs.sync.impl.NameConditionImpl <em>Name Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.emfs.sync.impl.NameConditionImpl
	 * @see no.hal.emfs.sync.impl.SyncPackageImpl#getNameCondition()
	 * @generated
	 */
	int NAME_CONDITION = 8;

	/**
	 * The meta object id for the '{@link no.hal.emfs.sync.impl.FullPathConditionImpl <em>Full Path Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.emfs.sync.impl.FullPathConditionImpl
	 * @see no.hal.emfs.sync.impl.SyncPackageImpl#getFullPathCondition()
	 * @generated
	 */
	int FULL_PATH_CONDITION = 9;

	/**
	 * The meta object id for the '{@link no.hal.emfs.sync.impl.TagsConditionImpl <em>Tags Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.emfs.sync.impl.TagsConditionImpl
	 * @see no.hal.emfs.sync.impl.SyncPackageImpl#getTagsCondition()
	 * @generated
	 */
	int TAGS_CONDITION = 10;

	/**
	 * The meta object id for the '{@link no.hal.emfs.sync.impl.PropertiesConditionImpl <em>Properties Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.emfs.sync.impl.PropertiesConditionImpl
	 * @see no.hal.emfs.sync.impl.SyncPackageImpl#getPropertiesCondition()
	 * @generated
	 */
	int PROPERTIES_CONDITION = 11;

	/**
	 * The meta object id for the '{@link no.hal.emfs.sync.impl.RelativePathImpl <em>Relative Path</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.emfs.sync.impl.RelativePathImpl
	 * @see no.hal.emfs.sync.impl.SyncPackageImpl#getRelativePath()
	 * @generated
	 */
	int RELATIVE_PATH = 12;

	/**
	 * The meta object id for the '{@link no.hal.emfs.sync.impl.ImportSpecImpl <em>Import Spec</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.emfs.sync.impl.ImportSpecImpl
	 * @see no.hal.emfs.sync.impl.SyncPackageImpl#getImportSpec()
	 * @generated
	 */
	int IMPORT_SPEC = 13;

	/**
	 * The meta object id for the '{@link no.hal.emfs.sync.impl.ImportRuleImpl <em>Import Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.emfs.sync.impl.ImportRuleImpl
	 * @see no.hal.emfs.sync.impl.SyncPackageImpl#getImportRule()
	 * @generated
	 */
	int IMPORT_RULE = 14;

	/**
	 * The meta object id for the '{@link no.hal.emfs.sync.impl.EmfsResourceRuleImpl <em>Emfs Resource Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.emfs.sync.impl.EmfsResourceRuleImpl
	 * @see no.hal.emfs.sync.impl.SyncPackageImpl#getEmfsResourceRule()
	 * @generated
	 */
	int EMFS_RESOURCE_RULE = 15;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMFS_RESOURCE_RULE__CONDITION = 0;

	/**
	 * The number of structural features of the '<em>Emfs Resource Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMFS_RESOURCE_RULE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Emfs Resource Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMFS_RESOURCE_RULE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link no.hal.emfs.sync.impl.PathRuleImpl <em>Path Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.emfs.sync.impl.PathRuleImpl
	 * @see no.hal.emfs.sync.impl.SyncPackageImpl#getPathRule()
	 * @generated
	 */
	int PATH_RULE = 2;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_RULE__CONDITION = EMFS_RESOURCE_RULE__CONDITION;

	/**
	 * The feature id for the '<em><b>Path</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_RULE__PATH = EMFS_RESOURCE_RULE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Full Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_RULE__FULL_PATH = EMFS_RESOURCE_RULE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Target Path</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_RULE__TARGET_PATH = EMFS_RESOURCE_RULE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Includes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_RULE__INCLUDES = EMFS_RESOURCE_RULE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Excludes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_RULE__EXCLUDES = EMFS_RESOURCE_RULE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_RULE__TAGS = EMFS_RESOURCE_RULE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_RULE__PROPERTIES = EMFS_RESOURCE_RULE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Path Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_RULE_FEATURE_COUNT = EMFS_RESOURCE_RULE_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Path Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_RULE_OPERATION_COUNT = EMFS_RESOURCE_RULE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPORT_RULE__CONDITION = PATH_RULE__CONDITION;

	/**
	 * The feature id for the '<em><b>Path</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPORT_RULE__PATH = PATH_RULE__PATH;

	/**
	 * The feature id for the '<em><b>Full Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPORT_RULE__FULL_PATH = PATH_RULE__FULL_PATH;

	/**
	 * The feature id for the '<em><b>Target Path</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPORT_RULE__TARGET_PATH = PATH_RULE__TARGET_PATH;

	/**
	 * The feature id for the '<em><b>Includes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPORT_RULE__INCLUDES = PATH_RULE__INCLUDES;

	/**
	 * The feature id for the '<em><b>Excludes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPORT_RULE__EXCLUDES = PATH_RULE__EXCLUDES;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPORT_RULE__TAGS = PATH_RULE__TAGS;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPORT_RULE__PROPERTIES = PATH_RULE__PROPERTIES;

	/**
	 * The number of structural features of the '<em>Export Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPORT_RULE_FEATURE_COUNT = PATH_RULE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Export Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPORT_RULE_OPERATION_COUNT = PATH_RULE_OPERATION_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Resource Path</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PATH_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Get Path</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PATH___GET_PATH = 0;

	/**
	 * The number of operations of the '<em>Resource Path</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PATH_OPERATION_COUNT = 1;

	/**
	 * The number of structural features of the '<em>Resource Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CONDITION_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CONDITION___ACCEPT__EMFSRESOURCE = 0;

	/**
	 * The number of operations of the '<em>Resource Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CONDITION_OPERATION_COUNT = 1;

	/**
	 * The feature id for the '<em><b>Conditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_RESOURCE_CONDITION__CONDITIONS = RESOURCE_CONDITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Short Circuit Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_RESOURCE_CONDITION__SHORT_CIRCUIT_VALUE = RESOURCE_CONDITION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Composite Resource Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_RESOURCE_CONDITION_FEATURE_COUNT = RESOURCE_CONDITION_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_RESOURCE_CONDITION___ACCEPT__EMFSRESOURCE = RESOURCE_CONDITION___ACCEPT__EMFSRESOURCE;

	/**
	 * The number of operations of the '<em>Composite Resource Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_RESOURCE_CONDITION_OPERATION_COUNT = RESOURCE_CONDITION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_CONDITION__PREFIX = RESOURCE_CONDITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Suffix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_CONDITION__SUFFIX = RESOURCE_CONDITION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Regex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_CONDITION__REGEX = RESOURCE_CONDITION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>String Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_CONDITION_FEATURE_COUNT = RESOURCE_CONDITION_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_CONDITION___ACCEPT__EMFSRESOURCE = RESOURCE_CONDITION___ACCEPT__EMFSRESOURCE;

	/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_CONDITION___ACCEPT__STRING = RESOURCE_CONDITION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>String Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_CONDITION_OPERATION_COUNT = RESOURCE_CONDITION_OPERATION_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_CONDITION__PREFIX = STRING_CONDITION__PREFIX;

	/**
	 * The feature id for the '<em><b>Suffix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_CONDITION__SUFFIX = STRING_CONDITION__SUFFIX;

	/**
	 * The feature id for the '<em><b>Regex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_CONDITION__REGEX = STRING_CONDITION__REGEX;

	/**
	 * The number of structural features of the '<em>Name Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_CONDITION_FEATURE_COUNT = STRING_CONDITION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_CONDITION___ACCEPT__EMFSRESOURCE = STRING_CONDITION___ACCEPT__EMFSRESOURCE;

	/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_CONDITION___ACCEPT__STRING = STRING_CONDITION___ACCEPT__STRING;

	/**
	 * The number of operations of the '<em>Name Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_CONDITION_OPERATION_COUNT = STRING_CONDITION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FULL_PATH_CONDITION__PREFIX = STRING_CONDITION__PREFIX;

	/**
	 * The feature id for the '<em><b>Suffix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FULL_PATH_CONDITION__SUFFIX = STRING_CONDITION__SUFFIX;

	/**
	 * The feature id for the '<em><b>Regex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FULL_PATH_CONDITION__REGEX = STRING_CONDITION__REGEX;

	/**
	 * The number of structural features of the '<em>Full Path Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FULL_PATH_CONDITION_FEATURE_COUNT = STRING_CONDITION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FULL_PATH_CONDITION___ACCEPT__EMFSRESOURCE = STRING_CONDITION___ACCEPT__EMFSRESOURCE;

	/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FULL_PATH_CONDITION___ACCEPT__STRING = STRING_CONDITION___ACCEPT__STRING;

	/**
	 * The number of operations of the '<em>Full Path Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FULL_PATH_CONDITION_OPERATION_COUNT = STRING_CONDITION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Includes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAGS_CONDITION__INCLUDES = RESOURCE_CONDITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Excludes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAGS_CONDITION__EXCLUDES = RESOURCE_CONDITION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Tags Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAGS_CONDITION_FEATURE_COUNT = RESOURCE_CONDITION_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAGS_CONDITION___ACCEPT__EMFSRESOURCE = RESOURCE_CONDITION___ACCEPT__EMFSRESOURCE;

	/**
	 * The number of operations of the '<em>Tags Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAGS_CONDITION_OPERATION_COUNT = RESOURCE_CONDITION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Includes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIES_CONDITION__INCLUDES = RESOURCE_CONDITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Excludes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIES_CONDITION__EXCLUDES = RESOURCE_CONDITION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Properties Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIES_CONDITION_FEATURE_COUNT = RESOURCE_CONDITION_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIES_CONDITION___ACCEPT__EMFSRESOURCE = RESOURCE_CONDITION___ACCEPT__EMFSRESOURCE;

	/**
	 * The number of operations of the '<em>Properties Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIES_CONDITION_OPERATION_COUNT = RESOURCE_CONDITION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Segments</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIVE_PATH__SEGMENTS = RESOURCE_PATH_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIVE_PATH__CONTAINER = RESOURCE_PATH_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Full Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIVE_PATH__FULL_PATH = RESOURCE_PATH_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Relative Path</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIVE_PATH_FEATURE_COUNT = RESOURCE_PATH_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Path</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIVE_PATH___GET_PATH = RESOURCE_PATH___GET_PATH;

	/**
	 * The number of operations of the '<em>Relative Path</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIVE_PATH_OPERATION_COUNT = RESOURCE_PATH_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_SPEC__RULES = PORT_SPEC__RULES;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_SPEC__RESOURCES = PORT_SPEC__RESOURCES;

	/**
	 * The feature id for the '<em><b>Resource Refs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_SPEC__RESOURCE_REFS = PORT_SPEC__RESOURCE_REFS;

	/**
	 * The number of structural features of the '<em>Import Spec</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_SPEC_FEATURE_COUNT = PORT_SPEC_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Import Spec</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_SPEC_OPERATION_COUNT = PORT_SPEC_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_RULE__CONDITION = PATH_RULE__CONDITION;

	/**
	 * The feature id for the '<em><b>Path</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_RULE__PATH = PATH_RULE__PATH;

	/**
	 * The feature id for the '<em><b>Full Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_RULE__FULL_PATH = PATH_RULE__FULL_PATH;

	/**
	 * The feature id for the '<em><b>Target Path</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_RULE__TARGET_PATH = PATH_RULE__TARGET_PATH;

	/**
	 * The feature id for the '<em><b>Includes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_RULE__INCLUDES = PATH_RULE__INCLUDES;

	/**
	 * The feature id for the '<em><b>Excludes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_RULE__EXCLUDES = PATH_RULE__EXCLUDES;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_RULE__TAGS = PATH_RULE__TAGS;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_RULE__PROPERTIES = PATH_RULE__PROPERTIES;

	/**
	 * The number of structural features of the '<em>Import Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_RULE_FEATURE_COUNT = PATH_RULE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Import Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_RULE_OPERATION_COUNT = PATH_RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link no.hal.emfs.sync.impl.TagsRuleImpl <em>Tags Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.emfs.sync.impl.TagsRuleImpl
	 * @see no.hal.emfs.sync.impl.SyncPackageImpl#getTagsRule()
	 * @generated
	 */
	int TAGS_RULE = 16;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAGS_RULE__CONDITION = EMFS_RESOURCE_RULE__CONDITION;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAGS_RULE__TAGS = EMFS_RESOURCE_RULE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Tags Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAGS_RULE_FEATURE_COUNT = EMFS_RESOURCE_RULE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Tags Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAGS_RULE_OPERATION_COUNT = EMFS_RESOURCE_RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link no.hal.emfs.sync.impl.PropertiesRuleImpl <em>Properties Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.emfs.sync.impl.PropertiesRuleImpl
	 * @see no.hal.emfs.sync.impl.SyncPackageImpl#getPropertiesRule()
	 * @generated
	 */
	int PROPERTIES_RULE = 17;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIES_RULE__CONDITION = EMFS_RESOURCE_RULE__CONDITION;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIES_RULE__PROPERTIES = EMFS_RESOURCE_RULE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Properties Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIES_RULE_FEATURE_COUNT = EMFS_RESOURCE_RULE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Properties Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIES_RULE_OPERATION_COUNT = EMFS_RESOURCE_RULE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link no.hal.emfs.sync.ExportSpec <em>Export Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Export Spec</em>'.
	 * @see no.hal.emfs.sync.ExportSpec
	 * @generated
	 */
	EClass getExportSpec();

	/**
	 * Returns the meta object for class '{@link no.hal.emfs.sync.PortSpec <em>Port Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port Spec</em>'.
	 * @see no.hal.emfs.sync.PortSpec
	 * @generated
	 */
	EClass getPortSpec();

	/**
	 * Returns the meta object for the containment reference list '{@link no.hal.emfs.sync.PortSpec#getRules <em>Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rules</em>'.
	 * @see no.hal.emfs.sync.PortSpec#getRules()
	 * @see #getPortSpec()
	 * @generated
	 */
	EReference getPortSpec_Rules();

	/**
	 * Returns the meta object for the containment reference list '{@link no.hal.emfs.sync.PortSpec#getResources <em>Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resources</em>'.
	 * @see no.hal.emfs.sync.PortSpec#getResources()
	 * @see #getPortSpec()
	 * @generated
	 */
	EReference getPortSpec_Resources();

	/**
	 * Returns the meta object for the reference list '{@link no.hal.emfs.sync.PortSpec#getResourceRefs <em>Resource Refs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Resource Refs</em>'.
	 * @see no.hal.emfs.sync.PortSpec#getResourceRefs()
	 * @see #getPortSpec()
	 * @generated
	 */
	EReference getPortSpec_ResourceRefs();

	/**
	 * Returns the meta object for class '{@link no.hal.emfs.sync.PathRule <em>Path Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Path Rule</em>'.
	 * @see no.hal.emfs.sync.PathRule
	 * @generated
	 */
	EClass getPathRule();

	/**
	 * Returns the meta object for the containment reference '{@link no.hal.emfs.sync.PathRule#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Path</em>'.
	 * @see no.hal.emfs.sync.PathRule#getPath()
	 * @see #getPathRule()
	 * @generated
	 */
	EReference getPathRule_Path();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.emfs.sync.PathRule#getFullPath <em>Full Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Full Path</em>'.
	 * @see no.hal.emfs.sync.PathRule#getFullPath()
	 * @see #getPathRule()
	 * @generated
	 */
	EAttribute getPathRule_FullPath();

	/**
	 * Returns the meta object for the containment reference '{@link no.hal.emfs.sync.PathRule#getTargetPath <em>Target Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Target Path</em>'.
	 * @see no.hal.emfs.sync.PathRule#getTargetPath()
	 * @see #getPathRule()
	 * @generated
	 */
	EReference getPathRule_TargetPath();

	/**
	 * Returns the meta object for the containment reference list '{@link no.hal.emfs.sync.PathRule#getIncludes <em>Includes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Includes</em>'.
	 * @see no.hal.emfs.sync.PathRule#getIncludes()
	 * @see #getPathRule()
	 * @generated
	 */
	EReference getPathRule_Includes();

	/**
	 * Returns the meta object for the containment reference list '{@link no.hal.emfs.sync.PathRule#getExcludes <em>Excludes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Excludes</em>'.
	 * @see no.hal.emfs.sync.PathRule#getExcludes()
	 * @see #getPathRule()
	 * @generated
	 */
	EReference getPathRule_Excludes();

	/**
	 * Returns the meta object for the containment reference list '{@link no.hal.emfs.sync.PathRule#getTags <em>Tags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tags</em>'.
	 * @see no.hal.emfs.sync.PathRule#getTags()
	 * @see #getPathRule()
	 * @generated
	 */
	EReference getPathRule_Tags();

	/**
	 * Returns the meta object for the containment reference list '{@link no.hal.emfs.sync.PathRule#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Properties</em>'.
	 * @see no.hal.emfs.sync.PathRule#getProperties()
	 * @see #getPathRule()
	 * @generated
	 */
	EReference getPathRule_Properties();

	/**
	 * Returns the meta object for class '{@link no.hal.emfs.sync.ExportRule <em>Export Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Export Rule</em>'.
	 * @see no.hal.emfs.sync.ExportRule
	 * @generated
	 */
	EClass getExportRule();

	/**
	 * Returns the meta object for class '{@link no.hal.emfs.sync.ResourcePath <em>Resource Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Path</em>'.
	 * @see no.hal.emfs.sync.ResourcePath
	 * @generated
	 */
	EClass getResourcePath();

	/**
	 * Returns the meta object for the '{@link no.hal.emfs.sync.ResourcePath#getPath() <em>Get Path</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Path</em>' operation.
	 * @see no.hal.emfs.sync.ResourcePath#getPath()
	 * @generated
	 */
	EOperation getResourcePath__GetPath();

	/**
	 * Returns the meta object for class '{@link no.hal.emfs.sync.ResourceCondition <em>Resource Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Condition</em>'.
	 * @see no.hal.emfs.sync.ResourceCondition
	 * @generated
	 */
	EClass getResourceCondition();

	/**
	 * Returns the meta object for the '{@link no.hal.emfs.sync.ResourceCondition#accept(no.hal.emfs.EmfsResource) <em>Accept</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Accept</em>' operation.
	 * @see no.hal.emfs.sync.ResourceCondition#accept(no.hal.emfs.EmfsResource)
	 * @generated
	 */
	EOperation getResourceCondition__Accept__EmfsResource();

	/**
	 * Returns the meta object for class '{@link no.hal.emfs.sync.CompositeResourceCondition <em>Composite Resource Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite Resource Condition</em>'.
	 * @see no.hal.emfs.sync.CompositeResourceCondition
	 * @generated
	 */
	EClass getCompositeResourceCondition();

	/**
	 * Returns the meta object for the containment reference list '{@link no.hal.emfs.sync.CompositeResourceCondition#getConditions <em>Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Conditions</em>'.
	 * @see no.hal.emfs.sync.CompositeResourceCondition#getConditions()
	 * @see #getCompositeResourceCondition()
	 * @generated
	 */
	EReference getCompositeResourceCondition_Conditions();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.emfs.sync.CompositeResourceCondition#isShortCircuitValue <em>Short Circuit Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Short Circuit Value</em>'.
	 * @see no.hal.emfs.sync.CompositeResourceCondition#isShortCircuitValue()
	 * @see #getCompositeResourceCondition()
	 * @generated
	 */
	EAttribute getCompositeResourceCondition_ShortCircuitValue();

	/**
	 * Returns the meta object for class '{@link no.hal.emfs.sync.StringCondition <em>String Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Condition</em>'.
	 * @see no.hal.emfs.sync.StringCondition
	 * @generated
	 */
	EClass getStringCondition();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.emfs.sync.StringCondition#getPrefix <em>Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prefix</em>'.
	 * @see no.hal.emfs.sync.StringCondition#getPrefix()
	 * @see #getStringCondition()
	 * @generated
	 */
	EAttribute getStringCondition_Prefix();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.emfs.sync.StringCondition#getSuffix <em>Suffix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Suffix</em>'.
	 * @see no.hal.emfs.sync.StringCondition#getSuffix()
	 * @see #getStringCondition()
	 * @generated
	 */
	EAttribute getStringCondition_Suffix();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.emfs.sync.StringCondition#getRegex <em>Regex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Regex</em>'.
	 * @see no.hal.emfs.sync.StringCondition#getRegex()
	 * @see #getStringCondition()
	 * @generated
	 */
	EAttribute getStringCondition_Regex();

	/**
	 * Returns the meta object for the '{@link no.hal.emfs.sync.StringCondition#accept(java.lang.String) <em>Accept</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Accept</em>' operation.
	 * @see no.hal.emfs.sync.StringCondition#accept(java.lang.String)
	 * @generated
	 */
	EOperation getStringCondition__Accept__String();

	/**
	 * Returns the meta object for class '{@link no.hal.emfs.sync.NameCondition <em>Name Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Name Condition</em>'.
	 * @see no.hal.emfs.sync.NameCondition
	 * @generated
	 */
	EClass getNameCondition();

	/**
	 * Returns the meta object for class '{@link no.hal.emfs.sync.FullPathCondition <em>Full Path Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Full Path Condition</em>'.
	 * @see no.hal.emfs.sync.FullPathCondition
	 * @generated
	 */
	EClass getFullPathCondition();

	/**
	 * Returns the meta object for class '{@link no.hal.emfs.sync.TagsCondition <em>Tags Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tags Condition</em>'.
	 * @see no.hal.emfs.sync.TagsCondition
	 * @generated
	 */
	EClass getTagsCondition();

	/**
	 * Returns the meta object for the attribute list '{@link no.hal.emfs.sync.TagsCondition#getIncludes <em>Includes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Includes</em>'.
	 * @see no.hal.emfs.sync.TagsCondition#getIncludes()
	 * @see #getTagsCondition()
	 * @generated
	 */
	EAttribute getTagsCondition_Includes();

	/**
	 * Returns the meta object for the attribute list '{@link no.hal.emfs.sync.TagsCondition#getExcludes <em>Excludes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Excludes</em>'.
	 * @see no.hal.emfs.sync.TagsCondition#getExcludes()
	 * @see #getTagsCondition()
	 * @generated
	 */
	EAttribute getTagsCondition_Excludes();

	/**
	 * Returns the meta object for class '{@link no.hal.emfs.sync.PropertiesCondition <em>Properties Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Properties Condition</em>'.
	 * @see no.hal.emfs.sync.PropertiesCondition
	 * @generated
	 */
	EClass getPropertiesCondition();

	/**
	 * Returns the meta object for the containment reference list '{@link no.hal.emfs.sync.PropertiesCondition#getIncludes <em>Includes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Includes</em>'.
	 * @see no.hal.emfs.sync.PropertiesCondition#getIncludes()
	 * @see #getPropertiesCondition()
	 * @generated
	 */
	EReference getPropertiesCondition_Includes();

	/**
	 * Returns the meta object for the containment reference list '{@link no.hal.emfs.sync.PropertiesCondition#getExcludes <em>Excludes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Excludes</em>'.
	 * @see no.hal.emfs.sync.PropertiesCondition#getExcludes()
	 * @see #getPropertiesCondition()
	 * @generated
	 */
	EReference getPropertiesCondition_Excludes();

	/**
	 * Returns the meta object for class '{@link no.hal.emfs.sync.RelativePath <em>Relative Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relative Path</em>'.
	 * @see no.hal.emfs.sync.RelativePath
	 * @generated
	 */
	EClass getRelativePath();

	/**
	 * Returns the meta object for the attribute list '{@link no.hal.emfs.sync.RelativePath#getSegments <em>Segments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Segments</em>'.
	 * @see no.hal.emfs.sync.RelativePath#getSegments()
	 * @see #getRelativePath()
	 * @generated
	 */
	EAttribute getRelativePath_Segments();

	/**
	 * Returns the meta object for the reference '{@link no.hal.emfs.sync.RelativePath#getContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Container</em>'.
	 * @see no.hal.emfs.sync.RelativePath#getContainer()
	 * @see #getRelativePath()
	 * @generated
	 */
	EReference getRelativePath_Container();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.emfs.sync.RelativePath#getFullPath <em>Full Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Full Path</em>'.
	 * @see no.hal.emfs.sync.RelativePath#getFullPath()
	 * @see #getRelativePath()
	 * @generated
	 */
	EAttribute getRelativePath_FullPath();

	/**
	 * Returns the meta object for class '{@link no.hal.emfs.sync.ImportSpec <em>Import Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Import Spec</em>'.
	 * @see no.hal.emfs.sync.ImportSpec
	 * @generated
	 */
	EClass getImportSpec();

	/**
	 * Returns the meta object for class '{@link no.hal.emfs.sync.ImportRule <em>Import Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Import Rule</em>'.
	 * @see no.hal.emfs.sync.ImportRule
	 * @generated
	 */
	EClass getImportRule();

	/**
	 * Returns the meta object for class '{@link no.hal.emfs.sync.EmfsResourceRule <em>Emfs Resource Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Emfs Resource Rule</em>'.
	 * @see no.hal.emfs.sync.EmfsResourceRule
	 * @generated
	 */
	EClass getEmfsResourceRule();

	/**
	 * Returns the meta object for the reference '{@link no.hal.emfs.sync.EmfsResourceRule#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Condition</em>'.
	 * @see no.hal.emfs.sync.EmfsResourceRule#getCondition()
	 * @see #getEmfsResourceRule()
	 * @generated
	 */
	EReference getEmfsResourceRule_Condition();

	/**
	 * Returns the meta object for class '{@link no.hal.emfs.sync.TagsRule <em>Tags Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tags Rule</em>'.
	 * @see no.hal.emfs.sync.TagsRule
	 * @generated
	 */
	EClass getTagsRule();

	/**
	 * Returns the meta object for class '{@link no.hal.emfs.sync.PropertiesRule <em>Properties Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Properties Rule</em>'.
	 * @see no.hal.emfs.sync.PropertiesRule
	 * @generated
	 */
	EClass getPropertiesRule();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SyncFactory getSyncFactory();

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
		 * The meta object literal for the '{@link no.hal.emfs.sync.impl.ExportSpecImpl <em>Export Spec</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.emfs.sync.impl.ExportSpecImpl
		 * @see no.hal.emfs.sync.impl.SyncPackageImpl#getExportSpec()
		 * @generated
		 */
		EClass EXPORT_SPEC = eINSTANCE.getExportSpec();

		/**
		 * The meta object literal for the '{@link no.hal.emfs.sync.impl.PortSpecImpl <em>Port Spec</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.emfs.sync.impl.PortSpecImpl
		 * @see no.hal.emfs.sync.impl.SyncPackageImpl#getPortSpec()
		 * @generated
		 */
		EClass PORT_SPEC = eINSTANCE.getPortSpec();

		/**
		 * The meta object literal for the '<em><b>Rules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT_SPEC__RULES = eINSTANCE.getPortSpec_Rules();

		/**
		 * The meta object literal for the '<em><b>Resources</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT_SPEC__RESOURCES = eINSTANCE.getPortSpec_Resources();

		/**
		 * The meta object literal for the '<em><b>Resource Refs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT_SPEC__RESOURCE_REFS = eINSTANCE.getPortSpec_ResourceRefs();

		/**
		 * The meta object literal for the '{@link no.hal.emfs.sync.impl.PathRuleImpl <em>Path Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.emfs.sync.impl.PathRuleImpl
		 * @see no.hal.emfs.sync.impl.SyncPackageImpl#getPathRule()
		 * @generated
		 */
		EClass PATH_RULE = eINSTANCE.getPathRule();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATH_RULE__PATH = eINSTANCE.getPathRule_Path();

		/**
		 * The meta object literal for the '<em><b>Full Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATH_RULE__FULL_PATH = eINSTANCE.getPathRule_FullPath();

		/**
		 * The meta object literal for the '<em><b>Target Path</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATH_RULE__TARGET_PATH = eINSTANCE.getPathRule_TargetPath();

		/**
		 * The meta object literal for the '<em><b>Includes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATH_RULE__INCLUDES = eINSTANCE.getPathRule_Includes();

		/**
		 * The meta object literal for the '<em><b>Excludes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATH_RULE__EXCLUDES = eINSTANCE.getPathRule_Excludes();

		/**
		 * The meta object literal for the '<em><b>Tags</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATH_RULE__TAGS = eINSTANCE.getPathRule_Tags();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATH_RULE__PROPERTIES = eINSTANCE.getPathRule_Properties();

		/**
		 * The meta object literal for the '{@link no.hal.emfs.sync.impl.ExportRuleImpl <em>Export Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.emfs.sync.impl.ExportRuleImpl
		 * @see no.hal.emfs.sync.impl.SyncPackageImpl#getExportRule()
		 * @generated
		 */
		EClass EXPORT_RULE = eINSTANCE.getExportRule();

		/**
		 * The meta object literal for the '{@link no.hal.emfs.sync.ResourcePath <em>Resource Path</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.emfs.sync.ResourcePath
		 * @see no.hal.emfs.sync.impl.SyncPackageImpl#getResourcePath()
		 * @generated
		 */
		EClass RESOURCE_PATH = eINSTANCE.getResourcePath();

		/**
		 * The meta object literal for the '<em><b>Get Path</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RESOURCE_PATH___GET_PATH = eINSTANCE.getResourcePath__GetPath();

		/**
		 * The meta object literal for the '{@link no.hal.emfs.sync.ResourceCondition <em>Resource Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.emfs.sync.ResourceCondition
		 * @see no.hal.emfs.sync.impl.SyncPackageImpl#getResourceCondition()
		 * @generated
		 */
		EClass RESOURCE_CONDITION = eINSTANCE.getResourceCondition();

		/**
		 * The meta object literal for the '<em><b>Accept</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RESOURCE_CONDITION___ACCEPT__EMFSRESOURCE = eINSTANCE.getResourceCondition__Accept__EmfsResource();

		/**
		 * The meta object literal for the '{@link no.hal.emfs.sync.impl.CompositeResourceConditionImpl <em>Composite Resource Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.emfs.sync.impl.CompositeResourceConditionImpl
		 * @see no.hal.emfs.sync.impl.SyncPackageImpl#getCompositeResourceCondition()
		 * @generated
		 */
		EClass COMPOSITE_RESOURCE_CONDITION = eINSTANCE.getCompositeResourceCondition();

		/**
		 * The meta object literal for the '<em><b>Conditions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_RESOURCE_CONDITION__CONDITIONS = eINSTANCE.getCompositeResourceCondition_Conditions();

		/**
		 * The meta object literal for the '<em><b>Short Circuit Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPOSITE_RESOURCE_CONDITION__SHORT_CIRCUIT_VALUE = eINSTANCE.getCompositeResourceCondition_ShortCircuitValue();

		/**
		 * The meta object literal for the '{@link no.hal.emfs.sync.impl.StringConditionImpl <em>String Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.emfs.sync.impl.StringConditionImpl
		 * @see no.hal.emfs.sync.impl.SyncPackageImpl#getStringCondition()
		 * @generated
		 */
		EClass STRING_CONDITION = eINSTANCE.getStringCondition();

		/**
		 * The meta object literal for the '<em><b>Prefix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_CONDITION__PREFIX = eINSTANCE.getStringCondition_Prefix();

		/**
		 * The meta object literal for the '<em><b>Suffix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_CONDITION__SUFFIX = eINSTANCE.getStringCondition_Suffix();

		/**
		 * The meta object literal for the '<em><b>Regex</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_CONDITION__REGEX = eINSTANCE.getStringCondition_Regex();

		/**
		 * The meta object literal for the '<em><b>Accept</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STRING_CONDITION___ACCEPT__STRING = eINSTANCE.getStringCondition__Accept__String();

		/**
		 * The meta object literal for the '{@link no.hal.emfs.sync.impl.NameConditionImpl <em>Name Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.emfs.sync.impl.NameConditionImpl
		 * @see no.hal.emfs.sync.impl.SyncPackageImpl#getNameCondition()
		 * @generated
		 */
		EClass NAME_CONDITION = eINSTANCE.getNameCondition();

		/**
		 * The meta object literal for the '{@link no.hal.emfs.sync.impl.FullPathConditionImpl <em>Full Path Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.emfs.sync.impl.FullPathConditionImpl
		 * @see no.hal.emfs.sync.impl.SyncPackageImpl#getFullPathCondition()
		 * @generated
		 */
		EClass FULL_PATH_CONDITION = eINSTANCE.getFullPathCondition();

		/**
		 * The meta object literal for the '{@link no.hal.emfs.sync.impl.TagsConditionImpl <em>Tags Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.emfs.sync.impl.TagsConditionImpl
		 * @see no.hal.emfs.sync.impl.SyncPackageImpl#getTagsCondition()
		 * @generated
		 */
		EClass TAGS_CONDITION = eINSTANCE.getTagsCondition();

		/**
		 * The meta object literal for the '<em><b>Includes</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAGS_CONDITION__INCLUDES = eINSTANCE.getTagsCondition_Includes();

		/**
		 * The meta object literal for the '<em><b>Excludes</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAGS_CONDITION__EXCLUDES = eINSTANCE.getTagsCondition_Excludes();

		/**
		 * The meta object literal for the '{@link no.hal.emfs.sync.impl.PropertiesConditionImpl <em>Properties Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.emfs.sync.impl.PropertiesConditionImpl
		 * @see no.hal.emfs.sync.impl.SyncPackageImpl#getPropertiesCondition()
		 * @generated
		 */
		EClass PROPERTIES_CONDITION = eINSTANCE.getPropertiesCondition();

		/**
		 * The meta object literal for the '<em><b>Includes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTIES_CONDITION__INCLUDES = eINSTANCE.getPropertiesCondition_Includes();

		/**
		 * The meta object literal for the '<em><b>Excludes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTIES_CONDITION__EXCLUDES = eINSTANCE.getPropertiesCondition_Excludes();

		/**
		 * The meta object literal for the '{@link no.hal.emfs.sync.impl.RelativePathImpl <em>Relative Path</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.emfs.sync.impl.RelativePathImpl
		 * @see no.hal.emfs.sync.impl.SyncPackageImpl#getRelativePath()
		 * @generated
		 */
		EClass RELATIVE_PATH = eINSTANCE.getRelativePath();

		/**
		 * The meta object literal for the '<em><b>Segments</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIVE_PATH__SEGMENTS = eINSTANCE.getRelativePath_Segments();

		/**
		 * The meta object literal for the '<em><b>Container</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIVE_PATH__CONTAINER = eINSTANCE.getRelativePath_Container();

		/**
		 * The meta object literal for the '<em><b>Full Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIVE_PATH__FULL_PATH = eINSTANCE.getRelativePath_FullPath();

		/**
		 * The meta object literal for the '{@link no.hal.emfs.sync.impl.ImportSpecImpl <em>Import Spec</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.emfs.sync.impl.ImportSpecImpl
		 * @see no.hal.emfs.sync.impl.SyncPackageImpl#getImportSpec()
		 * @generated
		 */
		EClass IMPORT_SPEC = eINSTANCE.getImportSpec();

		/**
		 * The meta object literal for the '{@link no.hal.emfs.sync.impl.ImportRuleImpl <em>Import Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.emfs.sync.impl.ImportRuleImpl
		 * @see no.hal.emfs.sync.impl.SyncPackageImpl#getImportRule()
		 * @generated
		 */
		EClass IMPORT_RULE = eINSTANCE.getImportRule();

		/**
		 * The meta object literal for the '{@link no.hal.emfs.sync.impl.EmfsResourceRuleImpl <em>Emfs Resource Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.emfs.sync.impl.EmfsResourceRuleImpl
		 * @see no.hal.emfs.sync.impl.SyncPackageImpl#getEmfsResourceRule()
		 * @generated
		 */
		EClass EMFS_RESOURCE_RULE = eINSTANCE.getEmfsResourceRule();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMFS_RESOURCE_RULE__CONDITION = eINSTANCE.getEmfsResourceRule_Condition();

		/**
		 * The meta object literal for the '{@link no.hal.emfs.sync.impl.TagsRuleImpl <em>Tags Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.emfs.sync.impl.TagsRuleImpl
		 * @see no.hal.emfs.sync.impl.SyncPackageImpl#getTagsRule()
		 * @generated
		 */
		EClass TAGS_RULE = eINSTANCE.getTagsRule();

		/**
		 * The meta object literal for the '{@link no.hal.emfs.sync.impl.PropertiesRuleImpl <em>Properties Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.emfs.sync.impl.PropertiesRuleImpl
		 * @see no.hal.emfs.sync.impl.SyncPackageImpl#getPropertiesRule()
		 * @generated
		 */
		EClass PROPERTIES_RULE = eINSTANCE.getPropertiesRule();

	}

} //SyncPackage
