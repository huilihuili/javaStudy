package top.leagle.artofconcurrency.chapter5;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.AbstractQueuedSynchronizer;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

class TwinsLockTest {

	public static void main(String[] args) throws InterruptedException {

		final Lock lock = new TwinsLock();

		class Worker extends Thread {
			@Override
			public void run() {
				while (true) {
					lock.lock();
					try {
						TimeUnit.SECONDS.sleep(1);
						System.out.println(Thread.currentThread().getName());
						TimeUnit.SECONDS.sleep(1);
					} catch (Exception e) {

					} finally {
						lock.unlock();
					}
				}
			}
		}

		for (int i = 0; i < 10; i++) {
			Worker worker = new Worker();
			worker.setDaemon(true);
			worker.start();
		}

		for (int i = 0; i < 10; i++) {
			TimeUnit.SECONDS.sleep(1);
			System.out.println();
		}

	}

}

public class TwinsLock implements Lock {

	private final Sync sync = new Sync(2);

	private static final class Sync extends AbstractQueuedSynchronizer {
		private static final long serialVersionUID = 1L;

		public Sync(int count) {
			if (count <= 0) {
				throw new IllegalArgumentException("count must large than zero.");
			}
			super.setState(count);
		}

		@Override
		public int tryAcquireShared(int reduceCount) {
			for (;;) {
				int current = super.getState();
				int newCount = current - reduceCount;
				if (newCount < 0 || compareAndSetState(current, newCount)) {
					return newCount;
				}
			}
		}

		@Override
		public boolean tryReleaseShared(int returnCount) {
			for (;;) {
				int current = super.getState();
				int newCount = current + returnCount;
				if (compareAndSetState(current, newCount)) {
					return true;
				}
			}
		}
	}

	@Override
	public void lock() {
		sync.acquireShared(1);
	}

	@Override
	public void lockInterruptibly() throws InterruptedException {
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean tryLock() {
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean tryLock(long time, TimeUnit unit) throws InterruptedException {
		throw new UnsupportedOperationException();
	}

	@Override
	public void unlock() {
		sync.releaseShared(1);
	}

	@Override
	public Condition newCondition() {
		throw new UnsupportedOperationException();
	}

}
