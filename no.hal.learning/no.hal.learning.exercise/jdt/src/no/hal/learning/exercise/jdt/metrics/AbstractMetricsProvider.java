package no.hal.learning.exercise.jdt.metrics;

import java.util.Scanner;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.jdt.core.ICompilationUnit;

import no.hal.learning.fv.DelegatedFeatures;
import no.hal.learning.fv.FeatureList;
import no.hal.learning.fv.FeatureValued;
import no.hal.learning.fv.FvFactory;

public abstract class AbstractMetricsProvider implements IMetricsProvider {

	protected FeatureValued createNamedFeatures(final String name, final FeatureValued fv) {
		final DelegatedFeatures df = FvFactory.eINSTANCE.createDelegatedFeatures();
		df.setName(name);
		df.setFeatures(fv);
		return df;
	}

	protected FeatureList createFeatureList() {
		return FvFactory.eINSTANCE.createFeatureList();
	}

	protected void addFeature(final FeatureList fv, final String name, final double value) {
		fv.getFeatures().put(name, value);
	}

	protected FeatureValued createFeatureList(final String name, final String featureName, final double value) {
		final FeatureList fl = createFeatureList();
		addFeature(fl, name, value);
		return createNamedFeatures(name, fl);
	}

	//

	public static String getFileContents(final IFile file) {
		try {
			final Scanner scanner = new Scanner(file.getContents());
			final StringBuilder buffer = new StringBuilder();
			while (scanner.hasNextLine()) {
				buffer.append(scanner.nextLine());
				buffer.append("\n");
			}
			scanner.close();
			return buffer.toString();
		} catch (final CoreException e) {
			return null;
		}
	}

	public static void addMetrics(final ICompilationUnit cu, final EMap<String, FeatureValued> featuresMap) {
		addMetrics(getFileContents((IFile) cu.getResource()), cu, featuresMap);
	}

	public static void addMetrics(final String source, final ICompilationUnit cu, final EMap<String, FeatureValued> featuresMap) {
		for (final String metricsName : Activator.getInstance().getMetricsProviderNames()) {
			final IMetricsProvider metricsProvider = Activator.getInstance().getMetricsProvider(metricsName);
			final FeatureValued metricsFeatures = metricsProvider.computeMetrics(source);
			featuresMap.put(metricsName, metricsFeatures);
		}
	}
}
