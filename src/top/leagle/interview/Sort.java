package top.leagle.interview;

import org.junit.Test;

public class Sort {

	public static int partition(int data[], int start, int end) {
		if (start > end) {
			return -1;
		}

		int i = start, j = end, temp = data[start];
		while (i != j) {
			while (i < j && data[j] >= temp) {
				j--;
			}

			while (i < j && data[i] <= temp) {
				i++;
			}

			if (i < j) {
				int t = data[i];
				data[i] = data[j];
				data[j] = t;
			}
		}
		data[start] = data[i];
		data[i] = temp;
		return i;
	}

	public void quickSort(int data[], int start, int end) {
		if (start == end) {
			return;
		}

		int index = partition(data, start, end);
		if (index > start) {
			quickSort(data, start, index - 1);
		}

		if (index < end) {
			quickSort(data, index + 1, end);
		}
	}

	public static void pringArray(int[] data) {
		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i] + " ");
		}
		System.out.println();
	}

	@Test
	public void quickSortTest() {
		int[] data = { 1, 5, 3, 4, 5, 2, 3, 9, 10, 5, 7 };
		quickSort(data, 0, data.length - 1);
		pringArray(data);
	}

}
