package top.leagle.refactoring.chapter9.consolidate.conditional.expression;

public class Origin1 {

	double disabilityAmount() {
		if (seniority < 2) {
			return 0;
		}

		if (monthsDisabled > 12) {
			return 0;
		}

		if (isPartTime) {
			return 0;
		}

		return 100;
	}

	private int seniority = 3;
	private int monthsDisabled = 11;
	private boolean isPartTime = false;

	public static void main(String[] args) {
		System.out.println(new Origin1().disabilityAmount());
	}
}
