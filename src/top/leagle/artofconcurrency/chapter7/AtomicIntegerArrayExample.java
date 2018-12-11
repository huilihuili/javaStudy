package top.leagle.artofconcurrency.chapter7;

import java.util.concurrent.atomic.AtomicIntegerArray;

public class AtomicIntegerArrayExample {
	
	static int[] value = new int[] { 1, 2 };
	static AtomicIntegerArray ai = new AtomicIntegerArray(value);

	public static void main(String[] args) {
		System.out.println(ai.getAndSet(0, 3));
		System.out.println(ai.get(0));
		System.out.println(value[0]);
	}
}
