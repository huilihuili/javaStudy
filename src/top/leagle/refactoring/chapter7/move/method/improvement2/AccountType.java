package top.leagle.refactoring.chapter7.move.method.improvement2;

public class AccountType {
	private boolean preminum;

	public AccountType(boolean preminum) {
		this.preminum = preminum;
	}

	boolean isPreminum() {
		return preminum;
	}

	double overdraftCharge(int daysOverdrawn) {
		if (isPreminum()) {
			double result = 10;
			if (daysOverdrawn > 7) {
				result += (daysOverdrawn - 7) * 0.85;
			}
			return result;
		} else {
			return daysOverdrawn * 1.75;
		}
	}
}
