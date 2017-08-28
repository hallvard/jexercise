/**
 */
package no.hal.learning.fv.tests;

import junit.textui.TestRunner;
import no.hal.learning.fv.ExpressionFeatures;
import no.hal.learning.fv.FeatureList;
import no.hal.learning.fv.FvFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Expression Features List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link no.hal.learning.fv.FeatureValued#getFeatureNames() <em>Get Feature Names</em>}</li>
 *   <li>{@link no.hal.learning.fv.FeatureValued#getFeatureValue(java.lang.String) <em>Get Feature Value</em>}</li>
 *   <li>{@link no.hal.learning.fv.FeatureValued#hasFeature(java.lang.String) <em>Has Feature</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class ExpressionFeaturesTest extends DerivedFeaturesTest {

	/**
	 * The fixture for this Expression Features test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExpressionFeatures fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ExpressionFeaturesTest.class);
	}

	/**
	 * Constructs a new Feature List test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionFeaturesTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Feature List test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(ExpressionFeatures fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Feature List test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExpressionFeatures getFixture() {
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
		ExpressionFeatures expressionFeatures = FvFactory.eINSTANCE.createExpressionFeatures();
		expressionFeatures.getContained().add(featureList);
		expressionFeatures.setOther(expressionFeatures);
		expressionFeatures.getFeatures().put("sum", "f1 + f2");
		expressionFeatures.getFeatures().put("product", "f1 * f2");
		setFixture(expressionFeatures);
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

	/**
	 * Tests the '{@link no.hal.learning.fv.FeatureValued#getFeatureNames() <em>Get Feature Names</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.learning.fv.FeatureValued#getFeatureNames()
	 * @generated NOT
	 */
	public void testGetFeatureNames() {
		FeatureListTest.testFeatureNames(getFixture(), "sum", "product");
	}

	/**
	 * Tests the '{@link no.hal.learning.fv.FeatureValued#getFeatureValue(java.lang.String) <em>Get Feature Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.learning.fv.FeatureValued#getFeatureValue(java.lang.String)
	 * @generated NOT
	 */
	public void testGetFeatureValue__String() {
		FeatureListTest.testFeatureValues(getFixture(), "sum", 3.0, "product", 2.0);
	}

	/**
	 * Tests the '{@link no.hal.learning.fv.FeatureValued#hasFeature(java.lang.String) <em>Has Feature</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.learning.fv.FeatureValued#hasFeature(java.lang.String)
	 * @generated NOT
	 */
	public void testHasFeature__String() {
		FeatureListTest.testHasFeatures(getFixture(), "sum", "product");
		FeatureListTest.testHasntFeatures(getFixture(), "f1", "f2");
	}

} //FeatureListTest
