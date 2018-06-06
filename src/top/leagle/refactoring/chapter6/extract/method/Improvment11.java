package top.leagle.refactoring.chapter6.extract.method;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.junit.Test;

public class Improvment11 {
	private List<Double> orders = Arrays.asList(1.2, 1.3, 1.4);
	private String name = "Leagle";

	public void printOwingImprovement() {
		Iterator<Double> iterator = orders.iterator();
		double outstanding = 0.0;

		printBanner();

		while (iterator.hasNext()) {
			Double each = (Double) iterator.next();
			outstanding += each;
		}

		System.out.println("name: " + this.name);
		System.out.println("amount: " + outstanding);
	}

	private void printBanner() {
		System.out.println("*************************");
		System.out.println("***** Customer Owes *****");
		System.out.println("*************************");
	}

	@Test
	public void test1() {
		printOwingImprovement();
	}

}
