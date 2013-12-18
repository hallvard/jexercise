package stateandbehavior;

public class Account {

	double balance;
	double interestRate;
	
	void deposit(double amount) {
		if (amount >= 0) {
			balance += amount;
		}
	}
	
	void addInterest() {
		deposit(balance * interestRate / 100);
	}
}
