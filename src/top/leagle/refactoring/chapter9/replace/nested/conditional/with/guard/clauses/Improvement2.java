package top.leagle.refactoring.chapter9.replace.nested.conditional.with.guard.clauses;

public class Improvement2 {

	String getPayAmount() {
		if (!captital) {
			return "0";
		}
		if ((!intrate) || (!duration)) {
			return "0";
		}
		return "1";
	}

	private boolean captital = true;
	private boolean intrate = true;
	private boolean duration = true;

	public static void main(String[] args) {
		System.out.println(new Improvement2().getPayAmount());
	}
}
