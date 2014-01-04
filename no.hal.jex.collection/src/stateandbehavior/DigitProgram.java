package stateandbehavior;

public class DigitProgram {

	private Digit lower, higher;

	public String toString() {
		return higher.toString() + lower.toString();
	}
	
	void run() {
		for (int base = 2; base <= 16; base++) {
			System.out.println("Base = " + base);
			lower = new Digit(base);
			higher = new Digit(base);
			for (int i = 0; i < base * base; i++) {
				System.out.print(this + " + 1 = ");
				boolean overflow = lower.increment() && higher.increment();
				System.out.println(this);
				if (overflow) {
					System.out.println("Overflow!");
				}
			}
		}
	}

	public static void main(String[] args) {
		DigitProgram digitProgram = new DigitProgram();
		digitProgram.run();
	}
}
