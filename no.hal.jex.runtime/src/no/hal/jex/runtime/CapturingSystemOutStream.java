package no.hal.jex.runtime;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class CapturingSystemOutStream extends MultiFilterOutputStream {

	private ByteArrayOutputStream capturingOut;
	private PrintStream oldSystemOut;
	
	public CapturingSystemOutStream(boolean startCapturing) {
		super(new ByteArrayOutputStream(), null);
		capturingOut = (ByteArrayOutputStream) outs[0];
		oldSystemOut = null;
		if (startCapturing) {
			startCapturing();
		}
	}
	
	public void startCapturing() {
		if (oldSystemOut == null) {
			outs[1] = (oldSystemOut = System.out);
			System.setOut(new PrintStream(this));
		}
	}

	public String stopCapturing() {
		String capturedOutput = null;
		if (oldSystemOut != null) {
			System.setOut(oldSystemOut);
			outs[1] = (oldSystemOut = null);
			capturedOutput = capturingOut.toString();
			capturingOut.reset();
		}
		return capturedOutput;
	}
}
