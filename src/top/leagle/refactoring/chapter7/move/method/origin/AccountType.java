package top.leagle.refactoring.chapter7.move.method.origin;

public class AccountType {
	private boolean preminum;

	public AccountType(boolean preminum) {
		this.preminum = preminum;
	}

	boolean isPreminum() {
		return preminum;
	}
}
