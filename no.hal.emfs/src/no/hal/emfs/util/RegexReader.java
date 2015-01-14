package no.hal.emfs.util;

import java.io.FilterReader;
import java.io.Reader;

public class RegexReader extends FilterReader {

	protected RegexReader(Reader in) {
		super(in);
	}
}
