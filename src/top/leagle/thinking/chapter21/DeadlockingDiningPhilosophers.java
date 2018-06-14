package top.leagle.thinking.chapter21;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class DeadlockingDiningPhilosophers {

	public static void main(String[] args) throws InterruptedException {
		int ponder = 0;
		int size = 5;
		ExecutorService executorService = Executors.newCachedThreadPool();
		Chopstick[] sticks = new Chopstick[size];
		for (int i = 0; i < size; i++) {
			sticks[i] = new Chopstick();
		}

		for (int i = 0; i < size; i++) {
			executorService.execute(new Philosopher(sticks[i], sticks[(i + 1) % size], i, ponder));
		}

		// TimeUnit.SECONDS.sleep(2);
		// executorService.shutdownNow();
	}
}

class Philosopher implements Runnable {

	public Philosopher(Chopstick left, Chopstick right, int id, int ponderFactor) {
		this.left = left;
		this.right = right;
		this.id = id;
		this.ponderFactor = ponderFactor;
	}

	@Override
	public void run() {
		try {
			while (!Thread.interrupted()) {
				System.out.println(this + " " + "thinking");
				pause();
				System.out.println(this + " grabbing right");
				right.take();
				System.out.println(this + " grabbing left");
				left.take();
				System.out.println("eating");
				pause();
				right.drop();
				left.drop();
			}
		} catch (InterruptedException e) {
			System.out.println(this + "" + "exiting via interrupt");
		}
	}

	@Override
	public String toString() {
		return "Philosopher " + id;
	}

	private Chopstick left;
	private Chopstick right;
	private final int id;
	private final int ponderFactor;
	private Random random = new Random(47);

	private void pause() throws InterruptedException {
		if (ponderFactor == 0) {
			return;
		}
		TimeUnit.MILLISECONDS.sleep(random.nextInt(ponderFactor * 250));
	}
}

class Chopstick {

	public synchronized void take() throws InterruptedException {
		while (taken) {
			wait();
		}
		taken = true;
	}

	public synchronized void drop() {
		taken = false;
		notifyAll();
	}

	private boolean taken = false;
}