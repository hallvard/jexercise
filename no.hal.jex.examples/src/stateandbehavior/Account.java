package stateandbehavior;

public class Account {

	double balance;
	double interestRate;
	
	public String toString() {
		return String.format("[Account balance=%f interestRate=%f", balance, interestRate);
	}
	
	void deposit(double amount) {
		if (amount > 0) {
			balance = balance + amount;
		}
	}
	
	void addInterest() {
		deposit(balance * interestRate / 100);		
	}
}
