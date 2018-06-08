package top.leagle.refactoring.chapter7.move.method.improvement3;

public class AccountType {
	private boolean preminum;

	public AccountType(boolean preminum) {
		this.preminum = preminum;
	}

	boolean isPreminum() {
		return preminum;
	}

	double overdraftCharge(Account account) {
		if (isPreminum()) {
			double result = 10;
			if (account.getDaysOverdrawn() > 7) {
				result += (account.getDaysOverdrawn() - 7) * 0.85;
			}
			return result;
		} else {
			return account.getDaysOverdrawn() * 1.75;
		}
	}
}
