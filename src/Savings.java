
public class Savings extends Account {

	int safetyDepositBoxId;
	int safetyDepositBoxKey;

	public Savings(String name, String SSN, double initialDeposit) {
		super(name, SSN, initialDeposit);
		accountNumber = "1" + accountNumber;
		setSafetyDepositBox();
	}

	@Override
	public void setRate() {
		interestRate = getBaseRate() - .25;
	}

	private void setSafetyDepositBox() {
		safetyDepositBoxId = (int) (Math.random() * Math.pow(10, 3));
		safetyDepositBoxKey = (int) (Math.random() * Math.pow(10, 4));
	}

	public void showInfo() {
		super.showInfo();
		System.out.println("Your savings account features" + "\n Safety Deposit Box Id: " + safetyDepositBoxId
				+ "\n Safety Deposit Box Key: " + safetyDepositBoxKey);
	}

}
