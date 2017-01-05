/**
 */
package no.hal.jex.jextest.jexTest;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see no.hal.jex.jextest.jexTest.JexTestPackage
 * @generated
 */
public interface JexTestFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  JexTestFactory eINSTANCE = no.hal.jex.jextest.jexTest.impl.JexTestFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Suite</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Suite</em>'.
   * @generated
   */
  JexTestSuite createJexTestSuite();

  /**
   * Returns a new object of class '<em>Case</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Case</em>'.
   * @generated
   */
  JexTestCase createJexTestCase();

  /**
   * Returns a new object of class '<em>Instance</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Instance</em>'.
   * @generated
   */
  Instance createInstance();

  /**
   * Returns a new object of class '<em>Test Member Context</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Test Member Context</em>'.
   * @generated
   */
  TestMemberContext createTestMemberContext();

  /**
   * Returns a new object of class '<em>State Test Context</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>State Test Context</em>'.
   * @generated
   */
  StateTestContext createStateTestContext();

  /**
   * Returns a new object of class '<em>Properties Test Owner</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Properties Test Owner</em>'.
   * @generated
   */
  PropertiesTestOwner createPropertiesTestOwner();

  /**
   * Returns a new object of class '<em>State Function</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>State Function</em>'.
   * @generated
   */
  StateFunction createStateFunction();

  /**
   * Returns a new object of class '<em>Sequence</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Sequence</em>'.
   * @generated
   */
  JexTestSequence createJexTestSequence();

  /**
   * Returns a new object of class '<em>Jvm Operation Ref</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Jvm Operation Ref</em>'.
   * @generated
   */
  JvmOperationRef createJvmOperationRef();

  /**
   * Returns a new object of class '<em>State</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>State</em>'.
   * @generated
   */
  State createState();

  /**
   * Returns a new object of class '<em>Object Test</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Object Test</em>'.
   * @generated
   */
  ObjectTest createObjectTest();

  /**
   * Returns a new object of class '<em>Transition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Transition</em>'.
   * @generated
   */
  Transition createTransition();

  /**
   * Returns a new object of class '<em>Transition Source</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Transition Source</em>'.
   * @generated
   */
  TransitionSource createTransitionSource();

  /**
   * Returns a new object of class '<em>Transition Action</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Transition Action</em>'.
   * @generated
   */
  TransitionAction createTransitionAction();

  /**
   * Returns a new object of class '<em>Transition Expression Action</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Transition Expression Action</em>'.
   * @generated
   */
  TransitionExpressionAction createTransitionExpressionAction();

  /**
   * Returns a new object of class '<em>Transition Input Action</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Transition Input Action</em>'.
   * @generated
   */
  TransitionInputAction createTransitionInputAction();

  /**
   * Returns a new object of class '<em>Transition Effect</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Transition Effect</em>'.
   * @generated
   */
  TransitionEffect createTransitionEffect();

  /**
   * Returns a new object of class '<em>Transition Effect2</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Transition Effect2</em>'.
   * @generated
   */
  TransitionEffect2 createTransitionEffect2();

  /**
   * Returns a new object of class '<em>Transition Target Effect</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Transition Target Effect</em>'.
   * @generated
   */
  TransitionTargetEffect createTransitionTargetEffect();

  /**
   * Returns a new object of class '<em>Transition Exception Effect</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Transition Exception Effect</em>'.
   * @generated
   */
  TransitionExceptionEffect createTransitionExceptionEffect();

  /**
   * Returns a new object of class '<em>Transition Output Effect</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Transition Output Effect</em>'.
   * @generated
   */
  TransitionOutputEffect createTransitionOutputEffect();

  /**
   * Returns a new object of class '<em>Transition Callback Effect</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Transition Callback Effect</em>'.
   * @generated
   */
  TransitionCallbackEffect createTransitionCallbackEffect();

  /**
   * Returns a new object of class '<em>Method</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Method</em>'.
   * @generated
   */
  Method createMethod();

  /**
   * Returns a new object of class '<em>Parameter List</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Parameter List</em>'.
   * @generated
   */
  ParameterList createParameterList();

  /**
   * Returns a new object of class '<em>Parameter</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Parameter</em>'.
   * @generated
   */
  Parameter createParameter();

  /**
   * Returns a new object of class '<em>Tested Class</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Tested Class</em>'.
   * @generated
   */
  TestedClass createTestedClass();

  /**
   * Returns a new object of class '<em>Tested Operation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Tested Operation</em>'.
   * @generated
   */
  TestedOperation createTestedOperation();

  /**
   * Returns a new object of class '<em>Tested Constructor</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Tested Constructor</em>'.
   * @generated
   */
  TestedConstructor createTestedConstructor();

  /**
   * Returns a new object of class '<em>Tested Method</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Tested Method</em>'.
   * @generated
   */
  TestedMethod createTestedMethod();

  /**
   * Returns a new object of class '<em>Properties Test</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Properties Test</em>'.
   * @generated
   */
  PropertiesTest createPropertiesTest();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  JexTestPackage getJexTestPackage();

} //JexTestFactory
