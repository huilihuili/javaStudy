package top.leagle.refactoring.chapter6.extract.method;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.junit.Test;

public class Improvment21 {
	private List<Double> orders = Arrays.asList(1.2, 1.3, 1.4);
	private String name = "Leagle";

	public void printOwingImprovement(double previousAmount) {
		double outstanding = previousAmount * 1.2;
		
		printBanner();
		outstanding = getOutstanding(outstanding);
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

	private double getOutstanding(double initialValue) {
		Iterator<Double> iterator = orders.iterator();
		double result = initialValue;
		while (iterator.hasNext()) {
			Double each = (Double) iterator.next();
			result += each;
		}
		return result;
	}

	@Test
	public void test1() {
		printOwingImprovement(1.0);
	}
}
