package top.leagle.refactoring.chapter6.introduce.explaining.variable;

import org.junit.Test;

public class Improvment11 {
	private int quantity = 2;
	private int itemPrice = 5;

	public double getPrice() {
		final double basePrice = quantity * itemPrice;
		final double quantityDiscount = Math.max(0, quantity - 500) * itemPrice * 0.05;
		final double shipping = Math.min(basePrice * 0.1, 100.0);
		return basePrice - quantityDiscount + shipping;
	}

	@Test
	public void test1() {
		System.out.println(getPrice());
	}
}
