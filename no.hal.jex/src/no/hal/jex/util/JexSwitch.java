/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package no.hal.jex.util;

import java.util.List;

import no.hal.jex.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;

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
 * @see no.hal.jex.JexPackage
 * @generated
 */
public class JexSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static JexPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JexSwitch() {
		if (modelPackage == null) {
			modelPackage = JexPackage.eINSTANCE;
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
	protected boolean isSwitchFor(EPackage ePackage) {
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
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case JexPackage.JAVA_PACK: {
				JavaPack javaPack = (JavaPack)theEObject;
				T result = caseJavaPack(javaPack);
				if (result == null) result = caseJavaElement(javaPack);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JexPackage.JAVA_CLASS: {
				JavaClass javaClass = (JavaClass)theEObject;
				T result = caseJavaClass(javaClass);
				if (result == null) result = caseMember(javaClass);
				if (result == null) result = caseJavaElement(javaClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JexPackage.JAVA_FIELD: {
				JavaField javaField = (JavaField)theEObject;
				T result = caseJavaField(javaField);
				if (result == null) result = caseMember(javaField);
				if (result == null) result = caseJavaElement(javaField);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JexPackage.JAVA_METHOD: {
				JavaMethod javaMethod = (JavaMethod)theEObject;
				T result = caseJavaMethod(javaMethod);
				if (result == null) result = caseMember(javaMethod);
				if (result == null) result = caseJavaElement(javaMethod);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JexPackage.MEMBER: {
				Member member = (Member)theEObject;
				T result = caseMember(member);
				if (result == null) result = caseJavaElement(member);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JexPackage.JAVA_ELEMENT: {
				JavaElement javaElement = (JavaElement)theEObject;
				T result = caseJavaElement(javaElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JexPackage.JAVA_REQUIREMENT: {
				JavaRequirement javaRequirement = (JavaRequirement)theEObject;
				T result = caseJavaRequirement(javaRequirement);
				if (result == null) result = caseRequirement(javaRequirement);
				if (result == null) result = caseAbstractRequirement(javaRequirement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JexPackage.JUNIT_TEST: {
				JUnitTest jUnitTest = (JUnitTest)theEObject;
				T result = caseJUnitTest(jUnitTest);
				if (result == null) result = caseJavaRequirement(jUnitTest);
				if (result == null) result = caseRequirement(jUnitTest);
				if (result == null) result = caseAbstractRequirement(jUnitTest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JexPackage.REQUIREMENT: {
				Requirement requirement = (Requirement)theEObject;
				T result = caseRequirement(requirement);
				if (result == null) result = caseAbstractRequirement(requirement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JexPackage.EXERCISE: {
				Exercise exercise = (Exercise)theEObject;
				T result = caseExercise(exercise);
				if (result == null) result = caseAbstractRequirement(exercise);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JexPackage.EXERCISE_PART: {
				ExercisePart exercisePart = (ExercisePart)theEObject;
				T result = caseExercisePart(exercisePart);
				if (result == null) result = caseAbstractRequirement(exercisePart);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JexPackage.ABSTRACT_REQUIREMENT: {
				AbstractRequirement abstractRequirement = (AbstractRequirement)theEObject;
				T result = caseAbstractRequirement(abstractRequirement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JexPackage.TEST_RUNNABLE: {
				TestRunnable testRunnable = (TestRunnable)theEObject;
				T result = caseTestRunnable(testRunnable);
				if (result == null) result = caseMember(testRunnable);
				if (result == null) result = caseJavaElement(testRunnable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JexPackage.JAVA_CLASS_TESTER: {
				JavaClassTester javaClassTester = (JavaClassTester)theEObject;
				T result = caseJavaClassTester(javaClassTester);
				if (result == null) result = caseJavaClass(javaClassTester);
				if (result == null) result = caseTestRunnable(javaClassTester);
				if (result == null) result = caseMember(javaClassTester);
				if (result == null) result = caseJavaElement(javaClassTester);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JexPackage.JAVA_METHOD_TESTER: {
				JavaMethodTester javaMethodTester = (JavaMethodTester)theEObject;
				T result = caseJavaMethodTester(javaMethodTester);
				if (result == null) result = caseJavaMethod(javaMethodTester);
				if (result == null) result = caseTestRunnable(javaMethodTester);
				if (result == null) result = caseMember(javaMethodTester);
				if (result == null) result = caseJavaElement(javaMethodTester);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JexPackage.TEST_SUITE: {
				TestSuite testSuite = (TestSuite)theEObject;
				T result = caseTestSuite(testSuite);
				if (result == null) result = caseJavaClass(testSuite);
				if (result == null) result = caseTestRunnable(testSuite);
				if (result == null) result = caseMember(testSuite);
				if (result == null) result = caseJavaElement(testSuite);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Java Pack</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Java Pack</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJavaPack(JavaPack object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Java Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Java Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJavaClass(JavaClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Java Field</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Java Field</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJavaField(JavaField object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Java Method</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Java Method</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJavaMethod(JavaMethod object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Member</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Member</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMember(Member object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Java Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Java Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJavaElement(JavaElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Java Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Java Requirement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJavaRequirement(JavaRequirement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>JUnit Test</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>JUnit Test</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJUnitTest(JUnitTest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Requirement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequirement(Requirement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Exercise</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exercise</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExercise(Exercise object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Exercise Part</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exercise Part</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExercisePart(ExercisePart object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Requirement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractRequirement(AbstractRequirement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Test Runnable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Test Runnable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTestRunnable(TestRunnable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Java Class Tester</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Java Class Tester</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJavaClassTester(JavaClassTester object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Java Method Tester</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Java Method Tester</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJavaMethodTester(JavaMethodTester object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Test Suite</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Test Suite</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTestSuite(TestSuite object) {
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
	public T defaultCase(EObject object) {
		return null;
	}

} //JexSwitch
