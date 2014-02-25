/**
 */
package no.hal.jex.jextest.jexTest;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.xtext.xbase.XbasePackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see no.hal.jex.jextest.jexTest.JexTestFactory
 * @model kind="package"
 * @generated
 */
public interface JexTestPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "jexTest";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.hal.no/jex/jextest/JexTest";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "jexTest";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  JexTestPackage eINSTANCE = no.hal.jex.jextest.jexTest.impl.JexTestPackageImpl.init();

  /**
   * The meta object id for the '{@link no.hal.jex.jextest.jexTest.impl.JexTestCaseImpl <em>Case</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see no.hal.jex.jextest.jexTest.impl.JexTestCaseImpl
   * @see no.hal.jex.jextest.jexTest.impl.JexTestPackageImpl#getJexTestCase()
   * @generated
   */
  int JEX_TEST_CASE = 0;

  /**
   * The feature id for the '<em><b>Tested Class</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JEX_TEST_CASE__TESTED_CLASS = 0;

  /**
   * The feature id for the '<em><b>Test Class Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JEX_TEST_CASE__TEST_CLASS_NAME = 1;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JEX_TEST_CASE__DESCRIPTION = 2;

  /**
   * The feature id for the '<em><b>Url</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JEX_TEST_CASE__URL = 3;

  /**
   * The feature id for the '<em><b>Import Section</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JEX_TEST_CASE__IMPORT_SECTION = 4;

  /**
   * The feature id for the '<em><b>Instances</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JEX_TEST_CASE__INSTANCES = 5;

  /**
   * The feature id for the '<em><b>State Functions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JEX_TEST_CASE__STATE_FUNCTIONS = 6;

  /**
   * The feature id for the '<em><b>Test Sequences</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JEX_TEST_CASE__TEST_SEQUENCES = 7;

  /**
   * The feature id for the '<em><b>Methods</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JEX_TEST_CASE__METHODS = 8;

  /**
   * The number of structural features of the '<em>Case</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JEX_TEST_CASE_FEATURE_COUNT = 9;

  /**
   * The meta object id for the '{@link no.hal.jex.jextest.jexTest.impl.InstanceImpl <em>Instance</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see no.hal.jex.jextest.jexTest.impl.InstanceImpl
   * @see no.hal.jex.jextest.jexTest.impl.JexTestPackageImpl#getInstance()
   * @generated
   */
  int INSTANCE = 1;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTANCE__TYPE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTANCE__NAME = 1;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTANCE__EXPR = 2;

  /**
   * The number of structural features of the '<em>Instance</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTANCE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link no.hal.jex.jextest.jexTest.impl.StateTestContextImpl <em>State Test Context</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see no.hal.jex.jextest.jexTest.impl.StateTestContextImpl
   * @see no.hal.jex.jextest.jexTest.impl.JexTestPackageImpl#getStateTestContext()
   * @generated
   */
  int STATE_TEST_CONTEXT = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_TEST_CONTEXT__NAME = 0;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_TEST_CONTEXT__DESCRIPTION = 1;

  /**
   * The number of structural features of the '<em>State Test Context</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_TEST_CONTEXT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link no.hal.jex.jextest.jexTest.impl.PropertiesTestOwnerImpl <em>Properties Test Owner</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see no.hal.jex.jextest.jexTest.impl.PropertiesTestOwnerImpl
   * @see no.hal.jex.jextest.jexTest.impl.JexTestPackageImpl#getPropertiesTestOwner()
   * @generated
   */
  int PROPERTIES_TEST_OWNER = 3;

  /**
   * The feature id for the '<em><b>Test</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTIES_TEST_OWNER__TEST = 0;

  /**
   * The number of structural features of the '<em>Properties Test Owner</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTIES_TEST_OWNER_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link no.hal.jex.jextest.jexTest.impl.StateFunctionImpl <em>State Function</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see no.hal.jex.jextest.jexTest.impl.StateFunctionImpl
   * @see no.hal.jex.jextest.jexTest.impl.JexTestPackageImpl#getStateFunction()
   * @generated
   */
  int STATE_FUNCTION = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_FUNCTION__NAME = STATE_TEST_CONTEXT__NAME;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_FUNCTION__DESCRIPTION = STATE_TEST_CONTEXT__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Test</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_FUNCTION__TEST = STATE_TEST_CONTEXT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_FUNCTION__TYPE = STATE_TEST_CONTEXT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_FUNCTION__PARAMETERS = STATE_TEST_CONTEXT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>State Function</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_FUNCTION_FEATURE_COUNT = STATE_TEST_CONTEXT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link no.hal.jex.jextest.jexTest.impl.JexTestSequenceImpl <em>Sequence</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see no.hal.jex.jextest.jexTest.impl.JexTestSequenceImpl
   * @see no.hal.jex.jextest.jexTest.impl.JexTestPackageImpl#getJexTestSequence()
   * @generated
   */
  int JEX_TEST_SEQUENCE = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JEX_TEST_SEQUENCE__NAME = STATE_TEST_CONTEXT__NAME;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JEX_TEST_SEQUENCE__DESCRIPTION = STATE_TEST_CONTEXT__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Instances</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JEX_TEST_SEQUENCE__INSTANCES = STATE_TEST_CONTEXT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Transitions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JEX_TEST_SEQUENCE__TRANSITIONS = STATE_TEST_CONTEXT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Sequence</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JEX_TEST_SEQUENCE_FEATURE_COUNT = STATE_TEST_CONTEXT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link no.hal.jex.jextest.jexTest.impl.StateImpl <em>State</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see no.hal.jex.jextest.jexTest.impl.StateImpl
   * @see no.hal.jex.jextest.jexTest.impl.JexTestPackageImpl#getState()
   * @generated
   */
  int STATE = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE__NAME = 0;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE__DESCRIPTION = 1;

  /**
   * The feature id for the '<em><b>Object Tests</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE__OBJECT_TESTS = 2;

  /**
   * The number of structural features of the '<em>State</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link no.hal.jex.jextest.jexTest.impl.ObjectTestImpl <em>Object Test</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see no.hal.jex.jextest.jexTest.impl.ObjectTestImpl
   * @see no.hal.jex.jextest.jexTest.impl.JexTestPackageImpl#getObjectTest()
   * @generated
   */
  int OBJECT_TEST = 7;

  /**
   * The feature id for the '<em><b>Test</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_TEST__TEST = PROPERTIES_TEST_OWNER__TEST;

  /**
   * The feature id for the '<em><b>Instance</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_TEST__INSTANCE = PROPERTIES_TEST_OWNER_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Object Test</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_TEST_FEATURE_COUNT = PROPERTIES_TEST_OWNER_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link no.hal.jex.jextest.jexTest.impl.TransitionImpl <em>Transition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see no.hal.jex.jextest.jexTest.impl.TransitionImpl
   * @see no.hal.jex.jextest.jexTest.impl.JexTestPackageImpl#getTransition()
   * @generated
   */
  int TRANSITION = 8;

  /**
   * The feature id for the '<em><b>Source</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION__SOURCE = 0;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION__DESCRIPTION = 1;

  /**
   * The feature id for the '<em><b>Actions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION__ACTIONS = 2;

  /**
   * The feature id for the '<em><b>Effect</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION__EFFECT = 3;

  /**
   * The number of structural features of the '<em>Transition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link no.hal.jex.jextest.jexTest.impl.TransitionSourceImpl <em>Transition Source</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see no.hal.jex.jextest.jexTest.impl.TransitionSourceImpl
   * @see no.hal.jex.jextest.jexTest.impl.JexTestPackageImpl#getTransitionSource()
   * @generated
   */
  int TRANSITION_SOURCE = 9;

  /**
   * The feature id for the '<em><b>State</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION_SOURCE__STATE = 0;

  /**
   * The feature id for the '<em><b>State Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION_SOURCE__STATE_REF = 1;

  /**
   * The number of structural features of the '<em>Transition Source</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION_SOURCE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link no.hal.jex.jextest.jexTest.impl.TransitionActionImpl <em>Transition Action</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see no.hal.jex.jextest.jexTest.impl.TransitionActionImpl
   * @see no.hal.jex.jextest.jexTest.impl.JexTestPackageImpl#getTransitionAction()
   * @generated
   */
  int TRANSITION_ACTION = 10;

  /**
   * The number of structural features of the '<em>Transition Action</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION_ACTION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link no.hal.jex.jextest.jexTest.impl.TransitionExpressionActionImpl <em>Transition Expression Action</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see no.hal.jex.jextest.jexTest.impl.TransitionExpressionActionImpl
   * @see no.hal.jex.jextest.jexTest.impl.JexTestPackageImpl#getTransitionExpressionAction()
   * @generated
   */
  int TRANSITION_EXPRESSION_ACTION = 11;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION_EXPRESSION_ACTION__EXPR = TRANSITION_ACTION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Times</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION_EXPRESSION_ACTION__TIMES = TRANSITION_ACTION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Transition Expression Action</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION_EXPRESSION_ACTION_FEATURE_COUNT = TRANSITION_ACTION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link no.hal.jex.jextest.jexTest.impl.TransitionInputActionImpl <em>Transition Input Action</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see no.hal.jex.jextest.jexTest.impl.TransitionInputActionImpl
   * @see no.hal.jex.jextest.jexTest.impl.JexTestPackageImpl#getTransitionInputAction()
   * @generated
   */
  int TRANSITION_INPUT_ACTION = 12;

  /**
   * The feature id for the '<em><b>Input</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION_INPUT_ACTION__INPUT = TRANSITION_ACTION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Transition Input Action</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION_INPUT_ACTION_FEATURE_COUNT = TRANSITION_ACTION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link no.hal.jex.jextest.jexTest.impl.TransitionEffectImpl <em>Transition Effect</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see no.hal.jex.jextest.jexTest.impl.TransitionEffectImpl
   * @see no.hal.jex.jextest.jexTest.impl.JexTestPackageImpl#getTransitionEffect()
   * @generated
   */
  int TRANSITION_EFFECT = 13;

  /**
   * The number of structural features of the '<em>Transition Effect</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION_EFFECT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link no.hal.jex.jextest.jexTest.impl.TransitionTargetEffectImpl <em>Transition Target Effect</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see no.hal.jex.jextest.jexTest.impl.TransitionTargetEffectImpl
   * @see no.hal.jex.jextest.jexTest.impl.JexTestPackageImpl#getTransitionTargetEffect()
   * @generated
   */
  int TRANSITION_TARGET_EFFECT = 14;

  /**
   * The feature id for the '<em><b>State</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION_TARGET_EFFECT__STATE = TRANSITION_EFFECT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>State Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION_TARGET_EFFECT__STATE_REF = TRANSITION_EFFECT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Transition Target Effect</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION_TARGET_EFFECT_FEATURE_COUNT = TRANSITION_EFFECT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link no.hal.jex.jextest.jexTest.impl.TransitionExceptionEffectImpl <em>Transition Exception Effect</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see no.hal.jex.jextest.jexTest.impl.TransitionExceptionEffectImpl
   * @see no.hal.jex.jextest.jexTest.impl.JexTestPackageImpl#getTransitionExceptionEffect()
   * @generated
   */
  int TRANSITION_EXCEPTION_EFFECT = 15;

  /**
   * The feature id for the '<em><b>Exception Class</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION_EXCEPTION_EFFECT__EXCEPTION_CLASS = TRANSITION_EFFECT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Transition Exception Effect</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION_EXCEPTION_EFFECT_FEATURE_COUNT = TRANSITION_EFFECT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link no.hal.jex.jextest.jexTest.impl.TransitionOutputEffectImpl <em>Transition Output Effect</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see no.hal.jex.jextest.jexTest.impl.TransitionOutputEffectImpl
   * @see no.hal.jex.jextest.jexTest.impl.JexTestPackageImpl#getTransitionOutputEffect()
   * @generated
   */
  int TRANSITION_OUTPUT_EFFECT = 16;

  /**
   * The feature id for the '<em><b>Pattern</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION_OUTPUT_EFFECT__PATTERN = TRANSITION_EFFECT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Transition Output Effect</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION_OUTPUT_EFFECT_FEATURE_COUNT = TRANSITION_EFFECT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link no.hal.jex.jextest.jexTest.impl.MethodImpl <em>Method</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see no.hal.jex.jextest.jexTest.impl.MethodImpl
   * @see no.hal.jex.jextest.jexTest.impl.JexTestPackageImpl#getMethod()
   * @generated
   */
  int METHOD = 17;

  /**
   * The feature id for the '<em><b>Static</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD__STATIC = 0;

  /**
   * The feature id for the '<em><b>Return Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD__RETURN_TYPE = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD__NAME = 2;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD__PARAMETERS = 3;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD__BODY = 4;

  /**
   * The number of structural features of the '<em>Method</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link no.hal.jex.jextest.jexTest.impl.ParameterImpl <em>Parameter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see no.hal.jex.jextest.jexTest.impl.ParameterImpl
   * @see no.hal.jex.jextest.jexTest.impl.JexTestPackageImpl#getParameter()
   * @generated
   */
  int PARAMETER = 18;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER__TYPE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER__NAME = 1;

  /**
   * The number of structural features of the '<em>Parameter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link no.hal.jex.jextest.jexTest.impl.PropertiesTestImpl <em>Properties Test</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see no.hal.jex.jextest.jexTest.impl.PropertiesTestImpl
   * @see no.hal.jex.jextest.jexTest.impl.JexTestPackageImpl#getPropertiesTest()
   * @generated
   */
  int PROPERTIES_TEST = 19;

  /**
   * The feature id for the '<em><b>Expressions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTIES_TEST__EXPRESSIONS = XbasePackage.XBLOCK_EXPRESSION__EXPRESSIONS;

  /**
   * The number of structural features of the '<em>Properties Test</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTIES_TEST_FEATURE_COUNT = XbasePackage.XBLOCK_EXPRESSION_FEATURE_COUNT + 0;


  /**
   * Returns the meta object for class '{@link no.hal.jex.jextest.jexTest.JexTestCase <em>Case</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Case</em>'.
   * @see no.hal.jex.jextest.jexTest.JexTestCase
   * @generated
   */
  EClass getJexTestCase();

  /**
   * Returns the meta object for the containment reference '{@link no.hal.jex.jextest.jexTest.JexTestCase#getTestedClass <em>Tested Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Tested Class</em>'.
   * @see no.hal.jex.jextest.jexTest.JexTestCase#getTestedClass()
   * @see #getJexTestCase()
   * @generated
   */
  EReference getJexTestCase_TestedClass();

  /**
   * Returns the meta object for the attribute '{@link no.hal.jex.jextest.jexTest.JexTestCase#getTestClassName <em>Test Class Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Test Class Name</em>'.
   * @see no.hal.jex.jextest.jexTest.JexTestCase#getTestClassName()
   * @see #getJexTestCase()
   * @generated
   */
  EAttribute getJexTestCase_TestClassName();

  /**
   * Returns the meta object for the attribute '{@link no.hal.jex.jextest.jexTest.JexTestCase#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see no.hal.jex.jextest.jexTest.JexTestCase#getDescription()
   * @see #getJexTestCase()
   * @generated
   */
  EAttribute getJexTestCase_Description();

  /**
   * Returns the meta object for the attribute '{@link no.hal.jex.jextest.jexTest.JexTestCase#getUrl <em>Url</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Url</em>'.
   * @see no.hal.jex.jextest.jexTest.JexTestCase#getUrl()
   * @see #getJexTestCase()
   * @generated
   */
  EAttribute getJexTestCase_Url();

  /**
   * Returns the meta object for the containment reference '{@link no.hal.jex.jextest.jexTest.JexTestCase#getImportSection <em>Import Section</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Import Section</em>'.
   * @see no.hal.jex.jextest.jexTest.JexTestCase#getImportSection()
   * @see #getJexTestCase()
   * @generated
   */
  EReference getJexTestCase_ImportSection();

  /**
   * Returns the meta object for the containment reference list '{@link no.hal.jex.jextest.jexTest.JexTestCase#getInstances <em>Instances</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Instances</em>'.
   * @see no.hal.jex.jextest.jexTest.JexTestCase#getInstances()
   * @see #getJexTestCase()
   * @generated
   */
  EReference getJexTestCase_Instances();

  /**
   * Returns the meta object for the containment reference list '{@link no.hal.jex.jextest.jexTest.JexTestCase#getStateFunctions <em>State Functions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>State Functions</em>'.
   * @see no.hal.jex.jextest.jexTest.JexTestCase#getStateFunctions()
   * @see #getJexTestCase()
   * @generated
   */
  EReference getJexTestCase_StateFunctions();

  /**
   * Returns the meta object for the containment reference list '{@link no.hal.jex.jextest.jexTest.JexTestCase#getTestSequences <em>Test Sequences</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Test Sequences</em>'.
   * @see no.hal.jex.jextest.jexTest.JexTestCase#getTestSequences()
   * @see #getJexTestCase()
   * @generated
   */
  EReference getJexTestCase_TestSequences();

  /**
   * Returns the meta object for the containment reference list '{@link no.hal.jex.jextest.jexTest.JexTestCase#getMethods <em>Methods</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Methods</em>'.
   * @see no.hal.jex.jextest.jexTest.JexTestCase#getMethods()
   * @see #getJexTestCase()
   * @generated
   */
  EReference getJexTestCase_Methods();

  /**
   * Returns the meta object for class '{@link no.hal.jex.jextest.jexTest.Instance <em>Instance</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Instance</em>'.
   * @see no.hal.jex.jextest.jexTest.Instance
   * @generated
   */
  EClass getInstance();

  /**
   * Returns the meta object for the containment reference '{@link no.hal.jex.jextest.jexTest.Instance#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see no.hal.jex.jextest.jexTest.Instance#getType()
   * @see #getInstance()
   * @generated
   */
  EReference getInstance_Type();

  /**
   * Returns the meta object for the attribute '{@link no.hal.jex.jextest.jexTest.Instance#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see no.hal.jex.jextest.jexTest.Instance#getName()
   * @see #getInstance()
   * @generated
   */
  EAttribute getInstance_Name();

  /**
   * Returns the meta object for the containment reference '{@link no.hal.jex.jextest.jexTest.Instance#getExpr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr</em>'.
   * @see no.hal.jex.jextest.jexTest.Instance#getExpr()
   * @see #getInstance()
   * @generated
   */
  EReference getInstance_Expr();

  /**
   * Returns the meta object for class '{@link no.hal.jex.jextest.jexTest.StateTestContext <em>State Test Context</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>State Test Context</em>'.
   * @see no.hal.jex.jextest.jexTest.StateTestContext
   * @generated
   */
  EClass getStateTestContext();

  /**
   * Returns the meta object for the attribute '{@link no.hal.jex.jextest.jexTest.StateTestContext#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see no.hal.jex.jextest.jexTest.StateTestContext#getName()
   * @see #getStateTestContext()
   * @generated
   */
  EAttribute getStateTestContext_Name();

  /**
   * Returns the meta object for the attribute '{@link no.hal.jex.jextest.jexTest.StateTestContext#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see no.hal.jex.jextest.jexTest.StateTestContext#getDescription()
   * @see #getStateTestContext()
   * @generated
   */
  EAttribute getStateTestContext_Description();

  /**
   * Returns the meta object for class '{@link no.hal.jex.jextest.jexTest.PropertiesTestOwner <em>Properties Test Owner</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Properties Test Owner</em>'.
   * @see no.hal.jex.jextest.jexTest.PropertiesTestOwner
   * @generated
   */
  EClass getPropertiesTestOwner();

  /**
   * Returns the meta object for the containment reference '{@link no.hal.jex.jextest.jexTest.PropertiesTestOwner#getTest <em>Test</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Test</em>'.
   * @see no.hal.jex.jextest.jexTest.PropertiesTestOwner#getTest()
   * @see #getPropertiesTestOwner()
   * @generated
   */
  EReference getPropertiesTestOwner_Test();

  /**
   * Returns the meta object for class '{@link no.hal.jex.jextest.jexTest.StateFunction <em>State Function</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>State Function</em>'.
   * @see no.hal.jex.jextest.jexTest.StateFunction
   * @generated
   */
  EClass getStateFunction();

  /**
   * Returns the meta object for the containment reference '{@link no.hal.jex.jextest.jexTest.StateFunction#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see no.hal.jex.jextest.jexTest.StateFunction#getType()
   * @see #getStateFunction()
   * @generated
   */
  EReference getStateFunction_Type();

  /**
   * Returns the meta object for the containment reference list '{@link no.hal.jex.jextest.jexTest.StateFunction#getParameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parameters</em>'.
   * @see no.hal.jex.jextest.jexTest.StateFunction#getParameters()
   * @see #getStateFunction()
   * @generated
   */
  EReference getStateFunction_Parameters();

  /**
   * Returns the meta object for class '{@link no.hal.jex.jextest.jexTest.JexTestSequence <em>Sequence</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sequence</em>'.
   * @see no.hal.jex.jextest.jexTest.JexTestSequence
   * @generated
   */
  EClass getJexTestSequence();

  /**
   * Returns the meta object for the containment reference list '{@link no.hal.jex.jextest.jexTest.JexTestSequence#getInstances <em>Instances</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Instances</em>'.
   * @see no.hal.jex.jextest.jexTest.JexTestSequence#getInstances()
   * @see #getJexTestSequence()
   * @generated
   */
  EReference getJexTestSequence_Instances();

  /**
   * Returns the meta object for the containment reference list '{@link no.hal.jex.jextest.jexTest.JexTestSequence#getTransitions <em>Transitions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Transitions</em>'.
   * @see no.hal.jex.jextest.jexTest.JexTestSequence#getTransitions()
   * @see #getJexTestSequence()
   * @generated
   */
  EReference getJexTestSequence_Transitions();

  /**
   * Returns the meta object for class '{@link no.hal.jex.jextest.jexTest.State <em>State</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>State</em>'.
   * @see no.hal.jex.jextest.jexTest.State
   * @generated
   */
  EClass getState();

  /**
   * Returns the meta object for the attribute '{@link no.hal.jex.jextest.jexTest.State#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see no.hal.jex.jextest.jexTest.State#getName()
   * @see #getState()
   * @generated
   */
  EAttribute getState_Name();

  /**
   * Returns the meta object for the attribute '{@link no.hal.jex.jextest.jexTest.State#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see no.hal.jex.jextest.jexTest.State#getDescription()
   * @see #getState()
   * @generated
   */
  EAttribute getState_Description();

  /**
   * Returns the meta object for the containment reference list '{@link no.hal.jex.jextest.jexTest.State#getObjectTests <em>Object Tests</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Object Tests</em>'.
   * @see no.hal.jex.jextest.jexTest.State#getObjectTests()
   * @see #getState()
   * @generated
   */
  EReference getState_ObjectTests();

  /**
   * Returns the meta object for class '{@link no.hal.jex.jextest.jexTest.ObjectTest <em>Object Test</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Object Test</em>'.
   * @see no.hal.jex.jextest.jexTest.ObjectTest
   * @generated
   */
  EClass getObjectTest();

  /**
   * Returns the meta object for the reference '{@link no.hal.jex.jextest.jexTest.ObjectTest#getInstance <em>Instance</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Instance</em>'.
   * @see no.hal.jex.jextest.jexTest.ObjectTest#getInstance()
   * @see #getObjectTest()
   * @generated
   */
  EReference getObjectTest_Instance();

  /**
   * Returns the meta object for class '{@link no.hal.jex.jextest.jexTest.Transition <em>Transition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Transition</em>'.
   * @see no.hal.jex.jextest.jexTest.Transition
   * @generated
   */
  EClass getTransition();

  /**
   * Returns the meta object for the containment reference '{@link no.hal.jex.jextest.jexTest.Transition#getSource <em>Source</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Source</em>'.
   * @see no.hal.jex.jextest.jexTest.Transition#getSource()
   * @see #getTransition()
   * @generated
   */
  EReference getTransition_Source();

  /**
   * Returns the meta object for the attribute '{@link no.hal.jex.jextest.jexTest.Transition#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see no.hal.jex.jextest.jexTest.Transition#getDescription()
   * @see #getTransition()
   * @generated
   */
  EAttribute getTransition_Description();

  /**
   * Returns the meta object for the containment reference list '{@link no.hal.jex.jextest.jexTest.Transition#getActions <em>Actions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Actions</em>'.
   * @see no.hal.jex.jextest.jexTest.Transition#getActions()
   * @see #getTransition()
   * @generated
   */
  EReference getTransition_Actions();

  /**
   * Returns the meta object for the containment reference '{@link no.hal.jex.jextest.jexTest.Transition#getEffect <em>Effect</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Effect</em>'.
   * @see no.hal.jex.jextest.jexTest.Transition#getEffect()
   * @see #getTransition()
   * @generated
   */
  EReference getTransition_Effect();

  /**
   * Returns the meta object for class '{@link no.hal.jex.jextest.jexTest.TransitionSource <em>Transition Source</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Transition Source</em>'.
   * @see no.hal.jex.jextest.jexTest.TransitionSource
   * @generated
   */
  EClass getTransitionSource();

  /**
   * Returns the meta object for the containment reference '{@link no.hal.jex.jextest.jexTest.TransitionSource#getState <em>State</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>State</em>'.
   * @see no.hal.jex.jextest.jexTest.TransitionSource#getState()
   * @see #getTransitionSource()
   * @generated
   */
  EReference getTransitionSource_State();

  /**
   * Returns the meta object for the reference '{@link no.hal.jex.jextest.jexTest.TransitionSource#getStateRef <em>State Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>State Ref</em>'.
   * @see no.hal.jex.jextest.jexTest.TransitionSource#getStateRef()
   * @see #getTransitionSource()
   * @generated
   */
  EReference getTransitionSource_StateRef();

  /**
   * Returns the meta object for class '{@link no.hal.jex.jextest.jexTest.TransitionAction <em>Transition Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Transition Action</em>'.
   * @see no.hal.jex.jextest.jexTest.TransitionAction
   * @generated
   */
  EClass getTransitionAction();

  /**
   * Returns the meta object for class '{@link no.hal.jex.jextest.jexTest.TransitionExpressionAction <em>Transition Expression Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Transition Expression Action</em>'.
   * @see no.hal.jex.jextest.jexTest.TransitionExpressionAction
   * @generated
   */
  EClass getTransitionExpressionAction();

  /**
   * Returns the meta object for the containment reference '{@link no.hal.jex.jextest.jexTest.TransitionExpressionAction#getExpr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr</em>'.
   * @see no.hal.jex.jextest.jexTest.TransitionExpressionAction#getExpr()
   * @see #getTransitionExpressionAction()
   * @generated
   */
  EReference getTransitionExpressionAction_Expr();

  /**
   * Returns the meta object for the containment reference '{@link no.hal.jex.jextest.jexTest.TransitionExpressionAction#getTimes <em>Times</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Times</em>'.
   * @see no.hal.jex.jextest.jexTest.TransitionExpressionAction#getTimes()
   * @see #getTransitionExpressionAction()
   * @generated
   */
  EReference getTransitionExpressionAction_Times();

  /**
   * Returns the meta object for class '{@link no.hal.jex.jextest.jexTest.TransitionInputAction <em>Transition Input Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Transition Input Action</em>'.
   * @see no.hal.jex.jextest.jexTest.TransitionInputAction
   * @generated
   */
  EClass getTransitionInputAction();

  /**
   * Returns the meta object for the attribute '{@link no.hal.jex.jextest.jexTest.TransitionInputAction#getInput <em>Input</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Input</em>'.
   * @see no.hal.jex.jextest.jexTest.TransitionInputAction#getInput()
   * @see #getTransitionInputAction()
   * @generated
   */
  EAttribute getTransitionInputAction_Input();

  /**
   * Returns the meta object for class '{@link no.hal.jex.jextest.jexTest.TransitionEffect <em>Transition Effect</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Transition Effect</em>'.
   * @see no.hal.jex.jextest.jexTest.TransitionEffect
   * @generated
   */
  EClass getTransitionEffect();

  /**
   * Returns the meta object for class '{@link no.hal.jex.jextest.jexTest.TransitionTargetEffect <em>Transition Target Effect</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Transition Target Effect</em>'.
   * @see no.hal.jex.jextest.jexTest.TransitionTargetEffect
   * @generated
   */
  EClass getTransitionTargetEffect();

  /**
   * Returns the meta object for the containment reference '{@link no.hal.jex.jextest.jexTest.TransitionTargetEffect#getState <em>State</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>State</em>'.
   * @see no.hal.jex.jextest.jexTest.TransitionTargetEffect#getState()
   * @see #getTransitionTargetEffect()
   * @generated
   */
  EReference getTransitionTargetEffect_State();

  /**
   * Returns the meta object for the reference '{@link no.hal.jex.jextest.jexTest.TransitionTargetEffect#getStateRef <em>State Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>State Ref</em>'.
   * @see no.hal.jex.jextest.jexTest.TransitionTargetEffect#getStateRef()
   * @see #getTransitionTargetEffect()
   * @generated
   */
  EReference getTransitionTargetEffect_StateRef();

  /**
   * Returns the meta object for class '{@link no.hal.jex.jextest.jexTest.TransitionExceptionEffect <em>Transition Exception Effect</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Transition Exception Effect</em>'.
   * @see no.hal.jex.jextest.jexTest.TransitionExceptionEffect
   * @generated
   */
  EClass getTransitionExceptionEffect();

  /**
   * Returns the meta object for the containment reference '{@link no.hal.jex.jextest.jexTest.TransitionExceptionEffect#getExceptionClass <em>Exception Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Exception Class</em>'.
   * @see no.hal.jex.jextest.jexTest.TransitionExceptionEffect#getExceptionClass()
   * @see #getTransitionExceptionEffect()
   * @generated
   */
  EReference getTransitionExceptionEffect_ExceptionClass();

  /**
   * Returns the meta object for class '{@link no.hal.jex.jextest.jexTest.TransitionOutputEffect <em>Transition Output Effect</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Transition Output Effect</em>'.
   * @see no.hal.jex.jextest.jexTest.TransitionOutputEffect
   * @generated
   */
  EClass getTransitionOutputEffect();

  /**
   * Returns the meta object for the attribute '{@link no.hal.jex.jextest.jexTest.TransitionOutputEffect#getPattern <em>Pattern</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Pattern</em>'.
   * @see no.hal.jex.jextest.jexTest.TransitionOutputEffect#getPattern()
   * @see #getTransitionOutputEffect()
   * @generated
   */
  EAttribute getTransitionOutputEffect_Pattern();

  /**
   * Returns the meta object for class '{@link no.hal.jex.jextest.jexTest.Method <em>Method</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Method</em>'.
   * @see no.hal.jex.jextest.jexTest.Method
   * @generated
   */
  EClass getMethod();

  /**
   * Returns the meta object for the attribute '{@link no.hal.jex.jextest.jexTest.Method#isStatic <em>Static</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Static</em>'.
   * @see no.hal.jex.jextest.jexTest.Method#isStatic()
   * @see #getMethod()
   * @generated
   */
  EAttribute getMethod_Static();

  /**
   * Returns the meta object for the containment reference '{@link no.hal.jex.jextest.jexTest.Method#getReturnType <em>Return Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Return Type</em>'.
   * @see no.hal.jex.jextest.jexTest.Method#getReturnType()
   * @see #getMethod()
   * @generated
   */
  EReference getMethod_ReturnType();

  /**
   * Returns the meta object for the attribute '{@link no.hal.jex.jextest.jexTest.Method#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see no.hal.jex.jextest.jexTest.Method#getName()
   * @see #getMethod()
   * @generated
   */
  EAttribute getMethod_Name();

  /**
   * Returns the meta object for the containment reference list '{@link no.hal.jex.jextest.jexTest.Method#getParameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parameters</em>'.
   * @see no.hal.jex.jextest.jexTest.Method#getParameters()
   * @see #getMethod()
   * @generated
   */
  EReference getMethod_Parameters();

  /**
   * Returns the meta object for the containment reference '{@link no.hal.jex.jextest.jexTest.Method#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Body</em>'.
   * @see no.hal.jex.jextest.jexTest.Method#getBody()
   * @see #getMethod()
   * @generated
   */
  EReference getMethod_Body();

  /**
   * Returns the meta object for class '{@link no.hal.jex.jextest.jexTest.Parameter <em>Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parameter</em>'.
   * @see no.hal.jex.jextest.jexTest.Parameter
   * @generated
   */
  EClass getParameter();

  /**
   * Returns the meta object for the containment reference '{@link no.hal.jex.jextest.jexTest.Parameter#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see no.hal.jex.jextest.jexTest.Parameter#getType()
   * @see #getParameter()
   * @generated
   */
  EReference getParameter_Type();

  /**
   * Returns the meta object for the attribute '{@link no.hal.jex.jextest.jexTest.Parameter#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see no.hal.jex.jextest.jexTest.Parameter#getName()
   * @see #getParameter()
   * @generated
   */
  EAttribute getParameter_Name();

  /**
   * Returns the meta object for class '{@link no.hal.jex.jextest.jexTest.PropertiesTest <em>Properties Test</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Properties Test</em>'.
   * @see no.hal.jex.jextest.jexTest.PropertiesTest
   * @generated
   */
  EClass getPropertiesTest();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  JexTestFactory getJexTestFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link no.hal.jex.jextest.jexTest.impl.JexTestCaseImpl <em>Case</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see no.hal.jex.jextest.jexTest.impl.JexTestCaseImpl
     * @see no.hal.jex.jextest.jexTest.impl.JexTestPackageImpl#getJexTestCase()
     * @generated
     */
    EClass JEX_TEST_CASE = eINSTANCE.getJexTestCase();

    /**
     * The meta object literal for the '<em><b>Tested Class</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference JEX_TEST_CASE__TESTED_CLASS = eINSTANCE.getJexTestCase_TestedClass();

    /**
     * The meta object literal for the '<em><b>Test Class Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute JEX_TEST_CASE__TEST_CLASS_NAME = eINSTANCE.getJexTestCase_TestClassName();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute JEX_TEST_CASE__DESCRIPTION = eINSTANCE.getJexTestCase_Description();

    /**
     * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute JEX_TEST_CASE__URL = eINSTANCE.getJexTestCase_Url();

    /**
     * The meta object literal for the '<em><b>Import Section</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference JEX_TEST_CASE__IMPORT_SECTION = eINSTANCE.getJexTestCase_ImportSection();

    /**
     * The meta object literal for the '<em><b>Instances</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference JEX_TEST_CASE__INSTANCES = eINSTANCE.getJexTestCase_Instances();

    /**
     * The meta object literal for the '<em><b>State Functions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference JEX_TEST_CASE__STATE_FUNCTIONS = eINSTANCE.getJexTestCase_StateFunctions();

    /**
     * The meta object literal for the '<em><b>Test Sequences</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference JEX_TEST_CASE__TEST_SEQUENCES = eINSTANCE.getJexTestCase_TestSequences();

    /**
     * The meta object literal for the '<em><b>Methods</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference JEX_TEST_CASE__METHODS = eINSTANCE.getJexTestCase_Methods();

    /**
     * The meta object literal for the '{@link no.hal.jex.jextest.jexTest.impl.InstanceImpl <em>Instance</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see no.hal.jex.jextest.jexTest.impl.InstanceImpl
     * @see no.hal.jex.jextest.jexTest.impl.JexTestPackageImpl#getInstance()
     * @generated
     */
    EClass INSTANCE = eINSTANCE.getInstance();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INSTANCE__TYPE = eINSTANCE.getInstance_Type();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INSTANCE__NAME = eINSTANCE.getInstance_Name();

    /**
     * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INSTANCE__EXPR = eINSTANCE.getInstance_Expr();

    /**
     * The meta object literal for the '{@link no.hal.jex.jextest.jexTest.impl.StateTestContextImpl <em>State Test Context</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see no.hal.jex.jextest.jexTest.impl.StateTestContextImpl
     * @see no.hal.jex.jextest.jexTest.impl.JexTestPackageImpl#getStateTestContext()
     * @generated
     */
    EClass STATE_TEST_CONTEXT = eINSTANCE.getStateTestContext();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATE_TEST_CONTEXT__NAME = eINSTANCE.getStateTestContext_Name();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATE_TEST_CONTEXT__DESCRIPTION = eINSTANCE.getStateTestContext_Description();

    /**
     * The meta object literal for the '{@link no.hal.jex.jextest.jexTest.impl.PropertiesTestOwnerImpl <em>Properties Test Owner</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see no.hal.jex.jextest.jexTest.impl.PropertiesTestOwnerImpl
     * @see no.hal.jex.jextest.jexTest.impl.JexTestPackageImpl#getPropertiesTestOwner()
     * @generated
     */
    EClass PROPERTIES_TEST_OWNER = eINSTANCE.getPropertiesTestOwner();

    /**
     * The meta object literal for the '<em><b>Test</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROPERTIES_TEST_OWNER__TEST = eINSTANCE.getPropertiesTestOwner_Test();

    /**
     * The meta object literal for the '{@link no.hal.jex.jextest.jexTest.impl.StateFunctionImpl <em>State Function</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see no.hal.jex.jextest.jexTest.impl.StateFunctionImpl
     * @see no.hal.jex.jextest.jexTest.impl.JexTestPackageImpl#getStateFunction()
     * @generated
     */
    EClass STATE_FUNCTION = eINSTANCE.getStateFunction();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATE_FUNCTION__TYPE = eINSTANCE.getStateFunction_Type();

    /**
     * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATE_FUNCTION__PARAMETERS = eINSTANCE.getStateFunction_Parameters();

    /**
     * The meta object literal for the '{@link no.hal.jex.jextest.jexTest.impl.JexTestSequenceImpl <em>Sequence</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see no.hal.jex.jextest.jexTest.impl.JexTestSequenceImpl
     * @see no.hal.jex.jextest.jexTest.impl.JexTestPackageImpl#getJexTestSequence()
     * @generated
     */
    EClass JEX_TEST_SEQUENCE = eINSTANCE.getJexTestSequence();

    /**
     * The meta object literal for the '<em><b>Instances</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference JEX_TEST_SEQUENCE__INSTANCES = eINSTANCE.getJexTestSequence_Instances();

    /**
     * The meta object literal for the '<em><b>Transitions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference JEX_TEST_SEQUENCE__TRANSITIONS = eINSTANCE.getJexTestSequence_Transitions();

    /**
     * The meta object literal for the '{@link no.hal.jex.jextest.jexTest.impl.StateImpl <em>State</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see no.hal.jex.jextest.jexTest.impl.StateImpl
     * @see no.hal.jex.jextest.jexTest.impl.JexTestPackageImpl#getState()
     * @generated
     */
    EClass STATE = eINSTANCE.getState();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATE__NAME = eINSTANCE.getState_Name();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATE__DESCRIPTION = eINSTANCE.getState_Description();

    /**
     * The meta object literal for the '<em><b>Object Tests</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATE__OBJECT_TESTS = eINSTANCE.getState_ObjectTests();

    /**
     * The meta object literal for the '{@link no.hal.jex.jextest.jexTest.impl.ObjectTestImpl <em>Object Test</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see no.hal.jex.jextest.jexTest.impl.ObjectTestImpl
     * @see no.hal.jex.jextest.jexTest.impl.JexTestPackageImpl#getObjectTest()
     * @generated
     */
    EClass OBJECT_TEST = eINSTANCE.getObjectTest();

    /**
     * The meta object literal for the '<em><b>Instance</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OBJECT_TEST__INSTANCE = eINSTANCE.getObjectTest_Instance();

    /**
     * The meta object literal for the '{@link no.hal.jex.jextest.jexTest.impl.TransitionImpl <em>Transition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see no.hal.jex.jextest.jexTest.impl.TransitionImpl
     * @see no.hal.jex.jextest.jexTest.impl.JexTestPackageImpl#getTransition()
     * @generated
     */
    EClass TRANSITION = eINSTANCE.getTransition();

    /**
     * The meta object literal for the '<em><b>Source</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRANSITION__SOURCE = eINSTANCE.getTransition_Source();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TRANSITION__DESCRIPTION = eINSTANCE.getTransition_Description();

    /**
     * The meta object literal for the '<em><b>Actions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRANSITION__ACTIONS = eINSTANCE.getTransition_Actions();

    /**
     * The meta object literal for the '<em><b>Effect</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRANSITION__EFFECT = eINSTANCE.getTransition_Effect();

    /**
     * The meta object literal for the '{@link no.hal.jex.jextest.jexTest.impl.TransitionSourceImpl <em>Transition Source</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see no.hal.jex.jextest.jexTest.impl.TransitionSourceImpl
     * @see no.hal.jex.jextest.jexTest.impl.JexTestPackageImpl#getTransitionSource()
     * @generated
     */
    EClass TRANSITION_SOURCE = eINSTANCE.getTransitionSource();

    /**
     * The meta object literal for the '<em><b>State</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRANSITION_SOURCE__STATE = eINSTANCE.getTransitionSource_State();

    /**
     * The meta object literal for the '<em><b>State Ref</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRANSITION_SOURCE__STATE_REF = eINSTANCE.getTransitionSource_StateRef();

    /**
     * The meta object literal for the '{@link no.hal.jex.jextest.jexTest.impl.TransitionActionImpl <em>Transition Action</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see no.hal.jex.jextest.jexTest.impl.TransitionActionImpl
     * @see no.hal.jex.jextest.jexTest.impl.JexTestPackageImpl#getTransitionAction()
     * @generated
     */
    EClass TRANSITION_ACTION = eINSTANCE.getTransitionAction();

    /**
     * The meta object literal for the '{@link no.hal.jex.jextest.jexTest.impl.TransitionExpressionActionImpl <em>Transition Expression Action</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see no.hal.jex.jextest.jexTest.impl.TransitionExpressionActionImpl
     * @see no.hal.jex.jextest.jexTest.impl.JexTestPackageImpl#getTransitionExpressionAction()
     * @generated
     */
    EClass TRANSITION_EXPRESSION_ACTION = eINSTANCE.getTransitionExpressionAction();

    /**
     * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRANSITION_EXPRESSION_ACTION__EXPR = eINSTANCE.getTransitionExpressionAction_Expr();

    /**
     * The meta object literal for the '<em><b>Times</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRANSITION_EXPRESSION_ACTION__TIMES = eINSTANCE.getTransitionExpressionAction_Times();

    /**
     * The meta object literal for the '{@link no.hal.jex.jextest.jexTest.impl.TransitionInputActionImpl <em>Transition Input Action</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see no.hal.jex.jextest.jexTest.impl.TransitionInputActionImpl
     * @see no.hal.jex.jextest.jexTest.impl.JexTestPackageImpl#getTransitionInputAction()
     * @generated
     */
    EClass TRANSITION_INPUT_ACTION = eINSTANCE.getTransitionInputAction();

    /**
     * The meta object literal for the '<em><b>Input</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TRANSITION_INPUT_ACTION__INPUT = eINSTANCE.getTransitionInputAction_Input();

    /**
     * The meta object literal for the '{@link no.hal.jex.jextest.jexTest.impl.TransitionEffectImpl <em>Transition Effect</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see no.hal.jex.jextest.jexTest.impl.TransitionEffectImpl
     * @see no.hal.jex.jextest.jexTest.impl.JexTestPackageImpl#getTransitionEffect()
     * @generated
     */
    EClass TRANSITION_EFFECT = eINSTANCE.getTransitionEffect();

    /**
     * The meta object literal for the '{@link no.hal.jex.jextest.jexTest.impl.TransitionTargetEffectImpl <em>Transition Target Effect</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see no.hal.jex.jextest.jexTest.impl.TransitionTargetEffectImpl
     * @see no.hal.jex.jextest.jexTest.impl.JexTestPackageImpl#getTransitionTargetEffect()
     * @generated
     */
    EClass TRANSITION_TARGET_EFFECT = eINSTANCE.getTransitionTargetEffect();

    /**
     * The meta object literal for the '<em><b>State</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRANSITION_TARGET_EFFECT__STATE = eINSTANCE.getTransitionTargetEffect_State();

    /**
     * The meta object literal for the '<em><b>State Ref</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRANSITION_TARGET_EFFECT__STATE_REF = eINSTANCE.getTransitionTargetEffect_StateRef();

    /**
     * The meta object literal for the '{@link no.hal.jex.jextest.jexTest.impl.TransitionExceptionEffectImpl <em>Transition Exception Effect</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see no.hal.jex.jextest.jexTest.impl.TransitionExceptionEffectImpl
     * @see no.hal.jex.jextest.jexTest.impl.JexTestPackageImpl#getTransitionExceptionEffect()
     * @generated
     */
    EClass TRANSITION_EXCEPTION_EFFECT = eINSTANCE.getTransitionExceptionEffect();

    /**
     * The meta object literal for the '<em><b>Exception Class</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRANSITION_EXCEPTION_EFFECT__EXCEPTION_CLASS = eINSTANCE.getTransitionExceptionEffect_ExceptionClass();

    /**
     * The meta object literal for the '{@link no.hal.jex.jextest.jexTest.impl.TransitionOutputEffectImpl <em>Transition Output Effect</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see no.hal.jex.jextest.jexTest.impl.TransitionOutputEffectImpl
     * @see no.hal.jex.jextest.jexTest.impl.JexTestPackageImpl#getTransitionOutputEffect()
     * @generated
     */
    EClass TRANSITION_OUTPUT_EFFECT = eINSTANCE.getTransitionOutputEffect();

    /**
     * The meta object literal for the '<em><b>Pattern</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TRANSITION_OUTPUT_EFFECT__PATTERN = eINSTANCE.getTransitionOutputEffect_Pattern();

    /**
     * The meta object literal for the '{@link no.hal.jex.jextest.jexTest.impl.MethodImpl <em>Method</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see no.hal.jex.jextest.jexTest.impl.MethodImpl
     * @see no.hal.jex.jextest.jexTest.impl.JexTestPackageImpl#getMethod()
     * @generated
     */
    EClass METHOD = eINSTANCE.getMethod();

    /**
     * The meta object literal for the '<em><b>Static</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute METHOD__STATIC = eINSTANCE.getMethod_Static();

    /**
     * The meta object literal for the '<em><b>Return Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference METHOD__RETURN_TYPE = eINSTANCE.getMethod_ReturnType();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute METHOD__NAME = eINSTANCE.getMethod_Name();

    /**
     * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference METHOD__PARAMETERS = eINSTANCE.getMethod_Parameters();

    /**
     * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference METHOD__BODY = eINSTANCE.getMethod_Body();

    /**
     * The meta object literal for the '{@link no.hal.jex.jextest.jexTest.impl.ParameterImpl <em>Parameter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see no.hal.jex.jextest.jexTest.impl.ParameterImpl
     * @see no.hal.jex.jextest.jexTest.impl.JexTestPackageImpl#getParameter()
     * @generated
     */
    EClass PARAMETER = eINSTANCE.getParameter();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARAMETER__TYPE = eINSTANCE.getParameter_Type();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARAMETER__NAME = eINSTANCE.getParameter_Name();

    /**
     * The meta object literal for the '{@link no.hal.jex.jextest.jexTest.impl.PropertiesTestImpl <em>Properties Test</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see no.hal.jex.jextest.jexTest.impl.PropertiesTestImpl
     * @see no.hal.jex.jextest.jexTest.impl.JexTestPackageImpl#getPropertiesTest()
     * @generated
     */
    EClass PROPERTIES_TEST = eINSTANCE.getPropertiesTest();

  }

} //JexTestPackage
