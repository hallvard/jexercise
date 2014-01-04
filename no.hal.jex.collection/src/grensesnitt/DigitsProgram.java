package grensesnitt;

public class DigitsProgram {

	private Incrementable incrementable;

	public String toString() {
		return incrementable.toString();
	}
	
	void run() {
		int base = 16;
		incrementable = new Digits(base, 2);
		for (int i = 0; i < base * base; i++) {
			System.out.print(this + " + 1 = ");
			boolean overflow = incrementable.increment();
			System.out.println(this + " = " + incrementable.toInt() + " base 10");
			if (overflow) {
				System.out.println("Overflow!");
			}
		}
	}

	public static void main(String[] args) {
		DigitsProgram digitProgram = new DigitsProgram();
		digitProgram.run();
	}
}
