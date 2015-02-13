package objectstructures;

public class Region {

	private int startPos;
	private int endPos;
	private String tag;
	
	public Region(int startPos, int endPos, String tag) {
		setTag(tag);
		this.startPos = startPos;
		this.endPos = endPos;
	}

	public String toString() {
		return "[" + startPos + "," + endPos + ":" + tag + ">";
	}

	public void adjustRegion(int pos, int increment) {
		if (pos < startPos) {
			startPos += increment;
		}
		if (pos < endPos) {
			endPos += increment;
		}
	}

	public boolean isEmpty() {
		return endPos == startPos;
	}
	
	public int getStartPos() {
		return startPos;
	}

	public int getEndPos() {
		return endPos;
	}

	public String getTag() {
		return tag;
	}
	public void setTag(String tag) {
		this.tag = tag;
	}
}
