package bankaccountapp;

import java.util.LinkedList;
import java.util.List;

public class BankAccounApp {

	public static void main(String[] args) {
		
		List<Account> accounts = new LinkedList<Account>();
		
		
		//Read a CSV file then create the accounts based on that data
		String file = "C:\\Users\\Kartik\\Downloads\\NewBankAccounts.csv";

		List<String[]> newAccountHolders = utilities.CSV.read(file);
		for(String[] accountHolder: newAccountHolders) {
			String name = accountHolder[0];
			String Adhnumber= accountHolder[1];
			String accountType= accountHolder[2];
			double initDeposit = Double.parseDouble(accountHolder[3]);
			//System.out.println(name+" "+Adhnumber+" "+accountType+" ₹"+initDeposit);
			if(accountType.equals("Savings")) {
				accounts.add(new Savings(name, Adhnumber, initDeposit));
			}
			else if(accountType.equals("Checking")) {
				accounts.add(new Checking(name, Adhnumber, initDeposit));
			}
			else {
				System.out.println("ERROR READING ACCOUNT TYPE");
			}
		}
		
		//Iterating in our Data structure to print all the info about each of them
		for(Account acc: accounts) {
			System.out.println("\n******************");
			acc.showInfo();
		}
	}

}
