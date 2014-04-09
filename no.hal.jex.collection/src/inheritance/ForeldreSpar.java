package inheritance;

public class ForeldreSpar extends SavingsAccount {

	protected int withdrawCount;
	protected int withdrawLimit;
	
	public ForeldreSpar(double interest, int withdrawLimit) {
		super(interest);
		withdrawCount = 0;
		this.withdrawLimit = withdrawLimit;
	}
	
	public void withdraw(double amount) {
		if (withdrawCount >= withdrawLimit) {
			throw new IllegalStateException("Cannot withdraw more than the permitted number of times, " + withdrawLimit + ", per year.");
		} else {
			super.withdraw(amount);
			withdrawCount++;
		}
	}
	
	public void endYearUpdate() {
		super.endYearUpdate();
		withdrawCount = 0;
	}
	
	public int getRemainingWithdrawals() {
		return withdrawLimit - withdrawCount;
	}
}