
public class Savings extends Account {

	int safetyDepositBoxId;
	int safetyDepositBoxKey;

	public Savings(String name, String SSN, double initialDeposit) {
		super(name, SSN, initialDeposit);
		System.out.println("NEW SAVINGS ACCOUNT");
	}
}
