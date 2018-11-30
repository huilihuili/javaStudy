package top.leagle.artofconcurrency.chapter5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;

import org.junit.Test;

public class FairAndUnfairTest {

	private static ReentrantLock2 fairLock = new ReentrantLock2(true);
	private static ReentrantLock2 unfairLock = new ReentrantLock2(false);

	@Test
	public void unfairTest() {
		testLock(unfairLock);
	}

	@Test
	public void fairTest() {
		testLock(fairLock);
	}

	private void testLock(ReentrantLock2 lock) {
		for (int i = 0; i < 5; i++) {
			Job job = new Job(lock);
			job.setName(String.valueOf(i));
			job.start();
		}
	}

	private static class Job extends Thread {
		private ReentrantLock2 lock;

		public Job(ReentrantLock2 lock) {
			this.lock = lock;
		}

		@Override
		public void run() {
			lock.lock();
			try {
				System.out.println("Lock By[" + Thread.currentThread() + "], Waiting by " + lock.getQueuedThreads());
				System.out.println("Lock By[" + Thread.currentThread() + "], Waiting by " + lock.getQueuedThreads());
			} finally {
				lock.unlock();
			}
		}

		@Override
		public String toString() {
			return super.getName();
		}
	}

	private static class ReentrantLock2 extends ReentrantLock {
		private static final long serialVersionUID = 1L;

		public ReentrantLock2(boolean fair) {
			super(fair);
		}

		public Collection<Thread> getQueuedThreads() {
			List<Thread> arrayList = new ArrayList<>(super.getQueuedThreads());
			Collections.reverse(arrayList);
			return arrayList;
		}
	}
}
