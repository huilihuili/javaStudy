package top.leagle.interview;

import java.util.ArrayList;

public class FindNumbersWithSum {
	public ArrayList<Integer> findNumbersWithSum(int[] array, int sum) {
		int left = 0;
		int right = array.length - 1;
		ArrayList<Integer> result = new ArrayList<>();

		while (left < right) {
			int temp = array[left] + array[right];
			if (temp == sum) {
				result.add(array[left]);
				result.add(array[right]);
				break;
			} else if (temp > sum) {
				right--;
			} else {
				left++;
			}
		}
		return result;
	}
}
