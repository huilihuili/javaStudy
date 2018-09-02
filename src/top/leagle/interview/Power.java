package top.leagle.interview;

public class Power {
	public static void main(String[] args) {
		System.out.println(new Power().power(2, -2));
	}

	public double power(double base, int exponent) {
		if (exponent < 0) {
			return 1 / powerScore(base, -exponent);
		}
		return powerScore(base, exponent);
	}

	public double powerScore(double base, int exponent) {
		if (exponent == 0) {
			return 1;
		}

		if (exponent == 1) {
			return base;
		}

		double result = powerScore(base, exponent >> 1);
		result = result * result;
		if ((exponent & 1) != 0) {
			result = result * base;
		}
		return result;
	}
}
