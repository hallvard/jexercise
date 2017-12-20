/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package misc;

import junit.framework.TestCase;
import misc.Fraction;
import no.hal.jex.runtime.JExercise;

/**
 *
 * @author bjorncs og hal
 * 
 */

@JExercise(
		description="Fraction-klassen skal representere en brøk (teller og nevner)." +
				"Det skal være mulig å kunne utføre vanlige regneoperasjoner som pluss, minus, deling og multplikasjon på instanser av klassen, samt kunne hente ut verdien som en double." +
				"Når du implementerer klassen skal du spesifisere synlighet på felter og metoder (Hint: Innkapsling).",
		comment="Alle former for utregning skal bruke teller og nevner (ikke flyttallsberegninger), og resultatet skal alltid være en ny brøk." +
				"Når klassen er ferdig skal den kunne brukes på denne måten:" +
				"<p><code>" +
				"Fraction f1 = new Fraction(2, 3);<br>" +
				"Fraction f2 = new Fraction(4, 3);<br>" +
				"Fraction result1 = f1.add(f2);<br>" +
				"Fraction result2 = f1.substract(f2);<br>" +
				"println(result1.toString()); // Skriver ut 2/1<br>" +
				"println(result2.toString()); // Skriver ut -2/3<br>" +
				"println(result1.asDouble()); // Skriver ut 2.0<br>" +
				"println(f1.getNumerator()); // Skriver 2<br>" +
				"println(f1.getDenominator()); // Skriver 3<br>" +
				"</code>"
		)

public class FractionTest extends TestCase {

	@JExercise(
			tests="Fraction(int,int); int getNumerator(); int getDenominator()",
			description="Konstruktøren skal ta inn en teller og en nevner som heltall. Lag også gettere for teller og nevner hhv. getNumerator og getDenominator."
			)
	public void testFraction() {
		Fraction fraction = new Fraction(4, 5);
		assertEquals(4, fraction.getNumerator());
		assertEquals(5, fraction.getDenominator());
	}

	@JExercise(
			tests="toString()",
			description="toString-metoden skal returnere en streng som representerer brøken. Strengen skal være på formen 3/4, 12/11, -2/3 etc."
			)
	public void testToString() {
		Fraction fraction = new Fraction(4, 5);
		assertEquals("4/5", fraction.toString());
	}

	@JExercise(
			tests="double asDouble()",
			description="asDouble()-metoden returnerer brøken som et desimaltall (returverdi av type double)."
			)
	public void testAsDouble() {
		Fraction fraction = new Fraction(1, 8);
		assertEquals(1.0/8.0, fraction.asDouble());
	}

	@JExercise(
			tests="private boolean simplify()",
			description="Når vi utfører en regneoperasjon med 2 brøker, får vi ofte en brøk som kan forenkles." +
					"For eksempel:  ⅔ + 4/3 == 6/3 == 2/1, Eller 7/10 - ⅕ == 5/10 == ½." +
					"Lag hjelpemetoden simplify() som forenkler brøken. Den skal endre feltene for teller og nevner slik at brøken blir forenklet mest mulig." +
					"Den skal også sørge for at kun teller kan være negativ. Gjør om konstruktøren slik at den bruker simplify()." +
					"Gi metoden en relevant synlighet (Hint: når og hvor skal metoden brukes).",
			comment="Eksempel på hvordan simplify vil fungere:" +
					"<p><code>" +
					"Fraction f1 = new Fraction(3, 15); // simplify vil forenkle brøken til 1/3<br>" +
					"println(f1); // Skriver ut 1/3<br>" +
					"println(f1.asDouble()); //Skriver ut 0.3333......<br>" +
					"println(f1.getNumerator()); //Skriver 1<br>" +
					"println(f1.getDenominator()); //Skriver 3<br>" +
					"</code>"
			)
	public void testSimplify() {
		Fraction fraction = new Fraction(2, -8);
		assertEquals(-1, fraction.getNumerator());
		assertEquals(4, fraction.getDenominator());
	}

	@JExercise(
			tests="Fraction add(Fraction)",
			description="add-metoden tar inn et Fraction-objekt og regner ut summen av parameteren og objektet som metoden blir kalt på." +
					"Den skal returnere et nytt Fraction-objekt, det originale Fraction-objektet skal ikke blir endret!"
			)
	public void testAdd() {
		Fraction fraction1 = new Fraction(3, 2);
		Fraction fraction2 = new Fraction(3, 2);
		Fraction result = fraction1.add(fraction2);
		assertEquals(3.0, result.asDouble());
	}

	@JExercise(
			tests="Fraction multiply(Fraction)",
			description="multiply-metoden tar inn et Fraction-objekt og regner ut produktet av parameteren og objektet som metoden blir kalt på." +
					"Den skal returnere et nytt Fraction-objekt, det originale Fraction-objektet skal ikke blir endret!"
			)
	public void testMultipy() {
		Fraction fraction1 = new Fraction(3, 2);
		Fraction fraction2 = new Fraction(2, 1);
		Fraction result = fraction1.multiply(fraction2);
		assertEquals(3.0, result.asDouble());
	}

	@JExercise(
			tests="Fraction substract(Fraction)",
			description="substract-metoden tar inn et Fraction-objekt og regner ut differansen mellom objektet som metoden blir kalt på og parameteren, altså this - parameteret." +
					"Den skal returnere et nytt Fraction-objekt, det originale Fraction-objektet skal ikke blir endret!"
			)
	public void testSubstract() {
		Fraction fraction1 = new Fraction(5, 2);
		Fraction fraction2 = new Fraction(3, 2);
		Fraction result = fraction1.substract(fraction2);
		assertEquals(1.0, result.asDouble());
	}

	@JExercise(
			tests="Fraction divide(Fraction)",
			description="divide-metoden tar inn et Fraction-objekt og deler objektet på parameteren, altså this / parameteret." +
					"Den skal returnere et nytt Fraction-objekt, det originale Fraction-objektet skal ikke blir endret!"
			)
	public void testDivide() {
		Fraction fraction1 = new Fraction(18, 2);
		Fraction fraction2 = new Fraction(3, 1);
		Fraction result = fraction1.divide(fraction2);
		assertEquals(3.0, result.asDouble());
	}
}
