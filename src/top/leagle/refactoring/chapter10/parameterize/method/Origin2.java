package top.leagle.refactoring.chapter10.parameterize.method;

public class Origin2 {

	public double baseCharge() {
		double result = Math.min(lastUsage(), 100) * 0.03;
		if (lastUsage() > 100) {
			result += (Math.min(lastUsage(), 200) - 100) * 0.05;
		}

		if (lastUsage() > 200) {
			result += (lastUsage() - 200) * 0.07;
		}

		return result;
	}

	private int lastUsage() {
		return 100;
	}

	public static void main(String[] args) {
		System.out.println(new Origin2().baseCharge());
	}
}
