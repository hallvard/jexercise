package sudoku.sudoku2;

import java.util.Stack;

class UndoSystem {
	private SudokuGame game;
	private Stack<String> undos = new Stack<String>();
	private Stack<String> redos = new Stack<String>();

	public UndoSystem(SudokuGame game)
	{
		this.game = game;
	}
	
	public void doMove(String move)
	{
		redos.clear();
		String reverseMove = calculateReverseMove(move);
		undos.push(reverseMove);
	}
	
	public String undo()
	{
		String move = undos.pop();
		String reverseMove = calculateReverseMove(move);
		redos.push(reverseMove);
		return move;
	}
	
	public String redo()
	{
		String move = redos.pop();
		String reverseMove = calculateReverseMove(move);
		undos.push(reverseMove);
		return move;
	}

	private String calculateReverseMove(String move) {
		int row = move.charAt(0) - '1';
		int col = move.charAt(1) - 'a';
		
		return move.substring(0, 2) + game.getCell(col, row).getValue();
	}
}
