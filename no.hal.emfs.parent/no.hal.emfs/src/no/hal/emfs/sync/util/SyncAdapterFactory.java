/**
 */
package no.hal.emfs.sync.util;

import no.hal.emfs.PropertyOwner;
import no.hal.emfs.TagsOwner;
import no.hal.emfs.sync.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see no.hal.emfs.sync.SyncPackage
 * @generated
 */
public class SyncAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SyncPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SyncAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = SyncPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SyncSwitch<Adapter> modelSwitch =
		new SyncSwitch<Adapter>() {
			@Override
			public Adapter caseExportSpec(ExportSpec object) {
				return createExportSpecAdapter();
			}
			@Override
			public <R extends PathRule<R>> Adapter casePortSpec(PortSpec<R> object) {
				return createPortSpecAdapter();
			}
			@Override
			public <R extends PathRule<R>> Adapter casePathRule(PathRule<R> object) {
				return createPathRuleAdapter();
			}
			@Override
			public Adapter caseExportRule(ExportRule object) {
				return createExportRuleAdapter();
			}
			@Override
			public Adapter caseResourcePath(ResourcePath object) {
				return createResourcePathAdapter();
			}
			@Override
			public Adapter caseResourceCondition(ResourceCondition object) {
				return createResourceConditionAdapter();
			}
			@Override
			public Adapter caseCompositeResourceCondition(CompositeResourceCondition object) {
				return createCompositeResourceConditionAdapter();
			}
			@Override
			public Adapter caseStringCondition(StringCondition object) {
				return createStringConditionAdapter();
			}
			@Override
			public Adapter caseNameCondition(NameCondition object) {
				return createNameConditionAdapter();
			}
			@Override
			public Adapter caseFullPathCondition(FullPathCondition object) {
				return createFullPathConditionAdapter();
			}
			@Override
			public Adapter caseTagsCondition(TagsCondition object) {
				return createTagsConditionAdapter();
			}
			@Override
			public Adapter casePropertiesCondition(PropertiesCondition object) {
				return createPropertiesConditionAdapter();
			}
			@Override
			public Adapter caseRelativePath(RelativePath object) {
				return createRelativePathAdapter();
			}
			@Override
			public Adapter caseImportSpec(ImportSpec object) {
				return createImportSpecAdapter();
			}
			@Override
			public Adapter caseImportRule(ImportRule object) {
				return createImportRuleAdapter();
			}
			@Override
			public Adapter caseEmfsResourceRule(EmfsResourceRule object) {
				return createEmfsResourceRuleAdapter();
			}
			@Override
			public Adapter caseTagsRule(TagsRule object) {
				return createTagsRuleAdapter();
			}
			@Override
			public Adapter casePropertiesRule(PropertiesRule object) {
				return createPropertiesRuleAdapter();
			}
			@Override
			public Adapter caseTagsOwner(TagsOwner object) {
				return createTagsOwnerAdapter();
			}
			@Override
			public Adapter casePropertyOwner(PropertyOwner object) {
				return createPropertyOwnerAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link no.hal.emfs.sync.ExportSpec <em>Export Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.emfs.sync.ExportSpec
	 * @generated
	 */
	public Adapter createExportSpecAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.emfs.sync.PortSpec <em>Port Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.emfs.sync.PortSpec
	 * @generated
	 */
	public Adapter createPortSpecAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.emfs.sync.PathRule <em>Path Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.emfs.sync.PathRule
	 * @generated
	 */
	public Adapter createPathRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.emfs.sync.ExportRule <em>Export Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.emfs.sync.ExportRule
	 * @generated
	 */
	public Adapter createExportRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.emfs.sync.ResourcePath <em>Resource Path</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.emfs.sync.ResourcePath
	 * @generated
	 */
	public Adapter createResourcePathAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.emfs.sync.ResourceCondition <em>Resource Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.emfs.sync.ResourceCondition
	 * @generated
	 */
	public Adapter createResourceConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.emfs.sync.CompositeResourceCondition <em>Composite Resource Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.emfs.sync.CompositeResourceCondition
	 * @generated
	 */
	public Adapter createCompositeResourceConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.emfs.sync.StringCondition <em>String Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.emfs.sync.StringCondition
	 * @generated
	 */
	public Adapter createStringConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.emfs.sync.NameCondition <em>Name Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.emfs.sync.NameCondition
	 * @generated
	 */
	public Adapter createNameConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.emfs.sync.FullPathCondition <em>Full Path Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.emfs.sync.FullPathCondition
	 * @generated
	 */
	public Adapter createFullPathConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.emfs.sync.TagsCondition <em>Tags Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.emfs.sync.TagsCondition
	 * @generated
	 */
	public Adapter createTagsConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.emfs.sync.PropertiesCondition <em>Properties Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.emfs.sync.PropertiesCondition
	 * @generated
	 */
	public Adapter createPropertiesConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.emfs.sync.RelativePath <em>Relative Path</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.emfs.sync.RelativePath
	 * @generated
	 */
	public Adapter createRelativePathAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.emfs.sync.ImportSpec <em>Import Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.emfs.sync.ImportSpec
	 * @generated
	 */
	public Adapter createImportSpecAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.emfs.sync.ImportRule <em>Import Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.emfs.sync.ImportRule
	 * @generated
	 */
	public Adapter createImportRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.emfs.sync.EmfsResourceRule <em>Emfs Resource Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.emfs.sync.EmfsResourceRule
	 * @generated
	 */
	public Adapter createEmfsResourceRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.emfs.sync.TagsRule <em>Tags Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.emfs.sync.TagsRule
	 * @generated
	 */
	public Adapter createTagsRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.emfs.sync.PropertiesRule <em>Properties Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.emfs.sync.PropertiesRule
	 * @generated
	 */
	public Adapter createPropertiesRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.emfs.TagsOwner <em>Tags Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.emfs.TagsOwner
	 * @generated
	 */
	public Adapter createTagsOwnerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.emfs.PropertyOwner <em>Property Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.emfs.PropertyOwner
	 * @generated
	 */
	public Adapter createPropertyOwnerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //SyncAdapterFactory
