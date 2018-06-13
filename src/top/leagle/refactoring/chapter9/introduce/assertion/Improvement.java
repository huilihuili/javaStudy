package top.leagle.refactoring.chapter9.introduce.assertion;

import org.junit.Assert;

public class Improvement {
	private static final double NULL_EXPENSE = -1.0;
	private double expenseLimit = NULL_EXPENSE;
	private Project primaryProject = new Project();

	double getExpenseLimit() {
		Assert.assertTrue(expenseLimit != NULL_EXPENSE || primaryProject != null);
		return (expenseLimit != NULL_EXPENSE) ? expenseLimit : primaryProject.getMemberExpenseLimit();
	}

	public static void main(String[] args) {
		System.out.println(new Improvement().getExpenseLimit());
	}

}
