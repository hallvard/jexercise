package composite;

public class IncrementableProgram {

	private Incrementable incrementable;

	public String toString() {
		return incrementable.toString();
	}
	
	void run() {
		incrementable = new CompositeIncrementable(new CompositeIncrementable(16, 2), new CompositeIncrementable(16, 2));
		for (int i = 0; i < incrementable.size(); i++) {
			System.out.print(this + " + 1 = ");
			boolean overflow = incrementable.increment();
			System.out.println(this + " = " + incrementable.toInt() + " base 10");
			if (overflow) {
				System.out.println("Overflow!");
			}
		}
	}

	public static void main(String[] args) {
		IncrementableProgram digitProgram = new IncrementableProgram();
		digitProgram.run();
	}
}
