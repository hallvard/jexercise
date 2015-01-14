/**
 */
package no.hal.jex.jextest.jexTest.util;

import no.hal.jex.jextest.jexTest.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.eclipse.xtext.xbase.XBlockExpression;
import org.eclipse.xtext.xbase.XExpression;

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
 * @see no.hal.jex.jextest.jexTest.JexTestPackage
 * @generated
 */
public class JexTestSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static JexTestPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JexTestSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = JexTestPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
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
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case JexTestPackage.JEX_TEST_SUITE:
      {
        JexTestSuite jexTestSuite = (JexTestSuite)theEObject;
        T result = caseJexTestSuite(jexTestSuite);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JexTestPackage.JEX_TEST_CASE:
      {
        JexTestCase jexTestCase = (JexTestCase)theEObject;
        T result = caseJexTestCase(jexTestCase);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JexTestPackage.INSTANCE:
      {
        Instance instance = (Instance)theEObject;
        T result = caseInstance(instance);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JexTestPackage.STATE_TEST_CONTEXT:
      {
        StateTestContext stateTestContext = (StateTestContext)theEObject;
        T result = caseStateTestContext(stateTestContext);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JexTestPackage.PROPERTIES_TEST_OWNER:
      {
        PropertiesTestOwner propertiesTestOwner = (PropertiesTestOwner)theEObject;
        T result = casePropertiesTestOwner(propertiesTestOwner);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JexTestPackage.STATE_FUNCTION:
      {
        StateFunction stateFunction = (StateFunction)theEObject;
        T result = caseStateFunction(stateFunction);
        if (result == null) result = caseStateTestContext(stateFunction);
        if (result == null) result = casePropertiesTestOwner(stateFunction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JexTestPackage.JEX_TEST_SEQUENCE:
      {
        JexTestSequence jexTestSequence = (JexTestSequence)theEObject;
        T result = caseJexTestSequence(jexTestSequence);
        if (result == null) result = caseStateTestContext(jexTestSequence);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JexTestPackage.STATE:
      {
        State state = (State)theEObject;
        T result = caseState(state);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JexTestPackage.OBJECT_TEST:
      {
        ObjectTest objectTest = (ObjectTest)theEObject;
        T result = caseObjectTest(objectTest);
        if (result == null) result = casePropertiesTestOwner(objectTest);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JexTestPackage.TRANSITION:
      {
        Transition transition = (Transition)theEObject;
        T result = caseTransition(transition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JexTestPackage.TRANSITION_SOURCE:
      {
        TransitionSource transitionSource = (TransitionSource)theEObject;
        T result = caseTransitionSource(transitionSource);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JexTestPackage.TRANSITION_ACTION:
      {
        TransitionAction transitionAction = (TransitionAction)theEObject;
        T result = caseTransitionAction(transitionAction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JexTestPackage.TRANSITION_EXPRESSION_ACTION:
      {
        TransitionExpressionAction transitionExpressionAction = (TransitionExpressionAction)theEObject;
        T result = caseTransitionExpressionAction(transitionExpressionAction);
        if (result == null) result = caseTransitionAction(transitionExpressionAction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JexTestPackage.TRANSITION_INPUT_ACTION:
      {
        TransitionInputAction transitionInputAction = (TransitionInputAction)theEObject;
        T result = caseTransitionInputAction(transitionInputAction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JexTestPackage.TRANSITION_EFFECT:
      {
        TransitionEffect transitionEffect = (TransitionEffect)theEObject;
        T result = caseTransitionEffect(transitionEffect);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JexTestPackage.TRANSITION_TARGET_EFFECT:
      {
        TransitionTargetEffect transitionTargetEffect = (TransitionTargetEffect)theEObject;
        T result = caseTransitionTargetEffect(transitionTargetEffect);
        if (result == null) result = caseTransitionEffect(transitionTargetEffect);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JexTestPackage.TRANSITION_EXCEPTION_EFFECT:
      {
        TransitionExceptionEffect transitionExceptionEffect = (TransitionExceptionEffect)theEObject;
        T result = caseTransitionExceptionEffect(transitionExceptionEffect);
        if (result == null) result = caseTransitionEffect(transitionExceptionEffect);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JexTestPackage.TRANSITION_OUTPUT_EFFECT:
      {
        TransitionOutputEffect transitionOutputEffect = (TransitionOutputEffect)theEObject;
        T result = caseTransitionOutputEffect(transitionOutputEffect);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JexTestPackage.METHOD:
      {
        Method method = (Method)theEObject;
        T result = caseMethod(method);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JexTestPackage.PARAMETER:
      {
        Parameter parameter = (Parameter)theEObject;
        T result = caseParameter(parameter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JexTestPackage.TESTED_CLASS:
      {
        TestedClass testedClass = (TestedClass)theEObject;
        T result = caseTestedClass(testedClass);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JexTestPackage.TESTED_OPERATION:
      {
        TestedOperation testedOperation = (TestedOperation)theEObject;
        T result = caseTestedOperation(testedOperation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JexTestPackage.TESTED_CONSTRUCTOR:
      {
        TestedConstructor testedConstructor = (TestedConstructor)theEObject;
        T result = caseTestedConstructor(testedConstructor);
        if (result == null) result = caseTestedOperation(testedConstructor);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JexTestPackage.TESTED_METHOD:
      {
        TestedMethod testedMethod = (TestedMethod)theEObject;
        T result = caseTestedMethod(testedMethod);
        if (result == null) result = caseTestedOperation(testedMethod);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JexTestPackage.PROPERTIES_TEST:
      {
        PropertiesTest propertiesTest = (PropertiesTest)theEObject;
        T result = casePropertiesTest(propertiesTest);
        if (result == null) result = caseXBlockExpression(propertiesTest);
        if (result == null) result = caseXExpression(propertiesTest);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Suite</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Suite</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseJexTestSuite(JexTestSuite object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Case</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Case</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseJexTestCase(JexTestCase object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Instance</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Instance</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInstance(Instance object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>State Test Context</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>State Test Context</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStateTestContext(StateTestContext object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Properties Test Owner</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Properties Test Owner</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePropertiesTestOwner(PropertiesTestOwner object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>State Function</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>State Function</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStateFunction(StateFunction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Sequence</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Sequence</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseJexTestSequence(JexTestSequence object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>State</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>State</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseState(State object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Object Test</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Object Test</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseObjectTest(ObjectTest object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Transition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Transition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTransition(Transition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Transition Source</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Transition Source</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTransitionSource(TransitionSource object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Transition Action</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Transition Action</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTransitionAction(TransitionAction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Transition Expression Action</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Transition Expression Action</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTransitionExpressionAction(TransitionExpressionAction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Transition Input Action</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Transition Input Action</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTransitionInputAction(TransitionInputAction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Transition Effect</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Transition Effect</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTransitionEffect(TransitionEffect object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Transition Target Effect</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Transition Target Effect</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTransitionTargetEffect(TransitionTargetEffect object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Transition Exception Effect</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Transition Exception Effect</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTransitionExceptionEffect(TransitionExceptionEffect object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Transition Output Effect</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Transition Output Effect</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTransitionOutputEffect(TransitionOutputEffect object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Method</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Method</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMethod(Method object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Parameter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Parameter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseParameter(Parameter object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Tested Class</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Tested Class</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTestedClass(TestedClass object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Tested Operation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Tested Operation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTestedOperation(TestedOperation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Tested Constructor</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Tested Constructor</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTestedConstructor(TestedConstructor object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Tested Method</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Tested Method</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTestedMethod(TestedMethod object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Properties Test</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Properties Test</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePropertiesTest(PropertiesTest object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>XExpression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>XExpression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseXExpression(XExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>XBlock Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>XBlock Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseXBlockExpression(XBlockExpression object)
  {
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
  public T defaultCase(EObject object)
  {
    return null;
  }

} //JexTestSwitch
