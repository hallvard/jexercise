package no.hal.learning.exercise.adm;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.SortedMap;
import java.util.TreeMap;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.CellLabelProvider;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.ITreeSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.TreeViewerColumn;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerCell;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.TreeColumn;
import org.eclipse.ui.part.ViewPart;

public abstract class PathObjectsView<T> extends ViewPart {

	protected Text pathFilterText;
	protected TreeViewer pathViewer;
	
	// must be sorted
	protected SortedMap<String, T> pathMap = new TreeMap<String, T>();
	
	protected Iterator<String> getPaths() {
		return pathMap.keySet().iterator();
	}

	protected Iterator<String> getFilteredPaths() {
		Collection<String> filtered = new ArrayList<String>();
		for (String path : pathMap.keySet()) {
			if (acceptPath(path)) {
				filtered.add(path);
			}
		}
		return filtered.iterator();
	}

	protected T getPathObject(String path) {
		return pathMap.get(path);
	}

	protected void setPathFilter(String pathPrefix) {
		String filterPrefix = getPathFilterPrefix();
		if (pathPrefix.startsWith(filterPrefix)) {
			pathPrefix = pathPrefix.substring(filterPrefix.length());
		}
		pathFilterText.setText(pathPrefix);
		pathViewer.refresh();
	}
	
	protected final Runnable refreshViewerRunnable = new Runnable() {
		@Override
		public void run() {
			pathViewer.refresh();
		}
	};

	protected void asyncRefreshViewer() {
		pathViewer.getControl().getDisplay().asyncExec(refreshViewerRunnable);
	}
	
	protected boolean acceptPath(String path) {
		if (path == null) {
			return true;
		}
		String startsWith = getPathFilterPrefix() + pathFilterText.getText();
		return (path.length() > startsWith.length() ? path.startsWith(startsWith) : startsWith.startsWith(path));
	}
	
	protected String getPathFilterPrefix() {
		String prefix = getPathPrefix();
		return (prefix != null ? prefix + "/" : "");
	}
	
	@Override
	public void createPartControl(Composite parent) {
		GridLayout layout = new GridLayout(2, false);
		layout.marginHeight = 0;
		layout.marginWidth = 0;
		parent.setLayout(layout);
	
		Label label = new Label(parent, SWT.NONE);
		label.setText("Filter");
		label.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false));
		pathFilterText = new Text(parent, SWT.SEARCH | SWT.ICON_SEARCH | SWT.ICON_CANCEL);
		pathFilterText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));

		pathViewer = new TreeViewer(parent);
		ViewerFilter pathFilter = new ViewerFilter() {
			@Override
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				return (element instanceof String ? acceptPath(element.toString()) : true);
			}
		};

		PathViewerContentProvider<T> contentProvider = new PathViewerContentProvider<T>(pathMap);
		contentProvider.setPathPrefix(getPathPrefix());
		pathViewer.setContentProvider(contentProvider);

		pathViewer.getControl().setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 2, 1));
		pathViewer.setInput(pathMap);
		pathViewer.setFilters(pathFilter);

		pathViewer.getTree().setHeaderVisible(true);
		
		addViewerColumns();
		
		pathViewer.getTree().addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				if (e.keyCode == SWT.DEL) {
					deleteSelection(pathViewer.getStructuredSelection());
				}
				super.keyReleased(e);
			}
		});
		
		pathFilterText.addModifyListener(new ModifyListener() {
			@Override
			public void modifyText(ModifyEvent e) {
				pathViewer.refresh();
			}
		});
		pathViewer.getControl().addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDoubleClick(MouseEvent e) {
				Object selectedObject = pathViewer.getStructuredSelection().getFirstElement();
				if (selectedObject instanceof String) {
					setPathFilter((String) selectedObject);
				} else if (selectedObject != null) {
					try {
						openPathObject((T) selectedObject);
					} catch (ClassCastException e1) {
					}
				}
			}
		});
		addActions();
	}

	protected void openPathObject(T object) {
	}

	protected void deleteSelection(ITreeSelection selection) {
		Iterator<?> elements = selection.iterator();
		while (elements.hasNext()) {
			Object element = elements.next();
			deleteSelection(element);
		}
	}

	protected void deleteSelection(Object element) {
		if (element instanceof String) {
			Object parent = ((ITreeContentProvider) pathViewer.getContentProvider()).getParent(element);
			deletePath((String) element);
			pathViewer.refresh(parent);
		}
	}

	protected void deletePath(String path) {
		pathMap.remove(path);
	}
	
	protected void addViewerColumns() {
		addViewerColumn();
	}

	protected ILabelProvider createPathLabelProvider() {
		return new PathViewerLabelProvider();
	}
	
	protected void addViewerColumn() {
		addViewerColumn("Path", new CellLabelProvider() {
			ILabelProvider labelProvider = createPathLabelProvider();
			@Override
			public void update(ViewerCell cell) {
				cell.setText(labelProvider.getText(cell.getElement()));
			}
		}, 150);
	}

	protected void addViewerColumn(String name, CellLabelProvider labelProvider, int width) {
		TreeViewerColumn treeViewerColumn = new TreeViewerColumn(pathViewer, SWT.NONE);
		treeViewerColumn.setLabelProvider(labelProvider);
		TreeColumn treeColumn = treeViewerColumn.getColumn();
		treeColumn.setText(name);
		treeColumn.setWidth(width);
		addTopicViewerColumnSelectionListener(treeColumn, labelProvider);
	}
	
	protected void addTopicViewerColumnSelectionListener(TreeColumn treeColumn, CellLabelProvider labelProvider) {
	}

	//

	protected void updatePane() {
		pathMap.clear();
		pathViewer.refresh(false);
	}

	private final static String REFRESH_IMAGE_URL = "platform:/plugin/org.eclipse.jdt.ui/icons/full/elcl16/refresh.png";

	protected void addActions() {
		try {
			getViewSite().getActionBars().getToolBarManager().add(new Action("Refresh", ImageDescriptor.createFromURL(new URL(REFRESH_IMAGE_URL))) {
				public void run() {
					updatePane();
				}
			});
		} catch (MalformedURLException e) {
		}
	}

	//

	protected abstract String getPathPrefix();
	
	@Override
	public void setFocus() {
		pathViewer.getControl().setFocus();
	}
}
