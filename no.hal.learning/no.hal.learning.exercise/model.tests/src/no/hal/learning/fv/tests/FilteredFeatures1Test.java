/**
 */
package no.hal.learning.fv.tests;

import junit.textui.TestRunner;
import no.hal.learning.fv.FeatureList;
import no.hal.learning.fv.FilteredFeatures1;
import no.hal.learning.fv.FvFactory;
import no.hal.learning.fv.Pred1Kind;
import no.hal.learning.fv.impl.FeatureListImpl;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Filtered Features1</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class FilteredFeatures1Test extends FilteredFeaturesTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(FilteredFeatures1Test.class);
	}

	/**
	 * Constructs a new Filtered Features1 test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FilteredFeatures1Test(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Filtered Features1 test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected FilteredFeatures1 getFixture() {
		return (FilteredFeatures1)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated NOT
	 */
	@Override
	protected void setUp() throws Exception {
		FeatureList featureList1 = FeatureListImpl.valueOf("f1", 0.0, "f2", 2.0, "g2", 1.0);
		FilteredFeatures1 filteredFeatures = FvFactory.eINSTANCE.createFilteredFeatures1();
		filteredFeatures.setNameFilter("f");		
		filteredFeatures.setPred(Pred1Kind.GT0);
		filteredFeatures.setOther(featureList1);
		setFixture(filteredFeatures);
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
		FeatureListTest.testFeatureNames(getFixture(), "f2");
	}
	
	@Override
	public void testGetFeatureValue__String() {
		FeatureListTest.testFeatureValues(getFixture(), "f2", 2.0);
	}
	
	@Override
	public void testHasFeature__String() {
		FeatureListTest.testHasFeatures(getFixture(), "f2");
	}
	
	@Override
	public void testToFeatureList() {
		FeatureListTest.testFeatureNames(getFixture().toFeatureList(), "f2");
		FeatureListTest.testFeatureValues(getFixture().toFeatureList(), "f2", 2.0);
	}

} //FilteredFeatures1Test
