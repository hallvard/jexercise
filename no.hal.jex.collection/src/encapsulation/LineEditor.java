package encapsulation;

public class LineEditor {

	private String text;
	private int insertionIndex;
	
	public LineEditor() {
		setText("");
	}

	@Override
	public String toString() {
		return text.substring(0, insertionIndex) + '|' + text.substring(insertionIndex);
	}

	public String getText() {
		return text;
	}
	
	public void setText(String text) {
		this.text = text;
		end();
	}
	
	public void setInsertionIndex(int index) {
		if (index < 0) {
			throw new IllegalArgumentException("The insertion index cannot be negative");
		} else if (index > text.length()) {
			throw new IllegalArgumentException("The insertion index cannot be larger than the length of the text");
		}
		insertionIndex = index;
	}

	public int getInsertionIndex() {
		return insertionIndex;
	}
	
	public void left() {
		if (insertionIndex > 0) {
			insertionIndex--;
		}
	}
	
	public void right() {
		if (insertionIndex < text.length()) {
			insertionIndex++;
		}
	}
	
	public void beginning() {
		insertionIndex = 0;
	}

	public void end() {
		insertionIndex = text.length();
	}
	
	public void insertString(String s) {
		text = text.substring(0, insertionIndex) + s + text.substring(insertionIndex);
		insertionIndex += s.length();
	}
	
	public void deleteLeft() {
		if (insertionIndex > 0) {
			text = text.substring(0, insertionIndex - 1) + text.substring(insertionIndex);
			insertionIndex--;
		}
	}
	
	public void deleteRight() {
		if (insertionIndex < text.length()) {
			text = text.substring(0, insertionIndex) + text.substring(insertionIndex + 1);
		}
	}

	// optional

	public void insert(Object o) {
		insertString(o.toString());
	}
	
	private String wordCharacters = "qwertyuiopåasdfghjkløæzxcvbnmQWERTYUIOPÅASDFGHJKLØÆZXCVBNM";
	
	public void setWordCharacters(String wordCharacters) {
		this.wordCharacters = wordCharacters;
	}
	
	private boolean isWordChar(char c) {
		return wordCharacters.indexOf(c) >= 0;
	}

	public void leftWord() {
		while (insertionIndex > 0) {
			if (isWordChar(text.charAt(insertionIndex - 1))) {
				break;
			}
			insertionIndex--;
		}
		while (insertionIndex > 0) {
			if (! isWordChar(text.charAt(insertionIndex - 1))) {
				break;
			}
			insertionIndex--;
		}
	}
	
	public void rightWord() {
		while (insertionIndex < text.length()) {
			if (isWordChar(text.charAt(insertionIndex))) {
				break;
			}
			insertionIndex++;
		}
		while (insertionIndex < text.length()) {
			if (! isWordChar(text.charAt(insertionIndex))) {
				break;
			}
			insertionIndex++;
		}
	}
}
