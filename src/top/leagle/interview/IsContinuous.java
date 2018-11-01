package top.leagle.interview;

import java.util.Arrays;

public class IsContinuous {
	public static void main(String[] args) {
		IsContinuous isContinuous = new IsContinuous();
		int[] numbers = { 10, 11, 12, 13, 1 };
		System.out.println(isContinuous.isContinuous(numbers));
	}

	public boolean isContinuous(int[] numbers) {
		if (numbers == null || numbers.length == 0) {
			return false;
		}

		Arrays.sort(numbers);
		int numberOfZero = 0;
		for (int i = 0; numbers[i] == 0 && i < numbers.length; i++) {
			numberOfZero++;
		}
		int numberOfGap = 0;
		for (int i = numberOfZero; i < numbers.length - 1; i++) {
			if (numbers[i] == numbers[i + 1]) {
				return false;
			}
			numberOfGap += (numbers[i + 1] - numbers[i] - 1);
		}
		return numberOfGap > numberOfZero ? false : true;
	}

	public boolean isContinuousOther(int[] numbers) {
		int numOfZero = 0;
		int numOfInterval = 0;
		int length = numbers.length;
		if (length == 0) {
			return false;
		}
		Arrays.sort(numbers);
		for (int i = 0; i < length - 1; i++) {
			if (numbers[i] == 0) {
				numOfZero++;
				continue;
			}
			if (numbers[i] == numbers[i + 1]) {
				return false;
			}
			numOfInterval += numbers[i + 1] - numbers[i] - 1;
		}
		return numOfInterval > numOfZero ? false : true;
	}
}
