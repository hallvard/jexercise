/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package no.hal.jex.util;

import no.hal.jex.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see no.hal.jex.JexPackage
 * @generated
 */
public class JexAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static JexPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JexAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = JexPackage.eINSTANCE;
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
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
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
	protected JexSwitch<Adapter> modelSwitch =
		new JexSwitch<Adapter>() {
			@Override
			public Adapter caseJavaPack(JavaPack object) {
				return createJavaPackAdapter();
			}
			@Override
			public Adapter caseJavaClass(JavaClass object) {
				return createJavaClassAdapter();
			}
			@Override
			public Adapter caseJavaField(JavaField object) {
				return createJavaFieldAdapter();
			}
			@Override
			public Adapter caseJavaMethod(JavaMethod object) {
				return createJavaMethodAdapter();
			}
			@Override
			public Adapter caseMember(Member object) {
				return createMemberAdapter();
			}
			@Override
			public Adapter caseJavaElement(JavaElement object) {
				return createJavaElementAdapter();
			}
			@Override
			public Adapter caseJavaRequirement(JavaRequirement object) {
				return createJavaRequirementAdapter();
			}
			@Override
			public Adapter caseJUnitTest(JUnitTest object) {
				return createJUnitTestAdapter();
			}
			@Override
			public Adapter caseRequirement(Requirement object) {
				return createRequirementAdapter();
			}
			@Override
			public Adapter caseExercise(Exercise object) {
				return createExerciseAdapter();
			}
			@Override
			public Adapter caseExercisePart(ExercisePart object) {
				return createExercisePartAdapter();
			}
			@Override
			public Adapter caseAbstractRequirement(AbstractRequirement object) {
				return createAbstractRequirementAdapter();
			}
			@Override
			public Adapter caseTestRunnable(TestRunnable object) {
				return createTestRunnableAdapter();
			}
			@Override
			public Adapter caseJavaClassTester(JavaClassTester object) {
				return createJavaClassTesterAdapter();
			}
			@Override
			public Adapter caseJavaMethodTester(JavaMethodTester object) {
				return createJavaMethodTesterAdapter();
			}
			@Override
			public Adapter caseTestSuite(TestSuite object) {
				return createTestSuiteAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
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
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link no.hal.jex.JavaPack <em>Java Pack</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.jex.JavaPack
	 * @generated
	 */
	public Adapter createJavaPackAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.jex.JavaClass <em>Java Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.jex.JavaClass
	 * @generated
	 */
	public Adapter createJavaClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.jex.JavaField <em>Java Field</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.jex.JavaField
	 * @generated
	 */
	public Adapter createJavaFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.jex.JavaMethod <em>Java Method</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.jex.JavaMethod
	 * @generated
	 */
	public Adapter createJavaMethodAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.jex.Member <em>Member</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.jex.Member
	 * @generated
	 */
	public Adapter createMemberAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.jex.JavaElement <em>Java Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.jex.JavaElement
	 * @generated
	 */
	public Adapter createJavaElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.jex.JavaRequirement <em>Java Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.jex.JavaRequirement
	 * @generated
	 */
	public Adapter createJavaRequirementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.jex.JUnitTest <em>JUnit Test</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.jex.JUnitTest
	 * @generated
	 */
	public Adapter createJUnitTestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.jex.Requirement <em>Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.jex.Requirement
	 * @generated
	 */
	public Adapter createRequirementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.jex.Exercise <em>Exercise</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.jex.Exercise
	 * @generated
	 */
	public Adapter createExerciseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.jex.ExercisePart <em>Exercise Part</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.jex.ExercisePart
	 * @generated
	 */
	public Adapter createExercisePartAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.jex.AbstractRequirement <em>Abstract Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.jex.AbstractRequirement
	 * @generated
	 */
	public Adapter createAbstractRequirementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.jex.TestRunnable <em>Test Runnable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.jex.TestRunnable
	 * @generated
	 */
	public Adapter createTestRunnableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.jex.JavaClassTester <em>Java Class Tester</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.jex.JavaClassTester
	 * @generated
	 */
	public Adapter createJavaClassTesterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.jex.JavaMethodTester <em>Java Method Tester</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.jex.JavaMethodTester
	 * @generated
	 */
	public Adapter createJavaMethodTesterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.jex.TestSuite <em>Test Suite</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.jex.TestSuite
	 * @generated
	 */
	public Adapter createTestSuiteAdapter() {
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
	public Adapter createEObjectAdapter() {
		return null;
	}

} //JexAdapterFactory
