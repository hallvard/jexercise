package stateandbehavior;

import no.hal.jex.runtime.JExercise;
import junit.framework.TestCase;

@JExercise(
	description="The LineEditor class must contain two fields, text and insertionIndex of types String and int, respectively."
)
public class LineEditorTest extends TestCase {

	LineEditor lineEditor;

	@Override
	protected void setUp() throws Exception {
		super.setUp();
		lineEditor = new LineEditor();
		setLineEditor("",  0);
	}

	private void setLineEditor(String text, int index) {
		lineEditor.text = text;
		lineEditor.insertionIndex = index;
	}
	
	private void testLineEditor(String text, int index) {
		assertEquals(text, lineEditor.text);
		assertEquals(index, lineEditor.insertionIndex);
	}
	
	@JExercise(
		tests="void left()",
		description="The left() method moves the insertion index to the left (if possible)."
	)
	public void testLeft() {
		testLineEditor("",  0);
		lineEditor.left();
		testLineEditor("",  0);

		setLineEditor("J", 1);
		lineEditor.left();
		testLineEditor("J", 0);
	}
	
	@JExercise(
		tests="void right()",
		description="The right() method moves the insertion index to the right (if possible)."
	)
	public void testRight() {
		testLineEditor("",  0);
		lineEditor.right();
		testLineEditor("",  0);
		
		setLineEditor("J", 0);
		lineEditor.right();
		testLineEditor("J", 1);
	}

	@JExercise(
		tests="void deleteLeft()",
		description="The deleteLeft() method deletes the character to the left (if possible) and moves the insertion index correspondingly."
	)
	public void testDeleteLeft() {
		testLineEditor("",  0);
		lineEditor.deleteLeft();
		testLineEditor("",  0);
		
		setLineEditor("J", 1);
		lineEditor.deleteLeft();
		testLineEditor("", 0);
		
		setLineEditor("Ja", 1);
		lineEditor.deleteLeft();
		testLineEditor("a", 0);
	}
	
	@JExercise(
		tests="void deleteRight()",
		description="The deleteRight() method deletes the character to the right (if possible)."
	)
	public void testDeleteRight() {
		testLineEditor("",  0);
		lineEditor.deleteRight();
		testLineEditor("",  0);
		
		setLineEditor("J", 0);
		lineEditor.deleteRight();
		testLineEditor("", 0);
		
		setLineEditor("Ja", 1);
		lineEditor.deleteRight();
		testLineEditor("J", 1);
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
}
