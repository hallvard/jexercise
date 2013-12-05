package stateandbehavior;

public class LineEditorX {

	String text;
	int insertionIndex, selectionEnd;
	
	@Override
	public String toString() {
		if (insertionIndex < selectionEnd)
			return String.format("[LineEditor \"%s<%s>%s\"]", text.substring(0, insertionIndex), text.substring(insertionIndex, selectionEnd), text.substring(selectionEnd));
		else if (insertionIndex > selectionEnd)
			return String.format("[LineEditor \"%s>%s<%s\"]", text.substring(0, selectionEnd), text.substring(selectionEnd, insertionIndex), text.substring(insertionIndex));
		return String.format("[LineEditor \"%s|%s\"]", text.substring(0, insertionIndex), text.substring(insertionIndex));
	}

	void left(int n, boolean select) {
		if (select) {
			if (selectionEnd > n) {
				selectionEnd = selectionEnd - n; 
			} else {
				selectionEnd = 0; 
			}
		} else {
			if (selectionEnd != insertionIndex) {
				insertionIndex = Math.min(insertionIndex, selectionEnd);
			} else if (insertionIndex > n) {
				insertionIndex = insertionIndex - n; 
			} else {
				insertionIndex = 0; 
			}
			selectionEnd = insertionIndex;
		}
	}
	
	void left() {
		left(1, false);
	}
	
	void selectLeft() {
		left(1, true);
	}
	
	void right(int n, boolean select) {
		if (select) {
			if (selectionEnd < text.length() - n) {
				selectionEnd = selectionEnd + n;
			} else {
				selectionEnd = text.length();
			}
		} else {
			if (selectionEnd != insertionIndex) {
				// clear range
				insertionIndex = Math.max(insertionIndex, selectionEnd);
			} else if (insertionIndex < text.length() - n) {
				insertionIndex = insertionIndex + n;
			} else {
				insertionIndex = text.length();
			}
			selectionEnd = insertionIndex;
		}
	}

	void right() {
		right(1, false);
	}

	void selectRight() {
		right(1, true);
	}

	void insertString(String s) {
		int minIndex = Math.min(insertionIndex, selectionEnd);
		int maxIndex = Math.max(insertionIndex, selectionEnd);
		text = text.substring(0, minIndex) + s + text.substring(maxIndex);
		insertionIndex = minIndex + s.length();
		selectionEnd = insertionIndex;
	}
	
	void insert(Object o) {
		insertString(o.toString());
	}

	void deleteSelection() {
		int minIndex = Math.min(insertionIndex, selectionEnd);
		int maxIndex = Math.max(insertionIndex, selectionEnd);
		text = text.substring(0, minIndex) + text.substring(maxIndex);
		insertionIndex = minIndex;
		selectionEnd = insertionIndex;
	}

	void deleteLeft() {
		if (selectionEnd != insertionIndex) {
			deleteSelection();
		} else if (insertionIndex > 0) {
			text = text.substring(0, insertionIndex - 1) + text.substring(insertionIndex);
			insertionIndex = insertionIndex - 1;
			selectionEnd = insertionIndex;
		}
	}
	
	void deleteRight() {
		if (selectionEnd != insertionIndex) {
			deleteSelection();
		} else if (insertionIndex < text.length()) {
			text = text.substring(0, insertionIndex) + text.substring(insertionIndex + 1);
		}
	}
}
