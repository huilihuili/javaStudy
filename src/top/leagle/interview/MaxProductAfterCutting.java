package top.leagle.interview;

public class MaxProductAfterCutting {
	public static void main(String[] args) {
		MaxProductAfterCutting maxProductAfterCutting = new MaxProductAfterCutting();
		for (int i = 3; i <= 20; i++) {
			System.out.println(i + " " + maxProductAfterCutting.maxProductAfterCutting(i) + " "
					+ maxProductAfterCutting.maxProductAfterCutting2(i));
		}
	}

	public int maxProductAfterCutting(int length) {
		if (length < 2) {
			return 0;
		}

		if (length == 2) {
			return 1;
		}

		if (length == 3) {
			return 2;
		}

		int[] products = new int[length + 1];
		products[1] = 1;
		products[2] = 2;
		products[3] = 3;

		for (int i = 4; i <= length; i++) {
			int max = 0;
			for (int j = 1; j <= i / 2; j++) {
				int product = products[j] * products[i - j];
				if (max < product) {
					max = product;
				}
			}
			products[i] = max;
		}
		return products[length];
	}

	public int maxProductAfterCutting2(int length) {
		if (length < 2) {
			return 0;
		}

		if (length == 2) {
			return 1;
		}

		if (length == 3) {
			return 2;
		}

		int timesOf3 = length / 3;
		if ((length - timesOf3 * 3) == 1) {
			timesOf3--;
		}

		int timesOf2 = (length - timesOf3 * 3) / 2;
		return (int) (Math.pow(3, timesOf3) * Math.pow(2, timesOf2));
	}
}
