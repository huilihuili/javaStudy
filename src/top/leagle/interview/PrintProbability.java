package top.leagle.interview;

public class PrintProbability {
	// 骰子的最大数
	public static final int MAX_VALUE = 6;

	public static void main(String[] args) {
		PrintProbability printProbability = new PrintProbability();
		printProbability.printProbability(2);

		System.out.println("\n----\n");

		printProbability.printProbabilityOther(2);
	}

	public void printProbabilityOther(int number) {
		if (number < 1) {
			return;
		}

		int[][] probabilities = new int[2][number * MAX_VALUE + 1];
		int flag = 0;
		for (int i = 1; i <= MAX_VALUE; i++) {
			probabilities[flag][i] = 1;
		}

		for (int k = 2; k <= number; k++) {
			for (int i = k; i <= MAX_VALUE * k; i++) {
				probabilities[1 - flag][i] = 0;
				for (int j = 1; j <= i && j <= MAX_VALUE; j++) {
					probabilities[1 - flag][i] += probabilities[flag][i - j];
				}
			}
			flag = 1 - flag;
		}

		int total = (int) Math.pow(MAX_VALUE, number);
		for (int i = number; i <= MAX_VALUE * number; i++) {
			double ratio = (double) probabilities[flag][i] / total;
			System.out.println(i + " : " + ratio);
		}

	}

	public void printProbability(int number) {
		if (number < 1) {
			return;
		}

		int maxSum = number * MAX_VALUE;
		int[] probabilities = new int[maxSum - number + 1];
		probability(number, probabilities);
		int total = (int) Math.pow(MAX_VALUE, number);
		for (int i = number; i <= maxSum; i++) {
			double ratio = (double) probabilities[i - number] / total;
			System.out.println(i + " : " + ratio);
		}
	}

	private void probability(int number, int[] probabilities) {
		for (int i = 1; i <= MAX_VALUE; i++) {
			probability(number, number, i, probabilities);
		}
	}

	private void probability(int original, int current, int sum, int[] probabilities) {
		if (current == 1) {
			probabilities[sum - original]++;
		} else {
			for (int i = 1; i <= MAX_VALUE; i++) {
				probability(original, current - 1, sum + i, probabilities);
			}
		}
	}

}
