/*******************************************************************************
 * Copyright (c) 2010 Hallvard Traetteberg.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Hallvard Traetteberg - initial API and implementation
 ******************************************************************************/
package no.hal.emf.ui.commands;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.MoveCommand;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

public class NudgeEObjectCommandHandler extends EmfEditorObjectsCommandHandler {

	public NudgeEObjectCommandHandler() {
		super();
	}

	public void dispose() {
	}

	protected boolean isEnabled(Collection<? extends EObject> eObjects) {
		return eObjects.size() == 1;
	}

	@Override
	protected Command createCommand(Collection<? extends EObject> eObjects, ExecutionEvent event, EditingDomain editingDomain) {
		CompoundCommand compoundCommand = new CompoundCommand();
		int movementDelta = Integer.parseInt(getEventParameter(event, "movementDelta", "0"));
		boolean shouldCopy = "true".equals(getEventParameter(event, "shouldCopy", "false"));

		for (EObject eObject : eObjects) {
			// second, find the parent and siblings, and siblings size (the siblings are needed for finding the position)
			Object parent = null;
			Collection<?> siblings = null;
			if (editingDomain instanceof AdapterFactoryEditingDomain) {
				AdapterFactory adapterFactory = ((AdapterFactoryEditingDomain) editingDomain).getAdapterFactory();
				parent = ((ITreeItemContentProvider) adapterFactory.adapt(eObject, ITreeItemContentProvider.class)).getParent(eObject);
				siblings = ((ITreeItemContentProvider) adapterFactory.adapt(parent, ITreeItemContentProvider.class)).getChildren(parent);
			} else {
				EReference containmentFeature = eObject.eContainmentFeature();		
				if (containmentFeature != null && containmentFeature.isMany()) {
					EObject container = eObject.eContainer();
					parent = container;
					siblings = (Collection<?>) container.eGet(containmentFeature);
				}
			}
			if (parent == null || siblings == null) {
				return null;
			}

			// third, find existing position
			int pos = -1;
			if (siblings instanceof List<?>) {
				pos = ((List<?>) siblings).indexOf(eObject);
			} else if (siblings instanceof Collection<?>) {
				Iterator<?> it = ((Collection<?>) siblings).iterator();
				for (int i = 0; it.hasNext(); i++) {
					if (it.next() == eObject) {
						pos = i;
						break;
					}
				}
			}
			if (pos < 0) {
				return null;
			}

			// fourth, find new position
			int newPos = pos + movementDelta;
			if (newPos < 0) {
				// movement was too big, reduce it
				movementDelta += newPos;
				newPos = 0;
			} else if (newPos >= siblings.size()) {
				newPos = siblings.size() - 1;
			}

			// finally, compute command
			Command command = null;
			if (shouldCopy) {
				command = AddCommand.create(editingDomain, parent, null, EcoreUtil.copy(eObject), newPos);
			} else if (newPos != pos) {
				command = MoveCommand.create(editingDomain, parent, null, eObject, newPos);
			}
			compoundCommand.append(command);
		}
		return compoundCommand;
	}
}
