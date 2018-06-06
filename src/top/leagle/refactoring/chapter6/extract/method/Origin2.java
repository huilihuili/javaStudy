package top.leagle.refactoring.chapter6.extract.method;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.junit.Test;

public class Origin2 {
	private List<Double> orders = Arrays.asList(1.2, 1.3, 1.4);
	private String name = "Leagle";

	public void printOwingImprovement(double previousAmount) {
		Iterator<Double> iterator = orders.iterator();
		double outstanding = previousAmount * 1.2;

		printBanner();

		while (iterator.hasNext()) {
			Double each = (Double) iterator.next();
			outstanding += each;
		}

		printDetails(outstanding);
	}

	private void printBanner() {
		System.out.println("*************************");
		System.out.println("***** Customer Owes *****");
		System.out.println("*************************");
	}

	private void printDetails(double outstanding) {
		System.out.println("name: " + this.name);
		System.out.println("amount: " + outstanding);
	}

	@Test
	public void test1() {
		printOwingImprovement(1.0);
	}

}
