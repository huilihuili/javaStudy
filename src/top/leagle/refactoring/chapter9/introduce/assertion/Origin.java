package top.leagle.refactoring.chapter9.introduce.assertion;

public class Origin {
	private static final double NULL_EXPENSE = -1.0;
	private double expenseLimit = NULL_EXPENSE;
	private Project primaryProject = new Project();

	double getExpenseLimit() {
		return (expenseLimit != NULL_EXPENSE) ? expenseLimit : primaryProject.getMemberExpenseLimit();
	}

	public static void main(String[] args) {
		System.out.println(new Origin().getExpenseLimit());
	}

}
