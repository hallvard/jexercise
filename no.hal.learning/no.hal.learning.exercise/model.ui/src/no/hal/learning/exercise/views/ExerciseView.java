package no.hal.learning.exercise.views;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import no.hal.emf.ui.parts.EObjectsView;
import no.hal.emf.ui.parts.adapters.EObjectViewerAdapter;
import no.hal.learning.exercise.Exercise;
import no.hal.learning.exercise.ExerciseProposals;
import no.hal.learning.exercise.views.adapters.ExerciseProposalsUIAdapter;
import no.hal.learning.exercise.views.plot.TaskPlotViewerAdapter;
import no.hal.learning.exercise.views.stringeditors.EditorViewerAdapter;

public class ExerciseView extends EObjectsView {

	public ExerciseView() {
		super((Class<? extends EObjectViewerAdapter<?, ?>>) ExerciseProposalsUIAdapter.class);
		addAdapterClass(TaskPlotViewerAdapter.class, "plot view", "plotview.png");
		addAdapterClass(EditorViewerAdapter.class, "editor view", "stringeditor.png");
	}

	public void addExercise(ExerciseProposals proposals) {
		super.addEObject(proposals);
		autoSave(proposals, 1, true);
	}

	public void addExercise(Exercise ex, boolean select) {
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
		addExercise(proposals);
		if (select) {
			selectEObjectTab(proposals);
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

//	private IAction plotAction = new Action("Plot") {
//		public void run() {
//			EObject currentEObject = getCurrentEObject();
//			if (currentEObject instanceof ExerciseProposals) {
//				showPlot((ExerciseProposals) currentEObject);
//			}
//		}
//	};
//
//	protected void addActions(IActionBars actionBars) {
//		super.addActions(actionBars);
//		actionBars.getToolBarManager().add(plotAction);
//	}
//	
//	private void showPlot(ExerciseProposals proposals) {
//		PlotDialog2 plotDialog = new PlotDialog2(null, proposals);
//		plotDialog.open();
//	}
}
