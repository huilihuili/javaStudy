package top.leagle.interview;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LastRemaining {
	public static void main(String[] args) {
		LastRemaining lastRemaining = new LastRemaining();
		System.out.println(lastRemaining.lastRemaining(5, 3));
		System.out.println(lastRemaining.lastRemainingOther(5, 3));
	}

	public int lastRemaining(int n, int m) {
		if (n < 1 || m < 1) {
			return -1;
		}

		List<Integer> numbers = new LinkedList<>();
		for (int i = 0; i < n; i++) {
			numbers.add(i);
		}

		Iterator<Integer> current = numbers.iterator();
		while (numbers.size() > 1) {
			for (int i = 0; i < m; i++) {
				if (current.hasNext()) {
					current.next();
				} else {
					current = numbers.iterator();
					current.next();
				}
			}
			current.remove();
		}
		return numbers.get(0);
	}

	public int lastRemainingOther(int n, int m) {
		if (n < 1 || m < 1) {
			return -1;
		}

		List<Integer> numbers = new LinkedList<>();
		for (int i = 0; i < n; i++) {
			numbers.add(i);
		}

		int last = 0;
		while (numbers.size() > 1) {
			last = (last + m - 1) % numbers.size();
			numbers.remove(last);
		}
		return numbers.get(0);
	}

}
