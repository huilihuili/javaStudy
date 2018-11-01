package top.leagle.interview;

public class MaxDiff {
	public static void main(String[] args) {
		MaxDiff maxDiff = new MaxDiff();
		int[] numbers = { 9, 11, 8, 5, 7, 12, 16, 14 };
		System.out.println(maxDiff.maxDiff(numbers));
	}

	int maxDiff(int[] numbers) {
		if (numbers == null || numbers.length < 2) {
			return 0;
		}

		int min = numbers[0];
		int maxDiff = numbers[1] - numbers[0];
		for (int i = 2; i < numbers.length; i++) {
			min = Math.min(min, numbers[i - 1]);
			maxDiff = Math.max(maxDiff, numbers[i] - min);
		}
		return maxDiff;
	}
}
