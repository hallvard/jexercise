package stateandbehavior;

/* @startuml

object "LineEditor" as lineEditor1 {
	text = ""
	insertionIndex = 0
}
lineEditor1 --> lineEditor1 : deleteLeft()
lineEditor1 --> lineEditor1 : deleteRight()

object "LineEditor" as lineEditor2 {
	text = "Java"
	insertionIndex = 4
}
lineEditor1 --> lineEditor2 : insertString("Java")

object "LineEditor" as lineEditor3 {
	text = "Java er gørr"
	insertionIndex = 12
}
lineEditor2 --> lineEditor3 : insertString(" er gørr")

object "LineEditor" as lineEditor4 {
	text = "Java er gørr"
	insertionIndex = 11
}
lineEditor3 --> lineEditor4 : left()

object "LineEditor" as lineEditor5 {
	text = "Java er gør"
	insertionIndex = 10
}
lineEditor4 --> lineEditor5 : deleteLeft()

object "LineEditor" as lineEditor6 {
	text = "Java er gø"
	insertionIndex = 10
}
lineEditor5 --> lineEditor6 : deleteRight()

object "LineEditor" as lineEditor7 {
	text = "Java er gøy!"
	insertionIndex = 12
}
lineEditor6 --> lineEditor7 : insertString("y!")

@enduml */

public class LineEditorProgram {

	LineEditor lineEditor;

	void init() {
		lineEditor = new LineEditor();
		lineEditor.text = "";
		lineEditor.insertionIndex = 0;
	}
	
	void run() {
		lineEditor.deleteLeft();
		System.out.println(lineEditor);
		lineEditor.deleteRight();
		System.out.println(lineEditor);
		lineEditor.insertString("Java");
		System.out.println(lineEditor);
		lineEditor.insertString(" er gørr");
		System.out.println(lineEditor);
		lineEditor.left();
		System.out.println(lineEditor);
		lineEditor.deleteLeft();
		System.out.println(lineEditor);
		lineEditor.deleteRight();
		System.out.println(lineEditor);
		lineEditor.insertString("y!");
		System.out.println(lineEditor);
	}

	public static void main(String[] args) {
		LineEditorProgram lineEditorProgram = new LineEditorProgram();
		lineEditorProgram.init();
		lineEditorProgram.run();
	}
}
