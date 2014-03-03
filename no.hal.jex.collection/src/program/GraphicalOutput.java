package program;

import java.util.Map;

public interface GraphicalOutput extends TextualOutput {
	public void clear();
	public void line(int x1, int y1, int x2, int y2);
	public void rect(int x, int y, int w, int h);
	public void image(String imageKey, int x, int y, int w, int h);
	public void imageGrid(String grid, Map<String, String> mapping);
}
