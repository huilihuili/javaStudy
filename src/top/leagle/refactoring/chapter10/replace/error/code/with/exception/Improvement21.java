package top.leagle.refactoring.chapter10.replace.error.code.with.exception;

public class Improvement21 {

	public void withdraw(int amount) throws BalanceException {
		if (amount > balance) {
			throw new BalanceException();
		}
		balance -= amount;
	}

	private int balance = 3000;

	public static void main(String[] args) {
		Improvement21 account = new Improvement21();
		int amount = 4000;
		try {
			account.withdraw(amount);
			System.out.println("doTheUsualThing");
		} catch (BalanceException e) {
			System.out.println("handleOverdrawn");
		}
	}

}
