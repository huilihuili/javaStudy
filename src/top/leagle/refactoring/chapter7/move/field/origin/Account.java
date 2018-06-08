package top.leagle.refactoring.chapter7.move.field.origin;

public class Account {
	private AccountType accountType;
	private double interestRate;

	public Account(AccountType accountType, int interestRate) {
		this.accountType = accountType;
		this.interestRate = interestRate;
	}

	public double interestForAmountDays(double amount, int days) {
		return interestRate * amount * days / 365;
	}

	public static void main(String[] args) {
		System.out.println(new Account(new AccountType(), 10).interestForAmountDays(100, 70));
	}
}
