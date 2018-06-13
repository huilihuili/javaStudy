package top.leagle.refactoring.chapter9.replace.nested.conditional.with.guard.clauses;

public class Origin1 {

	String getPayAmount() {
		String result;
		if (isDead) {
			result = "deadAmount";
		} else {
			if (isSeparated) {
				result = "separatedAmount";
			} else {
				if (isRetired) {
					result = "retiredAmount";
				} else {
					result = "normalAmount";
				}
			}
		}
		return result;
	}

	private boolean isDead = false;
	private boolean isSeparated = false;
	private boolean isRetired = false;

	public static void main(String[] args) {
		System.out.println(new Origin1().getPayAmount());
	}
}
