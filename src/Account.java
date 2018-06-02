
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
		System.out.println("ACCOUNT NUMBER" + this.accountNumber);

	}

	private String setAccountNumber() {
		String lastTwoOfSSN = SSN.substring(SSN.length() - 2, SSN.length());
		int uniqueId = index;

		return lastTwoOfSSN + uniqueId;
	}

}
