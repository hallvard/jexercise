package no.hal.learning.exercise.jdt.metrics;

import java.util.Scanner;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.jdt.core.ICompilationUnit;

import no.hal.learning.exercise.jdt.Activator;
import no.hal.learning.fv.FeatureList;
import no.hal.learning.fv.FeatureValued;
import no.hal.learning.fv.FvFactory;

public abstract class AbstractMetricsProvider implements IMetricsProvider {
	
	protected FeatureList createFeatureList() {
		return FvFactory.eINSTANCE.createFeatureList();
	}
	
	protected void addFeature(FeatureList fv, String name, double value) {
		fv.getFeatures().put(name, value);
	}

	protected FeatureList createFeatureList(String name, double value) {
		FeatureList fv = createFeatureList();
		addFeature(fv, name, value);
		return fv;
	}

	//

	public static String getFileContents(IFile file) {
		try {
			Scanner scanner = new Scanner(file.getContents());
			StringBuilder buffer = new StringBuilder();
			while (scanner.hasNextLine()) {
				buffer.append(scanner.nextLine());
				buffer.append("\n");
			}
			scanner.close();
			return buffer.toString();
		} catch (CoreException e) {
			return null;
		}
	}
	
	public static void addMetrics(ICompilationUnit cu, EMap<String, FeatureValued> featuresMap) {
		addMetrics(getFileContents((IFile) cu.getResource()), cu, featuresMap);
	}

	public static void addMetrics(String source, ICompilationUnit cu, EMap<String, FeatureValued> featuresMap) {
		for (String metricsName : Activator.getInstance().getMetricsProviderNames()) {
			IMetricsProvider metricsProvider = Activator.getInstance().getMetricsProvider(metricsName);
			FeatureValued metricsFeatures = metricsProvider.computeMetrics(source);
			featuresMap.put(metricsName, metricsFeatures);
		}
	}
}
