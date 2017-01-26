package no.hal.learning.exercise.views;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.swt.widgets.Composite;

import no.hal.emf.ui.parts.EObjectsView;
import no.hal.emf.ui.parts.adapters.EObjectViewerAdapter;
import no.hal.learning.exercise.Exercise;
import no.hal.learning.exercise.ExerciseProposals;
import no.hal.learning.exercise.logging.ExLogger;
import no.hal.learning.exercise.views.adapters.ExerciseProposalsUIAdapter;
import no.hal.learning.exercise.views.plot.TaskPlotViewerAdapter;
import no.hal.learning.exercise.views.stringeditors.EditorViewerAdapter;

public class ExerciseView extends EObjectsView {

	public ExerciseView() {
		super((Class<? extends EObjectViewerAdapter<?, ?>>) ExerciseProposalsUIAdapter.class);
		addAdapterClass(TaskPlotViewerAdapter.class, "plot view", "plotview.png");
		addAdapterClass(EditorViewerAdapter.class, "editor view", "stringeditor.png");
	}

	@Override
	protected EObject accept(EObject eObject) {
		if (eObject instanceof Exercise) {
			Exercise ex = (Exercise) eObject;
			Resource resource = ex.eResource();
			URI uri = resource.getURI();
			if (resource != null && "xex".equals(uri.fileExtension())) {
				ResourceSet resourceSet = resource.getResourceSet();
				if (resourceSet == null) {
					resourceSet = new ResourceSetImpl();
				}
				Resource exResource = resourceSet.createResource(uri.trimFileExtension().appendFileExtension("ex"));
				exResource.getContents().addAll(resource.getContents());
				resourceSet.getResources().remove(resource);
				resourceSet.getResources().add(exResource);
			}
			ExerciseProposals proposals = findProposals(ex);
			if (proposals == null) {
				proposals = ex.createProposals();
				resource.getContents().add(proposals);
			}
			return proposals;
		} else if (eObject instanceof ExerciseProposals) {
			return eObject;
		}
		return null;
	}

	protected void addEObject(EObject eObject) {
		if (eObject instanceof ExerciseProposals) {
			super.addEObject(eObject);
//			autoSave(eObject, 1, true);
		}
	}

	protected ExerciseProposals findProposals(Exercise ex) {
		Resource resource = ex.eResource();
		for (EObject eObject : resource.getContents()) {
			if (eObject instanceof ExerciseProposals) {
				ExerciseProposals proposals = (ExerciseProposals) eObject;
				if (proposals.getExercise() == ex) {
					return proposals;
				}
			}
		}
		return null;
	}

	private IResourceChangeListener autoSaveListener = new IResourceChangeListener() {
		@Override
		public void resourceChanged(IResourceChangeEvent event) {
			if (event.getType() == IResourceChangeEvent.POST_BUILD) {
				saveEObjectResources(saveOptions);
			}
		}
	};
	
	private ExLogger exLogger;
	
	protected String getClientId() {
		return ResourcesPlugin.getWorkspace().getRoot().getLocation().toString().replace("/", "_");
	}
	
	private FileChangeHandler exFileChangeHandler = new FileChangeHandler("ex") {
		@Override
		protected void fileChanged(IFile file) {
			Resource resource = getEObjectResource(file.getFullPath());
			if (resource != null) {
				ByteArrayOutputStream output = new ByteArrayOutputStream();
				Map<String, Object> logOptions = new HashMap<String, Object>();
				logOptions.put(Resource.OPTION_ZIP, Boolean.TRUE);
				try {
					resource.save(output, logOptions);
					if (exLogger == null) {
						exLogger = new ExLogger(getClientId(), ExerciseView.class.getName());
					}
					exLogger.enqueue(resource.getURI(), output.toByteArray());
				} catch (IOException e) {
				}
			}
		}
	};

	@Override
	public void createPartControl(Composite parent) {
		super.createPartControl(parent);
		ResourcesPlugin.getWorkspace().addResourceChangeListener(autoSaveListener, IResourceChangeEvent.POST_BUILD);
		ResourcesPlugin.getWorkspace().addResourceChangeListener(exFileChangeHandler, IResourceChangeEvent.POST_CHANGE);
	}
	
	@Override
	public void dispose() {
		ResourcesPlugin.getWorkspace().removeResourceChangeListener(exFileChangeHandler);
		ResourcesPlugin.getWorkspace().removeResourceChangeListener(autoSaveListener);
		super.dispose();
	}
}
