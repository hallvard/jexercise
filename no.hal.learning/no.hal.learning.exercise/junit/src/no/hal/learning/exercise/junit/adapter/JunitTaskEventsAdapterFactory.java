package no.hal.learning.exercise.junit.adapter;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import no.hal.learning.exercise.junit.JunitTestAnswer;
import no.hal.learning.exercise.junit.JunitTestProposal;
import no.hal.learning.exercise.plugin.AbstractTaskEventsAdapterFactory;

public class JunitTaskEventsAdapterFactory extends AbstractTaskEventsAdapterFactory {

	@Override
	public boolean isFactoryForType(Object type) {
		return isFactoryForType(type, JunitTestAnswer.class);
	}
	
	@Override
	@SuppressWarnings("unchecked")
	protected Adapter createAdapter(Notifier target) {
		if (target instanceof JunitTestProposal) {
			return new JunitTestEventsAdapter();
		}
		return null;
	}
}
