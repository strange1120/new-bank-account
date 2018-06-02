import java.util.LinkedList;
import java.util.List;

public class BankAccountApp {

	public static void main(String[] args) {
		List<Account> accounts = new LinkedList<Account>();

		String file = "/Users/sarahstrange/Desktop/dev/new-bank-account/NewBankAccounts.csv";

		List<String[]> newAccounts = utilities.CSV.read(file);
		for (String[] newAccount : newAccounts) {
			String name = newAccount[0];
			String SSN = newAccount[1];
			String accountType = newAccount[2];
			double initialDeposit = Double.parseDouble(newAccount[3]);
			System.out.println(name + " " + SSN + " " + accountType + " $" + initialDeposit);
			if (accountType.equals("Savings")) {
				accounts.add(new Savings(name, SSN, initialDeposit));
			} else if (accountType.equals("Checking")) {
				accounts.add(new Checking(name, SSN, initialDeposit));
			} else {
				System.out.println("Error reading account type");
			}
		}

		for (Account account : accounts) {
			System.out.println("\n*************");
			account.showInfo();
		}
	}

}
