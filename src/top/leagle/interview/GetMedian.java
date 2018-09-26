package top.leagle.interview;

import java.util.Comparator;
import java.util.PriorityQueue;

public class GetMedian {
	public static void main(String[] args) {
		GetMedian getMedian = new GetMedian();
		getMedian.insert(5);
		System.out.println(getMedian.getMedian());
		getMedian.insert(2);
		System.out.println(getMedian.getMedian());
	}

	private PriorityQueue<Integer> max = new PriorityQueue<>();
	private PriorityQueue<Integer> min = new PriorityQueue<>(1, new Comparator<Integer>() {
		@Override
		public int compare(Integer o1, Integer o2) {
			return o2.compareTo(o1);
		}
	});

	public void insert(Integer num) {
		if (max.size() == min.size()) {
			max.offer(num);
			min.offer(max.poll());
		} else {
			min.offer(num);
			max.offer(min.poll());
		}
	}

	public Double getMedian() {
		if (max.size() == min.size()) {
			return (max.peek() + min.peek()) / 2.0;
		} else {
			return (double) min.peek();
		}

	}
}
