/**
 */
package no.hal.learning.fv.tests;

import junit.textui.TestRunner;
import no.hal.learning.fv.FeatureList;
import no.hal.learning.fv.FilteredFeatures2;
import no.hal.learning.fv.FvFactory;
import no.hal.learning.fv.Pred2Kind;
import no.hal.learning.fv.impl.FeatureListImpl;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Filtered Features2</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class FilteredFeatures2Test extends FilteredFeaturesTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(FilteredFeatures2Test.class);
	}

	/**
	 * Constructs a new Filtered Features2 test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FilteredFeatures2Test(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Filtered Features2 test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected FilteredFeatures2 getFixture() {
		return (FilteredFeatures2)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated NOT
	 */
	@Override
	protected void setUp() throws Exception {
		FeatureList featureList1 = FeatureListImpl.valueOf("f1", 0.0, "f2", 2.0, "g", 2.0);
		FilteredFeatures2 filteredFeatures = FvFactory.eINSTANCE.createFilteredFeatures2();
		filteredFeatures.setPred(Pred2Kind.EQ);
		filteredFeatures.setNameFilter("f");		
		filteredFeatures.setVal(2.0);
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

} //FilteredFeatures2Test
