package tictactoe.tictactoe3;

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
	public TicTacToe readLevel(InputStream input) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(input));
		String firstLine = null;
		StringBuilder builder = new StringBuilder();
		try {
			int count = 0;
			while (reader.ready()) {
				String line = reader.readLine();
				if (firstLine == null) {
					firstLine = line;
					continue;
				}
				for (int i = 0; i < line.length(); i++) {
					char c = line.charAt(i);
					if (c == 'x') {
						count++;
					} else if (c == 'o') {
						count--;
					}
				}
				builder.append(line);
			}
			String[] params = firstLine.split(" ");
			try {
				return new TicTacToe(Integer.valueOf(params[0]), Integer.valueOf(params[1]), builder.toString(), count == 0);
			} catch (IndexOutOfBoundsException e) {
			} catch (NumberFormatException e) {
			}
			return null;
		} finally {
			try {
				reader.close();
			} catch (IOException e) {
			}
		}
	}

	@Override
	public void writeLevel(TicTacToe grid, OutputStream output) throws IOException {
		OutputStreamWriter writer = new OutputStreamWriter(output);
		try {
			writer.write(grid.getGridWidth() + " " + grid.getWinLength() + "\n");
			writer.write(grid.toString());
		} finally {
			try {
				writer.close();
			} catch (IOException e) {
			}
		}
	}
}
