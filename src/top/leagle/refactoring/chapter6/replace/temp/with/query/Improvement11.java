package top.leagle.refactoring.chapter6.replace.temp.with.query;

import org.junit.Test;

public class Improvement11 {
	private int quantity = 2;
	private int itemPrice = 5;

	public double getPrice() {
		final int basePrice = this.quantity * this.itemPrice;
		final double discountFactor;
		if (basePrice > 1000) {
			discountFactor = 0.95;
		} else {
			discountFactor = 0.98;
		}
		return basePrice * discountFactor;
	}

	@Test
	public void test() {
		System.out.println(getPrice());
	}
}
