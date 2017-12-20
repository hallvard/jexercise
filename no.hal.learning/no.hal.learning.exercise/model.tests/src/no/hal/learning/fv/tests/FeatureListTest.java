/**
 */
package no.hal.learning.fv.tests;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.util.EList;

import junit.framework.TestCase;
import junit.textui.TestRunner;
import no.hal.learning.fv.FeatureList;
import no.hal.learning.fv.FeatureValued;
import no.hal.learning.fv.FvFactory;
import no.hal.learning.fv.impl.FeatureListImpl;
import no.hal.learning.fv.util.Op1;
import no.hal.learning.fv.util.Op2;
import no.hal.learning.fv.util.Pred1;
import no.hal.learning.fv.util.Pred2;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Feature List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link no.hal.learning.fv.FeatureList#set(no.hal.learning.fv.FeatureValued, boolean) <em>Set</em>}</li>
 *   <li>{@link no.hal.learning.fv.FeatureList#apply(no.hal.learning.fv.util.Op1) <em>Apply</em>}</li>
 *   <li>{@link no.hal.learning.fv.FeatureList#apply(no.hal.learning.fv.util.Op2, no.hal.learning.fv.FeatureValued, boolean) <em>Apply</em>}</li>
 *   <li>{@link no.hal.learning.fv.FeatureList#apply(no.hal.learning.fv.util.Op2, double, boolean) <em>Apply</em>}</li>
 *   <li>{@link no.hal.learning.fv.FeatureList#count(no.hal.learning.fv.util.Pred1) <em>Count</em>}</li>
 *   <li>{@link no.hal.learning.fv.FeatureList#count(no.hal.learning.fv.util.Pred2, no.hal.learning.fv.FeatureValued, boolean) <em>Count</em>}</li>
 *   <li>{@link no.hal.learning.fv.FeatureList#count(no.hal.learning.fv.FeatureValued) <em>Count</em>}</li>
 *   <li>{@link no.hal.learning.fv.FeatureList#zero(double) <em>Zero</em>}</li>
 *   <li>{@link no.hal.learning.fv.FeatureValued#getFeatureNames() <em>Get Feature Names</em>}</li>
 *   <li>{@link no.hal.learning.fv.FeatureValued#getFeatureValue(java.lang.String) <em>Get Feature Value</em>}</li>
 *   <li>{@link no.hal.learning.fv.FeatureValued#hasFeature(java.lang.String) <em>Has Feature</em>}</li>
 *   <li>{@link no.hal.learning.fv.FeatureValued#toFeatureList() <em>To Feature List</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class FeatureListTest extends TestCase {

	/**
	 * The fixture for this Feature List test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeatureList fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(FeatureListTest.class);
	}

	/**
	 * Constructs a new Feature List test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureListTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Feature List test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(FeatureList fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Feature List test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeatureList getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated NOT
	 */
	@Override
	protected void setUp() throws Exception {
		FeatureList featureList = FvFactory.eINSTANCE.createFeatureList();
		featureList.getFeatures().put("f1",  1.0);
		featureList.getFeatures().put("f2",  2.0);
		setFixture(featureList);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

	//

	public static void testFeatureNames(FeatureValued features, String... featureNames) {
		List<String> featureNames1 = Arrays.asList(featureNames);
		EList<String> featureNames2 = features.getFeatureNames();
		assertTrue(featureNames1 + " must contain " + featureNames2, featureNames1.containsAll(featureNames2));
		assertTrue(featureNames2 + " must contain " + featureNames1, featureNames2.containsAll(featureNames1));
	}
	
	public static void testFeatureValues(FeatureValued features, Object... featureNamesValues) {
		for (int i = 0; i < featureNamesValues.length; i += 2) {
			String featureName = (String) featureNamesValues[i];
			double value = ((Number) featureNamesValues[i + 1]).doubleValue();
			assertEquals(value, features.getFeatureValue(featureName), 0.000001);
		}
	}

	public static void testAllFeatureValues(FeatureValued features, Object... featureNamesValues) {
		testFeatureValues(features, featureNamesValues);
		Collection<Object> featureNamesValueList = Arrays.asList(featureNamesValues);
		for (String featureName : features.getFeatureNames()) {
			assertTrue(featureNamesValueList.contains(featureName));
		}
	}
	
	public static void testHasFeatures(FeatureValued features, String... featureNames) {
		for (int i = 0; i < featureNames.length; i += 2) {
			String featureName = featureNames[i];
			assertTrue("Should have " + featureName, features.hasFeature(featureName));
		}
	}

	public static void testHasntFeatures(FeatureValued features, String... featureNames) {
		for (int i = 0; i < featureNames.length; i += 2) {
			String featureName = featureNames[i];
			assertFalse("Shouldn't have " + featureName, features.hasFeature(featureName));
		}
	}

	public static void testFeatures(FeatureValued features, Object... featureNamesValues) {
		for (int i = 0; i < featureNamesValues.length; i += 2) {
			String featureName = (String) featureNamesValues[i];
			double value = ((Number) featureNamesValues[i + 1]).doubleValue();
			assertTrue("Should have " + featureName, features.hasFeature(featureName));
			assertEquals(value, features.getFeatureValue(featureName), 0.000001);
		}
	}

	/**
	 * Tests the '{@link no.hal.learning.fv.FeatureList#set(no.hal.learning.fv.FeatureValued, boolean) <em>Set</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.learning.fv.FeatureList#set(no.hal.learning.fv.FeatureValued, boolean)
	 * @generated NOT
	 */
	public void testSet__FeatureValued_boolean() {
		getFixture().set(FeatureListImpl.valueOf("f1", 3.0, "f3", 4.0), false);
		testFeatures(getFixture(), "f1", 3.0, "f2", 2.0, "f3", 4.0);
		getFixture().set(FeatureListImpl.valueOf("f1", 5.0), true);
		testFeatures(getFixture(), "f1", 5.0);
		testHasntFeatures(getFixture(), "f2", "f3");
	}

	/**
	 * Tests the '{@link no.hal.learning.fv.FeatureList#apply(no.hal.learning.fv.util.Op1) <em>Apply</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.learning.fv.FeatureList#apply(no.hal.learning.fv.util.Op1)
	 * @generated NOT
	 */
	public void testApply__Op1() {
		FeatureList featureList1 = getFixture();
		// neg
		featureList1.apply(Op1.NEG);
		testFeatures(featureList1, "f1", -1.0, "f2", -2.0);
	}

	/**
	 * Tests the '{@link no.hal.learning.fv.FeatureList#apply(no.hal.learning.fv.util.Op2, no.hal.learning.fv.FeatureValued, boolean) <em>Apply</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.learning.fv.FeatureList#apply(no.hal.learning.fv.util.Op2, no.hal.learning.fv.FeatureValued, boolean)
	 * @generated NOT
	 */
	public void testApply__Op2_FeatureValued_boolean() {
		FeatureList featureList1 = getFixture();
		FeatureList featureList2 = FeatureListImpl.valueOf("f1", 3.0, "f2", 4.0);
		// add
		featureList1.apply(Op2.PLUS, featureList2, false);
		testFeatures(featureList1, "f1", 4.0, "f2", 6.0);
		// sub
		featureList1.apply(Op2.MINUS, featureList2, false);
		testFeatures(featureList1, "f1", 1.0, "f2", 2.0);
		// mult
		featureList1.apply(Op2.MULT, featureList2, false);
		testFeatures(featureList1, "f1", 3.0, "f2", 8.0);
	}

	/**
	 * Tests the '{@link no.hal.learning.fv.FeatureList#apply(no.hal.learning.fv.util.Op2, double, boolean) <em>Apply</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.learning.fv.FeatureList#apply(no.hal.learning.fv.util.Op2, double, boolean)
	 * @generated NOT
	 */
	public void testApply__Op2_double_boolean() {
		FeatureList featureList1 = getFixture();
		// scale
		featureList1.apply(Op2.MULT, 2.0, false);
		testFeatures(featureList1, "f1", 2.0, "f2", 4.0);
	}

	/**
	 * Tests the '{@link no.hal.learning.fv.FeatureList#test(no.hal.learning.fv.util.Pred1) <em>Test</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.learning.fv.FeatureList#test(no.hal.learning.fv.util.Pred1)
	 * @generated NOT
	 */
	public void testCount__Pred1() {
		FeatureList featureList1 = getFixture();
		// test
		assertEquals(1, featureList1.count(new Pred1.Impl() {
			@Override
			public boolean test(double val) {
				return val == 1.0;
			}
		}));
	}

	/**
	 * Tests the '{@link no.hal.learning.fv.FeatureList#test(no.hal.learning.fv.util.Pred2, no.hal.learning.fv.FeatureValued, boolean) <em>Test</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.learning.fv.FeatureList#test(no.hal.learning.fv.util.Pred2, no.hal.learning.fv.FeatureValued, boolean)
	 * @generated NOT
	 */
	public void testCount__Pred2_FeatureValued_boolean() {
		FeatureList featureList1 = getFixture();
		FeatureList featureList2 = FeatureListImpl.valueOf("f1", 3.0, "f2", 2.0);
		// test
		assertEquals(2, featureList1.count(Pred2.EQ, featureList1, false));
		// test
		assertEquals(1, featureList1.count(Pred2.LT, featureList2, false));
		// test
		assertEquals(2, featureList1.count(Pred2.LE, featureList2, false));
	}

	/**
	 * Tests the '{@link no.hal.learning.fv.FeatureList#test(no.hal.learning.fv.util.Pred2, no.hal.learning.fv.FeatureValued, boolean) <em>Test</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.learning.fv.FeatureList#test(no.hal.learning.fv.util.Pred2, no.hal.learning.fv.FeatureValued, boolean)
	 * @generated NOT
	 */
	public void testCount__FeatureValued() {
		FeatureList featureList1 = getFixture();
		FeatureList featureList2 = FeatureListImpl.valueOf("f1", 3.0, "f3", 2.0);
		// test
		assertEquals(2, featureList1.count(featureList1));
		assertEquals(3, featureList2.count(featureList1));
		assertEquals(3, featureList1.count(featureList2));
	}
	
	/**
	 * Tests the '{@link no.hal.learning.fv.FeatureList#zero(double) <em>Zero</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.learning.fv.FeatureList#zero(double)
	 * @generated NOT
	 */
	public void testZero__double() {
		FeatureList featureList1 = getFixture();
		// zero
		featureList1.zero(1.0);
		testFeatures(featureList1, "f1", 0.0, "f2", 2.0);
	}

	/**
	 * Tests the '{@link no.hal.learning.fv.FeatureValued#getFeatureNames() <em>Get Feature Names</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.learning.fv.FeatureValued#getFeatureNames()
	 * @generated NOT
	 */
	public void testGetFeatureNames() {
		testFeatureNames(getFixture(), "f1", "f2");
	}

	/**
	 * Tests the '{@link no.hal.learning.fv.FeatureValued#getFeatureValue(java.lang.String) <em>Get Feature Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.learning.fv.FeatureValued#getFeatureValue(java.lang.String)
	 * @generated NOT
	 */
	public void testGetFeatureValue__String() {
		testFeatureValues(getFixture(), "f1", 1.0, "f2", 2.0);
	}

	/**
	 * Tests the '{@link no.hal.learning.fv.FeatureValued#hasFeature(java.lang.String) <em>Has Feature</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.learning.fv.FeatureValued#hasFeature(java.lang.String)
	 * @generated NOT
	 */
	public void testHasFeature__String() {
		testHasFeatures(getFixture(), "f1", "f2");
	}

	/**
	 * Tests the '{@link no.hal.learning.fv.FeatureValued#toFeatureList() <em>To Feature List</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.learning.fv.FeatureValued#toFeatureList()
	 * @generated NOT
	 */
	public void testToFeatureList() {
		testFeatureNames(getFixture().toFeatureList(), "f1", "f2");
		testFeatureValues(getFixture().toFeatureList(), "f1", 1.0, "f2", 2.0);
	}

} //FeatureListTest
