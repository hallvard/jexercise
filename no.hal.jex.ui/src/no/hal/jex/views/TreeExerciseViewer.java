package no.hal.jex.views;

import java.util.ArrayList;
import java.util.List;

import no.hal.jex.AbstractRequirement;
import no.hal.jex.Exercise;
import no.hal.jex.JavaRequirement;
import no.hal.jex.resource.JexResource;
import no.hal.jex.ui.JexManager;
import no.hal.jex.ui.JexUiPlugin;

import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.internal.ui.packageview.PackageExplorerPart;
import org.eclipse.jdt.ui.actions.SelectionDispatchAction;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.IViewSite;
import org.eclipse.ui.IWorkbenchPartSite;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;

public class TreeExerciseViewer extends TreeViewer implements IExerciseViewer, ISelectionChangedListener, IDoubleClickListener {

	public TreeExerciseViewer(Composite parent, int style) {
		super(parent, style);
		init();
	}
	public TreeExerciseViewer(Composite parent) {
		this(parent, SWT.NONE);
	}
	public TreeExerciseViewer(Tree tree) {
		super(tree);
		init();
	}

	private void init() {
		addSelectionChangedListener(this);
		addDoubleClickListener(this);
	}

	public void updateViewer(AbstractRequirement req) {
		super.update(req, null);
	}
	
	public JexResource getExerciseResource() {
		return (JexResource) getInput();
	}
	
	private static int AUTO_EXPAND_TO = 2; // ALL_LEVELS
	
	public void setExerciseResource(JexResource res) {
		AbstractRequirement oldSelection = null;
		if (res != null && res == getInput()) {
			oldSelection = getSelectedRequirement();
		}
		setInput(res); // res != null ? (Object)res : JexPlugin.getDefault().getExerciseManager());
		if (oldSelection != null) {
			// this doesn't seem to work
			setSelectedRequirement(oldSelection);
			reveal(oldSelection);
		} else {
			setSelectedRequirement(res != null ? res.getExercise() : null);
		}
		expandToLevel(AUTO_EXPAND_TO);
	}
	
	public Object getSelection(Object o, Class<?> c) {
		if (o instanceof ISelection) {
			ISelection selection = (ISelection)o;
			if (! (selection instanceof IStructuredSelection)) {
				return null;
			}
			o = ((IStructuredSelection)selection).getFirstElement();
			if (o instanceof JexResource && c != JexResource.class) {
				o = ((JexResource) o).getExercise();
			}
		}
		return (c == null || c.isInstance(o) ? o : null);
	}

	public AbstractRequirement getSelectedRequirement() {
		return (AbstractRequirement) getSelection(getSelection(), AbstractRequirement.class);
	}

	public void setSelectedRequirement(AbstractRequirement req) {
		Object selection = req;
		if (req instanceof Exercise) {
			selection = req.eResource();
		}
		setSelection(selection != null ? new StructuredSelection(selection) : StructuredSelection.EMPTY);
	}

	private List<ExerciseListener> listeners;
	
	public void addExerciseListener(ExerciseListener listener) {
		if (listeners == null) {
			listeners = new ArrayList<ExerciseListener>();
		}
		listeners.add(listener);
	}

	public void removeExerciseListener(ExerciseListener listener) {
		if (listeners != null) {
			listeners.remove(listener);
		}
	}
	
	private void fireRequirementSelected(AbstractRequirement req) {
		for (ExerciseListener listener : listeners) {
			listener.requirementSelected(req);
		}
	}
	private void fireRequirementValidationRequested(JavaRequirement req) {
		for (ExerciseListener listener : listeners) {
			listener.requirementValidationRequested(req);
		}
	}

	public void selectionChanged(SelectionChangedEvent event) {
		AbstractRequirement req = (AbstractRequirement)getSelection(event.getSelection(), AbstractRequirement.class);
		if (req != null) {
			fireRequirementSelected(req);
		}
	}

	public void doubleClick(DoubleClickEvent event) {
		JavaRequirement req = (JavaRequirement)getSelection(event.getSelection(), JavaRequirement.class);
		if (req != null) {
			fireRequirementValidationRequested((JavaRequirement)req);
//		} else {
//			JexResource res = (JexResource)getSelection(event.getSelection(), JexResource.class);
//			JexManager manager = JexUiPlugin.getPlugin().getExerciseManager();
//			manager.refreshExerciseResource(res);
		}
	}
	
	/*
	 *  (java.util.HashMap$KeySet) [org.eclipse.jdt.ui.actions.DeclarationsInHierarchy, org.eclipse.jdt.ui.actions.ReadAccessInWorkspace, undo, rename, org.eclipse.jdt.ui.actions.AddJavaDocComment, org.eclipse.jdt.ui.actions.ImplementorsInWorkingSet, org.eclipse.jdt.ui.actions.BreakContinueTargetOccurrences, org.eclipse.jdt.ui.actions.ReadAccessInProject, org.eclipse.jdt.ui.actions.UseSupertype, openProject, org.eclipse.jdt.ui.actions.CopyQualifiedName, org.eclipse.jdt.ui.actions.ReferencesInWorkingSet, forward, org.eclipse.jdt.ui.actions.OpenSuperImplementation, org.eclipse.jdt.ui.actions.DeclarationsInProject, goInto, org.eclipse.jdt.ui.actions.Rename, org.eclipse.jdt.ui.actions.OccurrencesInFile, org.eclipse.jdt.ui.actions.ExtractInterface, org.eclipse.jdt.ui.actions.GenerateDelegateMethods, org.eclipse.jdt.ui.actions.ExternalizeStrings, refresh, org.eclipse.jdt.ui.actions.IntroduceIndirection, move, org.eclipse.jdt.ui.actions.MethodExitOccurrences, org.eclipse.jdt.ui.actions.ConvertAnonymousToNested, copy, org.eclipse.jdt.ui.actions.InferTypeArguments, org.eclipse.jdt.ui.actions.ReferencesInProject, org.eclipse.jdt.ui.actions.ReadAccessInWorkingSet, bookmark, org.eclipse.jdt.ui.actions.ConvertNestedToTop, org.eclipse.jdt.ui.actions.ChangeType, org.eclipse.jdt.ui.actions.WriteAccessInProject, properties, closeUnrelatedProjects, org.eclipse.jdt.ui.actions.ReadAccessInHierarchy, org.eclipse.jdt.ui.actions.ModifyParameters, org.eclipse.jdt.ui.actions.ReferencesInWorkspace, paste, org.eclipse.jdt.ui.actions.ExtractSuperclass, redo, org.eclipse.jdt.ui.actions.PushDown, org.eclipse.jdt.ui.actions.DeclarationsInWorkingSet, org.eclipse.jdt.ui.actions.OverrideMethods, org.eclipse.jdt.ui.actions.GenerateToString, org.eclipse.jdt.ui.actions.GenerateConstructorUsingFields, org.eclipse.jdt.ui.actions.WriteAccessInWorkingSet, org.eclipse.jdt.ui.actions.ExtractClass, org.eclipse.jdt.ui.actions.ImplementorsInWorkspace, org.eclipse.jdt.ui.actions.GenerateHashCodeEquals, org.eclipse.jdt.ui.actions.WriteAccessInWorkspace, org.eclipse.jdt.ui.actions.OpenTypeHierarchy, org.eclipse.jdt.ui.actions.OpenCallHierarchy, org.eclipse.jdt.ui.actions.GoToType, delete, org.eclipse.jdt.ui.actions.WriteAccessInHierarchy, org.eclipse.jdt.ui.actions.FindNLSProblems, org.eclipse.jdt.ui.actions.Open, org.eclipse.jdt.ui.actions.OpenExternalJavaDoc, org.eclipse.jdt.ui.actions.CleanUp, org.eclipse.jdt.ui.actions.Inline, org.eclipse.jdt.ui.actions.ImplementorsInProject, org.eclipse.jdt.ui.actions.GoToPackage, org.eclipse.jdt.ui.actions.ImplementOccurrences, org.eclipse.jdt.ui.actions.Move, org.eclipse.jdt.ui.actions.GenerateGetterSetter, back, org.eclipse.jdt.ui.actions.DeclarationsInWorkspace, goToResource, org.eclipse.jdt.ui.actions.SortMembers, org.eclipse.jdt.ui.actions.ReferencesInHierarchy, buildProject, selectAll, org.eclipse.jdt.ui.actions.Format, up, org.eclipse.jdt.ui.actions.IntroduceFactory, org.eclipse.jdt.ui.actions.AddConstructorFromSuperclass, org.eclipse.jdt.ui.actions.ExceptionOccurrences, org.eclipse.jdt.ui.actions.OrganizeImports, closeProject, org.eclipse.jdt.ui.actions.SelfEncapsulateField, org.eclipse.jdt.ui.actions.IntroduceParameterObject, org.eclipse.jdt.ui.actions.PullUp, org.eclipse.jdt.ui.actions.OpenImplementation, cut, addTask]
	 *  
	 */
}
