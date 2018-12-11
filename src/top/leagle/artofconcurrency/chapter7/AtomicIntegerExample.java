package top.leagle.artofconcurrency.chapter7;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicIntegerExample {

	private static AtomicInteger atomicInteger = new AtomicInteger(1);

	public static void main(String[] args) {
		System.out.println(atomicInteger.getAndIncrement());
		System.out.println(atomicInteger.get());
	}
}
