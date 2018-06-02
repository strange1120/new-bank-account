
public abstract class Account implements InterestRate {

	String name;
	String SSN;
	String accountNumber;
	double balance;
	double interestRate;
	static int index = 10000;

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

	public void showInfo() {
		System.out.println("NAME: " + name + "\nACCOUNT NUMBER: " + accountNumber + "\nBalance: " + balance + "\nRATE: "
				+ interestRate + "%");
	}

}
