package python;

import java.util.Scanner;

public class RPNCalc4UI {

	RPNCalc4Core rpnCalc4Core = new RPNCalc4Core();

	void run() {
		// en Scanner hjelper oss å lese inn og tolke tekst
		// System.in dvs. konsollet, brukes som datakilde for Scanner-objektet
		Scanner scanner = new Scanner(System.in);
		while (true) {
			rpnCalc4Core.printOperands();
			System.out.print(" > ");
			String token = scanner.next();
			if (rpnCalc4Core.isOperand(token)) {
				double operand = Float.valueOf(token);
				rpnCalc4Core.pushOperands(operand);
			} else if (token.equals("exit")) {
				break;
			} else if (token.equals("+")) {
				rpnCalc4Core.plus();
			} else if (token.equals("-")) {
				rpnCalc4Core.minus();
			} else {
				System.out.println("Unsupported operator: " + token);
			}
		}
		// en Scanner må lukkes når vi er ferdig med den
		scanner.close();
		System.out.println("program exited");
	}

	// den obligatoriske oppstartsmetoden for programklasser
	public static void main(String[] args) {
		// vi lager en instans av program-klassen og lar den ta over
		new RPNCalc4UI().run();
	}
}
