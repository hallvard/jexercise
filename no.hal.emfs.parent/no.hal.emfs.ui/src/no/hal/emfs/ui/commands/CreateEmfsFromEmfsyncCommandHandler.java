package no.hal.emfs.ui.commands;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.resource.Resource;

import no.hal.emf.ui.commands.EmfResourceObjectsCommandHandler;
import no.hal.emfs.importer.Importer;
import no.hal.emfs.sync.ImportSpec;
import no.hal.emfs.sync.SyncPackage;

public class CreateEmfsFromEmfsyncCommandHandler extends EmfResourceObjectsCommandHandler<ImportSpec> {

	@Override
	protected EClass getEObjectClass() {
		return SyncPackage.eINSTANCE.getImportSpec();
	}

	@Override
	protected boolean isEmfFileExtension(String ext) {
		return "emfsync".equals(ext);
	}

	@Override
	protected IContainer getTargetContainer(IFile resource) {
		return resource.getParent();
	}

	@Override
	protected void execute(IFile file, ImportSpec importSpec, IContainer target) throws ExecutionException {
		Importer importer = new Importer(importSpec);
		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		importer.setRootContainer(root);
		importer.importResources();
		URI uri = URI.createURI("temp.emfs");
		Resource emfResource = Resource.Factory.Registry.INSTANCE.getFactory(uri).createResource(uri);
		emfResource.getContents().addAll(importSpec.getResources());
		ByteArrayOutputStream output = new ByteArrayOutputStream();
		try {
			emfResource.save(output, null);
			IFile emfsFile = target.getFile(new Path(file.getName() + ".emfs"));
			ByteArrayInputStream input = new ByteArrayInputStream(output.toByteArray());
			if (! emfsFile.exists()) {
				emfsFile.create(input, IResource.FORCE, null);
			} else {
				emfsFile.setContents(input, IResource.FORCE, null);
			}
		} catch (IOException e) {
			System.err.println(e);
		} catch (CoreException e) {
			System.err.println(e);
		}
	}
}
