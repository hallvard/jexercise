package encapsulation;

import no.hal.jex.runtime.JExercise;
import no.hal.jex.standalone.JexStandalone;
import junit.framework.TestCase;

@JExercise(
	description="The LineEditor class manages a line of _text_ (a *String*), that is navigated in and edited using a cursor (at an _insertion index_).",
	markupLanguage="textile"
)
public class LineEditorTest extends TestCase {

	private LineEditor lineEditor;

	@Override
	protected void setUp() throws Exception {
		super.setUp();
		lineEditor = new LineEditor();
		setLineEditor("",  0);
	}

	private void setLineEditor(String text, int index) {
		lineEditor.setText(text);
		lineEditor.setInsertionIndex(index);
	}
	
	private void testLineEditor(String message, String text, int index) {
		assertEquals(message, text, lineEditor.getText());
		assertEquals(message, index, lineEditor.getInsertionIndex());
	}
	
	private void testLineEditor(String text, int index) {
		testLineEditor("", text, index);
	}
	
	@JExercise(
			tests="LineEditor()",
			description="Initializes this LineEditor to the empty text."
			)
	public void testLineEditor() {
		testLineEditor("", 0);
	}

	@JExercise(
			tests="void setText(String);String getText()",
			description="The *setText(String)* method sets the text to its *String* argument. The insertion index is set to the _end_ of the text.\nThe *getText()* method returns the line of text as a *String*."
	)
	public void testGetSetText() {
		String text = "ABC";
		lineEditor.setText(text);
		testLineEditor(text, text.length());
		lineEditor.setText("");
		testLineEditor("", 0);
	}
	
	@JExercise(
			tests="void setInsertionIndex(int);int getInsertionIndex()",
			description="The *setInsertionIndex(int)* method sets this LineEditor's insertion index to the argument. The valid range is 0 to (and including) the length of the text. The getInsertionIndex() method returns this LineEditor's insertion index."
	)
	public void testGetSetInsertionIndex() {
		String text = "ABC";
		lineEditor.setText(text);
		testLineEditor(text, text.length());
		lineEditor.setInsertionIndex(0);
		assertEquals(lineEditor.getInsertionIndex(), 0);
		testLineEditor(text, 0);
		lineEditor.setInsertionIndex(3);
		testLineEditor(text, 3);
		try {
			lineEditor.setInsertionIndex(-1);
			fail();
		} catch (Exception e) {
			assertTrue(e instanceof IllegalArgumentException);
			testLineEditor(text, 3);
		}
		try {
			lineEditor.setInsertionIndex(4);
			fail();
		} catch (Exception e) {
			assertTrue(e instanceof IllegalArgumentException || e instanceof IllegalStateException || e instanceof IndexOutOfBoundsException);
			testLineEditor(text, 3);
		}
	}
	
	@JExercise(
		tests="void left()",
		description="The left() method moves the insertion index to the left (if possible)."
	)
	public void testLeft() {
		setLineEditor("Ja", 2);
		lineEditor.left();
		testLineEditor("Ja", 1);
		lineEditor.left();
		testLineEditor("Ja", 0);
		lineEditor.left();
		testLineEditor("Calling left() when the insertion index is at the beginning of the string should be ignored. ", "Ja",  0);
	}
	
	@JExercise(
		tests="void right()",
		description="The right() method moves the insertion index to the right (if possible)."
	)
	public void testRight() {
		setLineEditor("Ja",  0);
		lineEditor.right();
		testLineEditor("Ja",  1);
		lineEditor.right();
		testLineEditor("Ja",  2);
		lineEditor.right();
		testLineEditor("Calling right() when the insertion index is at the end of the string should be ignored. ", "Ja",  2);
	}

	@JExercise(
		tests="void deleteLeft()",
		description="The deleteLeft() method deletes the character to the left (if possible) and moves the insertion index correspondingly."
	)
	public void testDeleteLeft() {
		setLineEditor("Ja",  0);
		lineEditor.deleteLeft();
		testLineEditor("Ja",  0);

		setLineEditor("Ja",  1);
		lineEditor.deleteLeft();
		testLineEditor("a",  0);
		lineEditor.deleteLeft();
		testLineEditor("a",  0);
		
		setLineEditor("Ja",  2);
		lineEditor.deleteLeft();
		testLineEditor("J",  1);
		lineEditor.deleteLeft();
		testLineEditor("",  0);
		lineEditor.deleteLeft();
		testLineEditor("",  0);
	}
	
	@JExercise(
		tests="void deleteRight()",
		description="The deleteRight() method deletes the character to the right (if possible)."
	)
	public void testDeleteRight() {
		setLineEditor("Ja",  2);
		lineEditor.deleteRight();
		testLineEditor("Ja",  2);

		setLineEditor("Ja",  1);
		lineEditor.deleteRight();
		testLineEditor("J",  1);
		lineEditor.deleteRight();
		testLineEditor("J",  1);
		
		setLineEditor("Ja",  0);
		lineEditor.deleteRight();
		testLineEditor("a",  0);
		lineEditor.deleteRight();
		testLineEditor("",  0);
		lineEditor.deleteRight();
		testLineEditor("",  0);
	}
	
	@JExercise(
		tests="void insertString(String)",
		description="The insertString(String) method inserts its argument at the current insertion index and moves the insertion index correspondingly."
	)
	public void testInsertString() {
		testLineEditor("",  0);
		lineEditor.insertString("");
		testLineEditor("",  0);
		lineEditor.insertString("Java");
		testLineEditor("Java",  4);
		lineEditor.insertString(" er gøy!");
		testLineEditor("Java er gøy!",  12);

		setLineEditor("Javagøy!", 4);
		lineEditor.insertString(" er ");
		testLineEditor("Java er gøy!",  8);
		
		setLineEditor("er gøy!", 0);
		lineEditor.insertString("Java ");
		testLineEditor("Java er gøy!",  5);
	}

	// optional
	
	public static void main(String[] args) {
		JexStandalone.main(LineEditorTest.class);
	}
}