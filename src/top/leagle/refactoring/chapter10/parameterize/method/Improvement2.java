package top.leagle.refactoring.chapter10.parameterize.method;

public class Improvement2 {

	public double baseCharge() {
		double result = usageInRange(0, 100) * 0.03;
		result += usageInRange(100, 200) * 0.05;
		result += usageInRange(200, Integer.MAX_VALUE) * 0.07;
		return result;
	}

	private int usageInRange(int start, int end) {
		if (lastUsage() > start) {
			return Math.min(lastUsage(), end) - start;
		} else {
			return 0;
		}
	}

	private int lastUsage() {
		return 100;
	}

	public static void main(String[] args) {
		System.out.println(new Improvement2().baseCharge());
	}
}
