package tictactoe.tictactoe2;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public interface LevelFormat {
	
	public TicTacToe readLevel(InputStream input) throws IOException;
	public void writeLevel(TicTacToe grid, OutputStream output) throws IOException;

}
