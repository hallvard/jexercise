/**
 */
package no.hal.learning.fv.tests;

import java.util.Arrays;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.EcoreUtil;

import junit.framework.TestCase;
import junit.textui.TestRunner;
import no.hal.learning.fv.DelegatedFeatures;
import no.hal.learning.fv.FeatureList;
import no.hal.learning.fv.FvFactory;
import no.hal.learning.fv.impl.FeatureListImpl;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Delegated Features</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link no.hal.learning.fv.FeatureValued#getFeatureNames() <em>Get Feature Names</em>}</li>
 *   <li>{@link no.hal.learning.fv.FeatureValued#getFeatureValue(java.lang.String) <em>Get Feature Value</em>}</li>
 *   <li>{@link no.hal.learning.fv.FeatureValued#hasFeature(java.lang.String) <em>Has Feature</em>}</li>
 *   <li>{@link no.hal.learning.fv.FeatureValued#toFeatureList() <em>To Feature List</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class DelegatedFeaturesTest extends TestCase {

	/**
	 * The fixture for this Delegated Features test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DelegatedFeatures fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DelegatedFeaturesTest.class);
	}

	/**
	 * Constructs a new Delegated Features test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DelegatedFeaturesTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Delegated Features test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(DelegatedFeatures fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Delegated Features test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DelegatedFeatures getFixture() {
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
		DelegatedFeatures delegatedFeatures = FvFactory.eINSTANCE.createDelegatedFeatures();
		setDelegate(delegatedFeatures);
		setFixture(delegatedFeatures);
	}

	public static void setDelegate(DelegatedFeatures delegatedFeatures) {
		FeatureList delegate = FeatureListImpl.valueOf("a", 2.0, "b", 3.0);
		delegatedFeatures.setFeatures(delegate);
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

	/**
	 * Tests the '{@link no.hal.learning.fv.FeatureValued#getFeatureNames() <em>Get Feature Names</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.learning.fv.FeatureValued#getFeatureNames()
	 * @generated NOT
	 */
	public void testGetFeatureNames() {
		testGetFeatureNames(getFixture());
	}
	public static void testGetFeatureNames(DelegatedFeatures delegatedFeatures) {
		EList<String> featureNames = delegatedFeatures.getFeatureNames();
		List<String> ab = Arrays.asList("a", "b");
		assertTrue(featureNames + " should contain " + ab, featureNames.containsAll(ab));
		assertTrue(ab + " should contain " + featureNames, ab.containsAll(featureNames));
	}

	/**
	 * Tests the '{@link no.hal.learning.fv.FeatureValued#getFeatureValue(java.lang.String) <em>Get Feature Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.learning.fv.FeatureValued#getFeatureValue(java.lang.String)
	 * @generated NOT
	 */
	public void testGetFeatureValue__String() {
		testGetFeatureValue__String(getFixture());
	}
	public static void testGetFeatureValue__String(DelegatedFeatures delegatedFeatures) {
		assertEquals(2.0, delegatedFeatures.getFeatureValue("a"));
		assertEquals(3.0, delegatedFeatures.getFeatureValue("b"));
	}

	/**
	 * Tests the '{@link no.hal.learning.fv.FeatureValued#hasFeature(java.lang.String) <em>Has Feature</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.learning.fv.FeatureValued#hasFeature(java.lang.String)
	 * @generated NOT
	 */
	public void testHasFeature__String() {
		assertTrue(getFixture().hasFeature("a"));
		assertTrue(getFixture().hasFeature("b"));
		assertFalse(getFixture().hasFeature("c"));
	}
	public static void testHasFeature__String(DelegatedFeatures delegatedFeatures) {
		assertTrue(delegatedFeatures.hasFeature("a"));
		assertTrue(delegatedFeatures.hasFeature("b"));
		assertFalse(delegatedFeatures.hasFeature("c"));
	}

	/**
	 * Tests the '{@link no.hal.learning.fv.FeatureValued#toFeatureList() <em>To Feature List</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.learning.fv.FeatureValued#toFeatureList()
	 * @generated NOT
	 */
	public void testToFeatureList() {
		EcoreUtil.equals(getFixture().getFeatures().toFeatureList(), getFixture().toFeatureList());
	}
	public static void testToFeatureList(DelegatedFeatures delegatedFeatures) {
		assertTrue(EcoreUtil.equals(delegatedFeatures.getFeatures().toFeatureList(), delegatedFeatures.toFeatureList()));
	}

} //DelegatedFeaturesTest
