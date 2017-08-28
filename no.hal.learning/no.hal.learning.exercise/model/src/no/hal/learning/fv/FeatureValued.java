/**
 */
package no.hal.learning.fv;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature Valued</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see no.hal.learning.fv.FvPackage#getFeatureValued()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface FeatureValued extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<String> getFeatureNames();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	double getFeatureValue(String featureName);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean hasFeature(String featureName);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	FeatureList toFeatureList();

} // FeatureValued
