package no.hal.learning.exercise.plugin;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;

import no.hal.learning.exercise.Exercise;
import no.hal.learning.exercise.ExercisePackage;
import no.hal.learning.exercise.ExerciseProposals;
import no.hal.learning.exercise.TaskEventsAdapter;
import no.hal.learning.exercise.TaskProposal;
import no.hal.learning.exercise.util.Util;

public class TaskEventsRecorder {

	private ResourceSet resourceSet;
	
	public void startRecording() {
		for (IProject project : ResourcesPlugin.getWorkspace().getRoot().getProjects()) {
			IResource member = project.findMember(".ex");
			if (member instanceof IFile && member.exists()) {
				if (resourceSet == null) {
					resourceSet = new ResourceSetImpl();
				}
				URI uri = URI.createPlatformResourceURI(((IFile) member).getFullPath().toString(), true);
				resourceSet.getResource(uri, true);
			}
		}
		for (Resource resource : resourceSet.getResources()) {
			if ("ex".equals(resource.getURI().fileExtension())) {
				startRecording(resource);
			}
		}
	}

	private ComposedAdapterFactory adapterFactory = new ComposedAdapterFactory(ComposedAdapterFactory.Descriptor.Registry.INSTANCE);

	public void startRecording(Resource resource) {
		Exercise ex = (Exercise) EcoreUtil.getObjectByType(resource.getContents(), ExercisePackage.eINSTANCE.getExercise());
		if (ex != null) {
			// make sure we have a structure of proposals
			ExerciseProposals exerciseProposals = (ExerciseProposals) EcoreUtil.getObjectByType(resource.getContents(), ExercisePackage.eINSTANCE.getExerciseProposals());
			exerciseProposals = Util.ensureExerciseProposals(ex, exerciseProposals);
			if (exerciseProposals.eResource() == null) {
				resource.getContents().add(exerciseProposals);
			}
			// attach adapters that collect task events and populate lists of attempts
			TreeIterator<EObject> it = resource.getAllContents();
			while (it.hasNext()) {
				EObject next = it.next();
				if (next instanceof TaskProposal<?>) {
					Object adapterType = TaskEventsAdapter.class;
					Adapter adapter = EcoreUtil.getAdapter(next.eAdapters(), TaskEventsAdapter.class);
					if (adapter == null) {
						adapterFactory.adapt(next, adapterType);
					}
					it.prune();
				}
			}
		}
	}

	public Collection<TaskProposal<?>> getRecordingProposals(TaskProposal<?> proposal) {
		Collection<TaskProposal<?>> taskProposals = new ArrayList<TaskProposal<?>>();
		Resource resource = getRecordingResource(proposal.eResource());
		TreeIterator<EObject> it = resource.getAllContents();
		while (it.hasNext()) {
			EObject next = it.next();
			if (next instanceof TaskProposal<?>) {
				TaskProposal<?> proposal2 = (TaskProposal<?>) next;
				if (proposal2.getAnswer().eClass() == proposal.getAnswer().eClass()) {
					taskProposals.add(proposal2);
				}
				it.prune();
			}
		}
		return taskProposals;
	}

	private Resource getRecordingResource(Resource resource) {
		if (resourceSet != null) {
			for (Resource resource2 : resourceSet.getResources()) {
				String path = resource2.getURI().trimSegments(1).toString();
				if (resource.getURI().toString().startsWith(path)) {
					return resource2;
				}
			}
		}
		return null;
	}

	public void stopRecording() {
		for (Resource resource : resourceSet.getResources()) {
			try {
				resource.save(null);
			} catch (IOException e) {
			}
			resource.unload();
		}
	}
}
