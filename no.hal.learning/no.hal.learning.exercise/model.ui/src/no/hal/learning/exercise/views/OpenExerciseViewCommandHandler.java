package no.hal.learning.exercise.views;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;

import no.hal.emf.ui.commands.EmfResourceObjectsCommandHandler;
import no.hal.learning.exercise.Exercise;
import no.hal.learning.exercise.ExercisePackage;

public class OpenExerciseViewCommandHandler extends EmfResourceObjectsCommandHandler<Exercise> {

	@Override
	protected EClass getEObjectClass() {
		return ExercisePackage.eINSTANCE.getExercise();
	}
	
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		return super.execute(event);
	}

	@Override
	protected void execute(IFile file, Exercise ex, IContainer target) throws ExecutionException {
		try {
			IWorkbenchPage page = activeWindow.getActivePage();
			ExerciseView view = (ExerciseView) page.showView(ExerciseView.class.getName());
			EObject accepted = view.accept(ex);
			if (accepted != null) {
				view.addEObject(accepted);
				view.selectEObjectTab(accepted);
			}
			page.activate(view);
		} catch (PartInitException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public boolean isEnabled() {
		return super.isEnabled();
	}

	@Override
	protected IContainer getTargetContainer(IFile resource) {
		return null;
	}

	@Override
	protected boolean isEmfFileExtension(String ext) {
		return "ex".equals(ext) || "xex".equals(ext);
	}
}
