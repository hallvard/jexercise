package no.hal.emfs.exporter;

import no.hal.emfs.EmfsResource;

public class ExportTrigger extends AbstractExportTrigger {

	public ExportTrigger(Exporter exporter) {
		super(exporter);
	}

	@Override
	protected void exportResource(EmfsResource eObject) {
		getPorter().exportResources(getEmfsResource(), null, null);
	}
}
