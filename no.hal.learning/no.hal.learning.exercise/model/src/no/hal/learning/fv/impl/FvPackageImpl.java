/**
 */
package no.hal.learning.fv.impl;

import java.util.Map;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import no.hal.learning.fv.ConstantFeatureList;
import no.hal.learning.fv.DelegatedFeatures;
import no.hal.learning.fv.DerivedFeatures;
import no.hal.learning.fv.DerivedFeatures1;
import no.hal.learning.fv.DerivedFeaturesN;
import no.hal.learning.fv.EFeatureObject;
import no.hal.learning.fv.ExpressionFeatures;
import no.hal.learning.fv.FeatureList;
import no.hal.learning.fv.FeatureValued;
import no.hal.learning.fv.FilteredFeatures;
import no.hal.learning.fv.FilteredFeatures1;
import no.hal.learning.fv.FilteredFeatures2;
import no.hal.learning.fv.FvFactory;
import no.hal.learning.fv.FvPackage;
import no.hal.learning.fv.Op1Kind;
import no.hal.learning.fv.Op2Kind;
import no.hal.learning.fv.OpDerivedFeatures;
import no.hal.learning.fv.Pred1Kind;
import no.hal.learning.fv.Pred2Kind;
import no.hal.learning.fv.util.Op1;
import no.hal.learning.fv.util.Op2;
import no.hal.learning.fv.util.Pred1;
import no.hal.learning.fv.util.Pred2;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FvPackageImpl extends EPackageImpl implements FvPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featureValuedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass delegatedFeaturesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringToDoubleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featureListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constantFeatureListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eFeatureObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass derivedFeaturesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass opDerivedFeaturesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass derivedFeatures1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass derivedFeaturesNEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass filteredFeaturesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass filteredFeatures1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass filteredFeatures2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringToStringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expressionFeaturesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum op1KindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum op2KindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum pred1KindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum pred2KindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType op1EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType op2EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType pred1EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType pred2EDataType = null;

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
	 * @see no.hal.learning.fv.FvPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private FvPackageImpl() {
		super(eNS_URI, FvFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link FvPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static FvPackage init() {
		if (isInited) return (FvPackage)EPackage.Registry.INSTANCE.getEPackage(FvPackage.eNS_URI);

		// Obtain or create and register package
		FvPackageImpl theFvPackage = (FvPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof FvPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new FvPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theFvPackage.createPackageContents();

		// Initialize created meta-data
		theFvPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theFvPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(FvPackage.eNS_URI, theFvPackage);
		return theFvPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFeatureValued() {
		return featureValuedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFeatureValued__GetFeatureNames() {
		return featureValuedEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFeatureValued__GetFeatureValue__String() {
		return featureValuedEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFeatureValued__HasFeature__String() {
		return featureValuedEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFeatureValued__ToFeatureList() {
		return featureValuedEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDelegatedFeatures() {
		return delegatedFeaturesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDelegatedFeatures_Features() {
		return (EReference)delegatedFeaturesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStringToDouble() {
		return stringToDoubleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStringToDouble_Key() {
		return (EAttribute)stringToDoubleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStringToDouble_Value() {
		return (EAttribute)stringToDoubleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFeatureList() {
		return featureListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFeatureList_Name() {
		return (EAttribute)featureListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeatureList_Features() {
		return (EReference)featureListEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFeatureList__Set__FeatureValued_boolean() {
		return featureListEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFeatureList__Apply__Op1() {
		return featureListEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFeatureList__Apply__Op2_FeatureValued_boolean() {
		return featureListEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFeatureList__Apply__Op2_double_boolean() {
		return featureListEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFeatureList__Count__Pred1() {
		return featureListEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFeatureList__Count__Pred2_FeatureValued_boolean() {
		return featureListEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFeatureList__Count__FeatureValued() {
		return featureListEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFeatureList__Zero__double() {
		return featureListEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstantFeatureList() {
		return constantFeatureListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConstantFeatureList_FeatureNames() {
		return (EAttribute)constantFeatureListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConstantFeatureList_Val() {
		return (EAttribute)constantFeatureListEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConstantFeatureList_DefVal() {
		return (EAttribute)constantFeatureListEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEFeatureObject() {
		return eFeatureObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDerivedFeatures() {
		return derivedFeaturesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDerivedFeatures_Contained() {
		return (EReference)derivedFeaturesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOpDerivedFeatures() {
		return opDerivedFeaturesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOpDerivedFeatures_Op() {
		return (EAttribute)opDerivedFeaturesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOpDerivedFeatures_Val() {
		return (EAttribute)opDerivedFeaturesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOpDerivedFeatures_Swap() {
		return (EAttribute)opDerivedFeaturesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDerivedFeatures1() {
		return derivedFeatures1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDerivedFeatures1_Other() {
		return (EReference)derivedFeatures1EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDerivedFeaturesN() {
		return derivedFeaturesNEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDerivedFeaturesN_Others() {
		return (EReference)derivedFeaturesNEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFilteredFeatures() {
		return filteredFeaturesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFilteredFeatures_Other() {
		return (EReference)filteredFeaturesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFilteredFeatures_NameFilter() {
		return (EAttribute)filteredFeaturesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFilteredFeatures1() {
		return filteredFeatures1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFilteredFeatures1_Pred() {
		return (EAttribute)filteredFeatures1EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFilteredFeatures2() {
		return filteredFeatures2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFilteredFeatures2_Pred() {
		return (EAttribute)filteredFeatures2EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFilteredFeatures2_Val() {
		return (EAttribute)filteredFeatures2EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFilteredFeatures2_ValFeatures() {
		return (EReference)filteredFeatures2EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFilteredFeatures2_Swap() {
		return (EAttribute)filteredFeatures2EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStringToString() {
		return stringToStringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStringToString_Key() {
		return (EAttribute)stringToStringEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStringToString_Value() {
		return (EAttribute)stringToStringEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpressionFeatures() {
		return expressionFeaturesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpressionFeatures_Features() {
		return (EReference)expressionFeaturesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpressionFeatures_Other() {
		return (EReference)expressionFeaturesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getOp1Kind() {
		return op1KindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getOp2Kind() {
		return op2KindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPred1Kind() {
		return pred1KindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPred2Kind() {
		return pred2KindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getOp1() {
		return op1EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getOp2() {
		return op2EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPred1() {
		return pred1EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPred2() {
		return pred2EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FvFactory getFvFactory() {
		return (FvFactory)getEFactoryInstance();
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
		featureValuedEClass = createEClass(FEATURE_VALUED);
		createEOperation(featureValuedEClass, FEATURE_VALUED___GET_FEATURE_NAMES);
		createEOperation(featureValuedEClass, FEATURE_VALUED___GET_FEATURE_VALUE__STRING);
		createEOperation(featureValuedEClass, FEATURE_VALUED___HAS_FEATURE__STRING);
		createEOperation(featureValuedEClass, FEATURE_VALUED___TO_FEATURE_LIST);

		delegatedFeaturesEClass = createEClass(DELEGATED_FEATURES);
		createEReference(delegatedFeaturesEClass, DELEGATED_FEATURES__FEATURES);

		stringToDoubleEClass = createEClass(STRING_TO_DOUBLE);
		createEAttribute(stringToDoubleEClass, STRING_TO_DOUBLE__KEY);
		createEAttribute(stringToDoubleEClass, STRING_TO_DOUBLE__VALUE);

		featureListEClass = createEClass(FEATURE_LIST);
		createEAttribute(featureListEClass, FEATURE_LIST__NAME);
		createEReference(featureListEClass, FEATURE_LIST__FEATURES);
		createEOperation(featureListEClass, FEATURE_LIST___SET__FEATUREVALUED_BOOLEAN);
		createEOperation(featureListEClass, FEATURE_LIST___APPLY__OP1);
		createEOperation(featureListEClass, FEATURE_LIST___APPLY__OP2_FEATUREVALUED_BOOLEAN);
		createEOperation(featureListEClass, FEATURE_LIST___APPLY__OP2_DOUBLE_BOOLEAN);
		createEOperation(featureListEClass, FEATURE_LIST___COUNT__PRED1);
		createEOperation(featureListEClass, FEATURE_LIST___COUNT__PRED2_FEATUREVALUED_BOOLEAN);
		createEOperation(featureListEClass, FEATURE_LIST___COUNT__FEATUREVALUED);
		createEOperation(featureListEClass, FEATURE_LIST___ZERO__DOUBLE);

		constantFeatureListEClass = createEClass(CONSTANT_FEATURE_LIST);
		createEAttribute(constantFeatureListEClass, CONSTANT_FEATURE_LIST__FEATURE_NAMES);
		createEAttribute(constantFeatureListEClass, CONSTANT_FEATURE_LIST__VAL);
		createEAttribute(constantFeatureListEClass, CONSTANT_FEATURE_LIST__DEF_VAL);

		eFeatureObjectEClass = createEClass(EFEATURE_OBJECT);

		derivedFeaturesEClass = createEClass(DERIVED_FEATURES);
		createEReference(derivedFeaturesEClass, DERIVED_FEATURES__CONTAINED);

		opDerivedFeaturesEClass = createEClass(OP_DERIVED_FEATURES);
		createEAttribute(opDerivedFeaturesEClass, OP_DERIVED_FEATURES__OP);
		createEAttribute(opDerivedFeaturesEClass, OP_DERIVED_FEATURES__VAL);
		createEAttribute(opDerivedFeaturesEClass, OP_DERIVED_FEATURES__SWAP);

		derivedFeatures1EClass = createEClass(DERIVED_FEATURES1);
		createEReference(derivedFeatures1EClass, DERIVED_FEATURES1__OTHER);

		derivedFeaturesNEClass = createEClass(DERIVED_FEATURES_N);
		createEReference(derivedFeaturesNEClass, DERIVED_FEATURES_N__OTHERS);

		filteredFeaturesEClass = createEClass(FILTERED_FEATURES);
		createEReference(filteredFeaturesEClass, FILTERED_FEATURES__OTHER);
		createEAttribute(filteredFeaturesEClass, FILTERED_FEATURES__NAME_FILTER);

		filteredFeatures1EClass = createEClass(FILTERED_FEATURES1);
		createEAttribute(filteredFeatures1EClass, FILTERED_FEATURES1__PRED);

		filteredFeatures2EClass = createEClass(FILTERED_FEATURES2);
		createEAttribute(filteredFeatures2EClass, FILTERED_FEATURES2__PRED);
		createEAttribute(filteredFeatures2EClass, FILTERED_FEATURES2__VAL);
		createEReference(filteredFeatures2EClass, FILTERED_FEATURES2__VAL_FEATURES);
		createEAttribute(filteredFeatures2EClass, FILTERED_FEATURES2__SWAP);

		stringToStringEClass = createEClass(STRING_TO_STRING);
		createEAttribute(stringToStringEClass, STRING_TO_STRING__KEY);
		createEAttribute(stringToStringEClass, STRING_TO_STRING__VALUE);

		expressionFeaturesEClass = createEClass(EXPRESSION_FEATURES);
		createEReference(expressionFeaturesEClass, EXPRESSION_FEATURES__FEATURES);
		createEReference(expressionFeaturesEClass, EXPRESSION_FEATURES__OTHER);

		// Create enums
		op1KindEEnum = createEEnum(OP1_KIND);
		op2KindEEnum = createEEnum(OP2_KIND);
		pred1KindEEnum = createEEnum(PRED1_KIND);
		pred2KindEEnum = createEEnum(PRED2_KIND);

		// Create data types
		op1EDataType = createEDataType(OP1);
		op2EDataType = createEDataType(OP2);
		pred1EDataType = createEDataType(PRED1);
		pred2EDataType = createEDataType(PRED2);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		delegatedFeaturesEClass.getESuperTypes().add(this.getFeatureValued());
		featureListEClass.getESuperTypes().add(this.getFeatureValued());
		constantFeatureListEClass.getESuperTypes().add(this.getFeatureValued());
		eFeatureObjectEClass.getESuperTypes().add(this.getFeatureValued());
		derivedFeaturesEClass.getESuperTypes().add(this.getFeatureValued());
		opDerivedFeaturesEClass.getESuperTypes().add(this.getDerivedFeatures());
		derivedFeatures1EClass.getESuperTypes().add(this.getOpDerivedFeatures());
		derivedFeaturesNEClass.getESuperTypes().add(this.getOpDerivedFeatures());
		filteredFeaturesEClass.getESuperTypes().add(this.getDerivedFeatures());
		filteredFeatures1EClass.getESuperTypes().add(this.getFilteredFeatures());
		filteredFeatures2EClass.getESuperTypes().add(this.getFilteredFeatures());
		expressionFeaturesEClass.getESuperTypes().add(this.getDerivedFeatures());

		// Initialize classes, features, and operations; add parameters
		initEClass(featureValuedEClass, FeatureValued.class, "FeatureValued", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getFeatureValued__GetFeatureNames(), ecorePackage.getEString(), "getFeatureNames", 0, -1, IS_UNIQUE, IS_ORDERED);

		EOperation op = initEOperation(getFeatureValued__GetFeatureValue__String(), ecorePackage.getEDouble(), "getFeatureValue", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "featureName", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getFeatureValued__HasFeature__String(), ecorePackage.getEBoolean(), "hasFeature", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "featureName", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getFeatureValued__ToFeatureList(), this.getFeatureList(), "toFeatureList", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(delegatedFeaturesEClass, DelegatedFeatures.class, "DelegatedFeatures", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDelegatedFeatures_Features(), this.getFeatureValued(), null, "features", null, 0, 1, DelegatedFeatures.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stringToDoubleEClass, Map.Entry.class, "StringToDouble", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStringToDouble_Key(), ecorePackage.getEString(), "key", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStringToDouble_Value(), ecorePackage.getEDoubleObject(), "value", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(featureListEClass, FeatureList.class, "FeatureList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFeatureList_Name(), ecorePackage.getEString(), "name", null, 0, 1, FeatureList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFeatureList_Features(), this.getStringToDouble(), null, "features", null, 0, -1, FeatureList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getFeatureList__Set__FeatureValued_boolean(), null, "set", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getFeatureValued(), "features", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "clear", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getFeatureList__Apply__Op1(), null, "apply", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getOp1(), "op", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getFeatureList__Apply__Op2_FeatureValued_boolean(), null, "apply", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getOp2(), "op", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getFeatureValued(), "features", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "swap", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getFeatureList__Apply__Op2_double_boolean(), null, "apply", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getOp2(), "op", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "val", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "swap", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getFeatureList__Count__Pred1(), ecorePackage.getEInt(), "count", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getPred1(), "pred", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getFeatureList__Count__Pred2_FeatureValued_boolean(), ecorePackage.getEInt(), "count", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getPred2(), "pred", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getFeatureValued(), "features", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "swap", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getFeatureList__Count__FeatureValued(), ecorePackage.getEInt(), "count", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getFeatureValued(), "features", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getFeatureList__Zero__double(), null, "zero", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "threshold", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(constantFeatureListEClass, ConstantFeatureList.class, "ConstantFeatureList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConstantFeatureList_FeatureNames(), ecorePackage.getEString(), "featureNames", null, 0, -1, ConstantFeatureList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConstantFeatureList_Val(), ecorePackage.getEDouble(), "val", null, 0, 1, ConstantFeatureList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConstantFeatureList_DefVal(), ecorePackage.getEDouble(), "defVal", "0.0", 0, 1, ConstantFeatureList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eFeatureObjectEClass, EFeatureObject.class, "EFeatureObject", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(derivedFeaturesEClass, DerivedFeatures.class, "DerivedFeatures", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDerivedFeatures_Contained(), this.getFeatureValued(), null, "contained", null, 0, -1, DerivedFeatures.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(opDerivedFeaturesEClass, OpDerivedFeatures.class, "OpDerivedFeatures", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOpDerivedFeatures_Op(), this.getOp2Kind(), "op", null, 0, 1, OpDerivedFeatures.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOpDerivedFeatures_Val(), ecorePackage.getEDouble(), "val", null, 0, 1, OpDerivedFeatures.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOpDerivedFeatures_Swap(), ecorePackage.getEBoolean(), "swap", null, 0, 1, OpDerivedFeatures.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(derivedFeatures1EClass, DerivedFeatures1.class, "DerivedFeatures1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDerivedFeatures1_Other(), this.getFeatureValued(), null, "other", null, 0, 1, DerivedFeatures1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(derivedFeaturesNEClass, DerivedFeaturesN.class, "DerivedFeaturesN", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDerivedFeaturesN_Others(), this.getFeatureValued(), null, "others", null, 0, -1, DerivedFeaturesN.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(filteredFeaturesEClass, FilteredFeatures.class, "FilteredFeatures", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFilteredFeatures_Other(), this.getFeatureValued(), null, "other", null, 0, 1, FilteredFeatures.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFilteredFeatures_NameFilter(), ecorePackage.getEString(), "nameFilter", null, 0, 1, FilteredFeatures.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(filteredFeatures1EClass, FilteredFeatures1.class, "FilteredFeatures1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFilteredFeatures1_Pred(), this.getPred1Kind(), "pred", null, 0, 1, FilteredFeatures1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(filteredFeatures2EClass, FilteredFeatures2.class, "FilteredFeatures2", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFilteredFeatures2_Pred(), this.getPred2Kind(), "pred", null, 0, 1, FilteredFeatures2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFilteredFeatures2_Val(), ecorePackage.getEDouble(), "val", null, 0, 1, FilteredFeatures2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFilteredFeatures2_ValFeatures(), this.getFeatureValued(), null, "valFeatures", null, 0, 1, FilteredFeatures2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFilteredFeatures2_Swap(), ecorePackage.getEBoolean(), "swap", null, 0, 1, FilteredFeatures2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stringToStringEClass, Map.Entry.class, "StringToString", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStringToString_Key(), ecorePackage.getEString(), "key", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStringToString_Value(), ecorePackage.getEString(), "value", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(expressionFeaturesEClass, ExpressionFeatures.class, "ExpressionFeatures", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExpressionFeatures_Features(), this.getStringToString(), null, "features", null, 0, -1, ExpressionFeatures.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExpressionFeatures_Other(), this.getFeatureValued(), null, "other", null, 0, 1, ExpressionFeatures.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(op1KindEEnum, Op1Kind.class, "Op1Kind");
		addEEnumLiteral(op1KindEEnum, Op1Kind.NEG);
		addEEnumLiteral(op1KindEEnum, Op1Kind.INV);
		addEEnumLiteral(op1KindEEnum, Op1Kind.ABS);
		addEEnumLiteral(op1KindEEnum, Op1Kind.SIGNUM);

		initEEnum(op2KindEEnum, Op2Kind.class, "Op2Kind");
		addEEnumLiteral(op2KindEEnum, Op2Kind.PLUS);
		addEEnumLiteral(op2KindEEnum, Op2Kind.MINUS);
		addEEnumLiteral(op2KindEEnum, Op2Kind.MULT);
		addEEnumLiteral(op2KindEEnum, Op2Kind.DIV);
		addEEnumLiteral(op2KindEEnum, Op2Kind.MIN);
		addEEnumLiteral(op2KindEEnum, Op2Kind.MAX);
		addEEnumLiteral(op2KindEEnum, Op2Kind.COMPARE);
		addEEnumLiteral(op2KindEEnum, Op2Kind.AVERAGE);

		initEEnum(pred1KindEEnum, Pred1Kind.class, "Pred1Kind");
		addEEnumLiteral(pred1KindEEnum, Pred1Kind.GT0);
		addEEnumLiteral(pred1KindEEnum, Pred1Kind.GE0);
		addEEnumLiteral(pred1KindEEnum, Pred1Kind.ZERO);
		addEEnumLiteral(pred1KindEEnum, Pred1Kind.LE0);
		addEEnumLiteral(pred1KindEEnum, Pred1Kind.LT0);

		initEEnum(pred2KindEEnum, Pred2Kind.class, "Pred2Kind");
		addEEnumLiteral(pred2KindEEnum, Pred2Kind.EQ);
		addEEnumLiteral(pred2KindEEnum, Pred2Kind.LT);
		addEEnumLiteral(pred2KindEEnum, Pred2Kind.LE);
		addEEnumLiteral(pred2KindEEnum, Pred2Kind.GT);
		addEEnumLiteral(pred2KindEEnum, Pred2Kind.GE);

		// Initialize data types
		initEDataType(op1EDataType, Op1.class, "Op1", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(op2EDataType, Op2.class, "Op2", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(pred1EDataType, Pred1.class, "Pred1", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(pred2EDataType, Pred2.class, "Pred2", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //FvPackageImpl
