package inheritance;

public class SavingsAccount implements Account {
	
	private double balance;
	private double interest;
	
	public SavingsAccount(double interest) {
		this.balance = 0;
		this.interest = interest;
	}
	
	public void deposit(double amount) {
		if (amount < 0) {
			throw new IllegalArgumentException("Can only deposit positive monetary amount.");
		} else {
			balance += amount;
		}
	}

	public void withdraw(double amount) {
		if (amount < 0) {
			throw new IllegalArgumentException("Can only withdraw positive monetary amount.");
		} else if (balance - amount < 0) {
			throw new IllegalStateException("Insufficient funds for withdrawal.");
		} else {
			balance -= amount;
		}
	}

	public double getBalance() {
		return balance;
	}
		
	public void endYearUpdate() {
		balance *= (1+interest);
	}
}