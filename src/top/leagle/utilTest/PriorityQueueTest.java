package top.leagle.utilTest;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueTest {
	public static void main(String[] args) {
		PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
		priorityQueue.offer(6);
		priorityQueue.offer(7);
		priorityQueue.offer(8);
		priorityQueue.offer(9);
		priorityQueue.offer(10);

		Iterator<Integer> iterator = priorityQueue.iterator();
		System.out.println(iterator.next());
		System.out.println(iterator.next());
		iterator.remove();
		System.out.println(iterator.next());
	}

}
