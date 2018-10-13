package top.leagle.interview;

import java.util.ArrayDeque;
import java.util.ArrayList;

public class MaxInWindows {
	public static void main(String[] args) {
		MaxInWindows maxInWindows = new MaxInWindows();
		int[] num = { 2, 3, 4, 2, 6, 2, 5, 1 };
		int size = 3;
		System.out.println(maxInWindows.maxInWindows(num, size));
	}

	public ArrayList<Integer> maxInWindows(int[] num, int size) {
		ArrayList<Integer> result = new ArrayList<>();
		if (size == 0 || num.length < size) {
			return result;
		}

		ArrayDeque<Integer> index = new ArrayDeque<>();
		for (int i = 0; i < size; i++) {
			while (!index.isEmpty() && num[i] >= num[index.peekLast()]) {
				index.pollLast();
			}
			index.addLast(i);
		}
		result.add(num[index.peekFirst()]);
		for (int i = size; i < num.length; i++) {
			while (!index.isEmpty() && num[i] >= num[index.peekLast()]) {
				index.pollLast();
			}
			if (!index.isEmpty() && index.peekFirst() <= i - size) {
				index.pollFirst();
			}
			index.addLast(i);
			result.add(num[index.peekFirst()]);
		}
		return result;
	}
}
