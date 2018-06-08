package top.leagle.refactoring.chapter6.remove.assignments.to.parameters;

public class Origin {
	static int discount(int inputVal, int quantity, int yearToDate) {
		if (inputVal > 50) {
			inputVal -= 2;
		}
		if (quantity > 100) {
			inputVal -= 1;
		}
		if (yearToDate > 10000) {
			inputVal -= 4;
		}
		return inputVal;
	}

	public static void main(String[] args) {
		System.out.println(discount(123, 222, 333));
	}
}
