package stateandbehavior;

/* @startuml

object "Account" as account1 {
	balance = 0
	interestRate = 5
}
 
object "Account" as account2 {
	balance = 100
	interestRate = 5
}

account1 --> account2 : deposit(100)
account2 --> account2 : deposit(-50)
 
object "Counter" as account3 {
	balance = 105
	interestRate = 5
}

account2 --> account3 : addInterest()

@enduml */

public class AccountProgram {
	
	Account account;

	void init() {
		account = new Account();
		account.balance = 0;
		account.interestRate = 5;
	}
	
	void run() {
		System.out.println(account);
		account.deposit(100);
		System.out.println(account);
		account.deposit(-50);
		System.out.println(account);
		account.addInterest();
		System.out.println(account);
	}
	
	public static void main(String[] args) {
		AccountProgram accountProgram = new AccountProgram();
		accountProgram.init();
		accountProgram.run();
	}
}
