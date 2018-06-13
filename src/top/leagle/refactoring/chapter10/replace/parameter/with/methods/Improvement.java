package top.leagle.refactoring.chapter10.replace.parameter.with.methods;

public class Improvement {
	public double getPrice() {
		return (getDiscountLevel() == 2) ? getBasePrice() * 0.1 : getBasePrice() * 0.05;
	}

	private double getBasePrice() {
		return quantity * itemPrice;
	}

	private int getDiscountLevel() {
		return quantity > 100 ? 2 : 1;
	}

	private int quantity = 100;
	private double itemPrice = 20.3;

	public static void main(String[] args) {
		System.out.println(new Improvement().getPrice());
	}
}
