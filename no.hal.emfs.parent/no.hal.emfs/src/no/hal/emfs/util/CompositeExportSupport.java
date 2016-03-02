package no.hal.emfs.util;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;

import no.hal.emfs.exporter.ExportSupport;

public class CompositeExportSupport implements ExportSupport {

	private Collection<ExportSupport> exportSupports = new ArrayList<ExportSupport>();
	
	public void addExportSupport(ExportSupport exportSupport) {
		if (! exportSupports.contains(exportSupport)) {
			exportSupports.add(exportSupport);
		}
	}

	public void removeImportSupport(ExportSupport exportSupport) {
		exportSupports.remove(exportSupport);
	}

	@Override
	public File provideExport(String spec) {
		for (ExportSupport exportSupport : exportSupports) {
			try {
				File file = exportSupport.provideExport(spec);
				if (file != null) {
					return file;
				}
			} catch (Exception e) {
			}
		}
		return null;
	}
}
