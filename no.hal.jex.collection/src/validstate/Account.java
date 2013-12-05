package validstate;

public class Account {

	double balance;
	double interestRate;
	
	public String toString() {
		return String.format("[Account balance=%f interestRate=%f", balance, interestRate);
	}
	
	boolean isValidAmount(double amount) {
		return amount >= 0.0d;
	}
	
	void deposit(double amount) {
		if (isValidAmount(amount)) {
			balance = balance + amount;
		}
	}

	boolean isValidWithdrawAmount(double amount) {
		return amount <= balance;
	}
	
	void withdraw(double amount) {
		if (isValidAmount(amount) && isValidWithdrawAmount(amount)) {
			balance = balance - amount;
		}
	}
	
	void addInterest() {
		balance = balance + balance * interestRate / 100;		
	}
}
