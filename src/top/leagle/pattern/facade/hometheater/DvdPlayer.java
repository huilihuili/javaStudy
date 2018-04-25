package top.leagle.pattern.facade.hometheater;

public class DvdPlayer {

	public void on() {
		System.out.println("DVD player on");
	}

	public void play(String movie) {
		System.out.println("DVD player playing \"" + movie + "\"");
	}

	public void stop(String movie) {
		System.out.println("DVD player stopped \"" + movie + "\"");
	}

	public void eject() {
		System.out.println("DVD player eject");
	}

	public void off() {
		System.out.println("DVD player off");
	}
}
