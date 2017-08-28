/**
 */
package no.hal.learning.fv.util;

import java.util.Map;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import no.hal.learning.fv.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see no.hal.learning.fv.FvPackage
 * @generated
 */
public class FvAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static FvPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FvAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = FvPackage.eINSTANCE;
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
	protected FvSwitch<Adapter> modelSwitch =
		new FvSwitch<Adapter>() {
			@Override
			public Adapter caseFeatureValued(FeatureValued object) {
				return createFeatureValuedAdapter();
			}
			@Override
			public Adapter caseDelegatedFeatures(DelegatedFeatures object) {
				return createDelegatedFeaturesAdapter();
			}
			@Override
			public Adapter caseStringToDouble(Map.Entry<String, Double> object) {
				return createStringToDoubleAdapter();
			}
			@Override
			public Adapter caseFeatureList(FeatureList object) {
				return createFeatureListAdapter();
			}
			@Override
			public Adapter caseConstantFeatureList(ConstantFeatureList object) {
				return createConstantFeatureListAdapter();
			}
			@Override
			public Adapter caseEFeatureObject(EFeatureObject object) {
				return createEFeatureObjectAdapter();
			}
			@Override
			public Adapter caseDerivedFeatures(DerivedFeatures object) {
				return createDerivedFeaturesAdapter();
			}
			@Override
			public Adapter caseOpDerivedFeatures(OpDerivedFeatures object) {
				return createOpDerivedFeaturesAdapter();
			}
			@Override
			public Adapter caseDerivedFeatures1(DerivedFeatures1 object) {
				return createDerivedFeatures1Adapter();
			}
			@Override
			public Adapter caseDerivedFeaturesN(DerivedFeaturesN object) {
				return createDerivedFeaturesNAdapter();
			}
			@Override
			public Adapter caseFilteredFeatures(FilteredFeatures object) {
				return createFilteredFeaturesAdapter();
			}
			@Override
			public Adapter caseFilteredFeatures1(FilteredFeatures1 object) {
				return createFilteredFeatures1Adapter();
			}
			@Override
			public Adapter caseFilteredFeatures2(FilteredFeatures2 object) {
				return createFilteredFeatures2Adapter();
			}
			@Override
			public Adapter caseStringToString(Map.Entry<String, String> object) {
				return createStringToStringAdapter();
			}
			@Override
			public Adapter caseExpressionFeatures(ExpressionFeatures object) {
				return createExpressionFeaturesAdapter();
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
	 * Creates a new adapter for an object of class '{@link no.hal.learning.fv.FeatureValued <em>Feature Valued</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.learning.fv.FeatureValued
	 * @generated
	 */
	public Adapter createFeatureValuedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.learning.fv.DelegatedFeatures <em>Delegated Features</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.learning.fv.DelegatedFeatures
	 * @generated
	 */
	public Adapter createDelegatedFeaturesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link java.util.Map.Entry <em>String To Double</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see java.util.Map.Entry
	 * @generated
	 */
	public Adapter createStringToDoubleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.learning.fv.FeatureList <em>Feature List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.learning.fv.FeatureList
	 * @generated
	 */
	public Adapter createFeatureListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.learning.fv.ConstantFeatureList <em>Constant Feature List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.learning.fv.ConstantFeatureList
	 * @generated
	 */
	public Adapter createConstantFeatureListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.learning.fv.EFeatureObject <em>EFeature Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.learning.fv.EFeatureObject
	 * @generated
	 */
	public Adapter createEFeatureObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.learning.fv.DerivedFeatures <em>Derived Features</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.learning.fv.DerivedFeatures
	 * @generated
	 */
	public Adapter createDerivedFeaturesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.learning.fv.OpDerivedFeatures <em>Op Derived Features</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.learning.fv.OpDerivedFeatures
	 * @generated
	 */
	public Adapter createOpDerivedFeaturesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.learning.fv.DerivedFeatures1 <em>Derived Features1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.learning.fv.DerivedFeatures1
	 * @generated
	 */
	public Adapter createDerivedFeatures1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.learning.fv.DerivedFeaturesN <em>Derived Features N</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.learning.fv.DerivedFeaturesN
	 * @generated
	 */
	public Adapter createDerivedFeaturesNAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.learning.fv.FilteredFeatures <em>Filtered Features</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.learning.fv.FilteredFeatures
	 * @generated
	 */
	public Adapter createFilteredFeaturesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.learning.fv.FilteredFeatures1 <em>Filtered Features1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.learning.fv.FilteredFeatures1
	 * @generated
	 */
	public Adapter createFilteredFeatures1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.learning.fv.FilteredFeatures2 <em>Filtered Features2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.learning.fv.FilteredFeatures2
	 * @generated
	 */
	public Adapter createFilteredFeatures2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link java.util.Map.Entry <em>String To String</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see java.util.Map.Entry
	 * @generated
	 */
	public Adapter createStringToStringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.learning.fv.ExpressionFeatures <em>Expression Features</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.learning.fv.ExpressionFeatures
	 * @generated
	 */
	public Adapter createExpressionFeaturesAdapter() {
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

} //FvAdapterFactory
