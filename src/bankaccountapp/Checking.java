package bankaccountapp;

public class Checking extends Account{
	//List the properties specific to a checking account
	private int debitCardnumber;
	private int debitCardPIN;
	
	//Constructor to initialize the checking account properties
	public Checking(String name,String Adhnum,double initDeposit) {
		super(name,Adhnum,initDeposit);
		accountNumber = "2" + accountNumber;
		setDebitCard();
	}
	
	@Override
	public void setRate() {
		rate = getBaseRate() * 0.15;
	}
	
	private void setDebitCard() {
		debitCardnumber = (int)(Math.random()*Math.pow(10,12));
		debitCardPIN = (int)(Math.random()*Math.pow(10,4));
	}
	
	//List any methods specific to the checking account 
	public void showInfo() {
		System.out.println("ACCOUNT TYPE: Checking");
		super.showInfo();
		System.out.println("Your Checking Account Features"+
				"\nDebit Card Number: "+debitCardnumber+
				"\nDebit Card PIN: "+debitCardPIN
				);
	}
}
