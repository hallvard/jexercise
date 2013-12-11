package no.hal.confluence.ui.actions.util;

import no.hal.confluence.ui.actions.SourceComposer;


public class CodeBlockSourceComposer implements SourceComposer<String> {

	public String composeSource(Iterable<String> regions) {
		StringBuilder buffer = new StringBuilder();
		for (String region : regions) {
			buffer.append(region);
			buffer.append("\n");
		}
		return buffer.toString();
	}
}
