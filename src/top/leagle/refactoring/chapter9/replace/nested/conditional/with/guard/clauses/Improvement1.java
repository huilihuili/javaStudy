package top.leagle.refactoring.chapter9.replace.nested.conditional.with.guard.clauses;

public class Improvement1 {

	String getPayAmount() {
		if (isDead) {
			return "deadAmount";
		}
		if (isSeparated) {
			return "separatedAmount";
		}
		if (isRetired) {
			return "retiredAmount";
		}
		return "normalAmount";
	}

	private boolean isDead = false;
	private boolean isSeparated = false;
	private boolean isRetired = false;

	public static void main(String[] args) {
		System.out.println(new Improvement1().getPayAmount());
	}
}
