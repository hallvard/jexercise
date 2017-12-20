package no.hal.learning.exercise.jdt.adapter;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import no.hal.learning.exercise.jdt.JdtLaunchAnswer;
import no.hal.learning.exercise.jdt.JdtLaunchProposal;
import no.hal.learning.exercise.jdt.JdtSourceEditAnswer;
import no.hal.learning.exercise.jdt.JdtSourceEditProposal;
import no.hal.learning.exercise.plugin.AbstractTaskEventsAdapterFactory;

public class JdtTaskEventsAdapterFactory extends AbstractTaskEventsAdapterFactory {

	@Override
	public boolean isFactoryForType(Object type) {
		return isFactoryForType(type, JdtSourceEditAnswer.class, JdtLaunchAnswer.class);
	}
	
	@Override
	@SuppressWarnings("unchecked")
	protected Adapter createAdapter(Notifier target) {
		if (target instanceof JdtSourceEditProposal) {
			return new JdtEditEventsAdapter();
		} else if (target instanceof JdtLaunchProposal) {
			return new JdtLaunchEventsAdapter();
		}
		return null;
	}
}
