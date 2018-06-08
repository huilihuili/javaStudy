package top.leagle.refactoring.chapter6.replace.method.with.method.object.improvement2;

public class Origin {
	public int delta() {
		return 5;
	}

	public int gamma(int inputVal, int quantity, int yearToDate) {
		return new Improvement2(this, inputVal, quantity, yearToDate).compute();
	}

	public static void main(String[] args) {
		System.out.println(new Origin().gamma(100, 100, 100));
	}
}
