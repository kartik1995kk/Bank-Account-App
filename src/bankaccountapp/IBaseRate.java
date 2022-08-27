package bankaccountapp;

public interface IBaseRate {
	//Write a method that returns the Base Rate
	default double getBaseRate() {
		return 2.5;
	}
}
