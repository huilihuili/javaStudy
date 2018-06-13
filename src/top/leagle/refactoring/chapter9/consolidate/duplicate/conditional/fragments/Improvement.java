package top.leagle.refactoring.chapter9.consolidate.duplicate.conditional.fragments;

public class Improvement {
	static double getPrice(boolean isDiscount, double price) {
		double total;
		if (isDiscount) {
			total = price * 0.95;
		} else {
			total = price * 0.98;
		}
		total += 1;
		return total;
	}

	public static void main(String[] args) {
		System.out.println(Improvement.getPrice(true, 6.0));
	}
}
