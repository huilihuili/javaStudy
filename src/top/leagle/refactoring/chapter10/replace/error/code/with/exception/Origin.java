package top.leagle.refactoring.chapter10.replace.error.code.with.exception;

public class Origin {

	public int withdraw(int amount) {
		if (amount > balance) {
			return -1;
		} else {
			balance -= amount;
			return 0;
		}
	}

	private int balance = 3000;

	public static void main(String[] args) {
		Origin account = new Origin();
		int amount = 4000;
		if (account.withdraw(amount) == -1) {
			System.out.println("handleOverdrawn");
		} else {
			System.out.println("doTheUsualThing");
		}
	}
}
