package top.leagle.refactoring.chapter7.move.method.improvement1;

public class Account {
	private AccountType accountType;
	private int daysOverdrawn;

	public Account(AccountType accountType, int daysOverdrawn) {
		this.accountType = accountType;
		this.daysOverdrawn = daysOverdrawn;
	}

	double overdraftCharge() {
		return accountType.overdraftCharge(daysOverdrawn);
	}

	double bankCharge() {
		double result = 4.5;
		if (daysOverdrawn > 0) {
			result += overdraftCharge();
		}
		return result;
	}

	public static void main(String[] args) {
		System.out.println(new Account(new AccountType(true), 10).bankCharge());
	}
}
