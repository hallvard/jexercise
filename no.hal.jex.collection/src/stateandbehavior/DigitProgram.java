package stateandbehavior;

public class DigitProgram {

	private Digit lower, higher;

	public String toString() {
		return higher.toString() + lower.toString();
	}
	
	void run() {
		for (int base = 2; base <= 16; base++) {
			lower = new Digit(base);
			higher = new Digit(base);
			System.out.println("Base = " + base);
			for (int i = 0; i < base * base; i++) {
				System.out.print(this + " + 1 = ");
				if (lower.increment() && higher.increment()) {
					System.out.println(this);
					System.out.println("Overflow!");
				} else {
					System.out.println(this);
				}
			}
		}
	}

	public static void main(String[] args) {
		DigitProgram digitProgram = new DigitProgram();
		digitProgram.run();
	}
}
