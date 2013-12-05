package stateandbehavior;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LineEditorXProgram {

	LineEditorX lineEditor;

	void init() {
		lineEditor = new LineEditorX();
		lineEditor.text = "";
		lineEditor.insertionIndex = 0;
	}
	
	void run() {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			System.out.println(lineEditor);
			String line = null;
			try {
				line = reader.readLine();
			} catch (IOException e) {
				System.err.println(e);
			}
			if (line == null || line.trim().length() == 0) {
				System.err.println(lineEditor);
				break;
			}
			int pos = 0;
			while (pos < line.length()) {
				char c = line.charAt(pos);
				if (c == '"') {
					lineEditor.insertString(line.substring(pos + 1));
					pos = line.length();
				} else if (c == 'l' || c == '<') {
					lineEditor.left();
					pos = pos + 1;
				} else if (c == 'L') {
					lineEditor.selectLeft();
					pos = pos + 1;
				} else if (c == 'r' || c == '>') {
					lineEditor.right();
					pos = pos + 1;
				} else if (c == 'R') {
					lineEditor.selectRight();
					pos = pos + 1;
				} else if (c == 'b') {
					lineEditor.deleteLeft();
					pos = pos + 1;
				} else if (c == 'd') {
					lineEditor.deleteRight();
					pos = pos + 1;
				} else {
					lineEditor.insertString(line);
					pos = line.length();
				}
			}
		}
	}

	public static void main(String[] args) {
		LineEditorXProgram lineEditorProgram = new LineEditorXProgram();
		lineEditorProgram.init();
		lineEditorProgram.run();
	}
}
