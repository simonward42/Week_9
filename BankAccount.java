public class BankAccount {
	private int balance = 0;
	public int getBalance() {			// this method should be synchronized, should ensure that the 
		return balance;					// correct balance is returned; as it is now, the balance could
	}									// be altered many times before the method returns.
	public void deposit(int money) {	// this method must be synchronized to avoid lost updates
		balance = balance + money;
	}
	public int retrieve(int money) { 	// this method should be synchronized too - it reads and writes 
		int result = 0;					// to balance several times
		if (balance > money) {
			result = money;
		} else {
			result = balance;
		}
		balance = balance - result;
		return result;
	}
}