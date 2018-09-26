package top.leagle.interview;

import java.util.Arrays;

public class InversePairs {
	public static void main(String[] args) {
		InversePairs inversePairs = new InversePairs();
		int[] array = { 7, 5, 6, 4, 9 };
		System.out.println(inversePairs.inversePairs(array));
	}

	public int inversePairs(int[] array) {
		int[] copy = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			copy[i] = array[i];
		}
		int count = inversePairsCore(array, copy, 0, array.length - 1) % 1000000007;
		System.out.println(Arrays.toString(copy));
		System.out.println(Arrays.toString(array));
		return count;
	}

	public int inversePairsCore(int[] array, int[] copy, int start, int end) {
		if (start == end) {
			return 0;
		}

		int length = (end - start) / 2;

		int left = inversePairsCore(copy, array, start, start + length);
		int right = inversePairsCore(copy, array, start + length + 1, end);

		int i = start + length;
		int j = end;
		int indexCopy = end;
		int count = 0;

		while (i >= start && j >= start + length + 1) {
			if (array[i] > array[j]) {
				copy[indexCopy--] = array[i--];
				count += j - start - length;
				count = count % 1000000007;
			} else {
				copy[indexCopy--] = array[j--];
			}
		}

		for (; i >= start; i--) {
			copy[indexCopy--] = array[i];
		}

		for (; j >= start + length + 1; j--) {
			copy[indexCopy--] = array[j];
		}
		System.out.println("end array ---> " + Arrays.toString(array) + " copy ---> " + Arrays.toString(copy));
		return (left + right + count) % 1000000007;
	}

	public int inversePairsCoreOther(int[] array, int[] copy, int start, int end) {
		if (start == end) {
			return 0;
		}

		int length = (end - start) / 2;

		int left = inversePairsCore(array, copy, start, start + length);
		int right = inversePairsCore(array, copy, start + length + 1, end);

		int i = start + length;
		int j = end;
		int indexCopy = end;
		int count = 0;

		while (i >= start && j >= start + length + 1) {
			if (array[i] > array[j]) {
				copy[indexCopy--] = array[i--];
				count += j - start - length;
				count = count % 1000000007;
			} else {
				copy[indexCopy--] = array[j--];
			}
		}

		for (; i >= start; i--) {
			copy[indexCopy--] = array[i];
		}

		for (; j >= start + length + 1; j--) {
			copy[indexCopy--] = array[j];
		}
		for (int s = start; s <= end; s++) {
			array[s] = copy[s];
		}
		return (left + right + count) % 1000000007;
	}
}
