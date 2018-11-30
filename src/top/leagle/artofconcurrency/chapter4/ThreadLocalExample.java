package top.leagle.artofconcurrency.chapter4;

public class ThreadLocalExample {
	public static final ThreadLocal<Integer> X_THREADLOCAL = new ThreadLocal<>();

	public static void increment() {
		X_THREADLOCAL.set(0);
		for (int i = 0; i < 5; i++) {
			int value = X_THREADLOCAL.get();
			System.out.println(Thread.currentThread().getName() + " : " + value);
			X_THREADLOCAL.set(value + 1);
		}
	}

	public static void main(String[] args) throws InterruptedException {
		ThreadLocalExample.increment();
		new Thread(new StaticThreadLocal(), "staticThreadLocal-1").start();
		new Thread(new StaticThreadLocal(), "StaticThreadLocal-2").start();
	}

	static class StaticThreadLocal implements Runnable {
		@Override
		public void run() {
			ThreadLocalExample.increment();
		}
	}
}
