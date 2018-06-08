package top.leagle.refactoring.chapter7.move.field.improvement;

public class Account {
	private AccountType accountType;

	public Account(AccountType accountType) {
		this.accountType = accountType;
	}

	public double interestForAmountDays(double amount, int days) {
		return accountType.getInterestRate() * amount * days / 365;
	}

	public static void main(String[] args) {
		System.out.println(new Account(new AccountType(10)).interestForAmountDays(100, 70));
	}
}
