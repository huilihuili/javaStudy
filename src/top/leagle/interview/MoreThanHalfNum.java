package top.leagle.interview;

import java.util.HashMap;
import java.util.Map;

public class MoreThanHalfNum {
	public static void main(String[] args) {
		MoreThanHalfNum moreThanHalfNum = new MoreThanHalfNum();
		int[] array = { 1, 1, 1, 1, 1, 3, 3, 5 };
		System.out.println(moreThanHalfNum.moreThanHalfNum(array));
		System.out.println(moreThanHalfNum.moreThanHalfNumOther(array));
	}

	public int moreThanHalfNum(int[] array) {
		int temp = array[0];
		int times = 1;
		for (int i = 1; i < array.length; i++) {
			if (temp == array[i]) {
				times++;
			} else {
				times--;
				if (times == 0) {
					temp = array[i];
					times = 1;
				}
			}
		}

		if (checkMoreThanHalf(array, temp)) {
			return temp;
		}
		return 0;
	}

	public int moreThanHalfNumOther(int[] array) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < array.length; i++) {
			int key = array[i];
			if (map.containsKey(array[i])) {
				int value = map.get(key);
				map.put(key, ++value);
			} else {
				map.put(key, 1);
			}
		}

		for (Integer key : map.keySet()) {
			if (map.get(key) * 2 > array.length) {
				return key;
			}
		}
		return 0;
	}

	private boolean checkMoreThanHalf(int[] array, int number) {
		int length = array.length;
		int times = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == number) {
				times++;
			}
		}

		if (times * 2 <= length) {
			return false;
		} else {
			return true;
		}
	}
}
