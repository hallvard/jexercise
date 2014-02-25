/**
 */
package no.hal.jex.jextest.jexTest.impl;

import no.hal.jex.jextest.jexTest.Instance;
import no.hal.jex.jextest.jexTest.JexTestCase;
import no.hal.jex.jextest.jexTest.JexTestFactory;
import no.hal.jex.jextest.jexTest.JexTestPackage;
import no.hal.jex.jextest.jexTest.JexTestSequence;
import no.hal.jex.jextest.jexTest.Method;
import no.hal.jex.jextest.jexTest.ObjectTest;
import no.hal.jex.jextest.jexTest.Parameter;
import no.hal.jex.jextest.jexTest.PropertiesTest;
import no.hal.jex.jextest.jexTest.PropertiesTestOwner;
import no.hal.jex.jextest.jexTest.State;
import no.hal.jex.jextest.jexTest.StateFunction;
import no.hal.jex.jextest.jexTest.StateTestContext;
import no.hal.jex.jextest.jexTest.Transition;
import no.hal.jex.jextest.jexTest.TransitionAction;
import no.hal.jex.jextest.jexTest.TransitionEffect;
import no.hal.jex.jextest.jexTest.TransitionExceptionEffect;
import no.hal.jex.jextest.jexTest.TransitionExpressionAction;
import no.hal.jex.jextest.jexTest.TransitionInputAction;
import no.hal.jex.jextest.jexTest.TransitionOutputEffect;
import no.hal.jex.jextest.jexTest.TransitionSource;
import no.hal.jex.jextest.jexTest.TransitionTargetEffect;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.xtext.common.types.TypesPackage;

import org.eclipse.xtext.xbase.XbasePackage;

import org.eclipse.xtext.xtype.XtypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class JexTestPackageImpl extends EPackageImpl implements JexTestPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass jexTestCaseEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass instanceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass stateTestContextEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass propertiesTestOwnerEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass stateFunctionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass jexTestSequenceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass stateEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass objectTestEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass transitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass transitionSourceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass transitionActionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass transitionExpressionActionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass transitionInputActionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass transitionEffectEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass transitionTargetEffectEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass transitionExceptionEffectEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass transitionOutputEffectEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass methodEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass parameterEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass propertiesTestEClass = null;

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
   * @see no.hal.jex.jextest.jexTest.JexTestPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private JexTestPackageImpl()
  {
    super(eNS_URI, JexTestFactory.eINSTANCE);
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
   * <p>This method is used to initialize {@link JexTestPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static JexTestPackage init()
  {
    if (isInited) return (JexTestPackage)EPackage.Registry.INSTANCE.getEPackage(JexTestPackage.eNS_URI);

    // Obtain or create and register package
    JexTestPackageImpl theJexTestPackage = (JexTestPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof JexTestPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new JexTestPackageImpl());

    isInited = true;

    // Initialize simple dependencies
    XbasePackage.eINSTANCE.eClass();
    XtypePackage.eINSTANCE.eClass();

    // Create package meta-data objects
    theJexTestPackage.createPackageContents();

    // Initialize created meta-data
    theJexTestPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theJexTestPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(JexTestPackage.eNS_URI, theJexTestPackage);
    return theJexTestPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getJexTestCase()
  {
    return jexTestCaseEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getJexTestCase_TestedClass()
  {
    return (EReference)jexTestCaseEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getJexTestCase_TestClassName()
  {
    return (EAttribute)jexTestCaseEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getJexTestCase_Description()
  {
    return (EAttribute)jexTestCaseEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getJexTestCase_Url()
  {
    return (EAttribute)jexTestCaseEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getJexTestCase_ImportSection()
  {
    return (EReference)jexTestCaseEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getJexTestCase_Instances()
  {
    return (EReference)jexTestCaseEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getJexTestCase_StateFunctions()
  {
    return (EReference)jexTestCaseEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getJexTestCase_TestSequences()
  {
    return (EReference)jexTestCaseEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getJexTestCase_Methods()
  {
    return (EReference)jexTestCaseEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInstance()
  {
    return instanceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInstance_Type()
  {
    return (EReference)instanceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInstance_Name()
  {
    return (EAttribute)instanceEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInstance_Expr()
  {
    return (EReference)instanceEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStateTestContext()
  {
    return stateTestContextEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStateTestContext_Name()
  {
    return (EAttribute)stateTestContextEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStateTestContext_Description()
  {
    return (EAttribute)stateTestContextEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPropertiesTestOwner()
  {
    return propertiesTestOwnerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPropertiesTestOwner_Test()
  {
    return (EReference)propertiesTestOwnerEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStateFunction()
  {
    return stateFunctionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStateFunction_Type()
  {
    return (EReference)stateFunctionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStateFunction_Parameters()
  {
    return (EReference)stateFunctionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getJexTestSequence()
  {
    return jexTestSequenceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getJexTestSequence_Instances()
  {
    return (EReference)jexTestSequenceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getJexTestSequence_Transitions()
  {
    return (EReference)jexTestSequenceEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getState()
  {
    return stateEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getState_Name()
  {
    return (EAttribute)stateEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getState_Description()
  {
    return (EAttribute)stateEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getState_ObjectTests()
  {
    return (EReference)stateEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getObjectTest()
  {
    return objectTestEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getObjectTest_Instance()
  {
    return (EReference)objectTestEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTransition()
  {
    return transitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTransition_Source()
  {
    return (EReference)transitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTransition_Description()
  {
    return (EAttribute)transitionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTransition_Actions()
  {
    return (EReference)transitionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTransition_Effect()
  {
    return (EReference)transitionEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTransitionSource()
  {
    return transitionSourceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTransitionSource_State()
  {
    return (EReference)transitionSourceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTransitionSource_StateRef()
  {
    return (EReference)transitionSourceEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTransitionAction()
  {
    return transitionActionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTransitionExpressionAction()
  {
    return transitionExpressionActionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTransitionExpressionAction_Expr()
  {
    return (EReference)transitionExpressionActionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTransitionExpressionAction_Times()
  {
    return (EReference)transitionExpressionActionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTransitionInputAction()
  {
    return transitionInputActionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTransitionInputAction_Input()
  {
    return (EAttribute)transitionInputActionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTransitionEffect()
  {
    return transitionEffectEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTransitionTargetEffect()
  {
    return transitionTargetEffectEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTransitionTargetEffect_State()
  {
    return (EReference)transitionTargetEffectEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTransitionTargetEffect_StateRef()
  {
    return (EReference)transitionTargetEffectEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTransitionExceptionEffect()
  {
    return transitionExceptionEffectEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTransitionExceptionEffect_ExceptionClass()
  {
    return (EReference)transitionExceptionEffectEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTransitionOutputEffect()
  {
    return transitionOutputEffectEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTransitionOutputEffect_Pattern()
  {
    return (EAttribute)transitionOutputEffectEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMethod()
  {
    return methodEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMethod_Static()
  {
    return (EAttribute)methodEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMethod_ReturnType()
  {
    return (EReference)methodEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMethod_Name()
  {
    return (EAttribute)methodEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMethod_Parameters()
  {
    return (EReference)methodEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMethod_Body()
  {
    return (EReference)methodEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getParameter()
  {
    return parameterEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getParameter_Type()
  {
    return (EReference)parameterEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getParameter_Name()
  {
    return (EAttribute)parameterEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPropertiesTest()
  {
    return propertiesTestEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JexTestFactory getJexTestFactory()
  {
    return (JexTestFactory)getEFactoryInstance();
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
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    jexTestCaseEClass = createEClass(JEX_TEST_CASE);
    createEReference(jexTestCaseEClass, JEX_TEST_CASE__TESTED_CLASS);
    createEAttribute(jexTestCaseEClass, JEX_TEST_CASE__TEST_CLASS_NAME);
    createEAttribute(jexTestCaseEClass, JEX_TEST_CASE__DESCRIPTION);
    createEAttribute(jexTestCaseEClass, JEX_TEST_CASE__URL);
    createEReference(jexTestCaseEClass, JEX_TEST_CASE__IMPORT_SECTION);
    createEReference(jexTestCaseEClass, JEX_TEST_CASE__INSTANCES);
    createEReference(jexTestCaseEClass, JEX_TEST_CASE__STATE_FUNCTIONS);
    createEReference(jexTestCaseEClass, JEX_TEST_CASE__TEST_SEQUENCES);
    createEReference(jexTestCaseEClass, JEX_TEST_CASE__METHODS);

    instanceEClass = createEClass(INSTANCE);
    createEReference(instanceEClass, INSTANCE__TYPE);
    createEAttribute(instanceEClass, INSTANCE__NAME);
    createEReference(instanceEClass, INSTANCE__EXPR);

    stateTestContextEClass = createEClass(STATE_TEST_CONTEXT);
    createEAttribute(stateTestContextEClass, STATE_TEST_CONTEXT__NAME);
    createEAttribute(stateTestContextEClass, STATE_TEST_CONTEXT__DESCRIPTION);

    propertiesTestOwnerEClass = createEClass(PROPERTIES_TEST_OWNER);
    createEReference(propertiesTestOwnerEClass, PROPERTIES_TEST_OWNER__TEST);

    stateFunctionEClass = createEClass(STATE_FUNCTION);
    createEReference(stateFunctionEClass, STATE_FUNCTION__TYPE);
    createEReference(stateFunctionEClass, STATE_FUNCTION__PARAMETERS);

    jexTestSequenceEClass = createEClass(JEX_TEST_SEQUENCE);
    createEReference(jexTestSequenceEClass, JEX_TEST_SEQUENCE__INSTANCES);
    createEReference(jexTestSequenceEClass, JEX_TEST_SEQUENCE__TRANSITIONS);

    stateEClass = createEClass(STATE);
    createEAttribute(stateEClass, STATE__NAME);
    createEAttribute(stateEClass, STATE__DESCRIPTION);
    createEReference(stateEClass, STATE__OBJECT_TESTS);

    objectTestEClass = createEClass(OBJECT_TEST);
    createEReference(objectTestEClass, OBJECT_TEST__INSTANCE);

    transitionEClass = createEClass(TRANSITION);
    createEReference(transitionEClass, TRANSITION__SOURCE);
    createEAttribute(transitionEClass, TRANSITION__DESCRIPTION);
    createEReference(transitionEClass, TRANSITION__ACTIONS);
    createEReference(transitionEClass, TRANSITION__EFFECT);

    transitionSourceEClass = createEClass(TRANSITION_SOURCE);
    createEReference(transitionSourceEClass, TRANSITION_SOURCE__STATE);
    createEReference(transitionSourceEClass, TRANSITION_SOURCE__STATE_REF);

    transitionActionEClass = createEClass(TRANSITION_ACTION);

    transitionExpressionActionEClass = createEClass(TRANSITION_EXPRESSION_ACTION);
    createEReference(transitionExpressionActionEClass, TRANSITION_EXPRESSION_ACTION__EXPR);
    createEReference(transitionExpressionActionEClass, TRANSITION_EXPRESSION_ACTION__TIMES);

    transitionInputActionEClass = createEClass(TRANSITION_INPUT_ACTION);
    createEAttribute(transitionInputActionEClass, TRANSITION_INPUT_ACTION__INPUT);

    transitionEffectEClass = createEClass(TRANSITION_EFFECT);

    transitionTargetEffectEClass = createEClass(TRANSITION_TARGET_EFFECT);
    createEReference(transitionTargetEffectEClass, TRANSITION_TARGET_EFFECT__STATE);
    createEReference(transitionTargetEffectEClass, TRANSITION_TARGET_EFFECT__STATE_REF);

    transitionExceptionEffectEClass = createEClass(TRANSITION_EXCEPTION_EFFECT);
    createEReference(transitionExceptionEffectEClass, TRANSITION_EXCEPTION_EFFECT__EXCEPTION_CLASS);

    transitionOutputEffectEClass = createEClass(TRANSITION_OUTPUT_EFFECT);
    createEAttribute(transitionOutputEffectEClass, TRANSITION_OUTPUT_EFFECT__PATTERN);

    methodEClass = createEClass(METHOD);
    createEAttribute(methodEClass, METHOD__STATIC);
    createEReference(methodEClass, METHOD__RETURN_TYPE);
    createEAttribute(methodEClass, METHOD__NAME);
    createEReference(methodEClass, METHOD__PARAMETERS);
    createEReference(methodEClass, METHOD__BODY);

    parameterEClass = createEClass(PARAMETER);
    createEReference(parameterEClass, PARAMETER__TYPE);
    createEAttribute(parameterEClass, PARAMETER__NAME);

    propertiesTestEClass = createEClass(PROPERTIES_TEST);
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
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Obtain other dependent packages
    TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);
    XtypePackage theXtypePackage = (XtypePackage)EPackage.Registry.INSTANCE.getEPackage(XtypePackage.eNS_URI);
    XbasePackage theXbasePackage = (XbasePackage)EPackage.Registry.INSTANCE.getEPackage(XbasePackage.eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    stateFunctionEClass.getESuperTypes().add(this.getStateTestContext());
    stateFunctionEClass.getESuperTypes().add(this.getPropertiesTestOwner());
    jexTestSequenceEClass.getESuperTypes().add(this.getStateTestContext());
    objectTestEClass.getESuperTypes().add(this.getPropertiesTestOwner());
    transitionExpressionActionEClass.getESuperTypes().add(this.getTransitionAction());
    transitionInputActionEClass.getESuperTypes().add(this.getTransitionAction());
    transitionTargetEffectEClass.getESuperTypes().add(this.getTransitionEffect());
    transitionExceptionEffectEClass.getESuperTypes().add(this.getTransitionEffect());
    transitionOutputEffectEClass.getESuperTypes().add(this.getTransitionEffect());
    propertiesTestEClass.getESuperTypes().add(theXbasePackage.getXBlockExpression());

    // Initialize classes and features; add operations and parameters
    initEClass(jexTestCaseEClass, JexTestCase.class, "JexTestCase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getJexTestCase_TestedClass(), theTypesPackage.getJvmParameterizedTypeReference(), null, "testedClass", null, 0, 1, JexTestCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getJexTestCase_TestClassName(), ecorePackage.getEString(), "testClassName", null, 0, 1, JexTestCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getJexTestCase_Description(), ecorePackage.getEString(), "description", null, 0, 1, JexTestCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getJexTestCase_Url(), ecorePackage.getEString(), "url", null, 0, 1, JexTestCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getJexTestCase_ImportSection(), theXtypePackage.getXImportSection(), null, "importSection", null, 0, 1, JexTestCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getJexTestCase_Instances(), this.getInstance(), null, "instances", null, 0, -1, JexTestCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getJexTestCase_StateFunctions(), this.getStateFunction(), null, "stateFunctions", null, 0, -1, JexTestCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getJexTestCase_TestSequences(), this.getJexTestSequence(), null, "testSequences", null, 0, -1, JexTestCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getJexTestCase_Methods(), this.getMethod(), null, "methods", null, 0, -1, JexTestCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(instanceEClass, Instance.class, "Instance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getInstance_Type(), theTypesPackage.getJvmParameterizedTypeReference(), null, "type", null, 0, 1, Instance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getInstance_Name(), ecorePackage.getEString(), "name", null, 0, 1, Instance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInstance_Expr(), theXbasePackage.getXExpression(), null, "expr", null, 0, 1, Instance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(stateTestContextEClass, StateTestContext.class, "StateTestContext", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getStateTestContext_Name(), ecorePackage.getEString(), "name", null, 0, 1, StateTestContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getStateTestContext_Description(), ecorePackage.getEString(), "description", null, 0, 1, StateTestContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(propertiesTestOwnerEClass, PropertiesTestOwner.class, "PropertiesTestOwner", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPropertiesTestOwner_Test(), theXbasePackage.getXBlockExpression(), null, "test", null, 0, 1, PropertiesTestOwner.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(stateFunctionEClass, StateFunction.class, "StateFunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getStateFunction_Type(), theTypesPackage.getJvmParameterizedTypeReference(), null, "type", null, 0, 1, StateFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStateFunction_Parameters(), this.getParameter(), null, "parameters", null, 0, -1, StateFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(jexTestSequenceEClass, JexTestSequence.class, "JexTestSequence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getJexTestSequence_Instances(), this.getInstance(), null, "instances", null, 0, -1, JexTestSequence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getJexTestSequence_Transitions(), this.getTransition(), null, "transitions", null, 0, -1, JexTestSequence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(stateEClass, State.class, "State", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getState_Name(), ecorePackage.getEString(), "name", null, 0, 1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getState_Description(), ecorePackage.getEString(), "description", null, 0, 1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getState_ObjectTests(), this.getObjectTest(), null, "objectTests", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(objectTestEClass, ObjectTest.class, "ObjectTest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getObjectTest_Instance(), this.getInstance(), null, "instance", null, 0, 1, ObjectTest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(transitionEClass, Transition.class, "Transition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTransition_Source(), this.getTransitionSource(), null, "source", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTransition_Description(), ecorePackage.getEString(), "description", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTransition_Actions(), this.getTransitionAction(), null, "actions", null, 0, -1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTransition_Effect(), this.getTransitionEffect(), null, "effect", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(transitionSourceEClass, TransitionSource.class, "TransitionSource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTransitionSource_State(), this.getState(), null, "state", null, 0, 1, TransitionSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTransitionSource_StateRef(), this.getState(), null, "stateRef", null, 0, 1, TransitionSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(transitionActionEClass, TransitionAction.class, "TransitionAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(transitionExpressionActionEClass, TransitionExpressionAction.class, "TransitionExpressionAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTransitionExpressionAction_Expr(), theXbasePackage.getXExpression(), null, "expr", null, 0, 1, TransitionExpressionAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTransitionExpressionAction_Times(), theXbasePackage.getXExpression(), null, "times", null, 0, 1, TransitionExpressionAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(transitionInputActionEClass, TransitionInputAction.class, "TransitionInputAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTransitionInputAction_Input(), ecorePackage.getEString(), "input", null, 0, 1, TransitionInputAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(transitionEffectEClass, TransitionEffect.class, "TransitionEffect", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(transitionTargetEffectEClass, TransitionTargetEffect.class, "TransitionTargetEffect", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTransitionTargetEffect_State(), this.getState(), null, "state", null, 0, 1, TransitionTargetEffect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTransitionTargetEffect_StateRef(), this.getState(), null, "stateRef", null, 0, 1, TransitionTargetEffect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(transitionExceptionEffectEClass, TransitionExceptionEffect.class, "TransitionExceptionEffect", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTransitionExceptionEffect_ExceptionClass(), theTypesPackage.getJvmParameterizedTypeReference(), null, "exceptionClass", null, 0, 1, TransitionExceptionEffect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(transitionOutputEffectEClass, TransitionOutputEffect.class, "TransitionOutputEffect", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTransitionOutputEffect_Pattern(), ecorePackage.getEString(), "pattern", null, 0, 1, TransitionOutputEffect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(methodEClass, Method.class, "Method", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMethod_Static(), ecorePackage.getEBoolean(), "static", null, 0, 1, Method.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMethod_ReturnType(), theTypesPackage.getJvmParameterizedTypeReference(), null, "returnType", null, 0, 1, Method.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMethod_Name(), ecorePackage.getEString(), "name", null, 0, 1, Method.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMethod_Parameters(), this.getParameter(), null, "parameters", null, 0, -1, Method.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMethod_Body(), theXbasePackage.getXExpression(), null, "body", null, 0, 1, Method.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(parameterEClass, Parameter.class, "Parameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getParameter_Type(), theTypesPackage.getJvmParameterizedTypeReference(), null, "type", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getParameter_Name(), ecorePackage.getEString(), "name", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(propertiesTestEClass, PropertiesTest.class, "PropertiesTest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    // Create resource
    createResource(eNS_URI);
  }

} //JexTestPackageImpl
