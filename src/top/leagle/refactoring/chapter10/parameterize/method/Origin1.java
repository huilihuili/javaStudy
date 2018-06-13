package top.leagle.refactoring.chapter10.parameterize.method;

public class Origin1 {
	public double tenPercentRaise() {
		return salary * 1.1;
	}

	public double fivePercentRaise() {
		return salary * 1.05;
	}

	private double salary = 100;

	public static void main(String[] args) {
		System.out.println(new Origin1().tenPercentRaise());
		System.out.println(new Origin1().fivePercentRaise());
	}
}
