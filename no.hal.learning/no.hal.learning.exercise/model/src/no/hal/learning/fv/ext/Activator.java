package no.hal.learning.fv.ext;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

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
import no.hal.learning.fv.Op1Kind;
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
	public void start(final BundleContext context) throws Exception {
		Activator.INSTANCE = this;
	}

	@Override
	public void stop(final BundleContext context) throws Exception {
		Activator.INSTANCE = null;
	}

	//

	private Map<String, ITaskEventFeaturesProvider> taskEventFeaturesProviders = null;

	protected void ensureTaskEventFeaturesProviders() {
		if (taskEventFeaturesProviders == null) {
			taskEventFeaturesProviders = new HashMap<String, ITaskEventFeaturesProvider>();
		}
		processTaskEventFeaturesProviderExtension();
	}

	public String[] getTaskEventFeaturesProviderNames() {
		ensureTaskEventFeaturesProviders();
		return taskEventFeaturesProviders.keySet().toArray(new String[0]);
	}

	public ITaskEventFeaturesProvider getTaskEventFeaturesProvider(final String name) {
		ensureTaskEventFeaturesProviders();
		return taskEventFeaturesProviders.get(name);
	}

	private void processTaskEventFeaturesProviderExtension() {
		final IExtensionPoint ep = Platform.getExtensionRegistry().getExtensionPoint("no.hal.learning.exercise.model.taskEventFeaturesProvider");
		final IExtension[] extensions = ep.getExtensions();
		for (int i = 0; i < extensions.length; i++) {
			for (final IConfigurationElement ces: extensions[i].getConfigurationElements()) {
				final String name = ces.getName();
				if ("taskEventFeaturesProvider".equals(name)) {
					try {
						final ITaskEventFeaturesProvider taskEventFeaturesProvider = (ITaskEventFeaturesProvider) ces.createExecutableExtension("providerClass");
						taskEventFeaturesProviders.put(ces.getAttribute("name"), taskEventFeaturesProvider);
					} catch (final Exception e) {
						System.err.println(e);
					}
				}
			}
		}
	}

	//

	private Collection<ITaskEventFeaturesViewProvider> taskEventFeaturesViewProviders = null;

	public ITaskEventFeaturesViewProvider[] getTaskEventFeaturesViewProviders() {
		ensureTaskEventFeaturesProviders();
		return taskEventFeaturesViewProviders.toArray(new ITaskEventFeaturesViewProvider[0]);
	}

	protected void ensureTaskEventFeaturesViewProviders() {
		if (taskEventFeaturesViewProviders == null) {
			taskEventFeaturesViewProviders = new ArrayList<ITaskEventFeaturesViewProvider>();
		}
		processTaskEventFeaturesViewProviderExtension();
	}

	private void processTaskEventFeaturesViewProviderExtension() {
		final IExtensionPoint ep = Platform.getExtensionRegistry().getExtensionPoint("no.hal.learning.exercise.model.taskEventFeaturesViewProvider");
		final IExtension[] extensions = ep.getExtensions();
		for (int i = 0; i < extensions.length; i++) {
			for (final IConfigurationElement ces: extensions[i].getConfigurationElements()) {
				final String elementName = ces.getName();
				if ("taskEventFeaturesViewProvider".equals(elementName)) {
					try {
						ITaskEventFeaturesViewProvider taskEventFeaturesViewProvider = null;
						if (ces.getAttribute("providerClass") != null) {
							taskEventFeaturesViewProvider = (ITaskEventFeaturesViewProvider) ces.createExecutableExtension("providerClass");
						} else {
							taskEventFeaturesViewProvider = new DefaultTaskEventFeaturesViewProvider();
						}
						if (taskEventFeaturesViewProvider instanceof DefaultTaskEventFeaturesViewProvider) {
							final DefaultTaskEventFeaturesViewProvider taskEventFeaturesProvider2 = (DefaultTaskEventFeaturesViewProvider) taskEventFeaturesViewProvider;
							taskEventFeaturesProvider2.setName(ces.getAttribute("name"));
							final Collection<FeatureValued> childFeatures = parseChildFeatures(ces);
							taskEventFeaturesProvider2.setFeatures(childFeatures.iterator().next());
						}
						taskEventFeaturesViewProviders.add(taskEventFeaturesViewProvider);
					} catch (final Exception e) {
						System.err.println(e);
					}
				}
			}
		}
	}

	private final String separatorPattern = "([,]|\\s)\\s*";

	protected FeatureValued parseFeatures(final IConfigurationElement ces) {
		if ("constant".equals(ces.getName())) {
			final ConstantFeatureList cfl = FvFactory.eINSTANCE.createConstantFeatureList();
			final String[] featureNames = getStringsAttribute(ces, "names");
			cfl.getFeatureNames().addAll(Arrays.asList(featureNames));
			cfl.setVal(Double.valueOf(getAttribute(ces, "val", "0.0")));
			cfl.setVal(Double.valueOf(getAttribute(ces, "defVal", "0.0")));
			return cfl;
		} else if ("list".equals(ces.getName())) {
			final FeatureList fl = FeatureListImpl.valueOf(ces.getAttribute("values"));
			final String name = ces.getAttribute("name");
			final DelegatedFeatures df = FvFactory.eINSTANCE.createDelegatedFeatures();
			df.setName(name);
			df.setFeatures(fl);
			return df;
		} else if ("derived".equals(ces.getName())) {
			OpDerivedFeatures df = null;
			final Collection<FeatureValued> childFeatures = parseChildFeatures(ces);
			if (childFeatures.size() == 1) {
				final DerivedFeatures1 df1 = FvFactory.eINSTANCE.createDerivedFeatures1();
				df1.setOther(childFeatures.iterator().next());
				df = df1;
			} else {
				final DerivedFeaturesN dfN = FvFactory.eINSTANCE.createDerivedFeaturesN();
				dfN.getOthers().addAll(childFeatures);
				df = dfN;
			}
			df.getContained().addAll(childFeatures);
			final String opAttr = getAttribute(ces, "operation", "+");
			Op2Kind op = Op2Kind.get(opAttr);
			if (op == null) {
				op = Op2Kind.getByName(opAttr);
			}
			df.setOp(op);
			final String op1Attr = getAttribute(ces, "operation1", "+");
			Op1Kind op1 = Op1Kind.get(op1Attr);
			if (op1 == null) {
				op1 = Op1Kind.getByName(op1Attr);
			}
			df.setOp1(op1);
			df.setVal(Double.valueOf(getAttribute(ces, "val", "0.0")));
			final boolean swap = Boolean.valueOf(ces.getAttribute("swap"));
			df.setSwap(swap);
			return df;
		} else if ("filtered".equals(ces.getName())) {
			FilteredFeatures ff = null;
			final Collection<FeatureValued> childFeatures = parseChildFeatures(ces);
			final String predAttr = getAttribute(ces, "predicate", "=");
			final Iterator<FeatureValued> it = childFeatures.iterator();
			if (childFeatures.size() == 1) {
				final FilteredFeatures1 ff1 = FvFactory.eINSTANCE.createFilteredFeatures1();
				ff1.setOther(it.next());
				Pred1Kind pred = Pred1Kind.get(predAttr);
				if (pred == null) {
					pred = Pred1Kind.getByName(predAttr);
				}
				ff1.setPred(pred);
				ff = ff1;
			} else {
				final FilteredFeatures2 ff2 = FvFactory.eINSTANCE.createFilteredFeatures2();
				ff2.setOther(it.next());
				ff2.setValFeatures(it.next());
				Pred2Kind pred = Pred2Kind.get(predAttr);
				if (pred == null) {
					pred = Pred2Kind.getByName(predAttr);
				}
				ff2.setPred(pred);
				ff2.setVal(Double.valueOf(getAttribute(ces, "val", "0.0")));
				final boolean swap = Boolean.valueOf(ces.getAttribute("swap"));
				ff2.setSwap(swap);
				ff = ff2;
			}
			ff.getContained().addAll(childFeatures);
			return ff;
		} else if ("features".equals(ces.getName())) {
			final DelegatedFeatures df = FvFactory.eINSTANCE.createDelegatedFeatures();
			df.setName(ces.getAttribute("ref"));
			df.setFeatures(FvFactory.eINSTANCE.createFeatureList());
			return df;
		} else if ("expressions".equals(ces.getName())) {
			final ExpressionFeatures ef = FvFactory.eINSTANCE.createExpressionFeatures();
			final Collection<FeatureValued> childFeatures = parseChildFeatures(ces);
			ef.setOther(childFeatures.iterator().next());
			final String[] expressions = getStringsAttribute(ces, "expressions");
			for (int i = 0; i < expressions.length; i++) {
				final String expr = expressions[i];
				final int pos = expr.indexOf('=');
				ef.getFeatures().put(expr.substring(0, pos), expr.substring(pos + 1));
			}
			ef.getContained().addAll(childFeatures);
			return ef;
		}
		return null;
	}

	protected String[] getStringsAttribute(final IConfigurationElement ces, final String attrName) {
		return ces.getAttribute(attrName).split(separatorPattern);
	}

	protected Collection<FeatureValued> parseChildFeatures(final IConfigurationElement ces) {
		final Collection<FeatureValued> childFeatures = new ArrayList<FeatureValued>();
		for (final IConfigurationElement child : ces.getChildren()) {
			final FeatureValued fv = parseFeatures(child);
			if (fv != null) {
				childFeatures.add(fv);
			}
		}
		return childFeatures;
	}

	protected String getAttribute(final IConfigurationElement ces, final String attrName, final String def) {
		final String attr = ces.getAttribute(attrName);
		return attr != null ? attr : def;
	}
}
