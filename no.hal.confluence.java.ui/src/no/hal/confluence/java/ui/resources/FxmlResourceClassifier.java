package no.hal.confluence.java.ui.resources;

import java.util.Collection;

import no.hal.confluence.ui.resources.AbstractXmlResourceClassifier;
import no.hal.emfs.EmfsResource;

public class FxmlResourceClassifier extends AbstractXmlResourceClassifier {

	@Override
	public boolean addResource(String region, Collection<EmfsResource> roots) {
		return super.addResource(region, roots, "http://javafx.com/fxml", ".fxml", "fxml");
	}
}
