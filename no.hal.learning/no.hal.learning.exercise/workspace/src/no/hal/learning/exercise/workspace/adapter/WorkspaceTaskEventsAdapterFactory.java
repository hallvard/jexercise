package no.hal.learning.exercise.workspace.adapter;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import no.hal.learning.exercise.plugin.AbstractTaskEventsAdapterFactory;
import no.hal.learning.exercise.workspace.LaunchAnswer;
import no.hal.learning.exercise.workspace.SourceFileEditAnswer;
import no.hal.learning.exercise.workspace.SourceFileEditEvent;
import no.hal.learning.exercise.workspace.SourceFileEditProposal;
import no.hal.learning.exercise.workspace.WorkspacePackage;

public class WorkspaceTaskEventsAdapterFactory extends AbstractTaskEventsAdapterFactory {

	@Override
	public boolean isFactoryForType(Object type) {
		return WorkspacePackage.eINSTANCE == type;
	}

	@Override
	  protected Adapter createAdapter(Notifier target) {
  		if (target instanceof SourceFileEditProposal) {
  			return new SourceFileEditEventsAdapter<SourceFileEditAnswer, SourceFileEditEvent>();
  		} else if (target instanceof LaunchTaskProposalAdapter<?>) {
  			return new LaunchEventsAdapter<LaunchAnswer>();			
  		}
		return null;
	}
}
