package no.hal.learning.exercise.jdt.metrics.ui;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.IExtensionPoint;
import org.eclipse.core.runtime.Platform;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

import no.hal.learning.fv.ConstantFeatureList;
import no.hal.learning.fv.DelegatedFeatures;
import no.hal.learning.fv.DerivedFeatures1;
import no.hal.learning.fv.DerivedFeaturesN;
import no.hal.learning.fv.ExpressionFeatures;
import no.hal.learning.fv.FeatureList;
import no.hal.learning.fv.FeatureValued;
import no.hal.learning.fv.FilteredFeatures;
import no.hal.learning.fv.FilteredFeatures1;
import no.hal.learning.fv.FilteredFeatures2;
import no.hal.learning.fv.FvFactory;
import no.hal.learning.fv.Op2Kind;
import no.hal.learning.fv.OpDerivedFeatures;
import no.hal.learning.fv.Pred1Kind;
import no.hal.learning.fv.Pred2Kind;
import no.hal.learning.fv.impl.FeatureListImpl;

public class Activator implements BundleActivator {

	private static Activator INSTANCE;
	
	public static Activator getInstance() {
		return INSTANCE;
	}
	
	@Override
	public void start(BundleContext context) throws Exception {
		Activator.INSTANCE = this;
	}

	@Override
	public void stop(BundleContext context) throws Exception {
		Activator.INSTANCE = null;
	}
	
	private Collection<IMetricsViewProvider> metricsViewProviders = null;
	
	public IMetricsViewProvider[] getMetricsViewProviders() {
		ensureMetricsViewProviders();
		return metricsViewProviders.toArray(new IMetricsViewProvider[0]);
	}

	protected void ensureMetricsViewProviders() {
		if (metricsViewProviders == null) {
			metricsViewProviders = new ArrayList<IMetricsViewProvider>();
		}
		processMetricsProvidersExtension();
	}
	
	private void processMetricsProvidersExtension() {
		IExtensionPoint ep = Platform.getExtensionRegistry().getExtensionPoint("no.hal.learning.exercise.jdt.metrics.metricsViewProvider");
		IExtension[] extensions = ep.getExtensions();
		for (int i = 0; i < extensions.length; i++) {
			for (IConfigurationElement ces: extensions[i].getConfigurationElements()) {
				String elementName = ces.getName();
				if ("metricsViewProvider".equals(elementName)) {
					try {
						IMetricsViewProvider metricsViewProvider = null;
						if (ces.getAttribute("providerClass") != null) {
							metricsViewProvider = (IMetricsViewProvider) ces.createExecutableExtension("providerClass");
						} else {
							metricsViewProvider = new DefaultMetricsViewProvider();							
						}
						if (metricsViewProvider instanceof DefaultMetricsViewProvider) {
							DefaultMetricsViewProvider metricsViewProvider2 = (DefaultMetricsViewProvider) metricsViewProvider;
							metricsViewProvider2.setName(ces.getAttribute("name"));
							Collection<FeatureValued> childFeatures = parseChildFeatures(ces);
							metricsViewProvider2.setFeatures(childFeatures.iterator().next());
						}
						metricsViewProviders.add(metricsViewProvider);
					} catch (Exception e) {
						System.err.println(e);
					}
				}
			}
		}
	}

	private final String separatorPattern = "([,]|\\s)\\s*";
	
	protected FeatureValued parseFeatures(IConfigurationElement ces) {
		if ("constant".equals(ces.getName())) {
			ConstantFeatureList cfl = FvFactory.eINSTANCE.createConstantFeatureList();
			String[] featureNames = getStringsAttribute(ces, "names");
			cfl.getFeatureNames().addAll(Arrays.asList(featureNames));
			cfl.setVal(Double.valueOf(getAttribute(ces, "val", "0.0")));
			cfl.setVal(Double.valueOf(getAttribute(ces, "defVal", "0.0")));				
			return cfl;
		} else if ("list".equals(ces.getName())) {
			FeatureList fl = FeatureListImpl.valueOf(ces.getAttribute("values"));
			String name = ces.getAttribute("name");
			fl.setName(name);
			return fl;
		} else if ("derived".equals(ces.getName())) {
			OpDerivedFeatures df = null;
			Collection<FeatureValued> childFeatures = parseChildFeatures(ces);
			if (childFeatures.size() == 1) {
				DerivedFeatures1 df1 = FvFactory.eINSTANCE.createDerivedFeatures1();
				df1.setOther(childFeatures.iterator().next());
				df = df1;
			} else {
				DerivedFeaturesN dfN = FvFactory.eINSTANCE.createDerivedFeaturesN();
				dfN.getOthers().addAll(childFeatures);
				df = dfN;
			}
			df.getContained().addAll(childFeatures);
			String opAttr = getAttribute(ces, "operation", "+");
			Op2Kind op = Op2Kind.get(opAttr);
			if (op == null) {
				op = Op2Kind.getByName(opAttr);
			}
			df.setOp(op);
			df.setVal(Double.valueOf(getAttribute(ces, "val", "0.0")));
			boolean swap = Boolean.valueOf(ces.getAttribute("swap"));
			df.setSwap(swap);
			return df;
		} else if ("filtered".equals(ces.getName())) {
			FilteredFeatures ff = null;
			Collection<FeatureValued> childFeatures = parseChildFeatures(ces);
			String predAttr = getAttribute(ces, "predicate", "=");
			Iterator<FeatureValued> it = childFeatures.iterator();
			if (childFeatures.size() == 1) {
				FilteredFeatures1 ff1 = FvFactory.eINSTANCE.createFilteredFeatures1();
				ff1.setOther(it.next());
				Pred1Kind pred = Pred1Kind.get(predAttr);
				if (pred == null) {
					pred = Pred1Kind.getByName(predAttr);
				}
				ff1.setPred(pred);
				ff = ff1;
			} else {
				FilteredFeatures2 ff2 = FvFactory.eINSTANCE.createFilteredFeatures2();
				ff2.setOther(it.next());
				ff2.setValFeatures(it.next());
				Pred2Kind pred = Pred2Kind.get(predAttr);
				if (pred == null) {
					pred = Pred2Kind.getByName(predAttr);
				}
				ff2.setPred(pred);
				ff2.setVal(Double.valueOf(getAttribute(ces, "val", "0.0")));
				boolean swap = Boolean.valueOf(ces.getAttribute("swap"));
				ff2.setSwap(swap);
				ff = ff2;
			}
			ff.getContained().addAll(childFeatures);
			return ff;
		} else if ("features".equals(ces.getName())) {
			DelegatedFeatures df = FvFactory.eINSTANCE.createDelegatedFeatures();
			FeatureList fl = FvFactory.eINSTANCE.createFeatureList();
			fl.setName(ces.getAttribute("ref"));
			df.setFeatures(fl);
			return df;
		} else if ("expressions".equals(ces.getName())) {
			ExpressionFeatures ef = FvFactory.eINSTANCE.createExpressionFeatures();
			Collection<FeatureValued> childFeatures = parseChildFeatures(ces);
			ef.setOther(childFeatures.iterator().next());
			String[] expressions = getStringsAttribute(ces, "expressions");
			for (int i = 0; i < expressions.length; i++) {
				String expr = expressions[i];
				int pos = expr.indexOf('=');
				ef.getFeatures().put(expr.substring(0, pos), expr.substring(pos + 1));
			}
			ef.getContained().addAll(childFeatures);
			return ef;
		}
		return null;
	}

	protected String[] getStringsAttribute(IConfigurationElement ces, String attrName) {
		return ces.getAttribute(attrName).split(separatorPattern);
	}

	protected Collection<FeatureValued> parseChildFeatures(IConfigurationElement ces) {
		Collection<FeatureValued> childFeatures = new ArrayList<FeatureValued>();
		for (IConfigurationElement child : ces.getChildren()) {
			FeatureValued fv = parseFeatures(child);
			if (fv != null) {
				childFeatures.add(fv);
			}
		}
		return childFeatures;
	}
	
	protected String getAttribute(IConfigurationElement ces, String attrName, String def) {
		String attr = ces.getAttribute(attrName);
		return attr != null ? attr : def;
	}
}
