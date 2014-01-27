package tictactoe;

import java.io.IOException;
import java.io.StringBufferInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import junit.framework.TestCase;
import no.hal.jex.runtime.CapturingSystemOutStream;
import no.hal.jex.runtime.MultiFilterOutputStream;

public class TicTacToeTest extends TestCase {

	private TicTacToeProgram program;
	
	@Override
	protected void setUp() throws Exception {
		super.setUp();
	}
	
	protected List<String> loadExample(String name) {
		List<String> result = new ArrayList<String>();
		Scanner scanner = new Scanner(this.getClass().getResourceAsStream(name));
		StringBuilder builder = null;
		boolean outputMode = true;
		while (scanner.hasNextLine()) {
			String line = scanner.nextLine();
			String pattern = (outputMode ? ">>>" : "<<<");
			if (builder != null) {
				if (line.startsWith(pattern)) {
					result.add(builder.toString());
					builder = null;
					outputMode = ! outputMode;
				} else {
					builder.append(line);
					builder.append('\n');
				}
			} else if (line.startsWith(pattern)) {
				builder = new StringBuilder();
			}
		}
		scanner.close();
		return result;
	}

	private void provideExampleInput(List<String> outputInputStrings) throws IOException {
		StringBuilder buffer = new StringBuilder();
		for (int i = 1; i < outputInputStrings.size(); i += 2) {
			buffer.append(outputInputStrings.get(i));
		}
		System.setIn(new StringBufferInputStream(buffer.toString()));
	}
	
	public void testExample(String name) throws IOException {
		List<String> example = loadExample(name);
		program = new TicTacToeProgram();
		program.init();
		provideExampleInput(example);
		CapturingSystemOutStream capturingStream = new CapturingSystemOutStream(true);
		MultiFilterOutputStream out = new MultiFilterOutputStream(System.out, capturingStream);
		program.run();
		String output = capturingStream.stopCapturing();
		System.out.println(output);
		testExampleOutput(example, output);
	}

	private void testExampleOutput(List<String> outputInputStrings, String output) {
		int start = 0;
		for (int i = 0; i < outputInputStrings.size(); i += 2) {
			String expectedOutput = outputInputStrings.get(i);
			int pos = output.indexOf(expectedOutput, start);
			if (pos < 0) {
				fail("Didn't find " + expectedOutput + " in output stream after position " + start + ": " + output.substring(start));
			}
			start = pos + expectedOutput.length();
		}
	}

	public void testExample1() throws IOException { testExample("example1.txt"); }
}
