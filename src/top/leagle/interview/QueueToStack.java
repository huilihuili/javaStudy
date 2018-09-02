package top.leagle.interview;

import java.util.LinkedList;
import java.util.Queue;

public class QueueToStack {
	Queue<Integer> queue1 = new LinkedList<>();
	Queue<Integer> queue2 = new LinkedList<>();

	public static void main(String[] args) {
		QueueToStack stackToQueue = new QueueToStack();

		stackToQueue.push(1);
		stackToQueue.push(2);
		System.out.println(stackToQueue.pop());
		stackToQueue.push(3);
		stackToQueue.push(4);
		System.out.println(stackToQueue.pop());
		System.out.println(stackToQueue.pop());
		System.out.println(stackToQueue.pop());
	}

	public void push(int node) {
		if (!queue1.isEmpty()) {
			queue1.offer(node);
		} else {
			queue2.offer(node);
		}
	}

	public int pop() {
		if (!queue1.isEmpty()) {
			while (queue1.size() != 1) {
				queue2.offer(queue1.remove());
			}
			return queue1.remove();
		} else {
			while (queue2.size() != 1) {
				queue1.offer(queue2.remove());
			}
			return queue2.remove();
		}
	}
}
