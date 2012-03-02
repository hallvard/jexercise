package no.hal.jex.editor.actions;

import no.hal.jex.resource.JexResource;
import no.hal.jex.views.actions.JexZipFile;

public class CreateJexClientZipAction extends AbstractCreateJexZipAction {

	@Override
	protected void configureZipFile(JexZipFile zipFile) {
		zipFile.setAddClassFiles(false);
		zipFile.addClasses(Boolean.TRUE);
		zipFile.setResourceFolder("resources");
		zipFile.addResources();
		zipFile.setJexRelatedFiles(new String[] {
				"{0}/{1}." + JexResource.JEX_EXTENSION, null,
				"{0}/{1}.html", null,
		});
	}
}
