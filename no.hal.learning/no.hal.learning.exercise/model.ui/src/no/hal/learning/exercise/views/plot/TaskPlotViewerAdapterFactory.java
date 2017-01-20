package no.hal.learning.exercise.views.plot;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import no.hal.learning.exercise.ExerciseProposals;

public class TaskPlotViewerAdapterFactory extends AdapterFactoryImpl {

	@Override
	public boolean isFactoryForType(Object type) {
		return TaskPlotViewerAdapter.class.equals(type);
	}
	
	@Override
	@SuppressWarnings("unchecked")
	protected Adapter createAdapter(Notifier target) {
		if (target instanceof ExerciseProposals) {
			return new TaskPlotViewerAdapter((ExerciseProposals) target);
		}
		return null;
	}
}
