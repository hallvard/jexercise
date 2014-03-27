package sokoban.sokoban3;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public interface LevelFormat {
	
	public SokobanGrid readLevel(InputStream input) throws IOException;
	public void writeLevel(SokobanGrid grid, OutputStream output) throws IOException;

}
