package top.leagle.thinking.chapter21;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

public class ToastOMatic {
	public static void main(String[] args) throws InterruptedException {
		ToastQueue dryQueue = new ToastQueue(), butteredQueue = new ToastQueue(), finishedQueue = new ToastQueue();
		ExecutorService executorService = Executors.newCachedThreadPool();
		executorService.execute(new Toaster(dryQueue));
		executorService.execute(new Butterer(dryQueue, butteredQueue));
		executorService.execute(new Jammer(butteredQueue, finishedQueue));
		executorService.execute(new Eater(finishedQueue));
		TimeUnit.SECONDS.sleep(2);
		executorService.shutdownNow();
	}
}

class Eater implements Runnable {

	public Eater(ToastQueue finishedQueue) {
		this.finishedQueue = finishedQueue;
	}

	@Override
	public void run() {
		try {
			while (!Thread.interrupted()) {
				Toast toast = finishedQueue.take();
				if (toast.getId() != count++ || toast.getStatus() != Toast.Status.JAMMED) {
					System.out.println(">>>> Error: " + toast);
					System.exit(1);
				} else {
					System.out.println("Chomp! " + toast);
				}
			}
		} catch (InterruptedException e) {
			System.out.println("Eater interrupted");
		}

		System.out.println("Eater off");
	}

	private ToastQueue finishedQueue;
	private int count;

}

class Jammer implements Runnable {

	public Jammer(ToastQueue butteredQueue, ToastQueue finishedQueue) {
		this.butteredQueue = butteredQueue;
		this.finishedQueue = finishedQueue;
	}

	@Override
	public void run() {
		try {
			while (!Thread.interrupted()) {
				Toast toast = butteredQueue.take();
				toast.jam();
				System.out.println(toast);
				finishedQueue.put(toast);
			}
		} catch (InterruptedException e) {
			System.out.println("Jammer interrupted");
		}

		System.out.println("Jammer off");
	}

	private ToastQueue butteredQueue, finishedQueue;
}

class Butterer implements Runnable {

	public Butterer(ToastQueue dryQueue, ToastQueue butteredQueue) {
		this.dryQueue = dryQueue;
		this.butteredQueue = butteredQueue;
	}

	@Override
	public void run() {
		try {
			while (!Thread.interrupted()) {
				Toast toast = dryQueue.take();
				toast.butter();
				System.out.println(toast);
				butteredQueue.put(toast);
			}
		} catch (InterruptedException e) {
			System.out.println("Butterer interrupted");
		}

		System.out.println("Butterer off");
	}

	private ToastQueue dryQueue, butteredQueue;
}

class Toaster implements Runnable {

	public Toaster(ToastQueue toastQueue) {
		this.toastQueue = toastQueue;
	}

	@Override
	public void run() {
		try {
			while (!Thread.interrupted()) {
				TimeUnit.MILLISECONDS.sleep(100 + random.nextInt(500));
				Toast toast = new Toast(count++);
				System.out.println(toast);
				toastQueue.add(toast);
			}
		} catch (InterruptedException e) {
			System.out.println("Toaster interrupted");
		}

		System.out.println("Toaster off");
	}

	private ToastQueue toastQueue;
	private int count = 0;
	private Random random = new Random(47);
}

class ToastQueue extends LinkedBlockingQueue<Toast> {
	private static final long serialVersionUID = 1L;
}

class Toast {
	public enum Status {
		DRY, BUTTERED, JAMMED
	};

	public Toast(int id) {
		this.id = id;
	}

	public void butter() {
		status = Status.BUTTERED;
	}

	public void jam() {
		status = Status.JAMMED;
	}

	public Status getStatus() {
		return status;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Toast " + id + ": " + status;
	}

	private Status status = Status.DRY;
	private final int id;

}
