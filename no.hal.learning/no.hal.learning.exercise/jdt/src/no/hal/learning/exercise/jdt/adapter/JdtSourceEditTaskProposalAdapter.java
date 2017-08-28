package no.hal.learning.exercise.jdt.adapter;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.jdt.core.ElementChangedEvent;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.IElementChangedListener;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IJavaElementDelta;
import org.eclipse.jdt.core.IJavaModelMarker;
import org.eclipse.jdt.core.IPackageFragment;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.swt.widgets.Composite;

import no.hal.learning.exercise.MarkerInfo;
import no.hal.learning.exercise.TaskProposal;
import no.hal.learning.exercise.jdt.JdtFactory;
import no.hal.learning.exercise.jdt.JdtMarkerInfo;
import no.hal.learning.exercise.jdt.JdtSourceEditAnswer;
import no.hal.learning.exercise.jdt.JdtSourceEditEvent;
import no.hal.learning.exercise.jdt.metrics.AbstractASTMetricsProvider;
import no.hal.learning.exercise.workspace.adapter.AbstractSourceFileEditTaskProposalAdapter;
import no.hal.learning.fv.FeatureValued;

public class JdtSourceEditTaskProposalAdapter extends AbstractSourceFileEditTaskProposalAdapter<JdtSourceEditAnswer> {

	public JdtSourceEditTaskProposalAdapter(TaskProposal<JdtSourceEditAnswer> proposal) {
		super(proposal);
	}
	
	private JavaElementListener listener;
	
	@Override
	public Composite initView(final Composite parent) {
		if (! getAdapterHelper().isReadOnly(this)) {
			this.listener = new JavaElementListener();
			JavaCore.addElementChangedListener(listener, ElementChangedEvent.POST_CHANGE);
			ResourcesPlugin.getWorkspace().addResourceChangeListener(listener, IResourceChangeEvent.POST_BUILD);
		}
		return super.initView(parent);
	}

	@Override
	public void dispose() {
		if (listener != null) {
			JavaCore.removeElementChangedListener(listener);
			ResourcesPlugin.getWorkspace().removeResourceChangeListener(listener);
		}
		super.dispose();
	}

	String getQualifiedClassName(ICompilationUnit cu) {
		String elementName = cu.getElementName();
		String javaExt = ".java";
		if (elementName.endsWith(javaExt)) {
			elementName = elementName.substring(0, elementName.length() - javaExt.length());
		}
		IJavaElement element = cu.getParent();
		while (element instanceof IPackageFragment) {
			elementName = element.getElementName() + "." + elementName;
			element = element.getParent();
		}
		return elementName;
	}
	
	//

	@Override
	protected void setMarkerInfo(MarkerInfo markerInfo, IMarker marker) {
		super.setMarkerInfo(markerInfo, marker);
		if (markerInfo instanceof JdtMarkerInfo) {
			JdtMarkerInfo jdtMarkerInfo = (JdtMarkerInfo) markerInfo;
			jdtMarkerInfo.setProblemCategory(marker.getAttribute(IJavaModelMarker.CATEGORY_ID, -1));
			jdtMarkerInfo.setProblemType(marker.getAttribute(IJavaModelMarker.ID, -1));
		}
	}

	protected void provideFeatures(JdtSourceEditEvent taskEvent, ICompilationUnit cu) {
		EMap<String, FeatureValued> metrics = taskEvent.getMetrics();
		metrics.clear();
		AbstractASTMetricsProvider.addASTMetrics(taskEvent.getSourceCode(), cu, metrics);
	}

	protected class JavaElementListener extends AbstractSourceFileListener implements IElementChangedListener, IResourceChangeListener {
		
		protected boolean acceptElementChanged(ICompilationUnit cu) {
			String className = getProposal().getAnswer().getClassName();
			String cuClassName = getQualifiedClassName(cu);
			return acceptQName(className, cuClassName);
		}
		protected ICompilationUnit acceptElementChanged(IJavaElementDelta delta) {
			IJavaElement element = delta.getElement();
			if (element instanceof ICompilationUnit) {
				ICompilationUnit cu = (ICompilationUnit) element;
				if (acceptElementChanged(cu)) {
					return cu;
				}
			} else {
				for (IJavaElementDelta childDelta : delta.getAffectedChildren()) {
					ICompilationUnit cu = acceptElementChanged(childDelta);
					if (cu != null) {
						return cu;
					}
				}
			}
			return null;
		}
		protected ICompilationUnit acceptElementChangedEvent(ElementChangedEvent event) {
			return acceptElementChanged(event.getDelta());
		}

		@Override
		public void elementChanged(ElementChangedEvent event) {
			ICompilationUnit cu = acceptElementChangedEvent(event);
			if (cu == null || (! (cu.getResource() instanceof IFile))) {
				return;
			}
			taskEvent = JdtFactory.eINSTANCE.createJdtSourceEditEvent();
			initTaskEventEdit(cu);
		}

		protected void initTaskEventEdit(ICompilationUnit cu) {
			super.initTaskEventEdit((IFile) cu.getResource());
			provideFeatures((JdtSourceEditEvent) taskEvent, cu);
		}

		@Override
		public void resourceChanged(IResourceChangeEvent event) {
			if (event.getType() != IResourceChangeEvent.POST_BUILD || filePath == null) {
				return;
			}
			IResourceDelta file = event.getDelta().findMember(filePath);
			if (file != null) {
				filePath = null;
				initTaskEventCounters((IFile) file.getResource(), IJavaModelMarker.JAVA_MODEL_PROBLEM_MARKER, JdtFactory.eINSTANCE.createJdtMarkerInfo());
				updateProposal();
			}
		}
	}
}
