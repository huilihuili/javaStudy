package top.leagle.thinking.chapter21;

import java.io.IOException;

import org.junit.Test;

class UnresponsiveUI {
	private volatile double d = 1;

	public UnresponsiveUI() throws IOException {
		while (d > 0) {
			d = d + (Math.PI + Math.E) / d;
		}
		System.out.println("-----");
	}
}

public class Response extends Thread {
	private static volatile double d = 1;

	public Response() {
		setDaemon(true);
		start();
	}

	@Override
	public void run() {
		while (d > 0) {
			d = d + (Math.PI + Math.E) / d;
		}
	}


	@Test
	public void test1() {
		try {
			new UnresponsiveUI();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void test2() {
		new Response();
		System.out.println("-----");
		System.out.println(d);
	}
}
