package interfaces;

public class Digit implements Incrementable {

	private final int base;
	private int value = 0;
	
	public Digit(int base) {
		this.base = base;
	}
	
	public String toString() {
		return String.valueOf("0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ".charAt(value));
	}
	
	public int size() {
		return base;
	}
	
	public int toInt() {
		return value;
	}

	public boolean increment() {
		value += 1;
		if (value == base) {
			value = 0;
			return true;
		}
		return false;
	}
}
