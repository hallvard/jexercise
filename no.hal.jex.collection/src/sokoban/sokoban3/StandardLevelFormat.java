package sokoban.sokoban3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class StandardLevelFormat implements LevelFormat {

	private static String legalChars = "-_# .@+$*";
	
	@Override
	public SokobanGrid readLevel(InputStream input) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(input));
		List<String> lines = new ArrayList<String>();
		try {
			outer: while (reader.ready()) {
				String line = reader.readLine();
				if (! line.startsWith("#")) {
					break;
				}
				for (int i = 0; i < line.length(); i++) {
					if (legalChars.indexOf(line.charAt(i)) < 0) {
						continue outer;
					}
				}
				lines.add(line);
			}
		} finally {
			try {
				reader.close();
			} catch (IOException e) {
			}
		}
		return new SokobanGrid(lines.toArray(new String[lines.size()]));
	}

	@Override
	public void writeLevel(SokobanGrid grid, OutputStream output) throws IOException {
		OutputStreamWriter writer = new OutputStreamWriter(output);
		try {
			writer.write(grid.toString());
		} finally {
			try {
				writer.close();
			} catch (IOException e) {
			}
		}
	}
}
