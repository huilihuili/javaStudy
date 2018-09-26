package top.leagle.interview;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

public class GetLeastNumbers {
	public static void main(String[] args) {
		GetLeastNumbers getLeastNumbers = new GetLeastNumbers();

		int[] input = { 4, 5, 1, 6, 2, 7, 3, 8 };
		System.out.println(getLeastNumbers.getLeastNumbers(input, 10));
	}

	public ArrayList<Integer> getLeastNumbers(int[] input, int k) {
		ArrayList<Integer> result = new ArrayList<>();
		if (k > input.length || k == 0) {
			return result;
		}

		PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(k, new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o2.compareTo(o1);
			}

		});

		for (int i = 0; i < input.length; i++) {
			if (priorityQueue.size() < k) {
				priorityQueue.offer(input[i]);
			} else {
				if (input[i] < priorityQueue.peek()) {
					priorityQueue.poll();
					priorityQueue.offer(input[i]);
				}
			}
		}

		result.addAll(priorityQueue);
		return result;
	}
}
