package sudoku.sudoku2;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

class SudokuFileLoader implements SudokuLoader {
	String level;
	
	@Override
	public String getLevel() {
		return level;
	}

	public SudokuFileLoader(String filepath) throws FileNotFoundException{
		Scanner file = new Scanner(new FileReader(filepath));
		this.level = file.next();
		file.close();
	}
}
