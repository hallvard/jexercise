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
import no.hal.learning.exercise.logging.LogUtil;
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
				LogUtil.info("Auto-saved resources", null);
			}
		}
	};
	
	private ExLogger exLogger;
	
	private static Map<String, Object> logOptions = new HashMap<String, Object>();
	static {
		logOptions.put(Resource.OPTION_ZIP, Boolean.TRUE);
	}
	
	public static Map<String, Object> getLogOptions() {
		return logOptions;
	}

	protected String getClientId() {
		return ResourcesPlugin.getWorkspace().getRoot().getLocation().toString().replace("/", "_");
	}
	
	private FileChangeHandler exFileChangeHandler = new FileChangeHandler("ex") {
		@Override
		protected void fileChanged(IFile file) {
			Resource resource = getEObjectResource(file.getFullPath());
			if (resource != null) {
				ByteArrayOutputStream output = new ByteArrayOutputStream();
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

//	private URI createMqttUri(String exPath, String id) {
//		if (exPath.startsWith("/")) {
//			exPath = exPath.substring(1);
//		}
//		if (! exPath.endsWith(".ex")) {
//			exPath = exPath + ".ex";
//		}
//		String prefix = ExerciseView.class.getName();
//		if (! exPath.startsWith(prefix)) {
//			exPath = prefix + "/" + exPath;
//		}
//		return URI.createURI("mqtt://mqtt.idi.ntnu.no:1883/" + exPath + "/" + id);
//	}
//
//	private Action openLoggedExAction = new Action("Open Logged Ex") {
//		public void run() {
//			InputDialog inputDialog = new InputDialog(getSite().getShell(), "Open Logged Ex", "Enter Mqtt Topic", "package/file.ex/ID", new IInputValidator() {
//				
//				private boolean isInt(String s) {
//					Integer i = null;
//					try {
//						i = Integer.valueOf(s);
//					} catch (NumberFormatException e) {
//					}
//					return i != null;
//				}
//				
//				@Override
//				public String isValid(String s) {
//					int pos = s.lastIndexOf("/");
//					if (pos < 3 || (! ".ex".equals(s.substring(pos - 3, pos))) || pos >= s.length() - 1 || (! isInt(s.substring(pos + 1)))) {
//						return "Incorrect format, must be package/file.ex/INT";
//					}
//					return null;
//				}
//			});
//			if (inputDialog.open() != Window.OK) {
//				return;
//			}
//			String s = inputDialog.getValue();
//			int pos = s.lastIndexOf("/");
//			String path = s.substring(0, pos), id = s.substring(pos + 1);
//			URI uri = createMqttUri(path, id);
//			if (uri != null) {
//				Resource resource = new ExerciseResourceFactoryImpl().createResource(uri);
//				try {
//					resource.load(new MqttURIHandlerImpl().createInputStream(uri, logOptions), logOptions);
//				} catch (IOException e) {
//					throw new RuntimeException(e);
//				}
//				addAcceptedEObject(resource);
//			}
//		}
//	};
//	
//	@Override
//	protected void addActions(IActionBars actionBars) {
//		super.addActions(actionBars);
//		actionBars.getMenuManager().add(openLoggedExAction);
//	}
}
