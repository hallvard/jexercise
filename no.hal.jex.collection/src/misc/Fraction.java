package misc;

public class Fraction {

	private int numerator, denominator;
	
	public Fraction(int numerator, int denominator) {
		super();
		this.numerator = numerator;
		this.denominator = denominator;
		simplify();
	}

	public String toString() {
		return numerator + "/" + denominator;
	}
	
	public double asDouble() {
		return (double) numerator / (double) denominator;
	}

	public int getNumerator() {
		return numerator;
	}

	public int getDenominator() {
		return denominator;
	}

	public Fraction add(Fraction fraction2) {
		return new Fraction(this.numerator * fraction2.denominator + fraction2.numerator * this.denominator, this.denominator * fraction2.denominator);
	}

	public Fraction multiply(Fraction fraction2) {
		return new Fraction(this.numerator * fraction2.numerator, this.denominator * fraction2.denominator);
	}

	public Fraction substract(Fraction fraction2) {
		return new Fraction(this.numerator * fraction2.denominator - fraction2.numerator * this.denominator, this.denominator * fraction2.denominator);
	}

	public Fraction divide(Fraction fraction2) {
		return new Fraction(this.numerator * fraction2.denominator, this.denominator * fraction2.numerator);
	}
	
	private boolean simplify() {
		int gcd = 1;
		if (denominator % numerator == 0) {
			gcd = gcd(numerator, denominator);
		}
		if (denominator < 0) {
			gcd = -gcd;
		}
		if (gcd != 1) {
			numerator /= gcd;
			denominator /= gcd;
			return true;
		}
		return false;
	}

	private int gcd(int a, int b) {
	   return (b == 0 ? a : gcd(b, a % b));
	}
}
