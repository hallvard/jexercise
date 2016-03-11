package sudoku.sudoku2;

import java.util.ArrayList;

class UniquenessChecker {
	ArrayList<Integer> counts = new ArrayList<Integer>();
	
	public UniquenessChecker() {
		for(int i = 0; i <= 9; i++){
			counts.add(0);
		}
	}
	
	void bump(Integer n){
		int count = counts.get(n);
		counts.set(n, count+1);
	}
	
	ArrayList<Integer> getConflicts(){
		ArrayList<Integer> conflicts = new ArrayList<Integer>();
		for(int i = 1; i <= 9; i++){
			if(counts.get(i) > 1)
				conflicts.add(i);
		}
		return conflicts;
	}
}
