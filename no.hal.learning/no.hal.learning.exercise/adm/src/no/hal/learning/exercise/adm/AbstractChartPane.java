package no.hal.learning.exercise.adm;

import java.util.Collection;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.swt.widgets.Composite;

public abstract class AbstractChartPane {

	public abstract void createControls(Composite composite);
	
	public abstract void updateChart(Collection<Resource> resources);
}
