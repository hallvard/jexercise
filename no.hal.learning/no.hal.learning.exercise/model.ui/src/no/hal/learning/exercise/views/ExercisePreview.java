package no.hal.learning.exercise.views;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.part.ViewPart;

import no.hal.emf.ui.parts.adapters.EObjectViewerAdapter;
import no.hal.emf.ui.parts.adapters.EObjectViewerAdapterHelper;
import no.hal.learning.exercise.views.adapters.ExerciseUIAdapter;

public class ExercisePreview extends ViewPart  {

	private Class<? extends EObjectViewerAdapter<?, ?>> viewAdapterClass;

	private EObject eObject;

	public ExercisePreview() {
		viewAdapterClass = (Class<? extends EObjectViewerAdapter<?, ?>>) ExerciseUIAdapter.class;
	}

	private FileChangeHandler exFileChangeHandler = new FileChangeHandler("ex") {
		@Override
		protected void fileChanged(IFile file) {
//			Resource resource = getEObjectResource(file.getFullPath());
//			if (resource != null) {
//			}
		}
	};

	private EObjectViewerAdapterHelper adapterHelper = new EObjectViewerAdapterHelper();

	private Control control;

	@Override
	public void createPartControl(Composite parent) {
		EObjectViewerAdapter<?, ?> adapter = (EObjectViewerAdapter<?, ?>) EcoreUtil.getAdapter(eObject.eAdapters(), viewAdapterClass);
		control = (adapter == null ? adapterHelper.initView(eObject, viewAdapterClass, parent) : adapter.getView());
		ResourcesPlugin.getWorkspace().addResourceChangeListener(exFileChangeHandler, IResourceChangeEvent.POST_CHANGE);
	}
	
	@Override
	public void dispose() {
		ResourcesPlugin.getWorkspace().removeResourceChangeListener(exFileChangeHandler);
		super.dispose();
	}

	@Override
	public void setFocus() {
		if (control != null) {
			control.setFocus();
		}
	}
}
