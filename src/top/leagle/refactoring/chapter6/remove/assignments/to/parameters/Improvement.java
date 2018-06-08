package top.leagle.refactoring.chapter6.remove.assignments.to.parameters;

public class Improvement {
	static int discount(int inputVal, int quantity, int yearToDate) {
		int result = inputVal;
		if (inputVal > 50) {
			result -= 2;
		}
		if (quantity > 100) {
			result -= 1;
		}
		if (yearToDate > 10000) {
			result -= 4;
		}
		return result;
	}

	public static void main(String[] args) {
		System.out.println(discount(123, 222, 333));
	}
}
