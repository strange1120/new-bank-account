
public abstract class Account implements InterestRate {

	private String name;
	private String SSN;
	protected String accountNumber;
	private double balance;
	protected double interestRate;
	private static int index = 10000;

	public Account(String name, String SSN, double initialDeposit) {
		this.name = name;
		this.SSN = SSN;
		balance = initialDeposit;

		index++;
		this.accountNumber = setAccountNumber();

		setRate();
	}

	public abstract void setRate();

	private String setAccountNumber() {
		String lastTwoOfSSN = SSN.substring(SSN.length() - 2, SSN.length());
		int uniqueId = index;
		int randomNumber = (int) (Math.random() * Math.pow(10, 3));

		return lastTwoOfSSN + uniqueId + randomNumber;
	}

	public void compound() {
		double accruedInterest = balance * (interestRate / 100);
		balance = balance + accruedInterest;
		System.out.println("Accrued interest: $" + accruedInterest);
		printBalance();
	}

	public void deposit(double amount) {
		balance = balance + amount;
		System.out.println("Depositing $" + amount);
		printBalance();
	}

	public void withdraw(double amount) {
		balance = balance - amount;
		System.out.println("Withdrawing $" + amount);
		printBalance();
	}

	public void transfer(String toWhere, double amount) {
		balance = balance - amount;
		System.out.println("Transferring $" + amount + " to " + toWhere);
		printBalance();
	}

	public void printBalance() {
		System.out.println("Your balance is now: $" + balance);
	}

	public void showInfo() {
		System.out.println("NAME: " + name + "\nACCOUNT NUMBER: " + accountNumber + "\nBalance: " + balance + "\nRATE: "
				+ interestRate + "%");
	}

}
