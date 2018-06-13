package top.leagle.refactoring.chapter10.replace.parameter.with.methods;

public class Origin {
	public double getPrice() {
		double basePrice = quantity * itemPrice;
		int discountLevel;
		if (quantity > 100) {
			discountLevel = 2;
		} else {
			discountLevel = 1;
		}
		double finalPrice = discountedPrice(basePrice, discountLevel);
		return finalPrice;
	}

	private double discountedPrice(double basePrice, int discountLevel) {
		if (discountLevel == 2) {
			return basePrice * 0.1;
		} else {
			return basePrice * 0.05;
		}
	}

	private int quantity = 100;
	private double itemPrice = 20.3;

	public static void main(String[] args) {
		System.out.println(new Origin().getPrice());
	}
}
