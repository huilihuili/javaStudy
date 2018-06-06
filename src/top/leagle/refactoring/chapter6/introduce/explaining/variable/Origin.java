package top.leagle.refactoring.chapter6.introduce.explaining.variable;

import org.junit.Test;

public class Origin {
	private int quantity = 2;
	private int itemPrice = 5;

	public double getPrice() {
		return this.quantity * this.itemPrice - Math.max(0, quantity - 500) * itemPrice * 0.05
				+ Math.min(quantity * itemPrice * 0.1, 100.0);
	}

	@Test
	public void test1() {
		System.out.println(getPrice());
	}
}
