/*******************************************************************************
 * Copyright (c) 2009 Hallvard Traetteberg.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Hallvard Traetteberg - initial API and implementation
 ******************************************************************************/
package no.hal.emf.ui.commands;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.command.ChangeCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.HandlerUtil;

public abstract class EmfEditorObjectsCommandHandler extends AbstractHandler {

	public EmfEditorObjectsCommandHandler() {
		super();
	}
	
	@Override
	public void dispose() {
	}

	private IWorkbenchWindow getActiveWorkbenchWindow(ExecutionEvent event) {
		return (event != null ? HandlerUtil.getActiveWorkbenchWindow(event) : PlatformUI.getWorkbench().getActiveWorkbenchWindow());
	}

	private Collection<EObject> getSelection(IWorkbenchWindow wbw) {
		return (wbw != null && wbw.getActivePage() != null ? getSelection(wbw.getActivePage().getSelection()) : null);
	}
	protected Collection<EObject> getSelection(ExecutionEvent event) {
		return getSelection(getActiveWorkbenchWindow(event));
	}

	private EditingDomain getEditingDomain(IWorkbenchWindow wbw) {
		if (wbw == null || wbw.getActivePage() == null) {
			return null;
		}
		IWorkbenchPart part = wbw.getActivePage().getActivePart();
		return (part instanceof IEditingDomainProvider ? ((IEditingDomainProvider) part).getEditingDomain() : null);
	}
	protected EditingDomain getEditingDomain(ExecutionEvent event) {
		return getEditingDomain(getActiveWorkbenchWindow(event));
	}

	protected boolean isCommandEObject(EObject eObject) {
		return true;
	}

	private Collection<EObject> getSelection(ISelection selection) {
		List<EObject> result = new ArrayList<EObject>();
		if (selection instanceof IStructuredSelection) {
			Iterator<?> objects = ((IStructuredSelection) selection).iterator();
			while (objects.hasNext()) {
				Object o = objects.next();
				EObject eObject = (EObject) o;
				if (o instanceof EObject && isCommandEObject(eObject)) {
					result.add(eObject);
				}
			}
		}
		return result;
	}

	protected <T> List<T> getEObjects(Collection<? extends EObject> eObjects, Class<T> c, List<T> result, int limit) {
		if (result == null) {
			result = new ArrayList<T>();
		}
		for (EObject eObject : eObjects) {
			if (c.isInstance(eObject)) {
				result.add((T) eObject);
				if (--limit == 0) {
					return result;
				}
			}
		}
		return result;
	}

	protected <T> T getEObject(Collection<? extends EObject> eObjects, Class<T> c, String name) {
		for (EObject eObject : eObjects) {
			if (c.isInstance(eObject)) {
				if (name != null) {
					EStructuralFeature nameFeature = eObject.eClass().getEStructuralFeature("name");
					if (nameFeature == null || (! name.equals(eObject.eGet(nameFeature)))) {
						continue;
					}
				}
				return (T) eObject;
			}
		}
		return null;
	}
	
	protected String getEventParameter(ExecutionEvent event, String paramName, String def) {
		String parameter = event.getParameter(event.getCommand().getId() + "." + paramName);
		return (parameter != null ? parameter : def);
	}
	
	protected Object execute(Collection<? extends EObject> eObjects, ExecutionEvent event) throws ExecutionException {
		return null;
	}

	public Object execute(final ExecutionEvent event) throws ExecutionException {
		final Collection<EObject> eObjects = getSelection(event);
		EditingDomain editingDomain = getEditingDomain(event);
		Command command = createCommand(eObjects, event, editingDomain);
		if (command != null && command.canExecute()) {
			if (editingDomain != null) {
				editingDomain.getCommandStack().execute(command);
			} else {
				command.execute();
			}
			return command.getAffectedObjects();
		}
		return null;
	}

	protected Command createCommand(final Collection<? extends EObject> eObjects, final ExecutionEvent event, EditingDomain editingDomain) {
		Collection<Notifier> rootObjects = new ArrayList<Notifier>(eObjects);
		ChangeCommand command = new ChangeCommand(rootObjects) {
			@Override
			protected void doExecute() {
				try {
					EmfEditorObjectsCommandHandler.this.execute(eObjects, event);
				} catch (ExecutionException e) {
					throw new RuntimeException(e);
				}
			}
		};
		return command;
	}

	protected boolean isEnabled(Collection<? extends EObject> eObjects) {
		return eObjects.size() > 0;
	}

	@Override
	public boolean isEnabled() {
		return isEnabled(getSelection((ExecutionEvent) null));
	}
}
