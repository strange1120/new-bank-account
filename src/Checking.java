
public class Checking extends Account {

	int debitCardNumber;
	int debitCardPin;

	public Checking(String name, String SSN, double initialDeposit) {
		super(name, SSN, initialDeposit);
		System.out.println("NEW CHECKING ACCOUNT");
	}

}
