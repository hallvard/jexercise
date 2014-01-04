package composite;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class CompositeIncrementable implements Incrementable {

	private Collection<Incrementable> incrementables;

	public CompositeIncrementable(Incrementable...incrementables) {
		this.incrementables = Arrays.asList(incrementables);
	}
	
	public CompositeIncrementable(int base, int digitCount) {
		incrementables = new ArrayList<Incrementable>(digitCount);
		while (digitCount > 0) {
			incrementables.add(new Digit(base));
			digitCount--;
		}
	}

	public String toString() {
		String result = "";
		for (Incrementable incrementable : incrementables) {
			result = incrementable + result;
		}
		return result;
	}
	
	public int size() {
		int result = 1;
		for (Incrementable incrementable : incrementables) {
			result *= incrementable.size();
		}
		return result;
	}
	
	public int toInt() {
		int result = 0, mult = 1;
		for (Incrementable incrementable : incrementables) {
			result += incrementable.toInt() * mult;
			mult *= incrementable.size();
		}
		return result;
	}

	public boolean increment() {
		for (Incrementable incrementable : incrementables) {
			if (! incrementable.increment()) {
				return false;
			}
		}
		return true;
	}
}
