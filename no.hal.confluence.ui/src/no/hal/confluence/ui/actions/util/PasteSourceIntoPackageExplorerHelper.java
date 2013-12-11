package no.hal.confluence.ui.actions.util;

import java.util.ArrayList;
import java.util.Collection;

import no.hal.confluence.ui.actions.PostPasteHook;

import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jdt.core.ElementChangedEvent;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.IElementChangedListener;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IJavaElementDelta;
import org.eclipse.jdt.core.IJavaModel;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.ui.actions.SelectionDispatchAction;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;

public class PasteSourceIntoPackageExplorerHelper implements IElementChangedListener {

	private static final String PACKAGE_EXPLORER_VIEW_ID = "org.eclipse.jdt.ui.PackageExplorer";

	private PostPasteHook postPasteHook;
	private Display display;
	private IProgressMonitor progressMonitor;
	
	protected Display getDisplay() {
		return display;
	}
	
	protected Collection<IJavaElement> pastedJavaElements = null;

	public void run(String sourceFolderPath, String defaultSourceFolderName, PostPasteHook postPasteHook, Display display, IProgressMonitor progressMonitor) {
		this.postPasteHook = postPasteHook;
		this.display = display;
		this.progressMonitor = progressMonitor;

		StructuredSelection selection = null;
		try {
			IJavaElement srcFolder = getSourceFolder(sourceFolderPath, defaultSourceFolderName);
			if (srcFolder != null) {
				selection = new StructuredSelection(srcFolder);
			}
		} catch (JavaModelException e) {
		}
		if (selection == null) {
			throw new RuntimeException("Didn't find place to paste source");
		}
		try {
			pastedJavaElements = new ArrayList<IJavaElement>();
			JavaCore.addElementChangedListener(this);
			SelectionDispatchAction pasteAction = getPasteAction();
			if (pasteAction == null) {
				throw new RuntimeException("Didn't find package explorer's paste action");
			}
			if (progressMonitor != null) {
				progressMonitor.subTask("Pasting test source");
			}
//			System.out.println("Pasting into " + selection + " (" + selection.size() + ")");
			pasteAction.run(selection);
			if (progressMonitor != null) {
				progressMonitor.worked(1);
			}
		} finally {
			getDisplay().asyncExec(new Runnable() {
				@Override
				public void run() {
					JavaCore.removeElementChangedListener(PasteSourceIntoPackageExplorerHelper.this);
				}
			});
		}
	}
	
	public void elementChanged(ElementChangedEvent elementChangedEvent) {
		int changeType = elementChangedEvent.getType();
		boolean wasEmpty = pastedJavaElements.size() == 0;
		if (changeType == IJavaElementDelta.ADDED || changeType == IJavaElementDelta.CHANGED) {
			IJavaElement element = elementChangedEvent.getDelta().getElement();
			if (element instanceof ICompilationUnit) {
				pastedJavaElements.add(element);
//				System.out.println("Pasted " + element.getElementName());
			}
		}
		if (wasEmpty && pastedJavaElements.size() > 0 && postPasteHook != null) {
			getDisplay().asyncExec(new Runnable() {
				@Override
				public void run() {
					postPasteHook.javaElementsPasted(pastedJavaElements);
				}
			});
		}
		if (progressMonitor != null) {
			progressMonitor.done();
		}
	}

	public static IViewPart showView(String viewId, boolean bringToTop) {
		IWorkbenchPage activePage = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
		try {
			IViewPart view = activePage.showView(viewId);
			if (view != null && bringToTop) {
				activePage.bringToTop(view);
			}
			return view;
		} catch (PartInitException e) {
		}
		return null;
	}
	
	protected IJavaElement getSourceFolder(String sourceFolderPath, String defaultSourceFolderName) throws JavaModelException {
		IJavaModel javaModel = JavaCore.create(ResourcesPlugin.getWorkspace().getRoot());
		String[] pathElements = sourceFolderPath.split("/");
		IJavaElement sourceFolder = javaModel;
		for (int i = 0; i < pathElements.length; i++) {
			String pathElement = pathElements[i];
			if (pathElement == null || pathElement.trim().length() == 0) {
				continue;
			}
			if (sourceFolder instanceof IJavaModel) {
				sourceFolder = ((IJavaModel) sourceFolder).getJavaProject(pathElement);
			} else if (sourceFolder instanceof IJavaProject) {
				IPackageFragmentRoot[] packageFragmentRoots = ((IJavaProject) sourceFolder).getPackageFragmentRoots();
				sourceFolder = findSourceFolder(pathElement, packageFragmentRoots);
			} else if (sourceFolder instanceof IPackageFragmentRoot) {
				break;
			}
		}
		if (sourceFolder instanceof IJavaProject) {
			IPackageFragmentRoot[] packageFragmentRoots = ((IJavaProject) sourceFolder).getPackageFragmentRoots();
			sourceFolder = findSourceFolder(defaultSourceFolderName, packageFragmentRoots);
			if (sourceFolder == null) {
				sourceFolder = findSourceFolder(null, packageFragmentRoots);
			}
		}
		return (sourceFolder instanceof IPackageFragmentRoot ? sourceFolder : null);
	}

	private IJavaElement findSourceFolder(String folderName, IPackageFragmentRoot[] packageFragmentRoots) {
		for (int i = 0; i < packageFragmentRoots.length; i++) {
			IPackageFragmentRoot packageFragmentRoot = packageFragmentRoots[i];
			if (folderName == null || (folderName.equals(packageFragmentRoot.getElementName()) && packageFragmentRoot.getResource() != null)) {
				return packageFragmentRoot;
			}
		}
		return null;
	}

	public SelectionDispatchAction getPasteAction() {
		IViewPart javaView = showView(PACKAGE_EXPLORER_VIEW_ID, true);
		if (javaView != null) {
			IActionBars actionBars = javaView.getViewSite().getActionBars();
			return (SelectionDispatchAction) actionBars.getGlobalActionHandler("paste");
		}
		return null;
	}
}
