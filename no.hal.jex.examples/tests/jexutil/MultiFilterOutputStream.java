package jexutil;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * Output stream that writes/copies its contents onto a set of underlying OutputStreams.
 * It may be used for capturing output to Standard.out, without removing it.
 * 
 * @author Hallvard Trætteberg
 *
 */
public class MultiFilterOutputStream extends FilterOutputStream {

	final protected OutputStream[] outs;

	public MultiFilterOutputStream(OutputStream[] outs) {
		super(null);
		this.outs = outs.clone();
	}

	public MultiFilterOutputStream(OutputStream out1, OutputStream out2) {
		super(null);
		this.outs = new OutputStream[]{out1, out2};
	}
	
	// This is the only write method that needs to be overwritten,
	// since it is called by the two other write methods.
	// Not very efficient, but it works.
	public void write(int b) throws IOException {
		for (int i = 0; i < outs.length; i++) {
			if (outs[i] != null) {
				out = outs[i];
				super.write(b);
			}
		}
	}

	public void flush() throws IOException {
		for (int i = 0; i < outs.length; i++) {
			if (outs[i] != null) {
				out = outs[i];
				super.flush();
			}
		}
	}

	public void close() throws IOException {
		for (int i = 0; i < outs.length; i++) {
			if (outs[i] != null) {
				out = outs[i];
				super.close();
			}
		}
	}
}
