package no.hal.learning.exercise.adm;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.swt.widgets.Composite;

public abstract class AbstractPlotPane {

	public abstract void createControls(Composite composite);
	
	public abstract void updatePlot(ResourceSet resourceSet);
}
