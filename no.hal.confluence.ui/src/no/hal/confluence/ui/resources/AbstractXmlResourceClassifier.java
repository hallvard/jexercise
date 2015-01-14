package no.hal.confluence.ui.resources;

import java.util.Collection;

import no.hal.emfs.EmfsFile;
import no.hal.emfs.EmfsResource;

public abstract class AbstractXmlResourceClassifier extends AbstractEmfsResourceClassifier<String> {

	protected boolean isXml(String region, String namespace) {
		if (! region.contains("<?xml")) {
			return false;
		}
		return (namespace == null || region.contains(namespace));
	}

	protected boolean addResource(String region, Collection<EmfsResource> roots, String namespace, String ext, String... tags) {
		if (! isXml(region, "http://javafx.com/fxml")) {
			return false;
		}
		String piPrefix = "<?emfs ";
		int pos1 = region.indexOf(piPrefix), pos2 = region.indexOf("?>", pos1 + 1);
		if (pos1 < 0 || pos2 < 0) {
			return false;
		}
		String xemfs = region.substring(pos1 + piPrefix.length(), pos2).trim();
		EmfsResource emfsResource = XemfsResourceClassifier.readXemfsResource(xemfs);
		EmfsFile file = findEmfsResource(emfsResource, ext);
		if (file == null) {
			return false;
		}
		if (file.getContentProvider() == null) {
			setTags(file, tags);
			file.setContentProvider(createStringContentProvider(region, tags));
		}
		XemfsResourceClassifier.addXemfsResource(emfsResource, roots, true, false);
		return true;
	}
}
