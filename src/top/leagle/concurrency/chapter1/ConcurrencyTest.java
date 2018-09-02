package top.leagle.concurrency.chapter1;

public class ConcurrencyTest {
	private static final long COUNT = 100000;

	public static void main(String[] args) throws InterruptedException {
		concurrency();
		serial();
	}

	private static void concurrency() throws InterruptedException {
		long start = System.currentTimeMillis();

		Thread thread = new Thread(new Runnable() {
			@Override
			public void run() {
				int a = 0;
				for (long i = 0; i < COUNT; i++) {
					a += 5;
				}
				System.out.println("a = " + a);
			}
		});
		thread.start();

		int b = 0;
		for (long i = 0; i < COUNT; i++) {
			b--;
		}
		thread.join();
		long time = System.currentTimeMillis() - start;
		System.out.println("concurrency : " + time + "ms, b = " + b);
	}

	private static void serial() {
		long start = System.currentTimeMillis();
		int a = 0;
		for (long i = 0; i < COUNT; i++) {
			a += 5;
		}
		System.out.println("a = " + a);

		int b = 0;
		for (long i = 0; i < COUNT; i++) {
			b--;
		}
		long time = System.currentTimeMillis() - start;
		System.out.println("serial : " + time + "ms, b = " + b);
	}
}
