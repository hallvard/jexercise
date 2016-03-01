package no.hal.emf.ui.parts;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IAction;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StackLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.part.ViewPart;

import no.hal.emf.ui.parts.adapters.EObjectViewerAdapter;
import no.hal.emf.ui.parts.adapters.EObjectViewerAdapterHelper;

public abstract class AbstractEObjectView extends ViewPart {

	private Class<? extends EObjectViewerAdapter<?, ?>> mainAdapterClass;
	private Map<Class<? extends EObjectViewerAdapter<?, ?>>, String> adapterClasses = new HashMap<Class<? extends EObjectViewerAdapter<?,?>>, String>();

	protected AbstractEObjectView(Class<? extends EObjectViewerAdapter<?,?>> mainAdapterClass, String mainViewName) {
		this.mainAdapterClass = mainAdapterClass;
		addAdapterClass(mainAdapterClass, mainViewName);
	}

	protected AbstractEObjectView(Class<? extends EObjectViewerAdapter<?,?>> mainAdapterClass) {
		this(mainAdapterClass, "main view");
	}

	private EObjectViewerAdapterHelper adapterHelper = new EObjectViewerAdapterHelper();
	
	public EObjectViewerAdapterHelper getAdapterHelper() {
		return adapterHelper;
	}
	
	public void addAdapterFactory(AdapterFactory adapterFactory) {
		getAdapterHelper().getAdapterFactory().addAdapterFactory(adapterFactory);
	}

	protected abstract EObject getCurrentEObject();
	protected abstract Composite getCurrentComposite();

	private Collection<IAction> viewerActions = null;
	
	private class SwitchViewerAction extends Action {
		
		private Class<? extends EObjectViewerAdapter<?, ?>> adapterClass;
		
		public SwitchViewerAction(String name, Class<? extends EObjectViewerAdapter<?, ?>> adapterClass) {
			super("Switch to " + name);
			this.adapterClass = adapterClass;
		}

		@Override
		public void run() {
			switchView(adapterClass);
		}
	}

	protected void addAdapterClass(Class<? extends EObjectViewerAdapter<?, ?>> adapterClass, String name) {
		adapterClasses.put(adapterClass, name);
		if (viewerActions == null) {
			viewerActions = new ArrayList<IAction>();
		}
		SwitchViewerAction switchAction = new SwitchViewerAction(name, adapterClass);
		addSwitchViewerAction(switchAction);
	}

	protected void addSwitchViewerAction(SwitchViewerAction switchAction) {
		viewerActions.add(switchAction);
	}

	protected void addSwitchActions() {
		for (IAction action : viewerActions) {
			getViewSite().getActionBars().getMenuManager().add(action);
		}
	}
	
	protected Composite createEObjectComposite(Composite parent) {
		Composite composite = new Composite(parent, SWT.NONE);
		composite.setLayout(new StackLayout());
		return composite;
	}
	
	protected Control switchView(EObject eObject, Composite composite, Class<? extends EObjectViewerAdapter<?, ?>> adapterClass) {
		if (adapterClass == null) {
			adapterClass = mainAdapterClass;
		}
		EObjectViewerAdapter<?, ?> adapter = (EObjectViewerAdapter<?, ?>) EcoreUtil.getAdapter(eObject.eAdapters(), adapterClass);
		Control control = (adapter == null ? getAdapterHelper().initView(getCurrentEObject(), adapterClass, composite) : adapter.getView());
		((StackLayout) composite.getLayout()).topControl = control;
		composite.layout();
		return control;
	}

	protected Control switchView(Class<? extends EObjectViewerAdapter<?, ?>> adapterClass) {
		return switchView(getCurrentEObject(), getCurrentComposite(), adapterClass);
	}
}
