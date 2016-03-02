/**
 */
package no.hal.emfs.sync;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see no.hal.emfs.sync.SyncPackage
 * @generated
 */
public interface SyncFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SyncFactory eINSTANCE = no.hal.emfs.sync.impl.SyncFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Export Spec</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Export Spec</em>'.
	 * @generated
	 */
	ExportSpec createExportSpec();

	/**
	 * Returns a new object of class '<em>Port Spec</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Port Spec</em>'.
	 * @generated
	 */
	<R extends PathRule<R>> PortSpec<R> createPortSpec();

	/**
	 * Returns a new object of class '<em>Path Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Path Rule</em>'.
	 * @generated
	 */
	<R extends PathRule<R>> PathRule<R> createPathRule();

	/**
	 * Returns a new object of class '<em>Export Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Export Rule</em>'.
	 * @generated
	 */
	ExportRule createExportRule();

	/**
	 * Returns a new object of class '<em>Composite Resource Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Composite Resource Condition</em>'.
	 * @generated
	 */
	CompositeResourceCondition createCompositeResourceCondition();

	/**
	 * Returns a new object of class '<em>Name Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Name Condition</em>'.
	 * @generated
	 */
	NameCondition createNameCondition();

	/**
	 * Returns a new object of class '<em>Full Path Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Full Path Condition</em>'.
	 * @generated
	 */
	FullPathCondition createFullPathCondition();

	/**
	 * Returns a new object of class '<em>Tags Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tags Condition</em>'.
	 * @generated
	 */
	TagsCondition createTagsCondition();

	/**
	 * Returns a new object of class '<em>Properties Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Properties Condition</em>'.
	 * @generated
	 */
	PropertiesCondition createPropertiesCondition();

	/**
	 * Returns a new object of class '<em>Relative Path</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Relative Path</em>'.
	 * @generated
	 */
	RelativePath createRelativePath();

	/**
	 * Returns a new object of class '<em>Import Spec</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Import Spec</em>'.
	 * @generated
	 */
	ImportSpec createImportSpec();

	/**
	 * Returns a new object of class '<em>Import Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Import Rule</em>'.
	 * @generated
	 */
	ImportRule createImportRule();

	/**
	 * Returns a new object of class '<em>Emfs Resource Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Emfs Resource Rule</em>'.
	 * @generated
	 */
	EmfsResourceRule createEmfsResourceRule();

	/**
	 * Returns a new object of class '<em>Tags Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tags Rule</em>'.
	 * @generated
	 */
	TagsRule createTagsRule();

	/**
	 * Returns a new object of class '<em>Properties Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Properties Rule</em>'.
	 * @generated
	 */
	PropertiesRule createPropertiesRule();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SyncPackage getSyncPackage();

} //SyncFactory
