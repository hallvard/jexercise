/**
 */
package no.hal.jex.jextest.jexTest.impl;

import no.hal.jex.jextest.jexTest.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class JexTestFactoryImpl extends EFactoryImpl implements JexTestFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static JexTestFactory init()
  {
    try
    {
      JexTestFactory theJexTestFactory = (JexTestFactory)EPackage.Registry.INSTANCE.getEFactory(JexTestPackage.eNS_URI);
      if (theJexTestFactory != null)
      {
        return theJexTestFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new JexTestFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JexTestFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case JexTestPackage.JEX_TEST_SUITE: return createJexTestSuite();
      case JexTestPackage.JEX_TEST_CASE: return createJexTestCase();
      case JexTestPackage.INSTANCE: return createInstance();
      case JexTestPackage.STATE_TEST_CONTEXT: return createStateTestContext();
      case JexTestPackage.PROPERTIES_TEST_OWNER: return createPropertiesTestOwner();
      case JexTestPackage.STATE_FUNCTION: return createStateFunction();
      case JexTestPackage.JEX_TEST_SEQUENCE: return createJexTestSequence();
      case JexTestPackage.STATE: return createState();
      case JexTestPackage.OBJECT_TEST: return createObjectTest();
      case JexTestPackage.TRANSITION: return createTransition();
      case JexTestPackage.TRANSITION_SOURCE: return createTransitionSource();
      case JexTestPackage.TRANSITION_ACTION: return createTransitionAction();
      case JexTestPackage.TRANSITION_EXPRESSION_ACTION: return createTransitionExpressionAction();
      case JexTestPackage.TRANSITION_INPUT_ACTION: return createTransitionInputAction();
      case JexTestPackage.TRANSITION_EFFECT: return createTransitionEffect();
      case JexTestPackage.TRANSITION_TARGET_EFFECT: return createTransitionTargetEffect();
      case JexTestPackage.TRANSITION_EXCEPTION_EFFECT: return createTransitionExceptionEffect();
      case JexTestPackage.TRANSITION_OUTPUT_EFFECT: return createTransitionOutputEffect();
      case JexTestPackage.METHOD: return createMethod();
      case JexTestPackage.PARAMETER: return createParameter();
      case JexTestPackage.TESTED_CLASS: return createTestedClass();
      case JexTestPackage.TESTED_OPERATION: return createTestedOperation();
      case JexTestPackage.TESTED_CONSTRUCTOR: return createTestedConstructor();
      case JexTestPackage.TESTED_METHOD: return createTestedMethod();
      case JexTestPackage.PROPERTIES_TEST: return createPropertiesTest();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JexTestSuite createJexTestSuite()
  {
    JexTestSuiteImpl jexTestSuite = new JexTestSuiteImpl();
    return jexTestSuite;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JexTestCase createJexTestCase()
  {
    JexTestCaseImpl jexTestCase = new JexTestCaseImpl();
    return jexTestCase;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Instance createInstance()
  {
    InstanceImpl instance = new InstanceImpl();
    return instance;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StateTestContext createStateTestContext()
  {
    StateTestContextImpl stateTestContext = new StateTestContextImpl();
    return stateTestContext;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PropertiesTestOwner createPropertiesTestOwner()
  {
    PropertiesTestOwnerImpl propertiesTestOwner = new PropertiesTestOwnerImpl();
    return propertiesTestOwner;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StateFunction createStateFunction()
  {
    StateFunctionImpl stateFunction = new StateFunctionImpl();
    return stateFunction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JexTestSequence createJexTestSequence()
  {
    JexTestSequenceImpl jexTestSequence = new JexTestSequenceImpl();
    return jexTestSequence;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public State createState()
  {
    StateImpl state = new StateImpl();
    return state;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ObjectTest createObjectTest()
  {
    ObjectTestImpl objectTest = new ObjectTestImpl();
    return objectTest;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Transition createTransition()
  {
    TransitionImpl transition = new TransitionImpl();
    return transition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TransitionSource createTransitionSource()
  {
    TransitionSourceImpl transitionSource = new TransitionSourceImpl();
    return transitionSource;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TransitionAction createTransitionAction()
  {
    TransitionActionImpl transitionAction = new TransitionActionImpl();
    return transitionAction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TransitionExpressionAction createTransitionExpressionAction()
  {
    TransitionExpressionActionImpl transitionExpressionAction = new TransitionExpressionActionImpl();
    return transitionExpressionAction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TransitionInputAction createTransitionInputAction()
  {
    TransitionInputActionImpl transitionInputAction = new TransitionInputActionImpl();
    return transitionInputAction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TransitionEffect createTransitionEffect()
  {
    TransitionEffectImpl transitionEffect = new TransitionEffectImpl();
    return transitionEffect;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TransitionTargetEffect createTransitionTargetEffect()
  {
    TransitionTargetEffectImpl transitionTargetEffect = new TransitionTargetEffectImpl();
    return transitionTargetEffect;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TransitionExceptionEffect createTransitionExceptionEffect()
  {
    TransitionExceptionEffectImpl transitionExceptionEffect = new TransitionExceptionEffectImpl();
    return transitionExceptionEffect;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TransitionOutputEffect createTransitionOutputEffect()
  {
    TransitionOutputEffectImpl transitionOutputEffect = new TransitionOutputEffectImpl();
    return transitionOutputEffect;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Method createMethod()
  {
    MethodImpl method = new MethodImpl();
    return method;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Parameter createParameter()
  {
    ParameterImpl parameter = new ParameterImpl();
    return parameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TestedClass createTestedClass()
  {
    TestedClassImpl testedClass = new TestedClassImpl();
    return testedClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TestedOperation createTestedOperation()
  {
    TestedOperationImpl testedOperation = new TestedOperationImpl();
    return testedOperation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TestedConstructor createTestedConstructor()
  {
    TestedConstructorImpl testedConstructor = new TestedConstructorImpl();
    return testedConstructor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TestedMethod createTestedMethod()
  {
    TestedMethodImpl testedMethod = new TestedMethodImpl();
    return testedMethod;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PropertiesTest createPropertiesTest()
  {
    PropertiesTestImpl propertiesTest = new PropertiesTestImpl();
    return propertiesTest;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JexTestPackage getJexTestPackage()
  {
    return (JexTestPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static JexTestPackage getPackage()
  {
    return JexTestPackage.eINSTANCE;
  }

} //JexTestFactoryImpl
