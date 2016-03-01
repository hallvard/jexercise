package no.hal.emf.ui.parts;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

import no.hal.emf.ui.utils.CollectionItemContentProvider;
import no.hal.emf.ui.utils.DelegatingLabelProvider;
import no.hal.emf.ui.utils.EClassViewerFilter;
import no.hal.emf.ui.utils.Names;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.presentation.EcoreEditor;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.ui.celleditor.AdapterFactoryTreeEditor;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.events.ControlAdapter;
import org.eclipse.swt.events.ControlEvent;
import org.eclipse.swt.events.FocusAdapter;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.TraverseEvent;
import org.eclipse.swt.events.TraverseListener;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.FontData;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;

public class SashEditor extends EcoreEditor {

	private int sashCount = 4;

	protected SashForm sash;
	protected SashContent[] sashContents;	
	protected Control[] tabOrder;
	
	private int spacing = 0, sashWidth = 2;

	private Font xtraSelectionFont;
	
	@Override
	public void createPages() {
		// Creates the model from the editor input
		createModel();
		
		xtraSelectionFont = createXtraSelectionFont();
		
		// create the sash form and sashCount parts
		sash = new SashForm(getContainer(), SWT.HORIZONTAL);
		sash.setSashWidth(sashWidth);
		int[] weights = new int[sashCount];
		sashContents = new SashContent[sashCount];
		
		tabOrder = new Control[sashCount * 3];
		for (int i = 0; i < sashCount; i++) {
			sashContents[i] = new SashContent(sash, i);
			weights[i] = 100 / sashCount;
			if (i == 0) {
				weights[i] += 100 % sashCount;
			}
		}
		sash.setWeights(weights);

		for (int i = sashContents.length - 1; i >= 0; i--) {
			sashContents[i].getSelectorViewer().setSelection(new StructuredSelection(i > 0 ? -1 : editingDomain.getResourceSet().getResources().get(0)));
		}
		
		setCurrentViewer(selectionViewer);

		addPage(sash);
		setActivePage(0);

		// Ensures that this editor will only display the page's tab
		// area if there are more than one page
		//
		getContainer().addControlListener(new ControlAdapter() {
			boolean guard = false;
			@Override
			public void controlResized(ControlEvent event) {
				if (!guard) {
					guard = true;
					hideTabs();
					guard = false;
				}
			}
		});

		updateProblemIndication();
		
		editingDomain.getResourceSet().eAdapters().add(new AdapterImpl() {
			@Override
			public void notifyChanged(Notification notification) {
				if (notification.getFeatureID(ResourceSet.class) == ResourceSet.RESOURCE_SET__RESOURCES) {
					for (int i = 0; i < sashCount; i++) {
						sashContents[i].resourceListChanged();
					}
				}
			}
		});
	}

	protected Font createXtraSelectionFont() {
		FontData[] fontData = getContainer().getFont().getFontData();
		for (int i = 0; i < fontData.length; i++) {
		    fontData[i].setStyle(SWT.BOLD);
		}
		return new Font(getContainer().getDisplay(), fontData);
	}
	
	public void dispose() {
		if (xtraSelectionFont != null) {
			xtraSelectionFont.dispose();
		}
		super.dispose();
	}

	private Collection<Object> xtraSelection = new ArrayList<Object>();
	
	private static Collection<Object> mergeSelection(Collection<Object> selection1, IStructuredSelection selection2, boolean toggle, boolean clear, Collection<Object> result) {
		if (! clear) {
			result.addAll(selection1);
		}
		Iterator<?> it = selection2.iterator();
		while (it.hasNext()) {
			Object o = it.next();
			if (toggle && result.contains(o)) {
				result.remove(o);
			} else if (! result.contains(o)) {
				result.add(o);
			}
		}
		return result;
	}
	
	protected void xtraSelect(IStructuredSelection selection, boolean toggle) {
		Collection<Object> oldXtraSelection = xtraSelection;
		xtraSelection = mergeSelection(xtraSelection, selection, toggle, (! toggle), new ArrayList<Object>());
		for (int i = 0; i < sashContents.length; i++) {
			sashContents[i].getContentViewer().update(oldXtraSelection.toArray(), null);
			sashContents[i].getContentViewer().update(xtraSelection.toArray(), null);
		}
//		System.out.println("X: " + xtraSelection);
		setSelection(currentViewer.getSelection());
	}
	
	@Override
	public void setSelection(ISelection selection) {
		if (selection instanceof IStructuredSelection) {
			Collection<Object> mergedSelection = mergeSelection(xtraSelection, (IStructuredSelection) selection, false, false, new ArrayList<Object>());
//			System.out.println("S: " + mergedSelection);
			super.setSelection(new StructuredSelection(mergedSelection.toArray()));
		}
	}

	private TraverseListener traverseListener = new TraverseListener() {
		public void keyTraversed(TraverseEvent e) {
			int pos = -1;
			for (int i = 0; i < tabOrder.length; i++) {
				if (tabOrder[i] == e.widget) {
					pos = i;
					break;
				}
			}
			if (pos >= 0) {
				if (e.detail == SWT.TRAVERSE_TAB_PREVIOUS) {
					pos--;
				} else if (e.detail == SWT.TRAVERSE_TAB_NEXT) {
					pos++;
				}
				if (pos < 0) {
					pos = tabOrder.length + pos;
				} else if (pos >= tabOrder.length) {
					pos = pos - tabOrder.length;
				}
				e.doit = false;
				tabOrder[pos].setFocus();
			}
		}
	};

	public class SashContent extends Viewer {
		
		private Viewer selectorViewer;
		private TreeViewer contentViewer;
		private Viewer filterViewer;
		
		public SashContent(Composite parent, int num) {
			createControls(new Composite(parent, SWT.BORDER), num);
		}

		public Viewer getSelectorViewer() {
			return selectorViewer;
		}

		public TreeViewer getContentViewer() {
			return contentViewer;
		}

		public Viewer getFilterViewer() {
			return filterViewer;
		}

		@Override
		public Control getControl() {
			return getContentViewer().getControl().getParent();
		}

		@Override
		public Object getInput() {
			return getContentViewer().getInput();
		}

		@Override
		public ISelection getSelection() {
			return contentViewer.getSelection();
		}

		@Override
		public void refresh() {
			selectorViewer.refresh();
			contentViewer.refresh();
			filterViewer.refresh();
		}

		@Override
		public void setInput(Object input) {
			getContentViewer().setInput(input);
		}

		@Override
		public void setSelection(ISelection selection, boolean reveal) {
			getContentViewer().setSelection(selection, reveal);
		}

		private void createControls(Composite parent, final int num) {
			GridLayout layout = new GridLayout(1, true);
			layout.marginWidth = spacing;
			layout.marginHeight = spacing;
			layout.verticalSpacing = spacing;
			parent.setLayout(layout);

			// create and populate input selector
			selectorViewer = createContentSelector(parent, num);
			selectorViewer.getControl().addTraverseListener(traverseListener);
			tabOrder[0 * sashCount + num] = selectorViewer.getControl();
			
			// Create a page for the selection tree view.
			contentViewer = createContentViewer(parent, num);
			contentViewer.getControl().addTraverseListener(traverseListener);
			tabOrder[1 * sashCount + num] = contentViewer.getControl();
			contentViewer.getControl().addKeyListener(new KeyAdapter() {
				public void keyPressed(KeyEvent e) {
//					System.out.println((int) e.keyCode + "(" + e.stateMask + ")");
					if (e.keyCode == ' ') {
						xtraSelect((IStructuredSelection) contentViewer.getSelection(), (e.stateMask & SWT.MODIFIER_MASK) == SWT.SHIFT);
					} else if (e.keyCode == SWT.ESC) {
						xtraSelect(StructuredSelection.EMPTY, false);
					}
				}
			});
			
			// create and populate filter selector
			filterViewer = createContentFilter(parent, num);
			filterViewer.getControl().addTraverseListener(traverseListener);
			tabOrder[2 * sashCount + num] = filterViewer.getControl();
		}

		public void resourceListChanged() {
			selectorViewer.refresh();
			filterViewer.refresh();
		}
		
		protected Viewer createContentSelector(Composite parent, final int num) {
			ComboViewer contentSelector = new ComboViewer(parent, SWT.READ_ONLY);
			contentSelector.getControl().setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false));
			contentSelector.setLabelProvider(new DelegatingLabelProvider(null) {
				@Override
				public String getText(Object element) {
					if (element instanceof Integer) {
						int relPos = (Integer) element;
						switch (relPos) {
							case -1: return "<< selection";
							case 0: return "focus on selection";
							case 1: return "selection >>";
						}
					}
					return super.getText(element);
				}
			});
			contentSelector.setContentProvider(new IStructuredContentProvider() {
				public Object[] getElements(Object inputElement) {
					Collection<Object> elements = new ArrayList<Object>();
					if (num > 0) {
						elements.add(-1);
					}
					elements.add(0);
					if (num + 1 < sashCount) {
						elements.add(1);
					}
					if (inputElement instanceof ResourceSet) {
						elements.addAll(((ResourceSet) inputElement).getResources());
					}
					return elements.toArray();
				}
				public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
				}
				public void dispose() {
				}
			});
			contentSelector.setInput(editingDomain.getResourceSet());
			contentSelector.addSelectionChangedListener(new ISelectionChangedListener() {
				public void selectionChanged(SelectionChangedEvent event) {
					Object input = new Object[0];
					Object contentSelection = ((IStructuredSelection) getSelectorViewer().getSelection()).getFirstElement();
					if (contentSelection instanceof Resource) {
						input = contentSelection;
					} else if (contentSelection == null || contentSelection instanceof Integer) {
						int diff = contentSelection == null ? 0 : (Integer) contentSelection;
						int pos = num + diff;
						if (pos >= 0 && pos < sashContents.length) {
							SashContent selectionProvider = sashContents[pos];
							input = new CollectionItemContentProvider(adapterFactory, diff != 0 ? selectionProvider : selectionProvider.getSelection());
						}
					}
					Object oldInput = getContentViewer().getInput();
					if (oldInput instanceof IDisposable) {
						((IDisposable) oldInput).dispose();
					}
					getContentViewer().setInput(input);
				}
			});
			return contentSelector;
		}
		
		protected TreeViewer createContentViewer(Composite parent, final int num) {
			final TreeViewer contentViewer = new TreeViewer(parent, SWT.MULTI);

			contentViewer.setContentProvider(new AdapterFactoryContentProvider(adapterFactory));
			contentViewer.setLabelProvider(new DelegatingLabelProvider(new AdapterFactoryLabelProvider(adapterFactory)) {
				@Override
				public Font getFont(Object element) {
					return (xtraSelection.contains(element) ? xtraSelectionFont : null);
				}
			});
			new AdapterFactoryTreeEditor(contentViewer.getTree(), adapterFactory);
			contentViewer.getControl().setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
			contentViewer.setInput(new Object[0]);
			if (num == 0) {
				selectionViewer = contentViewer;
			}
			contentViewer.getControl().addFocusListener(new FocusAdapter() {
				public void focusGained(FocusEvent e) {
					setCurrentViewer(SashContent.this);
				}
			});
			contentViewer.addSelectionChangedListener(new ISelectionChangedListener() {
				public void selectionChanged(SelectionChangedEvent event) {
					SashContent.this.fireSelectionChanged(new SelectionChangedEvent(SashContent.this, event.getSelection()));
				}
			});
			createContextMenuFor(contentViewer);
			
			return contentViewer;
		}

		protected Viewer createContentFilter(Composite parent, final int num) {
			ComboViewer contentFilter = new ComboViewer(parent, SWT.READ_ONLY);
			contentFilter.getControl().setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false));
			contentFilter.setLabelProvider(new DelegatingLabelProvider(null) {
				@Override
				public String getText(Object element) {
					if (element instanceof EClassViewerFilter) {
						return ((EClassViewerFilter) element).getEClass().getName();
					}
					return super.getText(element);
				}
			});
			contentFilter.setContentProvider(new IStructuredContentProvider() {
				public Object[] getElements(Object inputElement) {
					if (inputElement instanceof ResourceSet) {
						SortedSet<EClass> eClasses = new TreeSet<EClass>(Names.NAME_COMPARATOR);
						for (Resource resource : ((ResourceSet) inputElement).getResources()) {
							TreeIterator<EObject> allContents = resource.getAllContents();
							while (allContents.hasNext()) {
								EClass eClass = allContents.next().eClass();
								addEClass(eClasses, eClass);
							}
						}
						int pos = 0;
						ViewerFilter filters[] = new ViewerFilter[eClasses.size() + 1];
						filters[pos++] = new EClassViewerFilter(EcorePackage.eINSTANCE.getEObject());
						for (EClass eClass : eClasses) {
							filters[pos++] = new EClassViewerFilter(eClass);
						}
						return filters;
					}
					return new Object[0];
				}
				private void addEClass(SortedSet<EClass> eClasses, EClass eClass) {
					if (! eClasses.contains(eClass)) {
						eClasses.add(eClass);
						for (EClass superClass : eClass.getESuperTypes()) {
							addEClass(eClasses, superClass);
						}
					}
				}
				public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
				}
				public void dispose() {
				}
			});
			contentFilter.setInput(editingDomain.getResourceSet());
			contentFilter.addSelectionChangedListener(new ISelectionChangedListener() {
				public void selectionChanged(SelectionChangedEvent event) {
					ViewerFilter viewerFilter = (ViewerFilter) ((IStructuredSelection) event.getSelection()).getFirstElement();
					contentViewer.setFilters(viewerFilter != null ? new ViewerFilter[]{viewerFilter} : new ViewerFilter[0]);
				}
			});
			return contentFilter;
		}
	}
}
