package top.leagle.refactoring.chapter9.consolidate.duplicate.conditional.fragments;

public class Origin {
	static double getPrice(boolean isDiscount, double price) {
		double total;
		if (isDiscount) {
			total = price * 0.95;
			total += 1;
		} else {
			total = price * 0.98;
			total += 1;
		}
		return total;
	}

	public static void main(String[] args) {
		System.out.println(Origin.getPrice(true, 6.0));
	}
}
