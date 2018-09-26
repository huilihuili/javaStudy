package top.leagle.interview;

import java.util.ArrayList;
import java.util.List;

public class GetUglyNumber {
	public static void main(String[] args) {
		GetUglyNumber getUglyNumber = new GetUglyNumber();
		System.out.println(getUglyNumber.getUglyNumber(1500));
	}

	public int getUglyNumber(int index) {
		if (index <= 0) {
			return 0;
		}

		int[] uglyNumbers = new int[index];
		uglyNumbers[0] = 1;

		int i2 = 0, i3 = 0, i5 = 0;

		for (int i = 1; i < index; i++) {
			int m2 = uglyNumbers[i2] * 2;
			int m3 = uglyNumbers[i3] * 3;
			int m5 = uglyNumbers[i5] * 5;

			int min = Math.min(m2, Math.min(m3, m5));
			uglyNumbers[i] = min;

			if (m2 == min) {
				i2++;
			}
			if (m3 == min) {
				i3++;
			}
			if (m5 == min) {
				i5++;
			}
		}
		return uglyNumbers[index - 1];
	}

	public int getUglyNumberOther(int index) {
		if (index <= 0)
			return 0;
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		int i2 = 0, i3 = 0, i5 = 0;
		while (list.size() < index) {
			int m2 = list.get(i2) * 2;
			int m3 = list.get(i3) * 3;
			int m5 = list.get(i5) * 5;
			int min = Math.min(m2, Math.min(m3, m5));
			list.add(min);
			if (min == m2)
				i2++;
			if (min == m3)
				i3++;
			if (min == m5)
				i5++;
		}
		return list.get(list.size() - 1);
	}
}
