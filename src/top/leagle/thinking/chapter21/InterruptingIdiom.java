package top.leagle.thinking.chapter21;

import java.util.concurrent.TimeUnit;

public class InterruptingIdiom {
	public static void main(String[] args) throws InterruptedException {
		Thread thread = new Thread(new Blocked());
		thread.start();
		TimeUnit.SECONDS.sleep(2);
		thread.interrupt();
	}
}

class Blocked implements Runnable {
	private volatile double d = 0.0;

	@Override
	public void run() {
		try {
			while (!Thread.interrupted()) {
				NeedsCleanup needsCleanup1 = new NeedsCleanup(1);
				try {
					System.out.println("Sleeping");
					TimeUnit.SECONDS.sleep(1);

					NeedsCleanup needsCleanup2 = new NeedsCleanup(2);
					try {
						System.out.println("Calculatin");
						for (int i = 0; i < 250000; i++) {
							d = d + (Math.PI + Math.E) / d;
						}
						System.out.println("Finished time-consuming operation");
					} finally {
						needsCleanup2.cleanup();
					}
				} finally {
					needsCleanup1.cleanup();
				}
			}
		} catch (InterruptedException e) {
			System.out.println("Exiting via InterruptedException");
		}
	}

}

class NeedsCleanup {
	private final int id;

	public NeedsCleanup(int id) {
		this.id = id;
		System.out.println("NeedsCleanup " + id);
	}

	public void cleanup() {
		System.out.println("Clean up " + id);
	}

}
