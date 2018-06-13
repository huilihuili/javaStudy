package top.leagle.refactoring.chapter9.replace.nested.conditional.with.guard.clauses;

public class Origin2 {

	String getPayAmount() {
		String result = "0";
		if (captital) {
			if (intrate && duration) {
				result = "1";
			}
		}
		return result;
	}

	private boolean captital = true;
	private boolean intrate = true;
	private boolean duration = true;

	public static void main(String[] args) {
		System.out.println(new Origin2().getPayAmount());
	}
}
