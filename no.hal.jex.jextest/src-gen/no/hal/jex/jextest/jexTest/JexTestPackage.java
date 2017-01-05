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
   * The meta object id for the '{@link no.hal.jex.jextest.jexTest.impl.TestMemberContextImpl <em>Test Member Context</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see no.hal.jex.jextest.jexTest.impl.TestMemberContextImpl
   * @see no.hal.jex.jextest.jexTest.impl.JexTestPackageImpl#getTestMemberContext()
   * @generated
   */
  int TEST_MEMBER_CONTEXT = 3;

  /**
   * The feature id for the '<em><b>Import Section</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEST_MEMBER_CONTEXT__IMPORT_SECTION = 0;

  /**
   * The feature id for the '<em><b>Instances</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEST_MEMBER_CONTEXT__INSTANCES = 1;

  /**
   * The feature id for the '<em><b>State Functions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEST_MEMBER_CONTEXT__STATE_FUNCTIONS = 2;

  /**
   * The feature id for the '<em><b>Methods</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEST_MEMBER_CONTEXT__METHODS = 3;

  /**
   * The number of structural features of the '<em>Test Member Context</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEST_MEMBER_CONTEXT_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link no.hal.jex.jextest.jexTest.impl.JexTestSuiteImpl <em>Suite</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see no.hal.jex.jextest.jexTest.impl.JexTestSuiteImpl
   * @see no.hal.jex.jextest.jexTest.impl.JexTestPackageImpl#getJexTestSuite()
   * @generated
   */
  int JEX_TEST_SUITE = 0;

  /**
   * The feature id for the '<em><b>Import Section</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JEX_TEST_SUITE__IMPORT_SECTION = TEST_MEMBER_CONTEXT__IMPORT_SECTION;

  /**
   * The feature id for the '<em><b>Instances</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JEX_TEST_SUITE__INSTANCES = TEST_MEMBER_CONTEXT__INSTANCES;

  /**
   * The feature id for the '<em><b>State Functions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JEX_TEST_SUITE__STATE_FUNCTIONS = TEST_MEMBER_CONTEXT__STATE_FUNCTIONS;

  /**
   * The feature id for the '<em><b>Methods</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JEX_TEST_SUITE__METHODS = TEST_MEMBER_CONTEXT__METHODS;

  /**
   * The feature id for the '<em><b>Suite Class Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JEX_TEST_SUITE__SUITE_CLASS_NAME = TEST_MEMBER_CONTEXT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Test Cases</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JEX_TEST_SUITE__TEST_CASES = TEST_MEMBER_CONTEXT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Suite</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JEX_TEST_SUITE_FEATURE_COUNT = TEST_MEMBER_CONTEXT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link no.hal.jex.jextest.jexTest.impl.JexTestCaseImpl <em>Case</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see no.hal.jex.jextest.jexTest.impl.JexTestCaseImpl
   * @see no.hal.jex.jextest.jexTest.impl.JexTestPackageImpl#getJexTestCase()
   * @generated
   */
  int JEX_TEST_CASE = 1;

  /**
   * The feature id for the '<em><b>Import Section</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JEX_TEST_CASE__IMPORT_SECTION = TEST_MEMBER_CONTEXT__IMPORT_SECTION;

  /**
   * The feature id for the '<em><b>Instances</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JEX_TEST_CASE__INSTANCES = TEST_MEMBER_CONTEXT__INSTANCES;

  /**
   * The feature id for the '<em><b>State Functions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JEX_TEST_CASE__STATE_FUNCTIONS = TEST_MEMBER_CONTEXT__STATE_FUNCTIONS;

  /**
   * The feature id for the '<em><b>Methods</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JEX_TEST_CASE__METHODS = TEST_MEMBER_CONTEXT__METHODS;

  /**
   * The feature id for the '<em><b>Tested Classes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JEX_TEST_CASE__TESTED_CLASSES = TEST_MEMBER_CONTEXT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Tested Class Ref</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JEX_TEST_CASE__TESTED_CLASS_REF = TEST_MEMBER_CONTEXT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Test Class Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JEX_TEST_CASE__TEST_CLASS_NAME = TEST_MEMBER_CONTEXT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JEX_TEST_CASE__DESCRIPTION = TEST_MEMBER_CONTEXT_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Url</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JEX_TEST_CASE__URL = TEST_MEMBER_CONTEXT_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Test Sequences</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JEX_TEST_CASE__TEST_SEQUENCES = TEST_MEMBER_CONTEXT_FEATURE_COUNT + 5;

  /**
   * The number of structural features of the '<em>Case</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JEX_TEST_CASE_FEATURE_COUNT = TEST_MEMBER_CONTEXT_FEATURE_COUNT + 6;

  /**
   * The meta object id for the '{@link no.hal.jex.jextest.jexTest.impl.InstanceImpl <em>Instance</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see no.hal.jex.jextest.jexTest.impl.InstanceImpl
   * @see no.hal.jex.jextest.jexTest.impl.JexTestPackageImpl#getInstance()
   * @generated
   */
  int INSTANCE = 2;

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
  int STATE_TEST_CONTEXT = 4;

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
  int PROPERTIES_TEST_OWNER = 5;

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
  int STATE_FUNCTION = 6;

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
  int JEX_TEST_SEQUENCE = 7;

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
   * The feature id for the '<em><b>Tested</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JEX_TEST_SEQUENCE__TESTED = STATE_TEST_CONTEXT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Instances</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JEX_TEST_SEQUENCE__INSTANCES = STATE_TEST_CONTEXT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Transitions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JEX_TEST_SEQUENCE__TRANSITIONS = STATE_TEST_CONTEXT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Sequence</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JEX_TEST_SEQUENCE_FEATURE_COUNT = STATE_TEST_CONTEXT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link no.hal.jex.jextest.jexTest.impl.JvmOperationRefImpl <em>Jvm Operation Ref</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see no.hal.jex.jextest.jexTest.impl.JvmOperationRefImpl
   * @see no.hal.jex.jextest.jexTest.impl.JexTestPackageImpl#getJvmOperationRef()
   * @generated
   */
  int JVM_OPERATION_REF = 8;

  /**
   * The feature id for the '<em><b>Method Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JVM_OPERATION_REF__METHOD_NAME = 0;

  /**
   * The feature id for the '<em><b>Parameter Types</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JVM_OPERATION_REF__PARAMETER_TYPES = 1;

  /**
   * The number of structural features of the '<em>Jvm Operation Ref</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JVM_OPERATION_REF_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link no.hal.jex.jextest.jexTest.impl.StateImpl <em>State</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see no.hal.jex.jextest.jexTest.impl.StateImpl
   * @see no.hal.jex.jextest.jexTest.impl.JexTestPackageImpl#getState()
   * @generated
   */
  int STATE = 9;

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
  int OBJECT_TEST = 10;

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
  int TRANSITION = 11;

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
   * The feature id for the '<em><b>Effects</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION__EFFECTS = 3;

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
  int TRANSITION_SOURCE = 12;

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
  int TRANSITION_ACTION = 13;

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
  int TRANSITION_EXPRESSION_ACTION = 14;

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
  int TRANSITION_INPUT_ACTION = 15;

  /**
   * The feature id for the '<em><b>Input</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION_INPUT_ACTION__INPUT = 0;

  /**
   * The number of structural features of the '<em>Transition Input Action</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION_INPUT_ACTION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link no.hal.jex.jextest.jexTest.impl.TransitionEffectImpl <em>Transition Effect</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see no.hal.jex.jextest.jexTest.impl.TransitionEffectImpl
   * @see no.hal.jex.jextest.jexTest.impl.JexTestPackageImpl#getTransitionEffect()
   * @generated
   */
  int TRANSITION_EFFECT = 16;

  /**
   * The number of structural features of the '<em>Transition Effect</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION_EFFECT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link no.hal.jex.jextest.jexTest.impl.TransitionEffect2Impl <em>Transition Effect2</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see no.hal.jex.jextest.jexTest.impl.TransitionEffect2Impl
   * @see no.hal.jex.jextest.jexTest.impl.JexTestPackageImpl#getTransitionEffect2()
   * @generated
   */
  int TRANSITION_EFFECT2 = 17;

  /**
   * The number of structural features of the '<em>Transition Effect2</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION_EFFECT2_FEATURE_COUNT = TRANSITION_EFFECT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link no.hal.jex.jextest.jexTest.impl.TransitionTargetEffectImpl <em>Transition Target Effect</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see no.hal.jex.jextest.jexTest.impl.TransitionTargetEffectImpl
   * @see no.hal.jex.jextest.jexTest.impl.JexTestPackageImpl#getTransitionTargetEffect()
   * @generated
   */
  int TRANSITION_TARGET_EFFECT = 18;

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
  int TRANSITION_EXCEPTION_EFFECT = 19;

  /**
   * The feature id for the '<em><b>Exception Class</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION_EXCEPTION_EFFECT__EXCEPTION_CLASS = TRANSITION_EFFECT2_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Transition Exception Effect</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION_EXCEPTION_EFFECT_FEATURE_COUNT = TRANSITION_EFFECT2_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link no.hal.jex.jextest.jexTest.impl.TransitionOutputEffectImpl <em>Transition Output Effect</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see no.hal.jex.jextest.jexTest.impl.TransitionOutputEffectImpl
   * @see no.hal.jex.jextest.jexTest.impl.JexTestPackageImpl#getTransitionOutputEffect()
   * @generated
   */
  int TRANSITION_OUTPUT_EFFECT = 20;

  /**
   * The feature id for the '<em><b>Pattern</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION_OUTPUT_EFFECT__PATTERN = 0;

  /**
   * The number of structural features of the '<em>Transition Output Effect</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION_OUTPUT_EFFECT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link no.hal.jex.jextest.jexTest.impl.TransitionCallbackEffectImpl <em>Transition Callback Effect</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see no.hal.jex.jextest.jexTest.impl.TransitionCallbackEffectImpl
   * @see no.hal.jex.jextest.jexTest.impl.JexTestPackageImpl#getTransitionCallbackEffect()
   * @generated
   */
  int TRANSITION_CALLBACK_EFFECT = 21;

  /**
   * The feature id for the '<em><b>Instance</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION_CALLBACK_EFFECT__INSTANCE = TRANSITION_EFFECT2_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Callback Class</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION_CALLBACK_EFFECT__CALLBACK_CLASS = TRANSITION_EFFECT2_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Method Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION_CALLBACK_EFFECT__METHOD_NAME = TRANSITION_EFFECT2_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION_CALLBACK_EFFECT__PARAMETERS = TRANSITION_EFFECT2_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Arguments</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION_CALLBACK_EFFECT__ARGUMENTS = TRANSITION_EFFECT2_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>Transition Callback Effect</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION_CALLBACK_EFFECT_FEATURE_COUNT = TRANSITION_EFFECT2_FEATURE_COUNT + 5;

  /**
   * The meta object id for the '{@link no.hal.jex.jextest.jexTest.impl.MethodImpl <em>Method</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see no.hal.jex.jextest.jexTest.impl.MethodImpl
   * @see no.hal.jex.jextest.jexTest.impl.JexTestPackageImpl#getMethod()
   * @generated
   */
  int METHOD = 22;

  /**
   * The feature id for the '<em><b>Return Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD__RETURN_TYPE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD__NAME = 1;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD__PARAMETERS = 2;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD__BODY = 3;

  /**
   * The number of structural features of the '<em>Method</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link no.hal.jex.jextest.jexTest.impl.ParameterListImpl <em>Parameter List</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see no.hal.jex.jextest.jexTest.impl.ParameterListImpl
   * @see no.hal.jex.jextest.jexTest.impl.JexTestPackageImpl#getParameterList()
   * @generated
   */
  int PARAMETER_LIST = 23;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_LIST__PARAMETERS = 0;

  /**
   * The number of structural features of the '<em>Parameter List</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_LIST_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link no.hal.jex.jextest.jexTest.impl.ParameterImpl <em>Parameter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see no.hal.jex.jextest.jexTest.impl.ParameterImpl
   * @see no.hal.jex.jextest.jexTest.impl.JexTestPackageImpl#getParameter()
   * @generated
   */
  int PARAMETER = 24;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER__TYPE = 0;

  /**
   * The feature id for the '<em><b>Vararg</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER__VARARG = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER__NAME = 2;

  /**
   * The number of structural features of the '<em>Parameter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link no.hal.jex.jextest.jexTest.impl.TestedClassImpl <em>Tested Class</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see no.hal.jex.jextest.jexTest.impl.TestedClassImpl
   * @see no.hal.jex.jextest.jexTest.impl.JexTestPackageImpl#getTestedClass()
   * @generated
   */
  int TESTED_CLASS = 25;

  /**
   * The feature id for the '<em><b>Interface</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TESTED_CLASS__INTERFACE = 0;

  /**
   * The feature id for the '<em><b>Abstract</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TESTED_CLASS__ABSTRACT = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TESTED_CLASS__NAME = 2;

  /**
   * The feature id for the '<em><b>Super Class</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TESTED_CLASS__SUPER_CLASS = 3;

  /**
   * The feature id for the '<em><b>Super Interfaces</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TESTED_CLASS__SUPER_INTERFACES = 4;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TESTED_CLASS__DESCRIPTION = 5;

  /**
   * The feature id for the '<em><b>Invariant</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TESTED_CLASS__INVARIANT = 6;

  /**
   * The feature id for the '<em><b>Methods</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TESTED_CLASS__METHODS = 7;

  /**
   * The number of structural features of the '<em>Tested Class</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TESTED_CLASS_FEATURE_COUNT = 8;

  /**
   * The meta object id for the '{@link no.hal.jex.jextest.jexTest.impl.TestedOperationImpl <em>Tested Operation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see no.hal.jex.jextest.jexTest.impl.TestedOperationImpl
   * @see no.hal.jex.jextest.jexTest.impl.JexTestPackageImpl#getTestedOperation()
   * @generated
   */
  int TESTED_OPERATION = 26;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TESTED_OPERATION__PARAMETERS = 0;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TESTED_OPERATION__DESCRIPTION = 1;

  /**
   * The feature id for the '<em><b>Pre Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TESTED_OPERATION__PRE_EXPRESSION = 2;

  /**
   * The feature id for the '<em><b>Post Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TESTED_OPERATION__POST_EXPRESSION = 3;

  /**
   * The number of structural features of the '<em>Tested Operation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TESTED_OPERATION_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link no.hal.jex.jextest.jexTest.impl.TestedConstructorImpl <em>Tested Constructor</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see no.hal.jex.jextest.jexTest.impl.TestedConstructorImpl
   * @see no.hal.jex.jextest.jexTest.impl.JexTestPackageImpl#getTestedConstructor()
   * @generated
   */
  int TESTED_CONSTRUCTOR = 27;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TESTED_CONSTRUCTOR__PARAMETERS = TESTED_OPERATION__PARAMETERS;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TESTED_CONSTRUCTOR__DESCRIPTION = TESTED_OPERATION__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Pre Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TESTED_CONSTRUCTOR__PRE_EXPRESSION = TESTED_OPERATION__PRE_EXPRESSION;

  /**
   * The feature id for the '<em><b>Post Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TESTED_CONSTRUCTOR__POST_EXPRESSION = TESTED_OPERATION__POST_EXPRESSION;

  /**
   * The number of structural features of the '<em>Tested Constructor</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TESTED_CONSTRUCTOR_FEATURE_COUNT = TESTED_OPERATION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link no.hal.jex.jextest.jexTest.impl.TestedMethodImpl <em>Tested Method</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see no.hal.jex.jextest.jexTest.impl.TestedMethodImpl
   * @see no.hal.jex.jextest.jexTest.impl.JexTestPackageImpl#getTestedMethod()
   * @generated
   */
  int TESTED_METHOD = 28;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TESTED_METHOD__PARAMETERS = TESTED_OPERATION__PARAMETERS;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TESTED_METHOD__DESCRIPTION = TESTED_OPERATION__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Pre Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TESTED_METHOD__PRE_EXPRESSION = TESTED_OPERATION__PRE_EXPRESSION;

  /**
   * The feature id for the '<em><b>Post Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TESTED_METHOD__POST_EXPRESSION = TESTED_OPERATION__POST_EXPRESSION;

  /**
   * The feature id for the '<em><b>Abstract</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TESTED_METHOD__ABSTRACT = TESTED_OPERATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Return Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TESTED_METHOD__RETURN_TYPE = TESTED_OPERATION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TESTED_METHOD__NAME = TESTED_OPERATION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Tested Method</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TESTED_METHOD_FEATURE_COUNT = TESTED_OPERATION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link no.hal.jex.jextest.jexTest.impl.PropertiesTestImpl <em>Properties Test</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see no.hal.jex.jextest.jexTest.impl.PropertiesTestImpl
   * @see no.hal.jex.jextest.jexTest.impl.JexTestPackageImpl#getPropertiesTest()
   * @generated
   */
  int PROPERTIES_TEST = 29;

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
   * Returns the meta object for class '{@link no.hal.jex.jextest.jexTest.JexTestSuite <em>Suite</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Suite</em>'.
   * @see no.hal.jex.jextest.jexTest.JexTestSuite
   * @generated
   */
  EClass getJexTestSuite();

  /**
   * Returns the meta object for the attribute '{@link no.hal.jex.jextest.jexTest.JexTestSuite#getSuiteClassName <em>Suite Class Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Suite Class Name</em>'.
   * @see no.hal.jex.jextest.jexTest.JexTestSuite#getSuiteClassName()
   * @see #getJexTestSuite()
   * @generated
   */
  EAttribute getJexTestSuite_SuiteClassName();

  /**
   * Returns the meta object for the containment reference list '{@link no.hal.jex.jextest.jexTest.JexTestSuite#getTestCases <em>Test Cases</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Test Cases</em>'.
   * @see no.hal.jex.jextest.jexTest.JexTestSuite#getTestCases()
   * @see #getJexTestSuite()
   * @generated
   */
  EReference getJexTestSuite_TestCases();

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
   * Returns the meta object for the containment reference list '{@link no.hal.jex.jextest.jexTest.JexTestCase#getTestedClasses <em>Tested Classes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Tested Classes</em>'.
   * @see no.hal.jex.jextest.jexTest.JexTestCase#getTestedClasses()
   * @see #getJexTestCase()
   * @generated
   */
  EReference getJexTestCase_TestedClasses();

  /**
   * Returns the meta object for the containment reference '{@link no.hal.jex.jextest.jexTest.JexTestCase#getTestedClassRef <em>Tested Class Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Tested Class Ref</em>'.
   * @see no.hal.jex.jextest.jexTest.JexTestCase#getTestedClassRef()
   * @see #getJexTestCase()
   * @generated
   */
  EReference getJexTestCase_TestedClassRef();

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
   * Returns the meta object for class '{@link no.hal.jex.jextest.jexTest.TestMemberContext <em>Test Member Context</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Test Member Context</em>'.
   * @see no.hal.jex.jextest.jexTest.TestMemberContext
   * @generated
   */
  EClass getTestMemberContext();

  /**
   * Returns the meta object for the containment reference '{@link no.hal.jex.jextest.jexTest.TestMemberContext#getImportSection <em>Import Section</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Import Section</em>'.
   * @see no.hal.jex.jextest.jexTest.TestMemberContext#getImportSection()
   * @see #getTestMemberContext()
   * @generated
   */
  EReference getTestMemberContext_ImportSection();

  /**
   * Returns the meta object for the containment reference list '{@link no.hal.jex.jextest.jexTest.TestMemberContext#getInstances <em>Instances</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Instances</em>'.
   * @see no.hal.jex.jextest.jexTest.TestMemberContext#getInstances()
   * @see #getTestMemberContext()
   * @generated
   */
  EReference getTestMemberContext_Instances();

  /**
   * Returns the meta object for the containment reference list '{@link no.hal.jex.jextest.jexTest.TestMemberContext#getStateFunctions <em>State Functions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>State Functions</em>'.
   * @see no.hal.jex.jextest.jexTest.TestMemberContext#getStateFunctions()
   * @see #getTestMemberContext()
   * @generated
   */
  EReference getTestMemberContext_StateFunctions();

  /**
   * Returns the meta object for the containment reference list '{@link no.hal.jex.jextest.jexTest.TestMemberContext#getMethods <em>Methods</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Methods</em>'.
   * @see no.hal.jex.jextest.jexTest.TestMemberContext#getMethods()
   * @see #getTestMemberContext()
   * @generated
   */
  EReference getTestMemberContext_Methods();

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
   * Returns the meta object for the containment reference list '{@link no.hal.jex.jextest.jexTest.JexTestSequence#getTested <em>Tested</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Tested</em>'.
   * @see no.hal.jex.jextest.jexTest.JexTestSequence#getTested()
   * @see #getJexTestSequence()
   * @generated
   */
  EReference getJexTestSequence_Tested();

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
   * Returns the meta object for class '{@link no.hal.jex.jextest.jexTest.JvmOperationRef <em>Jvm Operation Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Jvm Operation Ref</em>'.
   * @see no.hal.jex.jextest.jexTest.JvmOperationRef
   * @generated
   */
  EClass getJvmOperationRef();

  /**
   * Returns the meta object for the attribute '{@link no.hal.jex.jextest.jexTest.JvmOperationRef#getMethodName <em>Method Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Method Name</em>'.
   * @see no.hal.jex.jextest.jexTest.JvmOperationRef#getMethodName()
   * @see #getJvmOperationRef()
   * @generated
   */
  EAttribute getJvmOperationRef_MethodName();

  /**
   * Returns the meta object for the containment reference list '{@link no.hal.jex.jextest.jexTest.JvmOperationRef#getParameterTypes <em>Parameter Types</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parameter Types</em>'.
   * @see no.hal.jex.jextest.jexTest.JvmOperationRef#getParameterTypes()
   * @see #getJvmOperationRef()
   * @generated
   */
  EReference getJvmOperationRef_ParameterTypes();

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
   * Returns the meta object for the containment reference list '{@link no.hal.jex.jextest.jexTest.Transition#getEffects <em>Effects</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Effects</em>'.
   * @see no.hal.jex.jextest.jexTest.Transition#getEffects()
   * @see #getTransition()
   * @generated
   */
  EReference getTransition_Effects();

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
   * Returns the meta object for class '{@link no.hal.jex.jextest.jexTest.TransitionEffect2 <em>Transition Effect2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Transition Effect2</em>'.
   * @see no.hal.jex.jextest.jexTest.TransitionEffect2
   * @generated
   */
  EClass getTransitionEffect2();

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
   * Returns the meta object for class '{@link no.hal.jex.jextest.jexTest.TransitionCallbackEffect <em>Transition Callback Effect</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Transition Callback Effect</em>'.
   * @see no.hal.jex.jextest.jexTest.TransitionCallbackEffect
   * @generated
   */
  EClass getTransitionCallbackEffect();

  /**
   * Returns the meta object for the reference '{@link no.hal.jex.jextest.jexTest.TransitionCallbackEffect#getInstance <em>Instance</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Instance</em>'.
   * @see no.hal.jex.jextest.jexTest.TransitionCallbackEffect#getInstance()
   * @see #getTransitionCallbackEffect()
   * @generated
   */
  EReference getTransitionCallbackEffect_Instance();

  /**
   * Returns the meta object for the containment reference '{@link no.hal.jex.jextest.jexTest.TransitionCallbackEffect#getCallbackClass <em>Callback Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Callback Class</em>'.
   * @see no.hal.jex.jextest.jexTest.TransitionCallbackEffect#getCallbackClass()
   * @see #getTransitionCallbackEffect()
   * @generated
   */
  EReference getTransitionCallbackEffect_CallbackClass();

  /**
   * Returns the meta object for the attribute '{@link no.hal.jex.jextest.jexTest.TransitionCallbackEffect#getMethodName <em>Method Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Method Name</em>'.
   * @see no.hal.jex.jextest.jexTest.TransitionCallbackEffect#getMethodName()
   * @see #getTransitionCallbackEffect()
   * @generated
   */
  EAttribute getTransitionCallbackEffect_MethodName();

  /**
   * Returns the meta object for the containment reference '{@link no.hal.jex.jextest.jexTest.TransitionCallbackEffect#getParameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Parameters</em>'.
   * @see no.hal.jex.jextest.jexTest.TransitionCallbackEffect#getParameters()
   * @see #getTransitionCallbackEffect()
   * @generated
   */
  EReference getTransitionCallbackEffect_Parameters();

  /**
   * Returns the meta object for the containment reference '{@link no.hal.jex.jextest.jexTest.TransitionCallbackEffect#getArguments <em>Arguments</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Arguments</em>'.
   * @see no.hal.jex.jextest.jexTest.TransitionCallbackEffect#getArguments()
   * @see #getTransitionCallbackEffect()
   * @generated
   */
  EReference getTransitionCallbackEffect_Arguments();

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
   * Returns the meta object for the containment reference '{@link no.hal.jex.jextest.jexTest.Method#getParameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Parameters</em>'.
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
   * Returns the meta object for class '{@link no.hal.jex.jextest.jexTest.ParameterList <em>Parameter List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parameter List</em>'.
   * @see no.hal.jex.jextest.jexTest.ParameterList
   * @generated
   */
  EClass getParameterList();

  /**
   * Returns the meta object for the containment reference list '{@link no.hal.jex.jextest.jexTest.ParameterList#getParameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parameters</em>'.
   * @see no.hal.jex.jextest.jexTest.ParameterList#getParameters()
   * @see #getParameterList()
   * @generated
   */
  EReference getParameterList_Parameters();

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
   * Returns the meta object for the attribute '{@link no.hal.jex.jextest.jexTest.Parameter#isVararg <em>Vararg</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Vararg</em>'.
   * @see no.hal.jex.jextest.jexTest.Parameter#isVararg()
   * @see #getParameter()
   * @generated
   */
  EAttribute getParameter_Vararg();

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
   * Returns the meta object for class '{@link no.hal.jex.jextest.jexTest.TestedClass <em>Tested Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Tested Class</em>'.
   * @see no.hal.jex.jextest.jexTest.TestedClass
   * @generated
   */
  EClass getTestedClass();

  /**
   * Returns the meta object for the attribute '{@link no.hal.jex.jextest.jexTest.TestedClass#isInterface <em>Interface</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Interface</em>'.
   * @see no.hal.jex.jextest.jexTest.TestedClass#isInterface()
   * @see #getTestedClass()
   * @generated
   */
  EAttribute getTestedClass_Interface();

  /**
   * Returns the meta object for the attribute '{@link no.hal.jex.jextest.jexTest.TestedClass#isAbstract <em>Abstract</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Abstract</em>'.
   * @see no.hal.jex.jextest.jexTest.TestedClass#isAbstract()
   * @see #getTestedClass()
   * @generated
   */
  EAttribute getTestedClass_Abstract();

  /**
   * Returns the meta object for the attribute '{@link no.hal.jex.jextest.jexTest.TestedClass#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see no.hal.jex.jextest.jexTest.TestedClass#getName()
   * @see #getTestedClass()
   * @generated
   */
  EAttribute getTestedClass_Name();

  /**
   * Returns the meta object for the containment reference '{@link no.hal.jex.jextest.jexTest.TestedClass#getSuperClass <em>Super Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Super Class</em>'.
   * @see no.hal.jex.jextest.jexTest.TestedClass#getSuperClass()
   * @see #getTestedClass()
   * @generated
   */
  EReference getTestedClass_SuperClass();

  /**
   * Returns the meta object for the containment reference list '{@link no.hal.jex.jextest.jexTest.TestedClass#getSuperInterfaces <em>Super Interfaces</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Super Interfaces</em>'.
   * @see no.hal.jex.jextest.jexTest.TestedClass#getSuperInterfaces()
   * @see #getTestedClass()
   * @generated
   */
  EReference getTestedClass_SuperInterfaces();

  /**
   * Returns the meta object for the attribute '{@link no.hal.jex.jextest.jexTest.TestedClass#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see no.hal.jex.jextest.jexTest.TestedClass#getDescription()
   * @see #getTestedClass()
   * @generated
   */
  EAttribute getTestedClass_Description();

  /**
   * Returns the meta object for the containment reference '{@link no.hal.jex.jextest.jexTest.TestedClass#getInvariant <em>Invariant</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Invariant</em>'.
   * @see no.hal.jex.jextest.jexTest.TestedClass#getInvariant()
   * @see #getTestedClass()
   * @generated
   */
  EReference getTestedClass_Invariant();

  /**
   * Returns the meta object for the containment reference list '{@link no.hal.jex.jextest.jexTest.TestedClass#getMethods <em>Methods</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Methods</em>'.
   * @see no.hal.jex.jextest.jexTest.TestedClass#getMethods()
   * @see #getTestedClass()
   * @generated
   */
  EReference getTestedClass_Methods();

  /**
   * Returns the meta object for class '{@link no.hal.jex.jextest.jexTest.TestedOperation <em>Tested Operation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Tested Operation</em>'.
   * @see no.hal.jex.jextest.jexTest.TestedOperation
   * @generated
   */
  EClass getTestedOperation();

  /**
   * Returns the meta object for the containment reference '{@link no.hal.jex.jextest.jexTest.TestedOperation#getParameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Parameters</em>'.
   * @see no.hal.jex.jextest.jexTest.TestedOperation#getParameters()
   * @see #getTestedOperation()
   * @generated
   */
  EReference getTestedOperation_Parameters();

  /**
   * Returns the meta object for the attribute '{@link no.hal.jex.jextest.jexTest.TestedOperation#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see no.hal.jex.jextest.jexTest.TestedOperation#getDescription()
   * @see #getTestedOperation()
   * @generated
   */
  EAttribute getTestedOperation_Description();

  /**
   * Returns the meta object for the containment reference '{@link no.hal.jex.jextest.jexTest.TestedOperation#getPreExpression <em>Pre Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Pre Expression</em>'.
   * @see no.hal.jex.jextest.jexTest.TestedOperation#getPreExpression()
   * @see #getTestedOperation()
   * @generated
   */
  EReference getTestedOperation_PreExpression();

  /**
   * Returns the meta object for the containment reference '{@link no.hal.jex.jextest.jexTest.TestedOperation#getPostExpression <em>Post Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Post Expression</em>'.
   * @see no.hal.jex.jextest.jexTest.TestedOperation#getPostExpression()
   * @see #getTestedOperation()
   * @generated
   */
  EReference getTestedOperation_PostExpression();

  /**
   * Returns the meta object for class '{@link no.hal.jex.jextest.jexTest.TestedConstructor <em>Tested Constructor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Tested Constructor</em>'.
   * @see no.hal.jex.jextest.jexTest.TestedConstructor
   * @generated
   */
  EClass getTestedConstructor();

  /**
   * Returns the meta object for class '{@link no.hal.jex.jextest.jexTest.TestedMethod <em>Tested Method</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Tested Method</em>'.
   * @see no.hal.jex.jextest.jexTest.TestedMethod
   * @generated
   */
  EClass getTestedMethod();

  /**
   * Returns the meta object for the attribute '{@link no.hal.jex.jextest.jexTest.TestedMethod#isAbstract <em>Abstract</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Abstract</em>'.
   * @see no.hal.jex.jextest.jexTest.TestedMethod#isAbstract()
   * @see #getTestedMethod()
   * @generated
   */
  EAttribute getTestedMethod_Abstract();

  /**
   * Returns the meta object for the containment reference '{@link no.hal.jex.jextest.jexTest.TestedMethod#getReturnType <em>Return Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Return Type</em>'.
   * @see no.hal.jex.jextest.jexTest.TestedMethod#getReturnType()
   * @see #getTestedMethod()
   * @generated
   */
  EReference getTestedMethod_ReturnType();

  /**
   * Returns the meta object for the attribute '{@link no.hal.jex.jextest.jexTest.TestedMethod#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see no.hal.jex.jextest.jexTest.TestedMethod#getName()
   * @see #getTestedMethod()
   * @generated
   */
  EAttribute getTestedMethod_Name();

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
     * The meta object literal for the '{@link no.hal.jex.jextest.jexTest.impl.JexTestSuiteImpl <em>Suite</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see no.hal.jex.jextest.jexTest.impl.JexTestSuiteImpl
     * @see no.hal.jex.jextest.jexTest.impl.JexTestPackageImpl#getJexTestSuite()
     * @generated
     */
    EClass JEX_TEST_SUITE = eINSTANCE.getJexTestSuite();

    /**
     * The meta object literal for the '<em><b>Suite Class Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute JEX_TEST_SUITE__SUITE_CLASS_NAME = eINSTANCE.getJexTestSuite_SuiteClassName();

    /**
     * The meta object literal for the '<em><b>Test Cases</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference JEX_TEST_SUITE__TEST_CASES = eINSTANCE.getJexTestSuite_TestCases();

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
     * The meta object literal for the '<em><b>Tested Classes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference JEX_TEST_CASE__TESTED_CLASSES = eINSTANCE.getJexTestCase_TestedClasses();

    /**
     * The meta object literal for the '<em><b>Tested Class Ref</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference JEX_TEST_CASE__TESTED_CLASS_REF = eINSTANCE.getJexTestCase_TestedClassRef();

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
     * The meta object literal for the '<em><b>Test Sequences</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference JEX_TEST_CASE__TEST_SEQUENCES = eINSTANCE.getJexTestCase_TestSequences();

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
     * The meta object literal for the '{@link no.hal.jex.jextest.jexTest.impl.TestMemberContextImpl <em>Test Member Context</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see no.hal.jex.jextest.jexTest.impl.TestMemberContextImpl
     * @see no.hal.jex.jextest.jexTest.impl.JexTestPackageImpl#getTestMemberContext()
     * @generated
     */
    EClass TEST_MEMBER_CONTEXT = eINSTANCE.getTestMemberContext();

    /**
     * The meta object literal for the '<em><b>Import Section</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TEST_MEMBER_CONTEXT__IMPORT_SECTION = eINSTANCE.getTestMemberContext_ImportSection();

    /**
     * The meta object literal for the '<em><b>Instances</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TEST_MEMBER_CONTEXT__INSTANCES = eINSTANCE.getTestMemberContext_Instances();

    /**
     * The meta object literal for the '<em><b>State Functions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TEST_MEMBER_CONTEXT__STATE_FUNCTIONS = eINSTANCE.getTestMemberContext_StateFunctions();

    /**
     * The meta object literal for the '<em><b>Methods</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TEST_MEMBER_CONTEXT__METHODS = eINSTANCE.getTestMemberContext_Methods();

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
     * The meta object literal for the '<em><b>Tested</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference JEX_TEST_SEQUENCE__TESTED = eINSTANCE.getJexTestSequence_Tested();

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
     * The meta object literal for the '{@link no.hal.jex.jextest.jexTest.impl.JvmOperationRefImpl <em>Jvm Operation Ref</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see no.hal.jex.jextest.jexTest.impl.JvmOperationRefImpl
     * @see no.hal.jex.jextest.jexTest.impl.JexTestPackageImpl#getJvmOperationRef()
     * @generated
     */
    EClass JVM_OPERATION_REF = eINSTANCE.getJvmOperationRef();

    /**
     * The meta object literal for the '<em><b>Method Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute JVM_OPERATION_REF__METHOD_NAME = eINSTANCE.getJvmOperationRef_MethodName();

    /**
     * The meta object literal for the '<em><b>Parameter Types</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference JVM_OPERATION_REF__PARAMETER_TYPES = eINSTANCE.getJvmOperationRef_ParameterTypes();

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
     * The meta object literal for the '<em><b>Effects</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRANSITION__EFFECTS = eINSTANCE.getTransition_Effects();

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
     * The meta object literal for the '{@link no.hal.jex.jextest.jexTest.impl.TransitionEffect2Impl <em>Transition Effect2</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see no.hal.jex.jextest.jexTest.impl.TransitionEffect2Impl
     * @see no.hal.jex.jextest.jexTest.impl.JexTestPackageImpl#getTransitionEffect2()
     * @generated
     */
    EClass TRANSITION_EFFECT2 = eINSTANCE.getTransitionEffect2();

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
     * The meta object literal for the '{@link no.hal.jex.jextest.jexTest.impl.TransitionCallbackEffectImpl <em>Transition Callback Effect</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see no.hal.jex.jextest.jexTest.impl.TransitionCallbackEffectImpl
     * @see no.hal.jex.jextest.jexTest.impl.JexTestPackageImpl#getTransitionCallbackEffect()
     * @generated
     */
    EClass TRANSITION_CALLBACK_EFFECT = eINSTANCE.getTransitionCallbackEffect();

    /**
     * The meta object literal for the '<em><b>Instance</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRANSITION_CALLBACK_EFFECT__INSTANCE = eINSTANCE.getTransitionCallbackEffect_Instance();

    /**
     * The meta object literal for the '<em><b>Callback Class</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRANSITION_CALLBACK_EFFECT__CALLBACK_CLASS = eINSTANCE.getTransitionCallbackEffect_CallbackClass();

    /**
     * The meta object literal for the '<em><b>Method Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TRANSITION_CALLBACK_EFFECT__METHOD_NAME = eINSTANCE.getTransitionCallbackEffect_MethodName();

    /**
     * The meta object literal for the '<em><b>Parameters</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRANSITION_CALLBACK_EFFECT__PARAMETERS = eINSTANCE.getTransitionCallbackEffect_Parameters();

    /**
     * The meta object literal for the '<em><b>Arguments</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRANSITION_CALLBACK_EFFECT__ARGUMENTS = eINSTANCE.getTransitionCallbackEffect_Arguments();

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
     * The meta object literal for the '<em><b>Parameters</b></em>' containment reference feature.
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
     * The meta object literal for the '{@link no.hal.jex.jextest.jexTest.impl.ParameterListImpl <em>Parameter List</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see no.hal.jex.jextest.jexTest.impl.ParameterListImpl
     * @see no.hal.jex.jextest.jexTest.impl.JexTestPackageImpl#getParameterList()
     * @generated
     */
    EClass PARAMETER_LIST = eINSTANCE.getParameterList();

    /**
     * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARAMETER_LIST__PARAMETERS = eINSTANCE.getParameterList_Parameters();

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
     * The meta object literal for the '<em><b>Vararg</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARAMETER__VARARG = eINSTANCE.getParameter_Vararg();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARAMETER__NAME = eINSTANCE.getParameter_Name();

    /**
     * The meta object literal for the '{@link no.hal.jex.jextest.jexTest.impl.TestedClassImpl <em>Tested Class</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see no.hal.jex.jextest.jexTest.impl.TestedClassImpl
     * @see no.hal.jex.jextest.jexTest.impl.JexTestPackageImpl#getTestedClass()
     * @generated
     */
    EClass TESTED_CLASS = eINSTANCE.getTestedClass();

    /**
     * The meta object literal for the '<em><b>Interface</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TESTED_CLASS__INTERFACE = eINSTANCE.getTestedClass_Interface();

    /**
     * The meta object literal for the '<em><b>Abstract</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TESTED_CLASS__ABSTRACT = eINSTANCE.getTestedClass_Abstract();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TESTED_CLASS__NAME = eINSTANCE.getTestedClass_Name();

    /**
     * The meta object literal for the '<em><b>Super Class</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TESTED_CLASS__SUPER_CLASS = eINSTANCE.getTestedClass_SuperClass();

    /**
     * The meta object literal for the '<em><b>Super Interfaces</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TESTED_CLASS__SUPER_INTERFACES = eINSTANCE.getTestedClass_SuperInterfaces();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TESTED_CLASS__DESCRIPTION = eINSTANCE.getTestedClass_Description();

    /**
     * The meta object literal for the '<em><b>Invariant</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TESTED_CLASS__INVARIANT = eINSTANCE.getTestedClass_Invariant();

    /**
     * The meta object literal for the '<em><b>Methods</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TESTED_CLASS__METHODS = eINSTANCE.getTestedClass_Methods();

    /**
     * The meta object literal for the '{@link no.hal.jex.jextest.jexTest.impl.TestedOperationImpl <em>Tested Operation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see no.hal.jex.jextest.jexTest.impl.TestedOperationImpl
     * @see no.hal.jex.jextest.jexTest.impl.JexTestPackageImpl#getTestedOperation()
     * @generated
     */
    EClass TESTED_OPERATION = eINSTANCE.getTestedOperation();

    /**
     * The meta object literal for the '<em><b>Parameters</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TESTED_OPERATION__PARAMETERS = eINSTANCE.getTestedOperation_Parameters();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TESTED_OPERATION__DESCRIPTION = eINSTANCE.getTestedOperation_Description();

    /**
     * The meta object literal for the '<em><b>Pre Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TESTED_OPERATION__PRE_EXPRESSION = eINSTANCE.getTestedOperation_PreExpression();

    /**
     * The meta object literal for the '<em><b>Post Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TESTED_OPERATION__POST_EXPRESSION = eINSTANCE.getTestedOperation_PostExpression();

    /**
     * The meta object literal for the '{@link no.hal.jex.jextest.jexTest.impl.TestedConstructorImpl <em>Tested Constructor</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see no.hal.jex.jextest.jexTest.impl.TestedConstructorImpl
     * @see no.hal.jex.jextest.jexTest.impl.JexTestPackageImpl#getTestedConstructor()
     * @generated
     */
    EClass TESTED_CONSTRUCTOR = eINSTANCE.getTestedConstructor();

    /**
     * The meta object literal for the '{@link no.hal.jex.jextest.jexTest.impl.TestedMethodImpl <em>Tested Method</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see no.hal.jex.jextest.jexTest.impl.TestedMethodImpl
     * @see no.hal.jex.jextest.jexTest.impl.JexTestPackageImpl#getTestedMethod()
     * @generated
     */
    EClass TESTED_METHOD = eINSTANCE.getTestedMethod();

    /**
     * The meta object literal for the '<em><b>Abstract</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TESTED_METHOD__ABSTRACT = eINSTANCE.getTestedMethod_Abstract();

    /**
     * The meta object literal for the '<em><b>Return Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TESTED_METHOD__RETURN_TYPE = eINSTANCE.getTestedMethod_ReturnType();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TESTED_METHOD__NAME = eINSTANCE.getTestedMethod_Name();

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
