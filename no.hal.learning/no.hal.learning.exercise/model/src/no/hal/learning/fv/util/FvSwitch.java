/**
 */
package no.hal.learning.fv.util;

import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import no.hal.learning.fv.*;

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
 * @see no.hal.learning.fv.FvPackage
 * @generated
 */
public class FvSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static FvPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FvSwitch() {
		if (modelPackage == null) {
			modelPackage = FvPackage.eINSTANCE;
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
			case FvPackage.FEATURE_VALUED: {
				FeatureValued featureValued = (FeatureValued)theEObject;
				T result = caseFeatureValued(featureValued);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FvPackage.DELEGATED_FEATURES: {
				DelegatedFeatures delegatedFeatures = (DelegatedFeatures)theEObject;
				T result = caseDelegatedFeatures(delegatedFeatures);
				if (result == null) result = caseFeatureValued(delegatedFeatures);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FvPackage.STRING_TO_DOUBLE: {
				@SuppressWarnings("unchecked") Map.Entry<String, Double> stringToDouble = (Map.Entry<String, Double>)theEObject;
				T result = caseStringToDouble(stringToDouble);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FvPackage.FEATURE_LIST: {
				FeatureList featureList = (FeatureList)theEObject;
				T result = caseFeatureList(featureList);
				if (result == null) result = caseFeatureValued(featureList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FvPackage.CONSTANT_FEATURE_LIST: {
				ConstantFeatureList constantFeatureList = (ConstantFeatureList)theEObject;
				T result = caseConstantFeatureList(constantFeatureList);
				if (result == null) result = caseFeatureValued(constantFeatureList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FvPackage.EFEATURE_OBJECT: {
				EFeatureObject eFeatureObject = (EFeatureObject)theEObject;
				T result = caseEFeatureObject(eFeatureObject);
				if (result == null) result = caseFeatureValued(eFeatureObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FvPackage.DERIVED_FEATURES: {
				DerivedFeatures derivedFeatures = (DerivedFeatures)theEObject;
				T result = caseDerivedFeatures(derivedFeatures);
				if (result == null) result = caseFeatureValued(derivedFeatures);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FvPackage.OP_DERIVED_FEATURES: {
				OpDerivedFeatures opDerivedFeatures = (OpDerivedFeatures)theEObject;
				T result = caseOpDerivedFeatures(opDerivedFeatures);
				if (result == null) result = caseDerivedFeatures(opDerivedFeatures);
				if (result == null) result = caseFeatureValued(opDerivedFeatures);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FvPackage.DERIVED_FEATURES1: {
				DerivedFeatures1 derivedFeatures1 = (DerivedFeatures1)theEObject;
				T result = caseDerivedFeatures1(derivedFeatures1);
				if (result == null) result = caseOpDerivedFeatures(derivedFeatures1);
				if (result == null) result = caseDerivedFeatures(derivedFeatures1);
				if (result == null) result = caseFeatureValued(derivedFeatures1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FvPackage.DERIVED_FEATURES_N: {
				DerivedFeaturesN derivedFeaturesN = (DerivedFeaturesN)theEObject;
				T result = caseDerivedFeaturesN(derivedFeaturesN);
				if (result == null) result = caseOpDerivedFeatures(derivedFeaturesN);
				if (result == null) result = caseDerivedFeatures(derivedFeaturesN);
				if (result == null) result = caseFeatureValued(derivedFeaturesN);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FvPackage.FILTERED_FEATURES: {
				FilteredFeatures filteredFeatures = (FilteredFeatures)theEObject;
				T result = caseFilteredFeatures(filteredFeatures);
				if (result == null) result = caseDerivedFeatures(filteredFeatures);
				if (result == null) result = caseFeatureValued(filteredFeatures);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FvPackage.FILTERED_FEATURES1: {
				FilteredFeatures1 filteredFeatures1 = (FilteredFeatures1)theEObject;
				T result = caseFilteredFeatures1(filteredFeatures1);
				if (result == null) result = caseFilteredFeatures(filteredFeatures1);
				if (result == null) result = caseDerivedFeatures(filteredFeatures1);
				if (result == null) result = caseFeatureValued(filteredFeatures1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FvPackage.FILTERED_FEATURES2: {
				FilteredFeatures2 filteredFeatures2 = (FilteredFeatures2)theEObject;
				T result = caseFilteredFeatures2(filteredFeatures2);
				if (result == null) result = caseFilteredFeatures(filteredFeatures2);
				if (result == null) result = caseDerivedFeatures(filteredFeatures2);
				if (result == null) result = caseFeatureValued(filteredFeatures2);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FvPackage.STRING_TO_STRING: {
				@SuppressWarnings("unchecked") Map.Entry<String, String> stringToString = (Map.Entry<String, String>)theEObject;
				T result = caseStringToString(stringToString);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FvPackage.EXPRESSION_FEATURES: {
				ExpressionFeatures expressionFeatures = (ExpressionFeatures)theEObject;
				T result = caseExpressionFeatures(expressionFeatures);
				if (result == null) result = caseDerivedFeatures(expressionFeatures);
				if (result == null) result = caseFeatureValued(expressionFeatures);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature Valued</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature Valued</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeatureValued(FeatureValued object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Delegated Features</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Delegated Features</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDelegatedFeatures(DelegatedFeatures object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String To Double</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String To Double</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringToDouble(Map.Entry<String, Double> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeatureList(FeatureList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constant Feature List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constant Feature List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstantFeatureList(ConstantFeatureList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EFeature Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EFeature Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEFeatureObject(EFeatureObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Derived Features</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Derived Features</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDerivedFeatures(DerivedFeatures object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Op Derived Features</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Op Derived Features</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOpDerivedFeatures(OpDerivedFeatures object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Derived Features1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Derived Features1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDerivedFeatures1(DerivedFeatures1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Derived Features N</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Derived Features N</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDerivedFeaturesN(DerivedFeaturesN object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Filtered Features</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Filtered Features</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFilteredFeatures(FilteredFeatures object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Filtered Features1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Filtered Features1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFilteredFeatures1(FilteredFeatures1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Filtered Features2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Filtered Features2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFilteredFeatures2(FilteredFeatures2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String To String</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String To String</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringToString(Map.Entry<String, String> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression Features</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression Features</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpressionFeatures(ExpressionFeatures object) {
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

} //FvSwitch
