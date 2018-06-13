package top.leagle.refactoring.chapter10.parameterize.method;

public class Improvement1 {
	public double raise(double factor) {
		return salary * (1 + factor);
	}

	private double salary = 100;

	public static void main(String[] args) {
		System.out.println(new Improvement1().raise(0.1));
		System.out.println(new Improvement1().raise(0.05));
	}
}
