package python; // package declaration

import java.util.List; // import java.util.List, so it later kan be referenced with just List
import java.util.ArrayList;
import java.util.Scanner;

// declare the RPNCalc1 class
class RPNCalc1 {
    List<Double> operands = new ArrayList<Double>(); // declare and initialise the operands variable

	// declare the main method
    void main() {
        Scanner scanner = new Scanner(System.in); // declare and initialise the scanner variable
        while (true) {
            System.out.println(operands);
            System.out.print(" > ");
            String token = scanner.nextLine();  // declare and initialise the token variable
            if (Character.isDigit(token.charAt(0))) {
                double operand = Double.valueOf(token);
                operands.add(operand);
            } else if (token.equals("exit")) { // in Java there is no elif, you just follow an else with an if
                break;
            } else if (token.equals("+")) {
                operands.add(operands.remove(operands.size() - 1) + operands.remove(operands.size() - 1));
            } else if (token.equals("-")) {
                operands.add(- (operands.remove(operands.size() - 1) - operands.remove(operands.size() - 1)));
            } else {
                System.out.println("Unsupported operator: " + token);
            }
        }
        System.out.println("program exited");
        scanner.close();
    }
    
	// declare the special main method used as entry point for program classes
	public static void main(String[] args) {
        new RPNCalc1().main(); // create program and run its main method
    }
}