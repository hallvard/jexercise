/**
 */
package no.hal.emfs.sync.impl;

import no.hal.emfs.sync.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SyncFactoryImpl extends EFactoryImpl implements SyncFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SyncFactory init() {
		try {
			SyncFactory theSyncFactory = (SyncFactory)EPackage.Registry.INSTANCE.getEFactory(SyncPackage.eNS_URI);
			if (theSyncFactory != null) {
				return theSyncFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SyncFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SyncFactoryImpl() {
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
			case SyncPackage.EXPORT_SPEC: return createExportSpec();
			case SyncPackage.PORT_SPEC: return createPortSpec();
			case SyncPackage.PATH_RULE: return createPathRule();
			case SyncPackage.EXPORT_RULE: return createExportRule();
			case SyncPackage.COMPOSITE_RESOURCE_CONDITION: return createCompositeResourceCondition();
			case SyncPackage.NAME_CONDITION: return createNameCondition();
			case SyncPackage.FULL_PATH_CONDITION: return createFullPathCondition();
			case SyncPackage.TAGS_CONDITION: return createTagsCondition();
			case SyncPackage.PROPERTIES_CONDITION: return createPropertiesCondition();
			case SyncPackage.RELATIVE_PATH: return createRelativePath();
			case SyncPackage.IMPORT_SPEC: return createImportSpec();
			case SyncPackage.IMPORT_RULE: return createImportRule();
			case SyncPackage.EMFS_RESOURCE_RULE: return createEmfsResourceRule();
			case SyncPackage.TAGS_RULE: return createTagsRule();
			case SyncPackage.PROPERTIES_RULE: return createPropertiesRule();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExportSpec createExportSpec() {
		ExportSpecImpl exportSpec = new ExportSpecImpl();
		return exportSpec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <R extends PathRule<R>> PortSpec<R> createPortSpec() {
		PortSpecImpl<R> portSpec = new PortSpecImpl<R>();
		return portSpec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <R extends PathRule<R>> PathRule<R> createPathRule() {
		PathRuleImpl<R> pathRule = new PathRuleImpl<R>();
		return pathRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExportRule createExportRule() {
		ExportRuleImpl exportRule = new ExportRuleImpl();
		return exportRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeResourceCondition createCompositeResourceCondition() {
		CompositeResourceConditionImpl compositeResourceCondition = new CompositeResourceConditionImpl();
		return compositeResourceCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NameCondition createNameCondition() {
		NameConditionImpl nameCondition = new NameConditionImpl();
		return nameCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FullPathCondition createFullPathCondition() {
		FullPathConditionImpl fullPathCondition = new FullPathConditionImpl();
		return fullPathCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TagsCondition createTagsCondition() {
		TagsConditionImpl tagsCondition = new TagsConditionImpl();
		return tagsCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertiesCondition createPropertiesCondition() {
		PropertiesConditionImpl propertiesCondition = new PropertiesConditionImpl();
		return propertiesCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelativePath createRelativePath() {
		RelativePathImpl relativePath = new RelativePathImpl();
		return relativePath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImportSpec createImportSpec() {
		ImportSpecImpl importSpec = new ImportSpecImpl();
		return importSpec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImportRule createImportRule() {
		ImportRuleImpl importRule = new ImportRuleImpl();
		return importRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmfsResourceRule createEmfsResourceRule() {
		EmfsResourceRuleImpl emfsResourceRule = new EmfsResourceRuleImpl();
		return emfsResourceRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TagsRule createTagsRule() {
		TagsRuleImpl tagsRule = new TagsRuleImpl();
		return tagsRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertiesRule createPropertiesRule() {
		PropertiesRuleImpl propertiesRule = new PropertiesRuleImpl();
		return propertiesRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SyncPackage getSyncPackage() {
		return (SyncPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SyncPackage getPackage() {
		return SyncPackage.eINSTANCE;
	}

} //SyncFactoryImpl
