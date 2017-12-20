package no.hal.sharing.exercise;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import no.hal.learning.exercise.Exercise;
import no.hal.learning.exercise.ExerciseProposals;
import no.hal.sharing.PublishingAdapter;

public class ExercisePublishingAdapterFactory extends AdapterFactoryImpl {

	@Override
	public boolean isFactoryForType(Object type) {
		return PublishingAdapter.class.equals(type);
	}
	
	@Override
	protected Adapter createAdapter(Notifier target) {
		if (target instanceof Exercise || target instanceof ExerciseProposals) {
			return new ExercisePublishingAdapter();
		}
		return null;
	}
}
