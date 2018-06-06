package top.leagle.refactoring.chapter6.introduce.explaining.variable;

import org.junit.Test;

public class Improvment21 {
	private int quantity = 2;
	private int itemPrice = 5;

	public double getPrice() {
		return basePrice() - quantityDiscount() + shipping();
	}

	private double basePrice() {
		return quantity * itemPrice;
	}

	private double quantityDiscount() {
		return Math.max(0, quantity - 500) * itemPrice * 0.05;
	}

	private double shipping() {
		return Math.min(basePrice() * 0.1, 100.0);
	}

	@Test
	public void test1() {
		System.out.println(getPrice());
	}
}
