
public class BankAccountApp {

	public static void main(String[] args) {

		Checking checkingAccount1 = new Checking("Tom Wilson", "738476374", 1500);

		Savings savingsAccount1 = new Savings("Rich Lowe", "837485746", 2500);

		savingsAccount1.showInfo();
		checkingAccount1.showInfo();
	}

}
