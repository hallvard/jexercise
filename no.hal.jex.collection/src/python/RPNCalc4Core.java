package python;

import java.util.ArrayList;
import java.util.List;

public class RPNCalc4Core {

	// deklarerer lista og setter den til en tom lista
	List<Double> operands = new ArrayList<Double>();

	boolean isOperand(String token) {
		// bruker samme teknikk som i Python:
		// kall konverteringsmetoden for String til desimaltall og returner true hvis det går
	    try {
	        Double.valueOf(token);
	        return true;
	    } catch (NumberFormatException nfe) {
	    	return false;
	    }
	}

	List<Double> popOperands(int n) {
		if (operands.size() < n) {
			return null;
		}
		// må lage en ny liste, som fylles med de bakerste elementene i operands-lista
		List<Double> result = new ArrayList<Double>(n);
		while (n > 0) {
			// remove med angitt indeks fjerner og returnerer siste element
			double lastElement = operands.remove(operands.size() - 1);
			// elementet må legges først i lista, for å unngå å snu rekkefølgen
			result.add(0, lastElement);
			n = n - 1;
		}
		return result;
	}

	void plus() {
		// pop to operander, hvis mulig
		List<Double> ops = popOperands(2);
		// hvis det fantes to operander, så summeres de og push-es tilbake
		if (ops != null) {
			pushOperands(ops.get(0) + ops.get(1));
		}
	}

	void minus() {
		// pop to operander, hvis mulig
		List<Double> ops = popOperands(2);
		// hvis det fantes to operander, så beregnes differansen de og push-es tilbake
		if (ops != null) {
			pushOperands(ops.get(0) - ops.get(1));
		}
	}
	
	void printOperands() {
		System.out.println(operands);
	}

	void pushOperands(double operand) {
		// legg til bakerst
		operands.add(operand);
	}
}
