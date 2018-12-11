package top.leagle.artofconcurrency.chapter8;

import java.util.concurrent.Exchanger;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExchangerExample {
	
	private static Exchanger<String> exchanger = new Exchanger<>();
	private static ExecutorService threadPool = Executors.newFixedThreadPool(2);

	public static void main(String[] args) {
		threadPool.execute(new Runnable() {
			@Override
			public void run() {
				String A = "银行流水A";
				try {
					System.out.println(Thread.currentThread().getName() + " ---> A = " + A);
					String B = exchanger.exchange(A);
					System.out.println(Thread.currentThread().getName() + " ---> B = " + B);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});

		threadPool.execute(new Runnable() {
			@Override
			public void run() {
				String B = "银行流水B";
				try {
					System.out.println(Thread.currentThread().getName() + " ---> B = " + B);
					String A = exchanger.exchange(B);
					System.out.println(Thread.currentThread().getName() + " ---> A = " + A);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});

		threadPool.shutdown();
	}
}
