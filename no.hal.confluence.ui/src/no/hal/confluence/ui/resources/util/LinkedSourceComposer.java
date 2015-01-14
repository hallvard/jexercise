package no.hal.confluence.ui.resources.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

import no.hal.confluence.ui.resources.SourceComposer;

public class LinkedSourceComposer implements SourceComposer<URL> {

	@Override
	public String composeSource(Iterable<URL> regions) {
		StringBuilder buffer = new StringBuilder();
		for (URL sourceUrl : regions) {
			int start = buffer.length();
			if (loadSource(sourceUrl, buffer)) {
				buffer.append("\n");
			} else {
				buffer.setLength(start);
			}
		}
		return buffer.toString();
	}
	
	private boolean loadSource(URL sourceUrl, StringBuilder buffer) {
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(sourceUrl.openStream()));
			String line = null;
			while ((line = reader.readLine()) != null) {
				buffer.append(line);
				buffer.append("\n");
			}
			return true;
		} catch (MalformedURLException e) {
			System.err.println(e);
		} catch (IOException e) {
			System.err.println(e);
		}
		return false;
	}
}
