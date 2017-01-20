package no.hal.learning.exercise.views.stringeditors;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import no.hal.learning.exercise.ExerciseProposals;

public class EditorViewerAdapterFactory extends AdapterFactoryImpl {

	@Override
	public boolean isFactoryForType(Object type) {
		return EditorViewerAdapter.class.equals(type);
	}
	
	@Override
	@SuppressWarnings("unchecked")
	protected Adapter createAdapter(Notifier target) {
		if (target instanceof ExerciseProposals) {
			return new EditorViewerAdapter((ExerciseProposals) target);
		}
		return null;
	}
}
