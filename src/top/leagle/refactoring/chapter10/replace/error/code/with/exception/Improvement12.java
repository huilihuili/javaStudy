package top.leagle.refactoring.chapter10.replace.error.code.with.exception;

public class Improvement12 {

	public boolean canWithdraw(int amount) {
		return balance >= amount ? true : false;
	}

	public void withdraw(int amount) {
		Assert.isTrue("sufficient funds", amount <= balance);
		balance -= amount;
	}

	private int balance = 3000;

	public static void main(String[] args) {
		Improvement12 account = new Improvement12();
		int amount = 4000;
		if (!account.canWithdraw(amount)) {
			System.out.println("handleOverdrawn");
		} else {
			System.out.println("doTheUsualThing");
			account.withdraw(amount);
		}
	}

}
