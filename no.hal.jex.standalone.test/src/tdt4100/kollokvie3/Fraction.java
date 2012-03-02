package tdt4100.kollokvie3;

public class Fraction {

	private int numerator, denominator;
	
	public Fraction(int numerator, int denominator) {
		super();
		this.numerator = numerator;
		this.denominator = denominator;
	}

	public double asDouble() {
		return numerator / denominator;
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
}
