
public class Checking extends Account {

	int debitCardNumber;
	int debitCardPin;

	public Checking(String name, String SSN, double initialDeposit) {
		super(name, SSN, initialDeposit);
		accountNumber = "2" + accountNumber;
		setDebitCardInfo();
	}

	public void setDebitCardInfo() {
		debitCardNumber = (int) (Math.random() * Math.pow(10, 12));
		debitCardPin = (int) (Math.random() * Math.pow(10, 4));
	}

	public void showInfo() {
		super.showInfo();
		System.out.println("Your checking account features" + "\n Debit Card Number: " + debitCardNumber
				+ "\n Debit Card Pin: " + debitCardPin);
	}

}
