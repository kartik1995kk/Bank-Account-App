 package bankaccountapp;

public abstract class Account implements IBaseRate {
	//List common properties for savings and checking accounts
	private String name;
	private String Adhnumber;
	private double balance;
	
	private static int index = 10000;
	protected String accountNumber;
	protected double rate;
	
	//Constructor to set base properties and initialize the account
	public Account(String name,String Adhnum,double initDeposit) {
		this.name=name;
		Adhnumber=Adhnum;
		balance=initDeposit;
		
		//Set account number
		index++;
		this.accountNumber=setAccountNumber();
		
		setRate();
	}
	
	public abstract void setRate();
	
	private String setAccountNumber() {
		String lastTwoOfAdh = Adhnumber.substring(Adhnumber.length()-2,Adhnumber.length());
		int uniqueID = index;
		int randomNumber = (int)(Math.random() * Math.pow(10,3));
		return lastTwoOfAdh + uniqueID+ randomNumber;
	}
	
	public void compound() {
		double accruedInterest = balance * (rate/100);
		balance = balance + accruedInterest; 
		System.out.println("Accrued Interest ₹"+accruedInterest);
		printBalance();
	}
	
	//List common methods + transactions
	public void deposit(double amount) {
		balance = balance+amount;
		System.out.println("Depositing ₹"+amount);
		printBalance();
	}
	
	public void withdraw(double amount) {
		balance = balance-amount;
		System.out.println("Withdrawing ₹"+amount);
		printBalance();
	}
	
	public void transfer(String towhere,double amount) {
		balance = balance-amount;
		System.out.println("Transfering ₹"+amount+" to "+towhere);
		printBalance();
	}
	
	public void printBalance() {
		System.out.println("Your balance is now ₹"+balance);
	}
	
	public void showInfo() {
		System.out.println(
				"NAME: "+ name+
				"\nACCOUNT NUMBER: "+accountNumber+
				"\nBALANCE: ₹" + balance+
				"\nRATE: "+rate+"%"
				);
	}
}
