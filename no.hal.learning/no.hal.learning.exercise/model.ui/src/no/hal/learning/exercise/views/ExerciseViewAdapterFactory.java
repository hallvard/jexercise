package no.hal.learning.exercise.views;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import no.hal.learning.exercise.ExerciseProposals;
import no.hal.learning.exercise.views.plot.TaskProposalPlotViewerAdapter;

public class ExerciseViewAdapterFactory extends AdapterFactoryImpl {

	@Override
	public boolean isFactoryForType(Object type) {
		return TaskProposalPlotViewerAdapter.class.equals(type);
	}
	
	@Override
	@SuppressWarnings("unchecked")
	protected Adapter createAdapter(Notifier target) {
		if (target instanceof ExerciseProposals) {
			return new TaskProposalPlotViewerAdapter((ExerciseProposals) target);
		}
		return null;
	}
}
