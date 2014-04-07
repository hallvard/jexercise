package encapsulation;

public class Digit {

	private int base;
	private int value = 0;
	
	public Digit(int base) {
		if (base <= 0) {
			throw new IllegalArgumentException("Cannot set base to a negative number.");
		} else {
			this.base = base;
		}
	}
	
	public String toString() {
		return String.valueOf("0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ".charAt(value));
	}
	
	public int getValue() {
		return value;
	}
	
	public int getBase() {
		return base;
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