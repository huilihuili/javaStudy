package top.leagle.refactoring.chapter7.move.method.origin;

public class Account {
	private AccountType accountType;
	private int daysOverdrawn;

	public Account(AccountType accountType, int daysOverdrawn) {
		this.accountType = accountType;
		this.daysOverdrawn = daysOverdrawn;
	}

	double overdraftCharge() {
		if (accountType.isPreminum()) {
			double result = 10;
			if (daysOverdrawn > 7) {
				result += (daysOverdrawn - 7) * 0.85;
			}
			return result;
		} else {
			return daysOverdrawn * 1.75;
		}
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
