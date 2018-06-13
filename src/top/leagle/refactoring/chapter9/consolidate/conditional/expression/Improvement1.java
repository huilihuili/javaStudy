package top.leagle.refactoring.chapter9.consolidate.conditional.expression;

public class Improvement1 {

	double disabilityAmount() {
		if (isNotEligibleForDisability()) {
			return 0;
		}
		return 100;
	}

	boolean isNotEligibleForDisability() {
		return (seniority < 2) || (monthsDisabled > 12) || (isPartTime);
	}

	private int seniority = 3;
	private int monthsDisabled = 11;
	private boolean isPartTime = false;

	public static void main(String[] args) {
		System.out.println(new Improvement1().disabilityAmount());
	}
}
