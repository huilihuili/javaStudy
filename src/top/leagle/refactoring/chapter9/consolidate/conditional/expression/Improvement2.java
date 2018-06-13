package top.leagle.refactoring.chapter9.consolidate.conditional.expression;

public class Improvement2 {

	double getAmount() {
		return (onVacation() && lengthOfService() > 10) ? 1 : 0.5;
	}

	boolean onVacation() {
		return true;
	}

	int lengthOfService() {
		return 20;
	}

	public static void main(String[] args) {
		System.out.println(new Improvement2().getAmount());
	}
}
