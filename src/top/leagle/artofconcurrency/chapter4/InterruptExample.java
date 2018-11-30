package top.leagle.artofconcurrency.chapter4;

import java.util.concurrent.TimeUnit;

public class InterruptExample {

	public static void main(String[] args) throws InterruptedException {
		Thread sleepThread = new Thread(new SleepRunner(), "SleepThread");
		sleepThread.setDaemon(true);

		Thread busyThread = new Thread(new BusyRnner(), "BusyThread");
		busyThread.setDaemon(true);

		sleepThread.start();
		busyThread.start();

		TimeUnit.SECONDS.sleep(5);

		sleepThread.interrupt();
		busyThread.interrupt();

		System.out.println("BusyThread interrupted is " + busyThread.isInterrupted());

		SleepUtils.second(30);
	}

	static class SleepRunner implements Runnable {
		@Override
		public void run() {
			while (true) {
				System.out.println(Thread.currentThread() + " sleep...");
				try {
					TimeUnit.SECONDS.sleep(10);
				} catch (InterruptedException e) {
					System.out.println("SleepThread interrupted is " + Thread.currentThread().isInterrupted());
					System.out.println(Thread.currentThread() + " interrupted.");
				}
			}
		}
	}

	static class BusyRnner implements Runnable {
		@Override
		public void run() {
			while (true) {
			}
		}
	}
}
