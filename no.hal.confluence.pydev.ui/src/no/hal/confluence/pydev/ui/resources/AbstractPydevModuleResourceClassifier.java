package no.hal.confluence.pydev.ui.resources;

import java.util.Arrays;
import java.util.Collection;

import no.hal.confluence.ui.resources.AbstractEmfsResourceClassifier;
import no.hal.emfs.EmfsFile;

public abstract class AbstractPydevModuleResourceClassifier<T> extends AbstractEmfsResourceClassifier<T> {

	public final static String PYTHON_TYPE = "python";
	public final static String PYTHON_FILE_SUFFIX = ".py";

	protected Collection<String> sourceFolderNames = Arrays.asList("src", "source");

	protected void setTags(EmfsFile file) {
		super.setTags(file, PYTHON_TYPE);
	}

	@Override
	protected void setTagsFromContent(EmfsFile file, String content) {
		setTags(file);
	}
}
