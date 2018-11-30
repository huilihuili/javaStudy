package top.leagle.artofconcurrency.chapter4;

import java.io.IOException;
import java.io.PipedReader;
import java.io.PipedWriter;
import java.util.concurrent.TimeUnit;

public class PipeExample {

	public static void main(String[] args) throws IOException {
		Sender sender = new Sender();
		Receiver receiver = new Receiver(sender);

		Thread senderThread = new Thread(sender, "SenderThrad");
		Thread receiverThread = new Thread(receiver, "ReceiverThread");
		senderThread.start();
		receiverThread.start();
	}

	static class Sender implements Runnable {
		private PipedWriter out = new PipedWriter();

		@Override
		public void run() {
			try {
				for (char c = 'A'; c <= 'C'; c++) {
					out.write(c);
					TimeUnit.SECONDS.sleep(1);
				}
			} catch (IOException e) {
				System.out.println(e + " Sender write exception");
			} catch (InterruptedException e) {
				System.out.println(e + " Sender sleep interrupted");
			}
		}

		public PipedWriter getPipedWriter() {
			return out;
		}

	}

	static class Receiver implements Runnable {
		private PipedReader in;

		public Receiver(Sender sender) throws IOException {
			in = new PipedReader(sender.getPipedWriter());
		}

		@Override
		public void run() {
			try {
				while (true) {
					System.out.println("Read " + (char) in.read());
				}
			} catch (IOException e) {
				System.out.println(e + " Receiver read exception");
			}
		}
	}
}
