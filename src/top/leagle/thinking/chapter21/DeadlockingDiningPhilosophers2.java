package top.leagle.thinking.chapter21;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class DeadlockingDiningPhilosophers2 {

	public static void main(String[] args) throws InterruptedException {
		int ponder = 0;
		int size = 5;
		ExecutorService executorService = Executors.newCachedThreadPool();
		Chopstick[] sticks = new Chopstick[size];
		for (int i = 0; i < size; i++) {
			sticks[i] = new Chopstick();
		}

		for (int i = 0; i < size - 1; i++) {
			executorService.execute(new Philosopher(sticks[i], sticks[i + 1], i, ponder));
		}
		executorService.execute(new Philosopher(sticks[0], sticks[size - 1], size - 1, ponder));

		// TimeUnit.SECONDS.sleep(2);
		// executorService.shutdownNow();
	}
}
