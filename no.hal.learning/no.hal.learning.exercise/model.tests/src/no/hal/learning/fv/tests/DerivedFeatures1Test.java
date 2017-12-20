/**
 */
package no.hal.learning.fv.tests;

import junit.textui.TestRunner;
import no.hal.learning.fv.DerivedFeatures1;
import no.hal.learning.fv.FeatureList;
import no.hal.learning.fv.FvFactory;
import no.hal.learning.fv.Op1Kind;
import no.hal.learning.fv.Op2Kind;
import no.hal.learning.fv.impl.FeatureListImpl;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Derived Features1</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DerivedFeatures1Test extends OpDerivedFeaturesTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DerivedFeatures1Test.class);
	}

	/**
	 * Constructs a new Derived Features1 test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DerivedFeatures1Test(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Derived Features1 test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected DerivedFeatures1 getFixture() {
		return (DerivedFeatures1)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated NOT
	 */
	@Override
	protected void setUp() throws Exception {
		DerivedFeatures1 derivedFeatures = FvFactory.eINSTANCE.createDerivedFeatures1();
		FeatureList featureList1 = FeatureListImpl.valueOf("f1", 1.0, "f2", 2.0);
		derivedFeatures.setOp(Op2Kind.PLUS);
		derivedFeatures.setOp1(Op1Kind.NEG);
		derivedFeatures.setVal(3.0);
		derivedFeatures.setOther(featureList1);
		setFixture(derivedFeatures);
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

	@Override
	public void testGetFeatureNames() {
		FeatureListTest.testFeatureNames(getFixture(), "f1", "f2");
	}
	
	@Override
	public void testGetFeatureValue__String() {
		FeatureListTest.testFeatureValues(getFixture(), "f1", -4.0, "f2", -5.0);
	}
	
	@Override
	public void testHasFeature__String() {
		FeatureListTest.testHasFeatures(getFixture(), "f1", "f2");
	}
	
	@Override
	public void testToFeatureList() {
		FeatureListTest.testFeatureNames(getFixture().toFeatureList(), "f1", "f2");
		FeatureListTest.testFeatureValues(getFixture().toFeatureList(), "f1", -4.0, "f2", -5.0);
	}

} //DerivedFeatures1Test
