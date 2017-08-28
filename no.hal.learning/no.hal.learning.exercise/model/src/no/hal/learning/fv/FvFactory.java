/**
 */
package no.hal.learning.fv;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see no.hal.learning.fv.FvPackage
 * @generated
 */
public interface FvFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FvFactory eINSTANCE = no.hal.learning.fv.impl.FvFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Delegated Features</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Delegated Features</em>'.
	 * @generated
	 */
	DelegatedFeatures createDelegatedFeatures();

	/**
	 * Returns a new object of class '<em>Feature List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Feature List</em>'.
	 * @generated
	 */
	FeatureList createFeatureList();

	/**
	 * Returns a new object of class '<em>Constant Feature List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Constant Feature List</em>'.
	 * @generated
	 */
	ConstantFeatureList createConstantFeatureList();

	/**
	 * Returns a new object of class '<em>Derived Features1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Derived Features1</em>'.
	 * @generated
	 */
	DerivedFeatures1 createDerivedFeatures1();

	/**
	 * Returns a new object of class '<em>Derived Features N</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Derived Features N</em>'.
	 * @generated
	 */
	DerivedFeaturesN createDerivedFeaturesN();

	/**
	 * Returns a new object of class '<em>Filtered Features1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Filtered Features1</em>'.
	 * @generated
	 */
	FilteredFeatures1 createFilteredFeatures1();

	/**
	 * Returns a new object of class '<em>Filtered Features2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Filtered Features2</em>'.
	 * @generated
	 */
	FilteredFeatures2 createFilteredFeatures2();

	/**
	 * Returns a new object of class '<em>Expression Features</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Expression Features</em>'.
	 * @generated
	 */
	ExpressionFeatures createExpressionFeatures();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	FvPackage getFvPackage();

} //FvFactory
