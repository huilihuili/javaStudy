package top.leagle.interview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PrintMinNumber {
	public static void main(String[] args) {
		int[] numbers = { 3, 32, 321 };
		PrintMinNumber printMinNumber = new PrintMinNumber();
		System.out.println(printMinNumber.printMinNumber(numbers));
	}

	public String printMinNumber(int[] numbers) {
		StringBuilder result = new StringBuilder();

		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < numbers.length; i++) {
			list.add(numbers[i]);
		}
		Collections.sort(list, new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				String s1 = String.valueOf(o1) + o2;
				String s2 = String.valueOf(o2) + o1;
				return s1.compareTo(s2);
			}
		});
		for (Integer integer : list) {
			result.append(integer);
		}
		return result.toString();
	}
}
