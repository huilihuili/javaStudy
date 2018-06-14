package top.leagle.thinking.chapter21;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Restaurant {
	Meal meal;
	Chef chef = new Chef(this);
	WaitPerson waitPerson = new WaitPerson(this);
	ExecutorService executorService = Executors.newCachedThreadPool();

	public Restaurant() {
		executorService.execute(waitPerson);
		executorService.execute(chef);
	}

	public static void main(String[] args) {
		new Restaurant();
	}
}

class Chef implements Runnable {

	public Chef(Restaurant restaurant) {
		this.restaurant = restaurant;
	}

	@Override
	public void run() {
		try {
			while (!Thread.interrupted()) {
				synchronized (this) {
					while (restaurant.meal != null) {
						wait();
					}
				}

				if (++count == 10) {
					System.out.println("Out of food, closing");
					restaurant.executorService.shutdownNow();
				}

				System.out.print("Order up!");

				synchronized (restaurant.waitPerson) {
					restaurant.meal = new Meal(count);
					restaurant.waitPerson.notifyAll();
				}

				TimeUnit.MILLISECONDS.sleep(100);
			}
		} catch (InterruptedException e) {
			System.out.println("Chef interrupted");
		}
	}

	private Restaurant restaurant;
	private int count = 0;
}

class WaitPerson implements Runnable {
	public WaitPerson(Restaurant restaurant) {
		this.restaurant = restaurant;
	}

	@Override
	public void run() {
		try {
			while (!Thread.interrupted()) {
				synchronized (this) {
					while (restaurant.meal == null) {
						wait();
					}
				}

				System.out.println("Waitperson got " + restaurant.meal);

				synchronized (restaurant.chef) {
					restaurant.meal = null;
					restaurant.chef.notifyAll();
				}
			}
		} catch (InterruptedException e) {
			System.out.println("WaitPerson interrupted");
		}
	}

	private Restaurant restaurant;

}

class Meal {
	public Meal(int orderNum) {
		this.orderNum = orderNum;
	}

	@Override
	public String toString() {
		return "Meal " + orderNum;
	}

	private final int orderNum;
}
