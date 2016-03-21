package stateandbehavior;

import java.util.Scanner;

public class Calc1Program {

	Calc1 calc1;

	void init() {
		calc1 = new Calc1();
	}
	
	int skipWhitespace(String s, int pos) {
		while (pos < s.length() && Character.isWhitespace(s.charAt(pos))) {
			pos++;
		}
		return pos;
	}
	
	void run() {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNextLine()) {
			String line = scanner.nextLine();
			if (line == null || line.trim().length() == 0) {
				System.err.println(calc1);
				break;
			}
			double value = doLine(line);
			System.out.printf("=%f\n", value);
		}
		scanner.close();
	}

	double doLine(String line) {
		int pos = skipWhitespace(line, 0);
		while (pos < line.length()) {
			char c = line.charAt(pos), op = '\0';
			if (! Character.isDigit(c)) {
				op = c;
				pos++;
			}
			pos = skipWhitespace(line, pos);
			double arg = Double.NaN;
			int end = pos;
			while (end < line.length()) {
				c = line.charAt(end);
				if (! (Character.isDigit(c) || c == '.')) {
					break;
				}
				end++;
			}
			if (end > pos) {
				arg = Double.valueOf(line.substring(pos, end));
				pos = end;
			}
			if (op == '\0' && (! Double.isNaN(arg))) {
				calc1.setValue(arg);
			} else if (op != '\0' && Double.isNaN(arg)) {
				if (op == '-') {
					calc1.negate();
				} else if (op == 'π') {
					calc1.pi();
				}
			} else {
				if (op == '+') {
					calc1.add(arg);
				} else if (op == '-') {
					calc1.subtract(arg);
				} else if (op == '*') {
					calc1.multiply(arg);
				} else if (op == '/') {
					calc1.divide(arg);
				} else if (op == '%') {
					calc1.percent(arg);
				}
			}
			pos = skipWhitespace(line, pos);
		}
		return calc1.getValue();
	}

	public static void main(String[] args) {
		Calc1Program calc1Program = new Calc1Program();
		calc1Program.init();
		calc1Program.run();
	}
}
