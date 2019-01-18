package top.leagle.utilTest;

import java.util.ArrayDeque;

import org.junit.Test;

public class ArrayDequeTest {
	public static void main(String[] args) {
		ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
		arrayDeque.addFirst(1);
		arrayDeque.addFirst(2);

		arrayDeque.addLast(10);
		arrayDeque.addLast(9);

		System.out.println(arrayDeque.pollFirst());
		System.out.println(arrayDeque.pollLast());
	}

	@Test
	public void binaryTest() {
		System.out.println(Integer.toBinaryString(-14));
	}
	
	@Test
	public void queueTest() {
		ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
		arrayDeque.offer(1);
		arrayDeque.offer(2);
		arrayDeque.offer(3);
		System.out.println(arrayDeque.poll());
		System.out.println(arrayDeque.poll());
	}
}
