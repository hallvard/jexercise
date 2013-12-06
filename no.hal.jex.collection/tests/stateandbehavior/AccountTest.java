package stateandbehavior;

import no.hal.jex.eval.JExercise;
import junit.framework.TestCase;

@JExercise(
	description="An Account must contain two double fields, balance and interestRate, and methods for depositing amounts and computing and adding interest."
)
public class AccountTest extends TestCase {

	Account account;

	@Override
	protected void setUp() throws Exception {
		super.setUp();
		account = new Account();
		account.balance = 0;
		account.interestRate = 5;
	}

	@JExercise(
		tests="void deposit(double)",
		description="The deposit(double) method takes an amount as its only argument, and adds it to the balance."
	)
	public void testDeposit() {
		account.deposit(100);
		assertEquals(100.0d, account.balance);
	}
	
	@JExercise(
			tests="void deposit(double)",
			description="The deposit(double) method should ignore negative amounts."
			)
	public void testDepositNegativeAmount() {
		account.deposit(-50);
		assertEquals(0.0d, account.balance);
	}
	
	@JExercise(
		tests="void addInterest()",
		description="The addInterest() method computes the interest, based on the current balance and interestRate, and adds it to the balance. The method should ignore negative interest rates."
	)
	public void testAddInterest() {
		account.deposit(100);
		assertEquals(100.0d, account.balance);
		account.addInterest();
		assertEquals(105.0d, account.balance);
	}
}
