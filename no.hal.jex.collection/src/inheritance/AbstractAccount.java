package inheritance;

public abstract class AbstractAccount {

	protected double balance;
	
	public AbstractAccount() {
		balance = 0;
	}
	
	public void deposit(double amount) {
		if (amount >= 0) {
			balance += amount;
		} else {
			throw new IllegalArgumentException("Amount must be positive");
		}
	}
	
	public void withdraw(double amount) {
		if (amount >= 0) {
			internalWithdraw(amount);
		} else {
			throw new IllegalArgumentException("Amount cannot be negative");
		}
	}
	
	protected abstract void internalWithdraw(double amount);
	 
    public double getBalance() {
    	return balance;
    }
}
