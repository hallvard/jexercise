package no.hal.emfs.ui.commands;

import org.eclipse.emf.ecore.EClass;

import no.hal.emf.ui.commands.EmfResourceObjectsCommandHandler;
import no.hal.emfs.EmfsPackage;
import no.hal.emfs.EmfsResource;

public abstract class EmfsCommandHandler extends EmfResourceObjectsCommandHandler<EmfsResource> {

	@Override
	protected EClass getEObjectClass() {
		return EmfsPackage.eINSTANCE.getEmfsResource();
	}

	@Override
	protected boolean isEmfFileExtension(String ext) {
		return "emfs".equals(ext) || "xemfs".equals(ext);
	}
}
