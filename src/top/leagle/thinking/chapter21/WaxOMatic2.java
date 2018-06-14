package top.leagle.thinking.chapter21;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class WaxOMatic2 {

	public static void main(String[] args) throws InterruptedException {
		Car2 car2 = new Car2();
		ExecutorService executorService = Executors.newCachedThreadPool();
		executorService.execute(new WaxOn2(car2));
		executorService.execute(new WaxOff2(car2));
		TimeUnit.SECONDS.sleep(1);
		executorService.shutdownNow();
	}

}

class WaxOff2 implements Runnable {

	public WaxOff2(Car2 car2) {
		this.car2 = car2;
	}

	@Override
	public void run() {
		try {
			while (!Thread.interrupted()) {
				car2.waitingForWaxing();
				System.out.println("Wax Off!");
				TimeUnit.MICROSECONDS.sleep(200);
				car2.buffed();
			}
		} catch (InterruptedException e) {
			System.out.println("Exiting via interrupt");
		}
		System.out.println("Ending wax off task");
	}

	private Car2 car2;
}

class WaxOn2 implements Runnable {

	public WaxOn2(Car2 car2) {
		this.car2 = car2;
	}

	@Override
	public void run() {
		try {
			while (!Thread.interrupted()) {
				System.out.println("Wax On!");
				TimeUnit.MICROSECONDS.sleep(200);
				car2.waxed();
				car2.waitingForBuffing();
			}
		} catch (InterruptedException e) {
			System.out.println("Exiting via interrupt");
		}
		System.out.println("Ending wax on task");
	}

	private Car2 car2;
}

class Car2 {

	public void waxed() {
		lock.lock();
		try {
			waxOn = true;
			condition.signalAll();
			;
		} finally {
			lock.unlock();
		}
	}

	public void buffed() {
		lock.lock();
		try {
			waxOn = false;
			condition.signalAll();
		} finally {
			lock.unlock();
		}
	}

	public void waitingForWaxing() throws InterruptedException {
		lock.lock();
		try {
			while (waxOn == false) {
				condition.await();
			}
		} finally {
			lock.unlock();
		}
	}

	public void waitingForBuffing() throws InterruptedException {
		lock.lock();
		try {
			while (waxOn == true) {
				condition.await();
			}
		} finally {
			lock.unlock();
		}
	}

	private Lock lock = new ReentrantLock();
	private Condition condition = lock.newCondition();
	private boolean waxOn = false;
}