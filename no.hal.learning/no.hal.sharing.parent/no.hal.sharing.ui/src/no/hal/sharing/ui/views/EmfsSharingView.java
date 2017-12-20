package no.hal.sharing.ui.views;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.ui.dnd.EditingDomainViewerDropAdapter;
import org.eclipse.emf.edit.ui.dnd.LocalTransfer;
import org.eclipse.emf.edit.ui.dnd.ViewerDragAdapter;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.util.LocalSelectionTransfer;
import org.eclipse.jface.viewers.CheckboxTreeViewer;
import org.eclipse.jface.viewers.ICheckStateProvider;
import org.eclipse.jface.viewers.IContentProvider;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.swt.SWT;
import org.eclipse.swt.dnd.DND;
import org.eclipse.swt.dnd.FileTransfer;
import org.eclipse.swt.dnd.Transfer;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;

import no.hal.emf.ui.utils.FileExtensionLabelProvider;
import no.hal.emf.ui.utils.FilteringContentProvider;
import no.hal.emfs.EmfsResource;
import no.hal.emfs.sync.PathRule;
import no.hal.emfs.util.AbstractPorter;

public abstract class EmfsSharingView<R extends PathRule<R>> extends SharingView {

	protected CheckboxTreeViewer treeViewer;
//	protected TreeViewer pathMappingViewer;

	protected Collection<R> pathRules = null;

	protected Collection<R> getRules(ResourceSet resourceSet) {
		if (pathRules == null) {
			pathRules = new ArrayList<R>();
			for (Resource resource : resourceSet.getResources()) {
				getRules(resource.getAllContents(), pathRules);
			}
		}
		return pathRules;
	}

	protected Collection<R> getRules(TreeIterator<EObject> eObjects, Collection<R> rules) {
		while (eObjects.hasNext()) {
			EObject next = eObjects.next();
			if (next instanceof PathRule<?>) {
				rules.add((R) next);
				eObjects.prune();
			}
		}
		return rules;
	}

	public abstract AbstractPorter<R> getPorter(ResourceSet resourceSet);

	@Override
	protected Control createSharedObjectControl(final EObject sharedObject, final EditingDomain editingDomain, Composite parent) {
		Composite composite = new Composite(parent, SWT.NONE);
		GridLayout layout = new GridLayout(1, false);
		layout.marginHeight = 0;
		layout.marginWidth = 0;
		composite.setLayout(layout);
	
		treeViewer = new CheckboxTreeViewer(composite, SWT.NONE);
//		treeViewer.getTree().setHeaderVisible(true);
		
		treeViewer.setContentProvider(createContentProvider());
		treeViewer.setLabelProvider(createLabelProvider());

		int dndOperations = DND.DROP_COPY;
		Transfer[] transfers = new Transfer[] { LocalTransfer.getInstance(), LocalSelectionTransfer.getTransfer(), FileTransfer.getInstance() };
		treeViewer.addDragSupport(dndOperations, transfers, new ViewerDragAdapter(treeViewer));
		if (editingDomain != null) {
			treeViewer.addDropSupport(dndOperations, transfers, new EditingDomainViewerDropAdapter(editingDomain, treeViewer));
		}
		final ResourceSet resourceSet = sharedObject.eResource().getResourceSet();
		treeViewer.setInput(resourceSet);

		//		TreeViewerColumn labelColumn = new TreeViewerColumn(treeViewer, SWT.NONE);
		//		labelColumn.setLabelProvider(new DelegatingCellLabelProvider(new SharingViewLabelProvider()));
		//		labelColumn.getColumn().setText("Path");
		//		labelColumn.getColumn().setWidth(300);

		//		TreeViewerColumn pathColumn = new TreeViewerColumn(treeViewer, SWT.NONE);
		//		pathColumn.setLabelProvider(new StyledCellLabelProvider() {
		//			@Override
		//			public void update(ViewerCell cell) {
		//				Object element = cell.getElement();
		//				String text = "";
		//				StyleRange style = null;
		//				if (element instanceof SharingHelper.SharingData) {
		//					SharingHelper.SharingData data = (SharingHelper.SharingData) element;
		//					IPath path = data.targetPath;
		//					if (path != null) {
		//						text = path.toString();
		//					}
		//					if (data.state == SharingHelper.SHARING_STATE_DELETED) {
		//						style = new StyleRange();
		//						style.start = 0;
		//						style.length = text.length();
		//						style.strikeout = true;
		//					}
		//				}
		//				cell.setText(text);
		//				if (style != null) {
		//					cell.setStyleRanges(new StyleRange[]{style});
		//				}
		//			}
		//		});
		//		pathColumn.getColumn().setText("Target path");
		//		pathColumn.getColumn().setWidth(300);
		//		
		//		TreeViewerColumn timeColumn = new TreeViewerColumn(treeViewer, SWT.NONE);
		//		final long startTime = System.currentTimeMillis();
		//		timeColumn.setLabelProvider(new CellLabelProvider() {
		//			@Override
		//			public void update(ViewerCell cell) {
		//				if (cell.getElement() instanceof SharingHelper.SharingData) {
		//					SharingHelper.SharingData data = (SharingHelper.SharingData) cell.getElement();
		//					Date date = new Date(data.timestamp);
		//					cell.setText(String.format("%02d:%02d", date.getHours(), date.getMinutes())); 
		//				}
		//			}
		//		});
		//		timeColumn.getColumn().setText("Time");
		//		timeColumn.getColumn().setWidth(50);

		treeViewer.setCheckStateProvider(new ICheckStateProvider() {
			@Override
			public boolean isGrayed(Object element) {
				return false;
			}
			@Override
			public boolean isChecked(Object element) {
				if (element instanceof EmfsResource && getPorter(resourceSet) != null) {
					String fullPath = ((EmfsResource) element).getFullPath();
					R rule = getPorter(resourceSet).findMostSpecificRule(getRules(resourceSet), new Path(fullPath), 0);
					return rule != null && getPorter(resourceSet).isIncluding(rule);
				}
				return false;
			}
		});
//		treeViewer.addCheckStateListener(new ICheckStateListener() {
//			@Override
//			public void checkStateChanged(CheckStateChangedEvent event) {
//				Object element = event.getElement();
//				// TODO
//			}
//		});

		//		pathMappingViewer = new TreeViewer(parent, SWT.NONE);
		//		pathMappingViewer.getTree().setHeaderVisible(true);
		//		pathMappingViewer.setContentProvider(new PathMappingContentProvider());
		//		pathMappingViewer.setInput(getSharingManager().getSubscribingHelper());
		//		
		//		TreeViewerColumn sourcePathColumn = new TreeViewerColumn(pathMappingViewer, SWT.NONE);
		//		sourcePathColumn.setLabelProvider(new DelegatingCellLabelProvider(new PathMappingLabelProvider(getSharingHelper(), false)));
		//		sourcePathColumn.getColumn().setText("Source path prefix");
		//		sourcePathColumn.getColumn().setWidth(300);
		//		
		//		TreeViewerColumn targetPathColumn = new TreeViewerColumn(pathMappingViewer, SWT.NONE);
		//		targetPathColumn.setLabelProvider(new DelegatingCellLabelProvider(new PathMappingLabelProvider(getSharingHelper(), true)));
		//		targetPathColumn.getColumn().setText("Target path prefix");
		//		targetPathColumn.getColumn().setWidth(300);
		//
		//		pathMappingViewer.getControl().addMouseListener(new MouseAdapter() {
		//			@Override
		//			public void mouseDoubleClick(MouseEvent e) {
		//				e.widget.getDisplay().asyncExec(new Runnable() {
		//					@Override
		//					public void run() {
		//						setPathMapping(pathMappingViewer.getSelection());
		//						pathMappingViewer.refresh(true);
		//					}
		//				});
		//			}
		//		});

		treeViewer.getControl().setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		//		pathMappingViewer.getControl().setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false));
		return composite;
	}

	@Override
	protected IContentProvider createContentProvider() {
		return new FilteringContentProvider(new AdapterFactoryContentProvider(getAdapterFactory())) {
			@Override
			public boolean accept(Object element) {
				return ! (element instanceof Resource); // && SharingManager.isSharingResource((Resource) element));
			}
		};
	}

	@Override
	protected ILabelProvider createLabelProvider() {
		return new FileExtensionLabelProvider(new AdapterFactoryLabelProvider(getAdapterFactory()));
	}
}
