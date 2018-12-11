package top.leagle.artofconcurrency.chapter10;

import java.util.concurrent.TimeUnit;

public class FutureTaskExample1 {

	public static void main(String[] args) {
		Thread thread = new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					TimeUnit.SECONDS.sleep(2);
					System.out.println("thread end");
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		thread.start();
		System.out.println("main end");
	}
}
