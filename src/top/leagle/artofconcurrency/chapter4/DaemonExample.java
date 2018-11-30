package top.leagle.artofconcurrency.chapter4;

import java.util.concurrent.TimeUnit;

public class DaemonExample {
	public static void main(String[] args) {
		Thread thread = new Thread(new DaemonRunner(), "DaemonRunner");
		thread.setDaemon(true);
		thread.start();
	}

	static class DaemonRunner implements Runnable {
		@Override
		public void run() {
			try {
				TimeUnit.SECONDS.sleep(10);
			} catch (Exception e) {

			} finally {
				System.out.println("DaemonThread finally run.");
			}
		}
	}
}
