package inheritance;

public class BSU extends SavingsAccount {
	
	protected double availableBalance;
	protected double depositLimit;
	
	public BSU(double interest, double depositLimit) {
		super(interest);
		availableBalance = 0;
		this.depositLimit = depositLimit;
	}
	
	public void deposit(double amount) {
		if (availableBalance + amount > depositLimit) {
			throw new IllegalStateException("Cannot deposit more than the limit of "+ depositLimit + " per year.");
		} else {
			super.deposit(amount);
			availableBalance += amount;
		}
	}
	
	public void withdraw(double amount) {
		if (amount > availableBalance) {
			throw new IllegalStateException("Insufficient available funds for withdrawal.");
		} else {
			super.withdraw(amount);
			availableBalance -= amount;
		}
	}
	
	public void endYearUpdate() {
		super.endYearUpdate();
		availableBalance = 0;
	}
	
	public double getTaxDeduction() {
		return availableBalance * 0.20;
	}
}
