/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package no.hal.jex;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see no.hal.jex.JexPackage
 * @generated
 */
public interface JexFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	JexFactory eINSTANCE = no.hal.jex.impl.JexFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Java Pack</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Java Pack</em>'.
	 * @generated
	 */
	JavaPack createJavaPack();

	/**
	 * Returns a new object of class '<em>Java Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Java Class</em>'.
	 * @generated
	 */
	JavaClass createJavaClass();

	/**
	 * Returns a new object of class '<em>Java Field</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Java Field</em>'.
	 * @generated
	 */
	JavaField createJavaField();

	/**
	 * Returns a new object of class '<em>Java Method</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Java Method</em>'.
	 * @generated
	 */
	JavaMethod createJavaMethod();

	/**
	 * Returns a new object of class '<em>Java Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Java Requirement</em>'.
	 * @generated
	 */
	JavaRequirement createJavaRequirement();

	/**
	 * Returns a new object of class '<em>JUnit Test</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>JUnit Test</em>'.
	 * @generated
	 */
	JUnitTest createJUnitTest();

	/**
	 * Returns a new object of class '<em>Exercise</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Exercise</em>'.
	 * @generated
	 */
	Exercise createExercise();

	/**
	 * Returns a new object of class '<em>Exercise Part</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Exercise Part</em>'.
	 * @generated
	 */
	ExercisePart createExercisePart();

	/**
	 * Returns a new object of class '<em>Java Class Tester</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Java Class Tester</em>'.
	 * @generated
	 */
	JavaClassTester createJavaClassTester();

	/**
	 * Returns a new object of class '<em>Java Method Tester</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Java Method Tester</em>'.
	 * @generated
	 */
	JavaMethodTester createJavaMethodTester();

	/**
	 * Returns a new object of class '<em>Test Suite</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Test Suite</em>'.
	 * @generated
	 */
	TestSuite createTestSuite();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	JexPackage getJexPackage();

} //JexFactory
