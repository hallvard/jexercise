package encapsulation;

import junit.framework.TestCase;

public class AccountTest extends TestCase {

	private double epsilon = 0.000001d;
	
	Account account;

	@Override
	protected void setUp() throws Exception {
		super.setUp();
		account = new Account(100, 5);
	}
	
	public void testAccount() {
		account = new Account(100, 5);
		assertEquals(100.0d, account.getBalance(), epsilon);
		assertEquals(5.0d, account.getInterestRate(), epsilon);
		try {
			account = new Account(-1, 5);
			fail("Creating Account with negative balance should throw an IllegalArgumentException.");
		} catch (Exception e) {
			assertEquals(100.0d, account.getBalance(), epsilon);
			assertEquals(5.0d, account.getInterestRate(), epsilon);	
			assertTrue("Exception should be IllegalArgumentException.", e instanceof IllegalArgumentException);
		}
		
		try {
			account = new Account(100, -1);
			fail("Creating Account with negative interestRate should throw an IllegalArgumentException.");
		} catch (Exception e) {
			assertEquals(100.0d, account.getBalance(), epsilon);
			assertEquals(5.0d, account.getInterestRate(), epsilon);
			assertTrue("Exception should be IllegalArgumentException.", e instanceof IllegalArgumentException);
		}
	}
	
	public void testSetInterestRate() {
		account.setInterestRate(7);
		assertEquals(7.0d, account.getInterestRate(), epsilon);
		try {
			account.setInterestRate(-2);
			fail("Setting a negative interestRate should result throw exception.");
		} catch (Exception e) {
			assertEquals(7.0d, account.getInterestRate(), epsilon);
		}
	}
	

	public void testDeposit() {
		account.deposit(100);
		assertEquals(200.0d, account.getBalance(), epsilon);
	}
	
	public void testDepositNegativeAmount() {
		try {
			account.deposit(-50);
			fail("deposit should throw an IllegalArgumentException when given negative amounts.");
		} catch (Exception e) {
			assertEquals("deposit should ignore negative amounts.", 100.0d, account.getBalance(), epsilon);
			assertTrue("Exception should be IllegalArgumentException.", e instanceof IllegalArgumentException);
		}
	}
	
	public void testWithdraw() {
		try {
			account.withdraw(50);
			assertEquals(50.0d, account.getBalance(), epsilon);
		} catch (Exception e){
			fail();
		}
	}
	
	public void testWithdrawTooLargeAmount() {
		try {
			account.withdraw(150);
			fail("Expected IllegalStateException here");
		} catch (Exception e){
			assertEquals(100.0d, account.getBalance(), epsilon);
			assertTrue(e instanceof IllegalStateException);
		}
	}
}
