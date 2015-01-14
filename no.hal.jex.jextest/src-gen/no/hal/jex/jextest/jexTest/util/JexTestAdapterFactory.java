/**
 */
package no.hal.jex.jextest.jexTest.util;

import no.hal.jex.jextest.jexTest.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.xtext.xbase.XBlockExpression;
import org.eclipse.xtext.xbase.XExpression;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see no.hal.jex.jextest.jexTest.JexTestPackage
 * @generated
 */
public class JexTestAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static JexTestPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JexTestAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = JexTestPackage.eINSTANCE;
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
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
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
  protected JexTestSwitch<Adapter> modelSwitch =
    new JexTestSwitch<Adapter>()
    {
      @Override
      public Adapter caseJexTestSuite(JexTestSuite object)
      {
        return createJexTestSuiteAdapter();
      }
      @Override
      public Adapter caseJexTestCase(JexTestCase object)
      {
        return createJexTestCaseAdapter();
      }
      @Override
      public Adapter caseInstance(Instance object)
      {
        return createInstanceAdapter();
      }
      @Override
      public Adapter caseStateTestContext(StateTestContext object)
      {
        return createStateTestContextAdapter();
      }
      @Override
      public Adapter casePropertiesTestOwner(PropertiesTestOwner object)
      {
        return createPropertiesTestOwnerAdapter();
      }
      @Override
      public Adapter caseStateFunction(StateFunction object)
      {
        return createStateFunctionAdapter();
      }
      @Override
      public Adapter caseJexTestSequence(JexTestSequence object)
      {
        return createJexTestSequenceAdapter();
      }
      @Override
      public Adapter caseState(State object)
      {
        return createStateAdapter();
      }
      @Override
      public Adapter caseObjectTest(ObjectTest object)
      {
        return createObjectTestAdapter();
      }
      @Override
      public Adapter caseTransition(Transition object)
      {
        return createTransitionAdapter();
      }
      @Override
      public Adapter caseTransitionSource(TransitionSource object)
      {
        return createTransitionSourceAdapter();
      }
      @Override
      public Adapter caseTransitionAction(TransitionAction object)
      {
        return createTransitionActionAdapter();
      }
      @Override
      public Adapter caseTransitionExpressionAction(TransitionExpressionAction object)
      {
        return createTransitionExpressionActionAdapter();
      }
      @Override
      public Adapter caseTransitionInputAction(TransitionInputAction object)
      {
        return createTransitionInputActionAdapter();
      }
      @Override
      public Adapter caseTransitionEffect(TransitionEffect object)
      {
        return createTransitionEffectAdapter();
      }
      @Override
      public Adapter caseTransitionTargetEffect(TransitionTargetEffect object)
      {
        return createTransitionTargetEffectAdapter();
      }
      @Override
      public Adapter caseTransitionExceptionEffect(TransitionExceptionEffect object)
      {
        return createTransitionExceptionEffectAdapter();
      }
      @Override
      public Adapter caseTransitionOutputEffect(TransitionOutputEffect object)
      {
        return createTransitionOutputEffectAdapter();
      }
      @Override
      public Adapter caseMethod(Method object)
      {
        return createMethodAdapter();
      }
      @Override
      public Adapter caseParameter(Parameter object)
      {
        return createParameterAdapter();
      }
      @Override
      public Adapter caseTestedClass(TestedClass object)
      {
        return createTestedClassAdapter();
      }
      @Override
      public Adapter caseTestedOperation(TestedOperation object)
      {
        return createTestedOperationAdapter();
      }
      @Override
      public Adapter caseTestedConstructor(TestedConstructor object)
      {
        return createTestedConstructorAdapter();
      }
      @Override
      public Adapter caseTestedMethod(TestedMethod object)
      {
        return createTestedMethodAdapter();
      }
      @Override
      public Adapter casePropertiesTest(PropertiesTest object)
      {
        return createPropertiesTestAdapter();
      }
      @Override
      public Adapter caseXExpression(XExpression object)
      {
        return createXExpressionAdapter();
      }
      @Override
      public Adapter caseXBlockExpression(XBlockExpression object)
      {
        return createXBlockExpressionAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
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
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link no.hal.jex.jextest.jexTest.JexTestSuite <em>Suite</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see no.hal.jex.jextest.jexTest.JexTestSuite
   * @generated
   */
  public Adapter createJexTestSuiteAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link no.hal.jex.jextest.jexTest.JexTestCase <em>Case</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see no.hal.jex.jextest.jexTest.JexTestCase
   * @generated
   */
  public Adapter createJexTestCaseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link no.hal.jex.jextest.jexTest.Instance <em>Instance</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see no.hal.jex.jextest.jexTest.Instance
   * @generated
   */
  public Adapter createInstanceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link no.hal.jex.jextest.jexTest.StateTestContext <em>State Test Context</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see no.hal.jex.jextest.jexTest.StateTestContext
   * @generated
   */
  public Adapter createStateTestContextAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link no.hal.jex.jextest.jexTest.PropertiesTestOwner <em>Properties Test Owner</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see no.hal.jex.jextest.jexTest.PropertiesTestOwner
   * @generated
   */
  public Adapter createPropertiesTestOwnerAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link no.hal.jex.jextest.jexTest.StateFunction <em>State Function</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see no.hal.jex.jextest.jexTest.StateFunction
   * @generated
   */
  public Adapter createStateFunctionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link no.hal.jex.jextest.jexTest.JexTestSequence <em>Sequence</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see no.hal.jex.jextest.jexTest.JexTestSequence
   * @generated
   */
  public Adapter createJexTestSequenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link no.hal.jex.jextest.jexTest.State <em>State</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see no.hal.jex.jextest.jexTest.State
   * @generated
   */
  public Adapter createStateAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link no.hal.jex.jextest.jexTest.ObjectTest <em>Object Test</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see no.hal.jex.jextest.jexTest.ObjectTest
   * @generated
   */
  public Adapter createObjectTestAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link no.hal.jex.jextest.jexTest.Transition <em>Transition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see no.hal.jex.jextest.jexTest.Transition
   * @generated
   */
  public Adapter createTransitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link no.hal.jex.jextest.jexTest.TransitionSource <em>Transition Source</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see no.hal.jex.jextest.jexTest.TransitionSource
   * @generated
   */
  public Adapter createTransitionSourceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link no.hal.jex.jextest.jexTest.TransitionAction <em>Transition Action</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see no.hal.jex.jextest.jexTest.TransitionAction
   * @generated
   */
  public Adapter createTransitionActionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link no.hal.jex.jextest.jexTest.TransitionExpressionAction <em>Transition Expression Action</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see no.hal.jex.jextest.jexTest.TransitionExpressionAction
   * @generated
   */
  public Adapter createTransitionExpressionActionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link no.hal.jex.jextest.jexTest.TransitionInputAction <em>Transition Input Action</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see no.hal.jex.jextest.jexTest.TransitionInputAction
   * @generated
   */
  public Adapter createTransitionInputActionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link no.hal.jex.jextest.jexTest.TransitionEffect <em>Transition Effect</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see no.hal.jex.jextest.jexTest.TransitionEffect
   * @generated
   */
  public Adapter createTransitionEffectAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link no.hal.jex.jextest.jexTest.TransitionTargetEffect <em>Transition Target Effect</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see no.hal.jex.jextest.jexTest.TransitionTargetEffect
   * @generated
   */
  public Adapter createTransitionTargetEffectAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link no.hal.jex.jextest.jexTest.TransitionExceptionEffect <em>Transition Exception Effect</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see no.hal.jex.jextest.jexTest.TransitionExceptionEffect
   * @generated
   */
  public Adapter createTransitionExceptionEffectAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link no.hal.jex.jextest.jexTest.TransitionOutputEffect <em>Transition Output Effect</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see no.hal.jex.jextest.jexTest.TransitionOutputEffect
   * @generated
   */
  public Adapter createTransitionOutputEffectAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link no.hal.jex.jextest.jexTest.Method <em>Method</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see no.hal.jex.jextest.jexTest.Method
   * @generated
   */
  public Adapter createMethodAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link no.hal.jex.jextest.jexTest.Parameter <em>Parameter</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see no.hal.jex.jextest.jexTest.Parameter
   * @generated
   */
  public Adapter createParameterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link no.hal.jex.jextest.jexTest.TestedClass <em>Tested Class</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see no.hal.jex.jextest.jexTest.TestedClass
   * @generated
   */
  public Adapter createTestedClassAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link no.hal.jex.jextest.jexTest.TestedOperation <em>Tested Operation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see no.hal.jex.jextest.jexTest.TestedOperation
   * @generated
   */
  public Adapter createTestedOperationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link no.hal.jex.jextest.jexTest.TestedConstructor <em>Tested Constructor</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see no.hal.jex.jextest.jexTest.TestedConstructor
   * @generated
   */
  public Adapter createTestedConstructorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link no.hal.jex.jextest.jexTest.TestedMethod <em>Tested Method</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see no.hal.jex.jextest.jexTest.TestedMethod
   * @generated
   */
  public Adapter createTestedMethodAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link no.hal.jex.jextest.jexTest.PropertiesTest <em>Properties Test</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see no.hal.jex.jextest.jexTest.PropertiesTest
   * @generated
   */
  public Adapter createPropertiesTestAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.xtext.xbase.XExpression <em>XExpression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.xtext.xbase.XExpression
   * @generated
   */
  public Adapter createXExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.xtext.xbase.XBlockExpression <em>XBlock Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.xtext.xbase.XBlockExpression
   * @generated
   */
  public Adapter createXBlockExpressionAdapter()
  {
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
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //JexTestAdapterFactory
