package top.leagle.artofconcurrency.chapter8;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

public class SemaphoreExample {
	private static final int THREAD_COUNT = 30;
	private static ExecutorService threadPool = Executors.newFixedThreadPool(THREAD_COUNT);
	private static Semaphore semaphore = new Semaphore(10);

	public static void main(String[] args) {
		for (int i = 0; i < THREAD_COUNT; i++) {
			threadPool.execute(new Runnable() {
				@Override
				public void run() {
					try {
						semaphore.acquire();
						System.out.println(Thread.currentThread().getName() + " : save data");
					} catch (InterruptedException e) {
						e.printStackTrace();
					} finally {
						semaphore.release();
					}
				}
			});
		}
		threadPool.shutdown();
	}
}
