package bankaccountapp;

public class Savings extends Account{
	//List the properties specific to a savings account
	private int safetyDepositBoxID;
	private int safetyDepositBoxkey;
	
	//Constructor to initialize the savings account properties
	public Savings(String name,String Adhnum, double initDeposit) {
		super(name,Adhnum,initDeposit);
		accountNumber = "1"+accountNumber;
		setSafetyDepositBox();
	}
	
	@Override
	public void setRate() {
		rate = getBaseRate() - 0.25;
		
	}
	
	private void setSafetyDepositBox() {
		safetyDepositBoxID = (int)(Math.random()* Math.pow(10,3));
		safetyDepositBoxkey = (int)(Math.random()*Math.pow(10,4));
	}
	
		
	//List any methods specific to the savings account
	
	public void showInfo() {
		System.out.println("ACCOUNT TYPE: Savings");
		super.showInfo();
		System.out.println(
				"Your savings Account Features"+
		"\nSafety Deposit Box ID: "+safetyDepositBoxID+
		"\nSafety Deposit box Key: "+safetyDepositBoxkey
				);
	}
}
