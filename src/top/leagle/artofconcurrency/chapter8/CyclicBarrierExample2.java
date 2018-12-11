package top.leagle.artofconcurrency.chapter8;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierExample2 {
	private static CyclicBarrier cyclicBarrier = new CyclicBarrier(2, new Runnable() {
		@Override
		public void run() {
			System.out.println("3");
		}
	});

	public static void main(String[] args) throws InterruptedException, BrokenBarrierException {
		new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					cyclicBarrier.await();
				} catch (Exception e) {
					e.printStackTrace();
				}
				System.out.println("1");
			}
		}).start();

		cyclicBarrier.await();
		System.out.println("2");
	}
}
