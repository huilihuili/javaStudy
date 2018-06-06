package top.leagle.refactoring.chapter6.replace.temp.with.query;

import org.junit.Test;

public class Improvement13 {
	private int quantity = 2;
	private int itemPrice = 5;

	public double getPrice() {
		return basePrice() * discountFactor();
	}

	private int basePrice() {
		return this.quantity * this.itemPrice;
	}

	private double discountFactor() {
		if (basePrice() > 1000) {
			return 0.95;
		} else {
			return 0.98;
		}
	}

	@Test
	public void test() {
		System.out.println(getPrice());
	}
}
