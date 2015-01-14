package no.hal.emfs.util;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;

public class CompositeImportSupport implements ImportSupport {

	private Collection<ImportSupport> importSupports = new ArrayList<ImportSupport>();
	
	public void addImportSupport(ImportSupport importSupport) {
		if (! importSupports.contains(importSupport)) {
			importSupports.add(importSupport);
		}
	}

	public void removeImportSupport(ImportSupport importSupport) {
		importSupports.remove(importSupport);
	}

	@Override
	public File provideImport(String spec) {
		for (ImportSupport importSupport : importSupports) {
			try {
				File file = importSupport.provideImport(spec);
				if (file != null) {
					return file;
				}
			} catch (Exception e) {
			}
		}
		return null;
	}
}
