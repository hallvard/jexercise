package no.hal.jex.editor.actions;

import no.hal.jex.resource.JexResource;
import no.hal.jex.views.actions.JexZipFile;

public class CreateJexServerZipAction extends AbstractCreateJexZipAction {

	private static final String JEXERCISE_FILENAME = "exercise";
	
	@Override
	protected void configureZipFile(JexZipFile zipFile) {
		zipFile.setAddClassFiles(true);
		zipFile.setJexRelatedFiles(new String[] {
			"{0}/{1}." + JexResource.JEX_EXTENSION, JEXERCISE_FILENAME + "." + JexResource.JEX_EXTENSION, 
		});
		zipFile.setRenamePatterns(new String[]{
			"bin\\/(.*)Test\\.class", "testbin/$1Test.class",
			"bin\\/(.*)AllTests\\.class", "testbin/$1AllTests.class",
		});
		zipFile.addClasses(Boolean.TRUE);
	}
}
