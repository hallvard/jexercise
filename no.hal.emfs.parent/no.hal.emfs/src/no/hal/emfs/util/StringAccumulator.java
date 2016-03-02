package no.hal.emfs.util;

import no.hal.emfs.AbstractStringContents;

public interface StringAccumulator<A> {
	public A accumulate(A acc, String content, AbstractStringContents context);
}
