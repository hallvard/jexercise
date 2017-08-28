/**
 */
package no.hal.learning.fv.tests;

import java.util.Arrays;

import org.eclipse.emf.ecore.util.EcoreUtil;

import junit.framework.TestCase;
import junit.textui.TestRunner;
import no.hal.learning.fv.ConstantFeatureList;
import no.hal.learning.fv.FvFactory;
import no.hal.learning.fv.impl.FeatureListImpl;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Constant Feature List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link no.hal.learning.fv.FeatureValued#getFeatureValue(java.lang.String) <em>Get Feature Value</em>}</li>
 *   <li>{@link no.hal.learning.fv.FeatureValued#hasFeature(java.lang.String) <em>Has Feature</em>}</li>
 *   <li>{@link no.hal.learning.fv.FeatureValued#toFeatureList() <em>To Feature List</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class ConstantFeatureListTest extends TestCase {

	/**
	 * The fixture for this Constant Feature List test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConstantFeatureList fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ConstantFeatureListTest.class);
	}

	/**
	 * Constructs a new Constant Feature List test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstantFeatureListTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Constant Feature List test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(ConstantFeatureList fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Constant Feature List test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConstantFeatureList getFixture() {
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
		ConstantFeatureList featureList = FvFactory.eINSTANCE.createConstantFeatureList();
		featureList.getFeatureNames().addAll(Arrays.asList("a", "b"));
		featureList.setVal(42.0);
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

	/**
	 * Tests the '{@link no.hal.learning.fv.FeatureValued#getFeatureValue(java.lang.String) <em>Get Feature Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.learning.fv.FeatureValued#getFeatureValue(java.lang.String)
	 * @generated NOT
	 */
	public void testGetFeatureValue__String() {
		assertEquals(42.0, getFixture().getFeatureValue("a"));
		assertEquals(42.0, getFixture().getFeatureValue("b"));
		assertEquals(0.0, getFixture().getFeatureValue("c"));
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

	/**
	 * Tests the '{@link no.hal.learning.fv.FeatureValued#toFeatureList() <em>To Feature List</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.learning.fv.FeatureValued#toFeatureList()
	 * @generated NOT
	 */
	public void testToFeatureList() {
		assertTrue(EcoreUtil.equals(FeatureListImpl.valueOf("a", 42.0, "b", 42.0), getFixture().toFeatureList()));
	}

} //ConstantFeatureListTest
