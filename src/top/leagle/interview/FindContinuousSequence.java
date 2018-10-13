package top.leagle.interview;

import java.util.ArrayList;

public class FindContinuousSequence {
	public static void main(String[] args) {
		FindContinuousSequence findContinuousSequence = new FindContinuousSequence();
		System.out.println(findContinuousSequence.findContinuousSequence(15));
		System.out.println(findContinuousSequence.findContinuousSequenceOther(15));
	}

	public ArrayList<ArrayList<Integer>> findContinuousSequence(int sum) {
		ArrayList<ArrayList<Integer>> result = new ArrayList<>();
		int small = 1;
		int big = 2;
		int middle = (1 + sum) / 2;
		int currentSum = small + big;
		while (small < middle) {
			while (currentSum < sum) {
				big++;
				currentSum += big;
			}
			if (currentSum == sum) {
				ArrayList<Integer> temp = new ArrayList<>();
				for (int i = small; i <= big; i++) {
					temp.add(i);
				}
				result.add(temp);
			}
			currentSum -= small;
			small++;
		}
		return result;
	}

	public ArrayList<ArrayList<Integer>> findContinuousSequenceOther(int sum) {
		ArrayList<ArrayList<Integer>> result = new ArrayList<>();
		int small = 1;
		int big = 2;

		while (small < big) {
			int currentSum = (small + big) * (big - small + 1) / 2;
			if (currentSum == sum) {
				ArrayList<Integer> temp = new ArrayList<>();
				for (int i = small; i <= big; i++) {
					temp.add(i);
				}
				result.add(temp);
				small++;
			} else if (currentSum < sum) {
				big++;
			} else {
				small++;
			}
		}
		return result;
	}
}
