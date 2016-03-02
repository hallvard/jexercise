package no.hal.emfs.exporter;

import java.io.File;

public interface ExportSupport {
	public File provideExport(String spec);
}
