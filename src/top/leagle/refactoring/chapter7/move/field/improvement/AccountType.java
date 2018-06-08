package top.leagle.refactoring.chapter7.move.field.improvement;

public class AccountType {
	private double interestRate;
	
	
	public AccountType(double interestRate) {
		this.interestRate = interestRate;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	
	
}
