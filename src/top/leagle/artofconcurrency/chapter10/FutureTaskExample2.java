package top.leagle.artofconcurrency.chapter10;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;

public class FutureTaskExample2 {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		FutureTask<String> futureTask = new FutureTask<String>(new Callable<String>() {
			@Override
			public String call() throws Exception {
				TimeUnit.SECONDS.sleep(2);
				System.out.println("thread end");
				return "hello, world";
			}
		});
		futureTask.run();
		System.out.println("main end");
		System.out.println(futureTask.get());
	}
}
