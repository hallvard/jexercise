/**
 */
package no.hal.learning.fv;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
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
 * @see no.hal.learning.fv.FvFactory
 * @model kind="package"
 * @generated
 */
public interface FvPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "fv";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/plugin/no.hal.learning.execise.model/model/fv.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "fv";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FvPackage eINSTANCE = no.hal.learning.fv.impl.FvPackageImpl.init();

	/**
	 * The meta object id for the '{@link no.hal.learning.fv.FeatureValued <em>Feature Valued</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.learning.fv.FeatureValued
	 * @see no.hal.learning.fv.impl.FvPackageImpl#getFeatureValued()
	 * @generated
	 */
	int FEATURE_VALUED = 0;

	/**
	 * The number of structural features of the '<em>Feature Valued</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_VALUED_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Get Feature Names</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_VALUED___GET_FEATURE_NAMES = 0;

	/**
	 * The operation id for the '<em>Get Feature Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_VALUED___GET_FEATURE_VALUE__STRING = 1;

	/**
	 * The operation id for the '<em>Has Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_VALUED___HAS_FEATURE__STRING = 2;

	/**
	 * The operation id for the '<em>To Feature List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_VALUED___TO_FEATURE_LIST = 3;

	/**
	 * The number of operations of the '<em>Feature Valued</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_VALUED_OPERATION_COUNT = 4;

	/**
	 * The meta object id for the '{@link no.hal.learning.fv.impl.DelegatedFeaturesImpl <em>Delegated Features</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.learning.fv.impl.DelegatedFeaturesImpl
	 * @see no.hal.learning.fv.impl.FvPackageImpl#getDelegatedFeatures()
	 * @generated
	 */
	int DELEGATED_FEATURES = 1;

	/**
	 * The feature id for the '<em><b>Features</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATED_FEATURES__FEATURES = FEATURE_VALUED_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Delegated Features</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATED_FEATURES_FEATURE_COUNT = FEATURE_VALUED_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Feature Names</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATED_FEATURES___GET_FEATURE_NAMES = FEATURE_VALUED___GET_FEATURE_NAMES;

	/**
	 * The operation id for the '<em>Get Feature Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATED_FEATURES___GET_FEATURE_VALUE__STRING = FEATURE_VALUED___GET_FEATURE_VALUE__STRING;

	/**
	 * The operation id for the '<em>Has Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATED_FEATURES___HAS_FEATURE__STRING = FEATURE_VALUED___HAS_FEATURE__STRING;

	/**
	 * The operation id for the '<em>To Feature List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATED_FEATURES___TO_FEATURE_LIST = FEATURE_VALUED___TO_FEATURE_LIST;

	/**
	 * The number of operations of the '<em>Delegated Features</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATED_FEATURES_OPERATION_COUNT = FEATURE_VALUED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link no.hal.learning.fv.impl.StringToDoubleImpl <em>String To Double</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.learning.fv.impl.StringToDoubleImpl
	 * @see no.hal.learning.fv.impl.FvPackageImpl#getStringToDouble()
	 * @generated
	 */
	int STRING_TO_DOUBLE = 2;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_DOUBLE__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_DOUBLE__VALUE = 1;

	/**
	 * The number of structural features of the '<em>String To Double</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_DOUBLE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>String To Double</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_DOUBLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link no.hal.learning.fv.impl.FeatureListImpl <em>Feature List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.learning.fv.impl.FeatureListImpl
	 * @see no.hal.learning.fv.impl.FvPackageImpl#getFeatureList()
	 * @generated
	 */
	int FEATURE_LIST = 3;

	/**
	 * The feature id for the '<em><b>Features</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_LIST__FEATURES = FEATURE_VALUED_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Feature List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_LIST_FEATURE_COUNT = FEATURE_VALUED_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Feature Names</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_LIST___GET_FEATURE_NAMES = FEATURE_VALUED___GET_FEATURE_NAMES;

	/**
	 * The operation id for the '<em>Get Feature Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_LIST___GET_FEATURE_VALUE__STRING = FEATURE_VALUED___GET_FEATURE_VALUE__STRING;

	/**
	 * The operation id for the '<em>Has Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_LIST___HAS_FEATURE__STRING = FEATURE_VALUED___HAS_FEATURE__STRING;

	/**
	 * The operation id for the '<em>To Feature List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_LIST___TO_FEATURE_LIST = FEATURE_VALUED___TO_FEATURE_LIST;

	/**
	 * The operation id for the '<em>Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_LIST___SET__FEATUREVALUED_BOOLEAN = FEATURE_VALUED_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Apply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_LIST___APPLY__OP1 = FEATURE_VALUED_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Apply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_LIST___APPLY__OP2_FEATUREVALUED_BOOLEAN = FEATURE_VALUED_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Apply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_LIST___APPLY__OP2_DOUBLE_BOOLEAN = FEATURE_VALUED_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Count</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_LIST___COUNT__PRED1 = FEATURE_VALUED_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Count</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_LIST___COUNT__PRED2_FEATUREVALUED_BOOLEAN = FEATURE_VALUED_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Count</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_LIST___COUNT__FEATUREVALUED = FEATURE_VALUED_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Zero</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_LIST___ZERO__DOUBLE = FEATURE_VALUED_OPERATION_COUNT + 7;

	/**
	 * The number of operations of the '<em>Feature List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_LIST_OPERATION_COUNT = FEATURE_VALUED_OPERATION_COUNT + 8;


	/**
	 * The meta object id for the '{@link no.hal.learning.fv.impl.ConstantFeatureListImpl <em>Constant Feature List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.learning.fv.impl.ConstantFeatureListImpl
	 * @see no.hal.learning.fv.impl.FvPackageImpl#getConstantFeatureList()
	 * @generated
	 */
	int CONSTANT_FEATURE_LIST = 4;

	/**
	 * The feature id for the '<em><b>Feature Names</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_FEATURE_LIST__FEATURE_NAMES = FEATURE_VALUED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Val</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_FEATURE_LIST__VAL = FEATURE_VALUED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Def Val</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_FEATURE_LIST__DEF_VAL = FEATURE_VALUED_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Constant Feature List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_FEATURE_LIST_FEATURE_COUNT = FEATURE_VALUED_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Feature Names</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_FEATURE_LIST___GET_FEATURE_NAMES = FEATURE_VALUED___GET_FEATURE_NAMES;

	/**
	 * The operation id for the '<em>Get Feature Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_FEATURE_LIST___GET_FEATURE_VALUE__STRING = FEATURE_VALUED___GET_FEATURE_VALUE__STRING;

	/**
	 * The operation id for the '<em>Has Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_FEATURE_LIST___HAS_FEATURE__STRING = FEATURE_VALUED___HAS_FEATURE__STRING;

	/**
	 * The operation id for the '<em>To Feature List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_FEATURE_LIST___TO_FEATURE_LIST = FEATURE_VALUED___TO_FEATURE_LIST;

	/**
	 * The number of operations of the '<em>Constant Feature List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_FEATURE_LIST_OPERATION_COUNT = FEATURE_VALUED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link no.hal.learning.fv.impl.EFeatureObjectImpl <em>EFeature Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.learning.fv.impl.EFeatureObjectImpl
	 * @see no.hal.learning.fv.impl.FvPackageImpl#getEFeatureObject()
	 * @generated
	 */
	int EFEATURE_OBJECT = 5;

	/**
	 * The number of structural features of the '<em>EFeature Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFEATURE_OBJECT_FEATURE_COUNT = FEATURE_VALUED_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Feature Names</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFEATURE_OBJECT___GET_FEATURE_NAMES = FEATURE_VALUED___GET_FEATURE_NAMES;

	/**
	 * The operation id for the '<em>Get Feature Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFEATURE_OBJECT___GET_FEATURE_VALUE__STRING = FEATURE_VALUED___GET_FEATURE_VALUE__STRING;

	/**
	 * The operation id for the '<em>Has Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFEATURE_OBJECT___HAS_FEATURE__STRING = FEATURE_VALUED___HAS_FEATURE__STRING;

	/**
	 * The operation id for the '<em>To Feature List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFEATURE_OBJECT___TO_FEATURE_LIST = FEATURE_VALUED___TO_FEATURE_LIST;

	/**
	 * The number of operations of the '<em>EFeature Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFEATURE_OBJECT_OPERATION_COUNT = FEATURE_VALUED_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link no.hal.learning.fv.impl.DerivedFeaturesImpl <em>Derived Features</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.learning.fv.impl.DerivedFeaturesImpl
	 * @see no.hal.learning.fv.impl.FvPackageImpl#getDerivedFeatures()
	 * @generated
	 */
	int DERIVED_FEATURES = 6;

	/**
	 * The feature id for the '<em><b>Contained</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_FEATURES__CONTAINED = FEATURE_VALUED_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Derived Features</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_FEATURES_FEATURE_COUNT = FEATURE_VALUED_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Feature Names</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_FEATURES___GET_FEATURE_NAMES = FEATURE_VALUED___GET_FEATURE_NAMES;

	/**
	 * The operation id for the '<em>Get Feature Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_FEATURES___GET_FEATURE_VALUE__STRING = FEATURE_VALUED___GET_FEATURE_VALUE__STRING;

	/**
	 * The operation id for the '<em>Has Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_FEATURES___HAS_FEATURE__STRING = FEATURE_VALUED___HAS_FEATURE__STRING;

	/**
	 * The operation id for the '<em>To Feature List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_FEATURES___TO_FEATURE_LIST = FEATURE_VALUED___TO_FEATURE_LIST;

	/**
	 * The number of operations of the '<em>Derived Features</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_FEATURES_OPERATION_COUNT = FEATURE_VALUED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link no.hal.learning.fv.impl.OpDerivedFeaturesImpl <em>Op Derived Features</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.learning.fv.impl.OpDerivedFeaturesImpl
	 * @see no.hal.learning.fv.impl.FvPackageImpl#getOpDerivedFeatures()
	 * @generated
	 */
	int OP_DERIVED_FEATURES = 7;

	/**
	 * The feature id for the '<em><b>Contained</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OP_DERIVED_FEATURES__CONTAINED = DERIVED_FEATURES__CONTAINED;

	/**
	 * The feature id for the '<em><b>Op</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OP_DERIVED_FEATURES__OP = DERIVED_FEATURES_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Val</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OP_DERIVED_FEATURES__VAL = DERIVED_FEATURES_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Swap</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OP_DERIVED_FEATURES__SWAP = DERIVED_FEATURES_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Op Derived Features</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OP_DERIVED_FEATURES_FEATURE_COUNT = DERIVED_FEATURES_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Feature Names</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OP_DERIVED_FEATURES___GET_FEATURE_NAMES = DERIVED_FEATURES___GET_FEATURE_NAMES;

	/**
	 * The operation id for the '<em>Get Feature Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OP_DERIVED_FEATURES___GET_FEATURE_VALUE__STRING = DERIVED_FEATURES___GET_FEATURE_VALUE__STRING;

	/**
	 * The operation id for the '<em>Has Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OP_DERIVED_FEATURES___HAS_FEATURE__STRING = DERIVED_FEATURES___HAS_FEATURE__STRING;

	/**
	 * The operation id for the '<em>To Feature List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OP_DERIVED_FEATURES___TO_FEATURE_LIST = DERIVED_FEATURES___TO_FEATURE_LIST;

	/**
	 * The number of operations of the '<em>Op Derived Features</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OP_DERIVED_FEATURES_OPERATION_COUNT = DERIVED_FEATURES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link no.hal.learning.fv.impl.DerivedFeatures1Impl <em>Derived Features1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.learning.fv.impl.DerivedFeatures1Impl
	 * @see no.hal.learning.fv.impl.FvPackageImpl#getDerivedFeatures1()
	 * @generated
	 */
	int DERIVED_FEATURES1 = 8;

	/**
	 * The feature id for the '<em><b>Contained</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_FEATURES1__CONTAINED = OP_DERIVED_FEATURES__CONTAINED;

	/**
	 * The feature id for the '<em><b>Op</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_FEATURES1__OP = OP_DERIVED_FEATURES__OP;

	/**
	 * The feature id for the '<em><b>Val</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_FEATURES1__VAL = OP_DERIVED_FEATURES__VAL;

	/**
	 * The feature id for the '<em><b>Swap</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_FEATURES1__SWAP = OP_DERIVED_FEATURES__SWAP;

	/**
	 * The feature id for the '<em><b>Other</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_FEATURES1__OTHER = OP_DERIVED_FEATURES_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Derived Features1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_FEATURES1_FEATURE_COUNT = OP_DERIVED_FEATURES_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Feature Names</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_FEATURES1___GET_FEATURE_NAMES = OP_DERIVED_FEATURES___GET_FEATURE_NAMES;

	/**
	 * The operation id for the '<em>Get Feature Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_FEATURES1___GET_FEATURE_VALUE__STRING = OP_DERIVED_FEATURES___GET_FEATURE_VALUE__STRING;

	/**
	 * The operation id for the '<em>Has Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_FEATURES1___HAS_FEATURE__STRING = OP_DERIVED_FEATURES___HAS_FEATURE__STRING;

	/**
	 * The operation id for the '<em>To Feature List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_FEATURES1___TO_FEATURE_LIST = OP_DERIVED_FEATURES___TO_FEATURE_LIST;

	/**
	 * The number of operations of the '<em>Derived Features1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_FEATURES1_OPERATION_COUNT = OP_DERIVED_FEATURES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link no.hal.learning.fv.impl.DerivedFeaturesNImpl <em>Derived Features N</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.learning.fv.impl.DerivedFeaturesNImpl
	 * @see no.hal.learning.fv.impl.FvPackageImpl#getDerivedFeaturesN()
	 * @generated
	 */
	int DERIVED_FEATURES_N = 9;

	/**
	 * The feature id for the '<em><b>Contained</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_FEATURES_N__CONTAINED = OP_DERIVED_FEATURES__CONTAINED;

	/**
	 * The feature id for the '<em><b>Op</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_FEATURES_N__OP = OP_DERIVED_FEATURES__OP;

	/**
	 * The feature id for the '<em><b>Val</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_FEATURES_N__VAL = OP_DERIVED_FEATURES__VAL;

	/**
	 * The feature id for the '<em><b>Swap</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_FEATURES_N__SWAP = OP_DERIVED_FEATURES__SWAP;

	/**
	 * The feature id for the '<em><b>Others</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_FEATURES_N__OTHERS = OP_DERIVED_FEATURES_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Derived Features N</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_FEATURES_N_FEATURE_COUNT = OP_DERIVED_FEATURES_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Feature Names</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_FEATURES_N___GET_FEATURE_NAMES = OP_DERIVED_FEATURES___GET_FEATURE_NAMES;

	/**
	 * The operation id for the '<em>Get Feature Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_FEATURES_N___GET_FEATURE_VALUE__STRING = OP_DERIVED_FEATURES___GET_FEATURE_VALUE__STRING;

	/**
	 * The operation id for the '<em>Has Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_FEATURES_N___HAS_FEATURE__STRING = OP_DERIVED_FEATURES___HAS_FEATURE__STRING;

	/**
	 * The operation id for the '<em>To Feature List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_FEATURES_N___TO_FEATURE_LIST = OP_DERIVED_FEATURES___TO_FEATURE_LIST;

	/**
	 * The number of operations of the '<em>Derived Features N</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_FEATURES_N_OPERATION_COUNT = OP_DERIVED_FEATURES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link no.hal.learning.fv.impl.FilteredFeaturesImpl <em>Filtered Features</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.learning.fv.impl.FilteredFeaturesImpl
	 * @see no.hal.learning.fv.impl.FvPackageImpl#getFilteredFeatures()
	 * @generated
	 */
	int FILTERED_FEATURES = 10;

	/**
	 * The feature id for the '<em><b>Contained</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTERED_FEATURES__CONTAINED = DERIVED_FEATURES__CONTAINED;

	/**
	 * The feature id for the '<em><b>Other</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTERED_FEATURES__OTHER = DERIVED_FEATURES_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTERED_FEATURES__NAME_FILTER = DERIVED_FEATURES_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Filtered Features</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTERED_FEATURES_FEATURE_COUNT = DERIVED_FEATURES_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Feature Names</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTERED_FEATURES___GET_FEATURE_NAMES = DERIVED_FEATURES___GET_FEATURE_NAMES;

	/**
	 * The operation id for the '<em>Get Feature Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTERED_FEATURES___GET_FEATURE_VALUE__STRING = DERIVED_FEATURES___GET_FEATURE_VALUE__STRING;

	/**
	 * The operation id for the '<em>Has Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTERED_FEATURES___HAS_FEATURE__STRING = DERIVED_FEATURES___HAS_FEATURE__STRING;

	/**
	 * The operation id for the '<em>To Feature List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTERED_FEATURES___TO_FEATURE_LIST = DERIVED_FEATURES___TO_FEATURE_LIST;

	/**
	 * The number of operations of the '<em>Filtered Features</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTERED_FEATURES_OPERATION_COUNT = DERIVED_FEATURES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link no.hal.learning.fv.impl.FilteredFeatures1Impl <em>Filtered Features1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.learning.fv.impl.FilteredFeatures1Impl
	 * @see no.hal.learning.fv.impl.FvPackageImpl#getFilteredFeatures1()
	 * @generated
	 */
	int FILTERED_FEATURES1 = 11;

	/**
	 * The feature id for the '<em><b>Contained</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTERED_FEATURES1__CONTAINED = FILTERED_FEATURES__CONTAINED;

	/**
	 * The feature id for the '<em><b>Other</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTERED_FEATURES1__OTHER = FILTERED_FEATURES__OTHER;

	/**
	 * The feature id for the '<em><b>Name Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTERED_FEATURES1__NAME_FILTER = FILTERED_FEATURES__NAME_FILTER;

	/**
	 * The feature id for the '<em><b>Pred</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTERED_FEATURES1__PRED = FILTERED_FEATURES_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Filtered Features1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTERED_FEATURES1_FEATURE_COUNT = FILTERED_FEATURES_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Feature Names</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTERED_FEATURES1___GET_FEATURE_NAMES = FILTERED_FEATURES___GET_FEATURE_NAMES;

	/**
	 * The operation id for the '<em>Get Feature Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTERED_FEATURES1___GET_FEATURE_VALUE__STRING = FILTERED_FEATURES___GET_FEATURE_VALUE__STRING;

	/**
	 * The operation id for the '<em>Has Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTERED_FEATURES1___HAS_FEATURE__STRING = FILTERED_FEATURES___HAS_FEATURE__STRING;

	/**
	 * The operation id for the '<em>To Feature List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTERED_FEATURES1___TO_FEATURE_LIST = FILTERED_FEATURES___TO_FEATURE_LIST;

	/**
	 * The number of operations of the '<em>Filtered Features1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTERED_FEATURES1_OPERATION_COUNT = FILTERED_FEATURES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link no.hal.learning.fv.impl.FilteredFeatures2Impl <em>Filtered Features2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.learning.fv.impl.FilteredFeatures2Impl
	 * @see no.hal.learning.fv.impl.FvPackageImpl#getFilteredFeatures2()
	 * @generated
	 */
	int FILTERED_FEATURES2 = 12;

	/**
	 * The feature id for the '<em><b>Contained</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTERED_FEATURES2__CONTAINED = FILTERED_FEATURES__CONTAINED;

	/**
	 * The feature id for the '<em><b>Other</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTERED_FEATURES2__OTHER = FILTERED_FEATURES__OTHER;

	/**
	 * The feature id for the '<em><b>Name Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTERED_FEATURES2__NAME_FILTER = FILTERED_FEATURES__NAME_FILTER;

	/**
	 * The feature id for the '<em><b>Pred</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTERED_FEATURES2__PRED = FILTERED_FEATURES_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Val</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTERED_FEATURES2__VAL = FILTERED_FEATURES_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Swap</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTERED_FEATURES2__SWAP = FILTERED_FEATURES_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Filtered Features2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTERED_FEATURES2_FEATURE_COUNT = FILTERED_FEATURES_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Feature Names</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTERED_FEATURES2___GET_FEATURE_NAMES = FILTERED_FEATURES___GET_FEATURE_NAMES;

	/**
	 * The operation id for the '<em>Get Feature Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTERED_FEATURES2___GET_FEATURE_VALUE__STRING = FILTERED_FEATURES___GET_FEATURE_VALUE__STRING;

	/**
	 * The operation id for the '<em>Has Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTERED_FEATURES2___HAS_FEATURE__STRING = FILTERED_FEATURES___HAS_FEATURE__STRING;

	/**
	 * The operation id for the '<em>To Feature List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTERED_FEATURES2___TO_FEATURE_LIST = FILTERED_FEATURES___TO_FEATURE_LIST;

	/**
	 * The number of operations of the '<em>Filtered Features2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTERED_FEATURES2_OPERATION_COUNT = FILTERED_FEATURES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link no.hal.learning.fv.impl.StringToStringImpl <em>String To String</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.learning.fv.impl.StringToStringImpl
	 * @see no.hal.learning.fv.impl.FvPackageImpl#getStringToString()
	 * @generated
	 */
	int STRING_TO_STRING = 13;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_STRING__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_STRING__VALUE = 1;

	/**
	 * The number of structural features of the '<em>String To String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_STRING_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>String To String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_STRING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link no.hal.learning.fv.impl.ExpressionFeaturesImpl <em>Expression Features</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.learning.fv.impl.ExpressionFeaturesImpl
	 * @see no.hal.learning.fv.impl.FvPackageImpl#getExpressionFeatures()
	 * @generated
	 */
	int EXPRESSION_FEATURES = 14;

	/**
	 * The feature id for the '<em><b>Contained</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_FEATURES__CONTAINED = DERIVED_FEATURES__CONTAINED;

	/**
	 * The feature id for the '<em><b>Features</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_FEATURES__FEATURES = DERIVED_FEATURES_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Other</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_FEATURES__OTHER = DERIVED_FEATURES_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Expression Features</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_FEATURES_FEATURE_COUNT = DERIVED_FEATURES_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Feature Names</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_FEATURES___GET_FEATURE_NAMES = DERIVED_FEATURES___GET_FEATURE_NAMES;

	/**
	 * The operation id for the '<em>Get Feature Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_FEATURES___GET_FEATURE_VALUE__STRING = DERIVED_FEATURES___GET_FEATURE_VALUE__STRING;

	/**
	 * The operation id for the '<em>Has Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_FEATURES___HAS_FEATURE__STRING = DERIVED_FEATURES___HAS_FEATURE__STRING;

	/**
	 * The operation id for the '<em>To Feature List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_FEATURES___TO_FEATURE_LIST = DERIVED_FEATURES___TO_FEATURE_LIST;

	/**
	 * The number of operations of the '<em>Expression Features</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_FEATURES_OPERATION_COUNT = DERIVED_FEATURES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link no.hal.learning.fv.Op1Kind <em>Op1 Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.learning.fv.Op1Kind
	 * @see no.hal.learning.fv.impl.FvPackageImpl#getOp1Kind()
	 * @generated
	 */
	int OP1_KIND = 15;

	/**
	 * The meta object id for the '{@link no.hal.learning.fv.Op2Kind <em>Op2 Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.learning.fv.Op2Kind
	 * @see no.hal.learning.fv.impl.FvPackageImpl#getOp2Kind()
	 * @generated
	 */
	int OP2_KIND = 16;

	/**
	 * The meta object id for the '{@link no.hal.learning.fv.Pred1Kind <em>Pred1 Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.learning.fv.Pred1Kind
	 * @see no.hal.learning.fv.impl.FvPackageImpl#getPred1Kind()
	 * @generated
	 */
	int PRED1_KIND = 17;

	/**
	 * The meta object id for the '{@link no.hal.learning.fv.Pred2Kind <em>Pred2 Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.learning.fv.Pred2Kind
	 * @see no.hal.learning.fv.impl.FvPackageImpl#getPred2Kind()
	 * @generated
	 */
	int PRED2_KIND = 18;

	/**
	 * The meta object id for the '<em>Op1</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.learning.fv.util.Op1
	 * @see no.hal.learning.fv.impl.FvPackageImpl#getOp1()
	 * @generated
	 */
	int OP1 = 19;

	/**
	 * The meta object id for the '<em>Op2</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.learning.fv.util.Op2
	 * @see no.hal.learning.fv.impl.FvPackageImpl#getOp2()
	 * @generated
	 */
	int OP2 = 20;

	/**
	 * The meta object id for the '<em>Pred1</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.learning.fv.util.Pred1
	 * @see no.hal.learning.fv.impl.FvPackageImpl#getPred1()
	 * @generated
	 */
	int PRED1 = 21;

	/**
	 * The meta object id for the '<em>Pred2</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.learning.fv.util.Pred2
	 * @see no.hal.learning.fv.impl.FvPackageImpl#getPred2()
	 * @generated
	 */
	int PRED2 = 22;

	/**
	 * Returns the meta object for class '{@link no.hal.learning.fv.FeatureValued <em>Feature Valued</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Valued</em>'.
	 * @see no.hal.learning.fv.FeatureValued
	 * @generated
	 */
	EClass getFeatureValued();

	/**
	 * Returns the meta object for the '{@link no.hal.learning.fv.FeatureValued#getFeatureNames() <em>Get Feature Names</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Feature Names</em>' operation.
	 * @see no.hal.learning.fv.FeatureValued#getFeatureNames()
	 * @generated
	 */
	EOperation getFeatureValued__GetFeatureNames();

	/**
	 * Returns the meta object for the '{@link no.hal.learning.fv.FeatureValued#getFeatureValue(java.lang.String) <em>Get Feature Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Feature Value</em>' operation.
	 * @see no.hal.learning.fv.FeatureValued#getFeatureValue(java.lang.String)
	 * @generated
	 */
	EOperation getFeatureValued__GetFeatureValue__String();

	/**
	 * Returns the meta object for the '{@link no.hal.learning.fv.FeatureValued#hasFeature(java.lang.String) <em>Has Feature</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Has Feature</em>' operation.
	 * @see no.hal.learning.fv.FeatureValued#hasFeature(java.lang.String)
	 * @generated
	 */
	EOperation getFeatureValued__HasFeature__String();

	/**
	 * Returns the meta object for the '{@link no.hal.learning.fv.FeatureValued#toFeatureList() <em>To Feature List</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>To Feature List</em>' operation.
	 * @see no.hal.learning.fv.FeatureValued#toFeatureList()
	 * @generated
	 */
	EOperation getFeatureValued__ToFeatureList();

	/**
	 * Returns the meta object for class '{@link no.hal.learning.fv.DelegatedFeatures <em>Delegated Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Delegated Features</em>'.
	 * @see no.hal.learning.fv.DelegatedFeatures
	 * @generated
	 */
	EClass getDelegatedFeatures();

	/**
	 * Returns the meta object for the containment reference '{@link no.hal.learning.fv.DelegatedFeatures#getFeatures <em>Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Features</em>'.
	 * @see no.hal.learning.fv.DelegatedFeatures#getFeatures()
	 * @see #getDelegatedFeatures()
	 * @generated
	 */
	EReference getDelegatedFeatures_Features();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>String To Double</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String To Double</em>'.
	 * @see java.util.Map.Entry
	 * @model keyDataType="org.eclipse.emf.ecore.EString"
	 *        valueDataType="org.eclipse.emf.ecore.EDoubleObject"
	 * @generated
	 */
	EClass getStringToDouble();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getStringToDouble()
	 * @generated
	 */
	EAttribute getStringToDouble_Key();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getStringToDouble()
	 * @generated
	 */
	EAttribute getStringToDouble_Value();

	/**
	 * Returns the meta object for class '{@link no.hal.learning.fv.FeatureList <em>Feature List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature List</em>'.
	 * @see no.hal.learning.fv.FeatureList
	 * @generated
	 */
	EClass getFeatureList();

	/**
	 * Returns the meta object for the map '{@link no.hal.learning.fv.FeatureList#getFeatures <em>Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Features</em>'.
	 * @see no.hal.learning.fv.FeatureList#getFeatures()
	 * @see #getFeatureList()
	 * @generated
	 */
	EReference getFeatureList_Features();

	/**
	 * Returns the meta object for the '{@link no.hal.learning.fv.FeatureList#set(no.hal.learning.fv.FeatureValued, boolean) <em>Set</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set</em>' operation.
	 * @see no.hal.learning.fv.FeatureList#set(no.hal.learning.fv.FeatureValued, boolean)
	 * @generated
	 */
	EOperation getFeatureList__Set__FeatureValued_boolean();

	/**
	 * Returns the meta object for the '{@link no.hal.learning.fv.FeatureList#apply(no.hal.learning.fv.util.Op1) <em>Apply</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Apply</em>' operation.
	 * @see no.hal.learning.fv.FeatureList#apply(no.hal.learning.fv.util.Op1)
	 * @generated
	 */
	EOperation getFeatureList__Apply__Op1();

	/**
	 * Returns the meta object for the '{@link no.hal.learning.fv.FeatureList#apply(no.hal.learning.fv.util.Op2, no.hal.learning.fv.FeatureValued, boolean) <em>Apply</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Apply</em>' operation.
	 * @see no.hal.learning.fv.FeatureList#apply(no.hal.learning.fv.util.Op2, no.hal.learning.fv.FeatureValued, boolean)
	 * @generated
	 */
	EOperation getFeatureList__Apply__Op2_FeatureValued_boolean();

	/**
	 * Returns the meta object for the '{@link no.hal.learning.fv.FeatureList#apply(no.hal.learning.fv.util.Op2, double, boolean) <em>Apply</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Apply</em>' operation.
	 * @see no.hal.learning.fv.FeatureList#apply(no.hal.learning.fv.util.Op2, double, boolean)
	 * @generated
	 */
	EOperation getFeatureList__Apply__Op2_double_boolean();

	/**
	 * Returns the meta object for the '{@link no.hal.learning.fv.FeatureList#count(no.hal.learning.fv.util.Pred1) <em>Count</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Count</em>' operation.
	 * @see no.hal.learning.fv.FeatureList#count(no.hal.learning.fv.util.Pred1)
	 * @generated
	 */
	EOperation getFeatureList__Count__Pred1();

	/**
	 * Returns the meta object for the '{@link no.hal.learning.fv.FeatureList#count(no.hal.learning.fv.util.Pred2, no.hal.learning.fv.FeatureValued, boolean) <em>Count</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Count</em>' operation.
	 * @see no.hal.learning.fv.FeatureList#count(no.hal.learning.fv.util.Pred2, no.hal.learning.fv.FeatureValued, boolean)
	 * @generated
	 */
	EOperation getFeatureList__Count__Pred2_FeatureValued_boolean();

	/**
	 * Returns the meta object for the '{@link no.hal.learning.fv.FeatureList#count(no.hal.learning.fv.FeatureValued) <em>Count</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Count</em>' operation.
	 * @see no.hal.learning.fv.FeatureList#count(no.hal.learning.fv.FeatureValued)
	 * @generated
	 */
	EOperation getFeatureList__Count__FeatureValued();

	/**
	 * Returns the meta object for the '{@link no.hal.learning.fv.FeatureList#zero(double) <em>Zero</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Zero</em>' operation.
	 * @see no.hal.learning.fv.FeatureList#zero(double)
	 * @generated
	 */
	EOperation getFeatureList__Zero__double();

	/**
	 * Returns the meta object for class '{@link no.hal.learning.fv.ConstantFeatureList <em>Constant Feature List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constant Feature List</em>'.
	 * @see no.hal.learning.fv.ConstantFeatureList
	 * @generated
	 */
	EClass getConstantFeatureList();

	/**
	 * Returns the meta object for the attribute list '{@link no.hal.learning.fv.ConstantFeatureList#getFeatureNames <em>Feature Names</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Feature Names</em>'.
	 * @see no.hal.learning.fv.ConstantFeatureList#getFeatureNames()
	 * @see #getConstantFeatureList()
	 * @generated
	 */
	EAttribute getConstantFeatureList_FeatureNames();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.learning.fv.ConstantFeatureList#getVal <em>Val</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Val</em>'.
	 * @see no.hal.learning.fv.ConstantFeatureList#getVal()
	 * @see #getConstantFeatureList()
	 * @generated
	 */
	EAttribute getConstantFeatureList_Val();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.learning.fv.ConstantFeatureList#getDefVal <em>Def Val</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Def Val</em>'.
	 * @see no.hal.learning.fv.ConstantFeatureList#getDefVal()
	 * @see #getConstantFeatureList()
	 * @generated
	 */
	EAttribute getConstantFeatureList_DefVal();

	/**
	 * Returns the meta object for class '{@link no.hal.learning.fv.EFeatureObject <em>EFeature Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EFeature Object</em>'.
	 * @see no.hal.learning.fv.EFeatureObject
	 * @generated
	 */
	EClass getEFeatureObject();

	/**
	 * Returns the meta object for class '{@link no.hal.learning.fv.DerivedFeatures <em>Derived Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Derived Features</em>'.
	 * @see no.hal.learning.fv.DerivedFeatures
	 * @generated
	 */
	EClass getDerivedFeatures();

	/**
	 * Returns the meta object for the containment reference list '{@link no.hal.learning.fv.DerivedFeatures#getContained <em>Contained</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contained</em>'.
	 * @see no.hal.learning.fv.DerivedFeatures#getContained()
	 * @see #getDerivedFeatures()
	 * @generated
	 */
	EReference getDerivedFeatures_Contained();

	/**
	 * Returns the meta object for class '{@link no.hal.learning.fv.OpDerivedFeatures <em>Op Derived Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Op Derived Features</em>'.
	 * @see no.hal.learning.fv.OpDerivedFeatures
	 * @generated
	 */
	EClass getOpDerivedFeatures();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.learning.fv.OpDerivedFeatures#getOp <em>Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Op</em>'.
	 * @see no.hal.learning.fv.OpDerivedFeatures#getOp()
	 * @see #getOpDerivedFeatures()
	 * @generated
	 */
	EAttribute getOpDerivedFeatures_Op();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.learning.fv.OpDerivedFeatures#getVal <em>Val</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Val</em>'.
	 * @see no.hal.learning.fv.OpDerivedFeatures#getVal()
	 * @see #getOpDerivedFeatures()
	 * @generated
	 */
	EAttribute getOpDerivedFeatures_Val();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.learning.fv.OpDerivedFeatures#isSwap <em>Swap</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Swap</em>'.
	 * @see no.hal.learning.fv.OpDerivedFeatures#isSwap()
	 * @see #getOpDerivedFeatures()
	 * @generated
	 */
	EAttribute getOpDerivedFeatures_Swap();

	/**
	 * Returns the meta object for class '{@link no.hal.learning.fv.DerivedFeatures1 <em>Derived Features1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Derived Features1</em>'.
	 * @see no.hal.learning.fv.DerivedFeatures1
	 * @generated
	 */
	EClass getDerivedFeatures1();

	/**
	 * Returns the meta object for the reference '{@link no.hal.learning.fv.DerivedFeatures1#getOther <em>Other</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Other</em>'.
	 * @see no.hal.learning.fv.DerivedFeatures1#getOther()
	 * @see #getDerivedFeatures1()
	 * @generated
	 */
	EReference getDerivedFeatures1_Other();

	/**
	 * Returns the meta object for class '{@link no.hal.learning.fv.DerivedFeaturesN <em>Derived Features N</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Derived Features N</em>'.
	 * @see no.hal.learning.fv.DerivedFeaturesN
	 * @generated
	 */
	EClass getDerivedFeaturesN();

	/**
	 * Returns the meta object for the reference list '{@link no.hal.learning.fv.DerivedFeaturesN#getOthers <em>Others</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Others</em>'.
	 * @see no.hal.learning.fv.DerivedFeaturesN#getOthers()
	 * @see #getDerivedFeaturesN()
	 * @generated
	 */
	EReference getDerivedFeaturesN_Others();

	/**
	 * Returns the meta object for class '{@link no.hal.learning.fv.FilteredFeatures <em>Filtered Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Filtered Features</em>'.
	 * @see no.hal.learning.fv.FilteredFeatures
	 * @generated
	 */
	EClass getFilteredFeatures();

	/**
	 * Returns the meta object for the reference '{@link no.hal.learning.fv.FilteredFeatures#getOther <em>Other</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Other</em>'.
	 * @see no.hal.learning.fv.FilteredFeatures#getOther()
	 * @see #getFilteredFeatures()
	 * @generated
	 */
	EReference getFilteredFeatures_Other();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.learning.fv.FilteredFeatures#getNameFilter <em>Name Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name Filter</em>'.
	 * @see no.hal.learning.fv.FilteredFeatures#getNameFilter()
	 * @see #getFilteredFeatures()
	 * @generated
	 */
	EAttribute getFilteredFeatures_NameFilter();

	/**
	 * Returns the meta object for class '{@link no.hal.learning.fv.FilteredFeatures1 <em>Filtered Features1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Filtered Features1</em>'.
	 * @see no.hal.learning.fv.FilteredFeatures1
	 * @generated
	 */
	EClass getFilteredFeatures1();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.learning.fv.FilteredFeatures1#getPred <em>Pred</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pred</em>'.
	 * @see no.hal.learning.fv.FilteredFeatures1#getPred()
	 * @see #getFilteredFeatures1()
	 * @generated
	 */
	EAttribute getFilteredFeatures1_Pred();

	/**
	 * Returns the meta object for class '{@link no.hal.learning.fv.FilteredFeatures2 <em>Filtered Features2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Filtered Features2</em>'.
	 * @see no.hal.learning.fv.FilteredFeatures2
	 * @generated
	 */
	EClass getFilteredFeatures2();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.learning.fv.FilteredFeatures2#getPred <em>Pred</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pred</em>'.
	 * @see no.hal.learning.fv.FilteredFeatures2#getPred()
	 * @see #getFilteredFeatures2()
	 * @generated
	 */
	EAttribute getFilteredFeatures2_Pred();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.learning.fv.FilteredFeatures2#getVal <em>Val</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Val</em>'.
	 * @see no.hal.learning.fv.FilteredFeatures2#getVal()
	 * @see #getFilteredFeatures2()
	 * @generated
	 */
	EAttribute getFilteredFeatures2_Val();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.learning.fv.FilteredFeatures2#isSwap <em>Swap</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Swap</em>'.
	 * @see no.hal.learning.fv.FilteredFeatures2#isSwap()
	 * @see #getFilteredFeatures2()
	 * @generated
	 */
	EAttribute getFilteredFeatures2_Swap();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>String To String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String To String</em>'.
	 * @see java.util.Map.Entry
	 * @model keyDataType="org.eclipse.emf.ecore.EString"
	 *        valueDataType="org.eclipse.emf.ecore.EString"
	 * @generated
	 */
	EClass getStringToString();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getStringToString()
	 * @generated
	 */
	EAttribute getStringToString_Key();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getStringToString()
	 * @generated
	 */
	EAttribute getStringToString_Value();

	/**
	 * Returns the meta object for class '{@link no.hal.learning.fv.ExpressionFeatures <em>Expression Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression Features</em>'.
	 * @see no.hal.learning.fv.ExpressionFeatures
	 * @generated
	 */
	EClass getExpressionFeatures();

	/**
	 * Returns the meta object for the map '{@link no.hal.learning.fv.ExpressionFeatures#getFeatures <em>Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Features</em>'.
	 * @see no.hal.learning.fv.ExpressionFeatures#getFeatures()
	 * @see #getExpressionFeatures()
	 * @generated
	 */
	EReference getExpressionFeatures_Features();

	/**
	 * Returns the meta object for the reference '{@link no.hal.learning.fv.ExpressionFeatures#getOther <em>Other</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Other</em>'.
	 * @see no.hal.learning.fv.ExpressionFeatures#getOther()
	 * @see #getExpressionFeatures()
	 * @generated
	 */
	EReference getExpressionFeatures_Other();

	/**
	 * Returns the meta object for enum '{@link no.hal.learning.fv.Op1Kind <em>Op1 Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Op1 Kind</em>'.
	 * @see no.hal.learning.fv.Op1Kind
	 * @generated
	 */
	EEnum getOp1Kind();

	/**
	 * Returns the meta object for enum '{@link no.hal.learning.fv.Op2Kind <em>Op2 Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Op2 Kind</em>'.
	 * @see no.hal.learning.fv.Op2Kind
	 * @generated
	 */
	EEnum getOp2Kind();

	/**
	 * Returns the meta object for enum '{@link no.hal.learning.fv.Pred1Kind <em>Pred1 Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Pred1 Kind</em>'.
	 * @see no.hal.learning.fv.Pred1Kind
	 * @generated
	 */
	EEnum getPred1Kind();

	/**
	 * Returns the meta object for enum '{@link no.hal.learning.fv.Pred2Kind <em>Pred2 Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Pred2 Kind</em>'.
	 * @see no.hal.learning.fv.Pred2Kind
	 * @generated
	 */
	EEnum getPred2Kind();

	/**
	 * Returns the meta object for data type '{@link no.hal.learning.fv.util.Op1 <em>Op1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Op1</em>'.
	 * @see no.hal.learning.fv.util.Op1
	 * @model instanceClass="no.hal.learning.fv.util.Op1"
	 * @generated
	 */
	EDataType getOp1();

	/**
	 * Returns the meta object for data type '{@link no.hal.learning.fv.util.Op2 <em>Op2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Op2</em>'.
	 * @see no.hal.learning.fv.util.Op2
	 * @model instanceClass="no.hal.learning.fv.util.Op2"
	 * @generated
	 */
	EDataType getOp2();

	/**
	 * Returns the meta object for data type '{@link no.hal.learning.fv.util.Pred1 <em>Pred1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Pred1</em>'.
	 * @see no.hal.learning.fv.util.Pred1
	 * @model instanceClass="no.hal.learning.fv.util.Pred1"
	 * @generated
	 */
	EDataType getPred1();

	/**
	 * Returns the meta object for data type '{@link no.hal.learning.fv.util.Pred2 <em>Pred2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Pred2</em>'.
	 * @see no.hal.learning.fv.util.Pred2
	 * @model instanceClass="no.hal.learning.fv.util.Pred2"
	 * @generated
	 */
	EDataType getPred2();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	FvFactory getFvFactory();

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
		 * The meta object literal for the '{@link no.hal.learning.fv.FeatureValued <em>Feature Valued</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.learning.fv.FeatureValued
		 * @see no.hal.learning.fv.impl.FvPackageImpl#getFeatureValued()
		 * @generated
		 */
		EClass FEATURE_VALUED = eINSTANCE.getFeatureValued();

		/**
		 * The meta object literal for the '<em><b>Get Feature Names</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FEATURE_VALUED___GET_FEATURE_NAMES = eINSTANCE.getFeatureValued__GetFeatureNames();

		/**
		 * The meta object literal for the '<em><b>Get Feature Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FEATURE_VALUED___GET_FEATURE_VALUE__STRING = eINSTANCE.getFeatureValued__GetFeatureValue__String();

		/**
		 * The meta object literal for the '<em><b>Has Feature</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FEATURE_VALUED___HAS_FEATURE__STRING = eINSTANCE.getFeatureValued__HasFeature__String();

		/**
		 * The meta object literal for the '<em><b>To Feature List</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FEATURE_VALUED___TO_FEATURE_LIST = eINSTANCE.getFeatureValued__ToFeatureList();

		/**
		 * The meta object literal for the '{@link no.hal.learning.fv.impl.DelegatedFeaturesImpl <em>Delegated Features</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.learning.fv.impl.DelegatedFeaturesImpl
		 * @see no.hal.learning.fv.impl.FvPackageImpl#getDelegatedFeatures()
		 * @generated
		 */
		EClass DELEGATED_FEATURES = eINSTANCE.getDelegatedFeatures();

		/**
		 * The meta object literal for the '<em><b>Features</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DELEGATED_FEATURES__FEATURES = eINSTANCE.getDelegatedFeatures_Features();

		/**
		 * The meta object literal for the '{@link no.hal.learning.fv.impl.StringToDoubleImpl <em>String To Double</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.learning.fv.impl.StringToDoubleImpl
		 * @see no.hal.learning.fv.impl.FvPackageImpl#getStringToDouble()
		 * @generated
		 */
		EClass STRING_TO_DOUBLE = eINSTANCE.getStringToDouble();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_TO_DOUBLE__KEY = eINSTANCE.getStringToDouble_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_TO_DOUBLE__VALUE = eINSTANCE.getStringToDouble_Value();

		/**
		 * The meta object literal for the '{@link no.hal.learning.fv.impl.FeatureListImpl <em>Feature List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.learning.fv.impl.FeatureListImpl
		 * @see no.hal.learning.fv.impl.FvPackageImpl#getFeatureList()
		 * @generated
		 */
		EClass FEATURE_LIST = eINSTANCE.getFeatureList();

		/**
		 * The meta object literal for the '<em><b>Features</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_LIST__FEATURES = eINSTANCE.getFeatureList_Features();

		/**
		 * The meta object literal for the '<em><b>Set</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FEATURE_LIST___SET__FEATUREVALUED_BOOLEAN = eINSTANCE.getFeatureList__Set__FeatureValued_boolean();

		/**
		 * The meta object literal for the '<em><b>Apply</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FEATURE_LIST___APPLY__OP1 = eINSTANCE.getFeatureList__Apply__Op1();

		/**
		 * The meta object literal for the '<em><b>Apply</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FEATURE_LIST___APPLY__OP2_FEATUREVALUED_BOOLEAN = eINSTANCE.getFeatureList__Apply__Op2_FeatureValued_boolean();

		/**
		 * The meta object literal for the '<em><b>Apply</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FEATURE_LIST___APPLY__OP2_DOUBLE_BOOLEAN = eINSTANCE.getFeatureList__Apply__Op2_double_boolean();

		/**
		 * The meta object literal for the '<em><b>Count</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FEATURE_LIST___COUNT__PRED1 = eINSTANCE.getFeatureList__Count__Pred1();

		/**
		 * The meta object literal for the '<em><b>Count</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FEATURE_LIST___COUNT__PRED2_FEATUREVALUED_BOOLEAN = eINSTANCE.getFeatureList__Count__Pred2_FeatureValued_boolean();

		/**
		 * The meta object literal for the '<em><b>Count</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FEATURE_LIST___COUNT__FEATUREVALUED = eINSTANCE.getFeatureList__Count__FeatureValued();

		/**
		 * The meta object literal for the '<em><b>Zero</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FEATURE_LIST___ZERO__DOUBLE = eINSTANCE.getFeatureList__Zero__double();

		/**
		 * The meta object literal for the '{@link no.hal.learning.fv.impl.ConstantFeatureListImpl <em>Constant Feature List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.learning.fv.impl.ConstantFeatureListImpl
		 * @see no.hal.learning.fv.impl.FvPackageImpl#getConstantFeatureList()
		 * @generated
		 */
		EClass CONSTANT_FEATURE_LIST = eINSTANCE.getConstantFeatureList();

		/**
		 * The meta object literal for the '<em><b>Feature Names</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTANT_FEATURE_LIST__FEATURE_NAMES = eINSTANCE.getConstantFeatureList_FeatureNames();

		/**
		 * The meta object literal for the '<em><b>Val</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTANT_FEATURE_LIST__VAL = eINSTANCE.getConstantFeatureList_Val();

		/**
		 * The meta object literal for the '<em><b>Def Val</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTANT_FEATURE_LIST__DEF_VAL = eINSTANCE.getConstantFeatureList_DefVal();

		/**
		 * The meta object literal for the '{@link no.hal.learning.fv.impl.EFeatureObjectImpl <em>EFeature Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.learning.fv.impl.EFeatureObjectImpl
		 * @see no.hal.learning.fv.impl.FvPackageImpl#getEFeatureObject()
		 * @generated
		 */
		EClass EFEATURE_OBJECT = eINSTANCE.getEFeatureObject();

		/**
		 * The meta object literal for the '{@link no.hal.learning.fv.impl.DerivedFeaturesImpl <em>Derived Features</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.learning.fv.impl.DerivedFeaturesImpl
		 * @see no.hal.learning.fv.impl.FvPackageImpl#getDerivedFeatures()
		 * @generated
		 */
		EClass DERIVED_FEATURES = eINSTANCE.getDerivedFeatures();

		/**
		 * The meta object literal for the '<em><b>Contained</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DERIVED_FEATURES__CONTAINED = eINSTANCE.getDerivedFeatures_Contained();

		/**
		 * The meta object literal for the '{@link no.hal.learning.fv.impl.OpDerivedFeaturesImpl <em>Op Derived Features</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.learning.fv.impl.OpDerivedFeaturesImpl
		 * @see no.hal.learning.fv.impl.FvPackageImpl#getOpDerivedFeatures()
		 * @generated
		 */
		EClass OP_DERIVED_FEATURES = eINSTANCE.getOpDerivedFeatures();

		/**
		 * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OP_DERIVED_FEATURES__OP = eINSTANCE.getOpDerivedFeatures_Op();

		/**
		 * The meta object literal for the '<em><b>Val</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OP_DERIVED_FEATURES__VAL = eINSTANCE.getOpDerivedFeatures_Val();

		/**
		 * The meta object literal for the '<em><b>Swap</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OP_DERIVED_FEATURES__SWAP = eINSTANCE.getOpDerivedFeatures_Swap();

		/**
		 * The meta object literal for the '{@link no.hal.learning.fv.impl.DerivedFeatures1Impl <em>Derived Features1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.learning.fv.impl.DerivedFeatures1Impl
		 * @see no.hal.learning.fv.impl.FvPackageImpl#getDerivedFeatures1()
		 * @generated
		 */
		EClass DERIVED_FEATURES1 = eINSTANCE.getDerivedFeatures1();

		/**
		 * The meta object literal for the '<em><b>Other</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DERIVED_FEATURES1__OTHER = eINSTANCE.getDerivedFeatures1_Other();

		/**
		 * The meta object literal for the '{@link no.hal.learning.fv.impl.DerivedFeaturesNImpl <em>Derived Features N</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.learning.fv.impl.DerivedFeaturesNImpl
		 * @see no.hal.learning.fv.impl.FvPackageImpl#getDerivedFeaturesN()
		 * @generated
		 */
		EClass DERIVED_FEATURES_N = eINSTANCE.getDerivedFeaturesN();

		/**
		 * The meta object literal for the '<em><b>Others</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DERIVED_FEATURES_N__OTHERS = eINSTANCE.getDerivedFeaturesN_Others();

		/**
		 * The meta object literal for the '{@link no.hal.learning.fv.impl.FilteredFeaturesImpl <em>Filtered Features</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.learning.fv.impl.FilteredFeaturesImpl
		 * @see no.hal.learning.fv.impl.FvPackageImpl#getFilteredFeatures()
		 * @generated
		 */
		EClass FILTERED_FEATURES = eINSTANCE.getFilteredFeatures();

		/**
		 * The meta object literal for the '<em><b>Other</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILTERED_FEATURES__OTHER = eINSTANCE.getFilteredFeatures_Other();

		/**
		 * The meta object literal for the '<em><b>Name Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILTERED_FEATURES__NAME_FILTER = eINSTANCE.getFilteredFeatures_NameFilter();

		/**
		 * The meta object literal for the '{@link no.hal.learning.fv.impl.FilteredFeatures1Impl <em>Filtered Features1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.learning.fv.impl.FilteredFeatures1Impl
		 * @see no.hal.learning.fv.impl.FvPackageImpl#getFilteredFeatures1()
		 * @generated
		 */
		EClass FILTERED_FEATURES1 = eINSTANCE.getFilteredFeatures1();

		/**
		 * The meta object literal for the '<em><b>Pred</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILTERED_FEATURES1__PRED = eINSTANCE.getFilteredFeatures1_Pred();

		/**
		 * The meta object literal for the '{@link no.hal.learning.fv.impl.FilteredFeatures2Impl <em>Filtered Features2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.learning.fv.impl.FilteredFeatures2Impl
		 * @see no.hal.learning.fv.impl.FvPackageImpl#getFilteredFeatures2()
		 * @generated
		 */
		EClass FILTERED_FEATURES2 = eINSTANCE.getFilteredFeatures2();

		/**
		 * The meta object literal for the '<em><b>Pred</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILTERED_FEATURES2__PRED = eINSTANCE.getFilteredFeatures2_Pred();

		/**
		 * The meta object literal for the '<em><b>Val</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILTERED_FEATURES2__VAL = eINSTANCE.getFilteredFeatures2_Val();

		/**
		 * The meta object literal for the '<em><b>Swap</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILTERED_FEATURES2__SWAP = eINSTANCE.getFilteredFeatures2_Swap();

		/**
		 * The meta object literal for the '{@link no.hal.learning.fv.impl.StringToStringImpl <em>String To String</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.learning.fv.impl.StringToStringImpl
		 * @see no.hal.learning.fv.impl.FvPackageImpl#getStringToString()
		 * @generated
		 */
		EClass STRING_TO_STRING = eINSTANCE.getStringToString();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_TO_STRING__KEY = eINSTANCE.getStringToString_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_TO_STRING__VALUE = eINSTANCE.getStringToString_Value();

		/**
		 * The meta object literal for the '{@link no.hal.learning.fv.impl.ExpressionFeaturesImpl <em>Expression Features</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.learning.fv.impl.ExpressionFeaturesImpl
		 * @see no.hal.learning.fv.impl.FvPackageImpl#getExpressionFeatures()
		 * @generated
		 */
		EClass EXPRESSION_FEATURES = eINSTANCE.getExpressionFeatures();

		/**
		 * The meta object literal for the '<em><b>Features</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION_FEATURES__FEATURES = eINSTANCE.getExpressionFeatures_Features();

		/**
		 * The meta object literal for the '<em><b>Other</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION_FEATURES__OTHER = eINSTANCE.getExpressionFeatures_Other();

		/**
		 * The meta object literal for the '{@link no.hal.learning.fv.Op1Kind <em>Op1 Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.learning.fv.Op1Kind
		 * @see no.hal.learning.fv.impl.FvPackageImpl#getOp1Kind()
		 * @generated
		 */
		EEnum OP1_KIND = eINSTANCE.getOp1Kind();

		/**
		 * The meta object literal for the '{@link no.hal.learning.fv.Op2Kind <em>Op2 Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.learning.fv.Op2Kind
		 * @see no.hal.learning.fv.impl.FvPackageImpl#getOp2Kind()
		 * @generated
		 */
		EEnum OP2_KIND = eINSTANCE.getOp2Kind();

		/**
		 * The meta object literal for the '{@link no.hal.learning.fv.Pred1Kind <em>Pred1 Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.learning.fv.Pred1Kind
		 * @see no.hal.learning.fv.impl.FvPackageImpl#getPred1Kind()
		 * @generated
		 */
		EEnum PRED1_KIND = eINSTANCE.getPred1Kind();

		/**
		 * The meta object literal for the '{@link no.hal.learning.fv.Pred2Kind <em>Pred2 Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.learning.fv.Pred2Kind
		 * @see no.hal.learning.fv.impl.FvPackageImpl#getPred2Kind()
		 * @generated
		 */
		EEnum PRED2_KIND = eINSTANCE.getPred2Kind();

		/**
		 * The meta object literal for the '<em>Op1</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.learning.fv.util.Op1
		 * @see no.hal.learning.fv.impl.FvPackageImpl#getOp1()
		 * @generated
		 */
		EDataType OP1 = eINSTANCE.getOp1();

		/**
		 * The meta object literal for the '<em>Op2</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.learning.fv.util.Op2
		 * @see no.hal.learning.fv.impl.FvPackageImpl#getOp2()
		 * @generated
		 */
		EDataType OP2 = eINSTANCE.getOp2();

		/**
		 * The meta object literal for the '<em>Pred1</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.learning.fv.util.Pred1
		 * @see no.hal.learning.fv.impl.FvPackageImpl#getPred1()
		 * @generated
		 */
		EDataType PRED1 = eINSTANCE.getPred1();

		/**
		 * The meta object literal for the '<em>Pred2</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.learning.fv.util.Pred2
		 * @see no.hal.learning.fv.impl.FvPackageImpl#getPred2()
		 * @generated
		 */
		EDataType PRED2 = eINSTANCE.getPred2();

	}

} //FvPackage
