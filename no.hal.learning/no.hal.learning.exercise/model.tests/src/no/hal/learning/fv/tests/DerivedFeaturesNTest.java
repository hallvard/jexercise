/**
 */
package no.hal.learning.fv.tests;

import junit.textui.TestRunner;
import no.hal.learning.fv.DerivedFeaturesN;
import no.hal.learning.fv.FeatureList;
import no.hal.learning.fv.FvFactory;
import no.hal.learning.fv.Op1Kind;
import no.hal.learning.fv.Op2Kind;
import no.hal.learning.fv.impl.FeatureListImpl;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Derived Features N</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DerivedFeaturesNTest extends OpDerivedFeaturesTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DerivedFeaturesNTest.class);
	}

	/**
	 * Constructs a new Derived Features N test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DerivedFeaturesNTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Derived Features N test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected DerivedFeaturesN getFixture() {
		return (DerivedFeaturesN)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated NOT
	 */
	@Override
	protected void setUp() throws Exception {
		DerivedFeaturesN derivedFeatures = FvFactory.eINSTANCE.createDerivedFeaturesN();
		FeatureList featureList1 = FeatureListImpl.valueOf("f1", 1.0, "f2", 2.0);
		FeatureList featureList2 = FeatureListImpl.valueOf("f1", 3.0, "f2", 4.0);
		derivedFeatures.setOp(Op2Kind.PLUS);
		derivedFeatures.setOp1(Op1Kind.NEG);
		derivedFeatures.getOthers().add(featureList1);
		derivedFeatures.getOthers().add(featureList2);
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
		FeatureListTest.testFeatureValues(getFixture(), "f1", -4.0, "f2", -6.0);
	}
	
	@Override
	public void testHasFeature__String() {
		FeatureListTest.testHasFeatures(getFixture(), "f1", "f2");
	}
	
	@Override
	public void testToFeatureList() {
		FeatureListTest.testFeatureNames(getFixture().toFeatureList(), "f1", "f2");
		FeatureListTest.testFeatureValues(getFixture().toFeatureList(), "f1", -4.0, "f2", -6.0);
	}

} //DerivedFeaturesNTest
