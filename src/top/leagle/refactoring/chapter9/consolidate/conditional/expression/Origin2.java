package top.leagle.refactoring.chapter9.consolidate.conditional.expression;

public class Origin2 {

	double getAmount() {
		if (onVacation()) {
			if (lengthOfService() > 10) {
				return 1;
			}
		}
		return 0.5;
	}

	boolean onVacation() {
		return true;
	}

	int lengthOfService() {
		return 20;
	}

	public static void main(String[] args) {
		System.out.println(new Origin2().getAmount());
	}
}
