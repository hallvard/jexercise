package no.hal.learning.exercise.views.stringeditors;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;

public abstract class AbstractStringEditorInput extends AbstractEditorInput {

	public AbstractStringEditorInput(IPath path) {
		super(path);
	}
	
	protected abstract String getString(); 

	// IStorage

	@Override
	public InputStream getContents() throws CoreException {
		return new ByteArrayInputStream(getString().getBytes());
	}
}
