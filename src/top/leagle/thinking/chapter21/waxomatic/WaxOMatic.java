package top.leagle.thinking.chapter21.waxomatic;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class WaxOMatic {
	public static void main(String[] args) throws InterruptedException {
		Car car = new Car();
		ExecutorService executorService = Executors.newCachedThreadPool();
		executorService.execute(new WaxOff(car));
		executorService.execute(new WaxOn(car));
		TimeUnit.SECONDS.sleep(2);
		executorService.shutdownNow();
	}
}

class WaxOff implements Runnable {

	public WaxOff(Car car) {
		this.car = car;
	}

	@Override
	public void run() {
		try {
			while (!Thread.interrupted()) {
				car.waitForWaxing();
				System.out.println("Wax Off!");
				TimeUnit.MILLISECONDS.sleep(200);
				car.buffed();
			}
		} catch (InterruptedException e) {
			System.out.println("Exiting via interrupt");
		}
		System.out.println("Ending Wax Off task");
	}

	private Car car;
}

class WaxOn implements Runnable {

	public WaxOn(Car car) {
		this.car = car;
	}

	@Override
	public void run() {
		try {
			while (!Thread.interrupted()) {
				System.out.println("Wax On!");
				TimeUnit.MILLISECONDS.sleep(200);
				car.waxed();
				car.waitForBuffering();
			}
		} catch (InterruptedException e) {
			System.out.println("Exiting via interrupt");
		}
		System.out.println("Ending Wax On task");
	}

	private Car car;
}

class Car {
	private boolean waxOn = false;

	public synchronized void waxed() {
		waxOn = true;
		notifyAll();
	}

	public synchronized void buffed() {
		waxOn = false;
		notifyAll();
	}

	public synchronized void waitForWaxing() throws InterruptedException {
		while (waxOn == false) {
			wait();
		}
	}

	public synchronized void waitForBuffering() throws InterruptedException {
		while (waxOn == true) {
			wait();
		}
	}
}