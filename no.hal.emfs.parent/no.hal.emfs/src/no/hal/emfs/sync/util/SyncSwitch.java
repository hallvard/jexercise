/**
 */
package no.hal.emfs.sync.util;

import no.hal.emfs.PropertyOwner;
import no.hal.emfs.TagsOwner;
import no.hal.emfs.sync.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

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
 * @see no.hal.emfs.sync.SyncPackage
 * @generated
 */
public class SyncSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SyncPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SyncSwitch() {
		if (modelPackage == null) {
			modelPackage = SyncPackage.eINSTANCE;
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
			case SyncPackage.EXPORT_SPEC: {
				ExportSpec exportSpec = (ExportSpec)theEObject;
				T result = caseExportSpec(exportSpec);
				if (result == null) result = casePortSpec(exportSpec);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SyncPackage.PORT_SPEC: {
				PortSpec<?> portSpec = (PortSpec<?>)theEObject;
				T result = casePortSpec(portSpec);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SyncPackage.PATH_RULE: {
				PathRule<?> pathRule = (PathRule<?>)theEObject;
				T result = casePathRule(pathRule);
				if (result == null) result = caseEmfsResourceRule(pathRule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SyncPackage.EXPORT_RULE: {
				ExportRule exportRule = (ExportRule)theEObject;
				T result = caseExportRule(exportRule);
				if (result == null) result = casePathRule(exportRule);
				if (result == null) result = caseEmfsResourceRule(exportRule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SyncPackage.RESOURCE_PATH: {
				ResourcePath resourcePath = (ResourcePath)theEObject;
				T result = caseResourcePath(resourcePath);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SyncPackage.RESOURCE_CONDITION: {
				ResourceCondition resourceCondition = (ResourceCondition)theEObject;
				T result = caseResourceCondition(resourceCondition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SyncPackage.COMPOSITE_RESOURCE_CONDITION: {
				CompositeResourceCondition compositeResourceCondition = (CompositeResourceCondition)theEObject;
				T result = caseCompositeResourceCondition(compositeResourceCondition);
				if (result == null) result = caseResourceCondition(compositeResourceCondition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SyncPackage.STRING_CONDITION: {
				StringCondition stringCondition = (StringCondition)theEObject;
				T result = caseStringCondition(stringCondition);
				if (result == null) result = caseResourceCondition(stringCondition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SyncPackage.NAME_CONDITION: {
				NameCondition nameCondition = (NameCondition)theEObject;
				T result = caseNameCondition(nameCondition);
				if (result == null) result = caseStringCondition(nameCondition);
				if (result == null) result = caseResourceCondition(nameCondition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SyncPackage.FULL_PATH_CONDITION: {
				FullPathCondition fullPathCondition = (FullPathCondition)theEObject;
				T result = caseFullPathCondition(fullPathCondition);
				if (result == null) result = caseStringCondition(fullPathCondition);
				if (result == null) result = caseResourceCondition(fullPathCondition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SyncPackage.TAGS_CONDITION: {
				TagsCondition tagsCondition = (TagsCondition)theEObject;
				T result = caseTagsCondition(tagsCondition);
				if (result == null) result = caseResourceCondition(tagsCondition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SyncPackage.PROPERTIES_CONDITION: {
				PropertiesCondition propertiesCondition = (PropertiesCondition)theEObject;
				T result = casePropertiesCondition(propertiesCondition);
				if (result == null) result = caseResourceCondition(propertiesCondition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SyncPackage.RELATIVE_PATH: {
				RelativePath relativePath = (RelativePath)theEObject;
				T result = caseRelativePath(relativePath);
				if (result == null) result = caseResourcePath(relativePath);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SyncPackage.IMPORT_SPEC: {
				ImportSpec importSpec = (ImportSpec)theEObject;
				T result = caseImportSpec(importSpec);
				if (result == null) result = casePortSpec(importSpec);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SyncPackage.IMPORT_RULE: {
				ImportRule importRule = (ImportRule)theEObject;
				T result = caseImportRule(importRule);
				if (result == null) result = casePathRule(importRule);
				if (result == null) result = caseEmfsResourceRule(importRule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SyncPackage.EMFS_RESOURCE_RULE: {
				EmfsResourceRule emfsResourceRule = (EmfsResourceRule)theEObject;
				T result = caseEmfsResourceRule(emfsResourceRule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SyncPackage.TAGS_RULE: {
				TagsRule tagsRule = (TagsRule)theEObject;
				T result = caseTagsRule(tagsRule);
				if (result == null) result = caseEmfsResourceRule(tagsRule);
				if (result == null) result = caseTagsOwner(tagsRule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SyncPackage.PROPERTIES_RULE: {
				PropertiesRule propertiesRule = (PropertiesRule)theEObject;
				T result = casePropertiesRule(propertiesRule);
				if (result == null) result = caseEmfsResourceRule(propertiesRule);
				if (result == null) result = casePropertyOwner(propertiesRule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Export Spec</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Export Spec</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExportSpec(ExportSpec object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port Spec</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port Spec</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <R extends PathRule<R>> T casePortSpec(PortSpec<R> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Path Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Path Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <R extends PathRule<R>> T casePathRule(PathRule<R> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Export Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Export Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExportRule(ExportRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource Path</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource Path</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResourcePath(ResourcePath object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResourceCondition(ResourceCondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composite Resource Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composite Resource Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompositeResourceCondition(CompositeResourceCondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringCondition(StringCondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Name Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Name Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNameCondition(NameCondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Full Path Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Full Path Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFullPathCondition(FullPathCondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tags Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tags Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTagsCondition(TagsCondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Properties Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Properties Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropertiesCondition(PropertiesCondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relative Path</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relative Path</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelativePath(RelativePath object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Import Spec</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Import Spec</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImportSpec(ImportSpec object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Import Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Import Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImportRule(ImportRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Emfs Resource Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Emfs Resource Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEmfsResourceRule(EmfsResourceRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tags Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tags Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTagsRule(TagsRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Properties Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Properties Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropertiesRule(PropertiesRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tags Owner</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tags Owner</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTagsOwner(TagsOwner object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property Owner</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property Owner</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropertyOwner(PropertyOwner object) {
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

} //SyncSwitch
