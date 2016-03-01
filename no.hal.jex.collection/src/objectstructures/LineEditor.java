package objectstructures;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;


public class LineEditor {

	private int insertionIndex, end;
	private String text;
	private List<Region> regions;
	
	public LineEditor(String text, int insertionIndex, int end) {  
		regions = new ArrayList<Region>();
		this.text = text;
		setInsertionRegion(insertionIndex, end);
	}

	public LineEditor() { 
		this("", 0, 0);
	}
	
	@Override
	public String toString() {
		String result = "";
		if (end < insertionIndex) {
			result += text.substring(0, end) + '<' + text.substring(end, insertionIndex) + "|";
			if (insertionIndex < text.length()) {
				result += text.substring(insertionIndex);
			}
		} else {
			result += text.substring(0, insertionIndex) + '|';
			if (insertionIndex < text.length()) {
				result += text.substring(insertionIndex, end) + ">";
				if (end < text.length()) {
					result += text.substring(end);
				}
			} else {
				result += ">";
			}
		}
		result += "";
		for (Region region : regions) {
			result += region;
		}
		return result;
	}

	public String getText() {
		return text;
	}
	
	public int getInsertionIndex() {
		return insertionIndex;
	}
	
	public int getEnd() {
		return end;
	}
	
	// region methods
	
	public int getRegionCount() {
		return regions.size();
	}

	public Region getRegion(int i) {
		return regions.get(i);
	}
	
	public String getRegionText(int i) {
		Region region = getRegion(i);
		return text.substring(region.getStartPos(), region.getEndPos());
	}

	// insertion
	
	private int computeInsertionPos(int pos, int delta) {
		pos += delta;
		if (pos < 0) {
			pos = 0;
		} else if (pos > text.length()) {
			pos = text.length();
		}
		return pos;
	}
	
	private void setInsertionRegion(int start, int end) {
		this.insertionIndex = computeInsertionPos(start, 0);
		if (end < 0) {
			end = start;
		}
		this.end = computeInsertionPos(end, 0);
	}

	
	// navigation

	public void left(boolean select) {
		if (select) {
			setInsertionRegion(computeInsertionPos(insertionIndex, -1), end);
		} else if (insertionIndex != end) {
			setInsertionRegion(computeInsertionPos(Math.min(insertionIndex, end), 0), -1);
		} else {
			setInsertionRegion(computeInsertionPos(insertionIndex, -1), -1);
		}
	}

	public void right(boolean select) {
		if (select) {
			setInsertionRegion(computeInsertionPos(insertionIndex, 1), end);
		} else if (insertionIndex != end) {
			setInsertionRegion(computeInsertionPos(Math.max(insertionIndex, end), 0), -1);
		} else {
			setInsertionRegion(computeInsertionPos(insertionIndex, 1), -1);
		}
	}
	
	// insertion/replacement

	private void adjustRegions(int pos, int increment) {
		Iterator<Region> it = regions.iterator();
		while (it.hasNext()) {
			Region next = it.next();
			next.adjustRegion(pos, increment);
			if (next.isEmpty()) {
				it.remove();
			}
		}
	}

	public void replaceRegion(String s) {
		int start = insertionIndex, end = this.end;
		if (start > end) {
			end = start;
			start = this.end;
		}
		int increment = start - end;
		String prefix = text.substring(0, start), suffix = text.substring(end);
		if (s != null) {
			text = prefix + s + suffix;
			increment += s.length();
			setInsertionRegion(start + s.length(), -1);
		} else {
			text = prefix + suffix;
			setInsertionRegion(start, -1);
		}
		adjustRegions(start, increment);
	}
	
	// deletion

	public void deleteLeft() {
		if (insertionIndex == end) {
			left(true);
		}
		replaceRegion(null);
	}

	public void deleteRight() {
		if (insertionIndex == end) {
			right(true);
		}
		replaceRegion(null);
	}

	// tagging
	
	public void insertTag(String tag) {
		regions.add(new Region(Math.min(insertionIndex, end), Math.max(insertionIndex, end), tag));
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		LineEditor lineEditor = new LineEditor();
		System.out.println(lineEditor);
		while (scanner.hasNextLine()) {
			String line = scanner.nextLine();
			if (line.length() == 0) {
				break;
			}
			switch (line.charAt(0)) {
			case 'l': lineEditor.left(false); break;
			case 'L': lineEditor.left(true); break;
			case 'r': lineEditor.right(false); break;
			case 'R': lineEditor.right(true); break;
			case 'd': lineEditor.deleteLeft(); break;
			case 'D': lineEditor.deleteRight(); break;
			case '\"': lineEditor.replaceRegion(line.substring(1)); break;
			default: lineEditor.replaceRegion(line); break;
			}
			System.out.println(lineEditor);
		}
		scanner.close();
	}
}
