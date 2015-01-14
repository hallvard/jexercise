package no.hal.confluence.java.ui.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import no.hal.confluence.ui.resources.AbstractEmfsResourceClassifier;
import no.hal.emfs.EmfsFile;

public abstract class AbstractJavaClassResourceClassifier<T> extends AbstractEmfsResourceClassifier<T> {

	public final static String JAVA_TAG = "java";
	public final static String JAVA_FILE_SUFFIX = "." + JAVA_TAG;
	public final static String JAVA_TEST_FILE_SUFFIX = "Test" + JAVA_FILE_SUFFIX;
	public final static String TEST_TAG = "test";
	public final static String JAVA_FX_TAG = "javafx";
	
	protected void setTags(EmfsFile file) {
		file.getTags().add(JAVA_TAG);
		if (file.getName().endsWith(JAVA_TEST_FILE_SUFFIX)) {
			super.setTags(file, TEST_TAG);
		}
	}
	
	@Override
	protected void setTagsFromContent(EmfsFile file, String content) {
		setTags(file);
		if (content.contains("public class")) {
			setTags(file, "class");
		}
		if (content.contains("public static void main(String")) {
			setTags(file, "application");
		}
		if (content.contains("import javafx.")) {
			setTags(file, JAVA_FX_TAG);
		}
		if (content.contains("@FXML")) {
			setTags(file, JAVA_FX_TAG, "controller");
		}
		if (content.contains("extends Application") || content.contains("public void start(Stage")) {
			setTags(file, JAVA_FX_TAG, "application");
		}
	}

	protected String[] getPackageTagsFor(EmfsFile file) {
		Collection<String> packageTagList = new ArrayList<String>();
		packageTagList.add("java");
		packageTagList.add("package");
		if (file.getTags().contains(TEST_TAG)) {
			packageTagList.add(TEST_TAG);
		}
		return packageTagList.toArray(new String[packageTagList.size()]);
	}
	
	protected Collection<String> sourceFolderNames = Arrays.asList("src", "source", "src-gen", "tests", "resources");

	protected int getSourceFolderPos(String[] segments) {
		int pos = segments.length - 2;
		while (pos >= 0) {
			if (sourceFolderNames.contains(segments[pos])) {
				break;
			}
			pos--;
		}
		return pos;
	}
}
