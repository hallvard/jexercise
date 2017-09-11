package no.hal.learning.fv.tests;

import java.util.Arrays;

import junit.framework.TestCase;
import no.hal.learning.fv.ConstantFeatureList;
import no.hal.learning.fv.DerivedFeatures1;
import no.hal.learning.fv.DerivedFeaturesN;
import no.hal.learning.fv.ExpressionFeatures;
import no.hal.learning.fv.FeatureList;
import no.hal.learning.fv.FeatureValued;
import no.hal.learning.fv.FilteredFeatures1;
import no.hal.learning.fv.FilteredFeatures2;
import no.hal.learning.fv.FvFactory;
import no.hal.learning.fv.Op2Kind;
import no.hal.learning.fv.Pred1Kind;
import no.hal.learning.fv.Pred2Kind;
import no.hal.learning.fv.impl.FeatureListImpl;
import no.hal.learning.fv.util.Op2;
import no.hal.learning.fv.util.Pred1;
import no.hal.learning.fv.util.Pred2;

public class FvTest extends TestCase {

	@Override
	protected void setUp() throws Exception {
	}
	
	protected void testFeatures(FeatureValued features, Object... featureNamesValues) {
		for (int i = 0; i < featureNamesValues.length; i += 2) {
			String featureName = (String) featureNamesValues[i];
			double value = ((Number) featureNamesValues[i + 1]).doubleValue();
			assertTrue(features.hasFeature(featureName));
			assertEquals(value, features.getFeatureValue(featureName), 0.000001);
		}
	}
	
	protected FeatureList toFeatureList(Object... featureNamesValues) {
		FeatureList featureList = FvFactory.eINSTANCE.createFeatureList();
		for (int i = 0; i < featureNamesValues.length; i += 2) {
			String featureName = (String) featureNamesValues[i];
			double value = ((Number) featureNamesValues[i + 1]).doubleValue();
			featureList.getFeatures().put(featureName, value);
		}
		return featureList;
	}
	
	public void testFeatureList() {
		FeatureList featureList1 = toFeatureList("f1", 1.0, "f2", 2.0);
		FeatureList featureList2 = toFeatureList("f1", 3.0, "f2", 4.0);
		// add
		featureList1.apply(Op2.PLUS, featureList2, false);
		testFeatures(featureList1, "f1", 4.0, "f2", 6.0);
		// sub
		featureList1.apply(Op2.MINUS, featureList2, false);
		testFeatures(featureList1, "f1", 1.0, "f2", 2.0);
		// mult
		featureList1.apply(Op2.MULT, featureList2, false);
		testFeatures(featureList1, "f1", 3.0, "f2", 8.0);
		// scale
		featureList1.apply(Op2.MULT, 2.0, false);
		testFeatures(featureList1, "f1", 6.0, "f2", 16.0);
		// set
		featureList1.set(featureList2, true);
		testFeatures(featureList1, "f1", 3.0, "f2", 4.0);
		// zero
		featureList1.zero(3.0);
		testFeatures(featureList1, "f1", 0.0, "f2", 4.0);
		// sub
		featureList1.apply(Op2.MINUS, featureList2, true);
		testFeatures(featureList1, "f1", 3.0, "f2", 0.0);
		// toFeatureList
		testFeatures(featureList1.toFeatureList(), "f1", 3.0, "f2", 0.0);
		// count1
		assertEquals(1, featureList1.count(Pred1.ZERO));
		// count2
		assertEquals(2, featureList1.count(Pred2.EQ, featureList1, false));
		// count2
		assertEquals(1, featureList1.count(Pred2.LT, featureList2, false));
		// count2
		assertEquals(2, featureList1.count(Pred2.LE, featureList2, false));
		
		testFeatures(FeatureListImpl.valueOf("f1", 0.0, "f2", 4.0), "f1", 0.0, "f2", 4.0);
		testFeatures(FeatureListImpl.valueOf("[f1:0.0 f2:4.0]"), "f1", 0.0, "f2", 4.0);
	}

	public void testConstantFeatureList() {
		ConstantFeatureList constantList = FvFactory.eINSTANCE.createConstantFeatureList();
		constantList.getFeatureNames().addAll(Arrays.asList("f1", "f2"));
		constantList.setVal(42);
		testFeatures(constantList, "f1", 42.0, "f2", 42.0);
	}

	public void testDerivedFeatures1() {
		FeatureList featureList1 = toFeatureList("f1", 1.0, "f2", 2.0);
		DerivedFeatures1 derivedFeatures = FvFactory.eINSTANCE.createDerivedFeatures1();
		derivedFeatures.setOp(Op2Kind.PLUS);
		derivedFeatures.setVal(3.0);
		derivedFeatures.setOther(featureList1);
		testFeatures(derivedFeatures, "f1", 4.0, "f2", 5.0);
	}
	
	public void testDerivedFeaturesN() {
		FeatureList featureList1 = toFeatureList("f1", 1.0, "f2", 2.0);
		FeatureList featureList2 = toFeatureList("f1", 3.0, "f2", 4.0);
		DerivedFeaturesN derivedFeatures = FvFactory.eINSTANCE.createDerivedFeaturesN();
		derivedFeatures.setOp(Op2Kind.PLUS);
		derivedFeatures.setVal(0.0);
		derivedFeatures.getOthers().add(featureList1);
		testFeatures(derivedFeatures, "f1", 1.0, "f2", 2.0);
		derivedFeatures.getContained().add(featureList2);
		testFeatures(derivedFeatures, "f1", 4.0, "f2", 6.0);
		derivedFeatures.getOthers().add(featureList2);
		testFeatures(derivedFeatures, "f1", 4.0, "f2", 6.0);
	}
	
	public void testFilteredFeatures1() {
		FeatureList featureList1 = toFeatureList("f1", 0.0, "f2", 2.0);
		FilteredFeatures1 filteredFeatures = FvFactory.eINSTANCE.createFilteredFeatures1();
		filteredFeatures.setPred(Pred1Kind.GT0);
		filteredFeatures.setOther(featureList1);
		assertEquals(Arrays.asList("f2"), filteredFeatures.getFeatureNames());
		testFeatures(filteredFeatures, "f2", 2.0);
	}
	
	public void testFilteredFeatures2() {
		FeatureList featureList1 = toFeatureList("f1", 0.0, "f2", 2.0);
		FilteredFeatures2 filteredFeatures = FvFactory.eINSTANCE.createFilteredFeatures2();
		filteredFeatures.setPred(Pred2Kind.EQ);
		filteredFeatures.setVal(2.0);
		filteredFeatures.setOther(featureList1);
		assertEquals(Arrays.asList("f2"), filteredFeatures.getFeatureNames());
		testFeatures(filteredFeatures, "f2", 2.0);
		
		FeatureValued filterFeatures = toFeatureList("f1", -1.0, "f2", 3.0);
		filteredFeatures.setValFeatures(filterFeatures);
		filteredFeatures.setPred(Pred2Kind.GT);
		assertEquals(Arrays.asList("f1"), filteredFeatures.getFeatureNames());		
		testFeatures(filteredFeatures, "f1", 0.0);
	}

	public void testExpressionFeatures() {
		FeatureList featureList = toFeatureList("f1", 1.0, "f2", 2.0);
		ExpressionFeatures expressionFeatures = FvFactory.eINSTANCE.createExpressionFeatures();
		expressionFeatures.setOther(featureList);
		expressionFeatures.getFeatures().put("sum", "f1 + f2");
		expressionFeatures.getFeatures().put("product", "f1 * f2");
		testFeatures(expressionFeatures, "sum", 3.0, "product", 2.0);
		FeatureListTest.testHasntFeatures(expressionFeatures, "f1", "f2");
	}
}
