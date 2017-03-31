package no.hal.learning.exercise.adm;

import org.eclipse.emf.ecore.resource.Resource;

public class ExResourceChartLabelProvider extends PathViewerLabelProvider {

	@Override
	public String getText(Object element) {
		if (element instanceof Resource) {
			return ExResourcesChartView.getStudentId((Resource) element);
		}
		return super.getText(element);
	}
}
