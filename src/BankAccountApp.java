import java.util.List;

public class BankAccountApp {

	public static void main(String[] args) {

		String file = "/Users/sarahstrange/Desktop/dev/new-bank-account/NewBankAccounts.csv";

		Checking checkingAccount1 = new Checking("Tom Wilson", "738476374", 1500);

		Savings savingsAccount1 = new Savings("Rich Lowe", "837485746", 2500);

		savingsAccount1.showInfo();
		System.out.println("***************");
		checkingAccount1.showInfo();

		List<String[]> newAccounts = utilities.CSV.read(file);
		for (String[] newAccount : newAccounts) {
			String name = newAccount[0];
			String SSN = newAccount[1];
			String accountType = newAccount[2];
			double initialDeposit = Double.parseDouble(newAccount[3]);
			System.out.println(name + " " + SSN + " " + accountType + " $" + initialDeposit);
			if (accountType.equals("Savings")) {
				System.out.println("Open a savings account");
			} else if (accountType.equals("Checking")) {
				System.out.println("Open a checking account");
			} else {
				System.out.println("Error reading account type");
			}
		}
	}

}
