package top.leagle.interview;

import java.util.Arrays;

public class Multiply {
	public static void main(String[] args) {
		Multiply multiply = new Multiply();
		int[] A = { 1, 2, 3, 4, 5 };
		System.out.println(Arrays.toString(multiply.multiply(A)));
	}

	public int[] multiply(int[] A) {
		int length = A.length;
		int[] result = new int[length];
		if (length != 0) {
			result[0] = 1;
			for (int i = 1; i < length; i++) {
				result[i] = result[i - 1] * A[i - 1];
			}

			int temp = 1;
			for (int j = length - 2; j >= 0; j--) {
				temp *= A[j + 1];
				result[j] *= temp;
			}
		}
		return result;
	}
}
